package p357yb;

import java.nio.ShortBuffer;

/* renamed from: yb.d */
/* loaded from: classes.dex */
public class C5908d implements InterfaceC5905a {
    @Override // p357yb.InterfaceC5905a
    /* renamed from: a */
    public void mo23631a(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }
}
