package p290u4;

/* renamed from: u4.g */
/* loaded from: classes.dex */
public class C4856g implements InterfaceC4871n0 {

    /* renamed from: h */
    public final InterfaceC4871n0[] f18248h;

    public C4856g(InterfaceC4871n0[] interfaceC4871n0Arr) {
        this.f18248h = interfaceC4871n0Arr;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: b */
    public final long mo4785b() {
        long j10 = Long.MAX_VALUE;
        for (InterfaceC4871n0 interfaceC4871n0 : this.f18248h) {
            long mo4785b = interfaceC4871n0.mo4785b();
            if (mo4785b != Long.MIN_VALUE) {
                j10 = Math.min(j10, mo4785b);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long mo4785b = mo4785b();
            if (mo4785b == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (InterfaceC4871n0 interfaceC4871n0 : this.f18248h) {
                long mo4785b2 = interfaceC4871n0.mo4785b();
                boolean z12 = mo4785b2 != Long.MIN_VALUE && mo4785b2 <= j10;
                if (mo4785b2 == mo4785b || z12) {
                    z10 |= interfaceC4871n0.mo4786c(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: f */
    public final long mo4789f() {
        long j10 = Long.MAX_VALUE;
        for (InterfaceC4871n0 interfaceC4871n0 : this.f18248h) {
            long mo4789f = interfaceC4871n0.mo4789f();
            if (mo4789f != Long.MIN_VALUE) {
                j10 = Math.min(j10, mo4789f);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: g */
    public final void mo4790g(long j10) {
        for (InterfaceC4871n0 interfaceC4871n0 : this.f18248h) {
            interfaceC4871n0.mo4790g(j10);
        }
    }

    @Override // p290u4.InterfaceC4871n0
    public boolean isLoading() {
        for (InterfaceC4871n0 interfaceC4871n0 : this.f18248h) {
            if (interfaceC4871n0.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
