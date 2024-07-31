package p341xb;

import java.nio.ShortBuffer;

/* renamed from: xb.b */
/* loaded from: classes.dex */
public class C5748b implements InterfaceC5747a {
    @Override // p341xb.InterfaceC5747a
    /* renamed from: a */
    public void mo22869a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = shortBuffer.get() + 32768;
            int i12 = shortBuffer.get() + 32768;
            int i13 = 65535;
            int i14 = (i11 < 32768 || i12 < 32768) ? (i11 * i12) / 32768 : (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
            if (i14 != 65536) {
                i13 = i14;
            }
            shortBuffer2.put((short) (i13 - 32768));
        }
    }

    @Override // p341xb.InterfaceC5747a
    /* renamed from: b */
    public int mo22870b(int i10) {
        return i10 / 2;
    }
}
