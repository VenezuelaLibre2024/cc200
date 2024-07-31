package p365z4;

import android.net.Uri;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p007a5.C0054h;
import p007a5.InterfaceC0058l;
import p152k4.C3348a;
import p155k7.C3368e;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p275t3.C4674s1;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4871n0;
import p290u4.InterfaceC4878r;
import p317w3.C5247m;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p365z4.C5986q;

/* renamed from: z4.l */
/* loaded from: classes.dex */
public final class C5981l implements InterfaceC4878r, InterfaceC0058l.b {

    /* renamed from: A */
    public C4885u0 f22252A;

    /* renamed from: E */
    public int f22256E;

    /* renamed from: F */
    public InterfaceC4871n0 f22257F;

    /* renamed from: h */
    public final InterfaceC5977h f22258h;

    /* renamed from: i */
    public final InterfaceC0058l f22259i;

    /* renamed from: j */
    public final InterfaceC5976g f22260j;

    /* renamed from: k */
    public final InterfaceC3917m0 f22261k;

    /* renamed from: l */
    public final InterfaceC5256v f22262l;

    /* renamed from: m */
    public final InterfaceC5255u.a f22263m;

    /* renamed from: n */
    public final InterfaceC3899d0 f22264n;

    /* renamed from: o */
    public final InterfaceC4845a0.a f22265o;

    /* renamed from: p */
    public final InterfaceC3894b f22266p;

    /* renamed from: s */
    public final InterfaceC4858h f22269s;

    /* renamed from: t */
    public final boolean f22270t;

    /* renamed from: u */
    public final int f22271u;

    /* renamed from: v */
    public final boolean f22272v;

    /* renamed from: w */
    public final C4674s1 f22273w;

    /* renamed from: y */
    public InterfaceC4878r.a f22275y;

    /* renamed from: z */
    public int f22276z;

    /* renamed from: x */
    public final C5986q.b f22274x = new b();

    /* renamed from: q */
    public final IdentityHashMap<InterfaceC4869m0, Integer> f22267q = new IdentityHashMap<>();

    /* renamed from: r */
    public final C5989t f22268r = new C5989t();

    /* renamed from: B */
    public C5986q[] f22253B = new C5986q[0];

    /* renamed from: C */
    public C5986q[] f22254C = new C5986q[0];

    /* renamed from: D */
    public int[][] f22255D = new int[0];

    /* renamed from: z4.l$b */
    /* loaded from: classes.dex */
    public class b implements C5986q.b {
        public b() {
        }

        @Override // p365z4.C5986q.b
        /* renamed from: a */
        public void mo23994a() {
            if (C5981l.m23981h(C5981l.this) > 0) {
                return;
            }
            int i10 = 0;
            for (C5986q c5986q : C5981l.this.f22253B) {
                i10 += c5986q.m24046s().f18478h;
            }
            C4881s0[] c4881s0Arr = new C4881s0[i10];
            int i11 = 0;
            for (C5986q c5986q2 : C5981l.this.f22253B) {
                int i12 = c5986q2.m24046s().f18478h;
                int i13 = 0;
                while (i13 < i12) {
                    c4881s0Arr[i11] = c5986q2.m24046s().m19452b(i13);
                    i13++;
                    i11++;
                }
            }
            C5981l.this.f22252A = new C4885u0(c4881s0Arr);
            C5981l.this.f22275y.mo17309k(C5981l.this);
        }

        @Override // p290u4.InterfaceC4871n0.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4788e(C5986q c5986q) {
            C5981l.this.f22275y.mo4788e(C5981l.this);
        }

        @Override // p365z4.C5986q.b
        /* renamed from: j */
        public void mo23996j(Uri uri) {
            C5981l.this.f22259i.mo218j(uri);
        }
    }

    public C5981l(InterfaceC5977h interfaceC5977h, InterfaceC0058l interfaceC0058l, InterfaceC5976g interfaceC5976g, InterfaceC3917m0 interfaceC3917m0, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar2, InterfaceC3894b interfaceC3894b, InterfaceC4858h interfaceC4858h, boolean z10, int i10, boolean z11, C4674s1 c4674s1) {
        this.f22258h = interfaceC5977h;
        this.f22259i = interfaceC0058l;
        this.f22260j = interfaceC5976g;
        this.f22261k = interfaceC3917m0;
        this.f22262l = interfaceC5256v;
        this.f22263m = aVar;
        this.f22264n = interfaceC3899d0;
        this.f22265o = aVar2;
        this.f22266p = interfaceC3894b;
        this.f22269s = interfaceC4858h;
        this.f22270t = z10;
        this.f22271u = i10;
        this.f22272v = z11;
        this.f22273w = c4674s1;
        this.f22257F = interfaceC4858h.mo19317a(new InterfaceC4871n0[0]);
    }

    /* renamed from: h */
    public static /* synthetic */ int m23981h(C5981l c5981l) {
        int i10 = c5981l.f22276z - 1;
        c5981l.f22276z = i10;
        return i10;
    }

    /* renamed from: x */
    public static C4463m1 m23986x(C4463m1 c4463m1, C4463m1 c4463m12, boolean z10) {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        C3348a c3348a;
        int i12;
        if (c4463m12 != null) {
            str2 = c4463m12.f16503p;
            c3348a = c4463m12.f16504q;
            int i13 = c4463m12.f16485F;
            i10 = c4463m12.f16498k;
            int i14 = c4463m12.f16499l;
            String str4 = c4463m12.f16497j;
            str3 = c4463m12.f16496i;
            i11 = i13;
            i12 = i14;
            str = str4;
        } else {
            String m15415L = C4041n0.m15415L(c4463m1.f16503p, 1);
            C3348a c3348a2 = c4463m1.f16504q;
            if (z10) {
                int i15 = c4463m1.f16485F;
                int i16 = c4463m1.f16498k;
                int i17 = c4463m1.f16499l;
                str = c4463m1.f16497j;
                str2 = m15415L;
                str3 = c4463m1.f16496i;
                i11 = i15;
                i10 = i16;
                c3348a = c3348a2;
                i12 = i17;
            } else {
                str = null;
                i10 = 0;
                i11 = -1;
                str2 = m15415L;
                str3 = null;
                c3348a = c3348a2;
                i12 = 0;
            }
        }
        return new C4463m1.b().m17462U(c4463m1.f16495h).m17464W(str3).m17454M(c4463m1.f16505r).m17474g0(C4050v.m15550g(str2)).m17452K(str2).m17467Z(c3348a).m17450I(z10 ? c4463m1.f16500m : -1).m17469b0(z10 ? c4463m1.f16501n : -1).m17451J(i11).m17476i0(i10).m17472e0(i12).m17465X(str).m17448G();
    }

    /* renamed from: y */
    public static Map<String, C5247m> m23987y(List<C5247m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C5247m c5247m = list.get(i10);
            String str = c5247m.f19907j;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                C5247m c5247m2 = (C5247m) arrayList.get(i11);
                if (TextUtils.equals(c5247m2.f19907j, str)) {
                    c5247m = c5247m.m21260g(c5247m2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, c5247m);
        }
        return hashMap;
    }

    /* renamed from: z */
    public static C4463m1 m23988z(C4463m1 c4463m1) {
        String m15415L = C4041n0.m15415L(c4463m1.f16503p, 2);
        return new C4463m1.b().m17462U(c4463m1.f16495h).m17464W(c4463m1.f16496i).m17454M(c4463m1.f16505r).m17474g0(C4050v.m15550g(m15415L)).m17452K(m15415L).m17467Z(c4463m1.f16504q).m17450I(c4463m1.f16500m).m17469b0(c4463m1.f16501n).m17481n0(c4463m1.f16511x).m17460S(c4463m1.f16512y).m17459R(c4463m1.f16513z).m17476i0(c4463m1.f16498k).m17472e0(c4463m1.f16499l).m17448G();
    }

    /* renamed from: A */
    public void m23989A() {
        this.f22259i.mo216h(this);
        for (C5986q c5986q : this.f22253B) {
            c5986q.m24033e0();
        }
        this.f22275y = null;
    }

    @Override // p007a5.InterfaceC0058l.b
    /* renamed from: a */
    public void mo224a() {
        for (C5986q c5986q : this.f22253B) {
            c5986q.m24028a0();
        }
        this.f22275y.mo4788e(this);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        return this.f22257F.mo4785b();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        if (this.f22252A != null) {
            return this.f22257F.mo4786c(j10);
        }
        for (C5986q c5986q : this.f22253B) {
            c5986q.m24007A();
        }
        return false;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        for (C5986q c5986q : this.f22254C) {
            if (c5986q.m24018Q()) {
                return c5986q.m24031d(j10, c4465m3);
            }
        }
        return j10;
    }

    @Override // p007a5.InterfaceC0058l.b
    /* renamed from: e */
    public boolean mo225e(Uri uri, InterfaceC3899d0.c cVar, boolean z10) {
        boolean z11 = true;
        for (C5986q c5986q : this.f22253B) {
            z11 &= c5986q.m24027Z(uri, cVar, z10);
        }
        this.f22275y.mo4788e(this);
        return z11;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        return this.f22257F.mo4789f();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        this.f22257F.mo4790g(j10);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f22275y = aVar;
        this.f22259i.mo210b(this);
        m23992v(j10);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f22257F.isLoading();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        for (C5986q c5986q : this.f22253B) {
            c5986q.m24040l();
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    public long mo4794m(long j10) {
        C5986q[] c5986qArr = this.f22254C;
        if (c5986qArr.length > 0) {
            boolean m24036h0 = c5986qArr[0].m24036h0(j10, false);
            int i10 = 1;
            while (true) {
                C5986q[] c5986qArr2 = this.f22254C;
                if (i10 >= c5986qArr2.length) {
                    break;
                }
                c5986qArr2[i10].m24036h0(j10, m24036h0);
                i10++;
            }
            if (m24036h0) {
                this.f22268r.m24063b();
            }
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: p */
    public long mo4795p() {
        return -9223372036854775807L;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: q */
    public long mo4796q(InterfaceC3752s[] interfaceC3752sArr, boolean[] zArr, InterfaceC4869m0[] interfaceC4869m0Arr, boolean[] zArr2, long j10) {
        InterfaceC4869m0[] interfaceC4869m0Arr2 = interfaceC4869m0Arr;
        int[] iArr = new int[interfaceC3752sArr.length];
        int[] iArr2 = new int[interfaceC3752sArr.length];
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            iArr[i10] = interfaceC4869m0Arr2[i10] == null ? -1 : this.f22267q.get(interfaceC4869m0Arr2[i10]).intValue();
            iArr2[i10] = -1;
            if (interfaceC3752sArr[i10] != null) {
                C4881s0 mo14086b = interfaceC3752sArr[i10].mo14086b();
                int i11 = 0;
                while (true) {
                    C5986q[] c5986qArr = this.f22253B;
                    if (i11 >= c5986qArr.length) {
                        break;
                    }
                    if (c5986qArr[i11].m24046s().m19453c(mo14086b) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f22267q.clear();
        int length = interfaceC3752sArr.length;
        InterfaceC4869m0[] interfaceC4869m0Arr3 = new InterfaceC4869m0[length];
        InterfaceC4869m0[] interfaceC4869m0Arr4 = new InterfaceC4869m0[interfaceC3752sArr.length];
        InterfaceC3752s[] interfaceC3752sArr2 = new InterfaceC3752s[interfaceC3752sArr.length];
        C5986q[] c5986qArr2 = new C5986q[this.f22253B.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f22253B.length) {
            for (int i14 = 0; i14 < interfaceC3752sArr.length; i14++) {
                InterfaceC3752s interfaceC3752s = null;
                interfaceC4869m0Arr4[i14] = iArr[i14] == i13 ? interfaceC4869m0Arr2[i14] : null;
                if (iArr2[i14] == i13) {
                    interfaceC3752s = interfaceC3752sArr[i14];
                }
                interfaceC3752sArr2[i14] = interfaceC3752s;
            }
            C5986q c5986q = this.f22253B[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            InterfaceC3752s[] interfaceC3752sArr3 = interfaceC3752sArr2;
            C5986q[] c5986qArr3 = c5986qArr2;
            boolean m24037i0 = c5986q.m24037i0(interfaceC3752sArr2, zArr, interfaceC4869m0Arr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= interfaceC3752sArr.length) {
                    break;
                }
                InterfaceC4869m0 interfaceC4869m0 = interfaceC4869m0Arr4[i18];
                if (iArr2[i18] == i17) {
                    C4014a.m15199e(interfaceC4869m0);
                    interfaceC4869m0Arr3[i18] = interfaceC4869m0;
                    this.f22267q.put(interfaceC4869m0, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    C4014a.m15200f(interfaceC4869m0 == null);
                }
                i18++;
            }
            if (z11) {
                c5986qArr3[i15] = c5986q;
                i12 = i15 + 1;
                if (i15 == 0) {
                    c5986q.m24041l0(true);
                    if (!m24037i0) {
                        C5986q[] c5986qArr4 = this.f22254C;
                        if (c5986qArr4.length != 0 && c5986q == c5986qArr4[0]) {
                        }
                    }
                    this.f22268r.m24063b();
                    z10 = true;
                } else {
                    c5986q.m24041l0(i17 < this.f22256E);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            c5986qArr2 = c5986qArr3;
            length = i16;
            interfaceC3752sArr2 = interfaceC3752sArr3;
            interfaceC4869m0Arr2 = interfaceC4869m0Arr;
        }
        System.arraycopy(interfaceC4869m0Arr3, 0, interfaceC4869m0Arr2, 0, length);
        C5986q[] c5986qArr5 = (C5986q[]) C4041n0.m15406G0(c5986qArr2, i12);
        this.f22254C = c5986qArr5;
        this.f22257F = this.f22269s.mo19317a(c5986qArr5);
        return j10;
    }

    /* renamed from: r */
    public final void m23990r(long j10, List<C0054h.a> list, List<C5986q> list2, List<int[]> list3, Map<String, C5247m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f183d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (C4041n0.m15449c(str, list.get(i11).f183d)) {
                        C0054h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f180a);
                        arrayList2.add(aVar.f181b);
                        z10 &= C4041n0.m15413K(aVar.f181b.f16503p, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                C5986q m23993w = m23993w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) C4041n0.m15465k(new Uri[0])), (C4463m1[]) arrayList2.toArray(new C4463m1[0]), null, Collections.emptyList(), map, j10);
                list3.add(C3368e.m12533l(arrayList3));
                list2.add(m23993w);
                if (this.f22270t && z10) {
                    m23993w.m24030c0(new C4881s0[]{new C4881s0(str2, (C4463m1[]) arrayList2.toArray(new C4463m1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        return (C4885u0) C4014a.m15199e(this.f22252A);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        for (C5986q c5986q : this.f22254C) {
            c5986q.m24047t(j10, z10);
        }
    }

    /* renamed from: u */
    public final void m23991u(C0054h c0054h, long j10, List<C5986q> list, List<int[]> list2, Map<String, C5247m> map) {
        boolean z10;
        boolean z11;
        int size = c0054h.f171e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < c0054h.f171e.size(); i12++) {
            C4463m1 c4463m1 = c0054h.f171e.get(i12).f185b;
            if (c4463m1.f16512y > 0 || C4041n0.m15415L(c4463m1.f16503p, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (C4041n0.m15415L(c4463m1.f16503p, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        C4463m1[] c4463m1Arr = new C4463m1[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < c0054h.f171e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                C0054h.b bVar = c0054h.f171e.get(i14);
                uriArr[i13] = bVar.f184a;
                c4463m1Arr[i13] = bVar.f185b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = c4463m1Arr[0].f16503p;
        int m15413K = C4041n0.m15413K(str, 2);
        int m15413K2 = C4041n0.m15413K(str, 1);
        boolean z12 = (m15413K2 == 1 || (m15413K2 == 0 && c0054h.f173g.isEmpty())) && m15413K <= 1 && m15413K2 + m15413K > 0;
        C5986q m23993w = m23993w(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, (z10 || m15413K2 <= 0) ? 0 : 1, uriArr, c4463m1Arr, c0054h.f176j, c0054h.f177k, map, j10);
        list.add(m23993w);
        list2.add(iArr2);
        if (this.f22270t && z12) {
            ArrayList arrayList = new ArrayList();
            if (m15413K > 0) {
                C4463m1[] c4463m1Arr2 = new C4463m1[size];
                for (int i15 = 0; i15 < size; i15++) {
                    c4463m1Arr2[i15] = m23988z(c4463m1Arr[i15]);
                }
                arrayList.add(new C4881s0(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, c4463m1Arr2));
                if (m15413K2 > 0 && (c0054h.f176j != null || c0054h.f173g.isEmpty())) {
                    arrayList.add(new C4881s0(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT + ":audio", m23986x(c4463m1Arr[0], c0054h.f176j, false)));
                }
                List<C4463m1> list3 = c0054h.f177k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new C4881s0(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT + ":cc:" + i16, list3.get(i16)));
                    }
                }
            } else {
                C4463m1[] c4463m1Arr3 = new C4463m1[size];
                for (int i17 = 0; i17 < size; i17++) {
                    c4463m1Arr3[i17] = m23986x(c4463m1Arr[i17], c0054h.f176j, true);
                }
                arrayList.add(new C4881s0(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT, c4463m1Arr3));
            }
            C4881s0 c4881s0 = new C4881s0(FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT + ":id3", new C4463m1.b().m17462U("ID3").m17474g0("application/id3").m17448G());
            arrayList.add(c4881s0);
            m23993w.m24030c0((C4881s0[]) arrayList.toArray(new C4881s0[0]), 0, arrayList.indexOf(c4881s0));
        }
    }

    /* renamed from: v */
    public final void m23992v(long j10) {
        C0054h c0054h = (C0054h) C4014a.m15199e(this.f22259i.mo214f());
        Map<String, C5247m> m23987y = this.f22272v ? m23987y(c0054h.f179m) : Collections.emptyMap();
        boolean z10 = !c0054h.f171e.isEmpty();
        List<C0054h.a> list = c0054h.f173g;
        List<C0054h.a> list2 = c0054h.f174h;
        this.f22276z = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            m23991u(c0054h, j10, arrayList, arrayList2, m23987y);
        }
        m23990r(j10, list, arrayList, arrayList2, m23987y);
        this.f22256E = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            C0054h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f183d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            C5986q m23993w = m23993w(str, 3, new Uri[]{aVar.f180a}, new C4463m1[]{aVar.f181b}, null, Collections.emptyList(), m23987y, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(m23993w);
            m23993w.m24030c0(new C4881s0[]{new C4881s0(str, aVar.f181b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f22253B = (C5986q[]) arrayList.toArray(new C5986q[0]);
        this.f22255D = (int[][]) arrayList2.toArray(new int[0]);
        this.f22276z = this.f22253B.length;
        for (int i12 = 0; i12 < this.f22256E; i12++) {
            this.f22253B[i12].m24041l0(true);
        }
        for (C5986q c5986q : this.f22253B) {
            c5986q.m24007A();
        }
        this.f22254C = this.f22253B;
    }

    /* renamed from: w */
    public final C5986q m23993w(String str, int i10, Uri[] uriArr, C4463m1[] c4463m1Arr, C4463m1 c4463m1, List<C4463m1> list, Map<String, C5247m> map, long j10) {
        return new C5986q(str, i10, this.f22274x, new C5975f(this.f22258h, this.f22259i, uriArr, c4463m1Arr, this.f22260j, this.f22261k, this.f22268r, list, this.f22273w), map, this.f22266p, j10, c4463m1, this.f22262l, this.f22263m, this.f22264n, this.f22265o, this.f22271u);
    }
}
