package p222p5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: p5.y */
/* loaded from: classes.dex */
public final class C4053y {

    /* renamed from: e */
    public static C4053y f14595e;

    /* renamed from: a */
    public final Handler f14596a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<c>> f14597b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f14598c = new Object();

    /* renamed from: d */
    public int f14599d = 0;

    /* renamed from: p5.y$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: p5.y$b$a */
        /* loaded from: classes.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            public final C4053y f14600a;

            public a(C4053y c4053y) {
                this.f14600a = c4053y;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f14600a.m15592k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* renamed from: a */
        public static void m15593a(Context context, C4053y c4053y) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C4014a.m15199e((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE));
                a aVar = new a(c4053y);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c4053y.m15592k(5);
            }
        }
    }

    /* renamed from: p5.y$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo14871a(int i10);
    }

    /* renamed from: p5.y$d */
    /* loaded from: classes.dex */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m15587g = C4053y.m15587g(context);
            if (C4041n0.f14513a < 31 || m15587g != 5) {
                C4053y.this.m15592k(m15587g);
            } else {
                b.m15593a(context, C4053y.this);
            }
        }
    }

    public C4053y(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized C4053y m15585d(Context context) {
        C4053y c4053y;
        synchronized (C4053y.class) {
            if (f14595e == null) {
                f14595e = new C4053y(context);
            }
            c4053y = f14595e;
        }
        return c4053y;
    }

    /* renamed from: e */
    public static int m15586e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return C4041n0.f14513a >= 29 ? 9 : 0;
        }
    }

    /* renamed from: g */
    public static int m15587g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m15586e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m15588h(c cVar) {
        cVar.mo14871a(m15589f());
    }

    /* renamed from: f */
    public int m15589f() {
        int i10;
        synchronized (this.f14598c) {
            i10 = this.f14599d;
        }
        return i10;
    }

    /* renamed from: i */
    public void m15590i(final c cVar) {
        m15591j();
        this.f14597b.add(new WeakReference<>(cVar));
        this.f14596a.post(new Runnable() { // from class: p5.x
            @Override // java.lang.Runnable
            public final void run() {
                C4053y.this.m15588h(cVar);
            }
        });
    }

    /* renamed from: j */
    public final void m15591j() {
        Iterator<WeakReference<c>> it = this.f14597b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f14597b.remove(next);
            }
        }
    }

    /* renamed from: k */
    public final void m15592k(int i10) {
        synchronized (this.f14598c) {
            if (this.f14599d == i10) {
                return;
            }
            this.f14599d = i10;
            Iterator<WeakReference<c>> it = this.f14597b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.mo14871a(i10);
                } else {
                    this.f14597b.remove(next);
                }
            }
        }
    }
}
