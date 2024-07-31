package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p142j9.C3270h;
import p195n7.C3767g;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p309v8.C5148h;
import p309v8.InterfaceC5149i;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p368z7.C6075y;
import p369z8.C6083g;
import p369z8.InterfaceC6084h;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6084h lambda$getComponents$0(InterfaceC5869d interfaceC5869d) {
        return new C6083g((C3767g) interfaceC5869d.get(C3767g.class), interfaceC5869d.mo23494c(InterfaceC5149i.class), (ExecutorService) interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4318a.class, ExecutorService.class)), C6075y.m24292b((Executor) interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4319b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(InterfaceC6084h.class).m23479h(LIBRARY_NAME).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23550i(InterfaceC5149i.class)).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4318a.class, ExecutorService.class))).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4319b.class, Executor.class))).m23477f(new InterfaceC5875g() { // from class: z8.j
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC6084h lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC5869d);
                return lambda$getComponents$0;
            }
        }).m23475d(), C5148h.m20831a(), C3270h.m11823b(LIBRARY_NAME, "17.2.0"));
    }
}
