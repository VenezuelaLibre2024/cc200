package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.C1153d;
import com.google.android.exoplayer2.source.dash.InterfaceC1150a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p155k7.C3368e;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3917m0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p275t3.C4674s1;
import p290u4.C4864k;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4871n0;
import p290u4.InterfaceC4878r;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p318w4.C5269i;
import p334x4.C5588b;
import p334x4.C5595i;
import p350y4.AbstractC5809j;
import p350y4.C5800a;
import p350y4.C5802c;
import p350y4.C5804e;
import p350y4.C5805f;
import p350y4.C5806g;

/* renamed from: com.google.android.exoplayer2.source.dash.b */
/* loaded from: classes.dex */
public final class C1151b implements InterfaceC4878r, InterfaceC4871n0.a<C5269i<InterfaceC1150a>>, C5269i.b<InterfaceC1150a> {

    /* renamed from: F */
    public static final Pattern f4222F = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: G */
    public static final Pattern f4223G = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: B */
    public InterfaceC4871n0 f4225B;

    /* renamed from: C */
    public C5802c f4226C;

    /* renamed from: D */
    public int f4227D;

    /* renamed from: E */
    public List<C5805f> f4228E;

    /* renamed from: h */
    public final int f4229h;

    /* renamed from: i */
    public final InterfaceC1150a.a f4230i;

    /* renamed from: j */
    public final InterfaceC3917m0 f4231j;

    /* renamed from: k */
    public final InterfaceC5256v f4232k;

    /* renamed from: l */
    public final InterfaceC3899d0 f4233l;

    /* renamed from: m */
    public final C5588b f4234m;

    /* renamed from: n */
    public final long f4235n;

    /* renamed from: o */
    public final InterfaceC3903f0 f4236o;

    /* renamed from: p */
    public final InterfaceC3894b f4237p;

    /* renamed from: q */
    public final C4885u0 f4238q;

    /* renamed from: r */
    public final a[] f4239r;

    /* renamed from: s */
    public final InterfaceC4858h f4240s;

    /* renamed from: t */
    public final C1153d f4241t;

    /* renamed from: v */
    public final InterfaceC4845a0.a f4243v;

    /* renamed from: w */
    public final InterfaceC5255u.a f4244w;

    /* renamed from: x */
    public final C4674s1 f4245x;

    /* renamed from: y */
    public InterfaceC4878r.a f4246y;

    /* renamed from: z */
    public C5269i<InterfaceC1150a>[] f4247z = m4767E(0);

    /* renamed from: A */
    public C5595i[] f4224A = new C5595i[0];

    /* renamed from: u */
    public final IdentityHashMap<C5269i<InterfaceC1150a>, C1153d.c> f4242u = new IdentityHashMap<>();

    /* renamed from: com.google.android.exoplayer2.source.dash.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int[] f4248a;

        /* renamed from: b */
        public final int f4249b;

        /* renamed from: c */
        public final int f4250c;

        /* renamed from: d */
        public final int f4251d;

        /* renamed from: e */
        public final int f4252e;

        /* renamed from: f */
        public final int f4253f;

        /* renamed from: g */
        public final int f4254g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f4249b = i10;
            this.f4248a = iArr;
            this.f4250c = i11;
            this.f4252e = i12;
            this.f4253f = i13;
            this.f4254g = i14;
            this.f4251d = i15;
        }

        /* renamed from: a */
        public static a m4800a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        /* renamed from: b */
        public static a m4801b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        /* renamed from: c */
        public static a m4802c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        /* renamed from: d */
        public static a m4803d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public C1151b(int i10, C5802c c5802c, C5588b c5588b, int i11, InterfaceC1150a.a aVar, InterfaceC3917m0 interfaceC3917m0, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar2, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar3, long j10, InterfaceC3903f0 interfaceC3903f0, InterfaceC3894b interfaceC3894b, InterfaceC4858h interfaceC4858h, C1153d.b bVar, C4674s1 c4674s1) {
        this.f4229h = i10;
        this.f4226C = c5802c;
        this.f4234m = c5588b;
        this.f4227D = i11;
        this.f4230i = aVar;
        this.f4231j = interfaceC3917m0;
        this.f4232k = interfaceC5256v;
        this.f4244w = aVar2;
        this.f4233l = interfaceC3899d0;
        this.f4243v = aVar3;
        this.f4235n = j10;
        this.f4236o = interfaceC3903f0;
        this.f4237p = interfaceC3894b;
        this.f4240s = interfaceC4858h;
        this.f4245x = c4674s1;
        this.f4241t = new C1153d(c5802c, bVar, interfaceC3894b);
        this.f4225B = interfaceC4858h.mo19317a(this.f4247z);
        C5806g m23279d = c5802c.m23279d(i11);
        List<C5805f> list = m23279d.f21797d;
        this.f4228E = list;
        Pair<C4885u0, a[]> m4771u = m4771u(interfaceC5256v, m23279d.f21796c, list);
        this.f4238q = (C4885u0) m4771u.first;
        this.f4239r = (a[]) m4771u.second;
    }

    /* renamed from: C */
    public static boolean m4765C(List<C5800a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<AbstractC5809j> list2 = list.get(i10).f21751c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f21812e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public static int m4766D(int i10, List<C5800a> list, int[][] iArr, boolean[] zArr, C4463m1[][] c4463m1Arr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (m4765C(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            c4463m1Arr[i12] = m4775y(list, iArr[i12]);
            if (c4463m1Arr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: E */
    public static C5269i<InterfaceC1150a>[] m4767E(int i10) {
        return new C5269i[i10];
    }

    /* renamed from: G */
    public static C4463m1[] m4768G(C5804e c5804e, Pattern pattern, C4463m1 c4463m1) {
        String str = c5804e.f21787b;
        if (str == null) {
            return new C4463m1[]{c4463m1};
        }
        String[] m15426Q0 = C4041n0.m15426Q0(str, ";");
        C4463m1[] c4463m1Arr = new C4463m1[m15426Q0.length];
        for (int i10 = 0; i10 < m15426Q0.length; i10++) {
            Matcher matcher = pattern.matcher(m15426Q0[i10]);
            if (!matcher.matches()) {
                return new C4463m1[]{c4463m1};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            c4463m1Arr[i10] = c4463m1.m17411b().m17462U(c4463m1.f16495h + ":" + parseInt).m17449H(parseInt).m17465X(matcher.group(2)).m17448G();
        }
        return c4463m1Arr;
    }

    /* renamed from: n */
    public static void m4769n(List<C5805f> list, C4881s0[] c4881s0Arr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            C5805f c5805f = list.get(i11);
            c4881s0Arr[i10] = new C4881s0(c5805f.m23357a() + ":" + i11, new C4463m1.b().m17462U(c5805f.m23357a()).m17474g0("application/x-emsg").m17448G());
            aVarArr[i10] = a.m4802c(i11);
            i11++;
            i10++;
        }
    }

    /* renamed from: o */
    public static int m4770o(InterfaceC5256v interfaceC5256v, List<C5800a> list, int[][] iArr, int i10, boolean[] zArr, C4463m1[][] c4463m1Arr, C4881s0[] c4881s0Arr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f21751c);
            }
            int size = arrayList.size();
            C4463m1[] c4463m1Arr2 = new C4463m1[size];
            for (int i16 = 0; i16 < size; i16++) {
                C4463m1 c4463m1 = ((AbstractC5809j) arrayList.get(i16)).f21809b;
                c4463m1Arr2[i16] = c4463m1.m17412c(interfaceC5256v.mo21232e(c4463m1));
            }
            C5800a c5800a = list.get(iArr2[0]);
            int i17 = c5800a.f21749a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (c4463m1Arr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            c4881s0Arr[i14] = new C4881s0(num, c4463m1Arr2);
            aVarArr[i14] = a.m4803d(c5800a.f21750b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                c4881s0Arr[i18] = new C4881s0(str, new C4463m1.b().m17462U(str).m17474g0("application/x-emsg").m17448G());
                aVarArr[i18] = a.m4801b(iArr2, i14);
            }
            if (i11 != -1) {
                c4881s0Arr[i11] = new C4881s0(num + ":cc", c4463m1Arr[i13]);
                aVarArr[i11] = a.m4800a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    /* renamed from: u */
    public static Pair<C4885u0, a[]> m4771u(InterfaceC5256v interfaceC5256v, List<C5800a> list, List<C5805f> list2) {
        int[][] m4776z = m4776z(list);
        int length = m4776z.length;
        boolean[] zArr = new boolean[length];
        C4463m1[][] c4463m1Arr = new C4463m1[length];
        int m4766D = m4766D(length, list, m4776z, zArr, c4463m1Arr) + length + list2.size();
        C4881s0[] c4881s0Arr = new C4881s0[m4766D];
        a[] aVarArr = new a[m4766D];
        m4769n(list2, c4881s0Arr, aVarArr, m4770o(interfaceC5256v, list, m4776z, length, zArr, c4463m1Arr, c4881s0Arr, aVarArr));
        return Pair.create(new C4885u0(c4881s0Arr), aVarArr);
    }

    /* renamed from: v */
    public static C5804e m4772v(List<C5804e> list) {
        return m4773w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: w */
    public static C5804e m4773w(List<C5804e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5804e c5804e = list.get(i10);
            if (str.equals(c5804e.f21786a)) {
                return c5804e;
            }
        }
        return null;
    }

    /* renamed from: x */
    public static C5804e m4774x(List<C5804e> list) {
        return m4773w(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: y */
    public static C4463m1[] m4775y(List<C5800a> list, int[] iArr) {
        C4463m1 m17448G;
        Pattern pattern;
        for (int i10 : iArr) {
            C5800a c5800a = list.get(i10);
            List<C5804e> list2 = list.get(i10).f21752d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                C5804e c5804e = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c5804e.f21786a)) {
                    m17448G = new C4463m1.b().m17474g0("application/cea-608").m17462U(c5800a.f21749a + ":cea608").m17448G();
                    pattern = f4222F;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(c5804e.f21786a)) {
                    m17448G = new C4463m1.b().m17474g0("application/cea-708").m17462U(c5800a.f21749a + ":cea708").m17448G();
                    pattern = f4223G;
                }
                return m4768G(c5804e, pattern, m17448G);
            }
        }
        return new C4463m1[0];
    }

    /* renamed from: z */
    public static int[][] m4776z(List<C5800a> list) {
        int i10;
        C5804e m4772v;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f21749a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            C5800a c5800a = list.get(i12);
            C5804e m4774x = m4774x(c5800a.f21753e);
            if (m4774x == null) {
                m4774x = m4774x(c5800a.f21754f);
            }
            if (m4774x == null || (i10 = sparseIntArray.get(Integer.parseInt(m4774x.f21787b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (m4772v = m4772v(c5800a.f21754f)) != null) {
                for (String str : C4041n0.m15426Q0(m4772v.f21787b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = C3368e.m12533l((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    /* renamed from: A */
    public final int m4777A(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f4239r[i11].f4252e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f4239r[i14].f4250c == 0) {
                return i13;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final int[] m4778B(InterfaceC3752s[] interfaceC3752sArr) {
        int[] iArr = new int[interfaceC3752sArr.length];
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            if (interfaceC3752sArr[i10] != null) {
                iArr[i10] = this.f4238q.m19453c(interfaceC3752sArr[i10].mo14086b());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    @Override // p290u4.InterfaceC4871n0.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo4788e(C5269i<InterfaceC1150a> c5269i) {
        this.f4246y.mo4788e(this);
    }

    /* renamed from: H */
    public void m4780H() {
        this.f4241t.m4848o();
        for (C5269i<InterfaceC1150a> c5269i : this.f4247z) {
            c5269i.m21344P(this);
        }
        this.f4246y = null;
    }

    /* renamed from: I */
    public final void m4781I(InterfaceC3752s[] interfaceC3752sArr, boolean[] zArr, InterfaceC4869m0[] interfaceC4869m0Arr) {
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            if (interfaceC3752sArr[i10] == null || !zArr[i10]) {
                if (interfaceC4869m0Arr[i10] instanceof C5269i) {
                    ((C5269i) interfaceC4869m0Arr[i10]).m21344P(this);
                } else if (interfaceC4869m0Arr[i10] instanceof C5269i.a) {
                    ((C5269i.a) interfaceC4869m0Arr[i10]).m21351c();
                }
                interfaceC4869m0Arr[i10] = null;
            }
        }
    }

    /* renamed from: J */
    public final void m4782J(InterfaceC3752s[] interfaceC3752sArr, InterfaceC4869m0[] interfaceC4869m0Arr, int[] iArr) {
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            if ((interfaceC4869m0Arr[i10] instanceof C4864k) || (interfaceC4869m0Arr[i10] instanceof C5269i.a)) {
                int m4777A = m4777A(i10, iArr);
                if (!(m4777A == -1 ? interfaceC4869m0Arr[i10] instanceof C4864k : (interfaceC4869m0Arr[i10] instanceof C5269i.a) && ((C5269i.a) interfaceC4869m0Arr[i10]).f20000h == interfaceC4869m0Arr[m4777A])) {
                    if (interfaceC4869m0Arr[i10] instanceof C5269i.a) {
                        ((C5269i.a) interfaceC4869m0Arr[i10]).m21351c();
                    }
                    interfaceC4869m0Arr[i10] = null;
                }
            }
        }
    }

    /* renamed from: K */
    public final void m4783K(InterfaceC3752s[] interfaceC3752sArr, InterfaceC4869m0[] interfaceC4869m0Arr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            InterfaceC3752s interfaceC3752s = interfaceC3752sArr[i10];
            if (interfaceC3752s != null) {
                if (interfaceC4869m0Arr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f4239r[iArr[i10]];
                    int i11 = aVar.f4250c;
                    if (i11 == 0) {
                        interfaceC4869m0Arr[i10] = m4797r(aVar, interfaceC3752s, j10);
                    } else if (i11 == 2) {
                        interfaceC4869m0Arr[i10] = new C5595i(this.f4228E.get(aVar.f4251d), interfaceC3752s.mo14086b().m19444b(0), this.f4226C.f21762d);
                    }
                } else if (interfaceC4869m0Arr[i10] instanceof C5269i) {
                    ((InterfaceC1150a) ((C5269i) interfaceC4869m0Arr[i10]).m21332D()).mo4762b(interfaceC3752s);
                }
            }
        }
        for (int i12 = 0; i12 < interfaceC3752sArr.length; i12++) {
            if (interfaceC4869m0Arr[i12] == null && interfaceC3752sArr[i12] != null) {
                a aVar2 = this.f4239r[iArr[i12]];
                if (aVar2.f4250c == 1) {
                    int m4777A = m4777A(i12, iArr);
                    if (m4777A == -1) {
                        interfaceC4869m0Arr[i12] = new C4864k();
                    } else {
                        interfaceC4869m0Arr[i12] = ((C5269i) interfaceC4869m0Arr[m4777A]).m21347S(j10, aVar2.f4249b);
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public void m4784L(C5802c c5802c, int i10) {
        this.f4226C = c5802c;
        this.f4227D = i10;
        this.f4241t.m4850q(c5802c);
        C5269i<InterfaceC1150a>[] c5269iArr = this.f4247z;
        if (c5269iArr != null) {
            for (C5269i<InterfaceC1150a> c5269i : c5269iArr) {
                c5269i.m21332D().mo4763e(c5802c, i10);
            }
            this.f4246y.mo4788e(this);
        }
        this.f4228E = c5802c.m23279d(i10).f21797d;
        for (C5595i c5595i : this.f4224A) {
            Iterator<C5805f> it = this.f4228E.iterator();
            while (true) {
                if (it.hasNext()) {
                    C5805f next = it.next();
                    if (next.m23357a().equals(c5595i.m22526b())) {
                        c5595i.m22528d(next, c5802c.f21762d && i10 == c5802c.m23280e() - 1);
                    }
                }
            }
        }
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        return this.f4225B.mo4785b();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        return this.f4225B.mo4786c(j10);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        for (C5269i<InterfaceC1150a> c5269i : this.f4247z) {
            if (c5269i.f19981h == 2) {
                return c5269i.m21348d(j10, c4465m3);
            }
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        return this.f4225B.mo4789f();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        this.f4225B.mo4790g(j10);
    }

    @Override // p318w4.C5269i.b
    /* renamed from: h */
    public synchronized void mo4791h(C5269i<InterfaceC1150a> c5269i) {
        C1153d.c remove = this.f4242u.remove(c5269i);
        if (remove != null) {
            remove.m4862n();
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f4246y = aVar;
        aVar.mo17309k(this);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f4225B.isLoading();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        this.f4236o.mo4756a();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    public long mo4794m(long j10) {
        for (C5269i<InterfaceC1150a> c5269i : this.f4247z) {
            c5269i.m21346R(j10);
        }
        for (C5595i c5595i : this.f4224A) {
            c5595i.m22527c(j10);
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
        int[] m4778B = m4778B(interfaceC3752sArr);
        m4781I(interfaceC3752sArr, zArr, interfaceC4869m0Arr);
        m4782J(interfaceC3752sArr, interfaceC4869m0Arr, m4778B);
        m4783K(interfaceC3752sArr, interfaceC4869m0Arr, zArr2, j10, m4778B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC4869m0 interfaceC4869m0 : interfaceC4869m0Arr) {
            if (interfaceC4869m0 instanceof C5269i) {
                arrayList.add((C5269i) interfaceC4869m0);
            } else if (interfaceC4869m0 instanceof C5595i) {
                arrayList2.add((C5595i) interfaceC4869m0);
            }
        }
        C5269i<InterfaceC1150a>[] m4767E = m4767E(arrayList.size());
        this.f4247z = m4767E;
        arrayList.toArray(m4767E);
        C5595i[] c5595iArr = new C5595i[arrayList2.size()];
        this.f4224A = c5595iArr;
        arrayList2.toArray(c5595iArr);
        this.f4225B = this.f4240s.mo19317a(this.f4247z);
        return j10;
    }

    /* renamed from: r */
    public final C5269i<InterfaceC1150a> m4797r(a aVar, InterfaceC3752s interfaceC3752s, long j10) {
        int i10;
        C4881s0 c4881s0;
        C4881s0 c4881s02;
        int i11;
        int i12 = aVar.f4253f;
        boolean z10 = i12 != -1;
        C1153d.c cVar = null;
        if (z10) {
            c4881s0 = this.f4238q.m19452b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            c4881s0 = null;
        }
        int i13 = aVar.f4254g;
        boolean z11 = i13 != -1;
        if (z11) {
            c4881s02 = this.f4238q.m19452b(i13);
            i10 += c4881s02.f18465h;
        } else {
            c4881s02 = null;
        }
        C4463m1[] c4463m1Arr = new C4463m1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            c4463m1Arr[0] = c4881s0.m19444b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < c4881s02.f18465h; i14++) {
                c4463m1Arr[i11] = c4881s02.m19444b(i14);
                iArr[i11] = 3;
                arrayList.add(c4463m1Arr[i11]);
                i11++;
            }
        }
        if (this.f4226C.f21762d && z10) {
            cVar = this.f4241t.m4844k();
        }
        C1153d.c cVar2 = cVar;
        C5269i<InterfaceC1150a> c5269i = new C5269i<>(aVar.f4249b, iArr, c4463m1Arr, this.f4230i.mo4764a(this.f4236o, this.f4226C, this.f4234m, this.f4227D, aVar.f4248a, interfaceC3752s, aVar.f4249b, this.f4235n, z10, arrayList, cVar2, this.f4231j, this.f4245x), this, this.f4237p, j10, this.f4232k, this.f4244w, this.f4233l, this.f4243v);
        synchronized (this) {
            this.f4242u.put(c5269i, cVar2);
        }
        return c5269i;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        return this.f4238q;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        for (C5269i<InterfaceC1150a> c5269i : this.f4247z) {
            c5269i.m21349t(j10, z10);
        }
    }
}
