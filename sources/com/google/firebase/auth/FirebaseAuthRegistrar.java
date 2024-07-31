package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.auth.FirebaseAuthRegistrar;
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
import p308v7.InterfaceC5140b;
import p309v8.C5148h;
import p309v8.InterfaceC5149i;
import p337x7.C5677g;
import p337x7.InterfaceC5657b;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(C5872e0 c5872e0, C5872e0 c5872e02, C5872e0 c5872e03, C5872e0 c5872e04, C5872e0 c5872e05, InterfaceC5869d interfaceC5869d) {
        return new C5677g((C3767g) interfaceC5869d.get(C3767g.class), interfaceC5869d.mo23494c(InterfaceC5140b.class), interfaceC5869d.mo23494c(InterfaceC5149i.class), (Executor) interfaceC5869d.mo23492a(c5872e0), (Executor) interfaceC5869d.mo23492a(c5872e02), (Executor) interfaceC5869d.mo23492a(c5872e03), (ScheduledExecutorService) interfaceC5869d.mo23492a(c5872e04), (Executor) interfaceC5869d.mo23492a(c5872e05));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5867c<?>> getComponents() {
        final C5872e0 m23504a = C5872e0.m23504a(InterfaceC4318a.class, Executor.class);
        final C5872e0 m23504a2 = C5872e0.m23504a(InterfaceC4319b.class, Executor.class);
        final C5872e0 m23504a3 = C5872e0.m23504a(InterfaceC4320c.class, Executor.class);
        final C5872e0 m23504a4 = C5872e0.m23504a(InterfaceC4320c.class, ScheduledExecutorService.class);
        final C5872e0 m23504a5 = C5872e0.m23504a(InterfaceC4321d.class, Executor.class);
        return Arrays.asList(C5867c.m23455d(FirebaseAuth.class, InterfaceC5657b.class).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23553l(InterfaceC5149i.class)).m23473b(C5885q.m23552k(m23504a)).m23473b(C5885q.m23552k(m23504a2)).m23473b(C5885q.m23552k(m23504a3)).m23473b(C5885q.m23552k(m23504a4)).m23473b(C5885q.m23552k(m23504a5)).m23473b(C5885q.m23550i(InterfaceC5140b.class)).m23477f(new InterfaceC5875g() { // from class: w7.h1
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(C5872e0.this, m23504a2, m23504a3, m23504a4, m23504a5, interfaceC5869d);
            }
        }).m23475d(), C5148h.m20831a(), C3270h.m11823b("fire-auth", "22.3.1"));
    }
}
