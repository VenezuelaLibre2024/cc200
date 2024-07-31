package sc;

/* renamed from: sc.c */
/* loaded from: classes2.dex */
public class C4567c {

    /* renamed from: a */
    public int f17218a;

    /* renamed from: b */
    public int f17219b;

    /* renamed from: c */
    public int f17220c;

    public C4567c(int i10, int i11, int i12) {
        this.f17218a = i10;
        this.f17219b = i11;
        this.f17220c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4567c c4567c = (C4567c) obj;
        return this.f17218a == c4567c.f17218a && this.f17219b == c4567c.f17219b && this.f17220c == c4567c.f17220c;
    }

    public int hashCode() {
        return (((this.f17218a * 31) + this.f17219b) * 31) + this.f17220c;
    }
}
