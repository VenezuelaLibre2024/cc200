package p135j2;

import android.content.Context;
import p203o2.InterfaceC3840a;

/* renamed from: j2.g */
/* loaded from: classes.dex */
public class C3215g {

    /* renamed from: e */
    public static C3215g f11125e;

    /* renamed from: a */
    public C3209a f11126a;

    /* renamed from: b */
    public C3210b f11127b;

    /* renamed from: c */
    public C3213e f11128c;

    /* renamed from: d */
    public C3214f f11129d;

    public C3215g(Context context, InterfaceC3840a interfaceC3840a) {
        Context applicationContext = context.getApplicationContext();
        this.f11126a = new C3209a(applicationContext, interfaceC3840a);
        this.f11127b = new C3210b(applicationContext, interfaceC3840a);
        this.f11128c = new C3213e(applicationContext, interfaceC3840a);
        this.f11129d = new C3214f(applicationContext, interfaceC3840a);
    }

    /* renamed from: c */
    public static synchronized C3215g m11441c(Context context, InterfaceC3840a interfaceC3840a) {
        C3215g c3215g;
        synchronized (C3215g.class) {
            if (f11125e == null) {
                f11125e = new C3215g(context, interfaceC3840a);
            }
            c3215g = f11125e;
        }
        return c3215g;
    }

    /* renamed from: a */
    public C3209a m11442a() {
        return this.f11126a;
    }

    /* renamed from: b */
    public C3210b m11443b() {
        return this.f11127b;
    }

    /* renamed from: d */
    public C3213e m11444d() {
        return this.f11128c;
    }

    /* renamed from: e */
    public C3214f m11445e() {
        return this.f11129d;
    }
}
