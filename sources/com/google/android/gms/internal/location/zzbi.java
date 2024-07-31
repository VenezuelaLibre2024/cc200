package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.C1841a;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbi implements Continuation {
    public final /* synthetic */ TaskCompletionSource zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        C1841a c1841a = zzbp.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult((Location) task.getResult());
            return null;
        }
        Exception exception = task.getException();
        exception.getClass();
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
