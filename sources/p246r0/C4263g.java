package p246r0;

import java.io.File;
import java.util.List;
import p038ce.InterfaceC1085p0;
import p115hd.C2501m;
import p261s0.C4385a;
import p261s0.C4386b;
import sd.InterfaceC4569a;
import td.C4753m;

/* renamed from: r0.g */
/* loaded from: classes.dex */
public final class C4263g {

    /* renamed from: a */
    public static final C4263g f15413a = new C4263g();

    /* renamed from: a */
    public final <T> InterfaceC4262f<T> m16351a(InterfaceC4267k<T> interfaceC4267k, C4386b<T> c4386b, List<? extends InterfaceC4260d<T>> list, InterfaceC1085p0 interfaceC1085p0, InterfaceC4569a<? extends File> interfaceC4569a) {
        C4753m.m18653f(interfaceC4267k, "serializer");
        C4753m.m18653f(list, "migrations");
        C4753m.m18653f(interfaceC1085p0, "scope");
        C4753m.m18653f(interfaceC4569a, "produceFile");
        if (c4386b == null) {
            c4386b = (C4386b<T>) new C4385a();
        }
        return new C4269m(interfaceC4569a, interfaceC4267k, C2501m.m9986b(C4261e.f15395a.m16345b(list)), c4386b, interfaceC1085p0);
    }
}
