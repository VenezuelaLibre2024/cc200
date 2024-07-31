package p115hd;

import ae.C0100f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: hd.j */
/* loaded from: classes2.dex */
public class C2497j extends C2495i {
    /* renamed from: A */
    public static final String m9940A(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Short, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(sArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9976u(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: B */
    public static /* synthetic */ String m9941B(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9977v(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: C */
    public static /* synthetic */ String m9942C(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9978w(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: D */
    public static /* synthetic */ String m9943D(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9979x(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: E */
    public static /* synthetic */ String m9944E(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9980y(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: F */
    public static /* synthetic */ String m9945F(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9981z(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: G */
    public static /* synthetic */ String m9946G(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m9940A(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: H */
    public static final char m9947H(char[] cArr) {
        C4753m.m18653f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: I */
    public static final <T> T m9948I(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: J */
    public static final List<Byte> m9949J(byte[] bArr) {
        C4753m.m18653f(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? m9956Q(bArr) : C2501m.m9986b(Byte.valueOf(bArr[0])) : C2502n.m9989e();
    }

    /* renamed from: K */
    public static final List<Double> m9950K(double[] dArr) {
        C4753m.m18653f(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m9957R(dArr) : C2501m.m9986b(Double.valueOf(dArr[0])) : C2502n.m9989e();
    }

    /* renamed from: L */
    public static final List<Float> m9951L(float[] fArr) {
        C4753m.m18653f(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? m9958S(fArr) : C2501m.m9986b(Float.valueOf(fArr[0])) : C2502n.m9989e();
    }

    /* renamed from: M */
    public static final List<Integer> m9952M(int[] iArr) {
        C4753m.m18653f(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m9959T(iArr) : C2501m.m9986b(Integer.valueOf(iArr[0])) : C2502n.m9989e();
    }

    /* renamed from: N */
    public static final List<Long> m9953N(long[] jArr) {
        C4753m.m18653f(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? m9960U(jArr) : C2501m.m9986b(Long.valueOf(jArr[0])) : C2502n.m9989e();
    }

    /* renamed from: O */
    public static final <T> List<T> m9954O(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m9961V(tArr) : C2501m.m9986b(tArr[0]) : C2502n.m9989e();
    }

    /* renamed from: P */
    public static final List<Short> m9955P(short[] sArr) {
        C4753m.m18653f(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? m9962W(sArr) : C2501m.m9986b(Short.valueOf(sArr[0])) : C2502n.m9989e();
    }

    /* renamed from: Q */
    public static final List<Byte> m9956Q(byte[] bArr) {
        C4753m.m18653f(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    /* renamed from: R */
    public static final List<Double> m9957R(double[] dArr) {
        C4753m.m18653f(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    /* renamed from: S */
    public static final List<Float> m9958S(float[] fArr) {
        C4753m.m18653f(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    /* renamed from: T */
    public static final List<Integer> m9959T(int[] iArr) {
        C4753m.m18653f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* renamed from: U */
    public static final List<Long> m9960U(long[] jArr) {
        C4753m.m18653f(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: V */
    public static final <T> List<T> m9961V(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        return new ArrayList(C2502n.m9988d(tArr));
    }

    /* renamed from: W */
    public static final List<Short> m9962W(short[] sArr) {
        C4753m.m18653f(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final <T> boolean m9963h(T[] tArr, T t10) {
        C4753m.m18653f(tArr, "<this>");
        return m9970o(tArr, t10) >= 0;
    }

    /* renamed from: i */
    public static final <T> List<T> m9964i(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        return (List) m9965j(tArr, new ArrayList());
    }

    /* renamed from: j */
    public static final <C extends Collection<? super T>, T> C m9965j(T[] tArr, C c10) {
        C4753m.m18653f(tArr, "<this>");
        C4753m.m18653f(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    /* renamed from: k */
    public static final <T> T m9966k(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    /* renamed from: l */
    public static final Integer m9967l(int[] iArr) {
        C4753m.m18653f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    /* renamed from: m */
    public static final <T> int m9968m(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: n */
    public static final <T> T m9969n(T[] tArr, int i10) {
        C4753m.m18653f(tArr, "<this>");
        if (i10 < 0 || i10 > m9968m(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    /* renamed from: o */
    public static final <T> int m9970o(T[] tArr, T t10) {
        C4753m.m18653f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (C4753m.m18648a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: p */
    public static final <A extends Appendable> A m9971p(double[] dArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Double, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(dArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(interfaceC4580l != null ? interfaceC4580l.invoke(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: q */
    public static final <A extends Appendable> A m9972q(float[] fArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Float, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(fArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(interfaceC4580l != null ? interfaceC4580l.invoke(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: r */
    public static final <A extends Appendable> A m9973r(int[] iArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Integer, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(iArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(interfaceC4580l != null ? interfaceC4580l.invoke(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: s */
    public static final <A extends Appendable> A m9974s(long[] jArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Long, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(jArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(interfaceC4580l != null ? interfaceC4580l.invoke(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: t */
    public static final <T, A extends Appendable> A m9975t(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super T, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(tArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C0100f.m413a(a10, t10, interfaceC4580l);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: u */
    public static final <A extends Appendable> A m9976u(short[] sArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Short, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(sArr, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(interfaceC4580l != null ? interfaceC4580l.invoke(Short.valueOf(s10)) : String.valueOf((int) s10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: v */
    public static final String m9977v(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Double, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(dArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9971p(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static final String m9978w(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Float, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(fArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9972q(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: x */
    public static final String m9979x(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Integer, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(iArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9973r(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: y */
    public static final String m9980y(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super Long, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(jArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9974s(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: z */
    public static final <T> String m9981z(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super T, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(tArr, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m9975t(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }
}
