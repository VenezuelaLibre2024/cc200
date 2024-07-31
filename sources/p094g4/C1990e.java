package p094g4;

import java.util.Arrays;
import p222p5.C4014a;
import p222p5.C4015a0;
import p333x3.C5574n;
import p333x3.InterfaceC5572l;

/* renamed from: g4.e */
/* loaded from: classes.dex */
public final class C1990e {

    /* renamed from: a */
    public final C1991f f7925a = new C1991f();

    /* renamed from: b */
    public final C4015a0 f7926b = new C4015a0(new byte[65025], 0);

    /* renamed from: c */
    public int f7927c = -1;

    /* renamed from: d */
    public int f7928d;

    /* renamed from: e */
    public boolean f7929e;

    /* renamed from: a */
    public final int m8037a(int i10) {
        int i11;
        int i12 = 0;
        this.f7928d = 0;
        do {
            int i13 = this.f7928d;
            int i14 = i10 + i13;
            C1991f c1991f = this.f7925a;
            if (i14 >= c1991f.f7936g) {
                break;
            }
            int[] iArr = c1991f.f7939j;
            this.f7928d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    /* renamed from: b */
    public C1991f m8038b() {
        return this.f7925a;
    }

    /* renamed from: c */
    public C4015a0 m8039c() {
        return this.f7926b;
    }

    /* renamed from: d */
    public boolean m8040d(InterfaceC5572l interfaceC5572l) {
        int i10;
        C4014a.m15200f(interfaceC5572l != null);
        if (this.f7929e) {
            this.f7929e = false;
            this.f7926b.m15219P(0);
        }
        while (!this.f7929e) {
            if (this.f7927c < 0) {
                if (!this.f7925a.m8045c(interfaceC5572l) || !this.f7925a.m8043a(interfaceC5572l, true)) {
                    return false;
                }
                C1991f c1991f = this.f7925a;
                int i11 = c1991f.f7937h;
                if ((c1991f.f7931b & 1) == 1 && this.f7926b.m15232g() == 0) {
                    i11 += m8037a(0);
                    i10 = this.f7928d + 0;
                } else {
                    i10 = 0;
                }
                if (!C5574n.m22464e(interfaceC5572l, i11)) {
                    return false;
                }
                this.f7927c = i10;
            }
            int m8037a = m8037a(this.f7927c);
            int i12 = this.f7927c + this.f7928d;
            if (m8037a > 0) {
                C4015a0 c4015a0 = this.f7926b;
                c4015a0.m15228c(c4015a0.m15232g() + m8037a);
                if (!C5574n.m22463d(interfaceC5572l, this.f7926b.m15230e(), this.f7926b.m15232g(), m8037a)) {
                    return false;
                }
                C4015a0 c4015a02 = this.f7926b;
                c4015a02.m15222S(c4015a02.m15232g() + m8037a);
                this.f7929e = this.f7925a.f7939j[i12 + (-1)] != 255;
            }
            if (i12 == this.f7925a.f7936g) {
                i12 = -1;
            }
            this.f7927c = i12;
        }
        return true;
    }

    /* renamed from: e */
    public void m8041e() {
        this.f7925a.m8044b();
        this.f7926b.m15219P(0);
        this.f7927c = -1;
        this.f7929e = false;
    }

    /* renamed from: f */
    public void m8042f() {
        if (this.f7926b.m15230e().length == 65025) {
            return;
        }
        C4015a0 c4015a0 = this.f7926b;
        c4015a0.m15221R(Arrays.copyOf(c4015a0.m15230e(), Math.max(65025, this.f7926b.m15232g())), this.f7926b.m15232g());
    }
}
