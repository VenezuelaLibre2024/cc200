package p007a5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p126i7.AbstractC2651u;
import p276t4.C4691c;
import p317w3.C5247m;

/* renamed from: a5.g */
/* loaded from: classes.dex */
public final class C0053g extends AbstractC0055i {

    /* renamed from: d */
    public final int f127d;

    /* renamed from: e */
    public final long f128e;

    /* renamed from: f */
    public final boolean f129f;

    /* renamed from: g */
    public final boolean f130g;

    /* renamed from: h */
    public final long f131h;

    /* renamed from: i */
    public final boolean f132i;

    /* renamed from: j */
    public final int f133j;

    /* renamed from: k */
    public final long f134k;

    /* renamed from: l */
    public final int f135l;

    /* renamed from: m */
    public final long f136m;

    /* renamed from: n */
    public final long f137n;

    /* renamed from: o */
    public final boolean f138o;

    /* renamed from: p */
    public final boolean f139p;

    /* renamed from: q */
    public final C5247m f140q;

    /* renamed from: r */
    public final List<d> f141r;

    /* renamed from: s */
    public final List<b> f142s;

    /* renamed from: t */
    public final Map<Uri, c> f143t;

    /* renamed from: u */
    public final long f144u;

    /* renamed from: v */
    public final f f145v;

    /* renamed from: a5.g$b */
    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: s */
        public final boolean f146s;

        /* renamed from: t */
        public final boolean f147t;

        public b(String str, d dVar, long j10, int i10, long j11, C5247m c5247m, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, c5247m, str2, str3, j12, j13, z10);
            this.f146s = z11;
            this.f147t = z12;
        }

        /* renamed from: c */
        public b m253c(long j10, int i10) {
            return new b(this.f153h, this.f154i, this.f155j, i10, j10, this.f158m, this.f159n, this.f160o, this.f161p, this.f162q, this.f163r, this.f146s, this.f147t);
        }
    }

    /* renamed from: a5.g$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final Uri f148a;

        /* renamed from: b */
        public final long f149b;

        /* renamed from: c */
        public final int f150c;

        public c(Uri uri, long j10, int i10) {
            this.f148a = uri;
            this.f149b = j10;
            this.f150c = i10;
        }
    }

    /* renamed from: a5.g$d */
    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: s */
        public final String f151s;

        /* renamed from: t */
        public final List<b> f152t;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, AbstractC2651u.m10770u());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, C5247m c5247m, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, c5247m, str3, str4, j12, j13, z10);
            this.f151s = str2;
            this.f152t = AbstractC2651u.m10768p(list);
        }

        /* renamed from: c */
        public d m254c(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f152t.size(); i11++) {
                b bVar = this.f152t.get(i11);
                arrayList.add(bVar.m253c(j11, i10));
                j11 += bVar.f155j;
            }
            return new d(this.f153h, this.f154i, this.f151s, this.f155j, i10, j10, this.f158m, this.f159n, this.f160o, this.f161p, this.f162q, this.f163r, arrayList);
        }
    }

    /* renamed from: a5.g$e */
    /* loaded from: classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: h */
        public final String f153h;

        /* renamed from: i */
        public final d f154i;

        /* renamed from: j */
        public final long f155j;

        /* renamed from: k */
        public final int f156k;

        /* renamed from: l */
        public final long f157l;

        /* renamed from: m */
        public final C5247m f158m;

        /* renamed from: n */
        public final String f159n;

        /* renamed from: o */
        public final String f160o;

        /* renamed from: p */
        public final long f161p;

        /* renamed from: q */
        public final long f162q;

        /* renamed from: r */
        public final boolean f163r;

        public e(String str, d dVar, long j10, int i10, long j11, C5247m c5247m, String str2, String str3, long j12, long j13, boolean z10) {
            this.f153h = str;
            this.f154i = dVar;
            this.f155j = j10;
            this.f156k = i10;
            this.f157l = j11;
            this.f158m = c5247m;
            this.f159n = str2;
            this.f160o = str3;
            this.f161p = j12;
            this.f162q = j13;
            this.f163r = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f157l > l10.longValue()) {
                return 1;
            }
            return this.f157l < l10.longValue() ? -1 : 0;
        }
    }

    /* renamed from: a5.g$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final long f164a;

        /* renamed from: b */
        public final boolean f165b;

        /* renamed from: c */
        public final long f166c;

        /* renamed from: d */
        public final long f167d;

        /* renamed from: e */
        public final boolean f168e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f164a = j10;
            this.f165b = z10;
            this.f166c = j11;
            this.f167d = j12;
            this.f168e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0053g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, p317w3.C5247m r31, java.util.List<p007a5.C0053g.d> r32, java.util.List<p007a5.C0053g.b> r33, p007a5.C0053g.f r34, java.util.Map<android.net.Uri, p007a5.C0053g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f127d = r3
            r3 = r17
            r0.f131h = r3
            r3 = r16
            r0.f130g = r3
            r3 = r19
            r0.f132i = r3
            r3 = r20
            r0.f133j = r3
            r3 = r21
            r0.f134k = r3
            r3 = r23
            r0.f135l = r3
            r3 = r24
            r0.f136m = r3
            r3 = r26
            r0.f137n = r3
            r3 = r29
            r0.f138o = r3
            r3 = r30
            r0.f139p = r3
            r3 = r31
            r0.f140q = r3
            i7.u r3 = p126i7.AbstractC2651u.m10768p(r32)
            r0.f141r = r3
            i7.u r3 = p126i7.AbstractC2651u.m10768p(r33)
            r0.f142s = r3
            i7.v r3 = p126i7.AbstractC2653v.m10799c(r35)
            r0.f143t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = p126i7.C2610b0.m10505d(r33)
            a5.g$b r3 = (p007a5.C0053g.b) r3
        L58:
            long r6 = r3.f157l
            long r8 = r3.f155j
            long r6 = r6 + r8
            r0.f144u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = p126i7.C2610b0.m10505d(r32)
            a5.g$d r3 = (p007a5.C0053g.d) r3
            goto L58
        L6d:
            r0.f144u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f144u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f128e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f129f = r1
            r1 = r34
            r0.f145v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a5.C0053g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, w3.m, java.util.List, java.util.List, a5.g$f, java.util.Map):void");
    }

    @Override // p276t4.InterfaceC4689a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0053g mo247a(List<C4691c> list) {
        return this;
    }

    /* renamed from: c */
    public C0053g m249c(long j10, int i10) {
        return new C0053g(this.f127d, this.f190a, this.f191b, this.f128e, this.f130g, j10, true, i10, this.f134k, this.f135l, this.f136m, this.f137n, this.f192c, this.f138o, this.f139p, this.f140q, this.f141r, this.f142s, this.f145v, this.f143t);
    }

    /* renamed from: d */
    public C0053g m250d() {
        return this.f138o ? this : new C0053g(this.f127d, this.f190a, this.f191b, this.f128e, this.f130g, this.f131h, this.f132i, this.f133j, this.f134k, this.f135l, this.f136m, this.f137n, this.f192c, true, this.f139p, this.f140q, this.f141r, this.f142s, this.f145v, this.f143t);
    }

    /* renamed from: e */
    public long m251e() {
        return this.f131h + this.f144u;
    }

    /* renamed from: f */
    public boolean m252f(C0053g c0053g) {
        if (c0053g == null) {
            return true;
        }
        long j10 = this.f134k;
        long j11 = c0053g.f134k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f141r.size() - c0053g.f141r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f142s.size();
        int size3 = c0053g.f142s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f138o && !c0053g.f138o;
        }
        return true;
    }
}
