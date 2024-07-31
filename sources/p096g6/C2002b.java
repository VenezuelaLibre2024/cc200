package p096g6;

import p079f6.C1841a;
import p079f6.C1841a.d;
import p108h6.C2388q;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public final class C2002b<O extends C1841a.d> {

    /* renamed from: a */
    public final int f7990a;

    /* renamed from: b */
    public final C1841a f7991b;

    /* renamed from: c */
    public final C1841a.d f7992c;

    /* renamed from: d */
    public final String f7993d;

    public C2002b(C1841a c1841a, C1841a.d dVar, String str) {
        this.f7991b = c1841a;
        this.f7992c = dVar;
        this.f7993d = str;
        this.f7990a = C2388q.m9593c(c1841a, dVar, str);
    }

    /* renamed from: a */
    public static <O extends C1841a.d> C2002b<O> m8084a(C1841a<O> c1841a, O o10, String str) {
        return new C2002b<>(c1841a, o10, str);
    }

    /* renamed from: b */
    public final String m8085b() {
        return this.f7991b.m7580c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2002b)) {
            return false;
        }
        C2002b c2002b = (C2002b) obj;
        return C2388q.m9592b(this.f7991b, c2002b.f7991b) && C2388q.m9592b(this.f7992c, c2002b.f7992c) && C2388q.m9592b(this.f7993d, c2002b.f7993d);
    }

    public final int hashCode() {
        return this.f7990a;
    }
}
