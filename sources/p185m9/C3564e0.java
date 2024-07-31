package p185m9;

import td.C4753m;

/* renamed from: m9.e0 */
/* loaded from: classes.dex */
public final class C3564e0 {

    /* renamed from: a */
    public final String f12547a;

    /* renamed from: b */
    public final String f12548b;

    /* renamed from: c */
    public final int f12549c;

    /* renamed from: d */
    public final long f12550d;

    /* renamed from: e */
    public final C3563e f12551e;

    /* renamed from: f */
    public final String f12552f;

    public C3564e0(String str, String str2, int i10, long j10, C3563e c3563e, String str3) {
        C4753m.m18653f(str, "sessionId");
        C4753m.m18653f(str2, "firstSessionId");
        C4753m.m18653f(c3563e, "dataCollectionStatus");
        C4753m.m18653f(str3, "firebaseInstallationId");
        this.f12547a = str;
        this.f12548b = str2;
        this.f12549c = i10;
        this.f12550d = j10;
        this.f12551e = c3563e;
        this.f12552f = str3;
    }

    /* renamed from: a */
    public final C3563e m13244a() {
        return this.f12551e;
    }

    /* renamed from: b */
    public final long m13245b() {
        return this.f12550d;
    }

    /* renamed from: c */
    public final String m13246c() {
        return this.f12552f;
    }

    /* renamed from: d */
    public final String m13247d() {
        return this.f12548b;
    }

    /* renamed from: e */
    public final String m13248e() {
        return this.f12547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3564e0)) {
            return false;
        }
        C3564e0 c3564e0 = (C3564e0) obj;
        return C4753m.m18648a(this.f12547a, c3564e0.f12547a) && C4753m.m18648a(this.f12548b, c3564e0.f12548b) && this.f12549c == c3564e0.f12549c && this.f12550d == c3564e0.f12550d && C4753m.m18648a(this.f12551e, c3564e0.f12551e) && C4753m.m18648a(this.f12552f, c3564e0.f12552f);
    }

    /* renamed from: f */
    public final int m13249f() {
        return this.f12549c;
    }

    public int hashCode() {
        return (((((((((this.f12547a.hashCode() * 31) + this.f12548b.hashCode()) * 31) + Integer.hashCode(this.f12549c)) * 31) + Long.hashCode(this.f12550d)) * 31) + this.f12551e.hashCode()) * 31) + this.f12552f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f12547a + ", firstSessionId=" + this.f12548b + ", sessionIndex=" + this.f12549c + ", eventTimestampUs=" + this.f12550d + ", dataCollectionStatus=" + this.f12551e + ", firebaseInstallationId=" + this.f12552f + ')';
    }
}
