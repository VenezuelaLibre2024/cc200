package p047d5;

import java.util.List;
import p222p5.C4014a;
import p304v3.AbstractC5111h;

/* renamed from: d5.m */
/* loaded from: classes.dex */
public abstract class AbstractC1558m extends AbstractC5111h implements InterfaceC1553h {

    /* renamed from: k */
    public InterfaceC1553h f5834k;

    /* renamed from: l */
    public long f5835l;

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        return ((InterfaceC1553h) C4014a.m15199e(this.f5834k)).mo6350b(j10 - this.f5835l);
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        return ((InterfaceC1553h) C4014a.m15199e(this.f5834k)).mo6351c(i10) + this.f5835l;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        return ((InterfaceC1553h) C4014a.m15199e(this.f5834k)).mo6352f(j10 - this.f5835l);
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return ((InterfaceC1553h) C4014a.m15199e(this.f5834k)).mo6353h();
    }

    @Override // p304v3.AbstractC5104a
    /* renamed from: l */
    public void mo6366l() {
        super.mo6366l();
        this.f5834k = null;
    }

    /* renamed from: w */
    public void m6367w(long j10, InterfaceC1553h interfaceC1553h, long j11) {
        this.f19292i = j10;
        this.f5834k = interfaceC1553h;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f5835l = j10;
    }
}
