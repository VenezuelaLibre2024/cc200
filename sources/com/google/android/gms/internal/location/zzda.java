package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p064e6.C1671d;
import p096g6.C2034j;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p108h6.C2394s;
import p285u.C4777g;
import p320w6.C5308k;
import p320w6.C5310l;
import p320w6.C5313m0;

/* loaded from: classes.dex */
public final class zzda extends AbstractC2361h {
    public static final /* synthetic */ int zze = 0;
    private final C4777g zzf;
    private final C4777g zzg;
    private final C4777g zzh;

    public zzda(Context context, Looper looper, C2352e c2352e, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, 23, c2352e, interfaceC2014e, interfaceC2044m);
        this.zzf = new C4777g();
        this.zzg = new C4777g();
        this.zzh = new C4777g();
    }

    private final boolean zzE(C1671d c1671d) {
        C1671d c1671d2;
        C1671d[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                c1671d2 = null;
                break;
            }
            c1671d2 = availableFeatures[i10];
            if (c1671d.m6691I().equals(c1671d2.m6691I())) {
                break;
            }
            i10++;
        }
        return c1671d2 != null && c1671d2.m6692J() >= c1671d.m6692J();
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzn(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return C5313m0.f20123l;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // p108h6.AbstractC2346c
    public final void onConnectionSuspended(int i10) {
        super.onConnectionSuspended(i10);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z10, TaskCompletionSource taskCompletionSource) {
        if (zzE(C5313m0.f20118g)) {
            ((zzo) getService()).zzx(z10, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzw(z10);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(C2034j.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            zzcw zzcwVar = (zzcw) this.zzg.remove(aVar);
            if (zzcwVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzcwVar.zzh();
            if (!z10) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzE(C5313m0.f20121j)) {
                ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzC(C2034j.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzf) {
            zzcz zzczVar = (zzcz) this.zzf.remove(aVar);
            if (zzczVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzczVar.zzg();
            if (!z10) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzE(C5313m0.f20121j)) {
                ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) {
        if (zzE(C5313m0.f20121j)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, taskCompletionSource), null));
        }
    }

    public final LocationAvailability zzp() {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(C5308k c5308k, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        C2394s.m9620m(c5308k, "geofencingRequest can't be null.");
        C2394s.m9620m(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(c5308k, pendingIntent, new zzci(taskCompletionSource));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) {
        ((zzo) getService()).zzi(new zzcn(null, taskCompletionSource));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.location.zzcf.<init>(h6.l):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void zzs(p320w6.C5296e r8, com.google.android.gms.tasks.CancellationToken r9, com.google.android.gms.tasks.TaskCompletionSource r10) {
        /*
            r7 = this;
            r7.getContext()
            e6.d r0 = p320w6.C5313m0.f20116e
            boolean r0 = r7.zzE(r0)
            if (r0 == 0) goto L25
            android.os.IInterface r0 = r7.getService()
            com.google.android.gms.internal.location.zzo r0 = (com.google.android.gms.internal.location.zzo) r0
            com.google.android.gms.internal.location.zzcm r1 = new com.google.android.gms.internal.location.zzcm
            r1.<init>(r7, r10)
            h6.l r8 = r0.zze(r8, r1)
            if (r9 == 0) goto La5
            com.google.android.gms.internal.location.zzcf r10 = new com.google.android.gms.internal.location.zzcf
            r10.<init>()
            r9.onCanceledRequested(r10)
            return
        L25:
            com.google.android.gms.internal.location.zzcj r0 = new com.google.android.gms.internal.location.zzcj
            r0.<init>(r7, r10)
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.location.zzdx.zza()
            java.lang.String r2 = "GetCurrentLocation"
            g6.j r0 = p096g6.C2038k.m8169b(r0, r1, r2)
            g6.j$a r1 = r0.m8160b()
            r1.getClass()
            com.google.android.gms.internal.location.zzck r2 = new com.google.android.gms.internal.location.zzck
            r2.<init>(r7, r0, r10)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.gms.location.LocationRequest$a r3 = new com.google.android.gms.location.LocationRequest$a
            int r4 = r8.m21371L()
            r5 = 0
            r3.<init>(r4, r5)
            r3.m5058g(r5)
            long r4 = r8.m21368I()
            r3.m5053b(r4)
            int r4 = r8.m21369J()
            r3.m5054c(r4)
            long r4 = r8.m21370K()
            r3.m5056e(r4)
            boolean r4 = r8.m21374O()
            r3.m5061j(r4)
            int r4 = r8.m21372M()
            r3.m5063l(r4)
            r4 = 1
            r3.m5060i(r4)
            java.lang.String r4 = r8.zzd()
            r3.m5062k(r4)
            android.os.WorkSource r8 = r8.m21373N()
            r3.m5064m(r8)
            com.google.android.gms.location.LocationRequest r8 = r3.m5052a()
            r7.zzu(r2, r8, r0)
            com.google.android.gms.tasks.Task r8 = r0.getTask()
            com.google.android.gms.internal.location.zzcg r0 = new com.google.android.gms.internal.location.zzcg
            r0.<init>()
            r8.addOnCompleteListener(r0)
            if (r9 == 0) goto La5
            com.google.android.gms.internal.location.zzch r8 = new com.google.android.gms.internal.location.zzch
            r8.<init>()
            r9.onCanceledRequested(r8)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzs(w6.e, com.google.android.gms.tasks.CancellationToken, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzt(C5310l c5310l, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(C5313m0.f20117f)) {
            ((zzo) getService()).zzj(c5310l, new zzcm(this, taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzo) getService()).zzd());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzu(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            g6.j r3 = r18.zza()
            g6.j$a r4 = r3.m8160b()
            r4.getClass()
            e6.d r5 = p320w6.C5313m0.f20121j
            boolean r5 = r1.zzE(r5)
            u.g r6 = r1.zzg
            monitor-enter(r6)
            u.g r7 = r1.zzg     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcw r7 = (com.google.android.gms.internal.location.zzcw) r7     // Catch: java.lang.Throwable -> L82
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L28
            goto L2e
        L28:
            r7.zzg(r3)     // Catch: java.lang.Throwable -> L82
            r13 = r7
            r7 = r8
            goto L3b
        L2e:
            com.google.android.gms.internal.location.zzcw r3 = new com.google.android.gms.internal.location.zzcw     // Catch: java.lang.Throwable -> L82
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L82
            u.g r9 = r1.zzg     // Catch: java.lang.Throwable -> L82
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L82
            r13 = r3
        L3b:
            r17.getContext()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r4.m8163a()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzb(r7, r13, r8, r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L82
            r5.<init>(r1, r8, r2)     // Catch: java.lang.Throwable -> L82
            r4.zzk(r3, r0, r5)     // Catch: java.lang.Throwable -> L82
            goto L80
        L57:
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L82
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r5.m5062k(r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest r0 = r5.m5052a()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r0)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcp r15 = new com.google.android.gms.internal.location.zzcp     // Catch: java.lang.Throwable -> L82
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L82
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L82
            r4.zzz(r0)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzu(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzv(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            g6.j r3 = r18.zza()
            g6.j$a r4 = r3.m8160b()
            r4.getClass()
            e6.d r5 = p320w6.C5313m0.f20121j
            boolean r5 = r1.zzE(r5)
            u.g r6 = r1.zzf
            monitor-enter(r6)
            u.g r7 = r1.zzf     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcz r7 = (com.google.android.gms.internal.location.zzcz) r7     // Catch: java.lang.Throwable -> L82
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L28
            goto L2e
        L28:
            r7.zzf(r3)     // Catch: java.lang.Throwable -> L82
            r12 = r7
            r7 = r8
            goto L3b
        L2e:
            com.google.android.gms.internal.location.zzcz r3 = new com.google.android.gms.internal.location.zzcz     // Catch: java.lang.Throwable -> L82
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L82
            u.g r9 = r1.zzf     // Catch: java.lang.Throwable -> L82
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L82
            r12 = r3
        L3b:
            r17.getContext()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r4.m8163a()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzc(r7, r12, r8, r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L82
            r5.<init>(r1, r8, r2)     // Catch: java.lang.Throwable -> L82
            r4.zzk(r3, r0, r5)     // Catch: java.lang.Throwable -> L82
            goto L80
        L57:
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L82
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r5.m5062k(r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest r0 = r5.m5052a()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r0)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzco r15 = new com.google.android.gms.internal.location.zzco     // Catch: java.lang.Throwable -> L82
            r15.<init>(r2, r12)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L82
            r10 = 1
            r13 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L82
            r4.zzz(r0)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzv(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(C5313m0.f20121j)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(this, null, taskCompletionSource));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.C1178a c1178a = new LocationRequest.C1178a(locationRequest);
        c1178a.m5062k(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, c1178a.m5052a()), null, null, pendingIntent, new zzcn(null, taskCompletionSource), "PendingIntent@" + pendingIntent.hashCode()));
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        C2394s.m9620m(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzy(List list, TaskCompletionSource taskCompletionSource) {
        C2394s.m9609b((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzz(Location location, TaskCompletionSource taskCompletionSource) {
        if (zzE(C5313m0.f20119h)) {
            ((zzo) getService()).zzv(location, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzu(location);
            taskCompletionSource.setResult(null);
        }
    }
}
