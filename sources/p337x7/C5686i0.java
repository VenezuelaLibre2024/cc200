package p337x7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* renamed from: x7.i0 */
/* loaded from: classes.dex */
public final class C5686i0 extends BroadcastReceiver {

    /* renamed from: a */
    public final WeakReference<Activity> f21189a;

    /* renamed from: b */
    public final TaskCompletionSource<String> f21190b;

    /* renamed from: c */
    public final /* synthetic */ C5654a0 f21191c;

    public C5686i0(C5654a0 c5654a0, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f21191c = c5654a0;
        this.f21189a = new WeakReference<>(activity);
        this.f21190b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f21189a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f21190b.setException(zzach.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C5654a0.m22716d(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C5654a0.m22717e(this.f21191c, intent, this.f21190b, context);
                return;
            }
            this.f21190b.setException(zzach.zza(C5712r.m22812a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        if (C5693k1.m22780d(intent)) {
            this.f21190b.setException(zzach.zza(C5693k1.m22777a(intent)));
            C5654a0.m22716d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f21190b.setException(zzach.zza(C5712r.m22812a("WEB_CONTEXT_CANCELED")));
            C5654a0.m22716d(context);
        }
    }
}
