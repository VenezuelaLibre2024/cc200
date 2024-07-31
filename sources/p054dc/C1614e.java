package p054dc;

import java.nio.ShortBuffer;

/* renamed from: dc.e */
/* loaded from: classes.dex */
public class C1614e implements InterfaceC1610a {
    @Override // p054dc.InterfaceC1610a
    /* renamed from: a */
    public void mo6467a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() > shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
        }
        shortBuffer2.put(shortBuffer);
    }
}
