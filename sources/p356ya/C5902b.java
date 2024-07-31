package p356ya;

import java.util.Objects;
import p340xa.C5742b;
import p340xa.C5743c;

/* renamed from: ya.b */
/* loaded from: classes.dex */
public final class C5902b {

    /* renamed from: a */
    public final C5742b f21972a;

    /* renamed from: b */
    public final C5742b f21973b;

    /* renamed from: c */
    public final C5743c f21974c;

    public C5902b(C5742b c5742b, C5742b c5742b2, C5743c c5743c) {
        this.f21972a = c5742b;
        this.f21973b = c5742b2;
        this.f21974c = c5743c;
    }

    /* renamed from: a */
    public C5743c m23607a() {
        return this.f21974c;
    }

    /* renamed from: b */
    public C5742b m23608b() {
        return this.f21972a;
    }

    /* renamed from: c */
    public C5742b m23609c() {
        return this.f21973b;
    }

    /* renamed from: d */
    public boolean m23610d() {
        return this.f21973b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5902b)) {
            return false;
        }
        C5902b c5902b = (C5902b) obj;
        return Objects.equals(this.f21972a, c5902b.f21972a) && Objects.equals(this.f21973b, c5902b.f21973b) && Objects.equals(this.f21974c, c5902b.f21974c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f21972a) ^ Objects.hashCode(this.f21973b)) ^ Objects.hashCode(this.f21974c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        sb2.append(this.f21972a);
        sb2.append(" , ");
        sb2.append(this.f21973b);
        sb2.append(" : ");
        C5743c c5743c = this.f21974c;
        sb2.append(c5743c == null ? "null" : Integer.valueOf(c5743c.m22855c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
