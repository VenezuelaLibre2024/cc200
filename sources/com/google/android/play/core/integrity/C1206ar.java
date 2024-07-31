package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097g7.C2091c0;
import p097g7.InterfaceC2118u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.ar */
/* loaded from: classes.dex */
public final class C1206ar extends AbstractC1211aw {

    /* renamed from: a */
    public final /* synthetic */ long f4651a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f4652b;

    /* renamed from: c */
    public final /* synthetic */ C1212ax f4653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206ar(C1212ax c1212ax, TaskCompletionSource taskCompletionSource, long j10, TaskCompletionSource taskCompletionSource2) {
        super(c1212ax, taskCompletionSource);
        this.f4653c = c1212ax;
        this.f4651a = j10;
        this.f4652b = taskCompletionSource2;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        C2091c0 c2091c0;
        if (C1212ax.m5134g(this.f4653c)) {
            super.mo5115a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C1212ax c1212ax = this.f4653c;
            ((InterfaceC2118u) c1212ax.f4664a.m8313e()).mo8336W0(C1212ax.m5131b(c1212ax, this.f4651a), new BinderC1210av(this.f4653c, this.f4652b));
        } catch (RemoteException e10) {
            c2091c0 = this.f4653c.f4665b;
            c2091c0.m8292b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f4651a));
            this.f4652b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
