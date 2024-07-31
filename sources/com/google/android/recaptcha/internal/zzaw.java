package com.google.android.recaptcha.internal;

import ae.C0099e;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import gd.C2236j;
import gd.C2240n;
import java.util.LinkedHashMap;
import java.util.List;
import p038ce.C1063k;
import p038ce.InterfaceC1117x0;
import p115hd.C2486d0;
import p115hd.C2503o;
import p343xd.C5767k;

/* loaded from: classes.dex */
public final class zzaw implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzan zza = new zzan(null);
    private static final C0099e zzb = new C0099e("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzc;
    private final zzg zzd;
    private final String zze;
    private final zzab zzf;
    private final zzoe zzg;
    private final zzbd zzh;
    private final zzbg zzi;
    private final zzq zzj;
    private final zzbs zzk;
    private final zzt zzl;

    public zzaw(Application application, zzg zzgVar, String str, zzt zztVar, zzab zzabVar, zzoe zzoeVar, zzbd zzbdVar, zzbg zzbgVar, zzq zzqVar, zzbs zzbsVar) {
        this.zzc = application;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzl = zztVar;
        this.zzf = zzabVar;
        this.zzg = zzoeVar;
        this.zzh = zzbdVar;
        this.zzi = zzbgVar;
        this.zzj = zzqVar;
        this.zzk = zzbsVar;
    }

    public static final /* synthetic */ void zzi(zzaw zzawVar, long j10, RecaptchaAction recaptchaAction, zzbd zzbdVar) {
        zzbb zza2 = zzbdVar.zza(zzne.EXECUTE_NATIVE);
        r0.zze.put(zza2, new zzbf(zza2, zzawVar.zzi.zza, new zzac()));
        zzp zzpVar = !zzb.m410a(recaptchaAction.getAction()) ? new zzp(zzn.zzi, zzl.zzq, null) : null;
        if (j10 < 5000) {
            zzpVar = new zzp(zzn.zzc, zzl.zzT, null);
        }
        zzbg zzbgVar = zzawVar.zzi;
        if (zzpVar == null) {
            zzbgVar.zza(zza2);
        } else {
            zzbgVar.zzb(zza2, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(long r6, java.lang.String r8, com.google.android.recaptcha.internal.zzbd r9, p146jd.InterfaceC3281d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzao
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzao r0 = (com.google.android.recaptcha.internal.zzao) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzao r0 = new com.google.android.recaptcha.internal.zzao
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.zzc
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.google.android.recaptcha.internal.zzbb r6 = r0.zze
            com.google.android.recaptcha.internal.zzaw r7 = r0.zzd
            gd.C2238l.m8975b(r10)     // Catch: java.lang.Exception -> L2e
            goto L57
        L2e:
            r8 = move-exception
            goto L64
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            gd.C2238l.m8975b(r10)
            com.google.android.recaptcha.internal.zzne r10 = com.google.android.recaptcha.internal.zzne.COLLECT_SIGNALS
            com.google.android.recaptcha.internal.zzbb r9 = r9.zza(r10)
            com.google.android.recaptcha.internal.zzbg r10 = r5.zzi
            r2 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r10, r9, r4, r2, r4)
            com.google.android.recaptcha.internal.zzg r10 = r5.zzd     // Catch: java.lang.Exception -> L60
            r0.zzd = r5     // Catch: java.lang.Exception -> L60
            r0.zze = r9     // Catch: java.lang.Exception -> L60
            r0.zzc = r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r10 = r10.zza(r8, r6, r0)     // Catch: java.lang.Exception -> L60
            if (r10 == r1) goto L5f
            r7 = r5
            r6 = r9
        L57:
            com.google.android.recaptcha.internal.zzog r10 = (com.google.android.recaptcha.internal.zzog) r10     // Catch: java.lang.Exception -> L2e
            com.google.android.recaptcha.internal.zzbg r8 = r7.zzi     // Catch: java.lang.Exception -> L2e
            r8.zza(r6)     // Catch: java.lang.Exception -> L2e
            return r10
        L5f:
            return r1
        L60:
            r6 = move-exception
            r8 = r6
            r7 = r5
            r6 = r9
        L64:
            boolean r9 = r8 instanceof com.google.android.recaptcha.internal.zzp
            if (r9 == 0) goto L6b
            com.google.android.recaptcha.internal.zzp r8 = (com.google.android.recaptcha.internal.zzp) r8
            goto L74
        L6b:
            com.google.android.recaptcha.internal.zzp r8 = new com.google.android.recaptcha.internal.zzp
            com.google.android.recaptcha.internal.zzn r9 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r10 = com.google.android.recaptcha.internal.zzl.zzan
            r8.<init>(r9, r10, r4)
        L74:
            com.google.android.recaptcha.internal.zzbg r7 = r7.zzi
            r7.zzb(r6, r8, r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzj(long, java.lang.String, com.google.android.recaptcha.internal.zzbd, jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzk(com.google.android.recaptcha.RecaptchaAction r16, long r17, p146jd.InterfaceC3281d r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = r19
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzas
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzas r1 = (com.google.android.recaptcha.internal.zzas) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            goto L1b
        L16:
            com.google.android.recaptcha.internal.zzas r1 = new com.google.android.recaptcha.internal.zzas
            r1.<init>(r15, r0)
        L1b:
            r0 = r1
            java.lang.Object r1 = r0.zza
            java.lang.Object r10 = p161kd.C3385c.m12581c()
            int r2 = r0.zzc
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L3c
            if (r2 != r11) goto L34
            com.google.android.recaptcha.internal.zzbd r2 = r0.zze
            com.google.android.recaptcha.internal.zzaw r3 = r0.zzd
            gd.C2238l.m8975b(r1)     // Catch: java.lang.Exception -> L32
            goto L79
        L32:
            r0 = move-exception
            goto L84
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            gd.C2238l.m8975b(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r7 = r1.toString()
            com.google.android.recaptcha.internal.zzbd r1 = r9.zzh
            com.google.android.recaptcha.internal.zzbd r13 = r1.zzb()
            r13.zzc(r7)
            com.google.android.recaptcha.internal.zzbg r1 = r9.zzi
            com.google.android.recaptcha.internal.zzne r2 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r13.zza(r2)
            r3 = 2
            com.google.android.recaptcha.internal.zzbg.zzc(r1, r2, r12, r3, r12)
            com.google.android.recaptcha.internal.zzat r14 = new com.google.android.recaptcha.internal.zzat     // Catch: java.lang.Exception -> L81
            r8 = 0
            r1 = r14
            r2 = r15
            r3 = r17
            r5 = r16
            r6 = r13
            r1.<init>(r2, r3, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L81
            r0.zzd = r9     // Catch: java.lang.Exception -> L81
            r0.zze = r13     // Catch: java.lang.Exception -> L81
            r0.zzc = r11     // Catch: java.lang.Exception -> L81
            r1 = r17
            java.lang.Object r1 = p038ce.C1042f3.m4319c(r1, r14, r0)     // Catch: java.lang.Exception -> L81
            if (r1 == r10) goto L80
            r3 = r9
            r2 = r13
        L79:
            gd.k r1 = (gd.C2237k) r1     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r1.m8973i()     // Catch: java.lang.Exception -> L32
            goto Lb6
        L80:
            return r10
        L81:
            r0 = move-exception
            r3 = r9
            r2 = r13
        L84:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzp
            if (r1 == 0) goto L8b
            com.google.android.recaptcha.internal.zzp r0 = (com.google.android.recaptcha.internal.zzp) r0
            goto L9d
        L8b:
            java.lang.Class r0 = r0.getClass()
            com.google.android.recaptcha.internal.zzp r1 = new com.google.android.recaptcha.internal.zzp
            com.google.android.recaptcha.internal.zzn r4 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r5 = com.google.android.recaptcha.internal.zzl.zzaj
            java.lang.String r0 = r0.getSimpleName()
            r1.<init>(r4, r5, r0)
            r0 = r1
        L9d:
            com.google.android.recaptcha.internal.zzbg r1 = r3.zzi
            com.google.android.recaptcha.internal.zzne r3 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r2 = r2.zza(r3)
            r1.zzb(r2, r0, r12)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            gd.k$a r1 = gd.C2237k.f8865i
            java.lang.Object r0 = gd.C2238l.m8974a(r0)
            java.lang.Object r0 = gd.C2237k.m8966b(r0)
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzk(com.google.android.recaptcha.RecaptchaAction, long, jd.d):java.lang.Object");
    }

    public final void zzl(zzol zzolVar, zzbd zzbdVar) {
        zzbb zza2 = zzbdVar.zza(zzne.POST_EXECUTE);
        r0.zze.put(zza2, new zzbf(zza2, this.zzi.zza, new zzac()));
        try {
            List<zzon> zzj = zzolVar.zzj();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C5767k.m22904a(C2486d0.m9892a(C2503o.m9995k(zzj, 10)), 16));
            for (zzon zzonVar : zzj) {
                C2236j m8977a = C2240n.m8977a(zzonVar.zzg(), zzonVar.zzi());
                linkedHashMap.put(m8977a.m8963c(), m8977a.m8964d());
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zza2);
        } catch (Exception e10) {
            zzp zzpVar = e10 instanceof zzp ? (zzp) e10 : new zzp(zzn.zzc, zzl.zzan, null);
            this.zzi.zzb(zza2, zzpVar, null);
            throw zzpVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo24459execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r11, long r12, p146jd.InterfaceC3281d<? super gd.C2237k<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzap
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzap r0 = (com.google.android.recaptcha.internal.zzap) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzap r0 = new com.google.android.recaptcha.internal.zzap
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gd.C2238l.m8975b(r14)
            goto L51
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            gd.C2238l.m8975b(r14)
            com.google.android.recaptcha.internal.zzt r14 = r10.zzl
            ce.p0 r14 = r14.zzb()
            jd.g r14 = r14.mo1763b()
            com.google.android.recaptcha.internal.zzaq r2 = new com.google.android.recaptcha.internal.zzaq
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.zzc = r3
            java.lang.Object r14 = p038ce.C1053i.m4362g(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            gd.k r14 = (gd.C2237k) r14
            java.lang.Object r11 = r14.m8973i()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo24459execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo24460executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, p146jd.InterfaceC3281d<? super gd.C2237k<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzar
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzar r0 = (com.google.android.recaptcha.internal.zzar) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzar r0 = new com.google.android.recaptcha.internal.zzar
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            gd.C2238l.m8975b(r6)
            gd.k r6 = (gd.C2237k) r6
            java.lang.Object r5 = r6.m8973i()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            gd.C2238l.m8975b(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo24459execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.mo24460executegIAlus(com.google.android.recaptcha.RecaptchaAction, jd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        InterfaceC1117x0 m4455b;
        m4455b = C1063k.m4455b(this.zzl.zzb(), null, null, new zzau(this, recaptchaAction, 10000L, null), 3, null);
        return zzj.zza(m4455b);
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        InterfaceC1117x0 m4455b;
        m4455b = C1063k.m4455b(this.zzl.zzb(), null, null, new zzau(this, recaptchaAction, j10, null), 3, null);
        return zzj.zza(m4455b);
    }

    public final String zzg() {
        return this.zze;
    }
}
