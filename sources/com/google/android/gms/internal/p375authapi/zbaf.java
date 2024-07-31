package com.google.android.gms.internal.p375authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p335x5.C5607h;

/* loaded from: classes.dex */
final class zbaf extends zbu {
    public final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p375authapi.zbv
    public final void zbb(Status status, C5607h c5607h) {
        C2074w.m8279b(status, c5607h, this.zba);
    }
}
