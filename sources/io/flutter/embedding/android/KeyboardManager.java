package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.KeyboardChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;
import java.util.Map;
import p079f6.C1841a;

/* loaded from: classes2.dex */
public class KeyboardManager implements InputConnectionAdaptor.KeyboardDelegate, KeyboardChannel.KeyboardMethodHandler {
    private static final String TAG = "KeyboardManager";
    private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();
    public final Responder[] responders;
    private final ViewDelegate viewDelegate;

    /* loaded from: classes2.dex */
    public static class CharacterCombiner {
        private int combiningCharacter = 0;

        public Character applyCombiningCharacterToBaseCharacter(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int i11 = i10 & C1841a.e.API_PRIORITY_OTHER;
                int i12 = this.combiningCharacter;
                if (i12 != 0) {
                    i11 = KeyCharacterMap.getDeadChar(i12, i11);
                }
                this.combiningCharacter = i11;
            } else {
                int i13 = this.combiningCharacter;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c10 = (char) deadChar;
                    }
                    this.combiningCharacter = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    /* loaded from: classes2.dex */
    public class PerEventCallbackBuilder {
        public boolean isEventHandled = false;
        public final KeyEvent keyEvent;
        public int unrepliedCount;

        /* loaded from: classes2.dex */
        public class Callback implements Responder.OnKeyEventHandledCallback {
            public boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            @Override // io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback
            public void onKeyEventHandled(boolean z10) {
                if (this.isCalled) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.isCalled = true;
                PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
                int i10 = perEventCallbackBuilder.unrepliedCount - 1;
                perEventCallbackBuilder.unrepliedCount = i10;
                boolean z11 = z10 | perEventCallbackBuilder.isEventHandled;
                perEventCallbackBuilder.isEventHandled = z11;
                if (i10 != 0 || z11) {
                    return;
                }
                KeyboardManager.this.onUnhandled(perEventCallbackBuilder.keyEvent);
            }
        }

        public PerEventCallbackBuilder(KeyEvent keyEvent) {
            this.unrepliedCount = KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent;
        }

        public Responder.OnKeyEventHandledCallback buildCallback() {
            return new Callback();
        }
    }

    /* loaded from: classes2.dex */
    public interface Responder {

        /* loaded from: classes2.dex */
        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(boolean z10);
        }

        void handleEvent(KeyEvent keyEvent, OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    /* loaded from: classes2.dex */
    public interface ViewDelegate {
        BinaryMessenger getBinaryMessenger();

        boolean onTextInputKeyEvent(KeyEvent keyEvent);

        void redispatch(KeyEvent keyEvent);
    }

    public KeyboardManager(ViewDelegate viewDelegate) {
        this.viewDelegate = viewDelegate;
        this.responders = new Responder[]{new KeyEmbedderResponder(viewDelegate.getBinaryMessenger()), new KeyChannelResponder(new KeyEventChannel(viewDelegate.getBinaryMessenger()))};
        new KeyboardChannel(viewDelegate.getBinaryMessenger()).setKeyboardMethodHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnhandled(KeyEvent keyEvent) {
        ViewDelegate viewDelegate = this.viewDelegate;
        if (viewDelegate == null || viewDelegate.onTextInputKeyEvent(keyEvent)) {
            return;
        }
        this.redispatchedEvents.add(keyEvent);
        this.viewDelegate.redispatch(keyEvent);
        if (this.redispatchedEvents.remove(keyEvent)) {
            Log.m11047w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void destroy() {
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            Log.m11047w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyboardChannel.KeyboardMethodHandler
    public Map<Long, Long> getKeyboardState() {
        return ((KeyEmbedderResponder) this.responders[0]).getPressedState();
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public boolean handleEvent(KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length <= 0) {
            onUnhandled(keyEvent);
            return true;
        }
        PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
        for (Responder responder : this.responders) {
            responder.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
        }
        return true;
    }
}
