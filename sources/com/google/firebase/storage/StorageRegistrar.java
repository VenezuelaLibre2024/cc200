package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.storage.StorageRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p142j9.C3270h;
import p195n7.C3767g;
import p226p9.C4076g;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4321d;
import p308v7.InterfaceC5140b;
import p337x7.InterfaceC5657b;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    public C5872e0<Executor> blockingExecutor = C5872e0.m23504a(InterfaceC4319b.class, Executor.class);
    public C5872e0<Executor> uiExecutor = C5872e0.m23504a(InterfaceC4321d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C4076g lambda$getComponents$0(InterfaceC5869d interfaceC5869d) {
        return new C4076g((C3767g) interfaceC5869d.get(C3767g.class), interfaceC5869d.mo23494c(InterfaceC5657b.class), interfaceC5869d.mo23494c(InterfaceC5140b.class), (Executor) interfaceC5869d.mo23492a(this.blockingExecutor), (Executor) interfaceC5869d.mo23492a(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(C4076g.class).m23479h(LIBRARY_NAME).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23552k(this.blockingExecutor)).m23473b(C5885q.m23552k(this.uiExecutor)).m23473b(C5885q.m23550i(InterfaceC5657b.class)).m23473b(C5885q.m23550i(InterfaceC5140b.class)).m23477f(new InterfaceC5875g() { // from class: p9.q
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C4076g lambda$getComponents$0;
                lambda$getComponents$0 = StorageRegistrar.this.lambda$getComponents$0(interfaceC5869d);
                return lambda$getComponents$0;
            }
        }).m23475d(), C3270h.m11823b(LIBRARY_NAME, "20.3.0"));
    }
}
