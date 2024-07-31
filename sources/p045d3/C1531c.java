package p045d3;

import java.util.Objects;

/* renamed from: d3.c */
/* loaded from: classes.dex */
public final class C1531c {

    /* renamed from: a */
    public final String f5627a;

    public C1531c(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f5627a = str;
    }

    /* renamed from: b */
    public static C1531c m6232b(String str) {
        return new C1531c(str);
    }

    /* renamed from: a */
    public String m6233a() {
        return this.f5627a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1531c) {
            return this.f5627a.equals(((C1531c) obj).f5627a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5627a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f5627a + "\"}";
    }
}
