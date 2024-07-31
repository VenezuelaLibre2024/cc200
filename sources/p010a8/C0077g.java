package p010a8;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p023b8.C0512d;
import p023b8.C0514f;
import p023b8.C0515g;
import p023b8.C0519k;
import p023b8.InterfaceC0509a;
import p066e8.C1717a;
import p066e8.C1720b0;
import p066e8.C1727f;
import p066e8.C1733i;
import p066e8.C1741m;
import p066e8.C1751r;
import p066e8.C1757x;
import p066e8.C1759z;
import p127i8.C2664b;
import p141j8.C3262f;
import p157k9.InterfaceC3377a;
import p171l8.C3455f;
import p195n7.C3767g;
import p197n9.C3780a;
import p224p7.InterfaceC4059a;
import p354y8.InterfaceC5895a;
import p369z8.InterfaceC6084h;

/* renamed from: a8.g */
/* loaded from: classes.dex */
public class C0077g {

    /* renamed from: a */
    public final C1751r f267a;

    /* renamed from: a8.g$a */
    /* loaded from: classes.dex */
    public class a implements Continuation<Void, Object> {
        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            C0515g.m2482f().m2487e("Error fetching settings.", task.getException());
            return null;
        }
    }

    /* renamed from: a8.g$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ boolean f268a;

        /* renamed from: b */
        public final /* synthetic */ C1751r f269b;

        /* renamed from: c */
        public final /* synthetic */ C3455f f270c;

        public b(boolean z10, C1751r c1751r, C3455f c3455f) {
            this.f268a = z10;
            this.f269b = c1751r;
            this.f270c = c3455f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.f268a) {
                return null;
            }
            this.f269b.m6984j(this.f270c);
            return null;
        }
    }

    public C0077g(C1751r c1751r) {
        this.f267a = c1751r;
    }

    /* renamed from: d */
    public static C0077g m320d() {
        C0077g c0077g = (C0077g) C3767g.m14334o().m14348k(C0077g.class);
        Objects.requireNonNull(c0077g, "FirebaseCrashlytics component is not present.");
        return c0077g;
    }

    /* renamed from: e */
    public static C0077g m321e(C3767g c3767g, InterfaceC6084h interfaceC6084h, InterfaceC5895a<InterfaceC0509a> interfaceC5895a, InterfaceC5895a<InterfaceC4059a> interfaceC5895a2, InterfaceC5895a<InterfaceC3377a> interfaceC5895a3) {
        Context m14349m = c3767g.m14349m();
        String packageName = m14349m.getPackageName();
        C0515g.m2482f().m2488g("Initializing Firebase Crashlytics " + C1751r.m6976l() + " for " + packageName);
        C3262f c3262f = new C3262f(m14349m);
        C1757x c1757x = new C1757x(c3767g);
        C1720b0 c1720b0 = new C1720b0(m14349m, packageName, interfaceC6084h, c1757x);
        C0512d c0512d = new C0512d(interfaceC5895a);
        C0074d c0074d = new C0074d(interfaceC5895a2);
        ExecutorService m7049c = C1759z.m7049c("Crashlytics Exception Handler");
        C1741m c1741m = new C1741m(c1757x, c3262f);
        C3780a.m14381e(c1741m);
        C1751r c1751r = new C1751r(c3767g, c1720b0, c0512d, c1757x, c0074d.m312e(), c0074d.m311d(), c3262f, m7049c, c1741m, new C0519k(interfaceC5895a3));
        String m14364c = c3767g.m14351r().m14364c();
        String m6825m = C1733i.m6825m(m14349m);
        List<C1727f> m6822j = C1733i.m6822j(m14349m);
        C0515g.m2482f().m2484b("Mapping file ID is: " + m6825m);
        for (C1727f c1727f : m6822j) {
            C0515g.m2482f().m2484b(String.format("Build id for %s on %s: %s", c1727f.m6797c(), c1727f.m6795a(), c1727f.m6796b()));
        }
        try {
            C1717a m6760a = C1717a.m6760a(m14349m, c1720b0, m14364c, m6825m, m6822j, new C0514f(m14349m));
            C0515g.m2482f().m2490i("Installer package name is: " + m6760a.f6315d);
            ExecutorService m7049c2 = C1759z.m7049c("com.google.firebase.crashlytics.startup");
            C3455f m12856l = C3455f.m12856l(m14349m, m14364c, c1720b0, new C2664b(), m6760a.f6317f, m6760a.f6318g, c3262f, c1757x);
            m12856l.m12862o(m7049c2).continueWith(m7049c2, new a());
            Tasks.call(m7049c2, new b(c1751r.m6991s(m6760a, m12856l), c1751r, m12856l));
            return new C0077g(c1751r);
        } catch (PackageManager.NameNotFoundException e10) {
            C0515g.m2482f().m2487e("Error retrieving app package info.", e10);
            return null;
        }
    }

    /* renamed from: a */
    public Task<Boolean> m322a() {
        return this.f267a.m6979e();
    }

    /* renamed from: b */
    public void m323b() {
        this.f267a.m6980f();
    }

    /* renamed from: c */
    public boolean m324c() {
        return this.f267a.m6981g();
    }

    /* renamed from: f */
    public void m325f(String str) {
        this.f267a.m6986n(str);
    }

    /* renamed from: g */
    public void m326g(Throwable th) {
        if (th == null) {
            C0515g.m2482f().m2492k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f267a.m6987o(th);
        }
    }

    /* renamed from: h */
    public void m327h() {
        this.f267a.m6992t();
    }

    /* renamed from: i */
    public void m328i(Boolean bool) {
        this.f267a.m6993u(bool);
    }

    /* renamed from: j */
    public void m329j(boolean z10) {
        this.f267a.m6993u(Boolean.valueOf(z10));
    }

    /* renamed from: k */
    public void m330k(String str, String str2) {
        this.f267a.m6994v(str, str2);
    }

    /* renamed from: l */
    public void m331l(String str) {
        this.f267a.m6996x(str);
    }
}
