package p116he;

import ae.C0108n;
import gd.C2236j;
import gd.C2237k;
import gd.C2238l;
import gd.C2240n;
import java.util.ArrayDeque;
import java.util.Iterator;
import p001a.C0001a;
import p001a.C0002b;
import p038ce.C1101t0;
import p173ld.InterfaceC3471e;
import td.C4753m;

/* renamed from: he.k0 */
/* loaded from: classes2.dex */
public final class C2536k0 {

    /* renamed from: a */
    public static final StackTraceElement f9973a = new C0001a().m2a();

    /* renamed from: b */
    public static final String f9974b;

    /* renamed from: c */
    public static final String f9975c;

    static {
        Object m8966b;
        Object m8966b2;
        try {
            C2237k.a aVar = C2237k.f8865i;
            m8966b = C2237k.m8966b(Class.forName("ld.a").getCanonicalName());
        } catch (Throwable th) {
            C2237k.a aVar2 = C2237k.f8865i;
            m8966b = C2237k.m8966b(C2238l.m8974a(th));
        }
        if (C2237k.m8968d(m8966b) != null) {
            m8966b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f9974b = (String) m8966b;
        try {
            C2237k.a aVar3 = C2237k.f8865i;
            m8966b2 = C2237k.m8966b(C2536k0.class.getCanonicalName());
        } catch (Throwable th2) {
            C2237k.a aVar4 = C2237k.f8865i;
            m8966b2 = C2237k.m8966b(C2238l.m8974a(th2));
        }
        if (C2237k.m8968d(m8966b2) != null) {
            m8966b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f9975c = (String) m8966b2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Throwable m10090a(Throwable th, InterfaceC3471e interfaceC3471e) {
        return m10098i(th, interfaceC3471e);
    }

    /* renamed from: b */
    public static final <E extends Throwable> C2236j<E, StackTraceElement[]> m10091b(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause == null || !C4753m.m18648a(cause.getClass(), e10.getClass())) {
            return C2240n.m8977a(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (m10096g(stackTrace[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        return z10 ? C2240n.m8977a(cause, stackTrace) : C2240n.m8977a(e10, new StackTraceElement[0]);
    }

    /* renamed from: c */
    public static final <E extends Throwable> E m10092c(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f9973a);
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int m10095f = m10095f(stackTrace, f9974b);
        int i10 = 0;
        if (m10095f == -1) {
            e11.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + m10095f];
        for (int i11 = 0; i11 < m10095f; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + m10095f] = it.next();
            i10++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    /* renamed from: d */
    public static final ArrayDeque<StackTraceElement> m10093d(InterfaceC3471e interfaceC3471e) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = interfaceC3471e.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            interfaceC3471e = interfaceC3471e.getCallerFrame();
            if (interfaceC3471e == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = interfaceC3471e.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: e */
    public static final boolean m10094e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C4753m.m18648a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C4753m.m18648a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C4753m.m18648a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: f */
    public static final int m10095f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (C4753m.m18648a(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static final boolean m10096g(StackTraceElement stackTraceElement) {
        return C0108n.m433s(stackTraceElement.getClassName(), C0002b.m5c(), false, 2, null);
    }

    /* renamed from: h */
    public static final void m10097h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (m10096g(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (m10094e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* renamed from: i */
    public static final <E extends Throwable> E m10098i(E e10, InterfaceC3471e interfaceC3471e) {
        C2236j m10091b = m10091b(e10);
        Throwable th = (Throwable) m10091b.m8961a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m10091b.m8962b();
        Throwable m10128g = C2543o.m10128g(th);
        if (m10128g == null) {
            return e10;
        }
        ArrayDeque<StackTraceElement> m10093d = m10093d(interfaceC3471e);
        if (m10093d.isEmpty()) {
            return e10;
        }
        if (th != e10) {
            m10097h(stackTraceElementArr, m10093d);
        }
        return (E) m10092c(th, m10128g, m10093d);
    }

    /* renamed from: j */
    public static final <E extends Throwable> E m10099j(E e10) {
        Throwable m10128g;
        return (C1101t0.m4576d() && (m10128g = C2543o.m10128g(e10)) != null) ? (E) m10100k(m10128g) : e10;
    }

    /* renamed from: k */
    public static final <E extends Throwable> E m10100k(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i10 = length2 - 1;
                if (C4753m.m18648a(f9975c, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length2 = i10;
            }
        }
        length2 = -1;
        int i11 = length2 + 1;
        int m10095f = m10095f(stackTrace, f9974b);
        int i12 = 0;
        int i13 = (length - length2) - (m10095f == -1 ? 0 : length - m10095f);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i13];
        while (i12 < i13) {
            stackTraceElementArr[i12] = i12 == 0 ? f9973a : stackTrace[(i11 + i12) - 1];
            i12++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    /* renamed from: l */
    public static final <E extends Throwable> E m10101l(E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && C4753m.m18648a(e11.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (m10096g(stackTrace[i10])) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return e11;
            }
        }
        return e10;
    }
}
