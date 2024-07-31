package p121i2;

import android.content.Context;
import android.os.Build;
import p029c2.EnumC0593k;
import p104h2.C2283b;
import p135j2.C3215g;
import p165l2.C3420p;
import p203o2.InterfaceC3840a;

/* renamed from: i2.d */
/* loaded from: classes.dex */
public class C2583d extends AbstractC2582c<C2283b> {
    public C2583d(Context context, InterfaceC3840a interfaceC3840a) {
        super(C3215g.m11441c(context, interfaceC3840a).m11444d());
    }

    @Override // p121i2.AbstractC2582c
    /* renamed from: b */
    public boolean mo10337b(C3420p c3420p) {
        return c3420p.f12019j.m2937b() == EnumC0593k.CONNECTED;
    }

    @Override // p121i2.AbstractC2582c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo10338c(C2283b c2283b) {
        return Build.VERSION.SDK_INT >= 26 ? (c2283b.m9285a() && c2283b.m9288d()) ? false : true : !c2283b.m9285a();
    }
}
