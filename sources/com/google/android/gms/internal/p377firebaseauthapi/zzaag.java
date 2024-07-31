package com.google.android.gms.internal.p377firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C1260b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p108h6.C2394s;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.C5349c0;
import p321w7.C5350c1;
import p321w7.C5356e;
import p321w7.C5376j;
import p321w7.C5394o0;
import p321w7.C5397p0;
import p321w7.C5403r0;
import p321w7.C5415v0;
import p321w7.InterfaceC5352d;
import p321w7.InterfaceC5372i;
import p321w7.InterfaceC5412u0;
import p337x7.C5669e;
import p337x7.C5685i;
import p337x7.C5691k;
import p337x7.C5704o0;
import p337x7.C5706p;
import p337x7.InterfaceC5683h1;
import p337x7.InterfaceC5720t1;
import p337x7.InterfaceC5730x;
import p337x7.InterfaceC5733y;

/* loaded from: classes.dex */
public final class zzaag extends zzadf {
    public zzaag(C3767g c3767g, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzace(c3767g, scheduledExecutorService);
        this.zzb = executor;
    }

    public static C5685i zza(C3767g c3767g, zzafb zzafbVar) {
        C2394s.m9619l(c3767g);
        C2394s.m9619l(zzafbVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5669e(zzafbVar, "firebase"));
        List<zzafr> zzl = zzafbVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new C5669e(zzl.get(i10)));
            }
        }
        C5685i c5685i = new C5685i(c3767g, arrayList);
        c5685i.m22762m0(new C5691k(zzafbVar.zzb(), zzafbVar.zza()));
        c5685i.m22763n0(zzafbVar.zzn());
        c5685i.m22761l0(zzafbVar.zze());
        c5685i.mo21435h0(C5704o0.m22791a(zzafbVar.zzk()));
        c5685i.m22764o0(zzafbVar.zzd());
        return c5685i;
    }

    public final Task<zzafi> zza() {
        return zza(new zzaaq());
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabi(str));
    }

    public final Task<zzafj> zza(String str, String str2) {
        return zza(new zzaat(str, str2));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabh(str, str2, str3, str4));
    }

    public final Task<Void> zza(String str, String str2, C5356e c5356e) {
        c5356e.m21474Q(7);
        return zza(new zzacb(str, str2, c5356e));
    }

    public final Task<Void> zza(C3767g c3767g, String str, String str2) {
        return zza((zzaaj) new zzaaj(str, str2).zza(c3767g));
    }

    public final Task<Void> zza(C3767g c3767g, String str, String str2, String str3) {
        return zza((zzaal) new zzaal(str, str2, str3).zza(c3767g));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, String str, String str2, String str3, String str4, InterfaceC5720t1 interfaceC5720t1) {
        return zza((zzaak) new zzaak(str, str2, str3, str4).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, String str, String str2, InterfaceC5720t1 interfaceC5720t1) {
        return zza((zzabn) new zzabn(str, str2).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<Void> zza(C3767g c3767g, String str, C5356e c5356e, String str2, String str3) {
        c5356e.m21474Q(1);
        return zza((zzabj) new zzabj(str, c5356e, str2, str3, "sendPasswordResetEmail").zza(c3767g));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, String str2, String str3, String str4, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaba) new zzaba(str, str2, str3, str4).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, String str2, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabs) new zzabs(abstractC5341a0.zze(), str, str2).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<C5349c0> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaar) new zzaar(str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<C5349c0, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5350c1 c5350c1, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaby) new zzaby(c5350c1).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, AbstractC5368h abstractC5368h, String str, InterfaceC5683h1 interfaceC5683h1) {
        C2394s.m9619l(c3767g);
        C2394s.m9619l(abstractC5368h);
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(interfaceC5683h1);
        List<String> mo21437j0 = abstractC5341a0.mo21437j0();
        if (mo21437j0 != null && mo21437j0.contains(abstractC5368h.mo21462I())) {
            return Tasks.forException(zzach.zza(new Status(17015)));
        }
        if (abstractC5368h instanceof C5376j) {
            C5376j c5376j = (C5376j) abstractC5368h;
            return !c5376j.m21511O() ? zza((zzaas) new zzaas(c5376j, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1)) : zza((zzaax) new zzaax(c5376j).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
        }
        if (abstractC5368h instanceof C5394o0) {
            zzads.zza();
            return zza((zzaau) new zzaau((C5394o0) abstractC5368h).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
        }
        C2394s.m9619l(c3767g);
        C2394s.m9619l(abstractC5368h);
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(interfaceC5683h1);
        return zza((zzaav) new zzaav(abstractC5368h).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5376j c5376j, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaay) new zzaay(c5376j, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5394o0 c5394o0, String str, InterfaceC5683h1 interfaceC5683h1) {
        zzads.zza();
        return zza((zzabc) new zzabc(c5394o0, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5394o0 c5394o0, InterfaceC5683h1 interfaceC5683h1) {
        zzads.zza();
        return zza((zzabz) new zzabz(c5394o0).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5397p0 c5397p0, String str, InterfaceC5720t1 interfaceC5720t1) {
        zzads.zza();
        zzaao zzaaoVar = new zzaao(c5397p0, str, null);
        zzaaoVar.zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1);
        if (abstractC5341a0 != null) {
            zzaaoVar.zza(abstractC5341a0);
        }
        return zza(zzaaoVar);
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5415v0 c5415v0, String str, String str2, InterfaceC5720t1 interfaceC5720t1) {
        zzaao zzaaoVar = new zzaao(c5415v0, str, str2);
        zzaaoVar.zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1);
        if (abstractC5341a0 != null) {
            zzaaoVar.zza(abstractC5341a0);
        }
        return zza(zzaaoVar);
    }

    public final Task<Void> zza(C3767g c3767g, AbstractC5341a0 abstractC5341a0, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabe) new zzabe().zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zza(C3767g c3767g, C5356e c5356e, String str) {
        return zza((zzabg) new zzabg(str, c5356e).zza(c3767g));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, AbstractC5368h abstractC5368h, String str, InterfaceC5720t1 interfaceC5720t1) {
        return zza((zzabk) new zzabk(abstractC5368h, str).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, C5376j c5376j, String str, InterfaceC5720t1 interfaceC5720t1) {
        return zza((zzabp) new zzabp(c5376j, str).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, C5394o0 c5394o0, String str, InterfaceC5720t1 interfaceC5720t1) {
        zzads.zza();
        return zza((zzabo) new zzabo(c5394o0, str).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<Void> zza(C3767g c3767g, C5397p0 c5397p0, AbstractC5341a0 abstractC5341a0, String str, InterfaceC5720t1 interfaceC5720t1) {
        zzads.zza();
        zzaap zzaapVar = new zzaap(c5397p0, abstractC5341a0.zze(), str, null);
        zzaapVar.zza(c3767g).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5720t1);
        return zza(zzaapVar);
    }

    public final Task<Void> zza(C3767g c3767g, C5415v0 c5415v0, AbstractC5341a0 abstractC5341a0, String str, String str2, InterfaceC5720t1 interfaceC5720t1) {
        zzaap zzaapVar = new zzaap(c5415v0, abstractC5341a0.zze(), str, str2);
        zzaapVar.zza(c3767g).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5720t1);
        return zza(zzaapVar);
    }

    public final Task<InterfaceC5372i> zza(C3767g c3767g, InterfaceC5720t1 interfaceC5720t1, String str) {
        return zza((zzabl) new zzabl(str).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<Void> zza(AbstractC5341a0 abstractC5341a0, InterfaceC5733y interfaceC5733y) {
        return zza((zzaan) new zzaan().zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5733y>) interfaceC5733y).zza((InterfaceC5730x) interfaceC5733y));
    }

    public final Task<zzagi> zza(C5706p c5706p, String str) {
        return zza(new zzabq(c5706p, str));
    }

    public final Task<Void> zza(C5706p c5706p, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, C1260b.b bVar, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(c5706p, str, str2, j10, z10, z11, str3, str4, z12);
        zzabrVar.zza(bVar, activity, executor, str);
        return zza(zzabrVar);
    }

    public final Task<Void> zza(C5706p c5706p, C5403r0 c5403r0, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, C1260b.b bVar, Executor executor, Activity activity) {
        zzabt zzabtVar = new zzabt(c5403r0, C2394s.m9613f(c5706p.zzc()), str, j10, z10, z11, str2, str3, z12);
        zzabtVar.zza(bVar, activity, executor, c5403r0.mo21515b());
        return zza(zzabtVar);
    }

    public final void zza(C3767g c3767g, zzafz zzafzVar, C1260b.b bVar, Activity activity, Executor executor) {
        zza((zzacd) new zzacd(zzafzVar).zza(c3767g).zza(bVar, activity, executor, zzafzVar.zzd()));
    }

    public final Task<InterfaceC5352d> zzb(C3767g c3767g, String str, String str2) {
        return zza((zzaai) new zzaai(str, str2).zza(c3767g));
    }

    public final Task<InterfaceC5372i> zzb(C3767g c3767g, String str, String str2, String str3, String str4, InterfaceC5720t1 interfaceC5720t1) {
        return zza((zzabm) new zzabm(str, str2, str3, str4).zza(c3767g).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5720t1));
    }

    public final Task<Void> zzb(C3767g c3767g, String str, C5356e c5356e, String str2, String str3) {
        c5356e.m21474Q(6);
        return zza((zzabj) new zzabj(str, c5356e, str2, str3, "sendSignInLinkToEmail").zza(c3767g));
    }

    public final Task<InterfaceC5372i> zzb(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, String str2, String str3, String str4, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabd) new zzabd(str, str2, str3, str4).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zzb(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, InterfaceC5683h1 interfaceC5683h1) {
        C2394s.m9619l(c3767g);
        C2394s.m9613f(str);
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(interfaceC5683h1);
        List<String> mo21437j0 = abstractC5341a0.mo21437j0();
        if ((mo21437j0 != null && !mo21437j0.contains(str)) || abstractC5341a0.mo21414O()) {
            return Tasks.forException(zzach.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals("password") ? zza((zzabu) new zzabu(str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1)) : zza((zzabv) new zzabv().zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<Void> zzb(C3767g c3767g, AbstractC5341a0 abstractC5341a0, AbstractC5368h abstractC5368h, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaaw) new zzaaw(abstractC5368h, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zzb(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5376j c5376j, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabb) new zzabb(c5376j, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zzb(C3767g c3767g, AbstractC5341a0 abstractC5341a0, C5394o0 c5394o0, String str, InterfaceC5683h1 interfaceC5683h1) {
        zzads.zza();
        return zza((zzabf) new zzabf(c5394o0, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5412u0> zzc(C3767g c3767g, String str, String str2) {
        return zza((zzaam) new zzaam(str, str2).zza(c3767g));
    }

    public final Task<Void> zzc(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabx) new zzabx(str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<InterfaceC5372i> zzc(C3767g c3767g, AbstractC5341a0 abstractC5341a0, AbstractC5368h abstractC5368h, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzaaz) new zzaaz(abstractC5368h, str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<InterfaceC5372i, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }

    public final Task<String> zzd(C3767g c3767g, String str, String str2) {
        return zza((zzaca) new zzaca(str, str2).zza(c3767g));
    }

    public final Task<Void> zzd(C3767g c3767g, AbstractC5341a0 abstractC5341a0, String str, InterfaceC5683h1 interfaceC5683h1) {
        return zza((zzabw) new zzabw(str).zza(c3767g).zza(abstractC5341a0).zza((zzacw<Void, InterfaceC5720t1>) interfaceC5683h1).zza((InterfaceC5730x) interfaceC5683h1));
    }
}
