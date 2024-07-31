package p356ya;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ya.c */
/* loaded from: classes.dex */
public final class C5903c {

    /* renamed from: a */
    public final List<C5902b> f21975a;

    /* renamed from: b */
    public final int f21976b;

    public C5903c(List<C5902b> list, int i10) {
        this.f21975a = new ArrayList(list);
        this.f21976b = i10;
    }

    /* renamed from: a */
    public List<C5902b> m23611a() {
        return this.f21975a;
    }

    /* renamed from: b */
    public int m23612b() {
        return this.f21976b;
    }

    /* renamed from: c */
    public boolean m23613c(List<C5902b> list) {
        return this.f21975a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5903c) {
            return this.f21975a.equals(((C5903c) obj).f21975a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21975a.hashCode();
    }

    public String toString() {
        return "{ " + this.f21975a + " }";
    }
}
