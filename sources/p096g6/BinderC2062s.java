package p096g6;

import com.google.android.gms.common.api.Status;
import p096g6.InterfaceC2022g;

/* renamed from: g6.s */
/* loaded from: classes.dex */
public class BinderC2062s extends InterfaceC2022g.a {

    /* renamed from: a */
    public final InterfaceC2010d<Status> f8142a;

    public BinderC2062s(InterfaceC2010d<Status> interfaceC2010d) {
        this.f8142a = interfaceC2010d;
    }

    @Override // p096g6.InterfaceC2022g
    public void onResult(Status status) {
        this.f8142a.setResult(status);
    }
}
