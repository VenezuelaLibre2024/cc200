package com.google.android.play.core.integrity;

import android.content.Context;
import p097g7.C2102i;
import p097g7.C2106k;
import p097g7.InterfaceC2104j;
import p097g7.InterfaceC2110m;

/* renamed from: com.google.android.play.core.integrity.s */
/* loaded from: classes.dex */
final class C1240s {

    /* renamed from: a */
    private final C1240s f4701a = this;

    /* renamed from: b */
    private final InterfaceC2110m f4702b;

    /* renamed from: c */
    private final InterfaceC2110m f4703c;

    /* renamed from: d */
    private final InterfaceC2110m f4704d;

    /* renamed from: e */
    private final InterfaceC2110m f4705e;

    /* renamed from: f */
    private final InterfaceC2110m f4706f;

    public /* synthetic */ C1240s(Context context, C1239r c1239r) {
        C1203ao c1203ao;
        InterfaceC2104j m8325b = C2106k.m8325b(context);
        this.f4702b = m8325b;
        c1203ao = C1202an.f4647a;
        InterfaceC2110m m8323b = C2102i.m8323b(c1203ao);
        this.f4703c = m8323b;
        InterfaceC2110m m8323b2 = C2102i.m8323b(new C1214az(m8325b, m8323b));
        this.f4704d = m8323b2;
        InterfaceC2110m m8323b3 = C2102i.m8323b(new C1220be(m8323b2));
        this.f4705e = m8323b3;
        this.f4706f = C2102i.m8323b(new C1201am(m8323b2, m8323b3));
    }

    /* renamed from: a */
    public final StandardIntegrityManager m5148a() {
        return (StandardIntegrityManager) this.f4706f.mo5121a();
    }
}
