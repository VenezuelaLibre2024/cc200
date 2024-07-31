package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0350i {

    /* renamed from: h */
    public final /* synthetic */ String f1337h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC0293c0 f1338i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC0344f f1339j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC0326x f1340k;

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        Map map;
        Map map2;
        if (aVar == AbstractC0344f.a.ON_START) {
            map2 = this.f1340k.f1614k;
            Bundle bundle = (Bundle) map2.get(this.f1337h);
            if (bundle != null) {
                this.f1338i.m1397a(this.f1337h, bundle);
                this.f1340k.m1728u(this.f1337h);
            }
        }
        if (aVar == AbstractC0344f.a.ON_DESTROY) {
            this.f1339j.mo1802c(this);
            map = this.f1340k.f1615l;
            map.remove(this.f1337h);
        }
    }
}
