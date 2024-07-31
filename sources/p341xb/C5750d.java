package p341xb;

import java.nio.ShortBuffer;

/* renamed from: xb.d */
/* loaded from: classes.dex */
public class C5750d implements InterfaceC5747a {
    @Override // p341xb.InterfaceC5747a
    /* renamed from: a */
    public void mo22869a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i10 = 0; i10 < min; i10++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override // p341xb.InterfaceC5747a
    /* renamed from: b */
    public int mo22870b(int i10) {
        return i10 * 2;
    }
}
