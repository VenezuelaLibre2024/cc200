package p301v0;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p301v0.AbstractC5048h;
import p301v0.C5028a0;
import p301v0.C5058k0;
import p301v0.C5086t1;
import p301v0.InterfaceC5089u1;
import sun.misc.Unsafe;

/* renamed from: v0.u0 */
/* loaded from: classes.dex */
public final class C5088u0<T> implements InterfaceC5047g1<T> {

    /* renamed from: r */
    public static final int[] f19122r = new int[0];

    /* renamed from: s */
    public static final Unsafe f19123s = C5080r1.m20463B();

    /* renamed from: a */
    public final int[] f19124a;

    /* renamed from: b */
    public final Object[] f19125b;

    /* renamed from: c */
    public final int f19126c;

    /* renamed from: d */
    public final int f19127d;

    /* renamed from: e */
    public final InterfaceC5079r0 f19128e;

    /* renamed from: f */
    public final boolean f19129f;

    /* renamed from: g */
    public final boolean f19130g;

    /* renamed from: h */
    public final boolean f19131h;

    /* renamed from: i */
    public final boolean f19132i;

    /* renamed from: j */
    public final int[] f19133j;

    /* renamed from: k */
    public final int f19134k;

    /* renamed from: l */
    public final int f19135l;

    /* renamed from: m */
    public final InterfaceC5093w0 f19136m;

    /* renamed from: n */
    public final AbstractC5049h0 f19137n;

    /* renamed from: o */
    public final AbstractC5068n1<?, ?> f19138o;

    /* renamed from: p */
    public final AbstractC5075q<?> f19139p;

    /* renamed from: q */
    public final InterfaceC5064m0 f19140q;

    public C5088u0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC5079r0 interfaceC5079r0, boolean z10, boolean z11, int[] iArr2, int i12, int i13, InterfaceC5093w0 interfaceC5093w0, AbstractC5049h0 abstractC5049h0, AbstractC5068n1<?, ?> abstractC5068n1, AbstractC5075q<?> abstractC5075q, InterfaceC5064m0 interfaceC5064m0) {
        this.f19124a = iArr;
        this.f19125b = objArr;
        this.f19126c = i10;
        this.f19127d = i11;
        this.f19130g = interfaceC5079r0 instanceof AbstractC5096y;
        this.f19131h = z10;
        this.f19129f = abstractC5075q != null && abstractC5075q.mo20442e(interfaceC5079r0);
        this.f19132i = z11;
        this.f19133j = iArr2;
        this.f19134k = i12;
        this.f19135l = i13;
        this.f19136m = interfaceC5093w0;
        this.f19137n = abstractC5049h0;
        this.f19138o = abstractC5068n1;
        this.f19139p = abstractC5075q;
        this.f19128e = interfaceC5079r0;
        this.f19140q = interfaceC5064m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m20613A(Object obj, int i10, InterfaceC5047g1 interfaceC5047g1) {
        return interfaceC5047g1.mo19940c(C5080r1.m20462A(obj, m20620R(i10)));
    }

    /* renamed from: F */
    public static boolean m20614F(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* renamed from: G */
    public static List<?> m20615G(Object obj, long j10) {
        return (List) C5080r1.m20462A(obj, j10);
    }

    /* renamed from: H */
    public static <T> long m20616H(T t10, long j10) {
        return C5080r1.m20503y(t10, j10);
    }

    /* renamed from: N */
    public static <T> C5088u0<T> m20617N(Class<T> cls, InterfaceC5073p0 interfaceC5073p0, InterfaceC5093w0 interfaceC5093w0, AbstractC5049h0 abstractC5049h0, AbstractC5068n1<?, ?> abstractC5068n1, AbstractC5075q<?> abstractC5075q, InterfaceC5064m0 interfaceC5064m0) {
        return interfaceC5073p0 instanceof C5041e1 ? m20619P((C5041e1) interfaceC5073p0, interfaceC5093w0, abstractC5049h0, abstractC5068n1, abstractC5075q, interfaceC5064m0) : m20618O((C5059k1) interfaceC5073p0, interfaceC5093w0, abstractC5049h0, abstractC5068n1, abstractC5075q, interfaceC5064m0);
    }

    /* renamed from: O */
    public static <T> C5088u0<T> m20618O(C5059k1 c5059k1, InterfaceC5093w0 interfaceC5093w0, AbstractC5049h0 abstractC5049h0, AbstractC5068n1<?, ?> abstractC5068n1, AbstractC5075q<?> abstractC5075q, InterfaceC5064m0 interfaceC5064m0) {
        boolean z10 = c5059k1.mo19912c() == EnumC5032b1.PROTO3;
        C5084t[] m20289e = c5059k1.m20289e();
        if (m20289e.length != 0) {
            C5084t c5084t = m20289e[0];
            throw null;
        }
        int length = m20289e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (m20289e.length > 0) {
            C5084t c5084t2 = m20289e[0];
            throw null;
        }
        int[] m20288d = c5059k1.m20288d();
        if (m20288d == null) {
            m20288d = f19122r;
        }
        if (m20289e.length > 0) {
            C5084t c5084t3 = m20289e[0];
            throw null;
        }
        int[] iArr2 = f19122r;
        int[] iArr3 = f19122r;
        int[] iArr4 = new int[m20288d.length + iArr2.length + iArr3.length];
        System.arraycopy(m20288d, 0, iArr4, 0, m20288d.length);
        System.arraycopy(iArr2, 0, iArr4, m20288d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, m20288d.length + iArr2.length, iArr3.length);
        return new C5088u0<>(iArr, objArr, 0, 0, c5059k1.mo19911b(), z10, true, iArr4, m20288d.length, m20288d.length + iArr2.length, interfaceC5093w0, abstractC5049h0, abstractC5068n1, abstractC5075q, interfaceC5064m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027a  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> p301v0.C5088u0<T> m20619P(p301v0.C5041e1 r36, p301v0.InterfaceC5093w0 r37, p301v0.AbstractC5049h0 r38, p301v0.AbstractC5068n1<?, ?> r39, p301v0.AbstractC5075q<?> r40, p301v0.InterfaceC5064m0 r41) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20619P(v0.e1, v0.w0, v0.h0, v0.n1, v0.q, v0.m0):v0.u0");
    }

    /* renamed from: R */
    public static long m20620R(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: S */
    public static <T> boolean m20621S(T t10, long j10) {
        return ((Boolean) C5080r1.m20462A(t10, j10)).booleanValue();
    }

    /* renamed from: T */
    public static <T> double m20622T(T t10, long j10) {
        return ((Double) C5080r1.m20462A(t10, j10)).doubleValue();
    }

    /* renamed from: U */
    public static <T> float m20623U(T t10, long j10) {
        return ((Float) C5080r1.m20462A(t10, j10)).floatValue();
    }

    /* renamed from: V */
    public static <T> int m20624V(T t10, long j10) {
        return ((Integer) C5080r1.m20462A(t10, j10)).intValue();
    }

    /* renamed from: W */
    public static <T> long m20625W(T t10, long j10) {
        return ((Long) C5080r1.m20462A(t10, j10)).longValue();
    }

    /* renamed from: d0 */
    public static Field m20626d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: h0 */
    public static int m20627h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* renamed from: k */
    public static <T> boolean m20628k(T t10, long j10) {
        return C5080r1.m20494p(t10, j10);
    }

    /* renamed from: l */
    public static <T> double m20629l(T t10, long j10) {
        return C5080r1.m20500v(t10, j10);
    }

    /* renamed from: p */
    public static <T> float m20630p(T t10, long j10) {
        return C5080r1.m20501w(t10, j10);
    }

    /* renamed from: w */
    public static <T> int m20631w(T t10, long j10) {
        return C5080r1.m20502x(t10, j10);
    }

    /* renamed from: x */
    public static boolean m20632x(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final <N> boolean m20633B(Object obj, int i10, int i11) {
        List list = (List) C5080r1.m20462A(obj, m20620R(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC5047g1 m20665s = m20665s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!m20665s.mo19940c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [v0.g1] */
    /* renamed from: C */
    public final boolean m20634C(T t10, int i10, int i11) {
        Map<?, ?> mo20372h = this.f19140q.mo20372h(C5080r1.m20462A(t10, m20620R(i10)));
        if (mo20372h.isEmpty()) {
            return true;
        }
        if (this.f19140q.mo20367c(m20664r(i11)).f19013c.m20578b() != C5086t1.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : mo20372h.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = C5035c1.m19823a().m19826d(obj.getClass());
            }
            if (!r52.mo19940c(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m20635D(T t10, T t11, int i10) {
        long m20644Y = m20644Y(i10) & 1048575;
        return C5080r1.m20502x(t10, m20644Y) == C5080r1.m20502x(t11, m20644Y);
    }

    /* renamed from: E */
    public final boolean m20636E(T t10, int i10, int i11) {
        return C5080r1.m20502x(t10, (long) (m20644Y(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0077, code lost:
    
        r0 = r16.f19134k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x007b, code lost:
    
        if (r0 >= r16.f19135l) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x007d, code lost:
    
        r13 = m20659n(r19, r16.f19133j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0088, code lost:
    
        if (r13 == null) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x008a, code lost:
    
        r17.mo20390o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0098. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends p301v0.C5087u.b<ET>> void m20637I(p301v0.AbstractC5068n1<UT, UB> r17, p301v0.AbstractC5075q<ET> r18, T r19, p301v0.InterfaceC5044f1 r20, p301v0.C5072p r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20637I(v0.n1, v0.q, java.lang.Object, v0.f1, v0.p):void");
    }

    /* renamed from: J */
    public final <K, V> void m20638J(Object obj, int i10, Object obj2, C5072p c5072p, InterfaceC5044f1 interfaceC5044f1) {
        long m20620R = m20620R(m20652i0(i10));
        Object m20462A = C5080r1.m20462A(obj, m20620R);
        if (m20462A == null) {
            m20462A = this.f19140q.mo20369e(obj2);
            C5080r1.m20476O(obj, m20620R, m20462A);
        } else if (this.f19140q.mo20371g(m20462A)) {
            Object mo20369e = this.f19140q.mo20369e(obj2);
            this.f19140q.mo20365a(mo20369e, m20462A);
            C5080r1.m20476O(obj, m20620R, mo20369e);
            m20462A = mo20369e;
        }
        interfaceC5044f1.mo19889m(this.f19140q.mo20368d(m20462A), this.f19140q.mo20367c(obj2), c5072p);
    }

    /* renamed from: K */
    public final void m20639K(T t10, T t11, int i10) {
        long m20620R = m20620R(m20652i0(i10));
        if (m20669y(t11, i10)) {
            Object m20462A = C5080r1.m20462A(t10, m20620R);
            Object m20462A2 = C5080r1.m20462A(t11, m20620R);
            if (m20462A != null && m20462A2 != null) {
                m20462A2 = C5028a0.m19796h(m20462A, m20462A2);
            } else if (m20462A2 == null) {
                return;
            }
            C5080r1.m20476O(t10, m20620R, m20462A2);
            m20649e0(t10, i10);
        }
    }

    /* renamed from: L */
    public final void m20640L(T t10, T t11, int i10) {
        int m20652i0 = m20652i0(i10);
        int m20642Q = m20642Q(i10);
        long m20620R = m20620R(m20652i0);
        if (m20636E(t11, m20642Q, i10)) {
            Object m20462A = C5080r1.m20462A(t10, m20620R);
            Object m20462A2 = C5080r1.m20462A(t11, m20620R);
            if (m20462A != null && m20462A2 != null) {
                m20462A2 = C5028a0.m19796h(m20462A, m20462A2);
            } else if (m20462A2 == null) {
                return;
            }
            C5080r1.m20476O(t10, m20620R, m20462A2);
            m20650f0(t10, m20642Q, i10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* renamed from: M */
    public final void m20641M(T t10, T t11, int i10) {
        int m20652i0 = m20652i0(i10);
        long m20620R = m20620R(m20652i0);
        int m20642Q = m20642Q(i10);
        switch (m20627h0(m20652i0)) {
            case 0:
                if (m20669y(t11, i10)) {
                    C5080r1.m20472K(t10, m20620R, C5080r1.m20500v(t11, m20620R));
                    m20649e0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (m20669y(t11, i10)) {
                    C5080r1.m20473L(t10, m20620R, C5080r1.m20501w(t11, m20620R));
                    m20649e0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20475N(t10, m20620R, C5080r1.m20503y(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 3:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20475N(t10, m20620R, C5080r1.m20503y(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 4:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 5:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20475N(t10, m20620R, C5080r1.m20503y(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 6:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 7:
                if (m20669y(t11, i10)) {
                    C5080r1.m20466E(t10, m20620R, C5080r1.m20494p(t11, m20620R));
                    m20649e0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20476O(t10, m20620R, C5080r1.m20462A(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 9:
            case 17:
                m20639K(t10, t11, i10);
                return;
            case 10:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20476O(t10, m20620R, C5080r1.m20462A(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 11:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 12:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 13:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 14:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20475N(t10, m20620R, C5080r1.m20503y(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 15:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20474M(t10, m20620R, C5080r1.m20502x(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 16:
                if (!m20669y(t11, i10)) {
                    return;
                }
                C5080r1.m20475N(t10, m20620R, C5080r1.m20503y(t11, m20620R));
                m20649e0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case 40:
            case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case 48:
            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                this.f19137n.mo19982d(t10, t11, m20620R);
                return;
            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                C5053i1.m20069F(this.f19140q, t10, t11, m20620R);
                return;
            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case C1417R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case C1417R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case C1417R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case 56:
            case C1417R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (!m20636E(t11, m20642Q, i10)) {
                    return;
                }
                C5080r1.m20476O(t10, m20620R, C5080r1.m20462A(t11, m20620R));
                m20650f0(t10, m20642Q, i10);
                return;
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case C1417R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                m20640L(t10, t11, i10);
                return;
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case C1417R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (!m20636E(t11, m20642Q, i10)) {
                    return;
                }
                C5080r1.m20476O(t10, m20620R, C5080r1.m20462A(t11, m20620R));
                m20650f0(t10, m20642Q, i10);
                return;
            default:
                return;
        }
    }

    /* renamed from: Q */
    public final int m20642Q(int i10) {
        return this.f19124a[i10];
    }

    /* renamed from: X */
    public final int m20643X(int i10) {
        if (i10 < this.f19126c || i10 > this.f19127d) {
            return -1;
        }
        return m20651g0(i10, 0);
    }

    /* renamed from: Y */
    public final int m20644Y(int i10) {
        return this.f19124a[i10 + 2];
    }

    /* renamed from: Z */
    public final <E> void m20645Z(Object obj, long j10, InterfaceC5044f1 interfaceC5044f1, InterfaceC5047g1<E> interfaceC5047g1, C5072p c5072p) {
        interfaceC5044f1.mo19902x(this.f19137n.mo19983e(obj, j10), interfaceC5047g1, c5072p);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: a */
    public void mo19938a(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f19124a.length; i10 += 3) {
            m20641M(t10, t11, i10);
        }
        if (this.f19131h) {
            return;
        }
        C5053i1.m20070G(this.f19138o, t10, t11);
        if (this.f19129f) {
            C5053i1.m20068E(this.f19139p, t10, t11);
        }
    }

    /* renamed from: a0 */
    public final <E> void m20646a0(Object obj, int i10, InterfaceC5044f1 interfaceC5044f1, InterfaceC5047g1<E> interfaceC5047g1, C5072p c5072p) {
        interfaceC5044f1.mo19898t(this.f19137n.mo19983e(obj, m20620R(i10)), interfaceC5047g1, c5072p);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: b */
    public void mo19939b(T t10) {
        int i10;
        int i11 = this.f19134k;
        while (true) {
            i10 = this.f19135l;
            if (i11 >= i10) {
                break;
            }
            long m20620R = m20620R(m20652i0(this.f19133j[i11]));
            Object m20462A = C5080r1.m20462A(t10, m20620R);
            if (m20462A != null) {
                C5080r1.m20476O(t10, m20620R, this.f19140q.mo20366b(m20462A));
            }
            i11++;
        }
        int length = this.f19133j.length;
        while (i10 < length) {
            this.f19137n.mo19981c(t10, this.f19133j[i10]);
            i10++;
        }
        this.f19138o.mo20385j(t10);
        if (this.f19129f) {
            this.f19139p.mo20443f(t10);
        }
    }

    /* renamed from: b0 */
    public final void m20647b0(Object obj, int i10, InterfaceC5044f1 interfaceC5044f1) {
        long m20620R;
        Object mo19845F;
        if (m20632x(i10)) {
            m20620R = m20620R(i10);
            mo19845F = interfaceC5044f1.mo19853N();
        } else if (this.f19130g) {
            m20620R = m20620R(i10);
            mo19845F = interfaceC5044f1.mo19841B();
        } else {
            m20620R = m20620R(i10);
            mo19845F = interfaceC5044f1.mo19845F();
        }
        C5080r1.m20476O(obj, m20620R, mo19845F);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: c */
    public final boolean mo19940c(T t10) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f19134k; i13++) {
            int i14 = this.f19133j[i13];
            int m20642Q = m20642Q(i14);
            int m20652i0 = m20652i0(i14);
            if (this.f19131h) {
                i10 = 0;
            } else {
                int i15 = this.f19124a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f19123s.getInt(t10, i16);
                    i11 = i16;
                }
            }
            if (m20614F(m20652i0) && !m20670z(t10, i14, i12, i10)) {
                return false;
            }
            int m20627h0 = m20627h0(m20652i0);
            if (m20627h0 != 9 && m20627h0 != 17) {
                if (m20627h0 != 27) {
                    if (m20627h0 == 60 || m20627h0 == 68) {
                        if (m20636E(t10, m20642Q, i14) && !m20613A(t10, m20652i0, m20665s(i14))) {
                            return false;
                        }
                    } else if (m20627h0 != 49) {
                        if (m20627h0 == 50 && !m20634C(t10, m20652i0, i14)) {
                            return false;
                        }
                    }
                }
                if (!m20633B(t10, m20652i0, i14)) {
                    return false;
                }
            } else if (m20670z(t10, i14, i12, i10) && !m20613A(t10, m20652i0, m20665s(i14))) {
                return false;
            }
        }
        return !this.f19129f || this.f19139p.mo20440c(t10).m20600p();
    }

    /* renamed from: c0 */
    public final void m20648c0(Object obj, int i10, InterfaceC5044f1 interfaceC5044f1) {
        if (m20632x(i10)) {
            interfaceC5044f1.mo19844E(this.f19137n.mo19983e(obj, m20620R(i10)));
        } else {
            interfaceC5044f1.mo19843D(this.f19137n.mo19983e(obj, m20620R(i10)));
        }
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: d */
    public void mo19941d(T t10, InterfaceC5089u1 interfaceC5089u1) {
        if (interfaceC5089u1.mo20321j() == InterfaceC5089u1.a.DESCENDING) {
            m20656l0(t10, interfaceC5089u1);
        } else if (this.f19131h) {
            m20655k0(t10, interfaceC5089u1);
        } else {
            m20654j0(t10, interfaceC5089u1);
        }
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: e */
    public void mo19942e(T t10, InterfaceC5044f1 interfaceC5044f1, C5072p c5072p) {
        Objects.requireNonNull(c5072p);
        m20637I(this.f19138o, this.f19139p, t10, interfaceC5044f1, c5072p);
    }

    /* renamed from: e0 */
    public final void m20649e0(T t10, int i10) {
        if (this.f19131h) {
            return;
        }
        int m20644Y = m20644Y(i10);
        long j10 = m20644Y & 1048575;
        C5080r1.m20474M(t10, j10, C5080r1.m20502x(t10, j10) | (1 << (m20644Y >>> 20)));
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: f */
    public boolean mo19943f(T t10, T t11) {
        int length = this.f19124a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m20657m(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f19138o.mo20382g(t10).equals(this.f19138o.mo20382g(t11))) {
            return false;
        }
        if (this.f19129f) {
            return this.f19139p.mo20440c(t10).equals(this.f19139p.mo20440c(t11));
        }
        return true;
    }

    /* renamed from: f0 */
    public final void m20650f0(T t10, int i10, int i11) {
        C5080r1.m20474M(t10, m20644Y(i11) & 1048575, i10);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: g */
    public int mo19944g(T t10) {
        return this.f19131h ? m20667u(t10) : m20666t(t10);
    }

    /* renamed from: g0 */
    public final int m20651g0(int i10, int i11) {
        int length = (this.f19124a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int m20642Q = m20642Q(i13);
            if (i10 == m20642Q) {
                return i13;
            }
            if (i10 < m20642Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: h */
    public T mo19945h() {
        return (T) this.f19136m.mo20689a(this.f19128e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // p301v0.InterfaceC5047g1
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo19946i(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.mo19946i(java.lang.Object):int");
    }

    /* renamed from: i0 */
    public final int m20652i0(int i10) {
        return this.f19124a[i10 + 1];
    }

    /* renamed from: j */
    public final boolean m20653j(T t10, T t11, int i10) {
        return m20669y(t10, i10) == m20669y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20654j0(T r18, p301v0.InterfaceC5089u1 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20654j0(java.lang.Object, v0.u1):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20655k0(T r13, p301v0.InterfaceC5089u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20655k0(java.lang.Object, v0.u1):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20656l0(T r11, p301v0.InterfaceC5089u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20656l0(java.lang.Object, v0.u1):void");
    }

    /* renamed from: m */
    public final boolean m20657m(T t10, T t11, int i10) {
        int m20652i0 = m20652i0(i10);
        long m20620R = m20620R(m20652i0);
        switch (m20627h0(m20652i0)) {
            case 0:
                return m20653j(t10, t11, i10) && Double.doubleToLongBits(C5080r1.m20500v(t10, m20620R)) == Double.doubleToLongBits(C5080r1.m20500v(t11, m20620R));
            case 1:
                return m20653j(t10, t11, i10) && Float.floatToIntBits(C5080r1.m20501w(t10, m20620R)) == Float.floatToIntBits(C5080r1.m20501w(t11, m20620R));
            case 2:
                return m20653j(t10, t11, i10) && C5080r1.m20503y(t10, m20620R) == C5080r1.m20503y(t11, m20620R);
            case 3:
                return m20653j(t10, t11, i10) && C5080r1.m20503y(t10, m20620R) == C5080r1.m20503y(t11, m20620R);
            case 4:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 5:
                return m20653j(t10, t11, i10) && C5080r1.m20503y(t10, m20620R) == C5080r1.m20503y(t11, m20620R);
            case 6:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 7:
                return m20653j(t10, t11, i10) && C5080r1.m20494p(t10, m20620R) == C5080r1.m20494p(t11, m20620R);
            case 8:
                return m20653j(t10, t11, i10) && C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            case 9:
                return m20653j(t10, t11, i10) && C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            case 10:
                return m20653j(t10, t11, i10) && C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            case 11:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 12:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 13:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 14:
                return m20653j(t10, t11, i10) && C5080r1.m20503y(t10, m20620R) == C5080r1.m20503y(t11, m20620R);
            case 15:
                return m20653j(t10, t11, i10) && C5080r1.m20502x(t10, m20620R) == C5080r1.m20502x(t11, m20620R);
            case 16:
                return m20653j(t10, t11, i10) && C5080r1.m20503y(t10, m20620R) == C5080r1.m20503y(t11, m20620R);
            case 17:
                return m20653j(t10, t11, i10) && C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case 40:
            case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case 48:
            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case C1417R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case C1417R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case C1417R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case 56:
            case C1417R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case C1417R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case C1417R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return m20635D(t10, t11, i10) && C5053i1.m20074K(C5080r1.m20462A(t10, m20620R), C5080r1.m20462A(t11, m20620R));
            default:
                return true;
        }
    }

    /* renamed from: m0 */
    public final <K, V> void m20658m0(InterfaceC5089u1 interfaceC5089u1, int i10, Object obj, int i11) {
        if (obj != null) {
            interfaceC5089u1.mo20291A(i10, this.f19140q.mo20367c(m20664r(i11)), this.f19140q.mo20372h(obj));
        }
    }

    /* renamed from: n */
    public final <UT, UB> UB m20659n(Object obj, int i10, UB ub2, AbstractC5068n1<UT, UB> abstractC5068n1) {
        C5028a0.e m20663q;
        int m20642Q = m20642Q(i10);
        Object m20462A = C5080r1.m20462A(obj, m20620R(m20652i0(i10)));
        return (m20462A == null || (m20663q = m20663q(i10)) == null) ? ub2 : (UB) m20661o(i10, m20642Q, this.f19140q.mo20368d(m20462A), m20663q, ub2, abstractC5068n1);
    }

    /* renamed from: n0 */
    public final void m20660n0(int i10, Object obj, InterfaceC5089u1 interfaceC5089u1) {
        if (obj instanceof String) {
            interfaceC5089u1.mo20324m(i10, (String) obj);
        } else {
            interfaceC5089u1.mo20316e(i10, (AbstractC5048h) obj);
        }
    }

    /* renamed from: o */
    public final <K, V, UT, UB> UB m20661o(int i10, int i11, Map<K, V> map, C5028a0.e eVar, UB ub2, AbstractC5068n1<UT, UB> abstractC5068n1) {
        C5058k0.a<?, ?> mo20367c = this.f19140q.mo20367c(m20664r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.m19801a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = abstractC5068n1.mo20389n();
                }
                AbstractC5048h.h m19955p = AbstractC5048h.m19955p(C5058k0.m20283b(mo20367c, next.getKey(), next.getValue()));
                try {
                    C5058k0.m20285e(m19955p.m19977b(), mo20367c, next.getKey(), next.getValue());
                    abstractC5068n1.mo20379d(ub2, i11, m19955p.m19976a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* renamed from: o0 */
    public final <UT, UB> void m20662o0(AbstractC5068n1<UT, UB> abstractC5068n1, T t10, InterfaceC5089u1 interfaceC5089u1) {
        abstractC5068n1.mo20395t(abstractC5068n1.mo20382g(t10), interfaceC5089u1);
    }

    /* renamed from: q */
    public final C5028a0.e m20663q(int i10) {
        return (C5028a0.e) this.f19125b[((i10 / 3) * 2) + 1];
    }

    /* renamed from: r */
    public final Object m20664r(int i10) {
        return this.f19125b[(i10 / 3) * 2];
    }

    /* renamed from: s */
    public final InterfaceC5047g1 m20665s(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC5047g1 interfaceC5047g1 = (InterfaceC5047g1) this.f19125b[i11];
        if (interfaceC5047g1 != null) {
            return interfaceC5047g1;
        }
        InterfaceC5047g1<T> m19826d = C5035c1.m19823a().m19826d((Class) this.f19125b[i11 + 1]);
        this.f19125b[i11] = m19826d;
        return m19826d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ce, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f2, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0225, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0236, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0247, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0258, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0322, code lost:
    
        r3 = p301v0.AbstractC5057k.m20212s(r9, (p301v0.InterfaceC5079r0) r2.getObject(r18, r12), m20665s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0320, code lost:
    
        if ((r7 & r14) != 0) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x034d, code lost:
    
        if ((r7 & r14) != 0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0356, code lost:
    
        if ((r7 & r14) != 0) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037b, code lost:
    
        if ((r7 & r14) != 0) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x038a, code lost:
    
        if ((r7 & r14) != 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b7, code lost:
    
        if ((r7 & r14) != 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x034f, code lost:
    
        r3 = p301v0.AbstractC5057k.m20178N(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0358, code lost:
    
        r4 = p301v0.AbstractC5057k.m20176L(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x037d, code lost:
    
        r3 = p301v0.AbstractC5057k.m20198g(r9, (p301v0.AbstractC5048h) r2.getObject(r18, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x038c, code lost:
    
        r3 = p301v0.C5053i1.m20109o(r9, r2.getObject(r18, r12), m20665s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (m20636E(r18, r9, r5) != false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03b9, code lost:
    
        r3 = p301v0.AbstractC5057k.m20194d(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
    
        r4 = (p301v0.AbstractC5057k.m20186V(r9) + p301v0.AbstractC5057k.m20188X(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025a, code lost:
    
        r2.putInt(r18, r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0186, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        if (r17.f19132i != false) goto L400;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0060. Please report as an issue. */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m20666t(T r18) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20666t(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (p301v0.AbstractC5057k.m20186V(r8) + p301v0.AbstractC5057k.m20188X(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f19132i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof p301v0.AbstractC5048h) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof p301v0.AbstractC5048h) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = p301v0.AbstractC5057k.m20184T(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m20667u(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5088u0.m20667u(java.lang.Object):int");
    }

    /* renamed from: v */
    public final <UT, UB> int m20668v(AbstractC5068n1<UT, UB> abstractC5068n1, T t10) {
        return abstractC5068n1.mo20383h(abstractC5068n1.mo20382g(t10));
    }

    /* renamed from: y */
    public final boolean m20669y(T t10, int i10) {
        if (!this.f19131h) {
            int m20644Y = m20644Y(i10);
            return (C5080r1.m20502x(t10, (long) (m20644Y & 1048575)) & (1 << (m20644Y >>> 20))) != 0;
        }
        int m20652i0 = m20652i0(i10);
        long m20620R = m20620R(m20652i0);
        switch (m20627h0(m20652i0)) {
            case 0:
                return C5080r1.m20500v(t10, m20620R) != 0.0d;
            case 1:
                return C5080r1.m20501w(t10, m20620R) != 0.0f;
            case 2:
                return C5080r1.m20503y(t10, m20620R) != 0;
            case 3:
                return C5080r1.m20503y(t10, m20620R) != 0;
            case 4:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 5:
                return C5080r1.m20503y(t10, m20620R) != 0;
            case 6:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 7:
                return C5080r1.m20494p(t10, m20620R);
            case 8:
                Object m20462A = C5080r1.m20462A(t10, m20620R);
                if (m20462A instanceof String) {
                    return !((String) m20462A).isEmpty();
                }
                if (m20462A instanceof AbstractC5048h) {
                    return !AbstractC5048h.f18921i.equals(m20462A);
                }
                throw new IllegalArgumentException();
            case 9:
                return C5080r1.m20462A(t10, m20620R) != null;
            case 10:
                return !AbstractC5048h.f18921i.equals(C5080r1.m20462A(t10, m20620R));
            case 11:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 12:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 13:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 14:
                return C5080r1.m20503y(t10, m20620R) != 0;
            case 15:
                return C5080r1.m20502x(t10, m20620R) != 0;
            case 16:
                return C5080r1.m20503y(t10, m20620R) != 0;
            case 17:
                return C5080r1.m20462A(t10, m20620R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    public final boolean m20670z(T t10, int i10, int i11, int i12) {
        return this.f19131h ? m20669y(t10, i10) : (i11 & i12) != 0;
    }
}
