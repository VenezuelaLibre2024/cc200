package io.flutter.plugin.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class StringCodec implements MessageCodec<String> {
    private static final Charset UTF8 = Charset.forName("UTF8");
    public static final StringCodec INSTANCE = new StringCodec();

    private StringCodec() {
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public String decodeMessage(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i10;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i10 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i10 = 0;
        }
        return new String(bArr, i10, remaining, UTF8);
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(UTF8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
