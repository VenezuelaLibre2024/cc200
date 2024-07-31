package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class KeyboardChannel {
    public final MethodChannel channel;
    private KeyboardMethodHandler keyboardMethodHandler;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyboardChannel$1 */
    /* loaded from: classes2.dex */
    public class C27561 implements MethodChannel.MethodCallHandler {
        public Map<Long, Long> pressedState = new HashMap();

        public C27561() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            if (KeyboardChannel.this.keyboardMethodHandler != null) {
                String str = methodCall.method;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    result.notImplemented();
                    return;
                } else {
                    try {
                        this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                    } catch (IllegalStateException e10) {
                        result.error(ImagePickerCache.MAP_KEY_ERROR, e10.getMessage(), null);
                    }
                }
            }
            result.success(this.pressedState);
        }
    }

    /* loaded from: classes2.dex */
    public interface KeyboardMethodHandler {
        Map<Long, Long> getKeyboardState();
    }

    public KeyboardChannel(BinaryMessenger binaryMessenger) {
        C27561 c27561 = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
            public Map<Long, Long> pressedState = new HashMap();

            public C27561() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (KeyboardChannel.this.keyboardMethodHandler != null) {
                    String str = methodCall.method;
                    str.hashCode();
                    if (!str.equals("getKeyboardState")) {
                        result.notImplemented();
                        return;
                    } else {
                        try {
                            this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                        } catch (IllegalStateException e10) {
                            result.error(ImagePickerCache.MAP_KEY_ERROR, e10.getMessage(), null);
                        }
                    }
                }
                result.success(this.pressedState);
            }
        };
        this.parsingMethodHandler = c27561;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter/keyboard", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(c27561);
    }

    public void setKeyboardMethodHandler(KeyboardMethodHandler keyboardMethodHandler) {
        this.keyboardMethodHandler = keyboardMethodHandler;
    }
}
