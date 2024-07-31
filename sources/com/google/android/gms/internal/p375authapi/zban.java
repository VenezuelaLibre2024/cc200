package com.google.android.gms.internal.p375authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p096g6.InterfaceC2022g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zban extends InterfaceC2022g.a {
    public final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2022g
    public final void onResult(Status status) {
        C2074w.m8278a(status, this.zba);
    }
}
