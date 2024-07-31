package p222p5;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p236q5.C4170c;

/* renamed from: p5.u */
/* loaded from: classes.dex */
public final class C4049u {
    /* renamed from: a */
    public static void m15539a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m15540b(MediaFormat mediaFormat, C4170c c4170c) {
        if (c4170c != null) {
            m15542d(mediaFormat, "color-transfer", c4170c.f14992j);
            m15542d(mediaFormat, "color-standard", c4170c.f14990h);
            m15542d(mediaFormat, "color-range", c4170c.f14991i);
            m15539a(mediaFormat, "hdr-static-info", c4170c.f14993k);
        }
    }

    /* renamed from: c */
    public static void m15541c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    /* renamed from: d */
    public static void m15542d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* renamed from: e */
    public static void m15543e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
