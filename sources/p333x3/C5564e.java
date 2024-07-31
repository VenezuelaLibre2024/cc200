package p333x3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p206o5.InterfaceC3906h;
import p222p5.C4041n0;
import p264s3.C4448j1;

/* renamed from: x3.e */
/* loaded from: classes.dex */
public final class C5564e implements InterfaceC5572l {

    /* renamed from: b */
    public final InterfaceC3906h f20882b;

    /* renamed from: c */
    public final long f20883c;

    /* renamed from: d */
    public long f20884d;

    /* renamed from: f */
    public int f20886f;

    /* renamed from: g */
    public int f20887g;

    /* renamed from: e */
    public byte[] f20885e = new byte[65536];

    /* renamed from: a */
    public final byte[] f20881a = new byte[4096];

    static {
        C4448j1.m17365a("goog.exo.extractor");
    }

    public C5564e(InterfaceC3906h interfaceC3906h, long j10, long j11) {
        this.f20882b = interfaceC3906h;
        this.f20884d = j10;
        this.f20883c = j11;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: a */
    public int mo22422a(int i10) {
        int m22435u = m22435u(i10);
        if (m22435u == 0) {
            byte[] bArr = this.f20881a;
            m22435u = m22434t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        m22431q(m22435u);
        return m22435u;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: b */
    public long mo3029b() {
        return this.f20883c;
    }

    @Override // p333x3.InterfaceC5572l, p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        int m22433s = m22433s(bArr, i10, i11);
        if (m22433s == 0) {
            m22433s = m22434t(bArr, i10, i11, 0, true);
        }
        m22431q(m22433s);
        return m22433s;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: d */
    public boolean mo22423d(byte[] bArr, int i10, int i11, boolean z10) {
        int m22433s = m22433s(bArr, i10, i11);
        while (m22433s < i11 && m22433s != -1) {
            m22433s = m22434t(bArr, i10, i11, m22433s, z10);
        }
        m22431q(m22433s);
        return m22433s != -1;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: e */
    public boolean mo22424e(byte[] bArr, int i10, int i11, boolean z10) {
        if (!mo22429n(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f20885e, this.f20886f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: f */
    public long mo3030f() {
        return this.f20884d + this.f20886f;
    }

    @Override // p333x3.InterfaceC5572l
    public long getPosition() {
        return this.f20884d;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: h */
    public void mo22425h(int i10) {
        mo22429n(i10, false);
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: i */
    public int mo22426i(byte[] bArr, int i10, int i11) {
        int min;
        m22432r(i11);
        int i12 = this.f20887g;
        int i13 = this.f20886f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = m22434t(this.f20885e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f20887g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f20885e, this.f20886f, bArr, i10, min);
        this.f20886f += min;
        return min;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: l */
    public void mo22427l() {
        this.f20886f = 0;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: m */
    public void mo22428m(int i10) {
        m22436v(i10, false);
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: n */
    public boolean mo22429n(int i10, boolean z10) {
        m22432r(i10);
        int i11 = this.f20887g - this.f20886f;
        while (i11 < i10) {
            i11 = m22434t(this.f20885e, this.f20886f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f20887g = this.f20886f + i11;
        }
        this.f20886f += i10;
        return true;
    }

    @Override // p333x3.InterfaceC5572l
    /* renamed from: p */
    public void mo22430p(byte[] bArr, int i10, int i11) {
        mo22424e(bArr, i10, i11, false);
    }

    /* renamed from: q */
    public final void m22431q(int i10) {
        if (i10 != -1) {
            this.f20884d += i10;
        }
    }

    /* renamed from: r */
    public final void m22432r(int i10) {
        int i11 = this.f20886f + i10;
        byte[] bArr = this.f20885e;
        if (i11 > bArr.length) {
            this.f20885e = Arrays.copyOf(this.f20885e, C4041n0.m15477q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override // p333x3.InterfaceC5572l
    public void readFully(byte[] bArr, int i10, int i11) {
        mo22423d(bArr, i10, i11, false);
    }

    /* renamed from: s */
    public final int m22433s(byte[] bArr, int i10, int i11) {
        int i12 = this.f20887g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f20885e, 0, bArr, i10, min);
        m22437w(min);
        return min;
    }

    /* renamed from: t */
    public final int m22434t(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int mo14769c = this.f20882b.mo14769c(bArr, i10 + i12, i11 - i12);
        if (mo14769c != -1) {
            return i12 + mo14769c;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: u */
    public final int m22435u(int i10) {
        int min = Math.min(this.f20887g, i10);
        m22437w(min);
        return min;
    }

    /* renamed from: v */
    public boolean m22436v(int i10, boolean z10) {
        int m22435u = m22435u(i10);
        while (m22435u < i10 && m22435u != -1) {
            m22435u = m22434t(this.f20881a, -m22435u, Math.min(i10, this.f20881a.length + m22435u), m22435u, z10);
        }
        m22431q(m22435u);
        return m22435u != -1;
    }

    /* renamed from: w */
    public final void m22437w(int i10) {
        int i11 = this.f20887g - i10;
        this.f20887g = i11;
        this.f20886f = 0;
        byte[] bArr = this.f20885e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f20885e = bArr2;
    }
}
