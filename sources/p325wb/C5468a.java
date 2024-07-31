package p325wb;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: wb.a */
/* loaded from: classes.dex */
public class C5468a {

    /* renamed from: a */
    public static final byte[] f20357a = {0, 0, 1};

    /* renamed from: b */
    public static final byte[] f20358b = {0, 0, 0, 1};

    /* renamed from: a */
    public static ByteBuffer m21673a(MediaFormat mediaFormat) {
        ByteBuffer asReadOnlyBuffer = mediaFormat.getByteBuffer("csd-0").asReadOnlyBuffer();
        ByteBuffer order = ByteBuffer.allocate(asReadOnlyBuffer.limit()).order(asReadOnlyBuffer.order());
        order.put(asReadOnlyBuffer);
        order.flip();
        m21674b(order);
        byte b10 = order.get();
        if (b10 == 103 || b10 == 39 || b10 == 71) {
            return order.slice();
        }
        throw new IllegalStateException("Got non SPS NAL data.");
    }

    /* renamed from: b */
    public static void m21674b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        if (Arrays.equals(bArr, f20357a)) {
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 4);
        copyOf[3] = byteBuffer.get();
        if (!Arrays.equals(copyOf, f20358b)) {
            throw new IllegalStateException("AVC NAL start code not found in csd.");
        }
    }
}
