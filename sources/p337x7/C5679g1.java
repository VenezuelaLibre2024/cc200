package p337x7;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import p096g6.ComponentCallbacks2C2006c;
import p195n7.C3767g;

/* renamed from: x7.g1 */
/* loaded from: classes.dex */
public final class C5679g1 {

    /* renamed from: a */
    public volatile int f21168a;

    /* renamed from: b */
    public final C5718t f21169b;

    /* renamed from: c */
    public volatile boolean f21170c;

    public C5679g1(Context context, C5718t c5718t) {
        this.f21170c = false;
        this.f21168a = 0;
        this.f21169b = c5718t;
        ComponentCallbacks2C2006c.m8092c((Application) context.getApplicationContext());
        ComponentCallbacks2C2006c.m8091b().m8093a(new C5675f1(this));
    }

    public C5679g1(C3767g c3767g) {
        this(c3767g.m14349m(), new C5718t(c3767g));
    }

    /* renamed from: b */
    public final void m22757b() {
        this.f21169b.m22822b();
    }

    /* renamed from: c */
    public final void m22758c(zzafm zzafmVar) {
        if (zzafmVar == null) {
            return;
        }
        long zza = zzafmVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzafmVar.zzb() + (zza * 1000);
        C5718t c5718t = this.f21169b;
        c5718t.f21247b = zzb;
        c5718t.f21248c = -1L;
        if (m22759e()) {
            this.f21169b.m22823c();
        }
    }

    /* renamed from: e */
    public final boolean m22759e() {
        return this.f21168a > 0 && !this.f21170c;
    }
}
