package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import p038ce.C1063k;
import p038ce.InterfaceC1085p0;

/* loaded from: classes.dex */
public final class zzbj extends TimerTask {
    public final /* synthetic */ zzbm zza;

    public zzbj(zzbm zzbmVar) {
        this.zza = zzbmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        InterfaceC1085p0 interfaceC1085p0;
        zzbm zzbmVar = this.zza;
        interfaceC1085p0 = zzbmVar.zzd;
        C1063k.m4457d(interfaceC1085p0, null, null, new zzbk(zzbmVar, null), 3, null);
    }
}
