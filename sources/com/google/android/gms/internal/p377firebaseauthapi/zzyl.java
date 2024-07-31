package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import p108h6.C2394s;
import p321w7.C5350c1;
import p321w7.C5356e;
import p321w7.C5376j;
import p321w7.C5428z1;
import p337x7.C5712r;

/* loaded from: classes.dex */
public final class zzyl {
    private final zzadk zza;

    public zzyl(zzadk zzadkVar) {
        this.zza = (zzadk) C2394s.m9619l(zzadkVar);
    }

    public final void zza(zzaeo zzaeoVar, zzacf zzacfVar) {
        C2394s.m9619l(zzaeoVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzaeoVar, new zzyo(this, zzacfVar));
    }

    public final void zza(zzafm zzafmVar, String str, String str2, Boolean bool, C5428z1 c5428z1, zzacf zzacfVar, zzadj zzadjVar) {
        C2394s.m9619l(zzafmVar);
        C2394s.m9619l(zzadjVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzaez(zzafmVar.zzc()), new zzyt(this, zzadjVar, str2, str, bool, c5428z1, zzacfVar, zzafmVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzafb zzafbVar, zzagb zzagbVar, zzadj zzadjVar) {
        C2394s.m9619l(zzacfVar);
        C2394s.m9619l(zzafmVar);
        C2394s.m9619l(zzafbVar);
        C2394s.m9619l(zzagbVar);
        C2394s.m9619l(zzadjVar);
        zzylVar.zza.zza(zzagbVar, new zzyq(zzylVar, zzagbVar, zzafbVar, zzacfVar, zzafmVar, zzadjVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzafm zzafmVar, zzagb zzagbVar, zzadj zzadjVar) {
        C2394s.m9619l(zzacfVar);
        C2394s.m9619l(zzafmVar);
        C2394s.m9619l(zzagbVar);
        C2394s.m9619l(zzadjVar);
        zzylVar.zza.zza(new zzaez(zzafmVar.zzc()), new zzyr(zzylVar, zzadjVar, zzacfVar, zzafmVar, zzagbVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzacf zzacfVar, zzagd zzagdVar, zzadj zzadjVar) {
        C2394s.m9619l(zzacfVar);
        C2394s.m9619l(zzagdVar);
        C2394s.m9619l(zzadjVar);
        zzylVar.zza.zza(zzagdVar, new zzza(zzylVar, zzacfVar, zzadjVar));
    }

    public static /* synthetic */ void zza(zzyl zzylVar, zzagu zzaguVar, zzacf zzacfVar, zzadj zzadjVar) {
        if (!zzaguVar.zzo()) {
            zzylVar.zza(new zzafm(zzaguVar.zzi(), zzaguVar.zze(), Long.valueOf(zzaguVar.zza()), "Bearer"), zzaguVar.zzh(), zzaguVar.zzg(), Boolean.valueOf(zzaguVar.zzn()), zzaguVar.zzb(), zzacfVar, zzadjVar);
            return;
        }
        zzacfVar.zza(new zzyj(zzaguVar.zzm() ? new Status(17012) : C5712r.m22812a(zzaguVar.zzd()), zzaguVar.zzb(), zzaguVar.zzc(), zzaguVar.zzj()));
    }

    private final void zza(String str, zzadm<zzafm> zzadmVar) {
        C2394s.m9619l(zzadmVar);
        C2394s.m9613f(str);
        zzafm zzb = zzafm.zzb(str);
        if (zzb.zzg()) {
            zzadmVar.zza((zzadm<zzafm>) zzb);
        } else {
            this.zza.zza(new zzafa(zzb.zzd()), new zzaae(this, zzadmVar));
        }
    }

    private final void zzb(zzafd zzafdVar, zzacf zzacfVar) {
        C2394s.m9619l(zzafdVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzafdVar, new zzzz(this, zzacfVar));
    }

    public final void zza(zzaeq zzaeqVar, String str, zzacf zzacfVar) {
        C2394s.m9619l(zzaeqVar);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzm(this, zzaeqVar, zzacfVar));
    }

    public final void zza(zzaes zzaesVar, zzacf zzacfVar) {
        C2394s.m9619l(zzaesVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzaesVar, new zzzo(this, zzacfVar));
    }

    public final void zza(zzafd zzafdVar, zzacf zzacfVar) {
        zzb(zzafdVar, zzacfVar);
    }

    public final void zza(zzaff zzaffVar, zzacf zzacfVar) {
        C2394s.m9619l(zzaffVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzaffVar, new zzzt(this, zzacfVar));
    }

    public final void zza(zzafk zzafkVar, zzacf zzacfVar) {
        C2394s.m9619l(zzafkVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzafkVar, new zzzq(this, zzacfVar));
    }

    public final void zza(zzafy zzafyVar, zzacf zzacfVar) {
        this.zza.zza(zzafyVar, new zzaab(this, zzacfVar));
    }

    public final void zza(zzafz zzafzVar, zzacf zzacfVar) {
        C2394s.m9613f(zzafzVar.zzd());
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzafzVar, new zzyz(this, zzacfVar));
    }

    public final void zza(zzagf zzagfVar, zzacf zzacfVar) {
        C2394s.m9619l(zzagfVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzagfVar, new zzzn(this, zzagfVar, zzacfVar));
    }

    public final void zza(zzagh zzaghVar, zzacf zzacfVar) {
        C2394s.m9619l(zzaghVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzaghVar, new zzzr(this, zzacfVar));
    }

    public final void zza(zzags zzagsVar, zzacf zzacfVar) {
        C2394s.m9619l(zzagsVar);
        C2394s.m9619l(zzacfVar);
        zzagsVar.zzb(true);
        this.zza.zza(zzagsVar, new zzzk(this, zzacfVar));
    }

    public final void zza(zzagt zzagtVar, zzacf zzacfVar) {
        C2394s.m9619l(zzagtVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzagtVar, new zzyx(this, zzacfVar));
    }

    public final void zza(zzagx zzagxVar, zzacf zzacfVar) {
        C2394s.m9619l(zzagxVar);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(zzagxVar, new zzyy(this, zzacfVar));
    }

    public final void zza(String str, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzu(this, zzacfVar));
    }

    public final void zza(String str, zzags zzagsVar, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzagsVar);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzf(this, zzagsVar, zzacfVar));
    }

    public final void zza(String str, zzagx zzagxVar, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzagxVar);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzd(this, zzagxVar, zzacfVar));
    }

    public final void zza(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zzagb zzagbVar = new zzagb();
        zzagbVar.zze(str);
        zzagbVar.zzh(str2);
        this.zza.zza(zzagbVar, new zzaaf(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzafw(str, str2, str3), new zzyw(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzagd(str, str2, null, str3, str4, null), new zzyn(this, zzacfVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9613f(str3);
        C2394s.m9619l(zzacfVar);
        zza(str3, new zzzb(this, str, str2, str4, str5, zzacfVar));
    }

    public final void zza(String str, C5350c1 c5350c1, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(c5350c1);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzaaa(this, c5350c1, zzacfVar));
    }

    public final void zza(String str, C5356e c5356e, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zzafd zzafdVar = new zzafd(4);
        zzafdVar.zzd(str);
        if (c5356e != null) {
            zzafdVar.zza(c5356e);
        }
        zzb(zzafdVar, zzacfVar);
    }

    public final void zza(String str, C5356e c5356e, String str2, String str3, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zzafd zzafdVar = new zzafd(c5356e.m21473P());
        zzafdVar.zzb(str);
        zzafdVar.zza(c5356e);
        zzafdVar.zzc(str2);
        zzafdVar.zza(str3);
        this.zza.zza(zzafdVar, new zzyv(this, zzacfVar));
    }

    public final void zza(C5376j c5376j, String str, zzacf zzacfVar) {
        C2394s.m9619l(c5376j);
        C2394s.m9619l(zzacfVar);
        if (c5376j.zzg()) {
            zza(c5376j.m21510N(), new zzyp(this, c5376j, str, zzacfVar));
        } else {
            zza(new zzaeo(c5376j, null, str), zzacfVar);
        }
    }

    public final void zzb(String str, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzafa(str), new zzyk(this, zzacfVar));
    }

    public final void zzb(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzaad(this, str2, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzi(this, str2, str3, zzacfVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzagv(str, str2, str3, str4), new zzym(this, zzacfVar));
    }

    public final void zzc(String str, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzs(this, zzacfVar));
    }

    public final void zzc(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzaac(this, str2, zzacfVar));
    }

    public final void zzd(String str, zzacf zzacfVar) {
        C2394s.m9619l(zzacfVar);
        this.zza.zza(str, new zzzw(this, zzacfVar));
    }

    public final void zzd(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzafw(str, null, str2), new zzyu(this, zzacfVar));
    }

    public final void zze(String str, zzacf zzacfVar) {
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzagd(str), new zzzy(this, zzacfVar));
    }

    public final void zze(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        this.zza.zza(new zzaej(str, str2), new zzys(this, zzacfVar));
    }

    public final void zzf(String str, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzacfVar);
        zza(str, new zzzh(this, zzacfVar));
    }

    public final void zzf(String str, String str2, zzacf zzacfVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzacfVar);
        zza(str2, new zzzg(this, str, zzacfVar));
    }
}
