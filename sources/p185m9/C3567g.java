package p185m9;

import ae.C0097c;
import android.util.Log;
import p045d3.AbstractC1532d;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p045d3.InterfaceC1537i;
import p354y8.InterfaceC5896b;
import td.C4747g;
import td.C4753m;

/* renamed from: m9.g */
/* loaded from: classes.dex */
public final class C3567g implements InterfaceC3569h {

    /* renamed from: b */
    public static final a f12567b = new a(null);

    /* renamed from: a */
    public final InterfaceC5896b<InterfaceC1537i> f12568a;

    /* renamed from: m9.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C3567g(InterfaceC5896b<InterfaceC1537i> interfaceC5896b) {
        C4753m.m18653f(interfaceC5896b, "transportFactoryProvider");
        this.f12568a = interfaceC5896b;
    }

    @Override // p185m9.InterfaceC3569h
    /* renamed from: a */
    public void mo13268a(C3591z c3591z) {
        C4753m.m18653f(c3591z, "sessionEvent");
        this.f12568a.get().mo6240a("FIREBASE_APPQUALITY_SESSION", C3591z.class, C1531c.m6232b("json"), new InterfaceC1535g() { // from class: m9.f
            @Override // p045d3.InterfaceC1535g
            public final Object apply(Object obj) {
                byte[] m13269c;
                m13269c = C3567g.this.m13269c((C3591z) obj);
                return m13269c;
            }
        }).mo6238a(AbstractC1532d.m6234e(c3591z));
    }

    /* renamed from: c */
    public final byte[] m13269c(C3591z c3591z) {
        String mo16195b = C3556a0.f12461a.m13209c().mo16195b(c3591z);
        C4753m.m18652e(mo16195b, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + mo16195b);
        byte[] bytes = mo16195b.getBytes(C0097c.f330b);
        C4753m.m18652e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
