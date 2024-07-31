package p121i2;

import android.content.Context;
import android.os.Build;
import p029c2.AbstractC0592j;
import p029c2.EnumC0593k;
import p104h2.C2283b;
import p135j2.C3215g;
import p165l2.C3420p;
import p203o2.InterfaceC3840a;

/* renamed from: i2.e */
/* loaded from: classes.dex */
public class C2584e extends AbstractC2582c<C2283b> {

    /* renamed from: e */
    public static final String f10143e = AbstractC0592j.m2972f("NetworkMeteredCtrlr");

    public C2584e(Context context, InterfaceC3840a interfaceC3840a) {
        super(C3215g.m11441c(context, interfaceC3840a).m11444d());
    }

    @Override // p121i2.AbstractC2582c
    /* renamed from: b */
    public boolean mo10337b(C3420p c3420p) {
        return c3420p.f12019j.m2937b() == EnumC0593k.METERED;
    }

    @Override // p121i2.AbstractC2582c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo10338c(C2283b c2283b) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (c2283b.m9285a() && c2283b.m9286b()) ? false : true;
        }
        AbstractC0592j.m2970c().mo2973a(f10143e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c2283b.m9285a();
    }
}
