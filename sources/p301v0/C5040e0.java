package p301v0;

/* renamed from: v0.e0 */
/* loaded from: classes.dex */
public class C5040e0 {

    /* renamed from: e */
    public static final C5072p f18906e = C5072p.m20419b();

    /* renamed from: a */
    public AbstractC5048h f18907a;

    /* renamed from: b */
    public C5072p f18908b;

    /* renamed from: c */
    public volatile InterfaceC5079r0 f18909c;

    /* renamed from: d */
    public volatile AbstractC5048h f18910d;

    /* renamed from: a */
    public void m19905a(InterfaceC5079r0 interfaceC5079r0) {
        AbstractC5048h abstractC5048h;
        if (this.f18909c != null) {
            return;
        }
        synchronized (this) {
            if (this.f18909c != null) {
                return;
            }
            try {
                if (this.f18907a != null) {
                    this.f18909c = interfaceC5079r0.mo20459i().mo19805a(this.f18907a, this.f18908b);
                    abstractC5048h = this.f18907a;
                } else {
                    this.f18909c = interfaceC5079r0;
                    abstractC5048h = AbstractC5048h.f18921i;
                }
                this.f18910d = abstractC5048h;
            } catch (C5031b0 unused) {
                this.f18909c = interfaceC5079r0;
                this.f18910d = AbstractC5048h.f18921i;
            }
        }
    }

    /* renamed from: b */
    public int m19906b() {
        if (this.f18910d != null) {
            return this.f18910d.size();
        }
        AbstractC5048h abstractC5048h = this.f18907a;
        if (abstractC5048h != null) {
            return abstractC5048h.size();
        }
        if (this.f18909c != null) {
            return this.f18909c.mo20457g();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC5079r0 m19907c(InterfaceC5079r0 interfaceC5079r0) {
        m19905a(interfaceC5079r0);
        return this.f18909c;
    }

    /* renamed from: d */
    public InterfaceC5079r0 m19908d(InterfaceC5079r0 interfaceC5079r0) {
        InterfaceC5079r0 interfaceC5079r02 = this.f18909c;
        this.f18907a = null;
        this.f18910d = null;
        this.f18909c = interfaceC5079r0;
        return interfaceC5079r02;
    }

    /* renamed from: e */
    public AbstractC5048h m19909e() {
        if (this.f18910d != null) {
            return this.f18910d;
        }
        AbstractC5048h abstractC5048h = this.f18907a;
        if (abstractC5048h != null) {
            return abstractC5048h;
        }
        synchronized (this) {
            if (this.f18910d != null) {
                return this.f18910d;
            }
            this.f18910d = this.f18909c == null ? AbstractC5048h.f18921i : this.f18909c.mo19776f();
            return this.f18910d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5040e0)) {
            return false;
        }
        C5040e0 c5040e0 = (C5040e0) obj;
        InterfaceC5079r0 interfaceC5079r0 = this.f18909c;
        InterfaceC5079r0 interfaceC5079r02 = c5040e0.f18909c;
        return (interfaceC5079r0 == null && interfaceC5079r02 == null) ? m19909e().equals(c5040e0.m19909e()) : (interfaceC5079r0 == null || interfaceC5079r02 == null) ? interfaceC5079r0 != null ? interfaceC5079r0.equals(c5040e0.m19907c(interfaceC5079r0.mo20526b())) : m19907c(interfaceC5079r02.mo20526b()).equals(interfaceC5079r02) : interfaceC5079r0.equals(interfaceC5079r02);
    }

    public int hashCode() {
        return 1;
    }
}
