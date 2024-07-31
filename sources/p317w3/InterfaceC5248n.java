package p317w3;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p304v3.InterfaceC5105b;
import p317w3.InterfaceC5255u;

/* renamed from: w3.n */
/* loaded from: classes.dex */
public interface InterfaceC5248n {

    /* renamed from: w3.n$a */
    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: h */
        public final int f19914h;

        public a(Throwable th, int i10) {
            super(th);
            this.f19914h = i10;
        }
    }

    /* renamed from: g */
    static void m21269g(InterfaceC5248n interfaceC5248n, InterfaceC5248n interfaceC5248n2) {
        if (interfaceC5248n == interfaceC5248n2) {
            return;
        }
        if (interfaceC5248n2 != null) {
            interfaceC5248n2.mo21120c(null);
        }
        if (interfaceC5248n != null) {
            interfaceC5248n.mo21121d(null);
        }
    }

    /* renamed from: a */
    a mo21118a();

    /* renamed from: b */
    UUID mo21119b();

    /* renamed from: c */
    void mo21120c(InterfaceC5255u.a aVar);

    /* renamed from: d */
    void mo21121d(InterfaceC5255u.a aVar);

    /* renamed from: e */
    default boolean mo21122e() {
        return false;
    }

    /* renamed from: f */
    Map<String, String> mo21123f();

    int getState();

    /* renamed from: h */
    boolean mo21124h(String str);

    /* renamed from: i */
    InterfaceC5105b mo21125i();
}
