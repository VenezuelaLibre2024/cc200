package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzat extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ RecaptchaAction zzd;
    public final /* synthetic */ zzbd zze;
    public final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzaw zzawVar, long j10, RecaptchaAction recaptchaAction, zzbd zzbdVar, String str, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzawVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
        this.zze = zzbdVar;
        this.zzf = str;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzat(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzat) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r13 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r13 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        r13 = (com.google.android.recaptcha.internal.zzol) r13;
        r12.zzb.zzl(r13, r12.zze);
        r0 = r12.zzb;
        r1 = r12.zze;
        r0 = r0.zzi;
        r0.zza(r1.zza(com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        return gd.C2237k.m8965a(gd.C2237k.m8966b(r13.zzi()));
     */
    @Override // p173ld.AbstractC3467a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p161kd.C3385c.m12581c()
            int r1 = r12.zza
            r2 = 1
            gd.C2238l.m8975b(r13)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto L2b
            goto L3d
        Lf:
            com.google.android.recaptcha.internal.zzaw r13 = r12.zzb
            long r3 = r12.zzc
            com.google.android.recaptcha.RecaptchaAction r1 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r5 = r12.zze
            com.google.android.recaptcha.internal.zzaw.zzi(r13, r3, r1, r5)
            com.google.android.recaptcha.internal.zzaw r6 = r12.zzb
            long r7 = r12.zzc
            java.lang.String r9 = r12.zzf
            com.google.android.recaptcha.internal.zzbd r10 = r12.zze
            r12.zza = r2
            r11 = r12
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzd(r6, r7, r9, r10, r11)
            if (r13 == r0) goto L64
        L2b:
            com.google.android.recaptcha.internal.zzaw r1 = r12.zzb
            com.google.android.recaptcha.RecaptchaAction r2 = r12.zzd
            com.google.android.recaptcha.internal.zzbd r3 = r12.zze
            com.google.android.recaptcha.internal.zzog r13 = (com.google.android.recaptcha.internal.zzog) r13
            r4 = 2
            r12.zza = r4
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzaw.zzf(r1, r2, r13, r3, r12)
            if (r13 != r0) goto L3d
            goto L64
        L3d:
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzol r13 = (com.google.android.recaptcha.internal.zzol) r13
            com.google.android.recaptcha.internal.zzaw.zzh(r0, r13, r1)
            com.google.android.recaptcha.internal.zzaw r0 = r12.zzb
            com.google.android.recaptcha.internal.zzbd r1 = r12.zze
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzaw.zzb(r0)
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r1 = r1.zza(r2)
            r0.zza(r1)
            java.lang.String r13 = r13.zzi()
            java.lang.Object r13 = gd.C2237k.m8966b(r13)
            gd.k r13 = gd.C2237k.m8965a(r13)
            return r13
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzat.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
