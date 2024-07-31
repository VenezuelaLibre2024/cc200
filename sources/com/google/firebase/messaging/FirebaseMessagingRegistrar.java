package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
import p045d3.InterfaceC1537i;
import p142j9.C3270h;
import p142j9.InterfaceC3271i;
import p195n7.C3767g;
import p294u8.InterfaceC4993d;
import p309v8.InterfaceC5150j;
import p338x8.InterfaceC5739a;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p369z8.InterfaceC6084h;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC5869d interfaceC5869d) {
        return new FirebaseMessaging((C3767g) interfaceC5869d.get(C3767g.class), (InterfaceC5739a) interfaceC5869d.get(InterfaceC5739a.class), interfaceC5869d.mo23494c(InterfaceC3271i.class), interfaceC5869d.mo23494c(InterfaceC5150j.class), (InterfaceC6084h) interfaceC5869d.get(InterfaceC6084h.class), (InterfaceC1537i) interfaceC5869d.get(InterfaceC1537i.class), (InterfaceC4993d) interfaceC5869d.get(InterfaceC4993d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5867c<?>> getComponents() {
        return Arrays.asList(C5867c.m23454c(FirebaseMessaging.class).m23479h(LIBRARY_NAME).m23473b(C5885q.m23551j(C3767g.class)).m23473b(C5885q.m23549h(InterfaceC5739a.class)).m23473b(C5885q.m23550i(InterfaceC3271i.class)).m23473b(C5885q.m23550i(InterfaceC5150j.class)).m23473b(C5885q.m23549h(InterfaceC1537i.class)).m23473b(C5885q.m23551j(InterfaceC6084h.class)).m23473b(C5885q.m23551j(InterfaceC4993d.class)).m23477f(new InterfaceC5875g() { // from class: g9.b0
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC5869d);
                return lambda$getComponents$0;
            }
        }).m23474c().m23475d(), C3270h.m11823b(LIBRARY_NAME, "23.4.1"));
    }
}
