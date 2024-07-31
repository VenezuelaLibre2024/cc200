package p044d2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C0416a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p029c2.AbstractC0592j;
import p029c2.AbstractC0602t;
import p029c2.AbstractC0603u;
import p029c2.C0598p;
import p029c2.InterfaceC0595m;
import p060e2.C1644b;
import p092g2.C1962b;
import p178m2.AbstractRunnableC3500a;
import p178m2.C3504e;
import p178m2.RunnableC3507h;
import p178m2.RunnableC3508i;
import p203o2.InterfaceC3840a;

/* renamed from: d2.i */
/* loaded from: classes.dex */
public class C1527i extends AbstractC0602t {

    /* renamed from: j */
    public static final String f5574j = AbstractC0592j.m2972f("WorkManagerImpl");

    /* renamed from: k */
    public static C1527i f5575k = null;

    /* renamed from: l */
    public static C1527i f5576l = null;

    /* renamed from: m */
    public static final Object f5577m = new Object();

    /* renamed from: a */
    public Context f5578a;

    /* renamed from: b */
    public C0416a f5579b;

    /* renamed from: c */
    public WorkDatabase f5580c;

    /* renamed from: d */
    public InterfaceC3840a f5581d;

    /* renamed from: e */
    public List<InterfaceC1523e> f5582e;

    /* renamed from: f */
    public C1522d f5583f;

    /* renamed from: g */
    public C3504e f5584g;

    /* renamed from: h */
    public boolean f5585h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f5586i;

    public C1527i(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a) {
        this(context, c0416a, interfaceC3840a, context.getResources().getBoolean(C0598p.f2613a));
    }

    public C1527i(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC0592j.m2971e(new AbstractC0592j.a(c0416a.m2097j()));
        List<InterfaceC1523e> m6193g = m6193g(applicationContext, c0416a, interfaceC3840a);
        m6201q(context, c0416a, interfaceC3840a, workDatabase, m6193g, new C1522d(context, c0416a, interfaceC3840a, workDatabase, m6193g));
    }

    public C1527i(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, boolean z10) {
        this(context, c0416a, interfaceC3840a, WorkDatabase.m2126s(context.getApplicationContext(), interfaceC3840a.mo14612c(), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (p044d2.C1527i.f5576l != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        p044d2.C1527i.f5576l = new p044d2.C1527i(r4, r5, new p203o2.C3841b(r5.m2099l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        p044d2.C1527i.f5575k = p044d2.C1527i.f5576l;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m6190f(android.content.Context r4, androidx.work.C0416a r5) {
        /*
            java.lang.Object r0 = p044d2.C1527i.f5577m
            monitor-enter(r0)
            d2.i r1 = p044d2.C1527i.f5575k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            d2.i r2 = p044d2.C1527i.f5576l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            d2.i r1 = p044d2.C1527i.f5576l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            d2.i r1 = new d2.i     // Catch: java.lang.Throwable -> L34
            o2.b r2 = new o2.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.m2099l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            p044d2.C1527i.f5576l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            d2.i r4 = p044d2.C1527i.f5576l     // Catch: java.lang.Throwable -> L34
            p044d2.C1527i.f5575k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p044d2.C1527i.m6190f(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    /* renamed from: j */
    public static C1527i m6191j() {
        synchronized (f5577m) {
            C1527i c1527i = f5575k;
            if (c1527i != null) {
                return c1527i;
            }
            return f5576l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static C1527i m6192k(Context context) {
        C1527i m6191j;
        synchronized (f5577m) {
            m6191j = m6191j();
            if (m6191j == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C0416a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m6190f(applicationContext, ((C0416a.c) applicationContext).m2103a());
                m6191j = m6192k(applicationContext);
            }
        }
        return m6191j;
    }

    @Override // p029c2.AbstractC0602t
    /* renamed from: a */
    public InterfaceC0595m mo2989a(String str) {
        AbstractRunnableC3500a m13028d = AbstractRunnableC3500a.m13028d(str, this);
        this.f5581d.mo14611b(m13028d);
        return m13028d.m13030e();
    }

    @Override // p029c2.AbstractC0602t
    /* renamed from: b */
    public InterfaceC0595m mo2990b(UUID uuid) {
        AbstractRunnableC3500a m13026b = AbstractRunnableC3500a.m13026b(uuid, this);
        this.f5581d.mo14611b(m13026b);
        return m13026b.m13030e();
    }

    @Override // p029c2.AbstractC0602t
    /* renamed from: d */
    public InterfaceC0595m mo2992d(List<? extends AbstractC0603u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C1525g(this, list).m6174a();
    }

    /* renamed from: g */
    public List<InterfaceC1523e> m6193g(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a) {
        return Arrays.asList(C1524f.m6169a(context, this), new C1644b(context, c0416a, interfaceC3840a, this));
    }

    /* renamed from: h */
    public Context m6194h() {
        return this.f5578a;
    }

    /* renamed from: i */
    public C0416a m6195i() {
        return this.f5579b;
    }

    /* renamed from: l */
    public C3504e m6196l() {
        return this.f5584g;
    }

    /* renamed from: m */
    public C1522d m6197m() {
        return this.f5583f;
    }

    /* renamed from: n */
    public List<InterfaceC1523e> m6198n() {
        return this.f5582e;
    }

    /* renamed from: o */
    public WorkDatabase m6199o() {
        return this.f5580c;
    }

    /* renamed from: p */
    public InterfaceC3840a m6200p() {
        return this.f5581d;
    }

    /* renamed from: q */
    public final void m6201q(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, WorkDatabase workDatabase, List<InterfaceC1523e> list, C1522d c1522d) {
        Context applicationContext = context.getApplicationContext();
        this.f5578a = applicationContext;
        this.f5579b = c0416a;
        this.f5581d = interfaceC3840a;
        this.f5580c = workDatabase;
        this.f5582e = list;
        this.f5583f = c1522d;
        this.f5584g = new C3504e(workDatabase);
        this.f5585h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f5581d.mo14611b(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: r */
    public void m6202r() {
        synchronized (f5577m) {
            this.f5585h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f5586i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f5586i = null;
            }
        }
    }

    /* renamed from: s */
    public void m6203s() {
        if (Build.VERSION.SDK_INT >= 23) {
            C1962b.m7925b(m6194h());
        }
        m6199o().mo2131B().mo12758u();
        C1524f.m6170b(m6195i(), m6199o(), m6198n());
    }

    /* renamed from: t */
    public void m6204t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5577m) {
            this.f5586i = pendingResult;
            if (this.f5585h) {
                pendingResult.finish();
                this.f5586i = null;
            }
        }
    }

    /* renamed from: u */
    public void m6205u(String str) {
        m6206v(str, null);
    }

    /* renamed from: v */
    public void m6206v(String str, WorkerParameters.C0415a c0415a) {
        this.f5581d.mo14611b(new RunnableC3507h(this, str, c0415a));
    }

    /* renamed from: w */
    public void m6207w(String str) {
        this.f5581d.mo14611b(new RunnableC3508i(this, str, true));
    }

    /* renamed from: x */
    public void m6208x(String str) {
        this.f5581d.mo14611b(new RunnableC3508i(this, str, false));
    }
}
