package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097g7.AbstractRunnableC2093d0;
import p097g7.C2091c0;
import p097g7.C2094e;
import p097g7.InterfaceC2123z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.ab */
/* loaded from: classes.dex */
public final class C1190ab extends AbstractRunnableC2093d0 {

    /* renamed from: a */
    public final /* synthetic */ byte[] f4624a;

    /* renamed from: b */
    public final /* synthetic */ Long f4625b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f4626c;

    /* renamed from: d */
    public final /* synthetic */ IntegrityTokenRequest f4627d;

    /* renamed from: e */
    public final /* synthetic */ C1192ad f4628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190ab(C1192ad c1192ad, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f4628e = c1192ad;
        this.f4624a = bArr;
        this.f4625b = l10;
        this.f4626c = taskCompletionSource2;
        this.f4627d = integrityTokenRequest;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: a */
    public final void mo5115a(Exception exc) {
        if (exc instanceof C2094e) {
            super.mo5115a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo5115a(exc);
        }
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        C2091c0 c2091c0;
        try {
            ((InterfaceC2123z) this.f4628e.f4632a.m8313e()).mo8338u(C1192ad.m5118a(this.f4628e, this.f4624a, this.f4625b, null), new BinderC1191ac(this.f4628e, this.f4626c));
        } catch (RemoteException e10) {
            c2091c0 = this.f4628e.f4633b;
            c2091c0.m8292b(e10, "requestIntegrityToken(%s)", this.f4627d);
            this.f4626c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
