package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.play.core.integrity.w */
/* loaded from: classes.dex */
final class C1244w implements IntegrityManager {

    /* renamed from: a */
    private final C1192ad f4710a;

    public C1244w(C1192ad c1192ad) {
        this.f4710a = c1192ad;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f4710a.m5120b(integrityTokenRequest);
    }
}
