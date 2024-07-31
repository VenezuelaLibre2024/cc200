package p316w2;

import android.content.Context;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p345y.C5782a;

/* renamed from: w2.m */
/* loaded from: classes.dex */
public class C5211m {
    /* renamed from: a */
    public EnumC5212n m21095a(Context context, InterfaceC5101a interfaceC5101a) {
        if (C5782a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return EnumC5212n.precise;
        }
        if (C5782a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return EnumC5212n.reduced;
        }
        interfaceC5101a.mo18816a(EnumC5102b.permissionDenied);
        return null;
    }
}
