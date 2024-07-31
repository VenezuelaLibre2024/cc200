package com.google.android.play.core.integrity;

import android.content.Context;
import java.util.Objects;
import p097g7.C2108l;

/* renamed from: com.google.android.play.core.integrity.m */
/* loaded from: classes.dex */
final class C1232m implements InterfaceC1241t {

    /* renamed from: a */
    private Context f4690a;

    private C1232m() {
    }

    public /* synthetic */ C1232m(C1231l c1231l) {
    }

    /* renamed from: a */
    public final C1232m m5142a(Context context) {
        Objects.requireNonNull(context);
        this.f4690a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC1241t
    /* renamed from: b */
    public final C1236o mo5143b() {
        C2108l.m8326a(this.f4690a, Context.class);
        return new C1236o(this.f4690a, null);
    }
}
