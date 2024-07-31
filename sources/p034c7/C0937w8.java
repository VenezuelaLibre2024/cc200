package p034c7;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: c7.w8 */
/* loaded from: classes.dex */
public final class C0937w8 implements InterfaceC0843pc {

    /* renamed from: a */
    public final /* synthetic */ C0936w7 f3714a;

    public C0937w8(C0936w7 c0936w7) {
        this.f3714a = c0936w7;
    }

    @Override // p034c7.InterfaceC0843pc
    /* renamed from: a */
    public final void mo3167a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f3714a.m3987w0("auto", str2, bundle);
        } else {
            this.f3714a.m3960U("auto", str2, bundle, str);
        }
    }
}
