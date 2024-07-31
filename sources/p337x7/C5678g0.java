package p337x7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import p321w7.AbstractC5341a0;
import p321w7.InterfaceC5372i;

/* renamed from: x7.g0 */
/* loaded from: classes.dex */
public final class C5678g0 extends BroadcastReceiver {

    /* renamed from: a */
    public final WeakReference<Activity> f21163a;

    /* renamed from: b */
    public final TaskCompletionSource<InterfaceC5372i> f21164b;

    /* renamed from: c */
    public final FirebaseAuth f21165c;

    /* renamed from: d */
    public final AbstractC5341a0 f21166d;

    /* renamed from: e */
    public final /* synthetic */ C5654a0 f21167e;

    public C5678g0(C5654a0 c5654a0, Activity activity, TaskCompletionSource<InterfaceC5372i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        this.f21167e = c5654a0;
        this.f21163a = new WeakReference<>(activity);
        this.f21164b = taskCompletionSource;
        this.f21165c = firebaseAuth;
        this.f21166d = abstractC5341a0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f21163a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f21164b.setException(zzach.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C5654a0.m22716d(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (C5693k1.m22780d(intent)) {
                this.f21164b.setException(zzach.zza(C5693k1.m22777a(intent)));
                C5654a0.m22716d(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f21164b.setException(zzach.zza(C5712r.m22812a("WEB_CONTEXT_CANCELED")));
                    C5654a0.m22716d(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f21165c.m5266z(C5654a0.m22714a(intent)).addOnSuccessListener(new C5662c0(r0, r1, context)).addOnFailureListener(new C5736z(this.f21167e, this.f21164b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f21166d.m21415P(C5654a0.m22714a(intent)).addOnSuccessListener(new C5674f0(r0, r1, context)).addOnFailureListener(new C5658b0(this.f21167e, this.f21164b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f21166d.m21416Q(C5654a0.m22714a(intent)).addOnSuccessListener(new C5682h0(r0, r1, context)).addOnFailureListener(new C5670e0(this.f21167e, this.f21164b, context));
        } else {
            this.f21164b.setException(zzach.zza(C5712r.m22812a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
