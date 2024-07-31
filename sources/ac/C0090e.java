package ac;

import p311vb.EnumC5160d;
import p325wb.C5472e;

/* renamed from: ac.e */
/* loaded from: classes.dex */
public class C0090e extends C0088c {

    /* renamed from: e */
    public static final C5472e f321e = new C5472e(C0090e.class.getSimpleName());

    /* renamed from: b */
    public long f322b;

    /* renamed from: c */
    public long f323c;

    /* renamed from: d */
    public boolean f324d;

    public C0090e(InterfaceC0087b interfaceC0087b, long j10, long j11) {
        super(interfaceC0087b);
        this.f324d = false;
        if (j10 < 0 || j11 < 0) {
            throw new IllegalArgumentException("Trim values cannot be negative.");
        }
        long mo379d = interfaceC0087b.mo379d();
        if (j10 + j11 >= mo379d) {
            throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
        }
        this.f322b = j10;
        this.f323c = (mo379d - j10) - j11;
    }

    @Override // ac.C0088c, ac.InterfaceC0087b
    /* renamed from: b */
    public long mo378b(long j10) {
        return super.mo378b(this.f322b + j10) - this.f322b;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: d */
    public long mo379d() {
        return this.f323c;
    }

    @Override // ac.C0088c, ac.InterfaceC0087b
    /* renamed from: h */
    public boolean mo383h() {
        return super.mo383h() || mo384i() >= mo379d();
    }

    @Override // ac.C0088c, ac.InterfaceC0087b
    /* renamed from: k */
    public void mo386k() {
        super.mo386k();
        this.f324d = false;
    }

    @Override // ac.C0088c, ac.InterfaceC0087b
    /* renamed from: l */
    public boolean mo387l(EnumC5160d enumC5160d) {
        if (!this.f324d && this.f322b > 0) {
            this.f322b = m389a().mo378b(this.f322b);
            this.f324d = true;
        }
        return super.mo387l(enumC5160d);
    }
}
