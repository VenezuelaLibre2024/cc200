package p129ia;

/* renamed from: ia.g */
/* loaded from: classes.dex */
public final class C2675g extends AbstractC2676h {

    /* renamed from: c */
    public final AbstractC2676h f10454c;

    public C2675g(AbstractC2676h abstractC2676h) {
        super(abstractC2676h.m10891d(), abstractC2676h.m10890a());
        this.f10454c = abstractC2676h;
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: b */
    public byte[] mo10885b() {
        byte[] mo10885b = this.f10454c.mo10885b();
        int m10891d = m10891d() * m10890a();
        byte[] bArr = new byte[m10891d];
        for (int i10 = 0; i10 < m10891d; i10++) {
            bArr[i10] = (byte) (255 - (mo10885b[i10] & 255));
        }
        return bArr;
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: c */
    public byte[] mo10886c(int i10, byte[] bArr) {
        byte[] mo10886c = this.f10454c.mo10886c(i10, bArr);
        int m10891d = m10891d();
        for (int i11 = 0; i11 < m10891d; i11++) {
            mo10886c[i11] = (byte) (255 - (mo10886c[i11] & 255));
        }
        return mo10886c;
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: e */
    public AbstractC2676h mo10887e() {
        return this.f10454c;
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: f */
    public boolean mo10888f() {
        return this.f10454c.mo10888f();
    }

    @Override // p129ia.AbstractC2676h
    /* renamed from: g */
    public AbstractC2676h mo10889g() {
        return new C2675g(this.f10454c.mo10889g());
    }
}
