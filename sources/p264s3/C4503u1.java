package p264s3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p126i7.AbstractC2651u;
import p126i7.AbstractC2653v;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4503u1;
import p264s3.InterfaceC4436h;
import p276t4.C4691c;

/* renamed from: s3.u1 */
/* loaded from: classes.dex */
public final class C4503u1 implements InterfaceC4436h {

    /* renamed from: p */
    public static final C4503u1 f16704p = new c().m17602a();

    /* renamed from: q */
    public static final String f16705q = C4041n0.m15478q0(0);

    /* renamed from: r */
    public static final String f16706r = C4041n0.m15478q0(1);

    /* renamed from: s */
    public static final String f16707s = C4041n0.m15478q0(2);

    /* renamed from: t */
    public static final String f16708t = C4041n0.m15478q0(3);

    /* renamed from: u */
    public static final String f16709u = C4041n0.m15478q0(4);

    /* renamed from: v */
    public static final InterfaceC4436h.a<C4503u1> f16710v = new InterfaceC4436h.a() { // from class: s3.t1
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4503u1 m17599c;
            m17599c = C4503u1.m17599c(bundle);
            return m17599c;
        }
    };

    /* renamed from: h */
    public final String f16711h;

    /* renamed from: i */
    public final h f16712i;

    /* renamed from: j */
    @Deprecated
    public final i f16713j;

    /* renamed from: k */
    public final g f16714k;

    /* renamed from: l */
    public final C4528z1 f16715l;

    /* renamed from: m */
    public final d f16716m;

    /* renamed from: n */
    @Deprecated
    public final e f16717n;

    /* renamed from: o */
    public final j f16718o;

    /* renamed from: s3.u1$b */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* renamed from: s3.u1$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public String f16719a;

        /* renamed from: b */
        public Uri f16720b;

        /* renamed from: c */
        public String f16721c;

        /* renamed from: d */
        public d.a f16722d;

        /* renamed from: e */
        public f.a f16723e;

        /* renamed from: f */
        public List<C4691c> f16724f;

        /* renamed from: g */
        public String f16725g;

        /* renamed from: h */
        public AbstractC2651u<l> f16726h;

        /* renamed from: i */
        public b f16727i;

        /* renamed from: j */
        public Object f16728j;

        /* renamed from: k */
        public C4528z1 f16729k;

        /* renamed from: l */
        public g.a f16730l;

        /* renamed from: m */
        public j f16731m;

        public c() {
            this.f16722d = new d.a();
            this.f16723e = new f.a();
            this.f16724f = Collections.emptyList();
            this.f16726h = AbstractC2651u.m10770u();
            this.f16730l = new g.a();
            this.f16731m = j.f16795k;
        }

        public c(C4503u1 c4503u1) {
            this();
            this.f16722d = c4503u1.f16716m.m17609b();
            this.f16719a = c4503u1.f16711h;
            this.f16729k = c4503u1.f16715l;
            this.f16730l = c4503u1.f16714k.m17636b();
            this.f16731m = c4503u1.f16718o;
            h hVar = c4503u1.f16712i;
            if (hVar != null) {
                this.f16725g = hVar.f16791f;
                this.f16721c = hVar.f16787b;
                this.f16720b = hVar.f16786a;
                this.f16724f = hVar.f16790e;
                this.f16726h = hVar.f16792g;
                this.f16728j = hVar.f16794i;
                f fVar = hVar.f16788c;
                this.f16723e = fVar != null ? fVar.m17623b() : new f.a();
            }
        }

        /* renamed from: a */
        public C4503u1 m17602a() {
            i iVar;
            C4014a.m15200f(this.f16723e.f16762b == null || this.f16723e.f16761a != null);
            Uri uri = this.f16720b;
            if (uri != null) {
                iVar = new i(uri, this.f16721c, this.f16723e.f16761a != null ? this.f16723e.m17633i() : null, this.f16727i, this.f16724f, this.f16725g, this.f16726h, this.f16728j);
            } else {
                iVar = null;
            }
            String str = this.f16719a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e m17616g = this.f16722d.m17616g();
            g m17642f = this.f16730l.m17642f();
            C4528z1 c4528z1 = this.f16729k;
            if (c4528z1 == null) {
                c4528z1 = C4528z1.f17007P;
            }
            return new C4503u1(str2, m17616g, iVar, m17642f, c4528z1, this.f16731m);
        }

        /* renamed from: b */
        public c m17603b(String str) {
            this.f16725g = str;
            return this;
        }

        /* renamed from: c */
        public c m17604c(String str) {
            this.f16719a = (String) C4014a.m15199e(str);
            return this;
        }

        /* renamed from: d */
        public c m17605d(Object obj) {
            this.f16728j = obj;
            return this;
        }

        /* renamed from: e */
        public c m17606e(Uri uri) {
            this.f16720b = uri;
            return this;
        }
    }

    /* renamed from: s3.u1$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC4436h {

        /* renamed from: m */
        public static final d f16732m = new a().m17615f();

        /* renamed from: n */
        public static final String f16733n = C4041n0.m15478q0(0);

        /* renamed from: o */
        public static final String f16734o = C4041n0.m15478q0(1);

        /* renamed from: p */
        public static final String f16735p = C4041n0.m15478q0(2);

        /* renamed from: q */
        public static final String f16736q = C4041n0.m15478q0(3);

        /* renamed from: r */
        public static final String f16737r = C4041n0.m15478q0(4);

        /* renamed from: s */
        public static final InterfaceC4436h.a<e> f16738s = new InterfaceC4436h.a() { // from class: s3.v1
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                C4503u1.e m17608c;
                m17608c = C4503u1.d.m17608c(bundle);
                return m17608c;
            }
        };

        /* renamed from: h */
        public final long f16739h;

        /* renamed from: i */
        public final long f16740i;

        /* renamed from: j */
        public final boolean f16741j;

        /* renamed from: k */
        public final boolean f16742k;

        /* renamed from: l */
        public final boolean f16743l;

        /* renamed from: s3.u1$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public long f16744a;

            /* renamed from: b */
            public long f16745b;

            /* renamed from: c */
            public boolean f16746c;

            /* renamed from: d */
            public boolean f16747d;

            /* renamed from: e */
            public boolean f16748e;

            public a() {
                this.f16745b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f16744a = dVar.f16739h;
                this.f16745b = dVar.f16740i;
                this.f16746c = dVar.f16741j;
                this.f16747d = dVar.f16742k;
                this.f16748e = dVar.f16743l;
            }

            /* renamed from: f */
            public d m17615f() {
                return m17616g();
            }

            @Deprecated
            /* renamed from: g */
            public e m17616g() {
                return new e(this);
            }

            /* renamed from: h */
            public a m17617h(long j10) {
                C4014a.m15195a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f16745b = j10;
                return this;
            }

            /* renamed from: i */
            public a m17618i(boolean z10) {
                this.f16747d = z10;
                return this;
            }

            /* renamed from: j */
            public a m17619j(boolean z10) {
                this.f16746c = z10;
                return this;
            }

            /* renamed from: k */
            public a m17620k(long j10) {
                C4014a.m15195a(j10 >= 0);
                this.f16744a = j10;
                return this;
            }

            /* renamed from: l */
            public a m17621l(boolean z10) {
                this.f16748e = z10;
                return this;
            }
        }

        public d(a aVar) {
            this.f16739h = aVar.f16744a;
            this.f16740i = aVar.f16745b;
            this.f16741j = aVar.f16746c;
            this.f16742k = aVar.f16747d;
            this.f16743l = aVar.f16748e;
        }

        /* renamed from: c */
        public static /* synthetic */ e m17608c(Bundle bundle) {
            a aVar = new a();
            String str = f16733n;
            d dVar = f16732m;
            return aVar.m17620k(bundle.getLong(str, dVar.f16739h)).m17617h(bundle.getLong(f16734o, dVar.f16740i)).m17619j(bundle.getBoolean(f16735p, dVar.f16741j)).m17618i(bundle.getBoolean(f16736q, dVar.f16742k)).m17621l(bundle.getBoolean(f16737r, dVar.f16743l)).m17616g();
        }

        /* renamed from: b */
        public a m17609b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16739h == dVar.f16739h && this.f16740i == dVar.f16740i && this.f16741j == dVar.f16741j && this.f16742k == dVar.f16742k && this.f16743l == dVar.f16743l;
        }

        public int hashCode() {
            long j10 = this.f16739h;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f16740i;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f16741j ? 1 : 0)) * 31) + (this.f16742k ? 1 : 0)) * 31) + (this.f16743l ? 1 : 0);
        }
    }

    @Deprecated
    /* renamed from: s3.u1$e */
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: t */
        public static final e f16749t = new d.a().m17616g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: s3.u1$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final UUID f16750a;

        /* renamed from: b */
        @Deprecated
        public final UUID f16751b;

        /* renamed from: c */
        public final Uri f16752c;

        /* renamed from: d */
        @Deprecated
        public final AbstractC2653v<String, String> f16753d;

        /* renamed from: e */
        public final AbstractC2653v<String, String> f16754e;

        /* renamed from: f */
        public final boolean f16755f;

        /* renamed from: g */
        public final boolean f16756g;

        /* renamed from: h */
        public final boolean f16757h;

        /* renamed from: i */
        @Deprecated
        public final AbstractC2651u<Integer> f16758i;

        /* renamed from: j */
        public final AbstractC2651u<Integer> f16759j;

        /* renamed from: k */
        public final byte[] f16760k;

        /* renamed from: s3.u1$f$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public UUID f16761a;

            /* renamed from: b */
            public Uri f16762b;

            /* renamed from: c */
            public AbstractC2653v<String, String> f16763c;

            /* renamed from: d */
            public boolean f16764d;

            /* renamed from: e */
            public boolean f16765e;

            /* renamed from: f */
            public boolean f16766f;

            /* renamed from: g */
            public AbstractC2651u<Integer> f16767g;

            /* renamed from: h */
            public byte[] f16768h;

            @Deprecated
            public a() {
                this.f16763c = AbstractC2653v.m10800j();
                this.f16767g = AbstractC2651u.m10770u();
            }

            public a(f fVar) {
                this.f16761a = fVar.f16750a;
                this.f16762b = fVar.f16752c;
                this.f16763c = fVar.f16754e;
                this.f16764d = fVar.f16755f;
                this.f16765e = fVar.f16756g;
                this.f16766f = fVar.f16757h;
                this.f16767g = fVar.f16759j;
                this.f16768h = fVar.f16760k;
            }

            /* renamed from: i */
            public f m17633i() {
                return new f(this);
            }
        }

        public f(a aVar) {
            C4014a.m15200f((aVar.f16766f && aVar.f16762b == null) ? false : true);
            UUID uuid = (UUID) C4014a.m15199e(aVar.f16761a);
            this.f16750a = uuid;
            this.f16751b = uuid;
            this.f16752c = aVar.f16762b;
            this.f16753d = aVar.f16763c;
            this.f16754e = aVar.f16763c;
            this.f16755f = aVar.f16764d;
            this.f16757h = aVar.f16766f;
            this.f16756g = aVar.f16765e;
            this.f16758i = aVar.f16767g;
            this.f16759j = aVar.f16767g;
            this.f16760k = aVar.f16768h != null ? Arrays.copyOf(aVar.f16768h, aVar.f16768h.length) : null;
        }

        /* renamed from: b */
        public a m17623b() {
            return new a();
        }

        /* renamed from: c */
        public byte[] m17624c() {
            byte[] bArr = this.f16760k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f16750a.equals(fVar.f16750a) && C4041n0.m15449c(this.f16752c, fVar.f16752c) && C4041n0.m15449c(this.f16754e, fVar.f16754e) && this.f16755f == fVar.f16755f && this.f16757h == fVar.f16757h && this.f16756g == fVar.f16756g && this.f16759j.equals(fVar.f16759j) && Arrays.equals(this.f16760k, fVar.f16760k);
        }

        public int hashCode() {
            int hashCode = this.f16750a.hashCode() * 31;
            Uri uri = this.f16752c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f16754e.hashCode()) * 31) + (this.f16755f ? 1 : 0)) * 31) + (this.f16757h ? 1 : 0)) * 31) + (this.f16756g ? 1 : 0)) * 31) + this.f16759j.hashCode()) * 31) + Arrays.hashCode(this.f16760k);
        }
    }

    /* renamed from: s3.u1$g */
    /* loaded from: classes.dex */
    public static final class g implements InterfaceC4436h {

        /* renamed from: m */
        public static final g f16769m = new a().m17642f();

        /* renamed from: n */
        public static final String f16770n = C4041n0.m15478q0(0);

        /* renamed from: o */
        public static final String f16771o = C4041n0.m15478q0(1);

        /* renamed from: p */
        public static final String f16772p = C4041n0.m15478q0(2);

        /* renamed from: q */
        public static final String f16773q = C4041n0.m15478q0(3);

        /* renamed from: r */
        public static final String f16774r = C4041n0.m15478q0(4);

        /* renamed from: s */
        public static final InterfaceC4436h.a<g> f16775s = new InterfaceC4436h.a() { // from class: s3.w1
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                C4503u1.g m17635c;
                m17635c = C4503u1.g.m17635c(bundle);
                return m17635c;
            }
        };

        /* renamed from: h */
        public final long f16776h;

        /* renamed from: i */
        public final long f16777i;

        /* renamed from: j */
        public final long f16778j;

        /* renamed from: k */
        public final float f16779k;

        /* renamed from: l */
        public final float f16780l;

        /* renamed from: s3.u1$g$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public long f16781a;

            /* renamed from: b */
            public long f16782b;

            /* renamed from: c */
            public long f16783c;

            /* renamed from: d */
            public float f16784d;

            /* renamed from: e */
            public float f16785e;

            public a() {
                this.f16781a = -9223372036854775807L;
                this.f16782b = -9223372036854775807L;
                this.f16783c = -9223372036854775807L;
                this.f16784d = -3.4028235E38f;
                this.f16785e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f16781a = gVar.f16776h;
                this.f16782b = gVar.f16777i;
                this.f16783c = gVar.f16778j;
                this.f16784d = gVar.f16779k;
                this.f16785e = gVar.f16780l;
            }

            /* renamed from: f */
            public g m17642f() {
                return new g(this);
            }

            /* renamed from: g */
            public a m17643g(long j10) {
                this.f16783c = j10;
                return this;
            }

            /* renamed from: h */
            public a m17644h(float f10) {
                this.f16785e = f10;
                return this;
            }

            /* renamed from: i */
            public a m17645i(long j10) {
                this.f16782b = j10;
                return this;
            }

            /* renamed from: j */
            public a m17646j(float f10) {
                this.f16784d = f10;
                return this;
            }

            /* renamed from: k */
            public a m17647k(long j10) {
                this.f16781a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f16776h = j10;
            this.f16777i = j11;
            this.f16778j = j12;
            this.f16779k = f10;
            this.f16780l = f11;
        }

        public g(a aVar) {
            this(aVar.f16781a, aVar.f16782b, aVar.f16783c, aVar.f16784d, aVar.f16785e);
        }

        /* renamed from: c */
        public static /* synthetic */ g m17635c(Bundle bundle) {
            String str = f16770n;
            g gVar = f16769m;
            return new g(bundle.getLong(str, gVar.f16776h), bundle.getLong(f16771o, gVar.f16777i), bundle.getLong(f16772p, gVar.f16778j), bundle.getFloat(f16773q, gVar.f16779k), bundle.getFloat(f16774r, gVar.f16780l));
        }

        /* renamed from: b */
        public a m17636b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f16776h == gVar.f16776h && this.f16777i == gVar.f16777i && this.f16778j == gVar.f16778j && this.f16779k == gVar.f16779k && this.f16780l == gVar.f16780l;
        }

        public int hashCode() {
            long j10 = this.f16776h;
            long j11 = this.f16777i;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f16778j;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f16779k;
            int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f16780l;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* renamed from: s3.u1$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public final Uri f16786a;

        /* renamed from: b */
        public final String f16787b;

        /* renamed from: c */
        public final f f16788c;

        /* renamed from: d */
        public final b f16789d;

        /* renamed from: e */
        public final List<C4691c> f16790e;

        /* renamed from: f */
        public final String f16791f;

        /* renamed from: g */
        public final AbstractC2651u<l> f16792g;

        /* renamed from: h */
        @Deprecated
        public final List<k> f16793h;

        /* renamed from: i */
        public final Object f16794i;

        public h(Uri uri, String str, f fVar, b bVar, List<C4691c> list, String str2, AbstractC2651u<l> abstractC2651u, Object obj) {
            this.f16786a = uri;
            this.f16787b = str;
            this.f16788c = fVar;
            this.f16790e = list;
            this.f16791f = str2;
            this.f16792g = abstractC2651u;
            AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
            for (int i10 = 0; i10 < abstractC2651u.size(); i10++) {
                m10766n.mo10749a(abstractC2651u.get(i10).m17657a().m17666i());
            }
            this.f16793h = m10766n.m10784k();
            this.f16794i = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f16786a.equals(hVar.f16786a) && C4041n0.m15449c(this.f16787b, hVar.f16787b) && C4041n0.m15449c(this.f16788c, hVar.f16788c) && C4041n0.m15449c(this.f16789d, hVar.f16789d) && this.f16790e.equals(hVar.f16790e) && C4041n0.m15449c(this.f16791f, hVar.f16791f) && this.f16792g.equals(hVar.f16792g) && C4041n0.m15449c(this.f16794i, hVar.f16794i);
        }

        public int hashCode() {
            int hashCode = this.f16786a.hashCode() * 31;
            String str = this.f16787b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f16788c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f16790e.hashCode()) * 31;
            String str2 = this.f16791f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f16792g.hashCode()) * 31;
            Object obj = this.f16794i;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* renamed from: s3.u1$i */
    /* loaded from: classes.dex */
    public static final class i extends h {
        public i(Uri uri, String str, f fVar, b bVar, List<C4691c> list, String str2, AbstractC2651u<l> abstractC2651u, Object obj) {
            super(uri, str, fVar, bVar, list, str2, abstractC2651u, obj);
        }
    }

    /* renamed from: s3.u1$j */
    /* loaded from: classes.dex */
    public static final class j implements InterfaceC4436h {

        /* renamed from: k */
        public static final j f16795k = new a().m17653d();

        /* renamed from: l */
        public static final String f16796l = C4041n0.m15478q0(0);

        /* renamed from: m */
        public static final String f16797m = C4041n0.m15478q0(1);

        /* renamed from: n */
        public static final String f16798n = C4041n0.m15478q0(2);

        /* renamed from: o */
        public static final InterfaceC4436h.a<j> f16799o = new InterfaceC4436h.a() { // from class: s3.x1
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                C4503u1.j m17649b;
                m17649b = C4503u1.j.m17649b(bundle);
                return m17649b;
            }
        };

        /* renamed from: h */
        public final Uri f16800h;

        /* renamed from: i */
        public final String f16801i;

        /* renamed from: j */
        public final Bundle f16802j;

        /* renamed from: s3.u1$j$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public Uri f16803a;

            /* renamed from: b */
            public String f16804b;

            /* renamed from: c */
            public Bundle f16805c;

            /* renamed from: d */
            public j m17653d() {
                return new j(this);
            }

            /* renamed from: e */
            public a m17654e(Bundle bundle) {
                this.f16805c = bundle;
                return this;
            }

            /* renamed from: f */
            public a m17655f(Uri uri) {
                this.f16803a = uri;
                return this;
            }

            /* renamed from: g */
            public a m17656g(String str) {
                this.f16804b = str;
                return this;
            }
        }

        public j(a aVar) {
            this.f16800h = aVar.f16803a;
            this.f16801i = aVar.f16804b;
            this.f16802j = aVar.f16805c;
        }

        /* renamed from: b */
        public static /* synthetic */ j m17649b(Bundle bundle) {
            return new a().m17655f((Uri) bundle.getParcelable(f16796l)).m17656g(bundle.getString(f16797m)).m17654e(bundle.getBundle(f16798n)).m17653d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C4041n0.m15449c(this.f16800h, jVar.f16800h) && C4041n0.m15449c(this.f16801i, jVar.f16801i);
        }

        public int hashCode() {
            Uri uri = this.f16800h;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f16801i;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    /* renamed from: s3.u1$k */
    /* loaded from: classes.dex */
    public static final class k extends l {
        public k(l.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: s3.u1$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        public final Uri f16806a;

        /* renamed from: b */
        public final String f16807b;

        /* renamed from: c */
        public final String f16808c;

        /* renamed from: d */
        public final int f16809d;

        /* renamed from: e */
        public final int f16810e;

        /* renamed from: f */
        public final String f16811f;

        /* renamed from: g */
        public final String f16812g;

        /* renamed from: s3.u1$l$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public Uri f16813a;

            /* renamed from: b */
            public String f16814b;

            /* renamed from: c */
            public String f16815c;

            /* renamed from: d */
            public int f16816d;

            /* renamed from: e */
            public int f16817e;

            /* renamed from: f */
            public String f16818f;

            /* renamed from: g */
            public String f16819g;

            public a(l lVar) {
                this.f16813a = lVar.f16806a;
                this.f16814b = lVar.f16807b;
                this.f16815c = lVar.f16808c;
                this.f16816d = lVar.f16809d;
                this.f16817e = lVar.f16810e;
                this.f16818f = lVar.f16811f;
                this.f16819g = lVar.f16812g;
            }

            /* renamed from: i */
            public final k m17666i() {
                return new k(this);
            }
        }

        public l(a aVar) {
            this.f16806a = aVar.f16813a;
            this.f16807b = aVar.f16814b;
            this.f16808c = aVar.f16815c;
            this.f16809d = aVar.f16816d;
            this.f16810e = aVar.f16817e;
            this.f16811f = aVar.f16818f;
            this.f16812g = aVar.f16819g;
        }

        /* renamed from: a */
        public a m17657a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f16806a.equals(lVar.f16806a) && C4041n0.m15449c(this.f16807b, lVar.f16807b) && C4041n0.m15449c(this.f16808c, lVar.f16808c) && this.f16809d == lVar.f16809d && this.f16810e == lVar.f16810e && C4041n0.m15449c(this.f16811f, lVar.f16811f) && C4041n0.m15449c(this.f16812g, lVar.f16812g);
        }

        public int hashCode() {
            int hashCode = this.f16806a.hashCode() * 31;
            String str = this.f16807b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16808c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f16809d) * 31) + this.f16810e) * 31;
            String str3 = this.f16811f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f16812g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public C4503u1(String str, e eVar, i iVar, g gVar, C4528z1 c4528z1, j jVar) {
        this.f16711h = str;
        this.f16712i = iVar;
        this.f16713j = iVar;
        this.f16714k = gVar;
        this.f16715l = c4528z1;
        this.f16716m = eVar;
        this.f16717n = eVar;
        this.f16718o = jVar;
    }

    /* renamed from: c */
    public static C4503u1 m17599c(Bundle bundle) {
        String str = (String) C4014a.m15199e(bundle.getString(f16705q, ""));
        Bundle bundle2 = bundle.getBundle(f16706r);
        g mo6314a = bundle2 == null ? g.f16769m : g.f16775s.mo6314a(bundle2);
        Bundle bundle3 = bundle.getBundle(f16707s);
        C4528z1 mo6314a2 = bundle3 == null ? C4528z1.f17007P : C4528z1.f17041x0.mo6314a(bundle3);
        Bundle bundle4 = bundle.getBundle(f16708t);
        e mo6314a3 = bundle4 == null ? e.f16749t : d.f16738s.mo6314a(bundle4);
        Bundle bundle5 = bundle.getBundle(f16709u);
        return new C4503u1(str, mo6314a3, null, mo6314a, mo6314a2, bundle5 == null ? j.f16795k : j.f16799o.mo6314a(bundle5));
    }

    /* renamed from: d */
    public static C4503u1 m17600d(Uri uri) {
        return new c().m17606e(uri).m17602a();
    }

    /* renamed from: b */
    public c m17601b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4503u1)) {
            return false;
        }
        C4503u1 c4503u1 = (C4503u1) obj;
        return C4041n0.m15449c(this.f16711h, c4503u1.f16711h) && this.f16716m.equals(c4503u1.f16716m) && C4041n0.m15449c(this.f16712i, c4503u1.f16712i) && C4041n0.m15449c(this.f16714k, c4503u1.f16714k) && C4041n0.m15449c(this.f16715l, c4503u1.f16715l) && C4041n0.m15449c(this.f16718o, c4503u1.f16718o);
    }

    public int hashCode() {
        int hashCode = this.f16711h.hashCode() * 31;
        h hVar = this.f16712i;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f16714k.hashCode()) * 31) + this.f16716m.hashCode()) * 31) + this.f16715l.hashCode()) * 31) + this.f16718o.hashCode();
    }
}
