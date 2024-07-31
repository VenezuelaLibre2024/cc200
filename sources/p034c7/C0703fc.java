package p034c7;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: c7.fc */
/* loaded from: classes.dex */
public final class C0703fc implements InterfaceC0843pc {

    /* renamed from: a */
    public final /* synthetic */ C0968yb f2941a;

    public C0703fc(C0968yb c0968yb) {
        this.f2941a = c0968yb;
    }

    @Override // p034c7.InterfaceC0843pc
    /* renamed from: a */
    public final void mo3167a(String str, String str2, Bundle bundle) {
        C0767k6 c0767k6;
        C0767k6 c0767k62;
        if (!TextUtils.isEmpty(str)) {
            this.f2941a.zzl().m3152y(new RunnableC0689ec(this, str, str2, bundle));
            return;
        }
        c0767k6 = this.f2941a.f3804l;
        if (c0767k6 != null) {
            c0767k62 = this.f2941a.f3804l;
            c0767k62.zzj().m3914B().m3996b("AppId not known when logging event", str2);
        }
    }
}
