package p007a5;

import android.net.Uri;
import java.io.IOException;
import p206o5.InterfaceC3899d0;
import p290u4.InterfaceC4845a0;
import p365z4.InterfaceC5976g;

/* renamed from: a5.l */
/* loaded from: classes.dex */
public interface InterfaceC0058l {

    /* renamed from: a5.l$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        InterfaceC0058l mo179a(InterfaceC5976g interfaceC5976g, InterfaceC3899d0 interfaceC3899d0, InterfaceC0057k interfaceC0057k);
    }

    /* renamed from: a5.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo224a();

        /* renamed from: e */
        boolean mo225e(Uri uri, InterfaceC3899d0.c cVar, boolean z10);
    }

    /* renamed from: a5.l$c */
    /* loaded from: classes.dex */
    public static final class c extends IOException {

        /* renamed from: h */
        public final Uri f250h;

        public c(Uri uri) {
            this.f250h = uri;
        }
    }

    /* renamed from: a5.l$d */
    /* loaded from: classes.dex */
    public static final class d extends IOException {

        /* renamed from: h */
        public final Uri f251h;

        public d(Uri uri) {
            this.f251h = uri;
        }
    }

    /* renamed from: a5.l$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: p */
        void mo294p(C0053g c0053g);
    }

    /* renamed from: a */
    boolean mo209a(Uri uri);

    /* renamed from: b */
    void mo210b(b bVar);

    /* renamed from: c */
    void mo211c(Uri uri);

    /* renamed from: d */
    long mo212d();

    /* renamed from: e */
    boolean mo213e();

    /* renamed from: f */
    C0054h mo214f();

    /* renamed from: g */
    boolean mo215g(Uri uri, long j10);

    /* renamed from: h */
    void mo216h(b bVar);

    /* renamed from: i */
    void mo217i();

    /* renamed from: j */
    void mo218j(Uri uri);

    /* renamed from: l */
    void mo220l(Uri uri, InterfaceC4845a0.a aVar, e eVar);

    /* renamed from: m */
    C0053g mo221m(Uri uri, boolean z10);

    void stop();
}
