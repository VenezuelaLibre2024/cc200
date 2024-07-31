package p080f7;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p108h6.C2394s;
import p207o6.C3938g;
import p207o6.C3946o;
import p207o6.C3948q;
import p207o6.InterfaceC3935d;

/* renamed from: f7.a */
/* loaded from: classes.dex */
public class C1866a {

    /* renamed from: r */
    public static final long f7043r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    public static volatile ScheduledExecutorService f7044s = null;

    /* renamed from: t */
    public static final Object f7045t = new Object();

    /* renamed from: u */
    public static volatile InterfaceC1870e f7046u = new C1868c();

    /* renamed from: a */
    public final Object f7047a;

    /* renamed from: b */
    public final PowerManager.WakeLock f7048b;

    /* renamed from: c */
    public int f7049c;

    /* renamed from: d */
    public Future<?> f7050d;

    /* renamed from: e */
    public long f7051e;

    /* renamed from: f */
    public final Set<C1871f> f7052f;

    /* renamed from: g */
    public boolean f7053g;

    /* renamed from: h */
    public int f7054h;

    /* renamed from: i */
    public zzb f7055i;

    /* renamed from: j */
    public InterfaceC3935d f7056j;

    /* renamed from: k */
    public WorkSource f7057k;

    /* renamed from: l */
    public final String f7058l;

    /* renamed from: m */
    public final String f7059m;

    /* renamed from: n */
    public final Context f7060n;

    /* renamed from: o */
    public final Map<String, C1869d> f7061o;

    /* renamed from: p */
    public AtomicInteger f7062p;

    /* renamed from: q */
    public final ScheduledExecutorService f7063q;

    public C1866a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f7047a = new Object();
        this.f7049c = 0;
        this.f7052f = new HashSet();
        this.f7053g = true;
        this.f7056j = C3938g.m14938d();
        this.f7061o = new HashMap();
        this.f7062p = new AtomicInteger(0);
        C2394s.m9620m(context, "WakeLock: context must not be null");
        C2394s.m9614g(str, "WakeLock: wakeLockName must not be empty");
        this.f7060n = context.getApplicationContext();
        this.f7059m = str;
        this.f7055i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7058l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f7058l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f7048b = newWakeLock;
        if (C3948q.m14971c(context)) {
            WorkSource m14970b = C3948q.m14970b(context, C3946o.m14966b(packageName) ? context.getPackageName() : packageName);
            this.f7057k = m14970b;
            if (m14970b != null) {
                m7608i(newWakeLock, m14970b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f7044s;
        if (scheduledExecutorService == null) {
            synchronized (f7045t) {
                scheduledExecutorService = f7044s;
                if (scheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f7044s = scheduledExecutorService;
                }
            }
        }
        this.f7063q = scheduledExecutorService;
    }

    /* renamed from: e */
    public static /* synthetic */ void m7607e(C1866a c1866a) {
        synchronized (c1866a.f7047a) {
            if (c1866a.m7610b()) {
                Log.e("WakeLock", String.valueOf(c1866a.f7058l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c1866a.m7614g();
                if (c1866a.m7610b()) {
                    c1866a.f7049c = 1;
                    c1866a.m7615h(0);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m7608i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    /* renamed from: a */
    public void m7609a(long j10) {
        this.f7062p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f7043r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f7047a) {
            if (!m7610b()) {
                this.f7055i = zzb.zza(false, null);
                this.f7048b.acquire();
                this.f7056j.mo14933b();
            }
            this.f7049c++;
            this.f7054h++;
            m7613f(null);
            C1869d c1869d = this.f7061o.get(null);
            if (c1869d == null) {
                c1869d = new C1869d(null);
                this.f7061o.put(null, c1869d);
            }
            c1869d.f7065a++;
            long mo14933b = this.f7056j.mo14933b();
            long j11 = Long.MAX_VALUE - mo14933b > max ? mo14933b + max : Long.MAX_VALUE;
            if (j11 > this.f7051e) {
                this.f7051e = j11;
                Future<?> future = this.f7050d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f7050d = this.f7063q.schedule(new Runnable() { // from class: f7.b
                    public /* synthetic */ RunnableC1867b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1866a.m7607e(C1866a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m7610b() {
        boolean z10;
        synchronized (this.f7047a) {
            z10 = this.f7049c > 0;
        }
        return z10;
    }

    /* renamed from: c */
    public void m7611c() {
        if (this.f7062p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7058l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7047a) {
            m7613f(null);
            if (this.f7061o.containsKey(null)) {
                C1869d c1869d = this.f7061o.get(null);
                if (c1869d != null) {
                    int i10 = c1869d.f7065a - 1;
                    c1869d.f7065a = i10;
                    if (i10 == 0) {
                        this.f7061o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f7058l).concat(" counter does not exist"));
            }
            m7615h(0);
        }
    }

    /* renamed from: d */
    public void m7612d(boolean z10) {
        synchronized (this.f7047a) {
            this.f7053g = z10;
        }
    }

    /* renamed from: f */
    public final String m7613f(String str) {
        if (this.f7053g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    public final void m7614g() {
        if (this.f7052f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f7052f);
        this.f7052f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r5.f7055i != null) goto L83;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7615h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f7047a
            monitor-enter(r6)
            boolean r0 = r5.m7610b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        Lb:
            boolean r0 = r5.f7053g     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.f7049c     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + (-1)
            r5.f7049c = r0     // Catch: java.lang.Throwable -> La2
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        L1b:
            r5.f7049c = r1     // Catch: java.lang.Throwable -> La2
        L1d:
            r5.m7614g()     // Catch: java.lang.Throwable -> La2
            java.util.Map<java.lang.String, f7.d> r0 = r5.f7061o     // Catch: java.lang.Throwable -> La2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La2
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La2
            f7.d r2 = (p080f7.C1869d) r2     // Catch: java.lang.Throwable -> La2
            r2.f7065a = r1     // Catch: java.lang.Throwable -> La2
            goto L2a
        L39:
            java.util.Map<java.lang.String, f7.d> r0 = r5.f7061o     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.Future<?> r0 = r5.f7050d     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La2
            r5.f7050d = r2     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r5.f7051e = r3     // Catch: java.lang.Throwable -> La2
        L4c:
            r5.f7054h = r1     // Catch: java.lang.Throwable -> La2
            android.os.PowerManager$WakeLock r0 = r5.f7048b     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L8f
            android.os.PowerManager$WakeLock r0 = r5.f7048b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            com.google.android.gms.internal.stats.zzb r0 = r5.f7055i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
        L5f:
            r5.f7055i = r2     // Catch: java.lang.Throwable -> La2
            goto La0
        L62:
            r0 = move-exception
            goto L88
        L64:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L87
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f7058l     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.stats.zzb r0 = r5.f7055i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
            goto L5f
        L87:
            throw r0     // Catch: java.lang.Throwable -> L62
        L88:
            com.google.android.gms.internal.stats.zzb r1 = r5.f7055i     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8e
            r5.f7055i = r2     // Catch: java.lang.Throwable -> La2
        L8e:
            throw r0     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f7058l     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> La2
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        La2:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080f7.C1866a.m7615h(int):void");
    }
}
