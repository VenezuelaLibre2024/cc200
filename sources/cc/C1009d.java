package cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cc.d */
/* loaded from: classes.dex */
public class C1009d implements InterfaceC1010e {

    /* renamed from: a */
    public final List<InterfaceC1010e> f3958a = new ArrayList();

    @Override // cc.InterfaceC1010e
    /* renamed from: a */
    public C1011f mo4243a(C1011f c1011f) {
        Iterator<InterfaceC1010e> it = this.f3958a.iterator();
        while (it.hasNext()) {
            c1011f = it.next().mo4243a(c1011f);
        }
        return c1011f;
    }

    /* renamed from: b */
    public void m4246b(InterfaceC1010e interfaceC1010e) {
        this.f3958a.add(interfaceC1010e);
    }
}
