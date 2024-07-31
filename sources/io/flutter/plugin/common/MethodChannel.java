package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class MethodChannel {
    private static final String TAG = "MethodChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* loaded from: classes2.dex */
    public final class IncomingMethodCallHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MethodCallHandler handler;

        /* renamed from: io.flutter.plugin.common.MethodChannel$IncomingMethodCallHandler$1 */
        /* loaded from: classes2.dex */
        public class C27741 implements Result {
            public final /* synthetic */ BinaryMessenger.BinaryReply val$reply;

            public C27741(BinaryMessenger.BinaryReply binaryReply) {
                r2 = binaryReply;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                r2.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                r2.reply(null);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                r2.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
            }
        }

        public IncomingMethodCallHandler(MethodCallHandler methodCallHandler) {
            this.handler = methodCallHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMethodCall(MethodChannel.this.codec.decodeMethodCall(byteBuffer), new Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                    public final /* synthetic */ BinaryMessenger.BinaryReply val$reply;

                    public C27741(BinaryMessenger.BinaryReply binaryReply2) {
                        r2 = binaryReply2;
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(String str, String str2, Object obj) {
                        r2.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        r2.reply(null);
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(Object obj) {
                        r2.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                    }
                });
            } catch (RuntimeException e10) {
                Log.m11042e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call", e10);
                binaryReply2.reply(MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace(ImagePickerCache.MAP_KEY_ERROR, e10.getMessage(), null, Log.getStackTraceString(e10)));
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class IncomingResultHandler implements BinaryMessenger.BinaryReply {
        private final Result callback;

        public IncomingResultHandler(Result result) {
            this.callback = result;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.callback.notImplemented();
                } else {
                    try {
                        this.callback.success(MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                    } catch (FlutterException e10) {
                        this.callback.error(e10.code, e10.getMessage(), e10.details);
                    }
                }
            } catch (RuntimeException e11) {
                Log.m11042e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call result", e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface MethodCallHandler {
        void onMethodCall(MethodCall methodCall, Result result);
    }

    /* loaded from: classes2.dex */
    public interface Result {
        void error(String str, String str2, Object obj);

        void notImplemented();

        void success(Object obj);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String str, MethodCodec methodCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }

    public void invokeMethod(String str, Object obj) {
        invokeMethod(str, obj, null);
    }

    public void invokeMethod(String str, Object obj, Result result) {
        this.messenger.send(this.name, this.codec.encodeMethodCall(new MethodCall(str, obj)), result == null ? null : new IncomingResultHandler(result));
    }

    public void resizeChannelBuffer(int i10) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i10);
    }

    public void setMethodCallHandler(MethodCallHandler methodCallHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z10) {
        BasicMessageChannel.setWarnsOnChannelOverflow(this.messenger, this.name, z10);
    }
}
