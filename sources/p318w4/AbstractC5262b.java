package p318w4;

import java.util.NoSuchElementException;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public abstract class AbstractC5262b implements InterfaceC5275o {

    /* renamed from: b */
    public final long f19942b;

    /* renamed from: c */
    public final long f19943c;

    /* renamed from: d */
    public long f19944d;

    public AbstractC5262b(long j10, long j11) {
        this.f19942b = j10;
        this.f19943c = j11;
        m21306f();
    }

    /* renamed from: c */
    public final void m21303c() {
        long j10 = this.f19944d;
        if (j10 < this.f19942b || j10 > this.f19943c) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final long m21304d() {
        return this.f19944d;
    }

    /* renamed from: e */
    public boolean m21305e() {
        return this.f19944d > this.f19943c;
    }

    /* renamed from: f */
    public void m21306f() {
        this.f19944d = this.f19942b - 1;
    }

    @Override // p318w4.InterfaceC5275o
    public boolean next() {
        this.f19944d++;
        return !m21305e();
    }
}
