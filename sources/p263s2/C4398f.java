package p263s2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: s2.f */
/* loaded from: classes.dex */
public class C4398f {

    /* renamed from: a */
    public final String f16124a;

    /* renamed from: b */
    public final C4398f f16125b;

    /* renamed from: c */
    public final String f16126c;

    /* renamed from: d */
    public final C4398f[] f16127d;

    /* renamed from: e */
    public final C4397e[] f16128e;

    public C4398f(Throwable th) {
        this(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public C4398f(Throwable th, Set<Throwable> set) {
        set.add(th);
        this.f16124a = th.getMessage();
        this.f16125b = (th.getCause() == null || set.contains(th.getCause())) ? null : new C4398f(th.getCause(), set);
        this.f16126c = th.getClass().getName();
        Throwable[] suppressed = th.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!set.contains(suppressed[i10])) {
                linkedList.add(new C4398f(suppressed[i10], set));
            }
        }
        this.f16127d = (C4398f[]) linkedList.toArray(new C4398f[0]);
        StackTraceElement[] stackTrace = th.getStackTrace();
        this.f16128e = new C4397e[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f16128e[i11] = new C4397e(stackTrace[i11]);
        }
    }

    /* renamed from: a */
    public C4398f m17011a() {
        return this.f16125b;
    }

    /* renamed from: b */
    public String m17012b() {
        return this.f16126c;
    }

    /* renamed from: c */
    public String m17013c() {
        return this.f16124a;
    }

    /* renamed from: d */
    public C4397e[] m17014d() {
        return this.f16128e;
    }

    /* renamed from: e */
    public C4398f[] m17015e() {
        return this.f16127d;
    }
}
