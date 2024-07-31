package p224p7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p022b7.C0508a;
import p108h6.C2394s;
import p195n7.C3762b;
import p195n7.C3767g;
import p224p7.InterfaceC4059a;
import p238q7.C4196a;
import p238q7.C4199d;
import p238q7.C4201f;
import p294u8.C4990a;
import p294u8.InterfaceC4991b;
import p294u8.InterfaceC4993d;

/* renamed from: p7.b */
/* loaded from: classes.dex */
public class C4060b implements InterfaceC4059a {

    /* renamed from: c */
    public static volatile InterfaceC4059a f14613c;

    /* renamed from: a */
    public final C0508a f14614a;

    /* renamed from: b */
    public final Map<String, Object> f14615b;

    /* renamed from: p7.b$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4059a.a {

        /* renamed from: a */
        public final /* synthetic */ String f14616a;

        /* renamed from: b */
        public final /* synthetic */ C4060b f14617b;

        public a(C4060b c4060b, String str) {
            this.f14616a = str;
            this.f14617b = c4060b;
        }
    }

    public C4060b(C0508a c0508a) {
        C2394s.m9619l(c0508a);
        this.f14614a = c0508a;
        this.f14615b = new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static InterfaceC4059a m15616d(C3767g c3767g, Context context, InterfaceC4993d interfaceC4993d) {
        C2394s.m9619l(c3767g);
        C2394s.m9619l(context);
        C2394s.m9619l(interfaceC4993d);
        C2394s.m9619l(context.getApplicationContext());
        if (f14613c == null) {
            synchronized (C4060b.class) {
                if (f14613c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c3767g.m14355y()) {
                        interfaceC4993d.mo19565b(C3762b.class, new Executor() { // from class: p7.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC4991b() { // from class: p7.d
                            @Override // p294u8.InterfaceC4991b
                            /* renamed from: a */
                            public final void mo8698a(C4990a c4990a) {
                                C4060b.m15617e(c4990a);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c3767g.m14354x());
                    }
                    f14613c = new C4060b(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return f14613c;
    }

    /* renamed from: e */
    public static /* synthetic */ void m15617e(C4990a c4990a) {
        boolean z10 = ((C3762b) c4990a.m19561a()).f13573a;
        synchronized (C4060b.class) {
            ((C4060b) C2394s.m9619l(f14613c)).f14614a.m2458d(z10);
        }
    }

    @Override // p224p7.InterfaceC4059a
    /* renamed from: a */
    public void mo15613a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C4196a.m16191g(str) && C4196a.m16187c(str2, bundle) && C4196a.m16189e(str, str2, bundle)) {
            C4196a.m16186b(str, str2, bundle);
            this.f14614a.m2455a(str, str2, bundle);
        }
    }

    @Override // p224p7.InterfaceC4059a
    /* renamed from: b */
    public void mo15614b(String str, String str2, Object obj) {
        if (C4196a.m16191g(str) && C4196a.m16188d(str, str2)) {
            this.f14614a.m2457c(str, str2, obj);
        }
    }

    @Override // p224p7.InterfaceC4059a
    /* renamed from: c */
    public InterfaceC4059a.a mo15615c(String str, InterfaceC4059a.b bVar) {
        C2394s.m9619l(bVar);
        if (!C4196a.m16191g(str) || m15618f(str)) {
            return null;
        }
        C0508a c0508a = this.f14614a;
        Object c4199d = "fiam".equals(str) ? new C4199d(c0508a, bVar) : "clx".equals(str) ? new C4201f(c0508a, bVar) : null;
        if (c4199d == null) {
            return null;
        }
        this.f14615b.put(str, c4199d);
        return new a(this, str);
    }

    /* renamed from: f */
    public final boolean m15618f(String str) {
        return (str.isEmpty() || !this.f14615b.containsKey(str) || this.f14615b.get(str) == null) ? false : true;
    }
}
