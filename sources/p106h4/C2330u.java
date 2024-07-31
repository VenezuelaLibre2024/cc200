package p106h4;

import java.util.Arrays;
import p222p5.C4014a;

/* renamed from: h4.u */
/* loaded from: classes.dex */
public final class C2330u {

    /* renamed from: a */
    public final int f9547a;

    /* renamed from: b */
    public boolean f9548b;

    /* renamed from: c */
    public boolean f9549c;

    /* renamed from: d */
    public byte[] f9550d;

    /* renamed from: e */
    public int f9551e;

    public C2330u(int i10, int i11) {
        this.f9547a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f9550d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m9483a(byte[] bArr, int i10, int i11) {
        if (this.f9548b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f9550d;
            int length = bArr2.length;
            int i13 = this.f9551e;
            if (length < i13 + i12) {
                this.f9550d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f9550d, this.f9551e, i12);
            this.f9551e += i12;
        }
    }

    /* renamed from: b */
    public boolean m9484b(int i10) {
        if (!this.f9548b) {
            return false;
        }
        this.f9551e -= i10;
        this.f9548b = false;
        this.f9549c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m9485c() {
        return this.f9549c;
    }

    /* renamed from: d */
    public void m9486d() {
        this.f9548b = false;
        this.f9549c = false;
    }

    /* renamed from: e */
    public void m9487e(int i10) {
        C4014a.m15200f(!this.f9548b);
        boolean z10 = i10 == this.f9547a;
        this.f9548b = z10;
        if (z10) {
            this.f9551e = 3;
            this.f9549c = false;
        }
    }
}
