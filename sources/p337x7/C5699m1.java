package p337x7;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzafi;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* renamed from: x7.m1 */
/* loaded from: classes.dex */
public final class C5699m1 implements Continuation<zzafi, Task<IntegrityTokenResponse>> {

    /* renamed from: a */
    public final /* synthetic */ String f21217a;

    /* renamed from: b */
    public final /* synthetic */ IntegrityManager f21218b;

    /* renamed from: c */
    public final /* synthetic */ C5666d0 f21219c;

    public C5699m1(C5666d0 c5666d0, String str, IntegrityManager integrityManager) {
        this.f21217a = str;
        this.f21218b = integrityManager;
        this.f21219c = c5666d0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzafi> task) {
        String str;
        if (task.isSuccessful()) {
            this.f21219c.f21137a = task.getResult().zza();
            return this.f21218b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f21217a.getBytes("UTF-8")), 11))).build());
        }
        str = C5666d0.f21135b;
        Log.e(str, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
