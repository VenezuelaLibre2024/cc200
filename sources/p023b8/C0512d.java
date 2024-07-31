package p023b8;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p098g8.AbstractC2135f0;
import p098g8.AbstractC2137g0;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: b8.d */
/* loaded from: classes.dex */
public final class C0512d implements InterfaceC0509a {

    /* renamed from: c */
    public static final InterfaceC0516h f2306c = new b();

    /* renamed from: a */
    public final InterfaceC5895a<InterfaceC0509a> f2307a;

    /* renamed from: b */
    public final AtomicReference<InterfaceC0509a> f2308b = new AtomicReference<>(null);

    /* renamed from: b8.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0516h {
        public b() {
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: a */
        public File mo2467a() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: b */
        public File mo2468b() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: c */
        public File mo2469c() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: d */
        public AbstractC2135f0.a mo2470d() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: e */
        public File mo2471e() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: f */
        public File mo2472f() {
            return null;
        }

        @Override // p023b8.InterfaceC0516h
        /* renamed from: g */
        public File mo2473g() {
            return null;
        }
    }

    public C0512d(InterfaceC5895a<InterfaceC0509a> interfaceC5895a) {
        this.f2307a = interfaceC5895a;
        interfaceC5895a.mo23490a(new InterfaceC5895a.a() { // from class: b8.b
            @Override // p354y8.InterfaceC5895a.a
            /* renamed from: a */
            public final void mo303a(InterfaceC5896b interfaceC5896b) {
                C0512d.this.m2465g(interfaceC5896b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m2465g(InterfaceC5896b interfaceC5896b) {
        C0515g.m2482f().m2484b("Crashlytics native component now available.");
        this.f2308b.set((InterfaceC0509a) interfaceC5896b.get());
    }

    /* renamed from: h */
    public static /* synthetic */ void m2466h(String str, String str2, long j10, AbstractC2137g0 abstractC2137g0, InterfaceC5896b interfaceC5896b) {
        ((InterfaceC0509a) interfaceC5896b.get()).mo2462d(str, str2, j10, abstractC2137g0);
    }

    @Override // p023b8.InterfaceC0509a
    /* renamed from: a */
    public InterfaceC0516h mo2459a(String str) {
        InterfaceC0509a interfaceC0509a = this.f2308b.get();
        return interfaceC0509a == null ? f2306c : interfaceC0509a.mo2459a(str);
    }

    @Override // p023b8.InterfaceC0509a
    /* renamed from: b */
    public boolean mo2460b() {
        InterfaceC0509a interfaceC0509a = this.f2308b.get();
        return interfaceC0509a != null && interfaceC0509a.mo2460b();
    }

    @Override // p023b8.InterfaceC0509a
    /* renamed from: c */
    public boolean mo2461c(String str) {
        InterfaceC0509a interfaceC0509a = this.f2308b.get();
        return interfaceC0509a != null && interfaceC0509a.mo2461c(str);
    }

    @Override // p023b8.InterfaceC0509a
    /* renamed from: d */
    public void mo2462d(final String str, final String str2, final long j10, final AbstractC2137g0 abstractC2137g0) {
        C0515g.m2482f().m2490i("Deferring native open session: " + str);
        this.f2307a.mo23490a(new InterfaceC5895a.a() { // from class: b8.c
            @Override // p354y8.InterfaceC5895a.a
            /* renamed from: a */
            public final void mo303a(InterfaceC5896b interfaceC5896b) {
                C0512d.m2466h(str, str2, j10, abstractC2137g0, interfaceC5896b);
            }
        });
    }
}
