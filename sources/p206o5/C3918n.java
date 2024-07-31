package p206o5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p222p5.C4014a;
import p264s3.C4448j1;

/* renamed from: o5.n */
/* loaded from: classes.dex */
public final class C3918n {

    /* renamed from: a */
    public final Uri f14071a;

    /* renamed from: b */
    public final long f14072b;

    /* renamed from: c */
    public final int f14073c;

    /* renamed from: d */
    public final byte[] f14074d;

    /* renamed from: e */
    public final Map<String, String> f14075e;

    /* renamed from: f */
    @Deprecated
    public final long f14076f;

    /* renamed from: g */
    public final long f14077g;

    /* renamed from: h */
    public final long f14078h;

    /* renamed from: i */
    public final String f14079i;

    /* renamed from: j */
    public final int f14080j;

    /* renamed from: k */
    public final Object f14081k;

    /* renamed from: o5.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public Uri f14082a;

        /* renamed from: b */
        public long f14083b;

        /* renamed from: c */
        public int f14084c;

        /* renamed from: d */
        public byte[] f14085d;

        /* renamed from: e */
        public Map<String, String> f14086e;

        /* renamed from: f */
        public long f14087f;

        /* renamed from: g */
        public long f14088g;

        /* renamed from: h */
        public String f14089h;

        /* renamed from: i */
        public int f14090i;

        /* renamed from: j */
        public Object f14091j;

        public b() {
            this.f14084c = 1;
            this.f14086e = Collections.emptyMap();
            this.f14088g = -1L;
        }

        public b(C3918n c3918n) {
            this.f14082a = c3918n.f14071a;
            this.f14083b = c3918n.f14072b;
            this.f14084c = c3918n.f14073c;
            this.f14085d = c3918n.f14074d;
            this.f14086e = c3918n.f14075e;
            this.f14087f = c3918n.f14077g;
            this.f14088g = c3918n.f14078h;
            this.f14089h = c3918n.f14079i;
            this.f14090i = c3918n.f14080j;
            this.f14091j = c3918n.f14081k;
        }

        /* renamed from: a */
        public C3918n m14858a() {
            C4014a.m15203i(this.f14082a, "The uri must be set.");
            return new C3918n(this.f14082a, this.f14083b, this.f14084c, this.f14085d, this.f14086e, this.f14087f, this.f14088g, this.f14089h, this.f14090i, this.f14091j);
        }

        /* renamed from: b */
        public b m14859b(int i10) {
            this.f14090i = i10;
            return this;
        }

        /* renamed from: c */
        public b m14860c(byte[] bArr) {
            this.f14085d = bArr;
            return this;
        }

        /* renamed from: d */
        public b m14861d(int i10) {
            this.f14084c = i10;
            return this;
        }

        /* renamed from: e */
        public b m14862e(Map<String, String> map) {
            this.f14086e = map;
            return this;
        }

        /* renamed from: f */
        public b m14863f(String str) {
            this.f14089h = str;
            return this;
        }

        /* renamed from: g */
        public b m14864g(long j10) {
            this.f14088g = j10;
            return this;
        }

        /* renamed from: h */
        public b m14865h(long j10) {
            this.f14087f = j10;
            return this;
        }

        /* renamed from: i */
        public b m14866i(Uri uri) {
            this.f14082a = uri;
            return this;
        }

        /* renamed from: j */
        public b m14867j(String str) {
            this.f14082a = Uri.parse(str);
            return this;
        }
    }

    static {
        C4448j1.m17365a("goog.exo.datasource");
    }

    public C3918n(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C3918n(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        C4014a.m15195a(j13 >= 0);
        C4014a.m15195a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        C4014a.m15195a(z10);
        this.f14071a = uri;
        this.f14072b = j10;
        this.f14073c = i10;
        this.f14074d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14075e = Collections.unmodifiableMap(new HashMap(map));
        this.f14077g = j11;
        this.f14076f = j13;
        this.f14078h = j12;
        this.f14079i = str;
        this.f14080j = i11;
        this.f14081k = obj;
    }

    public C3918n(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    /* renamed from: c */
    public static String m14852c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public b m14853a() {
        return new b();
    }

    /* renamed from: b */
    public final String m14854b() {
        return m14852c(this.f14073c);
    }

    /* renamed from: d */
    public boolean m14855d(int i10) {
        return (this.f14080j & i10) == i10;
    }

    /* renamed from: e */
    public C3918n m14856e(long j10) {
        long j11 = this.f14078h;
        return m14857f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    /* renamed from: f */
    public C3918n m14857f(long j10, long j11) {
        return (j10 == 0 && this.f14078h == j11) ? this : new C3918n(this.f14071a, this.f14072b, this.f14073c, this.f14074d, this.f14075e, this.f14077g + j10, j11, this.f14079i, this.f14080j, this.f14081k);
    }

    public String toString() {
        return "DataSpec[" + m14854b() + " " + this.f14071a + ", " + this.f14077g + ", " + this.f14078h + ", " + this.f14079i + ", " + this.f14080j + "]";
    }
}
