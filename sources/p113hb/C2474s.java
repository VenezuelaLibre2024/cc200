package p113hb;

/* renamed from: hb.s */
/* loaded from: classes.dex */
public class C2474s implements Comparable<C2474s> {

    /* renamed from: h */
    public final int f9897h;

    /* renamed from: i */
    public final int f9898i;

    public C2474s(int i10, int i11) {
        this.f9897h = i10;
        this.f9898i = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2474s c2474s) {
        int i10 = this.f9898i * this.f9897h;
        int i11 = c2474s.f9898i * c2474s.f9897h;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    /* renamed from: c */
    public C2474s m9864c() {
        return new C2474s(this.f9898i, this.f9897h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2474s c2474s = (C2474s) obj;
        return this.f9897h == c2474s.f9897h && this.f9898i == c2474s.f9898i;
    }

    /* renamed from: f */
    public C2474s m9865f(C2474s c2474s) {
        int i10 = this.f9897h;
        int i11 = c2474s.f9898i;
        int i12 = i10 * i11;
        int i13 = c2474s.f9897h;
        int i14 = this.f9898i;
        return i12 <= i13 * i14 ? new C2474s(i13, (i14 * i13) / i10) : new C2474s((i10 * i11) / i14, i11);
    }

    /* renamed from: h */
    public C2474s m9866h(C2474s c2474s) {
        int i10 = this.f9897h;
        int i11 = c2474s.f9898i;
        int i12 = i10 * i11;
        int i13 = c2474s.f9897h;
        int i14 = this.f9898i;
        return i12 >= i13 * i14 ? new C2474s(i13, (i14 * i13) / i10) : new C2474s((i10 * i11) / i14, i11);
    }

    public int hashCode() {
        return (this.f9897h * 31) + this.f9898i;
    }

    public String toString() {
        return this.f9897h + "x" + this.f9898i;
    }
}
