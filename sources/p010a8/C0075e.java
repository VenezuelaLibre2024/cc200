package p010a8;

import android.os.Bundle;
import java.util.Locale;
import p023b8.C0515g;
import p035c8.InterfaceC0985b;
import p224p7.InterfaceC4059a;

/* renamed from: a8.e */
/* loaded from: classes.dex */
public class C0075e implements InterfaceC4059a.b {

    /* renamed from: a */
    public InterfaceC0985b f264a;

    /* renamed from: b */
    public InterfaceC0985b f265b;

    /* renamed from: b */
    public static void m314b(InterfaceC0985b interfaceC0985b, String str, Bundle bundle) {
        if (interfaceC0985b == null) {
            return;
        }
        interfaceC0985b.mo4142f(str, bundle);
    }

    @Override // p224p7.InterfaceC4059a.b
    /* renamed from: a */
    public void mo315a(int i10, Bundle bundle) {
        String string;
        C0515g.m2482f().m2490i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m316c(string, bundle2);
    }

    /* renamed from: c */
    public final void m316c(String str, Bundle bundle) {
        m314b("clx".equals(bundle.getString("_o")) ? this.f264a : this.f265b, str, bundle);
    }

    /* renamed from: d */
    public void m317d(InterfaceC0985b interfaceC0985b) {
        this.f265b = interfaceC0985b;
    }

    /* renamed from: e */
    public void m318e(InterfaceC0985b interfaceC0985b) {
        this.f264a = interfaceC0985b;
    }
}
