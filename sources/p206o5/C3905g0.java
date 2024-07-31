package p206o5;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p206o5.C3901e0;
import p206o5.C3918n;
import p222p5.C4014a;
import p222p5.C4041n0;
import p290u4.C4870n;

/* renamed from: o5.g0 */
/* loaded from: classes.dex */
public final class C3905g0<T> implements C3901e0.e {

    /* renamed from: a */
    public final long f14029a;

    /* renamed from: b */
    public final C3918n f14030b;

    /* renamed from: c */
    public final int f14031c;

    /* renamed from: d */
    public final C3915l0 f14032d;

    /* renamed from: e */
    public final a<? extends T> f14033e;

    /* renamed from: f */
    public volatile T f14034f;

    /* renamed from: o5.g0$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        T mo290a(Uri uri, InputStream inputStream);
    }

    public C3905g0(InterfaceC3910j interfaceC3910j, Uri uri, int i10, a<? extends T> aVar) {
        this(interfaceC3910j, new C3918n.b().m14866i(uri).m14859b(1).m14858a(), i10, aVar);
    }

    public C3905g0(InterfaceC3910j interfaceC3910j, C3918n c3918n, int i10, a<? extends T> aVar) {
        this.f14032d = new C3915l0(interfaceC3910j);
        this.f14030b = c3918n;
        this.f14031c = i10;
        this.f14033e = aVar;
        this.f14029a = C4870n.m19398a();
    }

    /* renamed from: a */
    public long m14825a() {
        return this.f14032d.m14843q();
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public final void mo14817b() {
        this.f14032d.m14846t();
        C3914l c3914l = new C3914l(this.f14032d, this.f14030b);
        try {
            c3914l.m14842d();
            this.f14034f = this.f14033e.mo290a((Uri) C4014a.m15199e(this.f14032d.mo14771o()), c3914l);
        } finally {
            C4041n0.m15471n(c3914l);
        }
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public final void mo14818c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> m14826d() {
        return this.f14032d.m14845s();
    }

    /* renamed from: e */
    public final T m14827e() {
        return this.f14034f;
    }

    /* renamed from: f */
    public Uri m14828f() {
        return this.f14032d.m14844r();
    }
}
