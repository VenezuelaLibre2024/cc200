package p044d2;

import androidx.lifecycle.C0361q;
import p029c2.InterfaceC0595m;
import p190n2.C3703c;

/* renamed from: d2.c */
/* loaded from: classes.dex */
public class C1521c implements InterfaceC0595m {

    /* renamed from: c */
    public final C0361q<InterfaceC0595m.b> f5544c = new C0361q<>();

    /* renamed from: d */
    public final C3703c<InterfaceC0595m.b.c> f5545d = C3703c.m13982t();

    public C1521c() {
        m6151a(InterfaceC0595m.f2608b);
    }

    /* renamed from: a */
    public void m6151a(InterfaceC0595m.b bVar) {
        this.f5544c.postValue(bVar);
        if (bVar instanceof InterfaceC0595m.b.c) {
            this.f5545d.mo13971p((InterfaceC0595m.b.c) bVar);
        } else if (bVar instanceof InterfaceC0595m.b.a) {
            this.f5545d.mo13972q(((InterfaceC0595m.b.a) bVar).m2983a());
        }
    }
}
