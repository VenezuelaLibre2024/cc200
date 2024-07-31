package p279t7;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p096g6.ComponentCallbacks2C2006c;
import p108h6.C2394s;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p268s7.AbstractC4546b;
import p293u7.InterfaceC4987a;

/* renamed from: t7.n */
/* loaded from: classes.dex */
public final class C4723n {

    /* renamed from: a */
    public final C4720k f17633a;

    /* renamed from: b */
    public final InterfaceC4987a f17634b;

    /* renamed from: c */
    public volatile boolean f17635c;

    /* renamed from: d */
    public volatile int f17636d;

    /* renamed from: e */
    public volatile long f17637e;

    /* renamed from: f */
    public volatile boolean f17638f;

    /* renamed from: t7.n$a */
    /* loaded from: classes.dex */
    public class a implements ComponentCallbacks2C2006c.a {

        /* renamed from: a */
        public final /* synthetic */ C4720k f17639a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4987a f17640b;

        public a(C4720k c4720k, InterfaceC4987a interfaceC4987a) {
            this.f17639a = c4720k;
            this.f17640b = interfaceC4987a;
        }

        @Override // p096g6.ComponentCallbacks2C2006c.a
        /* renamed from: a */
        public void mo8097a(boolean z10) {
            C4723n.this.f17635c = z10;
            if (z10) {
                this.f17639a.m18551c();
            } else if (C4723n.this.m18566f()) {
                this.f17639a.m18554g(C4723n.this.f17637e - this.f17640b.mo19550a());
            }
        }
    }

    public C4723n(Context context, C4717h c4717h, @InterfaceC4320c Executor executor, @InterfaceC4319b ScheduledExecutorService scheduledExecutorService) {
        this((Context) C2394s.m9619l(context), new C4720k((C4717h) C2394s.m9619l(c4717h), executor, scheduledExecutorService), new InterfaceC4987a.a());
    }

    public C4723n(Context context, C4720k c4720k, InterfaceC4987a interfaceC4987a) {
        this.f17633a = c4720k;
        this.f17634b = interfaceC4987a;
        this.f17637e = -1L;
        ComponentCallbacks2C2006c.m8092c((Application) context.getApplicationContext());
        ComponentCallbacks2C2006c.m8091b().m8093a(new a(c4720k, interfaceC4987a));
    }

    /* renamed from: d */
    public void m18564d(AbstractC4546b abstractC4546b) {
        C4710a m18523c = abstractC4546b instanceof C4710a ? (C4710a) abstractC4546b : C4710a.m18523c(abstractC4546b.mo17978b());
        this.f17637e = m18523c.m18527g() + ((long) (m18523c.m18526e() * 0.5d)) + 300000;
        if (this.f17637e > m18523c.mo17977a()) {
            this.f17637e = m18523c.mo17977a() - 60000;
        }
        if (m18566f()) {
            this.f17633a.m18554g(this.f17637e - this.f17634b.mo19550a());
        }
    }

    /* renamed from: e */
    public void m18565e(int i10) {
        if (this.f17636d == 0 && i10 > 0) {
            this.f17636d = i10;
            if (m18566f()) {
                this.f17633a.m18554g(this.f17637e - this.f17634b.mo19550a());
            }
        } else if (this.f17636d > 0 && i10 == 0) {
            this.f17633a.m18551c();
        }
        this.f17636d = i10;
    }

    /* renamed from: f */
    public final boolean m18566f() {
        return this.f17638f && !this.f17635c && this.f17636d > 0 && this.f17637e != -1;
    }
}
