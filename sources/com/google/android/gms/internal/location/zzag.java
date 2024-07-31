package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.BinderC2062s;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p320w6.C5294d;
import p320w6.C5301g0;
import p320w6.C5313m0;
import p320w6.C5330v;
import p320w6.C5332w;

/* loaded from: classes.dex */
public final class zzag extends AbstractC1845e {
    public static final C1841a.g zza;
    public static final C1841a zzb;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        zzb = new C1841a("ActivityRecognition.API", new zzad(), gVar);
    }

    public zzag(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzag(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzx
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C1841a c1841a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                C2394s.m9620m(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzl(pendingIntent2, new BinderC2062s(zzafVar));
            }
        }).m8275e(2406).m8271a());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzy
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C1841a c1841a = zzag.zzb;
                ((zzf) obj).zzp(pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).m8275e(2402).m8271a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzab
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C1841a c1841a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                C2394s.m9620m(pendingIntent2, "PendingIntent must be specified.");
                C2394s.m9620m(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzp(pendingIntent2, new BinderC2062s(zzafVar));
            }
        }).m8275e(2411).m8271a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final C5294d c5294d, final PendingIntent pendingIntent) {
        c5294d.m21366I(getContextAttributionTag());
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzaa
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C5294d c5294d2 = C5294d.this;
                PendingIntent pendingIntent2 = pendingIntent;
                C1841a c1841a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                C2394s.m9620m(c5294d2, "activityTransitionRequest must be specified.");
                C2394s.m9620m(pendingIntent2, "PendingIntent must be specified.");
                C2394s.m9620m(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzq(c5294d2, pendingIntent2, new BinderC2062s(zzafVar));
            }
        }).m8275e(2405).m8271a());
    }

    public final Task<Void> requestActivityUpdates(long j10, final PendingIntent pendingIntent) {
        C5332w c5332w = new C5332w();
        c5332w.m21403a(j10);
        final C5301g0 m21404b = c5332w.m21404b();
        m21404b.m21377I(getContextAttributionTag());
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzz
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C5301g0 c5301g0 = C5301g0.this;
                PendingIntent pendingIntent2 = pendingIntent;
                C1841a c1841a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                C2394s.m9620m(c5301g0, "ActivityRecognitionRequest can't be null.");
                C2394s.m9620m(pendingIntent2, "PendingIntent must be specified.");
                C2394s.m9620m(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzs(c5301g0, pendingIntent2, new BinderC2062s(zzafVar));
            }
        }).m8275e(2401).m8271a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final C5330v c5330v) {
        C2394s.m9620m(pendingIntent, "PendingIntent must be specified.");
        return doRead(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzac
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zzag zzagVar = zzag.this;
                ((zzo) ((zzf) obj).getService()).zzt(pendingIntent, c5330v, new zzae(zzagVar, (TaskCompletionSource) obj2));
            }
        }).m8274d(C5313m0.f20113b).m8275e(2410).m8271a());
    }
}
