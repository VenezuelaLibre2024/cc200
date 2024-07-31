package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p320w6.C5318p;
import p320w6.C5320q;
import p320w6.InterfaceC5328u;

/* loaded from: classes.dex */
public final class zzce extends AbstractC1845e implements InterfaceC5328u {
    public static final /* synthetic */ int zza = 0;

    public zzce(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzbp.zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzce(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzbp.zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    @Override // p320w6.InterfaceC5328u
    public final Task<C5320q> checkLocationSettings(C5318p c5318p) {
        return doRead(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzcd
            public /* synthetic */ zzcd() {
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C5318p c5318p2 = C5318p.this;
                zzda zzdaVar = (zzda) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                C2394s.m9609b(c5318p2 != null, "locationSettingsRequest can't be null");
                ((zzo) zzdaVar.getService()).zzh(c5318p2, new zzcq(taskCompletionSource), null);
            }
        }).m8275e(2426).m8271a());
    }
}
