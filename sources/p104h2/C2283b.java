package p104h2;

/* renamed from: h2.b */
/* loaded from: classes.dex */
public class C2283b {

    /* renamed from: a */
    public boolean f9175a;

    /* renamed from: b */
    public boolean f9176b;

    /* renamed from: c */
    public boolean f9177c;

    /* renamed from: d */
    public boolean f9178d;

    public C2283b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f9175a = z10;
        this.f9176b = z11;
        this.f9177c = z12;
        this.f9178d = z13;
    }

    /* renamed from: a */
    public boolean m9285a() {
        return this.f9175a;
    }

    /* renamed from: b */
    public boolean m9286b() {
        return this.f9177c;
    }

    /* renamed from: c */
    public boolean m9287c() {
        return this.f9178d;
    }

    /* renamed from: d */
    public boolean m9288d() {
        return this.f9176b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2283b)) {
            return false;
        }
        C2283b c2283b = (C2283b) obj;
        return this.f9175a == c2283b.f9175a && this.f9176b == c2283b.f9176b && this.f9177c == c2283b.f9177c && this.f9178d == c2283b.f9178d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f9175a;
        int i10 = r02;
        if (this.f9176b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f9177c) {
            i11 = i10 + 256;
        }
        return this.f9178d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f9175a), Boolean.valueOf(this.f9176b), Boolean.valueOf(this.f9177c), Boolean.valueOf(this.f9178d));
    }
}
