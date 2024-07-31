package p064e6;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.ActivityC0306j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.errorprone.annotations.RestrictedInheritance;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import p033c6.C0615a;
import p033c6.C0616b;
import p096g6.AbstractC2057q0;
import p096g6.C2060r0;
import p096g6.InterfaceC2030i;
import p108h6.AbstractDialogInterfaceOnClickListenerC2365i0;
import p108h6.C2356f0;
import p108h6.C2394s;
import p130ib.C2699n;
import p207o6.C3939h;
import p207o6.C3944m;
import p237q6.C4193a;
import p329x.C5494l;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: e6.e */
/* loaded from: classes.dex */
public class C1673e extends C1675f {

    /* renamed from: c */
    public String f6255c;

    /* renamed from: e */
    public static final Object f6253e = new Object();

    /* renamed from: f */
    public static final C1673e f6254f = new C1673e();

    /* renamed from: d */
    public static final int f6252d = C1675f.f6260a;

    /* renamed from: m */
    public static C1673e m6693m() {
        return f6254f;
    }

    @Override // p064e6.C1675f
    /* renamed from: b */
    public Intent mo6694b(Context context, int i10, String str) {
        return super.mo6694b(context, i10, str);
    }

    @Override // p064e6.C1675f
    /* renamed from: c */
    public PendingIntent mo6695c(Context context, int i10, int i11) {
        return super.mo6695c(context, i10, i11);
    }

    @Override // p064e6.C1675f
    /* renamed from: e */
    public final String mo6696e(int i10) {
        return super.mo6696e(i10);
    }

    @Override // p064e6.C1675f
    /* renamed from: g */
    public int mo6697g(Context context) {
        return super.mo6697g(context);
    }

    @Override // p064e6.C1675f
    /* renamed from: h */
    public int mo6698h(Context context, int i10) {
        return super.mo6698h(context, i10);
    }

    @Override // p064e6.C1675f
    /* renamed from: j */
    public final boolean mo6699j(int i10) {
        return super.mo6699j(i10);
    }

    /* renamed from: k */
    public Dialog m6700k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m6704p(activity, i10, AbstractDialogInterfaceOnClickListenerC2365i0.m9569b(activity, mo6694b(activity, i10, "d"), i11), onCancelListener);
    }

    /* renamed from: l */
    public PendingIntent m6701l(Context context, C1667b c1667b) {
        return c1667b.m6680L() ? c1667b.m6679K() : mo6695c(context, c1667b.m6677I(), 0);
    }

    /* renamed from: n */
    public boolean m6702n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6700k = m6700k(activity, i10, i11, onCancelListener);
        if (m6700k == null) {
            return false;
        }
        m6707s(activity, m6700k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void m6703o(Context context, int i10) {
        m6708t(context, i10, null, m6717d(context, i10, 0, C2699n.f10571b));
    }

    /* renamed from: p */
    public final Dialog m6704p(Context context, int i10, AbstractDialogInterfaceOnClickListenerC2365i0 abstractDialogInterfaceOnClickListenerC2365i0, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2356f0.m9544d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m9543c = C2356f0.m9543c(context, i10);
        if (m9543c != null) {
            builder.setPositiveButton(m9543c, abstractDialogInterfaceOnClickListenerC2365i0);
        }
        String m9547g = C2356f0.m9547g(context, i10);
        if (m9547g != null) {
            builder.setTitle(m9547g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: q */
    public final Dialog m6705q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2356f0.m9544d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m6707s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: r */
    public final C2060r0 m6706r(Context context, AbstractC2057q0 abstractC2057q0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2060r0 c2060r0 = new C2060r0(abstractC2057q0);
        zao.zaa(context, c2060r0, intentFilter);
        c2060r0.m8247a(context);
        if (m6718i(context, "com.google.android.gms")) {
            return c2060r0;
        }
        abstractC2057q0.mo8083a();
        c2060r0.m8248b();
        return null;
    }

    /* renamed from: s */
    public final void m6707s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0306j) {
                C1689m.m6748p(dialog, onCancelListener).mo1432o(((ActivityC0306j) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1669c.m6690a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: t */
    public final void m6708t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m6709u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m9546f = C2356f0.m9546f(context, i10);
        String m9545e = C2356f0.m9545e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C2394s.m9619l(context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE));
        C5494l.e m21873P = new C5494l.e(context).m21862E(true).m21892m(true).m21900u(m9546f).m21873P(new C5494l.c().m21849x(m9545e));
        if (C3939h.m14941c(context)) {
            C2394s.m9622o(C3944m.m14956e());
            m21873P.m21871N(context.getApplicationInfo().icon).m21866I(2);
            if (C3939h.m14942d(context)) {
                m21873P.m21881a(C0615a.f2735a, resources.getString(C0616b.f2750o), pendingIntent);
            } else {
                m21873P.m21898s(pendingIntent);
            }
        } else {
            m21873P.m21871N(R.drawable.stat_sys_warning).m21875R(resources.getString(C0616b.f2743h)).m21880W(System.currentTimeMillis()).m21898s(pendingIntent).m21899t(m9545e);
        }
        if (C3944m.m14959h()) {
            C2394s.m9622o(C3944m.m14959h());
            synchronized (f6253e) {
                str2 = this.f6255c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m9542b = C2356f0.m9542b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", m9542b, 4);
                } else if (!m9542b.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(m9542b);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            m21873P.m21894o(str2);
        }
        Notification m21883c = m21873P.m21883c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C1683j.f6270b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, m21883c);
    }

    /* renamed from: u */
    public final void m6709u(Context context) {
        new HandlerC1692o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: v */
    public final boolean m6710v(Activity activity, InterfaceC2030i interfaceC2030i, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6704p = m6704p(activity, i10, AbstractDialogInterfaceOnClickListenerC2365i0.m9570c(interfaceC2030i, mo6694b(activity, i10, "d"), 2), onCancelListener);
        if (m6704p == null) {
            return false;
        }
        m6707s(activity, m6704p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: w */
    public final boolean m6711w(Context context, C1667b c1667b, int i10) {
        PendingIntent m6701l;
        if (C4193a.m16175a(context) || (m6701l = m6701l(context, c1667b)) == null) {
            return false;
        }
        m6708t(context, c1667b.m6677I(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m4983a(context, m6701l, i10, true), zap.zaa | 134217728));
        return true;
    }
}
