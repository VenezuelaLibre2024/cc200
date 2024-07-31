package p226p9;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* renamed from: p9.r */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4095r implements OnCanceledListener {

    /* renamed from: a */
    public final /* synthetic */ CancellationTokenSource f14796a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f14796a.cancel();
    }
}
