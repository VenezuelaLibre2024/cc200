package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* renamed from: com.google.android.play.core.integrity.k */
/* loaded from: classes.dex */
final class C1230k extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a */
    private final String f4689a;

    public /* synthetic */ C1230k(String str, C1229j c1229j) {
        this.f4689a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    /* renamed from: a */
    public final String mo5109a() {
        return this.f4689a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        String str = this.f4689a;
        String mo5109a = ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj).mo5109a();
        return str == null ? mo5109a == null : str.equals(mo5109a);
    }

    public final int hashCode() {
        String str = this.f4689a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f4689a + "}";
    }
}
