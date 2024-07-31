package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b;
import java.util.ArrayList;
import p032c5.C0613a;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3917m0;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4871n0;
import p290u4.InterfaceC4878r;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p318w4.C5269i;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* loaded from: classes.dex */
public final class C1158c implements InterfaceC4878r, InterfaceC4871n0.a<C5269i<InterfaceC1157b>> {

    /* renamed from: h */
    public final InterfaceC1157b.a f4360h;

    /* renamed from: i */
    public final InterfaceC3917m0 f4361i;

    /* renamed from: j */
    public final InterfaceC3903f0 f4362j;

    /* renamed from: k */
    public final InterfaceC5256v f4363k;

    /* renamed from: l */
    public final InterfaceC5255u.a f4364l;

    /* renamed from: m */
    public final InterfaceC3899d0 f4365m;

    /* renamed from: n */
    public final InterfaceC4845a0.a f4366n;

    /* renamed from: o */
    public final InterfaceC3894b f4367o;

    /* renamed from: p */
    public final C4885u0 f4368p;

    /* renamed from: q */
    public final InterfaceC4858h f4369q;

    /* renamed from: r */
    public InterfaceC4878r.a f4370r;

    /* renamed from: s */
    public C0613a f4371s;

    /* renamed from: t */
    public C5269i<InterfaceC1157b>[] f4372t;

    /* renamed from: u */
    public InterfaceC4871n0 f4373u;

    public C1158c(C0613a c0613a, InterfaceC1157b.a aVar, InterfaceC3917m0 interfaceC3917m0, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar2, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar3, InterfaceC3903f0 interfaceC3903f0, InterfaceC3894b interfaceC3894b) {
        this.f4371s = c0613a;
        this.f4360h = aVar;
        this.f4361i = interfaceC3917m0;
        this.f4362j = interfaceC3903f0;
        this.f4363k = interfaceC5256v;
        this.f4364l = aVar2;
        this.f4365m = interfaceC3899d0;
        this.f4366n = aVar3;
        this.f4367o = interfaceC3894b;
        this.f4369q = interfaceC4858h;
        this.f4368p = m4885n(c0613a, interfaceC5256v);
        C5269i<InterfaceC1157b>[] m4886o = m4886o(0);
        this.f4372t = m4886o;
        this.f4373u = interfaceC4858h.mo19317a(m4886o);
    }

    /* renamed from: n */
    public static C4885u0 m4885n(C0613a c0613a, InterfaceC5256v interfaceC5256v) {
        C4881s0[] c4881s0Arr = new C4881s0[c0613a.f2681f.length];
        int i10 = 0;
        while (true) {
            C0613a.b[] bVarArr = c0613a.f2681f;
            if (i10 >= bVarArr.length) {
                return new C4885u0(c4881s0Arr);
            }
            C4463m1[] c4463m1Arr = bVarArr[i10].f2696j;
            C4463m1[] c4463m1Arr2 = new C4463m1[c4463m1Arr.length];
            for (int i11 = 0; i11 < c4463m1Arr.length; i11++) {
                C4463m1 c4463m1 = c4463m1Arr[i11];
                c4463m1Arr2[i11] = c4463m1.m17412c(interfaceC5256v.mo21232e(c4463m1));
            }
            c4881s0Arr[i10] = new C4881s0(Integer.toString(i10), c4463m1Arr2);
            i10++;
        }
    }

    /* renamed from: o */
    public static C5269i<InterfaceC1157b>[] m4886o(int i10) {
        return new C5269i[i10];
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        return this.f4373u.mo4785b();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        return this.f4373u.mo4786c(j10);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        for (C5269i<InterfaceC1157b> c5269i : this.f4372t) {
            if (c5269i.f19981h == 2) {
                return c5269i.m21348d(j10, c4465m3);
            }
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        return this.f4373u.mo4789f();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        this.f4373u.mo4790g(j10);
    }

    /* renamed from: h */
    public final C5269i<InterfaceC1157b> m4887h(InterfaceC3752s interfaceC3752s, long j10) {
        int m19453c = this.f4368p.m19453c(interfaceC3752s.mo14086b());
        return new C5269i<>(this.f4371s.f2681f[m19453c].f2687a, null, null, this.f4360h.mo4884a(this.f4362j, this.f4371s, m19453c, interfaceC3752s, this.f4361i), this, this.f4367o, j10, this.f4363k, this.f4364l, this.f4365m, this.f4366n);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f4370r = aVar;
        aVar.mo17309k(this);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f4373u.isLoading();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        this.f4362j.mo4756a();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    public long mo4794m(long j10) {
        for (C5269i<InterfaceC1157b> c5269i : this.f4372t) {
            c5269i.m21346R(j10);
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: p */
    public long mo4795p() {
        return -9223372036854775807L;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: q */
    public long mo4796q(InterfaceC3752s[] interfaceC3752sArr, boolean[] zArr, InterfaceC4869m0[] interfaceC4869m0Arr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < interfaceC3752sArr.length; i10++) {
            if (interfaceC4869m0Arr[i10] != null) {
                C5269i c5269i = (C5269i) interfaceC4869m0Arr[i10];
                if (interfaceC3752sArr[i10] == null || !zArr[i10]) {
                    c5269i.m21343O();
                    interfaceC4869m0Arr[i10] = null;
                } else {
                    ((InterfaceC1157b) c5269i.m21332D()).mo4881b(interfaceC3752sArr[i10]);
                    arrayList.add(c5269i);
                }
            }
            if (interfaceC4869m0Arr[i10] == null && interfaceC3752sArr[i10] != null) {
                C5269i<InterfaceC1157b> m4887h = m4887h(interfaceC3752sArr[i10], j10);
                arrayList.add(m4887h);
                interfaceC4869m0Arr[i10] = m4887h;
                zArr2[i10] = true;
            }
        }
        C5269i<InterfaceC1157b>[] m4886o = m4886o(arrayList.size());
        this.f4372t = m4886o;
        arrayList.toArray(m4886o);
        this.f4373u = this.f4369q.mo19317a(this.f4372t);
        return j10;
    }

    @Override // p290u4.InterfaceC4871n0.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo4788e(C5269i<InterfaceC1157b> c5269i) {
        this.f4370r.mo4788e(this);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        return this.f4368p;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        for (C5269i<InterfaceC1157b> c5269i : this.f4372t) {
            c5269i.m21349t(j10, z10);
        }
    }

    /* renamed from: u */
    public void m4889u() {
        for (C5269i<InterfaceC1157b> c5269i : this.f4372t) {
            c5269i.m21343O();
        }
        this.f4370r = null;
    }

    /* renamed from: v */
    public void m4890v(C0613a c0613a) {
        this.f4371s = c0613a;
        for (C5269i<InterfaceC1157b> c5269i : this.f4372t) {
            c5269i.m21332D().mo4882c(c0613a);
        }
        this.f4370r.mo4788e(this);
    }
}
