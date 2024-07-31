package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzmv extends Enum<zzmv> {
    public static final zzmv zza;
    public static final zzmv zzb;
    public static final zzmv zzc;
    public static final zzmv zzd;
    public static final zzmv zze;
    public static final zzmv zzf;
    public static final zzmv zzg;
    public static final zzmv zzh;
    public static final zzmv zzi;
    public static final zzmv zzj;
    public static final zzmv zzk;
    public static final zzmv zzl;
    public static final zzmv zzm;
    public static final zzmv zzn;
    public static final zzmv zzo;
    public static final zzmv zzp;
    public static final zzmv zzq;
    public static final zzmv zzr;
    private static final /* synthetic */ zzmv[] zzs;
    private final zznf zzt;
    private final int zzu;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.measurement.zzmw.<init>(java.lang.String, int, com.google.android.gms.internal.measurement.zznf, int, com.google.android.gms.internal.measurement.zzmz):void, class status: NOT_LOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    static {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmv.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzmv(String str, int i10, zznf zznfVar, int i11) {
        super(str, i10);
        this.zzt = zznfVar;
        this.zzu = i11;
    }

    public /* synthetic */ zzmv(String str, int i10, zznf zznfVar, int i11, zznc zzncVar) {
        this(str, i10, zznfVar, i11);
    }

    public static zzmv[] values() {
        return (zzmv[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zznf zzb() {
        return this.zzt;
    }
}
