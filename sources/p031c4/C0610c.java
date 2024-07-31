package p031c4;

import p222p5.C4014a;
import p333x3.C5581u;
import p333x3.InterfaceC5572l;

/* renamed from: c4.c */
/* loaded from: classes.dex */
public final class C0610c extends C5581u {

    /* renamed from: b */
    public final long f2668b;

    public C0610c(InterfaceC5572l interfaceC5572l, long j10) {
        super(interfaceC5572l);
        C4014a.m15195a(interfaceC5572l.getPosition() >= j10);
        this.f2668b = j10;
    }

    @Override // p333x3.C5581u, p333x3.InterfaceC5572l
    /* renamed from: b */
    public long mo3029b() {
        return super.mo3029b() - this.f2668b;
    }

    @Override // p333x3.C5581u, p333x3.InterfaceC5572l
    /* renamed from: f */
    public long mo3030f() {
        return super.mo3030f() - this.f2668b;
    }

    @Override // p333x3.C5581u, p333x3.InterfaceC5572l
    public long getPosition() {
        return super.getPosition() - this.f2668b;
    }
}
