package p365z4;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007a5.C0053g;
import p007a5.InterfaceC0058l;
import p126i7.AbstractC2651u;
import p126i7.C2610b0;
import p155k7.C3368e;
import p193n5.AbstractC3735c;
import p193n5.InterfaceC3752s;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4037l0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p275t3.C4674s1;
import p290u4.C4846b;
import p290u4.C4881s0;
import p318w4.AbstractC5262b;
import p318w4.AbstractC5266f;
import p318w4.AbstractC5272l;
import p318w4.AbstractC5274n;
import p318w4.InterfaceC5275o;

/* renamed from: z4.f */
/* loaded from: classes.dex */
public class C5975f {

    /* renamed from: a */
    public final InterfaceC5977h f22188a;

    /* renamed from: b */
    public final InterfaceC3910j f22189b;

    /* renamed from: c */
    public final InterfaceC3910j f22190c;

    /* renamed from: d */
    public final C5989t f22191d;

    /* renamed from: e */
    public final Uri[] f22192e;

    /* renamed from: f */
    public final C4463m1[] f22193f;

    /* renamed from: g */
    public final InterfaceC0058l f22194g;

    /* renamed from: h */
    public final C4881s0 f22195h;

    /* renamed from: i */
    public final List<C4463m1> f22196i;

    /* renamed from: k */
    public final C4674s1 f22198k;

    /* renamed from: l */
    public boolean f22199l;

    /* renamed from: n */
    public IOException f22201n;

    /* renamed from: o */
    public Uri f22202o;

    /* renamed from: p */
    public boolean f22203p;

    /* renamed from: q */
    public InterfaceC3752s f22204q;

    /* renamed from: s */
    public boolean f22206s;

    /* renamed from: j */
    public final C5974e f22197j = new C5974e(4);

    /* renamed from: m */
    public byte[] f22200m = C4041n0.f14518f;

    /* renamed from: r */
    public long f22205r = -9223372036854775807L;

    /* renamed from: z4.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5272l {

        /* renamed from: l */
        public byte[] f22207l;

        public a(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, byte[] bArr) {
            super(interfaceC3910j, c3918n, 3, c4463m1, i10, obj, bArr);
        }

        @Override // p318w4.AbstractC5272l
        /* renamed from: g */
        public void mo21355g(byte[] bArr, int i10) {
            this.f22207l = Arrays.copyOf(bArr, i10);
        }

        /* renamed from: j */
        public byte[] m23964j() {
            return this.f22207l;
        }
    }

    /* renamed from: z4.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public AbstractC5266f f22208a;

        /* renamed from: b */
        public boolean f22209b;

        /* renamed from: c */
        public Uri f22210c;

        public b() {
            m23965a();
        }

        /* renamed from: a */
        public void m23965a() {
            this.f22208a = null;
            this.f22209b = false;
            this.f22210c = null;
        }
    }

    /* renamed from: z4.f$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5262b {

        /* renamed from: e */
        public final List<C0053g.e> f22211e;

        /* renamed from: f */
        public final long f22212f;

        /* renamed from: g */
        public final String f22213g;

        public c(String str, long j10, List<C0053g.e> list) {
            super(0L, list.size() - 1);
            this.f22213g = str;
            this.f22212f = j10;
            this.f22211e = list;
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: a */
        public long mo4832a() {
            m21303c();
            return this.f22212f + this.f22211e.get((int) m21304d()).f157l;
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: b */
        public long mo4833b() {
            m21303c();
            C0053g.e eVar = this.f22211e.get((int) m21304d());
            return this.f22212f + eVar.f157l + eVar.f155j;
        }
    }

    /* renamed from: z4.f$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC3735c {

        /* renamed from: h */
        public int f22214h;

        public d(C4881s0 c4881s0, int[] iArr) {
            super(c4881s0, iArr);
            this.f22214h = mo14085a(c4881s0.m19444b(iArr[0]));
        }

        @Override // p193n5.InterfaceC3752s
        /* renamed from: g */
        public int mo14061g() {
            return this.f22214h;
        }

        @Override // p193n5.InterfaceC3752s
        /* renamed from: j */
        public void mo14062j(long j10, long j11, long j12, List<? extends AbstractC5274n> list, InterfaceC5275o[] interfaceC5275oArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo14091i(this.f22214h, elapsedRealtime)) {
                for (int i10 = this.f13318b - 1; i10 >= 0; i10--) {
                    if (!mo14091i(i10, elapsedRealtime)) {
                        this.f22214h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p193n5.InterfaceC3752s
        /* renamed from: p */
        public int mo14065p() {
            return 0;
        }

        @Override // p193n5.InterfaceC3752s
        /* renamed from: r */
        public Object mo14067r() {
            return null;
        }
    }

    /* renamed from: z4.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final C0053g.e f22215a;

        /* renamed from: b */
        public final long f22216b;

        /* renamed from: c */
        public final int f22217c;

        /* renamed from: d */
        public final boolean f22218d;

        public e(C0053g.e eVar, long j10, int i10) {
            this.f22215a = eVar;
            this.f22216b = j10;
            this.f22217c = i10;
            this.f22218d = (eVar instanceof C0053g.b) && ((C0053g.b) eVar).f147t;
        }
    }

    public C5975f(InterfaceC5977h interfaceC5977h, InterfaceC0058l interfaceC0058l, Uri[] uriArr, C4463m1[] c4463m1Arr, InterfaceC5976g interfaceC5976g, InterfaceC3917m0 interfaceC3917m0, C5989t c5989t, List<C4463m1> list, C4674s1 c4674s1) {
        this.f22188a = interfaceC5977h;
        this.f22194g = interfaceC0058l;
        this.f22192e = uriArr;
        this.f22193f = c4463m1Arr;
        this.f22191d = c5989t;
        this.f22196i = list;
        this.f22198k = c4674s1;
        InterfaceC3910j mo23929a = interfaceC5976g.mo23929a(1);
        this.f22189b = mo23929a;
        if (interfaceC3917m0 != null) {
            mo23929a.mo14820g(interfaceC3917m0);
        }
        this.f22190c = interfaceC5976g.mo23929a(3);
        this.f22195h = new C4881s0(c4463m1Arr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((c4463m1Arr[i10].f16499l & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f22204q = new d(this.f22195h, C3368e.m12533l(arrayList));
    }

    /* renamed from: d */
    public static Uri m23941d(C0053g c0053g, C0053g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f159n) == null) {
            return null;
        }
        return C4037l0.m15388e(c0053g.f190a, str);
    }

    /* renamed from: g */
    public static e m23942g(C0053g c0053g, long j10, int i10) {
        int i11 = (int) (j10 - c0053g.f134k);
        if (i11 == c0053g.f141r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < c0053g.f142s.size()) {
                return new e(c0053g.f142s.get(i10), j10, i10);
            }
            return null;
        }
        C0053g.d dVar = c0053g.f141r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f152t.size()) {
            return new e(dVar.f152t.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < c0053g.f141r.size()) {
            return new e(c0053g.f141r.get(i12), j10 + 1, -1);
        }
        if (c0053g.f142s.isEmpty()) {
            return null;
        }
        return new e(c0053g.f142s.get(0), j10 + 1, 0);
    }

    /* renamed from: i */
    public static List<C0053g.e> m23943i(C0053g c0053g, long j10, int i10) {
        int i11 = (int) (j10 - c0053g.f134k);
        if (i11 < 0 || c0053g.f141r.size() < i11) {
            return AbstractC2651u.m10770u();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < c0053g.f141r.size()) {
            if (i10 != -1) {
                C0053g.d dVar = c0053g.f141r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f152t.size()) {
                    List<C0053g.b> list = dVar.f152t;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<C0053g.d> list2 = c0053g.f141r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (c0053g.f137n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < c0053g.f142s.size()) {
                List<C0053g.b> list3 = c0053g.f142s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public InterfaceC5275o[] m23944a(C5979j c5979j, long j10) {
        int i10;
        int m19445c = c5979j == null ? -1 : this.f22195h.m19445c(c5979j.f19969d);
        int length = this.f22204q.length();
        InterfaceC5275o[] interfaceC5275oArr = new InterfaceC5275o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int mo14088d = this.f22204q.mo14088d(i11);
            Uri uri = this.f22192e[mo14088d];
            if (this.f22194g.mo209a(uri)) {
                C0053g mo221m = this.f22194g.mo221m(uri, z10);
                C4014a.m15199e(mo221m);
                long mo212d = mo221m.f131h - this.f22194g.mo212d();
                i10 = i11;
                Pair<Long, Integer> m23948f = m23948f(c5979j, mo14088d != m19445c ? true : z10, mo221m, mo212d, j10);
                interfaceC5275oArr[i10] = new c(mo221m.f190a, mo212d, m23943i(mo221m, ((Long) m23948f.first).longValue(), ((Integer) m23948f.second).intValue()));
            } else {
                interfaceC5275oArr[i11] = InterfaceC5275o.f20018a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return interfaceC5275oArr;
    }

    /* renamed from: b */
    public long m23945b(long j10, C4465m3 c4465m3) {
        int mo14061g = this.f22204q.mo14061g();
        Uri[] uriArr = this.f22192e;
        C0053g mo221m = (mo14061g >= uriArr.length || mo14061g == -1) ? null : this.f22194g.mo221m(uriArr[this.f22204q.mo14092n()], true);
        if (mo221m == null || mo221m.f141r.isEmpty() || !mo221m.f192c) {
            return j10;
        }
        long mo212d = mo221m.f131h - this.f22194g.mo212d();
        long j11 = j10 - mo212d;
        int m15455f = C4041n0.m15455f(mo221m.f141r, Long.valueOf(j11), true, true);
        long j12 = mo221m.f141r.get(m15455f).f157l;
        return c4465m3.m17482a(j11, j12, m15455f != mo221m.f141r.size() - 1 ? mo221m.f141r.get(m15455f + 1).f157l : j12) + mo212d;
    }

    /* renamed from: c */
    public int m23946c(C5979j c5979j) {
        if (c5979j.f22240o == -1) {
            return 1;
        }
        C0053g c0053g = (C0053g) C4014a.m15199e(this.f22194g.mo221m(this.f22192e[this.f22195h.m19445c(c5979j.f19969d)], false));
        int i10 = (int) (c5979j.f20017j - c0053g.f134k);
        if (i10 < 0) {
            return 1;
        }
        List<C0053g.b> list = i10 < c0053g.f141r.size() ? c0053g.f141r.get(i10).f152t : c0053g.f142s;
        if (c5979j.f22240o >= list.size()) {
            return 2;
        }
        C0053g.b bVar = list.get(c5979j.f22240o);
        if (bVar.f147t) {
            return 0;
        }
        return C4041n0.m15449c(Uri.parse(C4037l0.m15387d(c0053g.f190a, bVar.f153h)), c5979j.f19967b.f14071a) ? 1 : 2;
    }

    /* renamed from: e */
    public void m23947e(long j10, long j11, List<C5979j> list, boolean z10, b bVar) {
        C0053g c0053g;
        long j12;
        Uri uri;
        int i10;
        C5979j c5979j = list.isEmpty() ? null : (C5979j) C2610b0.m10505d(list);
        int m19445c = c5979j == null ? -1 : this.f22195h.m19445c(c5979j.f19969d);
        long j13 = j11 - j10;
        long m23959s = m23959s(j10);
        if (c5979j != null && !this.f22203p) {
            long m21319d = c5979j.m21319d();
            j13 = Math.max(0L, j13 - m21319d);
            if (m23959s != -9223372036854775807L) {
                m23959s = Math.max(0L, m23959s - m21319d);
            }
        }
        this.f22204q.mo14062j(j10, j13, m23959s, list, m23944a(c5979j, j11));
        int mo14092n = this.f22204q.mo14092n();
        boolean z11 = m19445c != mo14092n;
        Uri uri2 = this.f22192e[mo14092n];
        if (!this.f22194g.mo209a(uri2)) {
            bVar.f22210c = uri2;
            this.f22206s &= uri2.equals(this.f22202o);
            this.f22202o = uri2;
            return;
        }
        C0053g mo221m = this.f22194g.mo221m(uri2, true);
        C4014a.m15199e(mo221m);
        this.f22203p = mo221m.f192c;
        m23963w(mo221m);
        long mo212d = mo221m.f131h - this.f22194g.mo212d();
        Pair<Long, Integer> m23948f = m23948f(c5979j, z11, mo221m, mo212d, j11);
        long longValue = ((Long) m23948f.first).longValue();
        int intValue = ((Integer) m23948f.second).intValue();
        if (longValue >= mo221m.f134k || c5979j == null || !z11) {
            c0053g = mo221m;
            j12 = mo212d;
            uri = uri2;
            i10 = mo14092n;
        } else {
            Uri uri3 = this.f22192e[m19445c];
            C0053g mo221m2 = this.f22194g.mo221m(uri3, true);
            C4014a.m15199e(mo221m2);
            j12 = mo221m2.f131h - this.f22194g.mo212d();
            Pair<Long, Integer> m23948f2 = m23948f(c5979j, false, mo221m2, j12, j11);
            longValue = ((Long) m23948f2.first).longValue();
            intValue = ((Integer) m23948f2.second).intValue();
            i10 = m19445c;
            uri = uri3;
            c0053g = mo221m2;
        }
        if (longValue < c0053g.f134k) {
            this.f22201n = new C4846b();
            return;
        }
        e m23942g = m23942g(c0053g, longValue, intValue);
        if (m23942g == null) {
            if (!c0053g.f138o) {
                bVar.f22210c = uri;
                this.f22206s &= uri.equals(this.f22202o);
                this.f22202o = uri;
                return;
            } else {
                if (z10 || c0053g.f141r.isEmpty()) {
                    bVar.f22209b = true;
                    return;
                }
                m23942g = new e((C0053g.e) C2610b0.m10505d(c0053g.f141r), (c0053g.f134k + c0053g.f141r.size()) - 1, -1);
            }
        }
        this.f22206s = false;
        this.f22202o = null;
        Uri m23941d = m23941d(c0053g, m23942g.f22215a.f154i);
        AbstractC5266f m23952l = m23952l(m23941d, i10);
        bVar.f22208a = m23952l;
        if (m23952l != null) {
            return;
        }
        Uri m23941d2 = m23941d(c0053g, m23942g.f22215a);
        AbstractC5266f m23952l2 = m23952l(m23941d2, i10);
        bVar.f22208a = m23952l2;
        if (m23952l2 != null) {
            return;
        }
        boolean m23970w = C5979j.m23970w(c5979j, uri, c0053g, m23942g, j12);
        if (m23970w && m23942g.f22218d) {
            return;
        }
        bVar.f22208a = C5979j.m23967j(this.f22188a, this.f22189b, this.f22193f[i10], j12, c0053g, m23942g, uri, this.f22196i, this.f22204q.mo14065p(), this.f22204q.mo14067r(), this.f22199l, this.f22191d, c5979j, this.f22197j.m23938a(m23941d2), this.f22197j.m23938a(m23941d), m23970w, this.f22198k);
    }

    /* renamed from: f */
    public final Pair<Long, Integer> m23948f(C5979j c5979j, boolean z10, C0053g c0053g, long j10, long j11) {
        if (c5979j != null && !z10) {
            if (!c5979j.mo21353h()) {
                return new Pair<>(Long.valueOf(c5979j.f20017j), Integer.valueOf(c5979j.f22240o));
            }
            Long valueOf = Long.valueOf(c5979j.f22240o == -1 ? c5979j.mo21352g() : c5979j.f20017j);
            int i10 = c5979j.f22240o;
            return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = c0053g.f144u + j10;
        if (c5979j != null && !this.f22203p) {
            j11 = c5979j.f19972g;
        }
        if (!c0053g.f138o && j11 >= j12) {
            return new Pair<>(Long.valueOf(c0053g.f134k + c0053g.f141r.size()), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int m15455f = C4041n0.m15455f(c0053g.f141r, Long.valueOf(j13), true, !this.f22194g.mo213e() || c5979j == null);
        long j14 = m15455f + c0053g.f134k;
        if (m15455f >= 0) {
            C0053g.d dVar = c0053g.f141r.get(m15455f);
            List<C0053g.b> list = j13 < dVar.f157l + dVar.f155j ? dVar.f152t : c0053g.f142s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                C0053g.b bVar = list.get(i11);
                if (j13 >= bVar.f157l + bVar.f155j) {
                    i11++;
                } else if (bVar.f146s) {
                    j14 += list == c0053g.f142s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
    }

    /* renamed from: h */
    public int m23949h(long j10, List<? extends AbstractC5274n> list) {
        return (this.f22201n != null || this.f22204q.length() < 2) ? list.size() : this.f22204q.mo14064m(j10, list);
    }

    /* renamed from: j */
    public C4881s0 m23950j() {
        return this.f22195h;
    }

    /* renamed from: k */
    public InterfaceC3752s m23951k() {
        return this.f22204q;
    }

    /* renamed from: l */
    public final AbstractC5266f m23952l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] m23940c = this.f22197j.m23940c(uri);
        if (m23940c != null) {
            this.f22197j.m23939b(uri, m23940c);
            return null;
        }
        return new a(this.f22190c, new C3918n.b().m14866i(uri).m14859b(1).m14858a(), this.f22193f[i10], this.f22204q.mo14065p(), this.f22204q.mo14067r(), this.f22200m);
    }

    /* renamed from: m */
    public boolean m23953m(AbstractC5266f abstractC5266f, long j10) {
        InterfaceC3752s interfaceC3752s = this.f22204q;
        return interfaceC3752s.mo14090h(interfaceC3752s.mo14089e(this.f22195h.m19445c(abstractC5266f.f19969d)), j10);
    }

    /* renamed from: n */
    public void m23954n() {
        IOException iOException = this.f22201n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f22202o;
        if (uri == null || !this.f22206s) {
            return;
        }
        this.f22194g.mo211c(uri);
    }

    /* renamed from: o */
    public boolean m23955o(Uri uri) {
        return C4041n0.m15481s(this.f22192e, uri);
    }

    /* renamed from: p */
    public void m23956p(AbstractC5266f abstractC5266f) {
        if (abstractC5266f instanceof a) {
            a aVar = (a) abstractC5266f;
            this.f22200m = aVar.m21356h();
            this.f22197j.m23939b(aVar.f19967b.f14071a, (byte[]) C4014a.m15199e(aVar.m23964j()));
        }
    }

    /* renamed from: q */
    public boolean m23957q(Uri uri, long j10) {
        int mo14089e;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f22192e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (mo14089e = this.f22204q.mo14089e(i10)) == -1) {
            return true;
        }
        this.f22206s |= uri.equals(this.f22202o);
        return j10 == -9223372036854775807L || (this.f22204q.mo14090h(mo14089e, j10) && this.f22194g.mo215g(uri, j10));
    }

    /* renamed from: r */
    public void m23958r() {
        this.f22201n = null;
    }

    /* renamed from: s */
    public final long m23959s(long j10) {
        long j11 = this.f22205r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    /* renamed from: t */
    public void m23960t(boolean z10) {
        this.f22199l = z10;
    }

    /* renamed from: u */
    public void m23961u(InterfaceC3752s interfaceC3752s) {
        this.f22204q = interfaceC3752s;
    }

    /* renamed from: v */
    public boolean m23962v(long j10, AbstractC5266f abstractC5266f, List<? extends AbstractC5274n> list) {
        if (this.f22201n != null) {
            return false;
        }
        return this.f22204q.m14239t(j10, abstractC5266f, list);
    }

    /* renamed from: w */
    public final void m23963w(C0053g c0053g) {
        this.f22205r = c0053g.f138o ? -9223372036854775807L : c0053g.m251e() - this.f22194g.mo212d();
    }
}
