package p333x3;

import java.util.Arrays;
import p222p5.C4041n0;
import p333x3.InterfaceC5586z;

/* renamed from: x3.c */
/* loaded from: classes.dex */
public final class C5560c implements InterfaceC5586z {

    /* renamed from: a */
    public final int f20857a;

    /* renamed from: b */
    public final int[] f20858b;

    /* renamed from: c */
    public final long[] f20859c;

    /* renamed from: d */
    public final long[] f20860d;

    /* renamed from: e */
    public final long[] f20861e;

    /* renamed from: f */
    public final long f20862f;

    public C5560c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20858b = iArr;
        this.f20859c = jArr;
        this.f20860d = jArr2;
        this.f20861e = jArr3;
        int length = iArr.length;
        this.f20857a = length;
        if (length > 0) {
            this.f20862f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f20862f = 0L;
        }
    }

    /* renamed from: b */
    public int m22409b(long j10) {
        return C4041n0.m15461i(this.f20861e, j10, true, true);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f20862f;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        int m22409b = m22409b(j10);
        C5557a0 c5557a0 = new C5557a0(this.f20861e[m22409b], this.f20859c[m22409b]);
        if (c5557a0.f20851a >= j10 || m22409b == this.f20857a - 1) {
            return new InterfaceC5586z.a(c5557a0);
        }
        int i10 = m22409b + 1;
        return new InterfaceC5586z.a(c5557a0, new C5557a0(this.f20861e[i10], this.f20859c[i10]));
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f20857a + ", sizes=" + Arrays.toString(this.f20858b) + ", offsets=" + Arrays.toString(this.f20859c) + ", timeUs=" + Arrays.toString(this.f20861e) + ", durationsUs=" + Arrays.toString(this.f20860d) + ")";
    }
}
