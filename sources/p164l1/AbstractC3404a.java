package p164l1;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import gd.C2238l;
import gd.C2245s;
import p038ce.C1045g1;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p038ce.InterfaceC1117x0;
import p146jd.InterfaceC3281d;
import p149k1.C3345b;
import p161kd.C3385c;
import p170l7.InterfaceFutureC3445f;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p177m1.AbstractC3497b;
import p177m1.C3496a;
import p177m1.C3498c;
import p177m1.C3499d;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public abstract class AbstractC3404a {

    /* renamed from: a */
    public static final b f11957a = new b(null);

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3404a {

        /* renamed from: b */
        public final AbstractC3497b f11958b;

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {122}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6192a extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f11959h;

            /* renamed from: j */
            public final /* synthetic */ C3496a f11961j;

            public C6192a(C3496a c3496a, InterfaceC3281d<? super C6192a> interfaceC3281d) {
                super(2, interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new C6192a(this.f11961j, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((C6192a) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11959h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    C3496a c3496a = this.f11961j;
                    this.f11959h = 1;
                    if (abstractC3497b.mo13012a(c3496a, this) == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return C2245s.f8873a;
            }
        }

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {169}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super Integer>, Object> {

            /* renamed from: h */
            public int f11962h;

            public b(InterfaceC3281d<? super b> interfaceC3281d) {
                super(2, interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new b(interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super Integer> interfaceC3281d) {
                return ((b) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11962h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    this.f11962h = 1;
                    obj = abstractC3497b.mo13013b(this);
                    if (obj == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return obj;
            }
        }

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {133}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f11964h;

            /* renamed from: j */
            public final /* synthetic */ Uri f11966j;

            /* renamed from: k */
            public final /* synthetic */ InputEvent f11967k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, InterfaceC3281d<? super c> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f11966j = uri;
                this.f11967k = inputEvent;
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new c(this.f11966j, this.f11967k, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((c) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11964h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    Uri uri = this.f11966j;
                    InputEvent inputEvent = this.f11967k;
                    this.f11964h = 1;
                    if (abstractC3497b.mo13014c(uri, inputEvent, this) == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return C2245s.f8873a;
            }
        }

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {141}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$d */
        /* loaded from: classes.dex */
        public static final class d extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f11968h;

            /* renamed from: j */
            public final /* synthetic */ Uri f11970j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, InterfaceC3281d<? super d> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f11970j = uri;
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new d(this.f11970j, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((d) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11968h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    Uri uri = this.f11970j;
                    this.f11968h = 1;
                    if (abstractC3497b.mo13015d(uri, this) == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return C2245s.f8873a;
            }
        }

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {151}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$e */
        /* loaded from: classes.dex */
        public static final class e extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f11971h;

            /* renamed from: j */
            public final /* synthetic */ C3498c f11973j;

            public e(C3498c c3498c, InterfaceC3281d<? super e> interfaceC3281d) {
                super(2, interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new e(this.f11973j, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((e) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11971h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    C3498c c3498c = this.f11973j;
                    this.f11971h = 1;
                    if (abstractC3497b.mo13016e(c3498c, this) == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return C2245s.f8873a;
            }
        }

        @InterfaceC3472f(m12916c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", m12917f = "MeasurementManagerFutures.kt", m12918l = {161}, m12919m = "invokeSuspend")
        /* renamed from: l1.a$a$f */
        /* loaded from: classes.dex */
        public static final class f extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f11974h;

            /* renamed from: j */
            public final /* synthetic */ C3499d f11976j;

            public f(C3499d c3499d, InterfaceC3281d<? super f> interfaceC3281d) {
                super(2, interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                return new f(this.f11976j, interfaceC3281d);
            }

            @Override // sd.InterfaceC4584p
            public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((f) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f11974h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    AbstractC3497b abstractC3497b = a.this.f11958b;
                    C3499d c3499d = this.f11976j;
                    this.f11974h = 1;
                    if (abstractC3497b.mo13017f(c3499d, this) == m12581c) {
                        return m12581c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
                return C2245s.f8873a;
            }
        }

        public a(AbstractC3497b abstractC3497b) {
            C4753m.m18653f(abstractC3497b, "mMeasurementManager");
            this.f11958b = abstractC3497b;
        }

        @Override // p164l1.AbstractC3404a
        /* renamed from: b */
        public InterfaceFutureC3445f<Integer> mo12702b() {
            InterfaceC1117x0 m4455b;
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new b(null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }

        @Override // p164l1.AbstractC3404a
        /* renamed from: c */
        public InterfaceFutureC3445f<C2245s> mo12703c(Uri uri) {
            InterfaceC1117x0 m4455b;
            C4753m.m18653f(uri, "trigger");
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new d(uri, null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }

        /* renamed from: e */
        public InterfaceFutureC3445f<C2245s> m12705e(C3496a c3496a) {
            InterfaceC1117x0 m4455b;
            C4753m.m18653f(c3496a, "deletionRequest");
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new C6192a(c3496a, null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }

        /* renamed from: f */
        public InterfaceFutureC3445f<C2245s> m12706f(Uri uri, InputEvent inputEvent) {
            InterfaceC1117x0 m4455b;
            C4753m.m18653f(uri, "attributionSource");
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new c(uri, inputEvent, null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }

        /* renamed from: g */
        public InterfaceFutureC3445f<C2245s> m12707g(C3498c c3498c) {
            InterfaceC1117x0 m4455b;
            C4753m.m18653f(c3498c, "request");
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new e(c3498c, null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }

        /* renamed from: h */
        public InterfaceFutureC3445f<C2245s> m12708h(C3499d c3499d) {
            InterfaceC1117x0 m4455b;
            C4753m.m18653f(c3499d, "request");
            m4455b = C1063k.m4455b(C1089q0.m4557a(C1045g1.m4326a()), null, null, new f(c3499d, null), 3, null);
            return C3345b.m12400c(m4455b, null, 1, null);
        }
    }

    /* renamed from: l1.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC3404a m12709a(Context context) {
            C4753m.m18653f(context, "context");
            AbstractC3497b m13025a = AbstractC3497b.f12263a.m13025a(context);
            if (m13025a != null) {
                return new a(m13025a);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final AbstractC3404a m12701a(Context context) {
        return f11957a.m12709a(context);
    }

    /* renamed from: b */
    public abstract InterfaceFutureC3445f<Integer> mo12702b();

    /* renamed from: c */
    public abstract InterfaceFutureC3445f<C2245s> mo12703c(Uri uri);
}
