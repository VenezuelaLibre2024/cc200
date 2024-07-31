package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import p038ce.C1089q0;
import p115hd.C2502n;
import p146jd.InterfaceC3281d;
import td.C4747g;

/* loaded from: classes.dex */
public final class zzg {
    private final List zza;

    public zzg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzg(List list, int i10, C4747g c4747g) {
        List m9989e = C2502n.m9989e();
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(m9989e);
    }

    public final Object zza(String str, long j10, InterfaceC3281d interfaceC3281d) {
        return C1089q0.m4559c(new zzc(this, str, j10, null), interfaceC3281d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r11, com.google.android.recaptcha.internal.zzoe r13, p146jd.InterfaceC3281d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzd r0 = (com.google.android.recaptcha.internal.zzd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzd r0 = new com.google.android.recaptcha.internal.zzd
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gd.C2238l.m8975b(r14)
            goto L47
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            gd.C2238l.m8975b(r14)
            com.google.android.recaptcha.internal.zzf r14 = new com.google.android.recaptcha.internal.zzf
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = p038ce.C1089q0.m4559c(r14, r0)
            if (r14 != r1) goto L47
            return r1
        L47:
            gd.k r14 = (gd.C2237k) r14
            java.lang.Object r11 = r14.m8973i()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, jd.d):java.lang.Object");
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zza zzaVar) {
        this.zza.add(zzaVar);
    }
}
