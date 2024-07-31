package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.f */
/* loaded from: classes.dex */
final class C1225f extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a */
    private long f4685a;

    /* renamed from: b */
    private byte f4686b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f4686b == 1) {
            return new C1227h(this.f4685a, null);
        }
        throw new IllegalStateException("Missing required properties: cloudProjectNumber");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f4685a = j10;
        this.f4686b = (byte) 1;
        return this;
    }
}
