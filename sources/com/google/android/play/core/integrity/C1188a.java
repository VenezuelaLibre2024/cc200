package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import java.util.Objects;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.a */
/* loaded from: classes.dex */
final class C1188a extends AbstractC1195ag {

    /* renamed from: a */
    private String f4620a;

    /* renamed from: b */
    private C2091c0 f4621b;

    /* renamed from: c */
    private PendingIntent f4622c;

    @Override // com.google.android.play.core.integrity.AbstractC1195ag
    /* renamed from: a */
    public final AbstractC1195ag mo5110a(PendingIntent pendingIntent) {
        this.f4622c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1195ag
    /* renamed from: b */
    public final AbstractC1195ag mo5111b(C2091c0 c2091c0) {
        Objects.requireNonNull(c2091c0, "Null logger");
        this.f4621b = c2091c0;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1195ag
    /* renamed from: c */
    public final AbstractC1195ag mo5112c(String str) {
        this.f4620a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC1195ag
    /* renamed from: d */
    public final C1196ah mo5113d() {
        C2091c0 c2091c0;
        String str = this.f4620a;
        if (str != null && (c2091c0 = this.f4621b) != null) {
            return new C1196ah(str, c2091c0, this.f4622c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4620a == null) {
            sb2.append(" token");
        }
        if (this.f4621b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
