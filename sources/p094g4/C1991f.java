package p094g4;

import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4499t2;
import p333x3.C5574n;
import p333x3.InterfaceC5572l;

/* renamed from: g4.f */
/* loaded from: classes.dex */
public final class C1991f {

    /* renamed from: a */
    public int f7930a;

    /* renamed from: b */
    public int f7931b;

    /* renamed from: c */
    public long f7932c;

    /* renamed from: d */
    public long f7933d;

    /* renamed from: e */
    public long f7934e;

    /* renamed from: f */
    public long f7935f;

    /* renamed from: g */
    public int f7936g;

    /* renamed from: h */
    public int f7937h;

    /* renamed from: i */
    public int f7938i;

    /* renamed from: j */
    public final int[] f7939j = new int[255];

    /* renamed from: k */
    public final C4015a0 f7940k = new C4015a0(255);

    /* renamed from: a */
    public boolean m8043a(InterfaceC5572l interfaceC5572l, boolean z10) {
        m8044b();
        this.f7940k.m15219P(27);
        if (!C5574n.m22461b(interfaceC5572l, this.f7940k.m15230e(), 0, 27, z10) || this.f7940k.m15212I() != 1332176723) {
            return false;
        }
        int m15210G = this.f7940k.m15210G();
        this.f7930a = m15210G;
        if (m15210G != 0) {
            if (z10) {
                return false;
            }
            throw C4499t2.m17597d("unsupported bit stream revision");
        }
        this.f7931b = this.f7940k.m15210G();
        this.f7932c = this.f7940k.m15246u();
        this.f7933d = this.f7940k.m15248w();
        this.f7934e = this.f7940k.m15248w();
        this.f7935f = this.f7940k.m15248w();
        int m15210G2 = this.f7940k.m15210G();
        this.f7936g = m15210G2;
        this.f7937h = m15210G2 + 27;
        this.f7940k.m15219P(m15210G2);
        if (!C5574n.m22461b(interfaceC5572l, this.f7940k.m15230e(), 0, this.f7936g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f7936g; i10++) {
            this.f7939j[i10] = this.f7940k.m15210G();
            this.f7938i += this.f7939j[i10];
        }
        return true;
    }

    /* renamed from: b */
    public void m8044b() {
        this.f7930a = 0;
        this.f7931b = 0;
        this.f7932c = 0L;
        this.f7933d = 0L;
        this.f7934e = 0L;
        this.f7935f = 0L;
        this.f7936g = 0;
        this.f7937h = 0;
        this.f7938i = 0;
    }

    /* renamed from: c */
    public boolean m8045c(InterfaceC5572l interfaceC5572l) {
        return m8046d(interfaceC5572l, -1L);
    }

    /* renamed from: d */
    public boolean m8046d(InterfaceC5572l interfaceC5572l, long j10) {
        C4014a.m15195a(interfaceC5572l.getPosition() == interfaceC5572l.mo3030f());
        this.f7940k.m15219P(4);
        while (true) {
            if ((j10 == -1 || interfaceC5572l.getPosition() + 4 < j10) && C5574n.m22461b(interfaceC5572l, this.f7940k.m15230e(), 0, 4, true)) {
                this.f7940k.m15223T(0);
                if (this.f7940k.m15212I() == 1332176723) {
                    interfaceC5572l.mo22427l();
                    return true;
                }
                interfaceC5572l.mo22428m(1);
            }
        }
        do {
            if (j10 != -1 && interfaceC5572l.getPosition() >= j10) {
                break;
            }
        } while (interfaceC5572l.mo22422a(1) != -1);
        return false;
    }
}
