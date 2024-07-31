package com.google.android.play.core.integrity;

import android.net.Network;

/* renamed from: com.google.android.play.core.integrity.e */
/* loaded from: classes.dex */
final class C1224e extends IntegrityTokenRequest {

    /* renamed from: a */
    private final String f4683a;

    /* renamed from: b */
    private final Long f4684b;

    public /* synthetic */ C1224e(String str, Long l10, Network network, C1223d c1223d) {
        this.f4683a = str;
        this.f4684b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    /* renamed from: a */
    public final Network mo5107a() {
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f4684b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f4683a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f4684b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                integrityTokenRequest.mo5107a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4683a.hashCode() ^ 1000003;
        Long l10 = this.f4684b;
        return ((hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f4683a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f4683a + ", cloudProjectNumber=" + this.f4684b + ", network=null}";
    }
}
