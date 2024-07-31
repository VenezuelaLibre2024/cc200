package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.ah */
/* loaded from: classes.dex */
final class C1196ah extends IntegrityTokenResponse {

    /* renamed from: a */
    private final String f4638a;

    /* renamed from: b */
    private final C1242u f4639b;

    public C1196ah(String str, C2091c0 c2091c0, PendingIntent pendingIntent) {
        this.f4638a = str;
        this.f4639b = new C1242u(c2091c0, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f4638a;
    }
}
