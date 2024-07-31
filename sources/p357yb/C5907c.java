package p357yb;

import java.nio.ShortBuffer;

/* renamed from: yb.c */
/* loaded from: classes.dex */
public class C5907c implements InterfaceC5905a {
    /* renamed from: b */
    public static float m23632b(int i10, int i11) {
        return i10 / i11;
    }

    @Override // p357yb.InterfaceC5905a
    /* renamed from: a */
    public void mo23631a(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler. Channels:" + i12);
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = (int) Math.ceil(remaining * (i11 / i10));
        int i13 = remaining - ceil;
        float m23632b = m23632b(ceil, ceil);
        float m23632b2 = m23632b(i13, i13);
        int i14 = ceil;
        int i15 = i13;
        while (i14 > 0 && i15 > 0) {
            if (m23632b >= m23632b2) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i14--;
                m23632b = m23632b(i14, ceil);
            } else {
                shortBuffer.position(shortBuffer.position() + i12);
                i15--;
                m23632b2 = m23632b(i15, i13);
            }
        }
    }
}
