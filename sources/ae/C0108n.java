package ae;

import java.util.Collection;
import java.util.Iterator;
import p115hd.AbstractC2480a0;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: ae.n */
/* loaded from: classes2.dex */
public class C0108n extends C0107m {
    /* renamed from: j */
    public static final byte[] m424j(String str) {
        C4753m.m18653f(str, "<this>");
        byte[] bytes = str.getBytes(C0097c.f330b);
        C4753m.m18652e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: k */
    public static final boolean m425k(String str, String str2, boolean z10) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "suffix");
        return !z10 ? str.endsWith(str2) : m429o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m426l(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m425k(str, str2, z10);
    }

    /* renamed from: m */
    public static final boolean m427m(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: n */
    public static final boolean m428n(CharSequence charSequence) {
        boolean z10;
        C4753m.m18653f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable m484x = C0109o.m484x(charSequence);
            if (!(m484x instanceof Collection) || !((Collection) m484x).isEmpty()) {
                Iterator it = m484x.iterator();
                while (it.hasNext()) {
                    if (!C0095a.m402c(charSequence.charAt(((AbstractC2480a0) it).mo9877a()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m429o(String str, int i10, String str2, int i11, int i12, boolean z10) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    /* renamed from: p */
    public static final String m430p(String str, String str2, String str3, boolean z10) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "oldValue");
        C4753m.m18653f(str3, "newValue");
        int i10 = 0;
        int m434A = C0109o.m434A(str, str2, 0, z10);
        if (m434A < 0) {
            return str;
        }
        int length = str2.length();
        int m22904a = C5767k.m22904a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, m434A);
            sb2.append(str3);
            i10 = m434A + length;
            if (m434A >= str.length()) {
                break;
            }
            m434A = C0109o.m434A(str, str2, m434A + m22904a, z10);
        } while (m434A > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        C4753m.m18652e(sb3, "stringBuilder.append(this, i, length).toString()");
        return sb3;
    }

    /* renamed from: q */
    public static /* synthetic */ String m431q(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m430p(str, str2, str3, z10);
    }

    /* renamed from: r */
    public static final boolean m432r(String str, String str2, boolean z10) {
        C4753m.m18653f(str, "<this>");
        C4753m.m18653f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : m429o(str, 0, str2, 0, str2.length(), z10);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m433s(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m432r(str, str2, z10);
    }
}
