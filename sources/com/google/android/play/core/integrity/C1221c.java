package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.c */
/* loaded from: classes.dex */
public final class C1221c extends IntegrityTokenRequest.Builder {

    /* renamed from: a */
    private String f4681a;

    /* renamed from: b */
    private Long f4682b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f4681a;
        if (str != null) {
            return new C1224e(str, this.f4682b, null, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f4682b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        Objects.requireNonNull(str, "Null nonce");
        this.f4681a = str;
        return this;
    }
}
