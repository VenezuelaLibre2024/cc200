package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.bd */
/* loaded from: classes.dex */
public final class C1219bd {

    /* renamed from: a */
    private final C1212ax f4679a;

    public C1219bd(C1212ax c1212ax) {
        this.f4679a = c1212ax;
    }

    /* renamed from: a */
    public final /* synthetic */ Task m5141a(long j10, long j11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f4679a.m5135c(standardIntegrityTokenRequest.mo5109a(), j10, j11);
    }
}
