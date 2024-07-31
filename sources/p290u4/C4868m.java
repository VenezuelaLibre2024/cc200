package p290u4;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4015a0;

/* renamed from: u4.m */
/* loaded from: classes.dex */
public final class C4868m implements InterfaceC3910j {

    /* renamed from: a */
    public final InterfaceC3910j f18394a;

    /* renamed from: b */
    public final int f18395b;

    /* renamed from: c */
    public final a f18396c;

    /* renamed from: d */
    public final byte[] f18397d;

    /* renamed from: e */
    public int f18398e;

    /* renamed from: u4.m$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo19312a(C4015a0 c4015a0);
    }

    public C4868m(InterfaceC3910j interfaceC3910j, int i10, a aVar) {
        C4014a.m15195a(i10 > 0);
        this.f18394a = interfaceC3910j;
        this.f18395b = i10;
        this.f18396c = aVar;
        this.f18397d = new byte[1];
        this.f18398e = i10;
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (this.f18398e == 0) {
            if (!m19397q()) {
                return -1;
            }
            this.f18398e = this.f18395b;
        }
        int mo14769c = this.f18394a.mo14769c(bArr, i10, Math.min(this.f18398e, i11));
        if (mo14769c != -1) {
            this.f18398e -= mo14769c;
        }
        return mo14769c;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: g */
    public void mo14820g(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15199e(interfaceC3917m0);
        this.f18394a.mo14820g(interfaceC3917m0);
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: j */
    public Map<String, List<String>> mo14829j() {
        return this.f18394a.mo14829j();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        throw new UnsupportedOperationException();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f18394a.mo14771o();
    }

    /* renamed from: q */
    public final boolean m19397q() {
        if (this.f18394a.mo14769c(this.f18397d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f18397d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int mo14769c = this.f18394a.mo14769c(bArr, i12, i11);
            if (mo14769c == -1) {
                return false;
            }
            i12 += mo14769c;
            i11 -= mo14769c;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f18396c.mo19312a(new C4015a0(bArr, i10));
        }
        return true;
    }
}
