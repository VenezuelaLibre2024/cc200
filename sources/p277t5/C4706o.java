package p277t5;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p064e6.C1673e;
import p064e6.C1677g;
import p064e6.C1679h;
import p064e6.C1683j;
import p064e6.ServiceConnectionC1665a;
import p079f6.C1841a;
import p079f6.C1842b;
import p108h6.AbstractC2364i;
import p108h6.C2394s;
import p154k6.C3363a;

/* renamed from: t5.o */
/* loaded from: classes.dex */
public class C4706o {

    /* renamed from: a */
    public static final String[] f17562a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    @SuppressLint({"InlinedApi"})
    public static final String f17563b = "androidPackageName";

    /* renamed from: c */
    public static final ComponentName f17564c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d */
    public static final C3363a f17565d = C4701j.m18504a("GoogleAuthUtil");

    /* renamed from: a */
    public static void m18506a(Context context, String str) {
        m18512g(context, str, 0L);
    }

    /* renamed from: b */
    public static String m18507b(Context context, Account account, String str) {
        return m18508c(context, account, str, new Bundle());
    }

    /* renamed from: c */
    public static String m18508c(Context context, Account account, String str, Bundle bundle) {
        m18521p(account);
        return m18509d(context, account, str, bundle, 0L, null).zza();
    }

    /* renamed from: d */
    public static TokenData m18509d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) {
        C2394s.m9618k("Calling this from your main thread can lead to deadlock");
        C2394s.m9614g(str, "Scope cannot be empty or null.");
        m18521p(account);
        m18517l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m18519n(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && m18522q(context)) {
            try {
                Bundle bundle3 = (Bundle) m18515j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                m18516k(bundle3);
                return m18513h(context, "getTokenWithDetails", bundle3);
            } catch (C1842b e10) {
                m18518m(e10, "token retrieval");
            }
        }
        return (TokenData) m18514i(context, f17564c, new InterfaceC4705n() { // from class: t5.l
            @Override // p277t5.InterfaceC4705n
            /* renamed from: a */
            public final Object mo18505a(IBinder iBinder) {
                return C4706o.m18510e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    /* renamed from: e */
    public static /* synthetic */ TokenData m18510e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return m18513h(context, "getTokenWithDetails", zze);
        }
        throw new IOException("Service call returned null");
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Object m18511f(Object obj) {
        m18516k(obj);
        return obj;
    }

    /* renamed from: g */
    public static void m18512g(Context context, String str, long j10) {
        C2394s.m9618k("Calling this from your main thread can lead to deadlock");
        m18517l(context, 8400000);
        Bundle bundle = new Bundle();
        m18519n(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && m18522q(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                m18515j(zza.zza(zzbwVar), "clear token");
                return;
            } catch (C1842b e10) {
                m18518m(e10, "clear token");
            }
        }
        m18514i(context, f17564c, new C4704m(str, bundle), 0L, null);
    }

    /* renamed from: h */
    public static TokenData m18513h(Context context, String str, Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        m18520o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new C4695d("Invalid state. Shouldn't happen");
    }

    /* renamed from: i */
    public static Object m18514i(Context context, ComponentName componentName, InterfaceC4705n interfaceC4705n, long j10, Executor executor) {
        ServiceConnectionC1665a serviceConnectionC1665a = new ServiceConnectionC1665a();
        AbstractC2364i m9562c = AbstractC2364i.m9562c(context);
        try {
            try {
                if (!m9562c.m9564a(componentName, serviceConnectionC1665a, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return interfaceC4705n.mo18505a(serviceConnectionC1665a.m6674a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                m9562c.m9565e(componentName, serviceConnectionC1665a, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    /* renamed from: j */
    public static Object m18515j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f17565d.m12513h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f17565d.m12513h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof C1842b) {
                throw ((C1842b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f17565d.m12513h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    /* renamed from: k */
    public static Object m18516k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f17565d.m12513h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    /* renamed from: l */
    public static void m18517l(Context context, int i10) {
        try {
            C1683j.m6723a(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException e10) {
            e = e10;
            throw new C4695d(e.getMessage(), e);
        } catch (C1677g e11) {
            e = e11;
            throw new C4695d(e.getMessage(), e);
        } catch (C1679h e12) {
            throw new C4697f(e12.m6719b(), e12.getMessage(), e12.m6750a());
        }
    }

    /* renamed from: m */
    public static void m18518m(C1842b c1842b, String str) {
        f17565d.m12513h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(c1842b));
    }

    /* renamed from: n */
    public static void m18519n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f17563b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* renamed from: o */
    public static void m18520o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        zzby zza = zzby.zza(str2);
        C3363a c3363a = f17565d;
        c3363a.m12513h(String.format("[GoogleAuthUtil] error status:%s with method:%s", zza, str), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zza) && !zzby.CAPTCHA.equals(zza) && !zzby.NEED_PERMISSION.equals(zza) && !zzby.NEED_REMOTE_CONSENT.equals(zza) && !zzby.NEEDS_BROWSER.equals(zza) && !zzby.USER_CANCEL.equals(zza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_INTERNAL_ERROR.equals(zza) && !zzby.DM_SYNC_DISABLED.equals(zza) && !zzby.DM_ADMIN_BLOCKED.equals(zza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zza) && !zzby.DM_DEACTIVATED.equals(zza) && !zzby.DM_REQUIRED.equals(zza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            if (!zzby.NETWORK_ERROR.equals(zza) && !zzby.SERVICE_UNAVAILABLE.equals(zza) && !zzby.INTNERNAL_ERROR.equals(zza) && !zzby.AUTH_SECURITY_ERROR.equals(zza) && !zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
                throw new C4695d(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.m4891b(str2, intent, pendingIntent);
        }
        if (C1673e.m6693m().m6716a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer valueOf = Integer.valueOf(C1841a.e.API_PRIORITY_OTHER);
            c3363a.m12508c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", valueOf, str, valueOf), new Object[0]);
        }
        if (intent == null) {
            c3363a.m12508c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    /* renamed from: p */
    public static void m18521p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f17562a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    /* renamed from: q */
    public static boolean m18522q(Context context) {
        if (C1673e.m6693m().mo6698h(context, 17895000) != 0) {
            return false;
        }
        List zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
