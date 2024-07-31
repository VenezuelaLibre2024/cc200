package p034c7;

import p108h6.C2394s;
import p207o6.InterfaceC3935d;

/* renamed from: c7.rb */
/* loaded from: classes.dex */
public final class C0870rb {

    /* renamed from: a */
    public final InterfaceC3935d f3520a;

    /* renamed from: b */
    public long f3521b;

    public C0870rb(InterfaceC3935d interfaceC3935d) {
        C2394s.m9619l(interfaceC3935d);
        this.f3520a = interfaceC3935d;
    }

    /* renamed from: a */
    public final void m3826a() {
        this.f3521b = 0L;
    }

    /* renamed from: b */
    public final boolean m3827b(long j10) {
        return this.f3521b == 0 || this.f3520a.mo14933b() - this.f3521b >= 3600000;
    }

    /* renamed from: c */
    public final void m3828c() {
        this.f3521b = this.f3520a.mo14933b();
    }
}
