package p321w7;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C1259a;
import com.google.firebase.auth.FirebaseAuth;
import p195n7.C3773m;
import p337x7.AbstractC5714r1;
import p337x7.C5666d0;

/* renamed from: w7.e2 */
/* loaded from: classes.dex */
public final class C5359e2 implements OnCompleteListener<AbstractC5714r1> {

    /* renamed from: a */
    public final /* synthetic */ C1259a f20182a;

    /* renamed from: b */
    public final /* synthetic */ String f20183b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f20184c;

    public C5359e2(FirebaseAuth firebaseAuth, C1259a c1259a, String str) {
        this.f20182a = c1259a;
        this.f20183b = str;
        this.f20184c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<AbstractC5714r1> task) {
        String mo22814a;
        String str = null;
        if (task.isSuccessful()) {
            str = task.getResult().mo22816c();
            mo22814a = task.getResult().mo22814a();
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && C5666d0.m22740h(exception)) {
                FirebaseAuth.m5189h0((C3773m) exception, this.f20182a, this.f20183b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                mo22814a = null;
            }
        }
        this.f20184c.m5234g0(this.f20182a, str, mo22814a);
    }
}
