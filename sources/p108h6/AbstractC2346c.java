package p108h6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p064e6.C1667b;
import p064e6.C1671d;
import p064e6.C1675f;
import p079f6.C1844d;

/* renamed from: h6.c */
/* loaded from: classes.dex */
public abstract class AbstractC2346c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private C1667b zzB;
    private boolean zzC;
    private volatile C2375l1 zzD;
    public C2405v1 zza;
    public final Handler zzb;
    public c zzc;
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC2364i zzn;
    private final C1675f zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC2379n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC2366i1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C1671d[] zze = new C1671d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: h6.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: c */
        void mo3822c(int i10);

        /* renamed from: g */
        void mo3825g(Bundle bundle);
    }

    /* renamed from: h6.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: e */
        void mo3823e(C1667b c1667b);
    }

    /* renamed from: h6.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: b */
        void mo8233b(C1667b c1667b);
    }

    /* renamed from: h6.c$d */
    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
        }

        @Override // p108h6.AbstractC2346c.c
        /* renamed from: b */
        public final void mo8233b(C1667b c1667b) {
            if (c1667b.m6681M()) {
                AbstractC2346c abstractC2346c = AbstractC2346c.this;
                abstractC2346c.getRemoteService(null, abstractC2346c.getScopes());
            } else if (AbstractC2346c.this.zzx != null) {
                AbstractC2346c.this.zzx.mo3823e(c1667b);
            }
        }
    }

    /* renamed from: h6.c$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo8164a();
    }

    public AbstractC2346c(Context context, Handler handler, AbstractC2364i abstractC2364i, C1675f c1675f, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C2394s.m9620m(context, "Context must not be null");
        this.zzl = context;
        C2394s.m9620m(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C2394s.m9620m(abstractC2364i, "Supervisor must not be null");
        this.zzn = abstractC2364i;
        C2394s.m9620m(c1675f, "API availability must not be null");
        this.zzo = c1675f;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2346c(android.content.Context r10, android.os.Looper r11, int r12, p108h6.AbstractC2346c.a r13, p108h6.AbstractC2346c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            h6.i r3 = p108h6.AbstractC2364i.m9562c(r10)
            e6.f r4 = p064e6.C1675f.m6715f()
            p108h6.C2394s.m9619l(r13)
            p108h6.C2394s.m9619l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108h6.AbstractC2346c.<init>(android.content.Context, android.os.Looper, int, h6.c$a, h6.c$b, java.lang.String):void");
    }

    public AbstractC2346c(Context context, Looper looper, AbstractC2364i abstractC2364i, C1675f c1675f, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C2394s.m9620m(context, "Context must not be null");
        this.zzl = context;
        C2394s.m9620m(looper, "Looper must not be null");
        this.zzm = looper;
        C2394s.m9620m(abstractC2364i, "Supervisor must not be null");
        this.zzn = abstractC2364i;
        C2394s.m9620m(c1675f, "API availability must not be null");
        this.zzo = c1675f;
        this.zzb = new HandlerC2357f1(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public static /* bridge */ /* synthetic */ void zzj(AbstractC2346c abstractC2346c, C2375l1 c2375l1) {
        abstractC2346c.zzD = c2375l1;
        if (abstractC2346c.usesClientTelemetry()) {
            C2355f c2355f = c2375l1.f9660k;
            C2397t.m9625b().m9627c(c2355f == null ? null : c2355f.m9540N());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC2346c abstractC2346c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC2346c.zzp) {
            i11 = abstractC2346c.zzv;
        }
        if (i11 == 3) {
            abstractC2346c.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC2346c.zzb;
        handler.sendMessage(handler.obtainMessage(i12, abstractC2346c.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC2346c abstractC2346c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC2346c.zzp) {
            if (abstractC2346c.zzv != i10) {
                return false;
            }
            abstractC2346c.zzp(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(p108h6.AbstractC2346c r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p108h6.AbstractC2346c.zzo(h6.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i10, IInterface iInterface) {
        C2405v1 c2405v1;
        C2394s.m9608a((i10 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                ServiceConnectionC2366i1 serviceConnectionC2366i1 = this.zzu;
                if (serviceConnectionC2366i1 != null) {
                    AbstractC2364i abstractC2364i = this.zzn;
                    String m9642b = this.zza.m9642b();
                    C2394s.m9619l(m9642b);
                    abstractC2364i.m9567g(m9642b, this.zza.m9641a(), 4225, serviceConnectionC2366i1, zze(), this.zza.m9643c());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                ServiceConnectionC2366i1 serviceConnectionC2366i12 = this.zzu;
                if (serviceConnectionC2366i12 != null && (c2405v1 = this.zza) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c2405v1.m9642b() + " on " + c2405v1.m9641a());
                    AbstractC2364i abstractC2364i2 = this.zzn;
                    String m9642b2 = this.zza.m9642b();
                    C2394s.m9619l(m9642b2);
                    abstractC2364i2.m9567g(m9642b2, this.zza.m9641a(), 4225, serviceConnectionC2366i12, zze(), this.zza.m9643c());
                    this.zzd.incrementAndGet();
                }
                ServiceConnectionC2366i1 serviceConnectionC2366i13 = new ServiceConnectionC2366i1(this, this.zzd.get());
                this.zzu = serviceConnectionC2366i13;
                C2405v1 c2405v12 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C2405v1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new C2405v1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = c2405v12;
                if (c2405v12.m9643c() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m9642b())));
                }
                AbstractC2364i abstractC2364i3 = this.zzn;
                String m9642b3 = this.zza.m9642b();
                C2394s.m9619l(m9642b3);
                if (!abstractC2364i3.mo9568h(new C2387p1(m9642b3, this.zza.m9641a(), 4225, this.zza.m9643c()), serviceConnectionC2366i13, zze(), getBindServiceExecutor())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.zza.m9642b() + " on " + this.zza.m9641a());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                C2394s.m9619l(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int mo6698h = this.zzo.mo6698h(this.zzl, getMinApkVersion());
        if (mo6698h == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), mo6698h, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        C2394s.m9620m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2360g1) this.zzt.get(i10)).m9556d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC2379n interfaceC2379n;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC2379n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC2379n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC2379n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            append.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C1844d.m7583a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C1671d[] getApiFeatures() {
        return zze;
    }

    public final C1671d[] getAvailableFeatures() {
        C2375l1 c2375l1 = this.zzD;
        if (c2375l1 == null) {
            return null;
        }
        return c2375l1.f9658i;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C2405v1 c2405v1;
        if (!isConnected() || (c2405v1 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c2405v1.m9641a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C1675f.f6260a;
    }

    public void getRemoteService(InterfaceC2370k interfaceC2370k, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = C1675f.f6260a;
        Scope[] scopeArr = C2358g.f9615v;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        C1671d[] c1671dArr = C2358g.f9616w;
        C2358g c2358g = new C2358g(6, i11, i10, null, null, scopeArr, bundle, null, c1671dArr, c1671dArr, true, 0, false, str);
        c2358g.f9620k = this.zzl.getPackageName();
        c2358g.f9623n = getServiceRequestExtraArgs;
        if (set != null) {
            c2358g.f9622m = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c2358g.f9624o = account;
            if (interfaceC2370k != null) {
                c2358g.f9621l = interfaceC2370k.asBinder();
            }
        } else if (requiresAccount()) {
            c2358g.f9624o = getAccount();
        }
        c2358g.f9625p = zze;
        c2358g.f9626q = getApiFeatures();
        if (usesClientTelemetry()) {
            c2358g.f9629t = true;
        }
        try {
            synchronized (this.zzq) {
                InterfaceC2379n interfaceC2379n = this.zzr;
                if (interfaceC2379n != null) {
                    interfaceC2379n.mo9584C1(new BinderC2363h1(this, this.zzd.get()), c2358g);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t10 = (T) this.zzs;
            C2394s.m9620m(t10, "Client is connected but service is null");
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            InterfaceC2379n interfaceC2379n = this.zzr;
            if (interfaceC2379n == null) {
                return null;
            }
            return interfaceC2379n.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C2355f getTelemetryConfiguration() {
        C2375l1 c2375l1 = this.zzD;
        if (c2375l1 == null) {
            return null;
        }
        return c2375l1.f9660k;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C1667b c1667b) {
        this.zzi = c1667b.m6677I();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new C2369j1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo8164a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        C2394s.m9620m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new C2372k1(this, i10, null)));
    }
}
