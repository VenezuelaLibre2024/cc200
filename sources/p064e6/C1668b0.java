package p064e6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p108h6.AbstractBinderC2342a1;
import p108h6.C2394s;
import p108h6.InterfaceC2345b1;
import p207o6.C3932a;
import p207o6.C3940i;
import p252r6.BinderC4309d;

/* renamed from: e6.b0 */
/* loaded from: classes.dex */
public final class C1668b0 {

    /* renamed from: e */
    public static volatile InterfaceC2345b1 f6237e;

    /* renamed from: g */
    public static Context f6239g;

    /* renamed from: a */
    public static final AbstractBinderC1703z f6233a = new BinderC1697t(AbstractBinderC1701x.m6753e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final AbstractBinderC1703z f6234b = new BinderC1698u(AbstractBinderC1701x.m6753e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final AbstractBinderC1703z f6235c = new BinderC1699v(AbstractBinderC1701x.m6753e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final AbstractBinderC1703z f6236d = new BinderC1700w(AbstractBinderC1701x.m6753e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f6238f = new Object();

    /* renamed from: a */
    public static C1688l0 m6682a(String str, AbstractBinderC1701x abstractBinderC1701x, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m6687f(str, abstractBinderC1701x, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C1688l0 m6683b(String str, boolean z10, boolean z11, boolean z12) {
        return m6688g(str, z10, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m6684c(boolean z10, String str, AbstractBinderC1701x abstractBinderC1701x) {
        String str2 = true != (!z10 && m6687f(str, abstractBinderC1701x, true, false).f6280a) ? "not allowed" : "debug cert rejected";
        MessageDigest m14917b = C3932a.m14917b("SHA-256");
        C2394s.m9619l(m14917b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, C3940i.m14946a(m14917b.digest(abstractBinderC1701x.mo6754g())), Boolean.valueOf(z10), "12451000.false");
    }

    /* renamed from: d */
    public static synchronized void m6685d(Context context) {
        synchronized (C1668b0.class) {
            if (f6239g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f6239g = context.getApplicationContext();
            }
        }
    }

    /* renamed from: e */
    public static boolean m6686e() {
        boolean z10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m6689h();
                z10 = f6237e.zzi();
            } catch (RemoteException | DynamiteModule.C1165a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                z10 = false;
            }
            return z10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: f */
    public static C1688l0 m6687f(String str, AbstractBinderC1701x abstractBinderC1701x, boolean z10, boolean z11) {
        try {
            m6689h();
            C2394s.m9619l(f6239g);
            try {
                return f6237e.mo9516t1(new C1678g0(str, abstractBinderC1701x, z10, z11), BinderC4309d.m16572g(f6239g.getPackageManager())) ? C1688l0.m6742b() : new C1684j0(new Callable() { // from class: e6.s

                    /* renamed from: a */
                    public final /* synthetic */ boolean f6290a;

                    /* renamed from: b */
                    public final /* synthetic */ String f6291b;

                    /* renamed from: c */
                    public final /* synthetic */ AbstractBinderC1701x f6292c;

                    public /* synthetic */ CallableC1696s(boolean z102, String str2, AbstractBinderC1701x abstractBinderC1701x2) {
                        r1 = z102;
                        r2 = str2;
                        r3 = abstractBinderC1701x2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1668b0.m6684c(r1, r2, r3);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C1688l0.m6744d("module call", e10);
            }
        } catch (DynamiteModule.C1165a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C1688l0.m6744d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [r6.b, android.os.IBinder] */
    /* renamed from: g */
    public static C1688l0 m6688g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        String concat;
        C1688l0 m6744d;
        C1670c0 c1670c0;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C2394s.m9619l(f6239g);
            try {
                m6689h();
                c1670c0 = new C1670c0(str, z10, false, BinderC4309d.m16572g(f6239g), false, true);
            } catch (DynamiteModule.C1165a e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                C1674e0 mo9514N0 = z13 ? f6237e.mo9514N0(c1670c0) : f6237e.mo9515s0(c1670c0);
                if (mo9514N0.m6712I()) {
                    m6744d = C1688l0.m6745f(mo9514N0.m6713J());
                } else {
                    String zza = mo9514N0.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = mo9514N0.m6714K() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    m6744d = C1688l0.m6746g(mo9514N0.m6713J(), mo9514N0.m6714K(), zza, nameNotFoundException);
                }
            } catch (RemoteException e11) {
                e = e11;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module call";
                m6744d = C1688l0.m6744d(concat, e);
                return m6744d;
            }
            return m6744d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: h */
    public static void m6689h() {
        if (f6237e != null) {
            return;
        }
        C2394s.m9619l(f6239g);
        synchronized (f6238f) {
            if (f6237e == null) {
                f6237e = AbstractBinderC2342a1.m9512c(DynamiteModule.m4996e(f6239g, DynamiteModule.f4485f, "com.google.android.gms.googlecertificates").m5005d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
