package p111h9;

import p280t8.InterfaceC4726c;
import p280t8.InterfaceC4727d;

/* renamed from: h9.a */
/* loaded from: classes.dex */
public final class C2451a {

    /* renamed from: p */
    public static final C2451a f9793p = new a().m9792a();

    /* renamed from: a */
    public final long f9794a;

    /* renamed from: b */
    public final String f9795b;

    /* renamed from: c */
    public final String f9796c;

    /* renamed from: d */
    public final c f9797d;

    /* renamed from: e */
    public final d f9798e;

    /* renamed from: f */
    public final String f9799f;

    /* renamed from: g */
    public final String f9800g;

    /* renamed from: h */
    public final int f9801h;

    /* renamed from: i */
    public final int f9802i;

    /* renamed from: j */
    public final String f9803j;

    /* renamed from: k */
    public final long f9804k;

    /* renamed from: l */
    public final b f9805l;

    /* renamed from: m */
    public final String f9806m;

    /* renamed from: n */
    public final long f9807n;

    /* renamed from: o */
    public final String f9808o;

    /* renamed from: h9.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f9809a = 0;

        /* renamed from: b */
        public String f9810b = "";

        /* renamed from: c */
        public String f9811c = "";

        /* renamed from: d */
        public c f9812d = c.UNKNOWN;

        /* renamed from: e */
        public d f9813e = d.UNKNOWN_OS;

        /* renamed from: f */
        public String f9814f = "";

        /* renamed from: g */
        public String f9815g = "";

        /* renamed from: h */
        public int f9816h = 0;

        /* renamed from: i */
        public int f9817i = 0;

        /* renamed from: j */
        public String f9818j = "";

        /* renamed from: k */
        public long f9819k = 0;

        /* renamed from: l */
        public b f9820l = b.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f9821m = "";

        /* renamed from: n */
        public long f9822n = 0;

        /* renamed from: o */
        public String f9823o = "";

        /* renamed from: a */
        public C2451a m9792a() {
            return new C2451a(this.f9809a, this.f9810b, this.f9811c, this.f9812d, this.f9813e, this.f9814f, this.f9815g, this.f9816h, this.f9817i, this.f9818j, this.f9819k, this.f9820l, this.f9821m, this.f9822n, this.f9823o);
        }

        /* renamed from: b */
        public a m9793b(String str) {
            this.f9821m = str;
            return this;
        }

        /* renamed from: c */
        public a m9794c(String str) {
            this.f9815g = str;
            return this;
        }

        /* renamed from: d */
        public a m9795d(String str) {
            this.f9823o = str;
            return this;
        }

        /* renamed from: e */
        public a m9796e(b bVar) {
            this.f9820l = bVar;
            return this;
        }

        /* renamed from: f */
        public a m9797f(String str) {
            this.f9811c = str;
            return this;
        }

        /* renamed from: g */
        public a m9798g(String str) {
            this.f9810b = str;
            return this;
        }

        /* renamed from: h */
        public a m9799h(c cVar) {
            this.f9812d = cVar;
            return this;
        }

        /* renamed from: i */
        public a m9800i(String str) {
            this.f9814f = str;
            return this;
        }

        /* renamed from: j */
        public a m9801j(long j10) {
            this.f9809a = j10;
            return this;
        }

        /* renamed from: k */
        public a m9802k(d dVar) {
            this.f9813e = dVar;
            return this;
        }

        /* renamed from: l */
        public a m9803l(String str) {
            this.f9818j = str;
            return this;
        }

        /* renamed from: m */
        public a m9804m(int i10) {
            this.f9817i = i10;
            return this;
        }
    }

    /* renamed from: h9.a$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC4726c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: h */
        public final int f9828h;

        b(int i10) {
            this.f9828h = i10;
        }

        @Override // p280t8.InterfaceC4726c
        /* renamed from: a */
        public int mo9805a() {
            return this.f9828h;
        }
    }

    /* renamed from: h9.a$c */
    /* loaded from: classes.dex */
    public enum c implements InterfaceC4726c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: h */
        public final int f9834h;

        c(int i10) {
            this.f9834h = i10;
        }

        @Override // p280t8.InterfaceC4726c
        /* renamed from: a */
        public int mo9805a() {
            return this.f9834h;
        }
    }

    /* renamed from: h9.a$d */
    /* loaded from: classes.dex */
    public enum d implements InterfaceC4726c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: h */
        public final int f9840h;

        d(int i10) {
            this.f9840h = i10;
        }

        @Override // p280t8.InterfaceC4726c
        /* renamed from: a */
        public int mo9805a() {
            return this.f9840h;
        }
    }

    public C2451a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f9794a = j10;
        this.f9795b = str;
        this.f9796c = str2;
        this.f9797d = cVar;
        this.f9798e = dVar;
        this.f9799f = str3;
        this.f9800g = str4;
        this.f9801h = i10;
        this.f9802i = i11;
        this.f9803j = str5;
        this.f9804k = j11;
        this.f9805l = bVar;
        this.f9806m = str6;
        this.f9807n = j12;
        this.f9808o = str7;
    }

    /* renamed from: p */
    public static a m9776p() {
        return new a();
    }

    @InterfaceC4727d(tag = 13)
    /* renamed from: a */
    public String m9777a() {
        return this.f9806m;
    }

    @InterfaceC4727d(tag = 11)
    /* renamed from: b */
    public long m9778b() {
        return this.f9804k;
    }

    @InterfaceC4727d(tag = 14)
    /* renamed from: c */
    public long m9779c() {
        return this.f9807n;
    }

    @InterfaceC4727d(tag = 7)
    /* renamed from: d */
    public String m9780d() {
        return this.f9800g;
    }

    @InterfaceC4727d(tag = 15)
    /* renamed from: e */
    public String m9781e() {
        return this.f9808o;
    }

    @InterfaceC4727d(tag = 12)
    /* renamed from: f */
    public b m9782f() {
        return this.f9805l;
    }

    @InterfaceC4727d(tag = 3)
    /* renamed from: g */
    public String m9783g() {
        return this.f9796c;
    }

    @InterfaceC4727d(tag = 2)
    /* renamed from: h */
    public String m9784h() {
        return this.f9795b;
    }

    @InterfaceC4727d(tag = 4)
    /* renamed from: i */
    public c m9785i() {
        return this.f9797d;
    }

    @InterfaceC4727d(tag = 6)
    /* renamed from: j */
    public String m9786j() {
        return this.f9799f;
    }

    @InterfaceC4727d(tag = 8)
    /* renamed from: k */
    public int m9787k() {
        return this.f9801h;
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: l */
    public long m9788l() {
        return this.f9794a;
    }

    @InterfaceC4727d(tag = 5)
    /* renamed from: m */
    public d m9789m() {
        return this.f9798e;
    }

    @InterfaceC4727d(tag = 10)
    /* renamed from: n */
    public String m9790n() {
        return this.f9803j;
    }

    @InterfaceC4727d(tag = 9)
    /* renamed from: o */
    public int m9791o() {
        return this.f9802i;
    }
}
