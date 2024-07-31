package p152k4;

import java.nio.ByteBuffer;
import p222p5.C4014a;

/* renamed from: k4.g */
/* loaded from: classes.dex */
public abstract class AbstractC3354g implements InterfaceC3349b {
    @Override // p152k4.InterfaceC3349b
    /* renamed from: a */
    public final C3348a mo12420a(C3351d c3351d) {
        ByteBuffer byteBuffer = (ByteBuffer) C4014a.m15199e(c3351d.f19284j);
        C4014a.m15195a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (c3351d.m20747p()) {
            return null;
        }
        return mo12429b(c3351d, byteBuffer);
    }

    /* renamed from: b */
    public abstract C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer);
}
