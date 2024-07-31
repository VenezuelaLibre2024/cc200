package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p045d3.InterfaceC1537i;
import p061e3.C1645a;
import p093g3.C1983u;
import p142j9.C3270h;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1537i lambda$getComponents$0(InterfaceC5869d interfaceC5869d) {
        C1983u.m8008f((Context) interfaceC5869d.get(Context.class));
        return C1983u.m8006c().m8011g(C1645a.f6067h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(InterfaceC1537i.class).m23479h(LIBRARY_NAME).m23473b(C5885q.m23551j(Context.class)).m23477f(new InterfaceC5875g() { // from class: n8.a
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC1537i lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC5869d);
                return lambda$getComponents$0;
            }
        }).m23475d(), C3270h.m11823b(LIBRARY_NAME, "18.1.8"));
    }
}
