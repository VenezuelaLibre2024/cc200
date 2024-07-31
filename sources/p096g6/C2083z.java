package p096g6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: g6.z */
/* loaded from: classes.dex */
public final class C2083z implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f8179a;

    /* renamed from: b */
    public final /* synthetic */ C1999a0 f8180b;

    public C2083z(C1999a0 c1999a0, TaskCompletionSource taskCompletionSource) {
        this.f8180b = c1999a0;
        this.f8179a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f8180b.f7984b;
        map.remove(this.f8179a);
    }
}
