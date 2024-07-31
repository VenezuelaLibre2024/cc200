package td;

import gd.InterfaceC2228b;
import sd.InterfaceC4569a;
import sd.InterfaceC4570b;
import sd.InterfaceC4571c;
import sd.InterfaceC4572d;
import sd.InterfaceC4573e;
import sd.InterfaceC4574f;
import sd.InterfaceC4575g;
import sd.InterfaceC4576h;
import sd.InterfaceC4577i;
import sd.InterfaceC4578j;
import sd.InterfaceC4579k;
import sd.InterfaceC4580l;
import sd.InterfaceC4581m;
import sd.InterfaceC4582n;
import sd.InterfaceC4583o;
import sd.InterfaceC4584p;
import sd.InterfaceC4585q;
import sd.InterfaceC4586r;
import sd.InterfaceC4587s;
import sd.InterfaceC4588t;
import sd.InterfaceC4589u;
import sd.InterfaceC4590v;
import sd.InterfaceC4591w;

/* renamed from: td.a0 */
/* loaded from: classes2.dex */
public class C4741a0 {
    /* renamed from: a */
    public static Object m18631a(Object obj, int i10) {
        if (obj != null && !m18633c(obj, i10)) {
            m18636f(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: b */
    public static int m18632b(Object obj) {
        if (obj instanceof InterfaceC4749i) {
            return ((InterfaceC4749i) obj).getArity();
        }
        if (obj instanceof InterfaceC4569a) {
            return 0;
        }
        if (obj instanceof InterfaceC4580l) {
            return 1;
        }
        if (obj instanceof InterfaceC4584p) {
            return 2;
        }
        if (obj instanceof InterfaceC4585q) {
            return 3;
        }
        if (obj instanceof InterfaceC4586r) {
            return 4;
        }
        if (obj instanceof InterfaceC4587s) {
            return 5;
        }
        if (obj instanceof InterfaceC4588t) {
            return 6;
        }
        if (obj instanceof InterfaceC4589u) {
            return 7;
        }
        if (obj instanceof InterfaceC4590v) {
            return 8;
        }
        if (obj instanceof InterfaceC4591w) {
            return 9;
        }
        if (obj instanceof InterfaceC4570b) {
            return 10;
        }
        if (obj instanceof InterfaceC4571c) {
            return 11;
        }
        if (obj instanceof InterfaceC4572d) {
            return 12;
        }
        if (obj instanceof InterfaceC4573e) {
            return 13;
        }
        if (obj instanceof InterfaceC4574f) {
            return 14;
        }
        if (obj instanceof InterfaceC4575g) {
            return 15;
        }
        if (obj instanceof InterfaceC4576h) {
            return 16;
        }
        if (obj instanceof InterfaceC4577i) {
            return 17;
        }
        if (obj instanceof InterfaceC4578j) {
            return 18;
        }
        if (obj instanceof InterfaceC4579k) {
            return 19;
        }
        if (obj instanceof InterfaceC4581m) {
            return 20;
        }
        if (obj instanceof InterfaceC4582n) {
            return 21;
        }
        return obj instanceof InterfaceC4583o ? 22 : -1;
    }

    /* renamed from: c */
    public static boolean m18633c(Object obj, int i10) {
        return (obj instanceof InterfaceC2228b) && m18632b(obj) == i10;
    }

    /* renamed from: d */
    public static <T extends Throwable> T m18634d(T t10) {
        return (T) C4753m.m18659l(t10, C4741a0.class.getName());
    }

    /* renamed from: e */
    public static ClassCastException m18635e(ClassCastException classCastException) {
        throw ((ClassCastException) m18634d(classCastException));
    }

    /* renamed from: f */
    public static void m18636f(Object obj, String str) {
        m18637g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: g */
    public static void m18637g(String str) {
        throw m18635e(new ClassCastException(str));
    }
}
