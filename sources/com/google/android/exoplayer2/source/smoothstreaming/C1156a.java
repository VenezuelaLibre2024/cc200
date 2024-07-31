package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b;
import java.io.IOException;
import java.util.List;
import p032c5.C0613a;
import p077f4.C1826g;
import p077f4.C1834o;
import p077f4.C1835p;
import p193n5.C3732a0;
import p193n5.InterfaceC3752s;
import p206o5.C3918n;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p290u4.C4846b;
import p318w4.AbstractC5262b;
import p318w4.AbstractC5266f;
import p318w4.AbstractC5274n;
import p318w4.C5265e;
import p318w4.C5268h;
import p318w4.C5271k;
import p318w4.InterfaceC5267g;
import p318w4.InterfaceC5275o;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* loaded from: classes.dex */
public class C1156a implements InterfaceC1157b {

    /* renamed from: a */
    public final InterfaceC3903f0 f4349a;

    /* renamed from: b */
    public final int f4350b;

    /* renamed from: c */
    public final InterfaceC5267g[] f4351c;

    /* renamed from: d */
    public final InterfaceC3910j f4352d;

    /* renamed from: e */
    public InterfaceC3752s f4353e;

    /* renamed from: f */
    public C0613a f4354f;

    /* renamed from: g */
    public int f4355g;

    /* renamed from: h */
    public IOException f4356h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1157b.a {

        /* renamed from: a */
        public final InterfaceC3910j.a f4357a;

        public a(InterfaceC3910j.a aVar) {
            this.f4357a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b.a
        /* renamed from: a */
        public InterfaceC1157b mo4884a(InterfaceC3903f0 interfaceC3903f0, C0613a c0613a, int i10, InterfaceC3752s interfaceC3752s, InterfaceC3917m0 interfaceC3917m0) {
            InterfaceC3910j mo14830a = this.f4357a.mo14830a();
            if (interfaceC3917m0 != null) {
                mo14830a.mo14820g(interfaceC3917m0);
            }
            return new C1156a(interfaceC3903f0, c0613a, i10, interfaceC3752s, mo14830a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5262b {

        /* renamed from: e */
        public final C0613a.b f4358e;

        /* renamed from: f */
        public final int f4359f;

        public b(C0613a.b bVar, int i10, int i11) {
            super(i11, bVar.f2697k - 1);
            this.f4358e = bVar;
            this.f4359f = i10;
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: a */
        public long mo4832a() {
            m21303c();
            return this.f4358e.m3049e((int) m21304d());
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: b */
        public long mo4833b() {
            return mo4832a() + this.f4358e.m3047c((int) m21304d());
        }
    }

    public C1156a(InterfaceC3903f0 interfaceC3903f0, C0613a c0613a, int i10, InterfaceC3752s interfaceC3752s, InterfaceC3910j interfaceC3910j) {
        this.f4349a = interfaceC3903f0;
        this.f4354f = c0613a;
        this.f4350b = i10;
        this.f4353e = interfaceC3752s;
        this.f4352d = interfaceC3910j;
        C0613a.b bVar = c0613a.f2681f[i10];
        this.f4351c = new InterfaceC5267g[interfaceC3752s.length()];
        int i11 = 0;
        while (i11 < this.f4351c.length) {
            int mo14088d = interfaceC3752s.mo14088d(i11);
            C4463m1 c4463m1 = bVar.f2696j[mo14088d];
            C1835p[] c1835pArr = c4463m1.f16509v != null ? ((C0613a.a) C4014a.m15199e(c0613a.f2680e)).f2686c : null;
            int i12 = bVar.f2687a;
            int i13 = i11;
            this.f4351c[i13] = new C5265e(new C1826g(3, null, new C1834o(mo14088d, i12, bVar.f2689c, -9223372036854775807L, c0613a.f2682g, c4463m1, 0, c1835pArr, i12 == 2 ? 4 : 0, null, null)), bVar.f2687a, c4463m1);
            i11 = i13 + 1;
        }
    }

    /* renamed from: k */
    public static AbstractC5274n m4880k(C4463m1 c4463m1, InterfaceC3910j interfaceC3910j, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, InterfaceC5267g interfaceC5267g) {
        return new C5271k(interfaceC3910j, new C3918n(uri), c4463m1, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, interfaceC5267g);
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: a */
    public void mo4804a() {
        IOException iOException = this.f4356h;
        if (iOException != null) {
            throw iOException;
        }
        this.f4349a.mo4756a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b
    /* renamed from: b */
    public void mo4881b(InterfaceC3752s interfaceC3752s) {
        this.f4353e = interfaceC3752s;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b
    /* renamed from: c */
    public void mo4882c(C0613a c0613a) {
        C0613a.b[] bVarArr = this.f4354f.f2681f;
        int i10 = this.f4350b;
        C0613a.b bVar = bVarArr[i10];
        int i11 = bVar.f2697k;
        C0613a.b bVar2 = c0613a.f2681f[i10];
        if (i11 != 0 && bVar2.f2697k != 0) {
            int i12 = i11 - 1;
            long m3049e = bVar.m3049e(i12) + bVar.m3047c(i12);
            long m3049e2 = bVar2.m3049e(0);
            if (m3049e > m3049e2) {
                this.f4355g += bVar.m3048d(m3049e2);
                this.f4354f = c0613a;
            }
        }
        this.f4355g += i11;
        this.f4354f = c0613a;
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: d */
    public long mo4805d(long j10, C4465m3 c4465m3) {
        C0613a.b bVar = this.f4354f.f2681f[this.f4350b];
        int m3048d = bVar.m3048d(j10);
        long m3049e = bVar.m3049e(m3048d);
        return c4465m3.m17482a(j10, m3049e, (m3049e >= j10 || m3048d >= bVar.f2697k + (-1)) ? m3049e : bVar.m3049e(m3048d + 1));
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: f */
    public boolean mo4806f(long j10, AbstractC5266f abstractC5266f, List<? extends AbstractC5274n> list) {
        if (this.f4356h != null) {
            return false;
        }
        return this.f4353e.m14239t(j10, abstractC5266f, list);
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: g */
    public final void mo4807g(long j10, long j11, List<? extends AbstractC5274n> list, C5268h c5268h) {
        int mo21352g;
        long j12 = j11;
        if (this.f4356h != null) {
            return;
        }
        C0613a.b bVar = this.f4354f.f2681f[this.f4350b];
        if (bVar.f2697k == 0) {
            c5268h.f19976b = !r4.f2679d;
            return;
        }
        if (list.isEmpty()) {
            mo21352g = bVar.m3048d(j12);
        } else {
            mo21352g = (int) (list.get(list.size() - 1).mo21352g() - this.f4355g);
            if (mo21352g < 0) {
                this.f4356h = new C4846b();
                return;
            }
        }
        if (mo21352g >= bVar.f2697k) {
            c5268h.f19976b = !this.f4354f.f2679d;
            return;
        }
        long j13 = j12 - j10;
        long m4883l = m4883l(j10);
        int length = this.f4353e.length();
        InterfaceC5275o[] interfaceC5275oArr = new InterfaceC5275o[length];
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC5275oArr[i10] = new b(bVar, this.f4353e.mo14088d(i10), mo21352g);
        }
        this.f4353e.mo14062j(j10, j13, m4883l, list, interfaceC5275oArr);
        long m3049e = bVar.m3049e(mo21352g);
        long m3047c = m3049e + bVar.m3047c(mo21352g);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = mo21352g + this.f4355g;
        int mo14061g = this.f4353e.mo14061g();
        c5268h.f19975a = m4880k(this.f4353e.mo14093o(), this.f4352d, bVar.m3045a(this.f4353e.mo14088d(mo14061g), mo21352g), i11, m3049e, m3047c, j14, this.f4353e.mo14065p(), this.f4353e.mo14067r(), this.f4351c[mo14061g]);
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: h */
    public boolean mo4808h(AbstractC5266f abstractC5266f, boolean z10, InterfaceC3899d0.c cVar, InterfaceC3899d0 interfaceC3899d0) {
        InterfaceC3899d0.b mo14777c = interfaceC3899d0.mo14777c(C3732a0.m14073c(this.f4353e), cVar);
        if (z10 && mo14777c != null && mo14777c.f13989a == 2) {
            InterfaceC3752s interfaceC3752s = this.f4353e;
            if (interfaceC3752s.mo14090h(interfaceC3752s.mo14085a(abstractC5266f.f19969d), mo14777c.f13990b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: i */
    public void mo4809i(AbstractC5266f abstractC5266f) {
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: j */
    public int mo4810j(long j10, List<? extends AbstractC5274n> list) {
        return (this.f4356h != null || this.f4353e.length() < 2) ? list.size() : this.f4353e.mo14064m(j10, list);
    }

    /* renamed from: l */
    public final long m4883l(long j10) {
        C0613a c0613a = this.f4354f;
        if (!c0613a.f2679d) {
            return -9223372036854775807L;
        }
        C0613a.b bVar = c0613a.f2681f[this.f4350b];
        int i10 = bVar.f2697k - 1;
        return (bVar.m3049e(i10) + bVar.m3047c(i10)) - j10;
    }

    @Override // p318w4.InterfaceC5270j
    public void release() {
        for (InterfaceC5267g interfaceC5267g : this.f4351c) {
            interfaceC5267g.release();
        }
    }
}
