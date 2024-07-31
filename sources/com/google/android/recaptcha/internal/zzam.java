package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import p038ce.C1053i;
import p038ce.C1063k;
import p038ce.InterfaceC1117x0;
import p146jd.InterfaceC3281d;
import p174le.C3481c;
import p174le.InterfaceC3479a;

/* loaded from: classes.dex */
public final class zzam {
    private static zzaw zzb;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();
    private static final InterfaceC3479a zzd = C3481c.m12947b(false, 1, null);
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg(null, 1, null);

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j10, zzbq zzbqVar, InterfaceC3281d interfaceC3281d) {
        return C1053i.m4362g(zze.zzb().mo1763b(), new zzah(application, str, j10, null, null), interfaceC3281d);
    }

    public static final Task zzd(Application application, String str, long j10) {
        InterfaceC1117x0 m4455b;
        m4455b = C1063k.m4455b(zze.zzb(), null, null, new zzak(application, str, j10, null), 3, null);
        return zzj.zza(m4455b);
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(3:(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:25|26))(1:27))(3:66|(1:68)|46)|28|29|30|(2:32|(2:34|(2:36|(3:38|16|17)(2:39|40))(5:41|42|43|(5:45|14|15|16|17)|46))(3:47|48|49))(2:50|51)))|30|(0)(0))|7|(0)(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019f, code lost:
    
        r20 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[Catch: all -> 0x019e, Exception -> 0x01a4, RecaptchaException -> 0x01b1, TryCatch #5 {RecaptchaException -> 0x01b1, Exception -> 0x01a4, all -> 0x019e, blocks: (B:29:0x0090, B:32:0x00d5, B:34:0x00dd, B:36:0x00eb, B:38:0x00f5, B:39:0x00fd, B:40:0x0121, B:41:0x0122), top: B:28:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e A[Catch: all -> 0x019a, RecaptchaException -> 0x019c, Exception -> 0x01a6, TryCatch #6 {RecaptchaException -> 0x019c, Exception -> 0x01a6, all -> 0x019a, blocks: (B:43:0x0140, B:48:0x0165, B:49:0x017d, B:50:0x017e, B:51:0x0199), top: B:30:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v4, types: [le.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.recaptcha.internal.zzai, jd.d] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [le.a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(android.app.Application r22, java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzab r26, android.webkit.WebView r27, com.google.android.recaptcha.internal.zzbq r28, com.google.android.recaptcha.internal.zzt r29, p146jd.InterfaceC3281d r30) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, jd.d):java.lang.Object");
    }
}
