package p337x7;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzac;
import com.google.android.gms.internal.p377firebaseauthapi.zzafj;
import com.google.android.gms.internal.p377firebaseauthapi.zzah;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
import p108h6.C2394s;

/* renamed from: x7.a1 */
/* loaded from: classes.dex */
public final class C5655a1 implements Continuation<zzafj, Task<RecaptchaTasksClient>> {

    /* renamed from: a */
    public final /* synthetic */ String f21106a;

    /* renamed from: b */
    public final /* synthetic */ C5659b1 f21107b;

    public C5655a1(C5659b1 c5659b1, String str) {
        this.f21106a = str;
        this.f21107b = c5659b1;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzafj> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C5734y0((String) C2394s.m9619l(((Exception) C2394s.m9619l(task.getException())).getMessage())));
        }
        zzafj result = task.getResult();
        String zza = result.zza();
        if (zzah.zzc(zza)) {
            return Tasks.forException(new C5734y0("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f21106a));
        }
        List<String> zza2 = zzac.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f21106a);
        }
        this.f21107b.f21111b = result;
        C5659b1 c5659b1 = this.f21107b;
        Task<RecaptchaTasksClient> mo22825a = c5659b1.f21114e.mo22825a((Application) c5659b1.f21112c.m14349m(), str);
        this.f21107b.f21110a.put(this.f21106a, mo22825a);
        return mo22825a;
    }
}
