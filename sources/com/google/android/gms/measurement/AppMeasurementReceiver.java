package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p028c1.AbstractC0582a;
import p034c7.C0878s5;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0582a implements C0878s5.a {

    /* renamed from: j */
    public C0878s5 f4605j;

    @Override // p034c7.C0878s5.a
    /* renamed from: a */
    public final void mo3841a(Context context, Intent intent) {
        AbstractC0582a.m2935c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f4605j == null) {
            this.f4605j = new C0878s5(this);
        }
        this.f4605j.m3840a(context, intent);
    }
}
