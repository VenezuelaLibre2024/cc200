package p180m4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p152k4.AbstractC3354g;
import p152k4.C3348a;
import p152k4.C3351d;
import p222p5.C4014a;
import p222p5.C4015a0;

/* renamed from: m4.b */
/* loaded from: classes.dex */
public final class C3524b extends AbstractC3354g {
    @Override // p152k4.AbstractC3354g
    /* renamed from: b */
    public C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer) {
        return new C3348a(m13080c(new C4015a0(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C3523a m13080c(C4015a0 c4015a0) {
        return new C3523a((String) C4014a.m15199e(c4015a0.m15204A()), (String) C4014a.m15199e(c4015a0.m15204A()), c4015a0.m15251z(), c4015a0.m15251z(), Arrays.copyOfRange(c4015a0.m15230e(), c4015a0.m15231f(), c4015a0.m15232g()));
    }
}
