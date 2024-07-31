package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p320w6.C5308k;

/* loaded from: classes.dex */
public final class zzbz extends AbstractC1845e {
    public static final /* synthetic */ int zza = 0;

    public zzbz(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzbp.zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzbz(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzbp.zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public final Task<Void> addGeofences(C5308k c5308k, final PendingIntent pendingIntent) {
        final C5308k m21380J = c5308k.m21380J(getContextAttributionTag());
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbw
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzq(C5308k.this, pendingIntent, (TaskCompletionSource) obj2);
            }
        }).m8275e(2424).m8271a());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzby
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzx(pendingIntent, (TaskCompletionSource) obj2);
            }
        }).m8275e(2425).m8271a());
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzy(list, (TaskCompletionSource) obj2);
            }
        }).m8275e(2425).m8271a());
    }
}
