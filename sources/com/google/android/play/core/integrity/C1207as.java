package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097g7.C2091c0;
import p097g7.InterfaceC2118u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.as */
/* loaded from: classes.dex */
public final class C1207as extends AbstractC1211aw {

    /* renamed from: a */
    public final /* synthetic */ String f4654a;

    /* renamed from: b */
    public final /* synthetic */ long f4655b;

    /* renamed from: c */
    public final /* synthetic */ long f4656c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f4657d;

    /* renamed from: e */
    public final /* synthetic */ C1212ax f4658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207as(C1212ax c1212ax, TaskCompletionSource taskCompletionSource, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(c1212ax, taskCompletionSource);
        this.f4658e = c1212ax;
        this.f4654a = str;
        this.f4655b = j10;
        this.f4656c = j11;
        this.f4657d = taskCompletionSource2;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        C2091c0 c2091c0;
        if (C1212ax.m5134g(this.f4658e)) {
            super.mo5115a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C1212ax c1212ax = this.f4658e;
            ((InterfaceC2118u) c1212ax.f4664a.m8313e()).mo8335B0(C1212ax.m5130a(c1212ax, this.f4654a, this.f4655b, this.f4656c), new BinderC1209au(this.f4658e, this.f4657d));
        } catch (RemoteException e10) {
            c2091c0 = this.f4658e.f4665b;
            c2091c0.m8292b(e10, "requestExpressIntegrityToken(%s, %s)", this.f4654a, Long.valueOf(this.f4655b));
            this.f4657d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
