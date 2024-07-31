package p318w4;

import java.util.Arrays;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p222p5.C4041n0;
import p264s3.C4463m1;

/* renamed from: w4.l */
/* loaded from: classes.dex */
public abstract class AbstractC5272l extends AbstractC5266f {

    /* renamed from: j */
    public byte[] f20011j;

    /* renamed from: k */
    public volatile boolean f20012k;

    public AbstractC5272l(InterfaceC3910j interfaceC3910j, C3918n c3918n, int i10, C4463m1 c4463m1, int i11, Object obj, byte[] bArr) {
        super(interfaceC3910j, c3918n, i10, c4463m1, i11, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC5272l abstractC5272l;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C4041n0.f14518f;
            abstractC5272l = this;
        } else {
            abstractC5272l = this;
            bArr2 = bArr;
        }
        abstractC5272l.f20011j = bArr2;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public final void mo14817b() {
        try {
            this.f19974i.mo14770k(this.f19967b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f20012k) {
                m21357i(i11);
                i10 = this.f19974i.mo14769c(this.f20011j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f20012k) {
                mo21355g(this.f20011j, i11);
            }
        } finally {
            C3916m.m14847a(this.f19974i);
        }
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public final void mo14818c() {
        this.f20012k = true;
    }

    /* renamed from: g */
    public abstract void mo21355g(byte[] bArr, int i10);

    /* renamed from: h */
    public byte[] m21356h() {
        return this.f20011j;
    }

    /* renamed from: i */
    public final void m21357i(int i10) {
        byte[] bArr = this.f20011j;
        if (bArr.length < i10 + 16384) {
            this.f20011j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
