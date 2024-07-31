package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* loaded from: classes2.dex */
public class KeyChannelResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyChannelResponder";
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
    private final KeyEventChannel keyEventChannel;

    public KeyChannelResponder(KeyEventChannel keyEventChannel) {
        this.keyEventChannel = keyEventChannel;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.keyEventChannel.sendFlutterKeyEvent(new KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar())), action != 0, new KeyEventChannel.EventResponseHandler() { // from class: io.flutter.embedding.android.b
                public /* synthetic */ C2728b() {
                }

                @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
                public final void onFrameworkResponse(boolean z10) {
                    KeyboardManager.Responder.OnKeyEventHandledCallback.this.onKeyEventHandled(z10);
                }
            });
        } else {
            onKeyEventHandledCallback.onKeyEventHandled(false);
        }
    }
}
