package p266s5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p064e6.C1675f;
import p064e6.C1677g;
import p064e6.C1683j;
import p064e6.ServiceConnectionC1665a;
import p108h6.C2394s;
import p194n6.C3760a;

/* renamed from: s5.a */
/* loaded from: classes.dex */
public class C4532a {

    /* renamed from: a */
    public ServiceConnectionC1665a f17124a;

    /* renamed from: b */
    public zzf f17125b;

    /* renamed from: c */
    public boolean f17126c;

    /* renamed from: d */
    public final Object f17127d = new Object();

    /* renamed from: e */
    public C4534c f17128e;

    /* renamed from: f */
    public final Context f17129f;

    /* renamed from: g */
    public final long f17130g;

    /* renamed from: s5.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f17131a;

        /* renamed from: b */
        public final boolean f17132b;

        @Deprecated
        public a(String str, boolean z10) {
            this.f17131a = str;
            this.f17132b = z10;
        }

        /* renamed from: a */
        public String m17963a() {
            return this.f17131a;
        }

        /* renamed from: b */
        public boolean m17964b() {
            return this.f17132b;
        }

        public String toString() {
            String str = this.f17131a;
            boolean z10 = this.f17132b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public C4532a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C2394s.m9619l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f17129f = context;
        this.f17126c = false;
        this.f17130g = j10;
    }

    /* renamed from: a */
    public static a m17956a(Context context) {
        C4532a c4532a = new C4532a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4532a.m17959d(false);
            a m17961f = c4532a.m17961f(-1);
            c4532a.m17960e(m17961f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m17961f;
        } finally {
        }
    }

    /* renamed from: b */
    public static void m17957b(boolean z10) {
    }

    /* renamed from: c */
    public final void m17958c() {
        C2394s.m9618k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f17129f == null || this.f17124a == null) {
                return;
            }
            try {
                if (this.f17126c) {
                    C3760a.m14312b().m14317c(this.f17129f, this.f17124a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f17126c = false;
            this.f17125b = null;
            this.f17124a = null;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void m17959d(boolean z10) {
        C2394s.m9618k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f17126c) {
                m17958c();
            }
            Context context = this.f17129f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo6698h = C1675f.m6715f().mo6698h(context, C1683j.f6269a);
                if (mo6698h != 0 && mo6698h != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC1665a serviceConnectionC1665a = new ServiceConnectionC1665a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!C3760a.m14312b().m14316a(context, intent, serviceConnectionC1665a, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f17124a = serviceConnectionC1665a;
                    try {
                        this.f17125b = zze.zza(serviceConnectionC1665a.m6675b(10000L, TimeUnit.MILLISECONDS));
                        this.f17126c = true;
                        if (z10) {
                            m17962g();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new C1677g(9);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final boolean m17960e(a aVar, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", true != aVar.m17964b() ? "0" : "1");
            String m17963a = aVar.m17963a();
            if (m17963a != null) {
                hashMap.put("ad_id_size", Integer.toString(m17963a.length()));
            }
        }
        if (th != null) {
            hashMap.put(ImagePickerCache.MAP_KEY_ERROR, th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new C4533b(this, hashMap).start();
        return true;
    }

    /* renamed from: f */
    public final a m17961f(int i10) {
        a aVar;
        C2394s.m9618k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f17126c) {
                synchronized (this.f17127d) {
                    C4534c c4534c = this.f17128e;
                    if (c4534c == null || !c4534c.f17137k) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m17959d(false);
                    if (!this.f17126c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            C2394s.m9619l(this.f17124a);
            C2394s.m9619l(this.f17125b);
            try {
                aVar = new a(this.f17125b.zzc(), this.f17125b.zze(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        m17962g();
        return aVar;
    }

    public final void finalize() {
        m17958c();
        super.finalize();
    }

    /* renamed from: g */
    public final void m17962g() {
        synchronized (this.f17127d) {
            C4534c c4534c = this.f17128e;
            if (c4534c != null) {
                c4534c.f17136j.countDown();
                try {
                    this.f17128e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f17130g;
            if (j10 > 0) {
                this.f17128e = new C4534c(this, j10);
            }
        }
    }
}
