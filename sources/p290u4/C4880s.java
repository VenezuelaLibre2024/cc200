package p290u4;

/* renamed from: u4.s */
/* loaded from: classes.dex */
public class C4880s {

    /* renamed from: a */
    public final Object f18457a;

    /* renamed from: b */
    public final int f18458b;

    /* renamed from: c */
    public final int f18459c;

    /* renamed from: d */
    public final long f18460d;

    /* renamed from: e */
    public final int f18461e;

    public C4880s(Object obj) {
        this(obj, -1L);
    }

    public C4880s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public C4880s(Object obj, int i10, int i11, long j10, int i12) {
        this.f18457a = obj;
        this.f18458b = i10;
        this.f18459c = i11;
        this.f18460d = j10;
        this.f18461e = i12;
    }

    public C4880s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C4880s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public C4880s(C4880s c4880s) {
        this.f18457a = c4880s.f18457a;
        this.f18458b = c4880s.f18458b;
        this.f18459c = c4880s.f18459c;
        this.f18460d = c4880s.f18460d;
        this.f18461e = c4880s.f18461e;
    }

    /* renamed from: a */
    public C4880s m19437a(Object obj) {
        return this.f18457a.equals(obj) ? this : new C4880s(obj, this.f18458b, this.f18459c, this.f18460d, this.f18461e);
    }

    /* renamed from: b */
    public boolean m19438b() {
        return this.f18458b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4880s)) {
            return false;
        }
        C4880s c4880s = (C4880s) obj;
        return this.f18457a.equals(c4880s.f18457a) && this.f18458b == c4880s.f18458b && this.f18459c == c4880s.f18459c && this.f18460d == c4880s.f18460d && this.f18461e == c4880s.f18461e;
    }

    public int hashCode() {
        return ((((((((527 + this.f18457a.hashCode()) * 31) + this.f18458b) * 31) + this.f18459c) * 31) + ((int) this.f18460d)) * 31) + this.f18461e;
    }
}
