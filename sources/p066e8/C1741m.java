package p066e8;

import p023b8.C0515g;
import p141j8.C3262f;
import p197n9.InterfaceC3781b;

/* renamed from: e8.m */
/* loaded from: classes.dex */
public class C1741m implements InterfaceC3781b {

    /* renamed from: a */
    public final C1757x f6378a;

    /* renamed from: b */
    public final C1739l f6379b;

    public C1741m(C1757x c1757x, C3262f c3262f) {
        this.f6378a = c1757x;
        this.f6379b = new C1739l(c3262f);
    }

    @Override // p197n9.InterfaceC3781b
    /* renamed from: a */
    public void mo6875a(InterfaceC3781b.b bVar) {
        C0515g.m2482f().m2484b("App Quality Sessions session changed: " + bVar);
        this.f6379b.m6873h(bVar.m14389a());
    }

    @Override // p197n9.InterfaceC3781b
    /* renamed from: b */
    public boolean mo6876b() {
        return this.f6378a.m7039d();
    }

    @Override // p197n9.InterfaceC3781b
    /* renamed from: c */
    public InterfaceC3781b.a mo6877c() {
        return InterfaceC3781b.a.CRASHLYTICS;
    }

    /* renamed from: d */
    public String m6878d(String str) {
        return this.f6379b.m6872c(str);
    }

    /* renamed from: e */
    public void m6879e(String str) {
        this.f6379b.m6874i(str);
    }
}
