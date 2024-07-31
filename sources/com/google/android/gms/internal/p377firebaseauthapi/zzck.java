package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzvh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class zzck<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzcl, List<zzcm<P>>> zzb;
    private final List<zzcm<P>> zzc;
    private zzcm<P> zzd;
    private zzrl zze;

    /* JADX INFO: Access modifiers changed from: private */
    public zzck(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrl.zza;
    }

    public /* synthetic */ zzck(Class cls, zzcj zzcjVar) {
        this(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.p377firebaseauthapi.zzck<P> zza(P r13, P r14, com.google.android.gms.internal.firebase-auth-api.zzvh.zza r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzck.zza(java.lang.Object, java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzvh$zza, boolean):com.google.android.gms.internal.firebase-auth-api.zzck");
    }

    public final zzch<P> zza() {
        ConcurrentMap<zzcl, List<zzcm<P>>> concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzch<P> zzchVar = new zzch<>(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzchVar;
    }

    public final zzck<P> zza(zzrl zzrlVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzrlVar;
        return this;
    }

    public final zzck<P> zza(P p10, P p11, zzvh.zza zzaVar) {
        return zza(p10, p11, zzaVar, false);
    }

    public final zzck<P> zzb(P p10, P p11, zzvh.zza zzaVar) {
        return zza(p10, p11, zzaVar, true);
    }
}
