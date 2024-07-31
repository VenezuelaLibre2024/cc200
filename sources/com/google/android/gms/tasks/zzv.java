package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p096g6.InterfaceC2030i;

/* loaded from: classes.dex */
final class zzv extends LifecycleCallback {
    private final List zza;

    private zzv(InterfaceC2030i interfaceC2030i) {
        super(interfaceC2030i);
        this.zza = new ArrayList();
        this.mLifecycleFragment.mo8156a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        InterfaceC2030i fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            zzvVar = (zzv) fragment.mo8157b("TaskOnStopCallback", zzv.class);
            if (zzvVar == null) {
                zzvVar = new zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
