package p078f5;

import java.util.List;
import p047d5.AbstractC1552g;
import p047d5.InterfaceC1553h;
import p222p5.C4015a0;

/* renamed from: f5.a */
/* loaded from: classes.dex */
public final class C1838a extends AbstractC1552g {

    /* renamed from: o */
    public final C1839b f6970o;

    public C1838a(List<byte[]> list) {
        super("DvbDecoder");
        C4015a0 c4015a0 = new C4015a0(list.get(0));
        this.f6970o = new C1839b(c4015a0.m15216M(), c4015a0.m15216M());
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f6970o.m7575r();
        }
        return new C1840c(this.f6970o.m7574b(bArr, i10));
    }
}
