package p226p9;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: p9.x */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4101x implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f14807a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f14807a.setException(exc);
    }
}
