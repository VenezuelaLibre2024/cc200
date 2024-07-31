package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import p010a8.C0077g;
import p023b8.InterfaceC0509a;
import p142j9.C3270h;
import p157k9.InterfaceC3377a;
import p195n7.C3767g;
import p197n9.C3780a;
import p197n9.InterfaceC3781b;
import p224p7.InterfaceC4059a;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p369z8.InterfaceC6084h;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        C3780a.m14380a(InterfaceC3781b.a.CRASHLYTICS);
    }

    /* renamed from: b */
    public final C0077g m5329b(InterfaceC5869d interfaceC5869d) {
        return C0077g.m321e((C3767g) interfaceC5869d.get(C3767g.class), (InterfaceC6084h) interfaceC5869d.get(InterfaceC6084h.class), interfaceC5869d.mo23498g(InterfaceC0509a.class), interfaceC5869d.mo23498g(InterfaceC4059a.class), interfaceC5869d.mo23498g(InterfaceC3377a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(C0077g.class).m23479h("fire-cls").m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23551j(InterfaceC6084h.class)).m23473b(C5885q.m23547a(InterfaceC0509a.class)).m23473b(C5885q.m23547a(InterfaceC4059a.class)).m23473b(C5885q.m23547a(InterfaceC3377a.class)).m23477f(new InterfaceC5875g() { // from class: a8.f
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C0077g m5329b;
                m5329b = CrashlyticsRegistrar.this.m5329b(interfaceC5869d);
                return m5329b;
            }
        }).m23476e().m23475d(), C3270h.m11823b("fire-cls", "18.6.2"));
    }
}
