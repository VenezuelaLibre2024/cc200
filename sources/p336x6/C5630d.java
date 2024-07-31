package p336x6;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import p108h6.C2394s;
import p252r6.AbstractC4306a;

/* renamed from: x6.d */
/* loaded from: classes.dex */
public class C5630d extends FrameLayout {

    /* renamed from: h */
    public final C5641o f21072h;

    public C5630d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f21072h = new C5641o(this, context, googleMapOptions);
        setClickable(true);
    }

    /* renamed from: a */
    public void m22667a(InterfaceC5632f interfaceC5632f) {
        C2394s.m9612e("getMapAsync() must be called on the main thread");
        C2394s.m9620m(interfaceC5632f, "callback must not be null.");
        this.f21072h.m22699p(interfaceC5632f);
    }

    /* renamed from: b */
    public void m22668b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f21072h.m16562c(bundle);
            if (this.f21072h.m16561b() == null) {
                AbstractC4306a.m16555i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: c */
    public void m22669c() {
        this.f21072h.m16563d();
    }

    /* renamed from: d */
    public void m22670d() {
        this.f21072h.m16564e();
    }

    /* renamed from: e */
    public void m22671e(Bundle bundle) {
        this.f21072h.m16565f(bundle);
    }

    /* renamed from: f */
    public void m22672f() {
        this.f21072h.m16566g();
    }

    /* renamed from: g */
    public void m22673g() {
        this.f21072h.m16567h();
    }
}
