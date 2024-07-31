package p318w4;

import p206o5.C3915l0;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p264s3.C4463m1;
import p318w4.InterfaceC5267g;
import p333x3.C5564e;

/* renamed from: w4.k */
/* loaded from: classes.dex */
public class C5271k extends AbstractC5261a {

    /* renamed from: o */
    public final int f20005o;

    /* renamed from: p */
    public final long f20006p;

    /* renamed from: q */
    public final InterfaceC5267g f20007q;

    /* renamed from: r */
    public long f20008r;

    /* renamed from: s */
    public volatile boolean f20009s;

    /* renamed from: t */
    public boolean f20010t;

    public C5271k(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, InterfaceC5267g interfaceC5267g) {
        super(interfaceC3910j, c3918n, c4463m1, i10, obj, j10, j11, j12, j13, j14);
        this.f20005o = i11;
        this.f20006p = j15;
        this.f20007q = interfaceC5267g;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public final void mo14817b() {
        if (this.f20008r == 0) {
            C5263c m21301j = m21301j();
            m21301j.m21308b(this.f20006p);
            InterfaceC5267g interfaceC5267g = this.f20007q;
            InterfaceC5267g.b m21354l = m21354l(m21301j);
            long j10 = this.f19938k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f20006p;
            long j12 = this.f19939l;
            interfaceC5267g.mo21314b(m21354l, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f20006p);
        }
        try {
            C3918n m14856e = this.f19967b.m14856e(this.f20008r);
            C3915l0 c3915l0 = this.f19974i;
            C5564e c5564e = new C5564e(c3915l0, m14856e.f14077g, c3915l0.mo14770k(m14856e));
            do {
                try {
                    if (this.f20009s) {
                        break;
                    }
                } finally {
                    this.f20008r = c5564e.getPosition() - this.f19967b.f14077g;
                }
            } while (this.f20007q.mo21313a(c5564e));
            C3916m.m14847a(this.f19974i);
            this.f20010t = !this.f20009s;
        } catch (Throwable th) {
            C3916m.m14847a(this.f19974i);
            throw th;
        }
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public final void mo14818c() {
        this.f20009s = true;
    }

    @Override // p318w4.AbstractC5274n
    /* renamed from: g */
    public long mo21352g() {
        return this.f20017j + this.f20005o;
    }

    @Override // p318w4.AbstractC5274n
    /* renamed from: h */
    public boolean mo21353h() {
        return this.f20010t;
    }

    /* renamed from: l */
    public InterfaceC5267g.b m21354l(C5263c c5263c) {
        return c5263c;
    }
}
