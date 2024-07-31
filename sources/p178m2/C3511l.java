package p178m2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0430a;
import java.util.UUID;
import p029c2.AbstractC0592j;
import p029c2.C0587e;
import p029c2.C0601s;
import p029c2.InterfaceC0588f;
import p150k2.InterfaceC3346a;
import p165l2.InterfaceC3421q;
import p170l7.InterfaceFutureC3445f;
import p190n2.C3703c;
import p203o2.InterfaceC3840a;

/* renamed from: m2.l */
/* loaded from: classes.dex */
public class C3511l implements InterfaceC0588f {

    /* renamed from: d */
    public static final String f12306d = AbstractC0592j.m2972f("WMFgUpdater");

    /* renamed from: a */
    public final InterfaceC3840a f12307a;

    /* renamed from: b */
    public final InterfaceC3346a f12308b;

    /* renamed from: c */
    public final InterfaceC3421q f12309c;

    /* renamed from: m2.l$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3703c f12310h;

        /* renamed from: i */
        public final /* synthetic */ UUID f12311i;

        /* renamed from: j */
        public final /* synthetic */ C0587e f12312j;

        /* renamed from: k */
        public final /* synthetic */ Context f12313k;

        public a(C3703c c3703c, UUID uuid, C0587e c0587e, Context context) {
            this.f12310h = c3703c;
            this.f12311i = uuid;
            this.f12312j = c0587e;
            this.f12313k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f12310h.isCancelled()) {
                    String uuid = this.f12311i.toString();
                    C0601s.a mo12750m = C3511l.this.f12309c.mo12750m(uuid);
                    if (mo12750m == null || mo12750m.m2986b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C3511l.this.f12308b.mo6154b(uuid, this.f12312j);
                    this.f12313k.startService(C0430a.m2204a(this.f12313k, uuid, this.f12312j));
                }
                this.f12310h.mo13971p(null);
            } catch (Throwable th) {
                this.f12310h.mo13972q(th);
            }
        }
    }

    public C3511l(WorkDatabase workDatabase, InterfaceC3346a interfaceC3346a, InterfaceC3840a interfaceC3840a) {
        this.f12308b = interfaceC3346a;
        this.f12307a = interfaceC3840a;
        this.f12309c = workDatabase.mo2131B();
    }

    @Override // p029c2.InterfaceC0588f
    /* renamed from: a */
    public InterfaceFutureC3445f<Void> mo2964a(Context context, UUID uuid, C0587e c0587e) {
        C3703c m13982t = C3703c.m13982t();
        this.f12307a.mo14611b(new a(m13982t, uuid, c0587e, context));
        return m13982t;
    }
}
