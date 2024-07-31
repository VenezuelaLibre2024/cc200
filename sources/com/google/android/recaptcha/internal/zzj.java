package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p038ce.InterfaceC1117x0;

/* loaded from: classes.dex */
public final class zzj {
    public static final Task zza(InterfaceC1117x0 interfaceC1117x0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        interfaceC1117x0.mo4278x0(new zzi(taskCompletionSource, interfaceC1117x0));
        return taskCompletionSource.getTask();
    }
}
