package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgr;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p109h7.AbstractC2429l;
import p109h7.C2432o;
import p109h7.C2439v;
import p109h7.InterfaceC2424g;
import p109h7.InterfaceC2438u;

/* loaded from: classes.dex */
public abstract class zzgv<T> {
    private static volatile zzhc zzb = null;
    private static volatile boolean zzc = false;
    private final zzhd zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzgv<?>>> zzd = new AtomicReference<>();
    private static zzhg zze = new zzhg(zzgw.zza);
    private static final AtomicInteger zzf = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    public zzgv(zzhd zzhdVar, String str, T t10, boolean z10) {
        this.zzj = -1;
        String str2 = zzhdVar.zza;
        if (str2 == null && zzhdVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhdVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzhdVar;
        this.zzh = str;
        this.zzi = t10;
        this.zzl = z10;
    }

    public /* synthetic */ zzgv(zzhd zzhdVar, String str, Object obj, boolean z10, zzhf zzhfVar) {
        this(zzhdVar, str, obj, true);
    }

    public static /* synthetic */ zzgv zza(zzhd zzhdVar, String str, Boolean bool, boolean z10) {
        return new zzgy(zzhdVar, str, bool, true);
    }

    public static /* synthetic */ zzgv zza(zzhd zzhdVar, String str, Double d10, boolean z10) {
        return new zzhb(zzhdVar, str, d10, true);
    }

    public static /* synthetic */ zzgv zza(zzhd zzhdVar, String str, Long l10, boolean z10) {
        return new zzgz(zzhdVar, str, l10, true);
    }

    public static /* synthetic */ zzgv zza(zzhd zzhdVar, String str, String str2, boolean z10) {
        return new zzha(zzhdVar, str, str2, true);
    }

    private final T zza(zzhc zzhcVar) {
        InterfaceC2424g<Context, Boolean> interfaceC2424g;
        zzhd zzhdVar = this.zzg;
        if (!zzhdVar.zze && ((interfaceC2424g = zzhdVar.zzh) == null || interfaceC2424g.apply(zzhcVar.zza()).booleanValue())) {
            zzgo zza2 = zzgo.zza(zzhcVar.zza());
            zzhd zzhdVar2 = this.zzg;
            Object zza3 = zza2.zza(zzhdVar2.zze ? null : zza(zzhdVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzh;
        }
        return str + this.zzh;
    }

    private final T zzb(zzhc zzhcVar) {
        Object zza2;
        zzgj zza3 = this.zzg.zzb != null ? zzgt.zza(zzhcVar.zza(), this.zzg.zzb) ? this.zzg.zzg ? zzgg.zza(zzhcVar.zza().getContentResolver(), zzgs.zza(zzgs.zza(zzhcVar.zza(), this.zzg.zzb.getLastPathSegment())), zzgu.zza) : zzgg.zza(zzhcVar.zza().getContentResolver(), this.zzg.zzb, zzgu.zza) : null : zzhe.zza(zzhcVar.zza(), this.zzg.zza, zzgu.zza);
        if (zza3 == null || (zza2 = zza3.zza(zzb())) == null) {
            return null;
        }
        return zza(zza2);
    }

    public static void zzb(Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzhc zzhcVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhcVar == null || zzhcVar.zza() != context) {
                        zzgg.zzc();
                        zzhe.zza();
                        zzgo.zza();
                        zzb = new zzgd(context, C2439v.m9732a(new InterfaceC2438u() { // from class: com.google.android.gms.internal.measurement.zzgx
                            private /* synthetic */ Context zza;

                            public /* synthetic */ zzgx(Context context2) {
                                r1 = context2;
                            }

                            @Override // p109h7.InterfaceC2438u
                            public final Object get() {
                                AbstractC2429l zza2;
                                zza2 = zzgr.zza.zza(r1);
                                return zza2;
                            }
                        }));
                        zzf.incrementAndGet();
                    }
                }
            }
        }
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final T zza() {
        T zzb2;
        if (!this.zzl) {
            C2432o.m9710p(zze.zza(this.zzh), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i10 = zzf.get();
        if (this.zzj < i10) {
            synchronized (this) {
                if (this.zzj < i10) {
                    zzhc zzhcVar = zzb;
                    AbstractC2429l<zzgp> m9690a = AbstractC2429l.m9690a();
                    String str = null;
                    if (zzhcVar != null) {
                        m9690a = zzhcVar.zzb().get();
                        if (m9690a.mo9656c()) {
                            zzgp mo9655b = m9690a.mo9655b();
                            zzhd zzhdVar = this.zzg;
                            str = mo9655b.zza(zzhdVar.zzb, zzhdVar.zza, zzhdVar.zzd, this.zzh);
                        }
                    }
                    C2432o.m9710p(zzhcVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzg.zzf ? (zzb2 = zzb(zzhcVar)) == null && (zzb2 = zza(zzhcVar)) == null : (zzb2 = zza(zzhcVar)) == null && (zzb2 = zzb(zzhcVar)) == null) {
                        zzb2 = this.zzi;
                    }
                    if (m9690a.mo9656c()) {
                        zzb2 = str == null ? this.zzi : zza((Object) str);
                    }
                    this.zzk = zzb2;
                    this.zzj = i10;
                }
            }
        }
        return this.zzk;
    }

    public abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzg.zzd);
    }
}
