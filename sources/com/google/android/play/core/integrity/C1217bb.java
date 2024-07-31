package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.bb */
/* loaded from: classes.dex */
final class C1217bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a */
    private final String f4674a;

    /* renamed from: b */
    private final C1242u f4675b;

    public C1217bb(String str, C2091c0 c2091c0, PendingIntent pendingIntent) {
        this.f4674a = str;
        this.f4675b = new C1242u(c2091c0, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f4674a;
    }
}
