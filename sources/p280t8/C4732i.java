package p280t8;

import p239q8.C4204c;
import p239q8.C4205d;
import p239q8.InterfaceC4209h;

/* renamed from: t8.i */
/* loaded from: classes.dex */
public class C4732i implements InterfaceC4209h {

    /* renamed from: a */
    public boolean f17670a = false;

    /* renamed from: b */
    public boolean f17671b = false;

    /* renamed from: c */
    public C4205d f17672c;

    /* renamed from: d */
    public final C4729f f17673d;

    public C4732i(C4729f c4729f) {
        this.f17673d = c4729f;
    }

    /* renamed from: a */
    public final void m18599a() {
        if (this.f17670a) {
            throw new C4204c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f17670a = true;
    }

    /* renamed from: b */
    public void m18600b(C4205d c4205d, boolean z10) {
        this.f17670a = false;
        this.f17672c = c4205d;
        this.f17671b = z10;
    }

    @Override // p239q8.InterfaceC4209h
    /* renamed from: d */
    public InterfaceC4209h mo16207d(String str) {
        m18599a();
        this.f17673d.m18578i(this.f17672c, str, this.f17671b);
        return this;
    }

    @Override // p239q8.InterfaceC4209h
    /* renamed from: f */
    public InterfaceC4209h mo16208f(boolean z10) {
        m18599a();
        this.f17673d.m18584o(this.f17672c, z10, this.f17671b);
        return this;
    }
}
