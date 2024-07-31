package p353y7;

import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: y7.c0 */
/* loaded from: classes.dex */
public class C5868c0<T> implements InterfaceC5896b<T>, InterfaceC5895a<T> {

    /* renamed from: c */
    public static final InterfaceC5895a.a<Object> f21872c = new InterfaceC5895a.a() { // from class: y7.a0
        @Override // p354y8.InterfaceC5895a.a
        /* renamed from: a */
        public final void mo303a(InterfaceC5896b interfaceC5896b) {
            C5868c0.m23486f(interfaceC5896b);
        }
    };

    /* renamed from: d */
    public static final InterfaceC5896b<Object> f21873d = new InterfaceC5896b() { // from class: y7.b0
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            Object m23487g;
            m23487g = C5868c0.m23487g();
            return m23487g;
        }
    };

    /* renamed from: a */
    public InterfaceC5895a.a<T> f21874a;

    /* renamed from: b */
    public volatile InterfaceC5896b<T> f21875b;

    public C5868c0(InterfaceC5895a.a<T> aVar, InterfaceC5896b<T> interfaceC5896b) {
        this.f21874a = aVar;
        this.f21875b = interfaceC5896b;
    }

    /* renamed from: e */
    public static <T> C5868c0<T> m23485e() {
        return new C5868c0<>(f21872c, f21873d);
    }

    /* renamed from: f */
    public static /* synthetic */ void m23486f(InterfaceC5896b interfaceC5896b) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m23487g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m23488h(InterfaceC5895a.a aVar, InterfaceC5895a.a aVar2, InterfaceC5896b interfaceC5896b) {
        aVar.mo303a(interfaceC5896b);
        aVar2.mo303a(interfaceC5896b);
    }

    /* renamed from: i */
    public static <T> C5868c0<T> m23489i(InterfaceC5896b<T> interfaceC5896b) {
        return new C5868c0<>(null, interfaceC5896b);
    }

    @Override // p354y8.InterfaceC5895a
    /* renamed from: a */
    public void mo23490a(final InterfaceC5895a.a<T> aVar) {
        InterfaceC5896b<T> interfaceC5896b;
        InterfaceC5896b<T> interfaceC5896b2 = this.f21875b;
        InterfaceC5896b<Object> interfaceC5896b3 = f21873d;
        if (interfaceC5896b2 != interfaceC5896b3) {
            aVar.mo303a(interfaceC5896b2);
            return;
        }
        InterfaceC5896b<T> interfaceC5896b4 = null;
        synchronized (this) {
            interfaceC5896b = this.f21875b;
            if (interfaceC5896b != interfaceC5896b3) {
                interfaceC5896b4 = interfaceC5896b;
            } else {
                final InterfaceC5895a.a<T> aVar2 = this.f21874a;
                this.f21874a = new InterfaceC5895a.a() { // from class: y7.z
                    @Override // p354y8.InterfaceC5895a.a
                    /* renamed from: a */
                    public final void mo303a(InterfaceC5896b interfaceC5896b5) {
                        C5868c0.m23488h(InterfaceC5895a.a.this, aVar, interfaceC5896b5);
                    }
                };
            }
        }
        if (interfaceC5896b4 != null) {
            aVar.mo303a(interfaceC5896b);
        }
    }

    @Override // p354y8.InterfaceC5896b
    public T get() {
        return this.f21875b.get();
    }

    /* renamed from: j */
    public void m23491j(InterfaceC5896b<T> interfaceC5896b) {
        InterfaceC5895a.a<T> aVar;
        if (this.f21875b != f21873d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f21874a;
            this.f21874a = null;
            this.f21875b = interfaceC5896b;
        }
        aVar.mo303a(interfaceC5896b);
    }
}
