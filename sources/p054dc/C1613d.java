package p054dc;

import java.nio.ShortBuffer;
import java.util.Random;

/* renamed from: dc.d */
/* loaded from: classes.dex */
public class C1613d implements InterfaceC1610a {

    /* renamed from: d */
    public static final Random f5952d = new Random();

    /* renamed from: b */
    public static short m6468b() {
        return (short) f5952d.nextInt(300);
    }

    /* renamed from: c */
    public static float m6469c(int i10, int i11) {
        return i10 / i11;
    }

    @Override // p054dc.InterfaceC1610a
    /* renamed from: a */
    public void mo6467a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT. Channels:" + i10);
        }
        int remaining = shortBuffer.remaining() / i10;
        int floor = (int) Math.floor((shortBuffer2.remaining() - shortBuffer.remaining()) / i10);
        float m6469c = m6469c(remaining, remaining);
        float m6469c2 = m6469c(floor, floor);
        int i11 = remaining;
        while (i11 > 0 && floor > 0) {
            if (m6469c >= m6469c2) {
                shortBuffer2.put(shortBuffer.get());
                if (i10 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i11--;
                m6469c = m6469c(i11, remaining);
            } else {
                shortBuffer2.put(m6468b());
                if (i10 == 2) {
                    shortBuffer2.put(m6468b());
                }
                floor--;
                m6469c2 = m6469c(floor, remaining);
            }
        }
    }
}
