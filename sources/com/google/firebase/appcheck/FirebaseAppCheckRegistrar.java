package com.google.firebase.appcheck;

import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p142j9.C3270h;
import p195n7.C3767g;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p253r7.InterfaceC4321d;
import p268s7.AbstractC4548d;
import p279t7.C4717h;
import p308v7.InterfaceC5140b;
import p309v8.C5148h;
import p309v8.InterfaceC5149i;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ AbstractC4548d m5178b(C5872e0 c5872e0, C5872e0 c5872e02, C5872e0 c5872e03, C5872e0 c5872e04, InterfaceC5869d interfaceC5869d) {
        return new C4717h((C3767g) interfaceC5869d.get(C3767g.class), interfaceC5869d.mo23494c(InterfaceC5149i.class), (Executor) interfaceC5869d.mo23492a(c5872e0), (Executor) interfaceC5869d.mo23492a(c5872e02), (Executor) interfaceC5869d.mo23492a(c5872e03), (ScheduledExecutorService) interfaceC5869d.mo23492a(c5872e04));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        final C5872e0 m23504a = C5872e0.m23504a(InterfaceC4321d.class, Executor.class);
        final C5872e0 m23504a2 = C5872e0.m23504a(InterfaceC4320c.class, Executor.class);
        final C5872e0 m23504a3 = C5872e0.m23504a(InterfaceC4318a.class, Executor.class);
        final C5872e0 m23504a4 = C5872e0.m23504a(InterfaceC4319b.class, ScheduledExecutorService.class);
        return Arrays.asList(C5867c.m23455d(AbstractC4548d.class, InterfaceC5140b.class).m23479h("fire-app-check").m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23552k(m23504a)).m23473b(C5885q.m23552k(m23504a2)).m23473b(C5885q.m23552k(m23504a3)).m23473b(C5885q.m23552k(m23504a4)).m23473b(C5885q.m23550i(InterfaceC5149i.class)).m23477f(new InterfaceC5875g() { // from class: s7.e
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                AbstractC4548d m5178b;
                m5178b = FirebaseAppCheckRegistrar.m5178b(C5872e0.this, m23504a2, m23504a3, m23504a4, interfaceC5869d);
                return m5178b;
            }
        }).m23474c().m23475d(), C5148h.m20831a(), C3270h.m11823b("fire-app-check", "17.1.2"));
    }
}
