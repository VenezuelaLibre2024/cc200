package re;

import java.util.concurrent.TimeUnit;
import p079f6.C1841a;

/* renamed from: re.d */
/* loaded from: classes2.dex */
public final class C4352d {

    /* renamed from: n */
    public static final C4352d f15730n = new a().m16697c().m16695a();

    /* renamed from: o */
    public static final C4352d f15731o = new a().m16698d().m16696b(C1841a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).m16695a();

    /* renamed from: a */
    public final boolean f15732a;

    /* renamed from: b */
    public final boolean f15733b;

    /* renamed from: c */
    public final int f15734c;

    /* renamed from: d */
    public final int f15735d;

    /* renamed from: e */
    public final boolean f15736e;

    /* renamed from: f */
    public final boolean f15737f;

    /* renamed from: g */
    public final boolean f15738g;

    /* renamed from: h */
    public final int f15739h;

    /* renamed from: i */
    public final int f15740i;

    /* renamed from: j */
    public final boolean f15741j;

    /* renamed from: k */
    public final boolean f15742k;

    /* renamed from: l */
    public final boolean f15743l;

    /* renamed from: m */
    public String f15744m;

    /* renamed from: re.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f15745a;

        /* renamed from: b */
        public boolean f15746b;

        /* renamed from: c */
        public int f15747c = -1;

        /* renamed from: d */
        public int f15748d = -1;

        /* renamed from: e */
        public int f15749e = -1;

        /* renamed from: f */
        public boolean f15750f;

        /* renamed from: g */
        public boolean f15751g;

        /* renamed from: h */
        public boolean f15752h;

        /* renamed from: a */
        public C4352d m16695a() {
            return new C4352d(this);
        }

        /* renamed from: b */
        public a m16696b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f15748d = seconds > 2147483647L ? C1841a.e.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        /* renamed from: c */
        public a m16697c() {
            this.f15745a = true;
            return this;
        }

        /* renamed from: d */
        public a m16698d() {
            this.f15750f = true;
            return this;
        }
    }

    public C4352d(a aVar) {
        this.f15732a = aVar.f15745a;
        this.f15733b = aVar.f15746b;
        this.f15734c = aVar.f15747c;
        this.f15735d = -1;
        this.f15736e = false;
        this.f15737f = false;
        this.f15738g = false;
        this.f15739h = aVar.f15748d;
        this.f15740i = aVar.f15749e;
        this.f15741j = aVar.f15750f;
        this.f15742k = aVar.f15751g;
        this.f15743l = aVar.f15752h;
    }

    public C4352d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f15732a = z10;
        this.f15733b = z11;
        this.f15734c = i10;
        this.f15735d = i11;
        this.f15736e = z12;
        this.f15737f = z13;
        this.f15738g = z14;
        this.f15739h = i12;
        this.f15740i = i13;
        this.f15741j = z15;
        this.f15742k = z16;
        this.f15743l = z17;
        this.f15744m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static re.C4352d m16684k(re.C4373u r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C4352d.m16684k(re.u):re.d");
    }

    /* renamed from: a */
    public final String m16685a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f15732a) {
            sb2.append("no-cache, ");
        }
        if (this.f15733b) {
            sb2.append("no-store, ");
        }
        if (this.f15734c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f15734c);
            sb2.append(", ");
        }
        if (this.f15735d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f15735d);
            sb2.append(", ");
        }
        if (this.f15736e) {
            sb2.append("private, ");
        }
        if (this.f15737f) {
            sb2.append("public, ");
        }
        if (this.f15738g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f15739h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f15739h);
            sb2.append(", ");
        }
        if (this.f15740i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f15740i);
            sb2.append(", ");
        }
        if (this.f15741j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f15742k) {
            sb2.append("no-transform, ");
        }
        if (this.f15743l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    /* renamed from: b */
    public boolean m16686b() {
        return this.f15736e;
    }

    /* renamed from: c */
    public boolean m16687c() {
        return this.f15737f;
    }

    /* renamed from: d */
    public int m16688d() {
        return this.f15734c;
    }

    /* renamed from: e */
    public int m16689e() {
        return this.f15739h;
    }

    /* renamed from: f */
    public int m16690f() {
        return this.f15740i;
    }

    /* renamed from: g */
    public boolean m16691g() {
        return this.f15738g;
    }

    /* renamed from: h */
    public boolean m16692h() {
        return this.f15732a;
    }

    /* renamed from: i */
    public boolean m16693i() {
        return this.f15733b;
    }

    /* renamed from: j */
    public boolean m16694j() {
        return this.f15741j;
    }

    public String toString() {
        String str = this.f15744m;
        if (str != null) {
            return str;
        }
        String m16685a = m16685a();
        this.f15744m = m16685a;
        return m16685a;
    }
}
