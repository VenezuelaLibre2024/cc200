package p087fe;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import p038ce.C1101t0;
import p038ce.InterfaceC1026c2;
import p116he.C2536k0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4585q;
import td.C4753m;
import td.C4763w;

/* renamed from: fe.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1912h {

    /* renamed from: fe.h$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC1906b<T> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC1906b f7223h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4585q f7224i;

        @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m12917f = "Errors.kt", m12918l = {C1417R.styleable.AppCompatTheme_tooltipForegroundColor, C1417R.styleable.AppCompatTheme_tooltipFrameBackground}, m12919m = "collect")
        /* renamed from: fe.h$a$a */
        /* loaded from: classes2.dex */
        public static final class C6163a extends AbstractC3470d {

            /* renamed from: h */
            public /* synthetic */ Object f7225h;

            /* renamed from: i */
            public int f7226i;

            /* renamed from: k */
            public Object f7228k;

            /* renamed from: l */
            public Object f7229l;

            public C6163a(InterfaceC3281d interfaceC3281d) {
                super(interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                this.f7225h = obj;
                this.f7226i |= Integer.MIN_VALUE;
                return a.this.mo7781a(null, this);
            }
        }

        public a(InterfaceC1906b interfaceC1906b, InterfaceC4585q interfaceC4585q) {
            this.f7223h = interfaceC1906b;
            this.f7224i = interfaceC4585q;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // p087fe.InterfaceC1906b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo7781a(p087fe.InterfaceC1907c<? super T> r6, p146jd.InterfaceC3281d<? super gd.C2245s> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p087fe.C1912h.a.C6163a
                if (r0 == 0) goto L13
                r0 = r7
                fe.h$a$a r0 = (p087fe.C1912h.a.C6163a) r0
                int r1 = r0.f7226i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7226i = r1
                goto L18
            L13:
                fe.h$a$a r0 = new fe.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7225h
                java.lang.Object r1 = p161kd.C3385c.m12581c()
                int r2 = r0.f7226i
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gd.C2238l.m8975b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f7229l
                fe.c r6 = (p087fe.InterfaceC1907c) r6
                java.lang.Object r2 = r0.f7228k
                fe.h$a r2 = (p087fe.C1912h.a) r2
                gd.C2238l.m8975b(r7)
                goto L53
            L40:
                gd.C2238l.m8975b(r7)
                fe.b r7 = r5.f7223h
                r0.f7228k = r5
                r0.f7229l = r6
                r0.f7226i = r4
                java.lang.Object r7 = p087fe.C1908d.m7784b(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                sd.q r2 = r2.f7224i
                r4 = 0
                r0.f7228k = r4
                r0.f7229l = r4
                r0.f7226i = r3
                r3 = 6
                td.C4752l.m18647a(r3)
                java.lang.Object r6 = r2.mo7159b(r6, r7, r0)
                r7 = 7
                td.C4752l.m18647a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                gd.s r6 = gd.C2245s.f8873a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p087fe.C1912h.a.mo7781a(fe.c, jd.d):java.lang.Object");
        }
    }

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m12917f = "Errors.kt", m12918l = {156}, m12919m = "catchImpl")
    /* renamed from: fe.h$b */
    /* loaded from: classes2.dex */
    public static final class b<T> extends AbstractC3470d {

        /* renamed from: h */
        public Object f7230h;

        /* renamed from: i */
        public /* synthetic */ Object f7231i;

        /* renamed from: j */
        public int f7232j;

        public b(InterfaceC3281d<? super b> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f7231i = obj;
            this.f7232j |= Integer.MIN_VALUE;
            return C1908d.m7784b(null, null, this);
        }
    }

    /* renamed from: fe.h$c */
    /* loaded from: classes2.dex */
    public static final class c<T> implements InterfaceC1907c {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC1907c<T> f7233h;

        /* renamed from: i */
        public final /* synthetic */ C4763w<Throwable> f7234i;

        @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m12917f = "Errors.kt", m12918l = {158}, m12919m = "emit")
        /* renamed from: fe.h$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC3470d {

            /* renamed from: h */
            public Object f7235h;

            /* renamed from: i */
            public /* synthetic */ Object f7236i;

            /* renamed from: j */
            public final /* synthetic */ c<T> f7237j;

            /* renamed from: k */
            public int f7238k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, InterfaceC3281d<? super a> interfaceC3281d) {
                super(interfaceC3281d);
                this.f7237j = cVar;
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                this.f7236i = obj;
                this.f7238k |= Integer.MIN_VALUE;
                return this.f7237j.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC1907c<? super T> interfaceC1907c, C4763w<Throwable> c4763w) {
            this.f7233h = interfaceC1907c;
            this.f7234i = c4763w;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // p087fe.InterfaceC1907c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p146jd.InterfaceC3281d<? super gd.C2245s> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p087fe.C1912h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                fe.h$c$a r0 = (p087fe.C1912h.c.a) r0
                int r1 = r0.f7238k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7238k = r1
                goto L18
            L13:
                fe.h$c$a r0 = new fe.h$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f7236i
                java.lang.Object r1 = p161kd.C3385c.m12581c()
                int r2 = r0.f7238k
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f7235h
                fe.h$c r5 = (p087fe.C1912h.c) r5
                gd.C2238l.m8975b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                gd.C2238l.m8975b(r6)
                fe.c<T> r6 = r4.f7233h     // Catch: java.lang.Throwable -> L4a
                r0.f7235h = r4     // Catch: java.lang.Throwable -> L4a
                r0.f7238k = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                gd.s r5 = gd.C2245s.f8873a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                td.w<java.lang.Throwable> r5 = r5.f7234i
                r5.f17731h = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p087fe.C1912h.c.emit(java.lang.Object, jd.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC1906b<T> m7793a(InterfaceC1906b<? extends T> interfaceC1906b, InterfaceC4585q<? super InterfaceC1907c<? super T>, ? super Throwable, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4585q) {
        return new a(interfaceC1906b, interfaceC4585q);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m7794b(p087fe.InterfaceC1906b<? extends T> r4, p087fe.InterfaceC1907c<? super T> r5, p146jd.InterfaceC3281d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof p087fe.C1912h.b
            if (r0 == 0) goto L13
            r0 = r6
            fe.h$b r0 = (p087fe.C1912h.b) r0
            int r1 = r0.f7232j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7232j = r1
            goto L18
        L13:
            fe.h$b r0 = new fe.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7231i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f7232j
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f7230h
            td.w r4 = (td.C4763w) r4
            gd.C2238l.m8975b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            gd.C2238l.m8975b(r6)
            td.w r6 = new td.w
            r6.<init>()
            fe.h$c r2 = new fe.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f7230h = r6     // Catch: java.lang.Throwable -> L51
            r0.f7232j = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.mo7781a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f17731h
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m7796d(r5, r4)
            if (r6 != 0) goto L76
            jd.g r6 = r0.getContext()
            boolean r6 = m7795c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            gd.C2227a.m8956a(r4, r5)
            throw r4
        L72:
            gd.C2227a.m8956a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p087fe.C1912h.m7794b(fe.b, fe.c, jd.d):java.lang.Object");
    }

    /* renamed from: c */
    public static final boolean m7795c(Throwable th, InterfaceC3284g interfaceC3284g) {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 == null || !interfaceC1026c2.isCancelled()) {
            return false;
        }
        return m7796d(th, interfaceC1026c2.mo4273K());
    }

    /* renamed from: d */
    public static final boolean m7796d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (C1101t0.m4576d()) {
                th2 = C2536k0.m10101l(th2);
            }
            if (C1101t0.m4576d()) {
                th = C2536k0.m10101l(th);
            }
            if (C4753m.m18648a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
