package p206o5;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p206o5.C3924s;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: o5.r */
/* loaded from: classes.dex */
public final class C3923r implements InterfaceC3910j {

    /* renamed from: a */
    public final Context f14136a;

    /* renamed from: b */
    public final List<InterfaceC3917m0> f14137b = new ArrayList();

    /* renamed from: c */
    public final InterfaceC3910j f14138c;

    /* renamed from: d */
    public InterfaceC3910j f14139d;

    /* renamed from: e */
    public InterfaceC3910j f14140e;

    /* renamed from: f */
    public InterfaceC3910j f14141f;

    /* renamed from: g */
    public InterfaceC3910j f14142g;

    /* renamed from: h */
    public InterfaceC3910j f14143h;

    /* renamed from: i */
    public InterfaceC3910j f14144i;

    /* renamed from: j */
    public InterfaceC3910j f14145j;

    /* renamed from: k */
    public InterfaceC3910j f14146k;

    /* renamed from: o5.r$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3910j.a {

        /* renamed from: a */
        public final Context f14147a;

        /* renamed from: b */
        public final InterfaceC3910j.a f14148b;

        /* renamed from: c */
        public InterfaceC3917m0 f14149c;

        public a(Context context) {
            this(context, new C3924s.b());
        }

        public a(Context context, InterfaceC3910j.a aVar) {
            this.f14147a = context.getApplicationContext();
            this.f14148b = aVar;
        }

        @Override // p206o5.InterfaceC3910j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3923r mo14830a() {
            C3923r c3923r = new C3923r(this.f14147a, this.f14148b.mo14830a());
            InterfaceC3917m0 interfaceC3917m0 = this.f14149c;
            if (interfaceC3917m0 != null) {
                c3923r.mo14820g(interfaceC3917m0);
            }
            return c3923r;
        }
    }

    public C3923r(Context context, InterfaceC3910j interfaceC3910j) {
        this.f14136a = context.getApplicationContext();
        this.f14138c = (InterfaceC3910j) C4014a.m15199e(interfaceC3910j);
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        return ((InterfaceC3910j) C4014a.m15199e(this.f14146k)).mo14769c(bArr, i10, i11);
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        InterfaceC3910j interfaceC3910j = this.f14146k;
        if (interfaceC3910j != null) {
            try {
                interfaceC3910j.close();
            } finally {
                this.f14146k = null;
            }
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: g */
    public void mo14820g(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15199e(interfaceC3917m0);
        this.f14138c.mo14820g(interfaceC3917m0);
        this.f14137b.add(interfaceC3917m0);
        m14890y(this.f14139d, interfaceC3917m0);
        m14890y(this.f14140e, interfaceC3917m0);
        m14890y(this.f14141f, interfaceC3917m0);
        m14890y(this.f14142g, interfaceC3917m0);
        m14890y(this.f14143h, interfaceC3917m0);
        m14890y(this.f14144i, interfaceC3917m0);
        m14890y(this.f14145j, interfaceC3917m0);
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: j */
    public Map<String, List<String>> mo14829j() {
        InterfaceC3910j interfaceC3910j = this.f14146k;
        return interfaceC3910j == null ? Collections.emptyMap() : interfaceC3910j.mo14829j();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        InterfaceC3910j m14884s;
        C4014a.m15200f(this.f14146k == null);
        String scheme = c3918n.f14071a.getScheme();
        if (C4041n0.m15488v0(c3918n.f14071a)) {
            String path = c3918n.f14071a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                m14884s = m14886u();
            }
            m14884s = m14883r();
        } else {
            if (!"asset".equals(scheme)) {
                m14884s = "content".equals(scheme) ? m14884s() : "rtmp".equals(scheme) ? m14888w() : "udp".equals(scheme) ? m14889x() : "data".equals(scheme) ? m14885t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? m14887v() : this.f14138c;
            }
            m14884s = m14883r();
        }
        this.f14146k = m14884s;
        return this.f14146k.mo14770k(c3918n);
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        InterfaceC3910j interfaceC3910j = this.f14146k;
        if (interfaceC3910j == null) {
            return null;
        }
        return interfaceC3910j.mo14771o();
    }

    /* renamed from: q */
    public final void m14882q(InterfaceC3910j interfaceC3910j) {
        for (int i10 = 0; i10 < this.f14137b.size(); i10++) {
            interfaceC3910j.mo14820g(this.f14137b.get(i10));
        }
    }

    /* renamed from: r */
    public final InterfaceC3910j m14883r() {
        if (this.f14140e == null) {
            C3896c c3896c = new C3896c(this.f14136a);
            this.f14140e = c3896c;
            m14882q(c3896c);
        }
        return this.f14140e;
    }

    /* renamed from: s */
    public final InterfaceC3910j m14884s() {
        if (this.f14141f == null) {
            C3904g c3904g = new C3904g(this.f14136a);
            this.f14141f = c3904g;
            m14882q(c3904g);
        }
        return this.f14141f;
    }

    /* renamed from: t */
    public final InterfaceC3910j m14885t() {
        if (this.f14144i == null) {
            C3908i c3908i = new C3908i();
            this.f14144i = c3908i;
            m14882q(c3908i);
        }
        return this.f14144i;
    }

    /* renamed from: u */
    public final InterfaceC3910j m14886u() {
        if (this.f14139d == null) {
            C3928w c3928w = new C3928w();
            this.f14139d = c3928w;
            m14882q(c3928w);
        }
        return this.f14139d;
    }

    /* renamed from: v */
    public final InterfaceC3910j m14887v() {
        if (this.f14145j == null) {
            C3907h0 c3907h0 = new C3907h0(this.f14136a);
            this.f14145j = c3907h0;
            m14882q(c3907h0);
        }
        return this.f14145j;
    }

    /* renamed from: w */
    public final InterfaceC3910j m14888w() {
        if (this.f14142g == null) {
            try {
                InterfaceC3910j interfaceC3910j = (InterfaceC3910j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f14142g = interfaceC3910j;
                m14882q(interfaceC3910j);
            } catch (ClassNotFoundException unused) {
                C4046r.m15529i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f14142g == null) {
                this.f14142g = this.f14138c;
            }
        }
        return this.f14142g;
    }

    /* renamed from: x */
    public final InterfaceC3910j m14889x() {
        if (this.f14143h == null) {
            C3919n0 c3919n0 = new C3919n0();
            this.f14143h = c3919n0;
            m14882q(c3919n0);
        }
        return this.f14143h;
    }

    /* renamed from: y */
    public final void m14890y(InterfaceC3910j interfaceC3910j, InterfaceC3917m0 interfaceC3917m0) {
        if (interfaceC3910j != null) {
            interfaceC3910j.mo14820g(interfaceC3917m0);
        }
    }
}
