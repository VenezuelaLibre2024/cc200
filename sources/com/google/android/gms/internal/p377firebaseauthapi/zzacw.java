package com.google.android.gms.internal.p377firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.auth.C1260b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p096g6.InterfaceC2030i;
import p108h6.C2394s;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p337x7.InterfaceC5730x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzacw<ResultT, CallbackT> implements zzadh<ResultT> {
    public final int zza;
    private ResultT zzaa;
    private Status zzab;
    public C3767g zzc;
    public AbstractC5341a0 zzd;
    public CallbackT zze;
    public InterfaceC5730x zzf;
    public zzacx<ResultT> zzg;
    public Executor zzi;
    public zzafm zzj;
    public zzafb zzk;
    public zzaem zzl;
    public zzafv zzm;
    public String zzn;
    public String zzo;
    public AbstractC5368h zzp;
    public String zzq;
    public String zzr;
    public zzyi zzs;
    public zzafj zzt;
    public zzafi zzu;
    public zzagi zzv;
    public zzaga zzw;
    public boolean zzx;
    private boolean zzz;
    public final zzacy zzb = new zzacy(this);
    public final List<C1260b.b> zzh = new ArrayList();
    private boolean zzy = true;

    /* loaded from: classes.dex */
    public static class zza extends LifecycleCallback {
        private final List<C1260b.b> zza;

        private zza(InterfaceC2030i interfaceC2030i, List<C1260b.b> list) {
            super(interfaceC2030i);
            this.mLifecycleFragment.mo8156a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<C1260b.b> list) {
            InterfaceC2030i fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.mo8157b("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacw(int i10) {
        this.zza = i10;
    }

    public static /* synthetic */ void zza(zzacw zzacwVar) {
        zzacwVar.zzb();
        C2394s.m9623p(zzacwVar.zzz, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzacw zzacwVar, Status status) {
        InterfaceC5730x interfaceC5730x = zzacwVar.zzf;
        if (interfaceC5730x != null) {
            interfaceC5730x.zza(status);
        }
    }

    public final zzacw<ResultT, CallbackT> zza(C1260b.b bVar, Activity activity, Executor executor, String str) {
        C1260b.b zza2 = zzads.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((C1260b.b) C2394s.m9619l(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) C2394s.m9619l(executor);
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) C2394s.m9620m(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(C3767g c3767g) {
        this.zzc = (C3767g) C2394s.m9620m(c3767g, "firebaseApp cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(AbstractC5341a0 abstractC5341a0) {
        this.zzd = (AbstractC5341a0) C2394s.m9620m(abstractC5341a0, "firebaseUser cannot be null");
        return this;
    }

    public final zzacw<ResultT, CallbackT> zza(InterfaceC5730x interfaceC5730x) {
        this.zzf = (InterfaceC5730x) C2394s.m9620m(interfaceC5730x, "external failure callback cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }
}
