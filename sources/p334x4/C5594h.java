package p334x4;

import p333x3.C5560c;
import p350y4.C5808i;

/* renamed from: x4.h */
/* loaded from: classes.dex */
public final class C5594h implements InterfaceC5592f {

    /* renamed from: a */
    public final C5560c f20974a;

    /* renamed from: b */
    public final long f20975b;

    public C5594h(C5560c c5560c, long j10) {
        this.f20974a = c5560c;
        this.f20975b = j10;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: a */
    public long mo22514a(long j10) {
        return this.f20974a.f20861e[(int) j10] - this.f20975b;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: b */
    public long mo22515b(long j10, long j11) {
        return this.f20974a.f20860d[(int) j10];
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: c */
    public long mo22516c(long j10, long j11) {
        return 0L;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: d */
    public long mo22517d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: e */
    public C5808i mo22518e(long j10) {
        return new C5808i(null, this.f20974a.f20859c[(int) j10], r0.f20858b[r8]);
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: f */
    public long mo22519f(long j10, long j11) {
        return this.f20974a.m22409b(j10 + this.f20975b);
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: g */
    public boolean mo22520g() {
        return true;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: h */
    public long mo22521h() {
        return 0L;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: i */
    public long mo22522i(long j10) {
        return this.f20974a.f20857a;
    }

    @Override // p334x4.InterfaceC5592f
    /* renamed from: j */
    public long mo22523j(long j10, long j11) {
        return this.f20974a.f20857a;
    }
}
