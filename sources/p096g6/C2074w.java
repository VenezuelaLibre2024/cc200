package p096g6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2343b;

/* renamed from: g6.w */
/* loaded from: classes.dex */
public class C2074w {
    /* renamed from: a */
    public static void m8278a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m8279b(status, null, taskCompletionSource);
    }

    /* renamed from: b */
    public static <ResultT> void m8279b(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.m4991N()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(C2343b.m9513a(status));
        }
    }

    /* renamed from: c */
    public static <ResultT> boolean m8280c(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.m4991N() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(C2343b.m9513a(status));
    }
}
