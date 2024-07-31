package p299ue;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import p299ue.C5022j;
import re.AbstractC4371s;
import re.C4346a;
import re.C4357f0;
import re.C4377y;
import re.InterfaceC4354e;
import re.InterfaceC4375w;
import se.C4596e;
import ve.InterfaceC5168c;

/* renamed from: ue.d */
/* loaded from: classes2.dex */
public final class C5016d {

    /* renamed from: a */
    public final C5023k f18764a;

    /* renamed from: b */
    public final C4346a f18765b;

    /* renamed from: c */
    public final C5019g f18766c;

    /* renamed from: d */
    public final InterfaceC4354e f18767d;

    /* renamed from: e */
    public final AbstractC4371s f18768e;

    /* renamed from: f */
    public C5022j.a f18769f;

    /* renamed from: g */
    public final C5022j f18770g;

    /* renamed from: h */
    public C5017e f18771h;

    /* renamed from: i */
    public boolean f18772i;

    /* renamed from: j */
    public C4357f0 f18773j;

    public C5016d(C5023k c5023k, C5019g c5019g, C4346a c4346a, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s) {
        this.f18764a = c5023k;
        this.f18766c = c5019g;
        this.f18765b = c4346a;
        this.f18767d = interfaceC4354e;
        this.f18768e = abstractC4371s;
        this.f18770g = new C5022j(c4346a, c5019g.f18796e, interfaceC4354e, abstractC4371s);
    }

    /* renamed from: a */
    public C5017e m19669a() {
        return this.f18771h;
    }

    /* renamed from: b */
    public InterfaceC5168c m19670b(C4377y c4377y, InterfaceC4375w.a aVar, boolean z10) {
        try {
            return m19672d(aVar.mo16893d(), aVar.mo16890a(), aVar.mo16891b(), c4377y.m16918v(), c4377y.m16897B(), z10).m19691o(c4377y, aVar);
        } catch (IOException e10) {
            m19676h();
            throw new C5021i(e10);
        } catch (C5021i e11) {
            m19676h();
            throw e11;
        }
    }

    /* renamed from: c */
    public final C5017e m19671c(int i10, int i11, int i12, int i13, boolean z10) {
        C5017e c5017e;
        Socket socket;
        Socket m19736n;
        C5017e c5017e2;
        boolean z11;
        C4357f0 c4357f0;
        boolean z12;
        List<C4357f0> list;
        C5022j.a aVar;
        synchronized (this.f18766c) {
            if (this.f18764a.m19731i()) {
                throw new IOException("Canceled");
            }
            this.f18772i = false;
            C5023k c5023k = this.f18764a;
            c5017e = c5023k.f18819i;
            socket = null;
            m19736n = (c5017e == null || !c5017e.f18783k) ? null : c5023k.m19736n();
            C5023k c5023k2 = this.f18764a;
            c5017e2 = c5023k2.f18819i;
            if (c5017e2 != null) {
                c5017e = null;
            } else {
                c5017e2 = null;
            }
            if (c5017e2 == null) {
                if (this.f18766c.m19706h(this.f18765b, c5023k2, null, false)) {
                    c5017e2 = this.f18764a.f18819i;
                    c4357f0 = null;
                    z11 = true;
                } else {
                    c4357f0 = this.f18773j;
                    if (c4357f0 != null) {
                        this.f18773j = null;
                    } else if (m19675g()) {
                        c4357f0 = this.f18764a.f18819i.m19693q();
                    }
                    z11 = false;
                }
            }
            z11 = false;
            c4357f0 = null;
        }
        C4596e.m18099g(m19736n);
        if (c5017e != null) {
            this.f18768e.m16805i(this.f18767d, c5017e);
        }
        if (z11) {
            this.f18768e.m16804h(this.f18767d, c5017e2);
        }
        if (c5017e2 != null) {
            return c5017e2;
        }
        if (c4357f0 != null || ((aVar = this.f18769f) != null && aVar.m19721b())) {
            z12 = false;
        } else {
            this.f18769f = this.f18770g.m19716d();
            z12 = true;
        }
        synchronized (this.f18766c) {
            if (this.f18764a.m19731i()) {
                throw new IOException("Canceled");
            }
            if (z12) {
                list = this.f18769f.m19720a();
                if (this.f18766c.m19706h(this.f18765b, this.f18764a, list, false)) {
                    c5017e2 = this.f18764a.f18819i;
                    z11 = true;
                }
            } else {
                list = null;
            }
            if (!z11) {
                if (c4357f0 == null) {
                    c4357f0 = this.f18769f.m19722c();
                }
                c5017e2 = new C5017e(this.f18766c, c4357f0);
                this.f18771h = c5017e2;
            }
        }
        if (!z11) {
            c5017e2.m19680d(i10, i11, i12, i13, z10, this.f18767d, this.f18768e);
            this.f18766c.f18796e.m19707a(c5017e2.m19693q());
            synchronized (this.f18766c) {
                this.f18771h = null;
                if (this.f18766c.m19706h(this.f18765b, this.f18764a, list, true)) {
                    c5017e2.f18783k = true;
                    socket = c5017e2.m19695s();
                    c5017e2 = this.f18764a.f18819i;
                    this.f18773j = c4357f0;
                } else {
                    this.f18766c.m19705g(c5017e2);
                    this.f18764a.m19723a(c5017e2);
                }
            }
            C4596e.m18099g(socket);
        }
        this.f18768e.m16804h(this.f18767d, c5017e2);
        return c5017e2;
    }

    /* renamed from: d */
    public final C5017e m19672d(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            C5017e m19671c = m19671c(i10, i11, i12, i13, z10);
            synchronized (this.f18766c) {
                if (m19671c.f18785m == 0 && !m19671c.m19690n()) {
                    return m19671c;
                }
                if (m19671c.m19689m(z11)) {
                    return m19671c;
                }
                m19671c.m19692p();
            }
        }
    }

    /* renamed from: e */
    public boolean m19673e() {
        synchronized (this.f18766c) {
            boolean z10 = true;
            if (this.f18773j != null) {
                return true;
            }
            if (m19675g()) {
                this.f18773j = this.f18764a.f18819i.m19693q();
                return true;
            }
            C5022j.a aVar = this.f18769f;
            if ((aVar == null || !aVar.m19721b()) && !this.f18770g.m19714b()) {
                z10 = false;
            }
            return z10;
        }
    }

    /* renamed from: f */
    public boolean m19674f() {
        boolean z10;
        synchronized (this.f18766c) {
            z10 = this.f18772i;
        }
        return z10;
    }

    /* renamed from: g */
    public final boolean m19675g() {
        C5017e c5017e = this.f18764a.f18819i;
        return c5017e != null && c5017e.f18784l == 0 && C4596e.m18084D(c5017e.m19693q().m16737a().m16644l(), this.f18765b.m16644l());
    }

    /* renamed from: h */
    public void m19676h() {
        synchronized (this.f18766c) {
            this.f18772i = true;
        }
    }
}
