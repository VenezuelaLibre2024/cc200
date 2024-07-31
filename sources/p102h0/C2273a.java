package p102h0;

import android.graphics.Typeface;
import android.os.Handler;
import p102h0.C2278f;
import p102h0.C2279g;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public class C2273a {

    /* renamed from: a */
    public final C2279g.c f9113a;

    /* renamed from: b */
    public final Handler f9114b;

    /* renamed from: h0.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C2279g.c f9115h;

        /* renamed from: i */
        public final /* synthetic */ Typeface f9116i;

        public a(C2279g.c cVar, Typeface typeface) {
            this.f9115h = cVar;
            this.f9116i = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9115h.mo45b(this.f9116i);
        }
    }

    /* renamed from: h0.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C2279g.c f9118h;

        /* renamed from: i */
        public final /* synthetic */ int f9119i;

        public b(C2279g.c cVar, int i10) {
            this.f9118h = cVar;
            this.f9119i = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9118h.mo44a(this.f9119i);
        }
    }

    public C2273a(C2279g.c cVar, Handler handler) {
        this.f9113a = cVar;
        this.f9114b = handler;
    }

    /* renamed from: a */
    public final void m9234a(int i10) {
        this.f9114b.post(new b(this.f9113a, i10));
    }

    /* renamed from: b */
    public void m9235b(C2278f.e eVar) {
        if (eVar.m9263a()) {
            m9236c(eVar.f9143a);
        } else {
            m9234a(eVar.f9144b);
        }
    }

    /* renamed from: c */
    public final void m9236c(Typeface typeface) {
        this.f9114b.post(new a(this.f9113a, typeface));
    }
}
