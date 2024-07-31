package p034c7;

import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: c7.x8 */
/* loaded from: classes.dex */
public final class RunnableC0951x8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f3737h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3738i;

    public RunnableC0951x8(C0936w7 c0936w7, zzcv zzcvVar) {
        this.f3737h = zzcvVar;
        this.f3738i = c0936w7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            c7.w7 r0 = r7.f3738i
            c7.gb r0 = r0.mo3106p()
            boolean r1 = com.google.android.gms.internal.measurement.zzpo.zza()
            r2 = 0
            if (r1 == 0) goto L64
            c7.h r1 = r0.mo3092a()
            c7.m4<java.lang.Boolean> r3 = p034c7.C0733i0.f3142z0
            boolean r1 = r1.m3281o(r3)
            if (r1 == 0) goto L64
            c7.i5 r1 = r0.mo3095e()
            c7.n7 r1 = r1.m3410G()
            boolean r1 = r1.m3644y()
            if (r1 != 0) goto L32
            c7.v4 r0 = r0.zzj()
            c7.x4 r0 = r0.m3920H()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L6e
        L32:
            c7.i5 r1 = r0.mo3095e()
            o6.d r3 = r0.zzb()
            long r3 = r3.mo14932a()
            boolean r1 = r1.m3423t(r3)
            if (r1 != 0) goto L71
            c7.i5 r1 = r0.mo3095e()
            c7.n5 r1 = r1.f3165s
            long r3 = r1.m3618a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L55
            goto L71
        L55:
            c7.i5 r0 = r0.mo3095e()
            c7.n5 r0 = r0.f3165s
            long r0 = r0.m3618a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L72
        L64:
            c7.v4 r0 = r0.zzj()
            c7.x4 r0 = r0.m3920H()
            java.lang.String r1 = "getSessionId has been disabled."
        L6e:
            r0.m3995a(r1)
        L71:
            r0 = r2
        L72:
            if (r0 == 0) goto L86
            c7.w7 r1 = r7.f3738i
            c7.k6 r1 = r1.f3198a
            c7.qc r1 = r1.m3491G()
            com.google.android.gms.internal.measurement.zzcv r2 = r7.f3737h
            long r3 = r0.longValue()
            r1.m3782P(r2, r3)
            return
        L86:
            com.google.android.gms.internal.measurement.zzcv r0 = r7.f3737h     // Catch: android.os.RemoteException -> L8c
            r0.zza(r2)     // Catch: android.os.RemoteException -> L8c
            return
        L8c:
            r0 = move-exception
            c7.w7 r1 = r7.f3738i
            c7.k6 r1 = r1.f3198a
            c7.v4 r1 = r1.zzj()
            c7.x4 r1 = r1.m3914B()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.m3996b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.RunnableC0951x8.run():void");
    }
}
