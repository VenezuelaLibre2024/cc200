package ae;

import gd.C2236j;
import gd.C2240n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115hd.AbstractC2480a0;
import p115hd.C2495i;
import p115hd.C2497j;
import p115hd.C2501m;
import p115hd.C2503o;
import p343xd.C5760d;
import p343xd.C5762f;
import p343xd.C5767k;
import p373zd.C6131i;
import p373zd.InterfaceC6124b;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: ae.o */
/* loaded from: classes2.dex */
public class C0109o extends C0108n {

    /* renamed from: ae.o$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<CharSequence, Integer, C2236j<? extends Integer, ? extends Integer>> {

        /* renamed from: h */
        public final /* synthetic */ char[] f350h;

        /* renamed from: i */
        public final /* synthetic */ boolean f351i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z10) {
            super(2);
            this.f350h = cArr;
            this.f351i = z10;
        }

        /* renamed from: a */
        public final C2236j<Integer, Integer> m487a(CharSequence charSequence, int i10) {
            C4753m.m18653f(charSequence, "$this$$receiver");
            int m439F = C0109o.m439F(charSequence, this.f350h, i10, this.f351i);
            if (m439F < 0) {
                return null;
            }
            return C2240n.m8977a(Integer.valueOf(m439F), 1);
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ C2236j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m487a(charSequence, num.intValue());
        }
    }

    /* renamed from: ae.o$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4584p<CharSequence, Integer, C2236j<? extends Integer, ? extends Integer>> {

        /* renamed from: h */
        public final /* synthetic */ List<String> f352h;

        /* renamed from: i */
        public final /* synthetic */ boolean f353i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, boolean z10) {
            super(2);
            this.f352h = list;
            this.f353i = z10;
        }

        /* renamed from: a */
        public final C2236j<Integer, Integer> m488a(CharSequence charSequence, int i10) {
            C4753m.m18653f(charSequence, "$this$$receiver");
            C2236j m483w = C0109o.m483w(charSequence, this.f352h, i10, this.f353i, false);
            if (m483w != null) {
                return C2240n.m8977a(m483w.m8963c(), Integer.valueOf(((String) m483w.m8964d()).length()));
            }
            return null;
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ C2236j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m488a(charSequence, num.intValue());
        }
    }

    /* renamed from: ae.o$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4754n implements InterfaceC4580l<C5762f, String> {

        /* renamed from: h */
        public final /* synthetic */ CharSequence f354h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.f354h = charSequence;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final String invoke(C5762f c5762f) {
            C4753m.m18653f(c5762f, "it");
            return C0109o.m468i0(this.f354h, c5762f);
        }
    }

    /* renamed from: A */
    public static final int m434A(CharSequence charSequence, String str, int i10, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? m436C(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    /* renamed from: B */
    public static final int m435B(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C5760d c5762f = !z11 ? new C5762f(C5767k.m22904a(i10, 0), C5767k.m22906c(i11, charSequence.length())) : C5767k.m22910g(C5767k.m22906c(i10, m485y(charSequence)), C5767k.m22904a(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m22890a = c5762f.m22890a();
            int m22891b = c5762f.m22891b();
            int m22892c = c5762f.m22892c();
            if ((m22892c <= 0 || m22890a > m22891b) && (m22892c >= 0 || m22891b > m22890a)) {
                return -1;
            }
            while (!C0108n.m429o((String) charSequence2, 0, (String) charSequence, m22890a, charSequence2.length(), z10)) {
                if (m22890a == m22891b) {
                    return -1;
                }
                m22890a += m22892c;
            }
            return m22890a;
        }
        int m22890a2 = c5762f.m22890a();
        int m22891b2 = c5762f.m22891b();
        int m22892c2 = c5762f.m22892c();
        if ((m22892c2 <= 0 || m22890a2 > m22891b2) && (m22892c2 >= 0 || m22891b2 > m22890a2)) {
            return -1;
        }
        while (!m456W(charSequence2, 0, charSequence, m22890a2, charSequence2.length(), z10)) {
            if (m22890a2 == m22891b2) {
                return -1;
            }
            m22890a2 += m22892c2;
        }
        return m22890a2;
    }

    /* renamed from: C */
    public static /* synthetic */ int m436C(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m435B(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* renamed from: D */
    public static /* synthetic */ int m437D(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m486z(charSequence, c10, i10, z10);
    }

    /* renamed from: E */
    public static /* synthetic */ int m438E(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m434A(charSequence, str, i10, z10);
    }

    /* renamed from: F */
    public static final int m439F(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C2497j.m9947H(cArr), i10);
        }
        AbstractC2480a0 it = new C5762f(C5767k.m22904a(i10, 0), m485y(charSequence)).iterator();
        while (it.hasNext()) {
            int mo9877a = it.mo9877a();
            char charAt = charSequence.charAt(mo9877a);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (C0096b.m403d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return mo9877a;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public static final int m440G(CharSequence charSequence, char c10, int i10, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m444K(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* renamed from: H */
    public static final int m441H(CharSequence charSequence, String str, int i10, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? m435B(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    /* renamed from: I */
    public static /* synthetic */ int m442I(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m485y(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m440G(charSequence, c10, i10, z10);
    }

    /* renamed from: J */
    public static /* synthetic */ int m443J(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m485y(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m441H(charSequence, str, i10, z10);
    }

    /* renamed from: K */
    public static final int m444K(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C2497j.m9947H(cArr), i10);
        }
        for (int m22906c = C5767k.m22906c(i10, m485y(charSequence)); -1 < m22906c; m22906c--) {
            char charAt = charSequence.charAt(m22906c);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (C0096b.m403d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m22906c;
            }
        }
        return -1;
    }

    /* renamed from: L */
    public static final InterfaceC6124b<String> m445L(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        return m465f0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: M */
    public static final List<String> m446M(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        return C6131i.m24445h(m445L(charSequence));
    }

    /* renamed from: N */
    public static final CharSequence m447N(CharSequence charSequence, int i10, char c10) {
        C4753m.m18653f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        AbstractC2480a0 it = new C5762f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.mo9877a();
            sb2.append(c10);
        }
        return sb2;
    }

    /* renamed from: O */
    public static final String m448O(String str, int i10, char c10) {
        C4753m.m18653f(str, "<this>");
        return m447N(str, i10, c10).toString();
    }

    /* renamed from: P */
    public static /* synthetic */ String m449P(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return m448O(str, i10, c10);
    }

    /* renamed from: Q */
    public static final CharSequence m450Q(CharSequence charSequence, int i10, char c10) {
        C4753m.m18653f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        AbstractC2480a0 it = new C5762f(1, i10 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.mo9877a();
            sb2.append(c10);
        }
        sb2.append(charSequence);
        return sb2;
    }

    /* renamed from: R */
    public static final String m451R(String str, int i10, char c10) {
        C4753m.m18653f(str, "<this>");
        return m450Q(str, i10, c10).toString();
    }

    /* renamed from: S */
    public static final InterfaceC6124b<C5762f> m452S(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        m458Y(i11);
        return new C0098d(charSequence, i10, i11, new a(cArr, z10));
    }

    /* renamed from: T */
    public static final InterfaceC6124b<C5762f> m453T(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        m458Y(i11);
        return new C0098d(charSequence, i10, i11, new b(C2495i.m9931b(strArr), z10));
    }

    /* renamed from: U */
    public static /* synthetic */ InterfaceC6124b m454U(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m452S(charSequence, cArr, i10, z10, i11);
    }

    /* renamed from: V */
    public static /* synthetic */ InterfaceC6124b m455V(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m453T(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: W */
    public static final boolean m456W(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C0096b.m403d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public static final String m457X(String str, CharSequence charSequence) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(charSequence, "prefix");
        if (!m467h0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C4753m.m18652e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: Y */
    public static final void m458Y(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    /* renamed from: Z */
    public static final List<String> m459Z(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(cArr, "delimiters");
        if (cArr.length == 1) {
            return m461b0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable m24442e = C6131i.m24442e(m454U(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C2503o.m9995k(m24442e, 10));
        Iterator it = m24442e.iterator();
        while (it.hasNext()) {
            arrayList.add(m468i0(charSequence, (C5762f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public static final List<String> m460a0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return m461b0(charSequence, str, z10, i10);
            }
        }
        Iterable m24442e = C6131i.m24442e(m455V(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C2503o.m9995k(m24442e, 10));
        Iterator it = m24442e.iterator();
        while (it.hasNext()) {
            arrayList.add(m468i0(charSequence, (C5762f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b0 */
    public static final List<String> m461b0(CharSequence charSequence, String str, boolean z10, int i10) {
        m458Y(i10);
        int i11 = 0;
        int m434A = m434A(charSequence, str, 0, z10);
        if (m434A == -1 || i10 == 1) {
            return C2501m.m9986b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? C5767k.m22906c(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, m434A).toString());
            i11 = str.length() + m434A;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            m434A = m434A(charSequence, str, i11, z10);
        } while (m434A != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: c0 */
    public static /* synthetic */ List m462c0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m459Z(charSequence, cArr, z10, i10);
    }

    /* renamed from: d0 */
    public static /* synthetic */ List m463d0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m460a0(charSequence, strArr, z10, i10);
    }

    /* renamed from: e0 */
    public static final InterfaceC6124b<String> m464e0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(strArr, "delimiters");
        return C6131i.m24443f(m455V(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
    }

    /* renamed from: f0 */
    public static /* synthetic */ InterfaceC6124b m465f0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m464e0(charSequence, strArr, z10, i10);
    }

    /* renamed from: g0 */
    public static final boolean m466g0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C0108n.m433s((String) charSequence, (String) charSequence2, false, 2, null) : m456W(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    /* renamed from: h0 */
    public static /* synthetic */ boolean m467h0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m466g0(charSequence, charSequence2, z10);
    }

    /* renamed from: i0 */
    public static final String m468i0(CharSequence charSequence, C5762f c5762f) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(c5762f, "range");
        return charSequence.subSequence(c5762f.m22898k().intValue(), c5762f.m22897j().intValue() + 1).toString();
    }

    /* renamed from: j0 */
    public static final String m469j0(String str, char c10, String str2) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "missingDelimiterValue");
        int m437D = m437D(str, c10, 0, false, 6, null);
        if (m437D == -1) {
            return str2;
        }
        String substring = str.substring(m437D + 1, str.length());
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: k0 */
    public static final String m470k0(String str, String str2, String str3) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "delimiter");
        C4753m.m18653f(str3, "missingDelimiterValue");
        int m438E = m438E(str, str2, 0, false, 6, null);
        if (m438E == -1) {
            return str3;
        }
        String substring = str.substring(m438E + str2.length(), str.length());
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: l0 */
    public static /* synthetic */ String m471l0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m469j0(str, c10, str2);
    }

    /* renamed from: m0 */
    public static /* synthetic */ String m472m0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m470k0(str, str2, str3);
    }

    /* renamed from: n0 */
    public static final String m473n0(String str, char c10, String str2) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "missingDelimiterValue");
        int m442I = m442I(str, c10, 0, false, 6, null);
        if (m442I == -1) {
            return str2;
        }
        String substring = str.substring(m442I + 1, str.length());
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: o0 */
    public static /* synthetic */ String m474o0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m473n0(str, c10, str2);
    }

    /* renamed from: p0 */
    public static final String m475p0(String str, char c10, String str2) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "missingDelimiterValue");
        int m437D = m437D(str, c10, 0, false, 6, null);
        if (m437D == -1) {
            return str2;
        }
        String substring = str.substring(0, m437D);
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: q0 */
    public static final String m476q0(String str, String str2, String str3) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "delimiter");
        C4753m.m18653f(str3, "missingDelimiterValue");
        int m438E = m438E(str, str2, 0, false, 6, null);
        if (m438E == -1) {
            return str3;
        }
        String substring = str.substring(0, m438E);
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: r0 */
    public static /* synthetic */ String m477r0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m475p0(str, c10, str2);
    }

    /* renamed from: s0 */
    public static /* synthetic */ String m478s0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m476q0(str, str2, str3);
    }

    /* renamed from: t0 */
    public static final CharSequence m480t0(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean m402c = C0095a.m402c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!m402c) {
                    break;
                }
                length--;
            } else if (m402c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* renamed from: u */
    public static final boolean m481u(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        C4753m.m18653f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m438E(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (m436C(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m482v(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m481u(charSequence, charSequence2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        return gd.C2240n.m8977a(java.lang.Integer.valueOf(r12), r9);
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final gd.C2236j<java.lang.Integer, java.lang.String> m483w(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = p115hd.C2510v.m10000C(r11)
            java.lang.String r11 = (java.lang.String) r11
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = m438E(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = m443J(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            gd.j r0 = gd.C2240n.m8977a(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            xd.f r14 = new xd.f
            int r12 = p343xd.C5767k.m22904a(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = m485y(r10)
            int r12 = p343xd.C5767k.m22906c(r12, r14)
            xd.d r14 = p343xd.C5767k.m22910g(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L96
            int r12 = r14.m22890a()
            int r1 = r14.m22891b()
            int r14 = r14.m22892c()
            if (r14 <= 0) goto L5e
            if (r12 <= r1) goto L62
        L5e:
            if (r14 >= 0) goto Ld4
            if (r1 > r12) goto Ld4
        L62:
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r5 = r12
            r7 = r13
            boolean r2 = ae.C0108n.m429o(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L66
            goto L85
        L84:
            r9 = r0
        L85:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
        L89:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            gd.j r10 = gd.C2240n.m8977a(r10, r9)
            return r10
        L92:
            if (r12 == r1) goto Ld4
            int r12 = r12 + r14
            goto L62
        L96:
            int r12 = r14.m22890a()
            int r1 = r14.m22891b()
            int r14 = r14.m22892c()
            if (r14 <= 0) goto La6
            if (r12 <= r1) goto Laa
        La6:
            if (r14 >= 0) goto Ld4
            if (r1 > r12) goto Ld4
        Laa:
            java.util.Iterator r8 = r11.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = m456W(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lae
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld0
            goto L89
        Ld0:
            if (r12 == r1) goto Ld4
            int r12 = r12 + r14
            goto Laa
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0109o.m483w(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):gd.j");
    }

    /* renamed from: x */
    public static final C5762f m484x(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        return new C5762f(0, charSequence.length() - 1);
    }

    /* renamed from: y */
    public static final int m485y(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: z */
    public static final int m486z(CharSequence charSequence, char c10, int i10, boolean z10) {
        C4753m.m18653f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m439F(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }
}
