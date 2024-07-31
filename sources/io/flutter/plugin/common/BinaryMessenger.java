package io.flutter.plugin.common;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface BinaryMessenger {

    /* loaded from: classes2.dex */
    public interface BinaryMessageHandler {
        void onMessage(ByteBuffer byteBuffer, BinaryReply binaryReply);
    }

    /* loaded from: classes2.dex */
    public interface BinaryReply {
        void reply(ByteBuffer byteBuffer);
    }

    /* loaded from: classes2.dex */
    public interface TaskQueue {
    }

    /* loaded from: classes2.dex */
    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public TaskQueueOptions setIsSerial(boolean z10) {
            this.isSerial = z10;
            return this;
        }
    }

    default void disableBufferingIncomingMessages() {
        throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    default void enableBufferingIncomingMessages() {
        throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    default TaskQueue makeBackgroundTaskQueue() {
        return makeBackgroundTaskQueue(new TaskQueueOptions());
    }

    default TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }

    void send(String str, ByteBuffer byteBuffer);

    void send(String str, ByteBuffer byteBuffer, BinaryReply binaryReply);

    void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler);

    default void setMessageHandler(String str, BinaryMessageHandler binaryMessageHandler, TaskQueue taskQueue) {
        if (taskQueue != null) {
            throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
        }
        setMessageHandler(str, binaryMessageHandler);
    }
}
