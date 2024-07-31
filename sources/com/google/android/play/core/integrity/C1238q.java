package com.google.android.play.core.integrity;

import android.content.Context;
import java.util.Objects;
import p097g7.C2108l;

/* renamed from: com.google.android.play.core.integrity.q */
/* loaded from: classes.dex */
final class C1238q implements InterfaceC1197ai {

    /* renamed from: a */
    private Context f4700a;

    private C1238q() {
    }

    public /* synthetic */ C1238q(C1237p c1237p) {
    }

    /* renamed from: a */
    public final C1238q m5147a(Context context) {
        Objects.requireNonNull(context);
        this.f4700a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC1197ai
    /* renamed from: b */
    public final C1240s mo5122b() {
        C2108l.m8326a(this.f4700a, Context.class);
        return new C1240s(this.f4700a, null);
    }
}
