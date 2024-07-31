package p021b6;

import com.google.android.gms.common.api.Status;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;

/* renamed from: b6.m */
/* loaded from: classes.dex */
public final class C0494m extends AbstractC0497p {
    public C0494m(AbstractC1846f abstractC1846f) {
        super(abstractC1846f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC1853m createFailedResult(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        C0490i c0490i = (C0490i) bVar;
        ((C0504w) c0490i.getService()).m2452e(new BinderC0493l(this), c0490i.m2434c());
    }
}
