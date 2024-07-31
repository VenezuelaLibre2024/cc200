package com.google.android.play.core.integrity;

import android.content.Context;
import p097g7.C2102i;
import p097g7.C2106k;
import p097g7.InterfaceC2104j;
import p097g7.InterfaceC2110m;

/* renamed from: com.google.android.play.core.integrity.o */
/* loaded from: classes.dex */
final class C1236o {

    /* renamed from: a */
    private final C1236o f4695a = this;

    /* renamed from: b */
    private final InterfaceC2110m f4696b;

    /* renamed from: c */
    private final InterfaceC2110m f4697c;

    /* renamed from: d */
    private final InterfaceC2110m f4698d;

    /* renamed from: e */
    private final InterfaceC2110m f4699e;

    public /* synthetic */ C1236o(Context context, C1235n c1235n) {
        C1247z c1247z;
        InterfaceC2104j m8325b = C2106k.m8325b(context);
        this.f4696b = m8325b;
        c1247z = C1246y.f4712a;
        InterfaceC2110m m8323b = C2102i.m8323b(c1247z);
        this.f4697c = m8323b;
        InterfaceC2110m m8323b2 = C2102i.m8323b(new C1194af(m8325b, m8323b));
        this.f4698d = m8323b2;
        this.f4699e = C2102i.m8323b(new C1245x(m8323b2));
    }

    /* renamed from: a */
    public final IntegrityManager m5146a() {
        return (IntegrityManager) this.f4699e.mo5121a();
    }
}
