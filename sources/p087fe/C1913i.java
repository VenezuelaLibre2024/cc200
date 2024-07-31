package p087fe;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4584p;
import td.C4761u;

/* renamed from: fe.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1913i {

    /* renamed from: fe.i$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC1906b<T> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC1906b f7239h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4584p f7240i;

        public a(InterfaceC1906b interfaceC1906b, InterfaceC4584p interfaceC4584p) {
            this.f7239h = interfaceC1906b;
            this.f7240i = interfaceC4584p;
        }

        @Override // p087fe.InterfaceC1906b
        /* renamed from: a */
        public Object mo7781a(InterfaceC1907c<? super T> interfaceC1907c, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            Object mo7781a = this.f7239h.mo7781a(new b(new C4761u(), interfaceC1907c, this.f7240i), interfaceC3281d);
            return mo7781a == C3385c.m12581c() ? mo7781a : C2245s.f8873a;
        }
    }

    /* renamed from: fe.i$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC1907c {

        /* renamed from: h */
        public final /* synthetic */ C4761u f7241h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC1907c<T> f7242i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4584p<T, InterfaceC3281d<? super Boolean>, Object> f7243j;

        @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m12917f = "Limit.kt", m12918l = {C1417R.styleable.AppCompatTheme_alertDialogStyle, C1417R.styleable.AppCompatTheme_alertDialogTheme, 40}, m12919m = "emit")
        /* renamed from: fe.i$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC3470d {

            /* renamed from: h */
            public Object f7244h;

            /* renamed from: i */
            public Object f7245i;

            /* renamed from: j */
            public /* synthetic */ Object f7246j;

            /* renamed from: k */
            public final /* synthetic */ b<T> f7247k;

            /* renamed from: l */
            public int f7248l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, InterfaceC3281d<? super a> interfaceC3281d) {
                super(interfaceC3281d);
                this.f7247k = bVar;
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                this.f7246j = obj;
                this.f7248l |= Integer.MIN_VALUE;
                return this.f7247k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(C4761u c4761u, InterfaceC1907c<? super T> interfaceC1907c, InterfaceC4584p<? super T, ? super InterfaceC3281d<? super Boolean>, ? extends Object> interfaceC4584p) {
            this.f7241h = c4761u;
            this.f7242i = interfaceC1907c;
            this.f7243j = interfaceC4584p;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // p087fe.InterfaceC1907c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, p146jd.InterfaceC3281d<? super gd.C2245s> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p087fe.C1913i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                fe.i$b$a r0 = (p087fe.C1913i.b.a) r0
                int r1 = r0.f7248l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7248l = r1
                goto L18
            L13:
                fe.i$b$a r0 = new fe.i$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f7246j
                java.lang.Object r1 = p161kd.C3385c.m12581c()
                int r2 = r0.f7248l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                gd.C2238l.m8975b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f7245i
                java.lang.Object r2 = r0.f7244h
                fe.i$b r2 = (p087fe.C1913i.b) r2
                gd.C2238l.m8975b(r8)
                goto L6c
            L41:
                gd.C2238l.m8975b(r8)
                goto L59
            L45:
                gd.C2238l.m8975b(r8)
                td.u r8 = r6.f7241h
                boolean r8 = r8.f17729h
                if (r8 == 0) goto L5c
                fe.c<T> r8 = r6.f7242i
                r0.f7248l = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                gd.s r7 = gd.C2245s.f8873a
                return r7
            L5c:
                sd.p<T, jd.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f7243j
                r0.f7244h = r6
                r0.f7245i = r7
                r0.f7248l = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                td.u r8 = r2.f7241h
                r8.f17729h = r5
                fe.c<T> r8 = r2.f7242i
                r2 = 0
                r0.f7244h = r2
                r0.f7245i = r2
                r0.f7248l = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                gd.s r7 = gd.C2245s.f8873a
                return r7
            L8b:
                gd.s r7 = gd.C2245s.f8873a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p087fe.C1913i.b.emit(java.lang.Object, jd.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC1906b<T> m7797a(InterfaceC1906b<? extends T> interfaceC1906b, InterfaceC4584p<? super T, ? super InterfaceC3281d<? super Boolean>, ? extends Object> interfaceC4584p) {
        return new a(interfaceC1906b, interfaceC4584p);
    }
}
