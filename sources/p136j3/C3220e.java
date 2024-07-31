package p136j3;

import p280t8.InterfaceC4727d;

/* renamed from: j3.e */
/* loaded from: classes.dex */
public final class C3220e {

    /* renamed from: c */
    public static final C3220e f11161c = new a().m11476a();

    /* renamed from: a */
    public final long f11162a;

    /* renamed from: b */
    public final long f11163b;

    /* renamed from: j3.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f11164a = 0;

        /* renamed from: b */
        public long f11165b = 0;

        /* renamed from: a */
        public C3220e m11476a() {
            return new C3220e(this.f11164a, this.f11165b);
        }

        /* renamed from: b */
        public a m11477b(long j10) {
            this.f11164a = j10;
            return this;
        }

        /* renamed from: c */
        public a m11478c(long j10) {
            this.f11165b = j10;
            return this;
        }
    }

    public C3220e(long j10, long j11) {
        this.f11162a = j10;
        this.f11163b = j11;
    }

    /* renamed from: c */
    public static a m11473c() {
        return new a();
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: a */
    public long m11474a() {
        return this.f11162a;
    }

    @InterfaceC4727d(tag = 2)
    /* renamed from: b */
    public long m11475b() {
        return this.f11163b;
    }
}
