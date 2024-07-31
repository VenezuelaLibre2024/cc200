package p079f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p079f6.InterfaceC1853m;

/* renamed from: f6.w */
/* loaded from: classes.dex */
public final class C1863w<R extends InterfaceC1853m> extends BasePendingResult<R> {
    public C1863w(AbstractC1846f abstractC1846f) {
        super(abstractC1846f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
