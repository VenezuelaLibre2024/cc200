package p185m9;

import td.C4753m;

/* renamed from: m9.t */
/* loaded from: classes.dex */
public final class C3585t {

    /* renamed from: a */
    public final String f12601a;

    /* renamed from: b */
    public final int f12602b;

    /* renamed from: c */
    public final int f12603c;

    /* renamed from: d */
    public final boolean f12604d;

    public C3585t(String str, int i10, int i11, boolean z10) {
        C4753m.m18653f(str, "processName");
        this.f12601a = str;
        this.f12602b = i10;
        this.f12603c = i11;
        this.f12604d = z10;
    }

    /* renamed from: a */
    public final int m13282a() {
        return this.f12603c;
    }

    /* renamed from: b */
    public final int m13283b() {
        return this.f12602b;
    }

    /* renamed from: c */
    public final String m13284c() {
        return this.f12601a;
    }

    /* renamed from: d */
    public final boolean m13285d() {
        return this.f12604d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3585t)) {
            return false;
        }
        C3585t c3585t = (C3585t) obj;
        return C4753m.m18648a(this.f12601a, c3585t.f12601a) && this.f12602b == c3585t.f12602b && this.f12603c == c3585t.f12603c && this.f12604d == c3585t.f12604d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f12601a.hashCode() * 31) + Integer.hashCode(this.f12602b)) * 31) + Integer.hashCode(this.f12603c)) * 31;
        boolean z10 = this.f12604d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f12601a + ", pid=" + this.f12602b + ", importance=" + this.f12603c + ", isDefaultProcess=" + this.f12604d + ')';
    }
}
