package p079f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p079f6.InterfaceC1853m;

/* renamed from: f6.v */
/* loaded from: classes.dex */
public final class C1862v<R extends InterfaceC1853m> extends BasePendingResult<R> {

    /* renamed from: a */
    public final InterfaceC1853m f7042a;

    public C1862v(AbstractC1846f abstractC1846f, InterfaceC1853m interfaceC1853m) {
        super(abstractC1846f);
        this.f7042a = interfaceC1853m;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.f7042a;
    }
}
