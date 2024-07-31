package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import p038ce.AbstractC1064k0;
import p045d3.InterfaceC1537i;
import p115hd.C2502n;
import p142j9.C3270h;
import p146jd.InterfaceC3284g;
import p185m9.C3560c0;
import p185m9.C3562d0;
import p185m9.C3567g;
import p185m9.C3570h0;
import p185m9.C3575k;
import p185m9.C3576k0;
import p185m9.C3589x;
import p185m9.InterfaceC3558b0;
import p185m9.InterfaceC3568g0;
import p185m9.InterfaceC3588w;
import p195n7.C3767g;
import p210o9.C3961f;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p354y8.InterfaceC5896b;
import p369z8.InterfaceC6084h;
import td.C4747g;
import td.C4753m;

@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C1290a Companion = new C1290a(null);

    @Deprecated
    private static final C5872e0<C3767g> firebaseApp = C5872e0.m23505b(C3767g.class);

    @Deprecated
    private static final C5872e0<InterfaceC6084h> firebaseInstallationsApi = C5872e0.m23505b(InterfaceC6084h.class);

    @Deprecated
    private static final C5872e0<AbstractC1064k0> backgroundDispatcher = C5872e0.m23504a(InterfaceC4318a.class, AbstractC1064k0.class);

    @Deprecated
    private static final C5872e0<AbstractC1064k0> blockingDispatcher = C5872e0.m23504a(InterfaceC4319b.class, AbstractC1064k0.class);

    @Deprecated
    private static final C5872e0<InterfaceC1537i> transportFactory = C5872e0.m23505b(InterfaceC1537i.class);

    @Deprecated
    private static final C5872e0<C3961f> sessionsSettings = C5872e0.m23505b(C3961f.class);

    /* renamed from: com.google.firebase.sessions.FirebaseSessionsRegistrar$a */
    /* loaded from: classes.dex */
    public static final class C1290a {
        public C1290a() {
        }

        public /* synthetic */ C1290a(C4747g c4747g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final C3575k m24461getComponents$lambda0(InterfaceC5869d interfaceC5869d) {
        Object mo23492a = interfaceC5869d.mo23492a(firebaseApp);
        C4753m.m18652e(mo23492a, "container[firebaseApp]");
        Object mo23492a2 = interfaceC5869d.mo23492a(sessionsSettings);
        C4753m.m18652e(mo23492a2, "container[sessionsSettings]");
        Object mo23492a3 = interfaceC5869d.mo23492a(backgroundDispatcher);
        C4753m.m18652e(mo23492a3, "container[backgroundDispatcher]");
        return new C3575k((C3767g) mo23492a, (C3961f) mo23492a2, (InterfaceC3284g) mo23492a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final C3562d0 m24462getComponents$lambda1(InterfaceC5869d interfaceC5869d) {
        return new C3562d0(C3576k0.f12587a, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final InterfaceC3558b0 m24463getComponents$lambda2(InterfaceC5869d interfaceC5869d) {
        Object mo23492a = interfaceC5869d.mo23492a(firebaseApp);
        C4753m.m18652e(mo23492a, "container[firebaseApp]");
        C3767g c3767g = (C3767g) mo23492a;
        Object mo23492a2 = interfaceC5869d.mo23492a(firebaseInstallationsApi);
        C4753m.m18652e(mo23492a2, "container[firebaseInstallationsApi]");
        InterfaceC6084h interfaceC6084h = (InterfaceC6084h) mo23492a2;
        Object mo23492a3 = interfaceC5869d.mo23492a(sessionsSettings);
        C4753m.m18652e(mo23492a3, "container[sessionsSettings]");
        C3961f c3961f = (C3961f) mo23492a3;
        InterfaceC5896b mo23493b = interfaceC5869d.mo23493b(transportFactory);
        C4753m.m18652e(mo23493b, "container.getProvider(transportFactory)");
        C3567g c3567g = new C3567g(mo23493b);
        Object mo23492a4 = interfaceC5869d.mo23492a(backgroundDispatcher);
        C4753m.m18652e(mo23492a4, "container[backgroundDispatcher]");
        return new C3560c0(c3767g, interfaceC6084h, c3961f, c3567g, (InterfaceC3284g) mo23492a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final C3961f m24464getComponents$lambda3(InterfaceC5869d interfaceC5869d) {
        Object mo23492a = interfaceC5869d.mo23492a(firebaseApp);
        C4753m.m18652e(mo23492a, "container[firebaseApp]");
        Object mo23492a2 = interfaceC5869d.mo23492a(blockingDispatcher);
        C4753m.m18652e(mo23492a2, "container[blockingDispatcher]");
        Object mo23492a3 = interfaceC5869d.mo23492a(backgroundDispatcher);
        C4753m.m18652e(mo23492a3, "container[backgroundDispatcher]");
        Object mo23492a4 = interfaceC5869d.mo23492a(firebaseInstallationsApi);
        C4753m.m18652e(mo23492a4, "container[firebaseInstallationsApi]");
        return new C3961f((C3767g) mo23492a, (InterfaceC3284g) mo23492a2, (InterfaceC3284g) mo23492a3, (InterfaceC6084h) mo23492a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final InterfaceC3588w m24465getComponents$lambda4(InterfaceC5869d interfaceC5869d) {
        Context m14349m = ((C3767g) interfaceC5869d.mo23492a(firebaseApp)).m14349m();
        C4753m.m18652e(m14349m, "container[firebaseApp].applicationContext");
        Object mo23492a = interfaceC5869d.mo23492a(backgroundDispatcher);
        C4753m.m18652e(mo23492a, "container[backgroundDispatcher]");
        return new C3589x(m14349m, (InterfaceC3284g) mo23492a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final InterfaceC3568g0 m24466getComponents$lambda5(InterfaceC5869d interfaceC5869d) {
        Object mo23492a = interfaceC5869d.mo23492a(firebaseApp);
        C4753m.m18652e(mo23492a, "container[firebaseApp]");
        return new C3570h0((C3767g) mo23492a);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<? extends Object>> getComponents() {
        C5867c.b m23479h = C5867c.m23454c(C3575k.class).m23479h(LIBRARY_NAME);
        C5872e0<C3767g> c5872e0 = firebaseApp;
        C5867c.b m23473b = m23479h.m23473b(C5885q.m23552k(c5872e0));
        C5872e0<C3961f> c5872e02 = sessionsSettings;
        C5867c.b m23473b2 = m23473b.m23473b(C5885q.m23552k(c5872e02));
        C5872e0<AbstractC1064k0> c5872e03 = backgroundDispatcher;
        C5867c.b m23473b3 = C5867c.m23454c(InterfaceC3558b0.class).m23479h("session-publisher").m23473b(C5885q.m23552k(c5872e0));
        C5872e0<InterfaceC6084h> c5872e04 = firebaseInstallationsApi;
        return C2502n.m9991g(m23473b2.m23473b(C5885q.m23552k(c5872e03)).m23477f(new InterfaceC5875g() { // from class: m9.q
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C3575k m24461getComponents$lambda0;
                m24461getComponents$lambda0 = FirebaseSessionsRegistrar.m24461getComponents$lambda0(interfaceC5869d);
                return m24461getComponents$lambda0;
            }
        }).m23476e().m23475d(), C5867c.m23454c(C3562d0.class).m23479h("session-generator").m23477f(new InterfaceC5875g() { // from class: m9.n
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C3562d0 m24462getComponents$lambda1;
                m24462getComponents$lambda1 = FirebaseSessionsRegistrar.m24462getComponents$lambda1(interfaceC5869d);
                return m24462getComponents$lambda1;
            }
        }).m23475d(), m23473b3.m23473b(C5885q.m23552k(c5872e04)).m23473b(C5885q.m23552k(c5872e02)).m23473b(C5885q.m23554m(transportFactory)).m23473b(C5885q.m23552k(c5872e03)).m23477f(new InterfaceC5875g() { // from class: m9.p
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC3558b0 m24463getComponents$lambda2;
                m24463getComponents$lambda2 = FirebaseSessionsRegistrar.m24463getComponents$lambda2(interfaceC5869d);
                return m24463getComponents$lambda2;
            }
        }).m23475d(), C5867c.m23454c(C3961f.class).m23479h("sessions-settings").m23473b(C5885q.m23552k(c5872e0)).m23473b(C5885q.m23552k(blockingDispatcher)).m23473b(C5885q.m23552k(c5872e03)).m23473b(C5885q.m23552k(c5872e04)).m23477f(new InterfaceC5875g() { // from class: m9.r
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                C3961f m24464getComponents$lambda3;
                m24464getComponents$lambda3 = FirebaseSessionsRegistrar.m24464getComponents$lambda3(interfaceC5869d);
                return m24464getComponents$lambda3;
            }
        }).m23475d(), C5867c.m23454c(InterfaceC3588w.class).m23479h("sessions-datastore").m23473b(C5885q.m23552k(c5872e0)).m23473b(C5885q.m23552k(c5872e03)).m23477f(new InterfaceC5875g() { // from class: m9.o
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC3588w m24465getComponents$lambda4;
                m24465getComponents$lambda4 = FirebaseSessionsRegistrar.m24465getComponents$lambda4(interfaceC5869d);
                return m24465getComponents$lambda4;
            }
        }).m23475d(), C5867c.m23454c(InterfaceC3568g0.class).m23479h("sessions-service-binder").m23473b(C5885q.m23552k(c5872e0)).m23477f(new InterfaceC5875g() { // from class: m9.m
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC3568g0 m24466getComponents$lambda5;
                m24466getComponents$lambda5 = FirebaseSessionsRegistrar.m24466getComponents$lambda5(interfaceC5869d);
                return m24466getComponents$lambda5;
            }
        }).m23475d(), C3270h.m11823b(LIBRARY_NAME, "1.2.1"));
    }
}
