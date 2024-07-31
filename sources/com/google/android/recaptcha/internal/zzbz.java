package com.google.android.recaptcha.internal;

import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzbz extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    public final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbz(zzcj zzcjVar, zzca zzcaVar, String str, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
        this.zzd = str;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzbz(this.zzb, this.zzc, this.zzd, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbz) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r5 != r0) goto L17;
     */
    @Override // p173ld.AbstractC3467a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p161kd.C3385c.m12581c()
            int r1 = r4.zza
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            gd.C2238l.m8975b(r5)
            goto L58
        Lf:
            gd.C2238l.m8975b(r5)     // Catch: java.lang.Exception -> L13
            goto L58
        L13:
            r5 = move-exception
            goto L4a
        L15:
            gd.C2238l.m8975b(r5)
            com.google.android.recaptcha.internal.zzcj r5 = r4.zzb
            com.google.android.recaptcha.internal.zzz r1 = new com.google.android.recaptcha.internal.zzz
            r1.<init>()
            r5.zza = r1
            java.lang.String r5 = r4.zzd     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzfy r1 = com.google.android.recaptcha.internal.zzfy.zzh()     // Catch: java.lang.Exception -> L13
            byte[] r5 = r1.zzj(r5)     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzpn r5 = com.google.android.recaptcha.internal.zzpn.zzg(r5)     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzee r1 = com.google.android.recaptcha.internal.zzca.zzb(r1)     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzpf r5 = r1.zza(r5)     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc     // Catch: java.lang.Exception -> L13
            java.util.List r5 = r5.zzi()     // Catch: java.lang.Exception -> L13
            com.google.android.recaptcha.internal.zzcj r3 = r4.zzb     // Catch: java.lang.Exception -> L13
            r4.zza = r2     // Catch: java.lang.Exception -> L13
            java.lang.Object r5 = com.google.android.recaptcha.internal.zzca.zzc(r1, r5, r3, r4)     // Catch: java.lang.Exception -> L13
            if (r5 != r0) goto L58
            goto L57
        L4a:
            com.google.android.recaptcha.internal.zzca r1 = r4.zzc
            com.google.android.recaptcha.internal.zzcj r2 = r4.zzb
            r3 = 2
            r4.zza = r3
            java.lang.Object r5 = com.google.android.recaptcha.internal.zzca.zzd(r1, r5, r2, r4)
            if (r5 != r0) goto L58
        L57:
            return r0
        L58:
            gd.s r5 = gd.C2245s.f8873a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
