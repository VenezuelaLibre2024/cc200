package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import java.util.Objects;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.b */
/* loaded from: classes.dex */
final class C1215b extends AbstractC1216ba {

    /* renamed from: a */
    private String f4671a;

    /* renamed from: b */
    private C2091c0 f4672b;

    /* renamed from: c */
    private PendingIntent f4673c;

    @Override // com.google.android.play.core.integrity.AbstractC1216ba
    /* renamed from: a */
    public final AbstractC1216ba mo5137a(PendingIntent pendingIntent) {
        this.f4673c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1216ba
    /* renamed from: b */
    public final AbstractC1216ba mo5138b(C2091c0 c2091c0) {
        Objects.requireNonNull(c2091c0, "Null logger");
        this.f4672b = c2091c0;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1216ba
    /* renamed from: c */
    public final AbstractC1216ba mo5139c(String str) {
        Objects.requireNonNull(str, "Null token");
        this.f4671a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1216ba
    /* renamed from: d */
    public final C1217bb mo5140d() {
        C2091c0 c2091c0;
        String str = this.f4671a;
        if (str != null && (c2091c0 = this.f4672b) != null) {
            return new C1217bb(str, c2091c0, this.f4673c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4671a == null) {
            sb2.append(" token");
        }
        if (this.f4672b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
