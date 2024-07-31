package p195n7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p067e9.C1760a;
import p090g0.C1957q;
import p096g6.ComponentCallbacks2C2006c;
import p108h6.C2388q;
import p108h6.C2394s;
import p207o6.C3934c;
import p207o6.C3944m;
import p207o6.C3945n;
import p281t9.C4734b;
import p281t9.C4735c;
import p285u.C4771a;
import p294u8.InterfaceC4992c;
import p309v8.C5146f;
import p353y7.C5867c;
import p353y7.C5873f;
import p353y7.C5882n;
import p353y7.C5891w;
import p354y8.InterfaceC5896b;
import p368z7.EnumC6053c0;

/* renamed from: n7.g */
/* loaded from: classes.dex */
public class C3767g {

    /* renamed from: k */
    public static final Object f13578k = new Object();

    /* renamed from: l */
    public static final Map<String, C3767g> f13579l = new C4771a();

    /* renamed from: a */
    public final Context f13580a;

    /* renamed from: b */
    public final String f13581b;

    /* renamed from: c */
    public final C3776p f13582c;

    /* renamed from: d */
    public final C5882n f13583d;

    /* renamed from: g */
    public final C5891w<C1760a> f13586g;

    /* renamed from: h */
    public final InterfaceC5896b<C5146f> f13587h;

    /* renamed from: e */
    public final AtomicBoolean f13584e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f13585f = new AtomicBoolean();

    /* renamed from: i */
    public final List<a> f13588i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List<InterfaceC3768h> f13589j = new CopyOnWriteArrayList();

    /* renamed from: n7.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo14323a(boolean z10);
    }

    @TargetApi(14)
    /* renamed from: n7.g$b */
    /* loaded from: classes.dex */
    public static class b implements ComponentCallbacks2C2006c.a {

        /* renamed from: a */
        public static AtomicReference<b> f13590a = new AtomicReference<>();

        /* renamed from: c */
        public static void m14357c(Context context) {
            if (C3944m.m14952a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f13590a.get() == null) {
                    b bVar = new b();
                    if (f13590a.compareAndSet(null, bVar)) {
                        ComponentCallbacks2C2006c.m8092c(application);
                        ComponentCallbacks2C2006c.m8091b().m8093a(bVar);
                    }
                }
            }
        }

        @Override // p096g6.ComponentCallbacks2C2006c.a
        /* renamed from: a */
        public void mo8097a(boolean z10) {
            synchronized (C3767g.f13578k) {
                Iterator it = new ArrayList(C3767g.f13579l.values()).iterator();
                while (it.hasNext()) {
                    C3767g c3767g = (C3767g) it.next();
                    if (c3767g.f13584e.get()) {
                        c3767g.m14340C(z10);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    /* renamed from: n7.g$c */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<c> f13591b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f13592a;

        public c(Context context) {
            this.f13592a = context;
        }

        /* renamed from: b */
        public static void m14359b(Context context) {
            if (f13591b.get() == null) {
                c cVar = new c(context);
                if (f13591b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m14360c() {
            this.f13592a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C3767g.f13578k) {
                Iterator<C3767g> it = C3767g.f13579l.values().iterator();
                while (it.hasNext()) {
                    it.next().m14353t();
                }
            }
            m14360c();
        }
    }

    public C3767g(Context context, String str, C3776p c3776p) {
        this.f13580a = (Context) C2394s.m9619l(context);
        this.f13581b = C2394s.m9613f(str);
        this.f13582c = (C3776p) C2394s.m9619l(c3776p);
        AbstractC3778r m5559b = FirebaseInitProvider.m5559b();
        C4735c.m18605b("Firebase");
        C4735c.m18605b("ComponentDiscovery");
        List<InterfaceC5896b<ComponentRegistrar>> m23510b = C5873f.m23507c(context, ComponentDiscoveryService.class).m23510b();
        C4735c.m18604a();
        C4735c.m18605b("Runtime");
        C5882n.b m23535g = C5882n.m23517l(EnumC6053c0.INSTANCE).m23533d(m23510b).m23532c(new FirebaseCommonRegistrar()).m23532c(new ExecutorsRegistrar()).m23531b(C5867c.m23462s(context, Context.class, new Class[0])).m23531b(C5867c.m23462s(this, C3767g.class, new Class[0])).m23531b(C5867c.m23462s(c3776p, C3776p.class, new Class[0])).m23535g(new C4734b());
        if (C1957q.m7879a(context) && FirebaseInitProvider.m5560c()) {
            m23535g.m23531b(C5867c.m23462s(m5559b, AbstractC3778r.class, new Class[0]));
        }
        C5882n m23534e = m23535g.m23534e();
        this.f13583d = m23534e;
        C4735c.m18604a();
        this.f13586g = new C5891w<>(new InterfaceC5896b() { // from class: n7.f

            /* renamed from: b */
            public final /* synthetic */ Context f13577b;

            public /* synthetic */ C3766f(Context context2) {
                r2 = context2;
            }

            @Override // p354y8.InterfaceC5896b
            public final Object get() {
                C1760a m14339z;
                m14339z = C3767g.this.m14339z(r2);
                return m14339z;
            }
        });
        this.f13587h = m23534e.mo23494c(C5146f.class);
        m14344g(new a() { // from class: n7.e
            public /* synthetic */ C3765e() {
            }

            @Override // p195n7.C3767g.a
            /* renamed from: a */
            public final void mo14323a(boolean z10) {
                C3767g.this.m14324A(z10);
            }
        });
        C4735c.m18604a();
    }

    /* renamed from: A */
    public /* synthetic */ void m14324A(boolean z10) {
        if (z10) {
            return;
        }
        this.f13587h.get().m20830l();
    }

    /* renamed from: B */
    public static String m14325B(String str) {
        return str.trim();
    }

    /* renamed from: l */
    public static List<String> m14332l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f13578k) {
            Iterator<C3767g> it = f13579l.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m14350q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: n */
    public static List<C3767g> m14333n(Context context) {
        ArrayList arrayList;
        synchronized (f13578k) {
            arrayList = new ArrayList(f13579l.values());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C3767g m14334o() {
        C3767g c3767g;
        synchronized (f13578k) {
            c3767g = f13579l.get("[DEFAULT]");
            if (c3767g == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C3945n.m14964a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            c3767g.f13587h.get().m20830l();
        }
        return c3767g;
    }

    /* renamed from: p */
    public static C3767g m14335p(String str) {
        C3767g c3767g;
        String str2;
        synchronized (f13578k) {
            c3767g = f13579l.get(m14325B(str));
            if (c3767g == null) {
                List<String> m14332l = m14332l();
                if (m14332l.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m14332l);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            c3767g.f13587h.get().m20830l();
        }
        return c3767g;
    }

    /* renamed from: u */
    public static C3767g m14336u(Context context) {
        synchronized (f13578k) {
            if (f13579l.containsKey("[DEFAULT]")) {
                return m14334o();
            }
            C3776p m14362a = C3776p.m14362a(context);
            if (m14362a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m14337v(context, m14362a);
        }
    }

    /* renamed from: v */
    public static C3767g m14337v(Context context, C3776p c3776p) {
        return m14338w(context, c3776p, "[DEFAULT]");
    }

    /* renamed from: w */
    public static C3767g m14338w(Context context, C3776p c3776p, String str) {
        C3767g c3767g;
        b.m14357c(context);
        String m14325B = m14325B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f13578k) {
            Map<String, C3767g> map = f13579l;
            C2394s.m9623p(!map.containsKey(m14325B), "FirebaseApp name " + m14325B + " already exists!");
            C2394s.m9620m(context, "Application context cannot be null.");
            c3767g = new C3767g(context, m14325B, c3776p);
            map.put(m14325B, c3767g);
        }
        c3767g.m14353t();
        return c3767g;
    }

    /* renamed from: z */
    public /* synthetic */ C1760a m14339z(Context context) {
        return new C1760a(context, m14352s(), (InterfaceC4992c) this.f13583d.get(InterfaceC4992c.class));
    }

    /* renamed from: C */
    public final void m14340C(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f13588i.iterator();
        while (it.hasNext()) {
            it.next().mo14323a(z10);
        }
    }

    /* renamed from: D */
    public final void m14341D() {
        Iterator<InterfaceC3768h> it = this.f13589j.iterator();
        while (it.hasNext()) {
            it.next().mo13274a(this.f13581b, this.f13582c);
        }
    }

    /* renamed from: E */
    public void m14342E(boolean z10) {
        boolean z11;
        m14346i();
        if (this.f13584e.compareAndSet(!z10, z10)) {
            boolean m8094d = ComponentCallbacks2C2006c.m8091b().m8094d();
            if (z10 && m8094d) {
                z11 = true;
            } else if (z10 || !m8094d) {
                return;
            } else {
                z11 = false;
            }
            m14340C(z11);
        }
    }

    /* renamed from: F */
    public void m14343F(Boolean bool) {
        m14346i();
        this.f13586g.get().m7056e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3767g) {
            return this.f13581b.equals(((C3767g) obj).m14350q());
        }
        return false;
    }

    /* renamed from: g */
    public void m14344g(a aVar) {
        m14346i();
        if (this.f13584e.get() && ComponentCallbacks2C2006c.m8091b().m8094d()) {
            aVar.mo14323a(true);
        }
        this.f13588i.add(aVar);
    }

    /* renamed from: h */
    public void m14345h(InterfaceC3768h interfaceC3768h) {
        m14346i();
        C2394s.m9619l(interfaceC3768h);
        this.f13589j.add(interfaceC3768h);
    }

    public int hashCode() {
        return this.f13581b.hashCode();
    }

    /* renamed from: i */
    public final void m14346i() {
        C2394s.m9623p(!this.f13585f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: j */
    public void m14347j() {
        if (this.f13585f.compareAndSet(false, true)) {
            synchronized (f13578k) {
                f13579l.remove(this.f13581b);
            }
            m14341D();
        }
    }

    /* renamed from: k */
    public <T> T m14348k(Class<T> cls) {
        m14346i();
        return (T) this.f13583d.get(cls);
    }

    /* renamed from: m */
    public Context m14349m() {
        m14346i();
        return this.f13580a;
    }

    /* renamed from: q */
    public String m14350q() {
        m14346i();
        return this.f13581b;
    }

    /* renamed from: r */
    public C3776p m14351r() {
        m14346i();
        return this.f13582c;
    }

    /* renamed from: s */
    public String m14352s() {
        return C3934c.m14931e(m14350q().getBytes(Charset.defaultCharset())) + "+" + C3934c.m14931e(m14351r().m14364c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: t */
    public final void m14353t() {
        if (!C1957q.m7879a(this.f13580a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m14350q());
            c.m14359b(this.f13580a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m14350q());
        this.f13583d.m23524o(m14355y());
        this.f13587h.get().m20830l();
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("name", this.f13581b).m9595a("options", this.f13582c).toString();
    }

    /* renamed from: x */
    public boolean m14354x() {
        m14346i();
        return this.f13586g.get().m7053b();
    }

    /* renamed from: y */
    public boolean m14355y() {
        return "[DEFAULT]".equals(m14350q());
    }
}
