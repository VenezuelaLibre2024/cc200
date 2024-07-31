package p289u3;

import android.media.AudioAttributes;
import android.os.Bundle;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: u3.e */
/* loaded from: classes.dex */
public final class C4813e implements InterfaceC4436h {

    /* renamed from: n */
    public static final C4813e f17998n = new e().m19016a();

    /* renamed from: o */
    public static final String f17999o = C4041n0.m15478q0(0);

    /* renamed from: p */
    public static final String f18000p = C4041n0.m15478q0(1);

    /* renamed from: q */
    public static final String f18001q = C4041n0.m15478q0(2);

    /* renamed from: r */
    public static final String f18002r = C4041n0.m15478q0(3);

    /* renamed from: s */
    public static final String f18003s = C4041n0.m15478q0(4);

    /* renamed from: t */
    public static final InterfaceC4436h.a<C4813e> f18004t = new InterfaceC4436h.a() { // from class: u3.d
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4813e m19012c;
            m19012c = C4813e.m19012c(bundle);
            return m19012c;
        }
    };

    /* renamed from: h */
    public final int f18005h;

    /* renamed from: i */
    public final int f18006i;

    /* renamed from: j */
    public final int f18007j;

    /* renamed from: k */
    public final int f18008k;

    /* renamed from: l */
    public final int f18009l;

    /* renamed from: m */
    public d f18010m;

    /* renamed from: u3.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static void m19014a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: u3.e$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static void m19015a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: u3.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final AudioAttributes f18011a;

        public d(C4813e c4813e) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c4813e.f18005h).setFlags(c4813e.f18006i).setUsage(c4813e.f18007j);
            int i10 = C4041n0.f14513a;
            if (i10 >= 29) {
                b.m19014a(usage, c4813e.f18008k);
            }
            if (i10 >= 32) {
                c.m19015a(usage, c4813e.f18009l);
            }
            this.f18011a = usage.build();
        }
    }

    /* renamed from: u3.e$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public int f18012a = 0;

        /* renamed from: b */
        public int f18013b = 0;

        /* renamed from: c */
        public int f18014c = 1;

        /* renamed from: d */
        public int f18015d = 1;

        /* renamed from: e */
        public int f18016e = 0;

        /* renamed from: a */
        public C4813e m19016a() {
            return new C4813e(this.f18012a, this.f18013b, this.f18014c, this.f18015d, this.f18016e);
        }

        /* renamed from: b */
        public e m19017b(int i10) {
            this.f18015d = i10;
            return this;
        }

        /* renamed from: c */
        public e m19018c(int i10) {
            this.f18012a = i10;
            return this;
        }

        /* renamed from: d */
        public e m19019d(int i10) {
            this.f18013b = i10;
            return this;
        }

        /* renamed from: e */
        public e m19020e(int i10) {
            this.f18016e = i10;
            return this;
        }

        /* renamed from: f */
        public e m19021f(int i10) {
            this.f18014c = i10;
            return this;
        }
    }

    public C4813e(int i10, int i11, int i12, int i13, int i14) {
        this.f18005h = i10;
        this.f18006i = i11;
        this.f18007j = i12;
        this.f18008k = i13;
        this.f18009l = i14;
    }

    /* renamed from: c */
    public static /* synthetic */ C4813e m19012c(Bundle bundle) {
        e eVar = new e();
        String str = f17999o;
        if (bundle.containsKey(str)) {
            eVar.m19018c(bundle.getInt(str));
        }
        String str2 = f18000p;
        if (bundle.containsKey(str2)) {
            eVar.m19019d(bundle.getInt(str2));
        }
        String str3 = f18001q;
        if (bundle.containsKey(str3)) {
            eVar.m19021f(bundle.getInt(str3));
        }
        String str4 = f18002r;
        if (bundle.containsKey(str4)) {
            eVar.m19017b(bundle.getInt(str4));
        }
        String str5 = f18003s;
        if (bundle.containsKey(str5)) {
            eVar.m19020e(bundle.getInt(str5));
        }
        return eVar.m19016a();
    }

    /* renamed from: b */
    public d m19013b() {
        if (this.f18010m == null) {
            this.f18010m = new d();
        }
        return this.f18010m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4813e.class != obj.getClass()) {
            return false;
        }
        C4813e c4813e = (C4813e) obj;
        return this.f18005h == c4813e.f18005h && this.f18006i == c4813e.f18006i && this.f18007j == c4813e.f18007j && this.f18008k == c4813e.f18008k && this.f18009l == c4813e.f18009l;
    }

    public int hashCode() {
        return ((((((((527 + this.f18005h) * 31) + this.f18006i) * 31) + this.f18007j) * 31) + this.f18008k) * 31) + this.f18009l;
    }
}
