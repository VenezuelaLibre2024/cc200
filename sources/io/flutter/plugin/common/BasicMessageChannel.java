package io.flutter.plugin.common;

import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";
    private final MessageCodec<T> codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    /* loaded from: classes2.dex */
    public final class IncomingMessageHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MessageHandler<T> handler;

        /* renamed from: io.flutter.plugin.common.BasicMessageChannel$IncomingMessageHandler$1 */
        /* loaded from: classes2.dex */
        public class C27721 implements Reply<T> {
            public final /* synthetic */ BinaryMessenger.BinaryReply val$callback;

            public C27721(BinaryMessenger.BinaryReply binaryReply) {
                r2 = binaryReply;
            }

            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public void reply(T t10) {
                r2.reply(BasicMessageChannel.this.codec.encodeMessage(t10));
            }
        }

        private IncomingMessageHandler(MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }

        public /* synthetic */ IncomingMessageHandler(BasicMessageChannel basicMessageChannel, MessageHandler messageHandler, C27711 c27711) {
            this(messageHandler);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage(BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    public final /* synthetic */ BinaryMessenger.BinaryReply val$callback;

                    public C27721(BinaryMessenger.BinaryReply binaryReply2) {
                        r2 = binaryReply2;
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t10) {
                        r2.reply(BasicMessageChannel.this.codec.encodeMessage(t10));
                    }
                });
            } catch (RuntimeException e10) {
                Log.m11042e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message", e10);
                binaryReply2.reply(null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class IncomingReplyHandler implements BinaryMessenger.BinaryReply {
        private final Reply<T> callback;

        private IncomingReplyHandler(Reply<T> reply) {
            this.callback = reply;
        }

        public /* synthetic */ IncomingReplyHandler(BasicMessageChannel basicMessageChannel, Reply reply, C27711 c27711) {
            this(reply);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(ByteBuffer byteBuffer) {
            try {
                this.callback.reply(BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (RuntimeException e10) {
                Log.m11042e(BasicMessageChannel.TAG + BasicMessageChannel.this.name, "Failed to handle message reply", e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface MessageHandler<T> {
        void onMessage(T t10, Reply<T> reply);
    }

    /* loaded from: classes2.dex */
    public interface Reply<T> {
        void reply(T t10);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String str, MessageCodec<T> messageCodec, BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    private static ByteBuffer packetFromEncodedMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(remaining);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String str, int i10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("resize", Arrays.asList(str, Integer.valueOf(i10))))));
    }

    public static void setWarnsOnChannelOverflow(BinaryMessenger binaryMessenger, String str, boolean z10) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(StandardMethodCodec.INSTANCE.encodeMethodCall(new MethodCall("overflow", Arrays.asList(str, Boolean.valueOf(!z10))))));
    }

    public void resizeChannelBuffer(int i10) {
        resizeChannelBuffer(this.messenger, this.name, i10);
    }

    public void send(T t10) {
        send(t10, null);
    }

    public void send(T t10, Reply<T> reply) {
        this.messenger.send(this.name, this.codec.encodeMessage(t10), reply != null ? new IncomingReplyHandler(reply) : null);
    }

    public void setMessageHandler(MessageHandler<T> messageHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new IncomingMessageHandler(messageHandler) : null);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z10) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z10);
    }
}
