package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaj extends AbstractC3478l implements InterfaceC4584p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ Application zzc;
    public final /* synthetic */ zzab zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ zzbq zzf;
    public final /* synthetic */ zzbd zzg;
    public final /* synthetic */ zzbg zzh;
    public final /* synthetic */ long zzi;
    public final /* synthetic */ zzt zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(Application application, zzab zzabVar, String str, zzbq zzbqVar, zzbd zzbdVar, zzt zztVar, WebView webView, zzbg zzbgVar, long j10, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzc = application;
        this.zzd = zzabVar;
        this.zze = str;
        this.zzf = zzbqVar;
        this.zzg = zzbdVar;
        this.zzj = zztVar;
        this.zzh = zzbgVar;
        this.zzi = j10;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, null, this.zzh, this.zzi, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r3 != r1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r2 != r1) goto L12;
     */
    @Override // p173ld.AbstractC3467a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
