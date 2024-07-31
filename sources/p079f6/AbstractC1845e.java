package p079f6;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.C1841a.d;
import p096g6.AbstractC2050o;
import p096g6.AbstractC2071v;
import p096g6.AbstractC2077x;
import p096g6.BinderC2043l1;
import p096g6.C1998a;
import p096g6.C2002b;
import p096g6.C2003b0;
import p096g6.C2018f;
import p096g6.C2034j;
import p096g6.C2038k;
import p096g6.C2039k0;
import p096g6.C2053p;
import p096g6.C2054p0;
import p096g6.InterfaceC2065t;
import p096g6.ServiceConnectionC2041l;
import p108h6.AbstractC2346c;
import p108h6.C2352e;
import p108h6.C2388q;
import p108h6.C2394s;
import p207o6.C3944m;

/* renamed from: f6.e */
/* loaded from: classes.dex */
public abstract class AbstractC1845e<O extends C1841a.d> {
    public final C2018f zaa;
    private final Context zab;
    private final String zac;
    private final C1841a zad;
    private final C1841a.d zae;
    private final C2002b zaf;
    private final Looper zag;
    private final int zah;
    private final AbstractC1846f zai;
    private final InterfaceC2065t zaj;

    /* renamed from: f6.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f7033c = new C6162a().m7584a();

        /* renamed from: a */
        public final InterfaceC2065t f7034a;

        /* renamed from: b */
        public final Looper f7035b;

        /* renamed from: f6.e$a$a */
        /* loaded from: classes.dex */
        public static class C6162a {

            /* renamed from: a */
            public InterfaceC2065t f7036a;

            /* renamed from: b */
            public Looper f7037b;

            /* renamed from: a */
            public a m7584a() {
                if (this.f7036a == null) {
                    this.f7036a = new C1998a();
                }
                if (this.f7037b == null) {
                    this.f7037b = Looper.getMainLooper();
                }
                return new a(this.f7036a, this.f7037b);
            }

            /* renamed from: b */
            public C6162a m7585b(Looper looper) {
                C2394s.m9620m(looper, "Looper must not be null.");
                this.f7037b = looper;
                return this;
            }

            /* renamed from: c */
            public C6162a m7586c(InterfaceC2065t interfaceC2065t) {
                C2394s.m9620m(interfaceC2065t, "StatusExceptionMapper must not be null.");
                this.f7036a = interfaceC2065t;
                return this;
            }
        }

        public a(InterfaceC2065t interfaceC2065t, Account account, Looper looper) {
            this.f7034a = interfaceC2065t;
            this.f7035b = looper;
        }

        public /* synthetic */ a(InterfaceC2065t interfaceC2065t, Account account, Looper looper, C1861u c1861u) {
            this(interfaceC2065t, null, looper);
        }
    }

    public AbstractC1845e(Activity activity, C1841a<O> c1841a, O o10, a aVar) {
        this(activity, activity, c1841a, o10, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1845e(android.app.Activity r2, p079f6.C1841a<O> r3, O r4, p096g6.InterfaceC2065t r5) {
        /*
            r1 = this;
            f6.e$a$a r0 = new f6.e$a$a
            r0.<init>()
            r0.m7586c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m7585b(r5)
            f6.e$a r5 = r0.m7584a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f6.AbstractC1845e.<init>(android.app.Activity, f6.a, f6.a$d, g6.t):void");
    }

    private AbstractC1845e(Context context, Activity activity, C1841a c1841a, C1841a.d dVar, a aVar) {
        C2394s.m9620m(context, "Null context is not permitted.");
        C2394s.m9620m(c1841a, "Api must not be null.");
        C2394s.m9620m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (C3944m.m14962k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = c1841a;
        this.zae = dVar;
        this.zag = aVar.f7035b;
        C2002b m8084a = C2002b.m8084a(c1841a, dVar, str);
        this.zaf = m8084a;
        this.zai = new C2054p0(this);
        C2018f m8126y = C2018f.m8126y(this.zab);
        this.zaa = m8126y;
        this.zah = m8126y.m8145n();
        this.zaj = aVar.f7034a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2003b0.m8086j(activity, m8126y, m8084a);
        }
        m8126y.m8136c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1845e(android.content.Context r2, p079f6.C1841a<O> r3, O r4, android.os.Looper r5, p096g6.InterfaceC2065t r6) {
        /*
            r1 = this;
            f6.e$a$a r0 = new f6.e$a$a
            r0.<init>()
            r0.m7585b(r5)
            r0.m7586c(r6)
            f6.e$a r5 = r0.m7584a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f6.AbstractC1845e.<init>(android.content.Context, f6.a, f6.a$d, android.os.Looper, g6.t):void");
    }

    public AbstractC1845e(Context context, C1841a<O> c1841a, O o10, a aVar) {
        this(context, (Activity) null, c1841a, o10, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1845e(android.content.Context r2, p079f6.C1841a<O> r3, O r4, p096g6.InterfaceC2065t r5) {
        /*
            r1 = this;
            f6.e$a$a r0 = new f6.e$a$a
            r0.<init>()
            r0.m7586c(r5)
            f6.e$a r5 = r0.m7584a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079f6.AbstractC1845e.<init>(android.content.Context, f6.a, f6.a$d, g6.t):void");
    }

    private final AbstractC1164a zad(int i10, AbstractC1164a abstractC1164a) {
        abstractC1164a.zak();
        this.zaa.m8131H(this, i10, abstractC1164a);
        return abstractC1164a;
    }

    private final Task zae(int i10, AbstractC2071v abstractC2071v) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.m8132I(this, i10, abstractC2071v, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public AbstractC1846f asGoogleApiClient() {
        return this.zai;
    }

    public C2352e.a createClientSettingsBuilder() {
        Account m7581y;
        GoogleSignInAccount m7582u;
        GoogleSignInAccount m7582u2;
        C2352e.a aVar = new C2352e.a();
        C1841a.d dVar = this.zae;
        if (!(dVar instanceof C1841a.d.b) || (m7582u2 = ((C1841a.d.b) dVar).m7582u()) == null) {
            C1841a.d dVar2 = this.zae;
            m7581y = dVar2 instanceof C1841a.d.a ? ((C1841a.d.a) dVar2).m7581y() : null;
        } else {
            m7581y = m7582u2.m4937y();
        }
        aVar.m9533d(m7581y);
        C1841a.d dVar3 = this.zae;
        aVar.m9532c((!(dVar3 instanceof C1841a.d.b) || (m7582u = ((C1841a.d.b) dVar3).m7582u()) == null) ? Collections.emptySet() : m7582u.m4930N());
        aVar.m9534e(this.zab.getClass().getName());
        aVar.m9531b(this.zab.getPackageName());
        return aVar;
    }

    public Task<Boolean> disconnectService() {
        return this.zaa.m8128A(this);
    }

    public <A extends C1841a.b, T extends AbstractC1164a<? extends InterfaceC1853m, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <TResult, A extends C1841a.b> Task<TResult> doBestEffortWrite(AbstractC2071v<A, TResult> abstractC2071v) {
        return zae(2, abstractC2071v);
    }

    public <A extends C1841a.b, T extends AbstractC1164a<? extends InterfaceC1853m, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    public <TResult, A extends C1841a.b> Task<TResult> doRead(AbstractC2071v<A, TResult> abstractC2071v) {
        return zae(0, abstractC2071v);
    }

    @Deprecated
    public <A extends C1841a.b, T extends AbstractC2050o<A, ?>, U extends AbstractC2077x<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        C2394s.m9619l(t10);
        C2394s.m9619l(u10);
        C2394s.m9620m(t10.m8225b(), "Listener has already been released.");
        C2394s.m9620m(u10.m8281a(), "Listener has already been released.");
        C2394s.m9609b(C2388q.m9592b(t10.m8225b(), u10.m8281a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.m8129B(this, t10, u10, RunnableC1860t.f7041h);
    }

    public <A extends C1841a.b> Task<Void> doRegisterEventListener(C2053p<A, ?> c2053p) {
        C2394s.m9619l(c2053p);
        C2394s.m9620m(c2053p.f8118a.m8225b(), "Listener has already been released.");
        C2394s.m9620m(c2053p.f8119b.m8281a(), "Listener has already been released.");
        return this.zaa.m8129B(this, c2053p.f8118a, c2053p.f8119b, c2053p.f8120c);
    }

    public Task<Boolean> doUnregisterEventListener(C2034j.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public Task<Boolean> doUnregisterEventListener(C2034j.a<?> aVar, int i10) {
        C2394s.m9620m(aVar, "Listener key cannot be null.");
        return this.zaa.m8130C(this, aVar, i10);
    }

    public <A extends C1841a.b, T extends AbstractC1164a<? extends InterfaceC1853m, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public <TResult, A extends C1841a.b> Task<TResult> doWrite(AbstractC2071v<A, TResult> abstractC2071v) {
        return zae(1, abstractC2071v);
    }

    public final C2002b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C2034j<L> registerListener(L l10, String str) {
        return C2038k.m8168a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1841a.f zab(Looper looper, C2039k0 c2039k0) {
        C1841a.f buildClient = ((C1841a.a) C2394s.m9619l(this.zad.m7578a())).buildClient(this.zab, looper, createClientSettingsBuilder().m9530a(), (C2352e) this.zae, (AbstractC1846f.a) c2039k0, (AbstractC1846f.b) c2039k0);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC2346c)) {
            ((AbstractC2346c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof ServiceConnectionC2041l)) {
            ((ServiceConnectionC2041l) buildClient).m8215d(contextAttributionTag);
        }
        return buildClient;
    }

    public final BinderC2043l1 zac(Context context, Handler handler) {
        return new BinderC2043l1(context, handler, createClientSettingsBuilder().m9530a());
    }
}
