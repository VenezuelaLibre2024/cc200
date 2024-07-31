package p054dc;

import java.nio.ShortBuffer;

/* renamed from: dc.b */
/* loaded from: classes.dex */
public class C1611b implements InterfaceC1610a {
    @Override // p054dc.InterfaceC1610a
    /* renamed from: a */
    public void mo6467a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
        }
        int remaining = shortBuffer.remaining() - shortBuffer2.remaining();
        shortBuffer.limit(shortBuffer.limit() - remaining);
        shortBuffer2.put(shortBuffer);
        shortBuffer.limit(shortBuffer.limit() + remaining);
        shortBuffer.position(shortBuffer.limit());
    }
}
