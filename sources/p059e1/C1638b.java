package p059e1;

import androidx.lifecycle.AbstractC0343e0;
import androidx.lifecycle.C0345f0;
import td.C4753m;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C1638b implements C0345f0.b {

    /* renamed from: b */
    public final C1642f<?>[] f6042b;

    public C1638b(C1642f<?>... c1642fArr) {
        C4753m.m18653f(c1642fArr, "initializers");
        this.f6042b = c1642fArr;
    }

    @Override // androidx.lifecycle.C0345f0.b
    /* renamed from: b */
    public <T extends AbstractC0343e0> T mo1782b(Class<T> cls, AbstractC1637a abstractC1637a) {
        C4753m.m18653f(cls, "modelClass");
        C4753m.m18653f(abstractC1637a, "extras");
        T t10 = null;
        for (C1642f<?> c1642f : this.f6042b) {
            if (C4753m.m18648a(c1642f.m6519a(), cls)) {
                Object invoke = c1642f.m6520b().invoke(abstractC1637a);
                t10 = invoke instanceof AbstractC0343e0 ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
