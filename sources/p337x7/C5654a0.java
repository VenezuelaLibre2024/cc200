package p337x7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p103h1.C2281a;
import p108h6.C2394s;
import p125i6.C2605e;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.C5428z1;
import p321w7.InterfaceC5372i;

/* renamed from: x7.a0 */
/* loaded from: classes.dex */
public final class C5654a0 {

    /* renamed from: c */
    public static C5654a0 f21103c;

    /* renamed from: a */
    public boolean f21104a = false;

    /* renamed from: b */
    public BroadcastReceiver f21105b;

    /* renamed from: a */
    public static AbstractC5368h m22714a(Intent intent) {
        C2394s.m9619l(intent);
        return C5428z1.m21583P(((zzags) C2605e.m10492b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzags.CREATOR)).zzc(true));
    }

    /* renamed from: b */
    public static C5654a0 m22715b() {
        if (f21103c == null) {
            f21103c = new C5654a0();
        }
        return f21103c;
    }

    /* renamed from: d */
    public static void m22716d(Context context) {
        C5654a0 c5654a0 = f21103c;
        c5654a0.f21104a = false;
        if (c5654a0.f21105b != null) {
            C2281a.m9279b(context).m9283e(f21103c.f21105b);
        }
        f21103c.f21105b = null;
    }

    /* renamed from: e */
    public static /* synthetic */ void m22717e(C5654a0 c5654a0, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        m22716d(context);
    }

    /* renamed from: c */
    public final void m22721c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f21105b = broadcastReceiver;
        C2281a.m9279b(activity).m9281c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* renamed from: h */
    public final boolean m22722h(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f21104a) {
            return false;
        }
        m22721c(activity, new C5686i0(this, activity, taskCompletionSource));
        this.f21104a = true;
        return true;
    }

    /* renamed from: i */
    public final boolean m22723i(Activity activity, TaskCompletionSource<InterfaceC5372i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return m22724j(activity, taskCompletionSource, firebaseAuth, null);
    }

    /* renamed from: j */
    public final boolean m22724j(Activity activity, TaskCompletionSource<InterfaceC5372i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        if (this.f21104a) {
            return false;
        }
        m22721c(activity, new C5678g0(this, activity, taskCompletionSource, firebaseAuth, abstractC5341a0));
        this.f21104a = true;
        return true;
    }
}
