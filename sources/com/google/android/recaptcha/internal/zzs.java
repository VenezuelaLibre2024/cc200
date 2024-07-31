package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzs extends AbstractC3478l implements InterfaceC4584p {
    public zzs(InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzs(interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzs((InterfaceC3281d) obj2).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        C3385c.m12581c();
        C2238l.m8975b(obj);
        Thread.currentThread().setPriority(8);
        return C2245s.f8873a;
    }
}
