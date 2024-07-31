package p136j3;

import p280t8.InterfaceC4727d;

/* renamed from: j3.f */
/* loaded from: classes.dex */
public final class C3221f {

    /* renamed from: c */
    public static final C3221f f11166c = new a().m11482a();

    /* renamed from: a */
    public final long f11167a;

    /* renamed from: b */
    public final long f11168b;

    /* renamed from: j3.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f11169a = 0;

        /* renamed from: b */
        public long f11170b = 0;

        /* renamed from: a */
        public C3221f m11482a() {
            return new C3221f(this.f11169a, this.f11170b);
        }

        /* renamed from: b */
        public a m11483b(long j10) {
            this.f11170b = j10;
            return this;
        }

        /* renamed from: c */
        public a m11484c(long j10) {
            this.f11169a = j10;
            return this;
        }
    }

    public C3221f(long j10, long j11) {
        this.f11167a = j10;
        this.f11168b = j11;
    }

    /* renamed from: c */
    public static a m11479c() {
        return new a();
    }

    @InterfaceC4727d(tag = 2)
    /* renamed from: a */
    public long m11480a() {
        return this.f11168b;
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: b */
    public long m11481b() {
        return this.f11167a;
    }
}
