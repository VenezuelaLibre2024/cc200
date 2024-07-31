package p129ia;

/* renamed from: ia.h */
/* loaded from: classes.dex */
public abstract class AbstractC2676h {

    /* renamed from: a */
    public final int f10455a;

    /* renamed from: b */
    public final int f10456b;

    public AbstractC2676h(int i10, int i11) {
        this.f10455a = i10;
        this.f10456b = i11;
    }

    /* renamed from: a */
    public final int m10890a() {
        return this.f10456b;
    }

    /* renamed from: b */
    public abstract byte[] mo10885b();

    /* renamed from: c */
    public abstract byte[] mo10886c(int i10, byte[] bArr);

    /* renamed from: d */
    public final int m10891d() {
        return this.f10455a;
    }

    /* renamed from: e */
    public AbstractC2676h mo10887e() {
        return new C2675g(this);
    }

    /* renamed from: f */
    public boolean mo10888f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC2676h mo10889g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f10455a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f10456b * (i10 + 1));
        for (int i11 = 0; i11 < this.f10456b; i11++) {
            bArr = mo10886c(i11, bArr);
            for (int i12 = 0; i12 < this.f10455a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
