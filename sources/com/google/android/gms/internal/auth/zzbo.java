package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p306v5.C5118b;
import p306v5.C5119c;
import p366z5.C5992b;
import p366z5.C5993c;

/* loaded from: classes.dex */
public final class zzbo extends AbstractC1845e {
    public zzbo(Activity activity, C5119c c5119c) {
        super(activity, C5118b.f19355a, c5119c == null ? C5119c.f19359i : c5119c, AbstractC1845e.a.f7033c);
    }

    public zzbo(Context context, C5119c c5119c) {
        super(context, C5118b.f19355a, c5119c == null ? C5119c.f19359i : c5119c, AbstractC1845e.a.f7033c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        }).m8275e(1520).m8271a());
    }

    public final Task<C5993c> performProxyRequest(final C5992b c5992b) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                C5992b c5992b2 = c5992b;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), c5992b2);
            }
        }).m8275e(1518).m8271a());
    }
}
