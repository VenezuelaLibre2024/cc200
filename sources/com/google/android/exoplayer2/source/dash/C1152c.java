package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.C1153d;
import com.google.android.exoplayer2.source.dash.InterfaceC1150a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p193n5.InterfaceC3752s;
import p206o5.C3893a0;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p275t3.C4674s1;
import p290u4.C4846b;
import p318w4.AbstractC5262b;
import p318w4.AbstractC5266f;
import p318w4.AbstractC5274n;
import p318w4.C5265e;
import p318w4.C5268h;
import p318w4.C5271k;
import p318w4.C5273m;
import p318w4.C5276p;
import p318w4.InterfaceC5267g;
import p318w4.InterfaceC5275o;
import p333x3.C5560c;
import p334x4.C5588b;
import p334x4.C5593g;
import p334x4.C5594h;
import p334x4.InterfaceC5592f;
import p350y4.AbstractC5809j;
import p350y4.C5800a;
import p350y4.C5801b;
import p350y4.C5802c;
import p350y4.C5808i;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* loaded from: classes.dex */
public class C1152c implements InterfaceC1150a {

    /* renamed from: a */
    public final InterfaceC3903f0 f4255a;

    /* renamed from: b */
    public final C5588b f4256b;

    /* renamed from: c */
    public final int[] f4257c;

    /* renamed from: d */
    public final int f4258d;

    /* renamed from: e */
    public final InterfaceC3910j f4259e;

    /* renamed from: f */
    public final long f4260f;

    /* renamed from: g */
    public final int f4261g;

    /* renamed from: h */
    public final C1153d.c f4262h;

    /* renamed from: i */
    public final b[] f4263i;

    /* renamed from: j */
    public InterfaceC3752s f4264j;

    /* renamed from: k */
    public C5802c f4265k;

    /* renamed from: l */
    public int f4266l;

    /* renamed from: m */
    public IOException f4267m;

    /* renamed from: n */
    public boolean f4268n;

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1150a.a {

        /* renamed from: a */
        public final InterfaceC3910j.a f4269a;

        /* renamed from: b */
        public final int f4270b;

        /* renamed from: c */
        public final InterfaceC5267g.a f4271c;

        public a(InterfaceC3910j.a aVar) {
            this(aVar, 1);
        }

        public a(InterfaceC3910j.a aVar, int i10) {
            this(C5265e.f19948q, aVar, i10);
        }

        public a(InterfaceC5267g.a aVar, InterfaceC3910j.a aVar2, int i10) {
            this.f4271c = aVar;
            this.f4269a = aVar2;
            this.f4270b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.InterfaceC1150a.a
        /* renamed from: a */
        public InterfaceC1150a mo4764a(InterfaceC3903f0 interfaceC3903f0, C5802c c5802c, C5588b c5588b, int i10, int[] iArr, InterfaceC3752s interfaceC3752s, int i11, long j10, boolean z10, List<C4463m1> list, C1153d.c cVar, InterfaceC3917m0 interfaceC3917m0, C4674s1 c4674s1) {
            InterfaceC3910j mo14830a = this.f4269a.mo14830a();
            if (interfaceC3917m0 != null) {
                mo14830a.mo14820g(interfaceC3917m0);
            }
            return new C1152c(this.f4271c, interfaceC3903f0, c5802c, c5588b, i10, iArr, interfaceC3752s, i11, mo14830a, j10, this.f4270b, z10, list, cVar, c4674s1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC5267g f4272a;

        /* renamed from: b */
        public final AbstractC5809j f4273b;

        /* renamed from: c */
        public final C5801b f4274c;

        /* renamed from: d */
        public final InterfaceC5592f f4275d;

        /* renamed from: e */
        public final long f4276e;

        /* renamed from: f */
        public final long f4277f;

        public b(long j10, AbstractC5809j abstractC5809j, C5801b c5801b, InterfaceC5267g interfaceC5267g, long j11, InterfaceC5592f interfaceC5592f) {
            this.f4276e = j10;
            this.f4273b = abstractC5809j;
            this.f4274c = c5801b;
            this.f4277f = j11;
            this.f4272a = interfaceC5267g;
            this.f4275d = interfaceC5592f;
        }

        /* renamed from: b */
        public b m4820b(long j10, AbstractC5809j abstractC5809j) {
            long mo22519f;
            long mo22519f2;
            InterfaceC5592f mo23364l = this.f4273b.mo23364l();
            InterfaceC5592f mo23364l2 = abstractC5809j.mo23364l();
            if (mo23364l == null) {
                return new b(j10, abstractC5809j, this.f4274c, this.f4272a, this.f4277f, mo23364l);
            }
            if (!mo23364l.mo22520g()) {
                return new b(j10, abstractC5809j, this.f4274c, this.f4272a, this.f4277f, mo23364l2);
            }
            long mo22522i = mo23364l.mo22522i(j10);
            if (mo22522i == 0) {
                return new b(j10, abstractC5809j, this.f4274c, this.f4272a, this.f4277f, mo23364l2);
            }
            long mo22521h = mo23364l.mo22521h();
            long mo22514a = mo23364l.mo22514a(mo22521h);
            long j11 = (mo22522i + mo22521h) - 1;
            long mo22514a2 = mo23364l.mo22514a(j11) + mo23364l.mo22515b(j11, j10);
            long mo22521h2 = mo23364l2.mo22521h();
            long mo22514a3 = mo23364l2.mo22514a(mo22521h2);
            long j12 = this.f4277f;
            if (mo22514a2 == mo22514a3) {
                mo22519f = j11 + 1;
            } else {
                if (mo22514a2 < mo22514a3) {
                    throw new C4846b();
                }
                if (mo22514a3 < mo22514a) {
                    mo22519f2 = j12 - (mo23364l2.mo22519f(mo22514a, j10) - mo22521h);
                    return new b(j10, abstractC5809j, this.f4274c, this.f4272a, mo22519f2, mo23364l2);
                }
                mo22519f = mo23364l.mo22519f(mo22514a3, j10);
            }
            mo22519f2 = j12 + (mo22519f - mo22521h2);
            return new b(j10, abstractC5809j, this.f4274c, this.f4272a, mo22519f2, mo23364l2);
        }

        /* renamed from: c */
        public b m4821c(InterfaceC5592f interfaceC5592f) {
            return new b(this.f4276e, this.f4273b, this.f4274c, this.f4272a, this.f4277f, interfaceC5592f);
        }

        /* renamed from: d */
        public b m4822d(C5801b c5801b) {
            return new b(this.f4276e, this.f4273b, c5801b, this.f4272a, this.f4277f, this.f4275d);
        }

        /* renamed from: e */
        public long m4823e(long j10) {
            return this.f4275d.mo22516c(this.f4276e, j10) + this.f4277f;
        }

        /* renamed from: f */
        public long m4824f() {
            return this.f4275d.mo22521h() + this.f4277f;
        }

        /* renamed from: g */
        public long m4825g(long j10) {
            return (m4823e(j10) + this.f4275d.mo22523j(this.f4276e, j10)) - 1;
        }

        /* renamed from: h */
        public long m4826h() {
            return this.f4275d.mo22522i(this.f4276e);
        }

        /* renamed from: i */
        public long m4827i(long j10) {
            return m4829k(j10) + this.f4275d.mo22515b(j10 - this.f4277f, this.f4276e);
        }

        /* renamed from: j */
        public long m4828j(long j10) {
            return this.f4275d.mo22519f(j10, this.f4276e) + this.f4277f;
        }

        /* renamed from: k */
        public long m4829k(long j10) {
            return this.f4275d.mo22514a(j10 - this.f4277f);
        }

        /* renamed from: l */
        public C5808i m4830l(long j10) {
            return this.f4275d.mo22518e(j10 - this.f4277f);
        }

        /* renamed from: m */
        public boolean m4831m(long j10, long j11) {
            return this.f4275d.mo22520g() || j11 == -9223372036854775807L || m4827i(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5262b {

        /* renamed from: e */
        public final b f4278e;

        /* renamed from: f */
        public final long f4279f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f4278e = bVar;
            this.f4279f = j12;
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: a */
        public long mo4832a() {
            m21303c();
            return this.f4278e.m4829k(m21304d());
        }

        @Override // p318w4.InterfaceC5275o
        /* renamed from: b */
        public long mo4833b() {
            m21303c();
            return this.f4278e.m4827i(m21304d());
        }
    }

    public C1152c(InterfaceC5267g.a aVar, InterfaceC3903f0 interfaceC3903f0, C5802c c5802c, C5588b c5588b, int i10, int[] iArr, InterfaceC3752s interfaceC3752s, int i11, InterfaceC3910j interfaceC3910j, long j10, int i12, boolean z10, List<C4463m1> list, C1153d.c cVar, C4674s1 c4674s1) {
        this.f4255a = interfaceC3903f0;
        this.f4265k = c5802c;
        this.f4256b = c5588b;
        this.f4257c = iArr;
        this.f4264j = interfaceC3752s;
        this.f4258d = i11;
        this.f4259e = interfaceC3910j;
        this.f4266l = i10;
        this.f4260f = j10;
        this.f4261g = i12;
        this.f4262h = cVar;
        long m23282g = c5802c.m23282g(i10);
        ArrayList<AbstractC5809j> m4814n = m4814n();
        this.f4263i = new b[interfaceC3752s.length()];
        int i13 = 0;
        while (i13 < this.f4263i.length) {
            AbstractC5809j abstractC5809j = m4814n.get(interfaceC3752s.mo14088d(i13));
            C5801b m22512j = c5588b.m22512j(abstractC5809j.f21810c);
            b[] bVarArr = this.f4263i;
            if (m22512j == null) {
                m22512j = abstractC5809j.f21810c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(m23282g, abstractC5809j, m22512j, aVar.mo21310a(i11, abstractC5809j.f21809b, z10, list, cVar, c4674s1), 0L, abstractC5809j.mo23364l());
            i13 = i14 + 1;
        }
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: a */
    public void mo4804a() {
        IOException iOException = this.f4267m;
        if (iOException != null) {
            throw iOException;
        }
        this.f4255a.mo4756a();
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1150a
    /* renamed from: b */
    public void mo4762b(InterfaceC3752s interfaceC3752s) {
        this.f4264j = interfaceC3752s;
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: d */
    public long mo4805d(long j10, C4465m3 c4465m3) {
        for (b bVar : this.f4263i) {
            if (bVar.f4275d != null) {
                long m4826h = bVar.m4826h();
                if (m4826h != 0) {
                    long m4828j = bVar.m4828j(j10);
                    long m4829k = bVar.m4829k(m4828j);
                    return c4465m3.m17482a(j10, m4829k, (m4829k >= j10 || (m4826h != -1 && m4828j >= (bVar.m4824f() + m4826h) - 1)) ? m4829k : bVar.m4829k(m4828j + 1));
                }
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC1150a
    /* renamed from: e */
    public void mo4763e(C5802c c5802c, int i10) {
        try {
            this.f4265k = c5802c;
            this.f4266l = i10;
            long m23282g = c5802c.m23282g(i10);
            ArrayList<AbstractC5809j> m4814n = m4814n();
            for (int i11 = 0; i11 < this.f4263i.length; i11++) {
                AbstractC5809j abstractC5809j = m4814n.get(this.f4264j.mo14088d(i11));
                b[] bVarArr = this.f4263i;
                bVarArr[i11] = bVarArr[i11].m4820b(m23282g, abstractC5809j);
            }
        } catch (C4846b e10) {
            this.f4267m = e10;
        }
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: f */
    public boolean mo4806f(long j10, AbstractC5266f abstractC5266f, List<? extends AbstractC5274n> list) {
        if (this.f4267m != null) {
            return false;
        }
        return this.f4264j.m14239t(j10, abstractC5266f, list);
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: g */
    public void mo4807g(long j10, long j11, List<? extends AbstractC5274n> list, C5268h c5268h) {
        int i10;
        int i11;
        InterfaceC5275o[] interfaceC5275oArr;
        long j12;
        long j13;
        if (this.f4267m != null) {
            return;
        }
        long j14 = j11 - j10;
        long m15396B0 = C4041n0.m15396B0(this.f4265k.f21759a) + C4041n0.m15396B0(this.f4265k.m23279d(this.f4266l).f21795b) + j11;
        C1153d.c cVar = this.f4262h;
        if (cVar == null || !cVar.m4856h(m15396B0)) {
            long m15396B02 = C4041n0.m15396B0(C4041n0.m15446a0(this.f4260f));
            long m4813m = m4813m(m15396B02);
            AbstractC5274n abstractC5274n = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f4264j.length();
            InterfaceC5275o[] interfaceC5275oArr2 = new InterfaceC5275o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f4263i[i12];
                if (bVar.f4275d == null) {
                    interfaceC5275oArr2[i12] = InterfaceC5275o.f20018a;
                    i10 = i12;
                    i11 = length;
                    interfaceC5275oArr = interfaceC5275oArr2;
                    j12 = j14;
                    j13 = m15396B02;
                } else {
                    long m4823e = bVar.m4823e(m15396B02);
                    long m4825g = bVar.m4825g(m15396B02);
                    i10 = i12;
                    i11 = length;
                    interfaceC5275oArr = interfaceC5275oArr2;
                    j12 = j14;
                    j13 = m15396B02;
                    long m4815o = m4815o(bVar, abstractC5274n, j11, m4823e, m4825g);
                    if (m4815o < m4823e) {
                        interfaceC5275oArr[i10] = InterfaceC5275o.f20018a;
                    } else {
                        interfaceC5275oArr[i10] = new c(m4818r(i10), m4815o, m4825g, m4813m);
                    }
                }
                i12 = i10 + 1;
                m15396B02 = j13;
                interfaceC5275oArr2 = interfaceC5275oArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = m15396B02;
            this.f4264j.mo14062j(j10, j15, m4812l(j16, j10), list, interfaceC5275oArr2);
            b m4818r = m4818r(this.f4264j.mo14061g());
            InterfaceC5267g interfaceC5267g = m4818r.f4272a;
            if (interfaceC5267g != null) {
                AbstractC5809j abstractC5809j = m4818r.f4273b;
                C5808i m23366n = interfaceC5267g.mo21315c() == null ? abstractC5809j.m23366n() : null;
                C5808i mo23365m = m4818r.f4275d == null ? abstractC5809j.mo23365m() : null;
                if (m23366n != null || mo23365m != null) {
                    c5268h.f19975a = m4816p(m4818r, this.f4259e, this.f4264j.mo14093o(), this.f4264j.mo14065p(), this.f4264j.mo14067r(), m23366n, mo23365m);
                    return;
                }
            }
            long j17 = m4818r.f4276e;
            boolean z10 = j17 != -9223372036854775807L;
            if (m4818r.m4826h() == 0) {
                c5268h.f19976b = z10;
                return;
            }
            long m4823e2 = m4818r.m4823e(j16);
            long m4825g2 = m4818r.m4825g(j16);
            long m4815o2 = m4815o(m4818r, abstractC5274n, j11, m4823e2, m4825g2);
            if (m4815o2 < m4823e2) {
                this.f4267m = new C4846b();
                return;
            }
            if (m4815o2 > m4825g2 || (this.f4268n && m4815o2 >= m4825g2)) {
                c5268h.f19976b = z10;
                return;
            }
            if (z10 && m4818r.m4829k(m4815o2) >= j17) {
                c5268h.f19976b = true;
                return;
            }
            int min = (int) Math.min(this.f4261g, (m4825g2 - m4815o2) + 1);
            if (j17 != -9223372036854775807L) {
                while (min > 1 && m4818r.m4829k((min + m4815o2) - 1) >= j17) {
                    min--;
                }
            }
            c5268h.f19975a = m4817q(m4818r, this.f4259e, this.f4258d, this.f4264j.mo14093o(), this.f4264j.mo14065p(), this.f4264j.mo14067r(), m4815o2, min, list.isEmpty() ? j11 : -9223372036854775807L, m4813m);
        }
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: h */
    public boolean mo4808h(AbstractC5266f abstractC5266f, boolean z10, InterfaceC3899d0.c cVar, InterfaceC3899d0 interfaceC3899d0) {
        InterfaceC3899d0.b mo14777c;
        if (!z10) {
            return false;
        }
        C1153d.c cVar2 = this.f4262h;
        if (cVar2 != null && cVar2.m4858j(abstractC5266f)) {
            return true;
        }
        if (!this.f4265k.f21762d && (abstractC5266f instanceof AbstractC5274n)) {
            IOException iOException = cVar.f13993c;
            if ((iOException instanceof C3893a0) && ((C3893a0) iOException).f13968k == 404) {
                b bVar = this.f4263i[this.f4264j.mo14085a(abstractC5266f.f19969d)];
                long m4826h = bVar.m4826h();
                if (m4826h != -1 && m4826h != 0) {
                    if (((AbstractC5274n) abstractC5266f).mo21352g() > (bVar.m4824f() + m4826h) - 1) {
                        this.f4268n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f4263i[this.f4264j.mo14085a(abstractC5266f.f19969d)];
        C5801b m22512j = this.f4256b.m22512j(bVar2.f4273b.f21810c);
        if (m22512j != null && !bVar2.f4274c.equals(m22512j)) {
            return true;
        }
        InterfaceC3899d0.a m4811k = m4811k(this.f4264j, bVar2.f4273b.f21810c);
        if ((!m4811k.m14779a(2) && !m4811k.m14779a(1)) || (mo14777c = interfaceC3899d0.mo14777c(m4811k, cVar)) == null || !m4811k.m14779a(mo14777c.f13989a)) {
            return false;
        }
        int i10 = mo14777c.f13989a;
        if (i10 == 2) {
            InterfaceC3752s interfaceC3752s = this.f4264j;
            return interfaceC3752s.mo14090h(interfaceC3752s.mo14085a(abstractC5266f.f19969d), mo14777c.f13990b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f4256b.m22509e(bVar2.f4274c, mo14777c.f13990b);
        return true;
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: i */
    public void mo4809i(AbstractC5266f abstractC5266f) {
        C5560c mo21316d;
        if (abstractC5266f instanceof C5273m) {
            int mo14085a = this.f4264j.mo14085a(((C5273m) abstractC5266f).f19969d);
            b bVar = this.f4263i[mo14085a];
            if (bVar.f4275d == null && (mo21316d = bVar.f4272a.mo21316d()) != null) {
                this.f4263i[mo14085a] = bVar.m4821c(new C5594h(mo21316d, bVar.f4273b.f21811d));
            }
        }
        C1153d.c cVar = this.f4262h;
        if (cVar != null) {
            cVar.m4857i(abstractC5266f);
        }
    }

    @Override // p318w4.InterfaceC5270j
    /* renamed from: j */
    public int mo4810j(long j10, List<? extends AbstractC5274n> list) {
        return (this.f4267m != null || this.f4264j.length() < 2) ? list.size() : this.f4264j.mo14064m(j10, list);
    }

    /* renamed from: k */
    public final InterfaceC3899d0.a m4811k(InterfaceC3752s interfaceC3752s, List<C5801b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC3752s.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC3752s.mo14091i(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int m22506f = C5588b.m22506f(list);
        return new InterfaceC3899d0.a(m22506f, m22506f - this.f4256b.m22510g(list), length, i10);
    }

    /* renamed from: l */
    public final long m4812l(long j10, long j11) {
        if (!this.f4265k.f21762d || this.f4263i[0].m4826h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m4813m(j10), this.f4263i[0].m4827i(this.f4263i[0].m4825g(j10))) - j11);
    }

    /* renamed from: m */
    public final long m4813m(long j10) {
        C5802c c5802c = this.f4265k;
        long j11 = c5802c.f21759a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - C4041n0.m15396B0(j11 + c5802c.m23279d(this.f4266l).f21795b);
    }

    /* renamed from: n */
    public final ArrayList<AbstractC5809j> m4814n() {
        List<C5800a> list = this.f4265k.m23279d(this.f4266l).f21796c;
        ArrayList<AbstractC5809j> arrayList = new ArrayList<>();
        for (int i10 : this.f4257c) {
            arrayList.addAll(list.get(i10).f21751c);
        }
        return arrayList;
    }

    /* renamed from: o */
    public final long m4815o(b bVar, AbstractC5274n abstractC5274n, long j10, long j11, long j12) {
        return abstractC5274n != null ? abstractC5274n.mo21352g() : C4041n0.m15479r(bVar.m4828j(j10), j11, j12);
    }

    /* renamed from: p */
    public AbstractC5266f m4816p(b bVar, InterfaceC3910j interfaceC3910j, C4463m1 c4463m1, int i10, Object obj, C5808i c5808i, C5808i c5808i2) {
        C5808i c5808i3 = c5808i;
        AbstractC5809j abstractC5809j = bVar.f4273b;
        if (c5808i3 != null) {
            C5808i m23359a = c5808i3.m23359a(c5808i2, bVar.f4274c.f21755a);
            if (m23359a != null) {
                c5808i3 = m23359a;
            }
        } else {
            c5808i3 = c5808i2;
        }
        return new C5273m(interfaceC3910j, C5593g.m22524a(abstractC5809j, bVar.f4274c.f21755a, c5808i3, 0), c4463m1, i10, obj, bVar.f4272a);
    }

    /* renamed from: q */
    public AbstractC5266f m4817q(b bVar, InterfaceC3910j interfaceC3910j, int i10, C4463m1 c4463m1, int i11, Object obj, long j10, int i12, long j11, long j12) {
        AbstractC5809j abstractC5809j = bVar.f4273b;
        long m4829k = bVar.m4829k(j10);
        C5808i m4830l = bVar.m4830l(j10);
        if (bVar.f4272a == null) {
            return new C5276p(interfaceC3910j, C5593g.m22524a(abstractC5809j, bVar.f4274c.f21755a, m4830l, bVar.m4831m(j10, j12) ? 0 : 8), c4463m1, i11, obj, m4829k, bVar.m4827i(j10), j10, i10, c4463m1);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            C5808i m23359a = m4830l.m23359a(bVar.m4830l(i13 + j10), bVar.f4274c.f21755a);
            if (m23359a == null) {
                break;
            }
            i14++;
            i13++;
            m4830l = m23359a;
        }
        long j13 = (i14 + j10) - 1;
        long m4827i = bVar.m4827i(j13);
        long j14 = bVar.f4276e;
        return new C5271k(interfaceC3910j, C5593g.m22524a(abstractC5809j, bVar.f4274c.f21755a, m4830l, bVar.m4831m(j13, j12) ? 0 : 8), c4463m1, i11, obj, m4829k, m4827i, j11, (j14 == -9223372036854775807L || j14 > m4827i) ? -9223372036854775807L : j14, j10, i14, -abstractC5809j.f21811d, bVar.f4272a);
    }

    /* renamed from: r */
    public final b m4818r(int i10) {
        b bVar = this.f4263i[i10];
        C5801b m22512j = this.f4256b.m22512j(bVar.f4273b.f21810c);
        if (m22512j == null || m22512j.equals(bVar.f4274c)) {
            return bVar;
        }
        b m4822d = bVar.m4822d(m22512j);
        this.f4263i[i10] = m4822d;
        return m4822d;
    }

    @Override // p318w4.InterfaceC5270j
    public void release() {
        for (b bVar : this.f4263i) {
            InterfaceC5267g interfaceC5267g = bVar.f4272a;
            if (interfaceC5267g != null) {
                interfaceC5267g.release();
            }
        }
    }
}
