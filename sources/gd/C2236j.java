package gd;

import java.io.Serializable;
import td.C4753m;

/* renamed from: gd.j */
/* loaded from: classes2.dex */
public final class C2236j<A, B> implements Serializable {

    /* renamed from: h */
    public final A f8863h;

    /* renamed from: i */
    public final B f8864i;

    public C2236j(A a10, B b10) {
        this.f8863h = a10;
        this.f8864i = b10;
    }

    /* renamed from: a */
    public final A m8961a() {
        return this.f8863h;
    }

    /* renamed from: b */
    public final B m8962b() {
        return this.f8864i;
    }

    /* renamed from: c */
    public final A m8963c() {
        return this.f8863h;
    }

    /* renamed from: d */
    public final B m8964d() {
        return this.f8864i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2236j)) {
            return false;
        }
        C2236j c2236j = (C2236j) obj;
        return C4753m.m18648a(this.f8863h, c2236j.f8863h) && C4753m.m18648a(this.f8864i, c2236j.f8864i);
    }

    public int hashCode() {
        A a10 = this.f8863h;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8864i;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f8863h + ", " + this.f8864i + ')';
    }
}
