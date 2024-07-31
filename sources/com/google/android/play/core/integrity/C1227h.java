package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.h */
/* loaded from: classes.dex */
final class C1227h extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a */
    private final long f4687a;

    public /* synthetic */ C1227h(long j10, C1226g c1226g) {
        this.f4687a = j10;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: a */
    public final long mo5108a() {
        return this.f4687a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.f4687a == ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj).mo5108a();
    }

    public final int hashCode() {
        long j10 = this.f4687a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f4687a + "}";
    }
}
