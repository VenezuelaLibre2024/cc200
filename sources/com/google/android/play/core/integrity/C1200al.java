package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.al */
/* loaded from: classes.dex */
public final class C1200al implements StandardIntegrityManager {

    /* renamed from: a */
    private final C1212ax f4643a;

    /* renamed from: b */
    private final C1219bd f4644b;

    public C1200al(C1212ax c1212ax, C1219bd c1219bd) {
        this.f4643a = c1212ax;
        this.f4644b = c1219bd;
    }

    /* renamed from: a */
    public final /* synthetic */ Task m5124a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) {
        final C1219bd c1219bd = this.f4644b;
        final long mo5108a = prepareIntegrityTokenRequest.mo5108a();
        final long longValue = l10.longValue();
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider() { // from class: com.google.android.play.core.integrity.bc
            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return C1219bd.this.m5141a(mo5108a, longValue, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        return this.f4643a.m5136d(prepareIntegrityTokenRequest.mo5108a()).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ak
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C1200al.this.m5124a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
