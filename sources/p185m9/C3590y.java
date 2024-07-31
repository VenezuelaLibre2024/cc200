package p185m9;

import td.C4753m;

/* renamed from: m9.y */
/* loaded from: classes.dex */
public final class C3590y {

    /* renamed from: a */
    public final String f12641a;

    /* renamed from: b */
    public final String f12642b;

    /* renamed from: c */
    public final int f12643c;

    /* renamed from: d */
    public final long f12644d;

    public C3590y(String str, String str2, int i10, long j10) {
        C4753m.m18653f(str, "sessionId");
        C4753m.m18653f(str2, "firstSessionId");
        this.f12641a = str;
        this.f12642b = str2;
        this.f12643c = i10;
        this.f12644d = j10;
    }

    /* renamed from: a */
    public final String m13310a() {
        return this.f12642b;
    }

    /* renamed from: b */
    public final String m13311b() {
        return this.f12641a;
    }

    /* renamed from: c */
    public final int m13312c() {
        return this.f12643c;
    }

    /* renamed from: d */
    public final long m13313d() {
        return this.f12644d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3590y)) {
            return false;
        }
        C3590y c3590y = (C3590y) obj;
        return C4753m.m18648a(this.f12641a, c3590y.f12641a) && C4753m.m18648a(this.f12642b, c3590y.f12642b) && this.f12643c == c3590y.f12643c && this.f12644d == c3590y.f12644d;
    }

    public int hashCode() {
        return (((((this.f12641a.hashCode() * 31) + this.f12642b.hashCode()) * 31) + Integer.hashCode(this.f12643c)) * 31) + Long.hashCode(this.f12644d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f12641a + ", firstSessionId=" + this.f12642b + ", sessionIndex=" + this.f12643c + ", sessionStartTimestampUs=" + this.f12644d + ')';
    }
}
