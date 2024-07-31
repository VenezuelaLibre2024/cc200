package p059e1;

import androidx.lifecycle.AbstractC0343e0;
import androidx.lifecycle.C0345f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p259rd.C4344a;
import p359yd.InterfaceC5913c;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: e1.c */
/* loaded from: classes.dex */
public final class C1639c {

    /* renamed from: a */
    public final List<C1642f<?>> f6043a = new ArrayList();

    /* renamed from: a */
    public final <T extends AbstractC0343e0> void m6516a(InterfaceC5913c<T> interfaceC5913c, InterfaceC4580l<? super AbstractC1637a, ? extends T> interfaceC4580l) {
        C4753m.m18653f(interfaceC5913c, "clazz");
        C4753m.m18653f(interfaceC4580l, "initializer");
        this.f6043a.add(new C1642f<>(C4344a.m16630a(interfaceC5913c), interfaceC4580l));
    }

    /* renamed from: b */
    public final C0345f0.b m6517b() {
        C1642f[] c1642fArr = (C1642f[]) this.f6043a.toArray(new C1642f[0]);
        return new C1638b((C1642f[]) Arrays.copyOf(c1642fArr, c1642fArr.length));
    }
}
