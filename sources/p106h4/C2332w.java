package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4046r;
import p222p5.C4054z;
import p333x3.InterfaceC5573m;

/* renamed from: h4.w */
/* loaded from: classes.dex */
public final class C2332w implements InterfaceC2316i0 {

    /* renamed from: a */
    public final InterfaceC2322m f9555a;

    /* renamed from: b */
    public final C4054z f9556b = new C4054z(new byte[10]);

    /* renamed from: c */
    public int f9557c = 0;

    /* renamed from: d */
    public int f9558d;

    /* renamed from: e */
    public C4033j0 f9559e;

    /* renamed from: f */
    public boolean f9560f;

    /* renamed from: g */
    public boolean f9561g;

    /* renamed from: h */
    public boolean f9562h;

    /* renamed from: i */
    public int f9563i;

    /* renamed from: j */
    public int f9564j;

    /* renamed from: k */
    public boolean f9565k;

    /* renamed from: l */
    public long f9566l;

    public C2332w(InterfaceC2322m interfaceC2322m) {
        this.f9555a = interfaceC2322m;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:12:0x007c). Please report as a decompilation issue!!! */
    @Override // p106h4.InterfaceC2316i0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9341a(p222p5.C4015a0 r8, int r9) {
        /*
            r7 = this;
            p5.j0 r0 = r7.f9559e
            p222p5.C4014a.m15202h(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L47
            int r0 = r7.f9557c
            if (r0 == 0) goto L44
            if (r0 == r4) goto L44
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L39
            int r0 = r7.f9564j
            if (r0 == r1) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f9564j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p222p5.C4046r.m15529i(r5, r0)
            goto L7c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            p222p5.C4046r.m15529i(r5, r0)
        L44:
            r7.m9492g(r4)
        L47:
            int r0 = r8.m15226a()
            if (r0 <= 0) goto Ld8
            int r0 = r7.f9557c
            if (r0 == 0) goto Lcf
            r5 = 0
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto L88
            if (r0 != r2) goto L82
            int r0 = r8.m15226a()
            int r6 = r7.f9564j
            if (r6 != r1) goto L61
            goto L63
        L61:
            int r5 = r0 - r6
        L63:
            if (r5 <= 0) goto L6e
            int r0 = r0 - r5
            int r5 = r8.m15231f()
            int r5 = r5 + r0
            r8.m15222S(r5)
        L6e:
            h4.m r5 = r7.f9555a
            r5.mo9333a(r8)
            int r5 = r7.f9564j
            if (r5 == r1) goto L47
            int r5 = r5 - r0
            r7.f9564j = r5
            if (r5 != 0) goto L47
        L7c:
            h4.m r0 = r7.f9555a
            r0.mo9336d()
            goto L44
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L88:
            r0 = 10
            int r6 = r7.f9563i
            int r0 = java.lang.Math.min(r0, r6)
            p5.z r6 = r7.f9556b
            byte[] r6 = r6.f14602a
            boolean r0 = r7.m9489d(r8, r6, r0)
            if (r0 == 0) goto L47
            r0 = 0
            int r6 = r7.f9563i
            boolean r0 = r7.m9489d(r8, r0, r6)
            if (r0 == 0) goto L47
            r7.m9491f()
            boolean r0 = r7.f9565k
            if (r0 == 0) goto Lab
            r5 = 4
        Lab:
            r9 = r9 | r5
            h4.m r0 = r7.f9555a
            long r5 = r7.f9566l
            r0.mo9338f(r5, r9)
            r7.m9492g(r2)
            goto L47
        Lb7:
            p5.z r0 = r7.f9556b
            byte[] r0 = r0.f14602a
            r6 = 9
            boolean r0 = r7.m9489d(r8, r0, r6)
            if (r0 == 0) goto L47
            boolean r0 = r7.m9490e()
            if (r0 == 0) goto Lca
            r5 = r3
        Lca:
            r7.m9492g(r5)
            goto L47
        Lcf:
            int r0 = r8.m15226a()
            r8.m15224U(r0)
            goto L47
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p106h4.C2332w.mo9341a(p5.a0, int):void");
    }

    @Override // p106h4.InterfaceC2316i0
    /* renamed from: b */
    public void mo9342b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        this.f9559e = c4033j0;
        this.f9555a.mo9337e(interfaceC5573m, dVar);
    }

    @Override // p106h4.InterfaceC2316i0
    /* renamed from: c */
    public final void mo9343c() {
        this.f9557c = 0;
        this.f9558d = 0;
        this.f9562h = false;
        this.f9555a.mo9335c();
    }

    /* renamed from: d */
    public final boolean m9489d(C4015a0 c4015a0, byte[] bArr, int i10) {
        int min = Math.min(c4015a0.m15226a(), i10 - this.f9558d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c4015a0.m15224U(min);
        } else {
            c4015a0.m15237l(bArr, this.f9558d, min);
        }
        int i11 = this.f9558d + min;
        this.f9558d = i11;
        return i11 == i10;
    }

    /* renamed from: e */
    public final boolean m9490e() {
        this.f9556b.m15609p(0);
        int m15601h = this.f9556b.m15601h(24);
        if (m15601h != 1) {
            C4046r.m15529i("PesReader", "Unexpected start code prefix: " + m15601h);
            this.f9564j = -1;
            return false;
        }
        this.f9556b.m15611r(8);
        int m15601h2 = this.f9556b.m15601h(16);
        this.f9556b.m15611r(5);
        this.f9565k = this.f9556b.m15600g();
        this.f9556b.m15611r(2);
        this.f9560f = this.f9556b.m15600g();
        this.f9561g = this.f9556b.m15600g();
        this.f9556b.m15611r(6);
        int m15601h3 = this.f9556b.m15601h(8);
        this.f9563i = m15601h3;
        if (m15601h2 != 0) {
            int i10 = ((m15601h2 + 6) - 9) - m15601h3;
            this.f9564j = i10;
            if (i10 < 0) {
                C4046r.m15529i("PesReader", "Found negative packet payload size: " + this.f9564j);
            }
            return true;
        }
        this.f9564j = -1;
        return true;
    }

    /* renamed from: f */
    public final void m9491f() {
        this.f9556b.m15609p(0);
        this.f9566l = -9223372036854775807L;
        if (this.f9560f) {
            this.f9556b.m15611r(4);
            this.f9556b.m15611r(1);
            this.f9556b.m15611r(1);
            long m15601h = (this.f9556b.m15601h(3) << 30) | (this.f9556b.m15601h(15) << 15) | this.f9556b.m15601h(15);
            this.f9556b.m15611r(1);
            if (!this.f9562h && this.f9561g) {
                this.f9556b.m15611r(4);
                this.f9556b.m15611r(1);
                this.f9556b.m15611r(1);
                this.f9556b.m15611r(1);
                this.f9559e.m15363b((this.f9556b.m15601h(3) << 30) | (this.f9556b.m15601h(15) << 15) | this.f9556b.m15601h(15));
                this.f9562h = true;
            }
            this.f9566l = this.f9559e.m15363b(m15601h);
        }
    }

    /* renamed from: g */
    public final void m9492g(int i10) {
        this.f9557c = i10;
        this.f9558d = 0;
    }
}
