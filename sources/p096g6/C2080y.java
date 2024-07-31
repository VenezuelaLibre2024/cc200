package p096g6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import p079f6.AbstractC1848h;

/* renamed from: g6.y */
/* loaded from: classes.dex */
public final class C2080y implements AbstractC1848h.a {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f8170a;

    /* renamed from: b */
    public final /* synthetic */ C1999a0 f8171b;

    public C2080y(C1999a0 c1999a0, BasePendingResult basePendingResult) {
        this.f8171b = c1999a0;
        this.f8170a = basePendingResult;
    }

    @Override // p079f6.AbstractC1848h.a
    /* renamed from: a */
    public final void mo7596a(Status status) {
        Map map;
        map = this.f8171b.f7983a;
        map.remove(this.f8170a);
    }
}
