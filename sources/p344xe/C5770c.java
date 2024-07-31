package p344xe;

import bf.C0560f;
import se.C4596e;

/* renamed from: xe.c */
/* loaded from: classes2.dex */
public final class C5770c {

    /* renamed from: d */
    public static final C0560f f21366d = C0560f.m2859m(":");

    /* renamed from: e */
    public static final C0560f f21367e = C0560f.m2859m(":status");

    /* renamed from: f */
    public static final C0560f f21368f = C0560f.m2859m(":method");

    /* renamed from: g */
    public static final C0560f f21369g = C0560f.m2859m(":path");

    /* renamed from: h */
    public static final C0560f f21370h = C0560f.m2859m(":scheme");

    /* renamed from: i */
    public static final C0560f f21371i = C0560f.m2859m(":authority");

    /* renamed from: a */
    public final C0560f f21372a;

    /* renamed from: b */
    public final C0560f f21373b;

    /* renamed from: c */
    public final int f21374c;

    public C5770c(C0560f c0560f, C0560f c0560f2) {
        this.f21372a = c0560f;
        this.f21373b = c0560f2;
        this.f21374c = c0560f.mo2871u() + 32 + c0560f2.mo2871u();
    }

    public C5770c(C0560f c0560f, String str) {
        this(c0560f, C0560f.m2859m(str));
    }

    public C5770c(String str, String str2) {
        this(C0560f.m2859m(str), C0560f.m2859m(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5770c)) {
            return false;
        }
        C5770c c5770c = (C5770c) obj;
        return this.f21372a.equals(c5770c.f21372a) && this.f21373b.equals(c5770c.f21373b);
    }

    public int hashCode() {
        return ((527 + this.f21372a.hashCode()) * 31) + this.f21373b.hashCode();
    }

    public String toString() {
        return C4596e.m18108p("%s: %s", this.f21372a.mo2876z(), this.f21373b.mo2876z());
    }
}
