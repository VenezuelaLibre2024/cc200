package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p038ce.AbstractC1064k0;
import p038ce.C1106u1;
import p115hd.C2502n;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p253r7.InterfaceC4321d;
import p353y7.C5867c;
import p353y7.C5872e0;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import td.C4753m;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$a */
    /* loaded from: classes.dex */
    public static final class C1279a<T> implements InterfaceC5875g {

        /* renamed from: a */
        public static final C1279a<T> f4848a = new C1279a<>();

        @Override // p353y7.InterfaceC5875g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064k0 mo319a(InterfaceC5869d interfaceC5869d) {
            Object mo23492a = interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4318a.class, Executor.class));
            C4753m.m18652e(mo23492a, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C1106u1.m4583a((Executor) mo23492a);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$b */
    /* loaded from: classes.dex */
    public static final class C1280b<T> implements InterfaceC5875g {

        /* renamed from: a */
        public static final C1280b<T> f4849a = new C1280b<>();

        @Override // p353y7.InterfaceC5875g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064k0 mo319a(InterfaceC5869d interfaceC5869d) {
            Object mo23492a = interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4320c.class, Executor.class));
            C4753m.m18652e(mo23492a, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C1106u1.m4583a((Executor) mo23492a);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$c */
    /* loaded from: classes.dex */
    public static final class C1281c<T> implements InterfaceC5875g {

        /* renamed from: a */
        public static final C1281c<T> f4850a = new C1281c<>();

        @Override // p353y7.InterfaceC5875g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064k0 mo319a(InterfaceC5869d interfaceC5869d) {
            Object mo23492a = interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4319b.class, Executor.class));
            C4753m.m18652e(mo23492a, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C1106u1.m4583a((Executor) mo23492a);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$d */
    /* loaded from: classes.dex */
    public static final class C1282d<T> implements InterfaceC5875g {

        /* renamed from: a */
        public static final C1282d<T> f4851a = new C1282d<>();

        @Override // p353y7.InterfaceC5875g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064k0 mo319a(InterfaceC5869d interfaceC5869d) {
            Object mo23492a = interfaceC5869d.mo23492a(C5872e0.m23504a(InterfaceC4321d.class, Executor.class));
            C4753m.m18652e(mo23492a, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C1106u1.m4583a((Executor) mo23492a);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        C5867c m23475d = C5867c.m23456e(C5872e0.m23504a(InterfaceC4318a.class, AbstractC1064k0.class)).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4318a.class, Executor.class))).m23477f(C1279a.f4848a).m23475d();
        C4753m.m18652e(m23475d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5867c m23475d2 = C5867c.m23456e(C5872e0.m23504a(InterfaceC4320c.class, AbstractC1064k0.class)).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4320c.class, Executor.class))).m23477f(C1280b.f4849a).m23475d();
        C4753m.m18652e(m23475d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5867c m23475d3 = C5867c.m23456e(C5872e0.m23504a(InterfaceC4319b.class, AbstractC1064k0.class)).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4319b.class, Executor.class))).m23477f(C1281c.f4850a).m23475d();
        C4753m.m18652e(m23475d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5867c m23475d4 = C5867c.m23456e(C5872e0.m23504a(InterfaceC4321d.class, AbstractC1064k0.class)).m23473b(C5885q.m23552k(C5872e0.m23504a(InterfaceC4321d.class, Executor.class))).m23477f(C1282d.f4851a).m23475d();
        C4753m.m18652e(m23475d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C2502n.m9991g(m23475d, m23475d2, m23475d3, m23475d4);
    }
}
