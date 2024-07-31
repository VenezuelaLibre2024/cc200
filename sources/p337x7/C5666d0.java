package p337x7;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.internal.p377firebaseauthapi.zzadq;
import com.google.android.gms.internal.p377firebaseauthapi.zzaec;
import com.google.android.gms.internal.p377firebaseauthapi.zzafi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p321w7.C5399q;
import p321w7.C5408t;

/* renamed from: x7.d0 */
/* loaded from: classes.dex */
public class C5666d0 {

    /* renamed from: b */
    public static final String f21135b = "d0";

    /* renamed from: c */
    public static final C5666d0 f21136c = new C5666d0();

    /* renamed from: a */
    public String f21137a;

    /* renamed from: b */
    public static C5666d0 m22738b() {
        return f21136c;
    }

    /* renamed from: h */
    public static boolean m22740h(Exception exc) {
        if (exc instanceof C5408t) {
            return true;
        }
        return (exc instanceof C5399q) && ((C5399q) exc).m21548a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    /* renamed from: a */
    public final Task<AbstractC5714r1> m22742a(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z10, boolean z11, boolean z12, final RecaptchaAction recaptchaAction) {
        AbstractC5711q1 c5723u1;
        C5673f c5673f = (C5673f) firebaseAuth.m5242l();
        final C5690j1 m22769f = C5690j1.m22769f();
        if (!zzaec.zza(firebaseAuth.m5236i()) && !c5673f.m22753h()) {
            String str2 = f21135b;
            Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z11 + ", ForceRecaptchav2Flow from firebaseSettings = " + c5673f.m22751f());
            boolean z13 = z11 || c5673f.m22751f();
            final TaskCompletionSource<AbstractC5714r1> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> m22774e = m22769f.m22774e();
            if (m22774e != null) {
                if (m22774e.isSuccessful()) {
                    c5723u1 = new C5723u1().mo22811d(m22774e.getResult());
                } else {
                    Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + m22774e.getException().getMessage());
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (z13) {
                m22745e(firebaseAuth, str, activity, z10, true, m22769f, taskCompletionSource);
            } else {
                final boolean z14 = false;
                firebaseAuth.m5249p().addOnCompleteListener(new OnCompleteListener() { // from class: x7.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C5666d0.this.m22743c(taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z10, z14, m22769f, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        c5723u1 = new C5723u1();
        return Tasks.forResult(c5723u1.mo22809b());
    }

    /* renamed from: c */
    public final /* synthetic */ void m22743c(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z10, boolean z11, C5690j1 c5690j1, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f21135b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.m5250p0() == null || !firebaseAuth.m5250p0().m22729d("PHONE_PROVIDER")) {
            m22745e(firebaseAuth, str, activity, z10, z11, c5690j1, taskCompletionSource);
        } else {
            firebaseAuth.m5250p0().m22728b(firebaseAuth.m5246n(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new C5702n1(this, taskCompletionSource)).addOnFailureListener(new C5671e1(this, taskCompletionSource));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m22744d(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, C5690j1 c5690j1, Activity activity, Task task) {
        if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
            taskCompletionSource.setResult(new C5723u1().mo22808a(((IntegrityTokenResponse) task.getResult()).token()).mo22809b());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(f21135b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        m22746f(firebaseAuth, c5690j1, activity, taskCompletionSource);
    }

    /* renamed from: e */
    public final void m22745e(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11, final C5690j1 c5690j1, final TaskCompletionSource<AbstractC5714r1> taskCompletionSource) {
        if (!z10 || z11) {
            m22746f(firebaseAuth, c5690j1, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f21137a) ? Tasks.forResult(new zzafi(this.f21137a)) : firebaseAuth.m5207I()).continueWithTask(firebaseAuth.m5199C0(), new C5699m1(this, str, IntegrityManagerFactory.create(firebaseAuth.m5236i().m14349m()))).addOnCompleteListener(new OnCompleteListener() { // from class: x7.l1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C5666d0.this.m22744d(taskCompletionSource, firebaseAuth, c5690j1, activity, task);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m22746f(FirebaseAuth firebaseAuth, C5690j1 c5690j1, Activity activity, TaskCompletionSource<AbstractC5714r1> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new C5408t());
            return;
        }
        C5707p0.m22800d(firebaseAuth.m5236i().m14349m(), firebaseAuth);
        C2394s.m9619l(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (C5654a0.m22715b().m22722h(activity, taskCompletionSource2)) {
            new zzadq(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzach.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new C5705o1(this, taskCompletionSource)).addOnFailureListener(new C5708p1(this, taskCompletionSource));
    }
}
