package p357yb;

import java.nio.ShortBuffer;

/* renamed from: yb.e */
/* loaded from: classes.dex */
public class C5909e implements InterfaceC5905a {
    /* renamed from: b */
    public static short m23633b(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10, int i11) {
        return shortBuffer.get(shortBuffer.position() - i11);
    }

    /* renamed from: c */
    public static float m23634c(int i10, int i11) {
        return i10 / i11;
    }

    @Override // p357yb.InterfaceC5905a
    /* renamed from: a */
    public void mo23631a(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler. Channels:" + i12);
        }
        int remaining = shortBuffer.remaining() / i12;
        int ceil = ((int) Math.ceil(remaining * (i11 / i10))) - remaining;
        float m23634c = m23634c(remaining, remaining);
        float m23634c2 = m23634c(ceil, ceil);
        int i13 = ceil;
        int i14 = remaining;
        while (i14 > 0 && i13 > 0) {
            if (m23634c >= m23634c2) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i14--;
                m23634c = m23634c(i14, remaining);
            } else {
                shortBuffer2.put(m23633b(shortBuffer2, shortBuffer, 1, i12));
                if (i12 == 2) {
                    shortBuffer2.put(m23633b(shortBuffer2, shortBuffer, 2, i12));
                }
                i13--;
                m23634c2 = m23634c(i13, ceil);
            }
        }
    }
}
