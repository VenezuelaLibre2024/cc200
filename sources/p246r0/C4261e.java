package p246r0;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import java.util.List;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: r0.e */
/* loaded from: classes.dex */
public final class C4261e<T> {

    /* renamed from: a */
    public static final a f15395a = new a(null);

    /* renamed from: r0.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        @InterfaceC3472f(m12916c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m12917f = "DataMigrationInitializer.kt", m12918l = {C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m12919m = "invokeSuspend")
        /* renamed from: r0.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6202a extends AbstractC3478l implements InterfaceC4584p<InterfaceC4265i<T>, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f15396h;

            /* renamed from: i */
            public /* synthetic */ Object f15397i;

            /* renamed from: j */
            public final /* synthetic */ List<InterfaceC4260d<T>> f15398j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6202a(List<? extends InterfaceC4260d<T>> list, InterfaceC3281d<? super C6202a> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f15398j = list;
            }

            @Override // sd.InterfaceC4584p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4265i<T> interfaceC4265i, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((C6202a) create(interfaceC4265i, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                C6202a c6202a = new C6202a(this.f15398j, interfaceC3281d);
                c6202a.f15397i = obj;
                return c6202a;
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                Object m12581c = C3385c.m12581c();
                int i10 = this.f15396h;
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    InterfaceC4265i interfaceC4265i = (InterfaceC4265i) this.f15397i;
                    a aVar = C4261e.f15395a;
                    List<InterfaceC4260d<T>> list = this.f15398j;
                    this.f15396h = 1;
                    if (aVar.m16346c(list, interfaceC4265i, this) == m12581c) {
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

        @InterfaceC3472f(m12916c = "androidx.datastore.core.DataMigrationInitializer$Companion", m12917f = "DataMigrationInitializer.kt", m12918l = {C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, C1417R.styleable.AppCompatTheme_colorPrimary}, m12919m = "runMigrations")
        /* renamed from: r0.e$a$b */
        /* loaded from: classes.dex */
        public static final class b<T> extends AbstractC3470d {

            /* renamed from: h */
            public Object f15399h;

            /* renamed from: i */
            public Object f15400i;

            /* renamed from: j */
            public /* synthetic */ Object f15401j;

            /* renamed from: l */
            public int f15403l;

            public b(InterfaceC3281d<? super b> interfaceC3281d) {
                super(interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                this.f15401j = obj;
                this.f15403l |= Integer.MIN_VALUE;
                return a.this.m16346c(null, null, this);
            }
        }

        @InterfaceC3472f(m12916c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m12917f = "DataMigrationInitializer.kt", m12918l = {C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle, C1417R.styleable.AppCompatTheme_buttonStyle}, m12919m = "invokeSuspend")
        /* renamed from: r0.e$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC3478l implements InterfaceC4584p<T, InterfaceC3281d<? super T>, Object> {

            /* renamed from: h */
            public Object f15404h;

            /* renamed from: i */
            public Object f15405i;

            /* renamed from: j */
            public Object f15406j;

            /* renamed from: k */
            public int f15407k;

            /* renamed from: l */
            public /* synthetic */ Object f15408l;

            /* renamed from: m */
            public final /* synthetic */ List<InterfaceC4260d<T>> f15409m;

            /* renamed from: n */
            public final /* synthetic */ List<InterfaceC4580l<InterfaceC3281d<? super C2245s>, Object>> f15410n;

            @InterfaceC3472f(m12916c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m12917f = "DataMigrationInitializer.kt", m12918l = {C1417R.styleable.AppCompatTheme_buttonBarStyle}, m12919m = "invokeSuspend")
            /* renamed from: r0.e$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C6203a extends AbstractC3478l implements InterfaceC4580l<InterfaceC3281d<? super C2245s>, Object> {

                /* renamed from: h */
                public int f15411h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC4260d<T> f15412i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6203a(InterfaceC4260d<T> interfaceC4260d, InterfaceC3281d<? super C6203a> interfaceC3281d) {
                    super(1, interfaceC3281d);
                    this.f15412i = interfaceC4260d;
                }

                @Override // sd.InterfaceC4580l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC3281d<? super C2245s> interfaceC3281d) {
                    return ((C6203a) create(interfaceC3281d)).invokeSuspend(C2245s.f8873a);
                }

                @Override // p173ld.AbstractC3467a
                public final InterfaceC3281d<C2245s> create(InterfaceC3281d<?> interfaceC3281d) {
                    return new C6203a(this.f15412i, interfaceC3281d);
                }

                @Override // p173ld.AbstractC3467a
                public final Object invokeSuspend(Object obj) {
                    Object m12581c = C3385c.m12581c();
                    int i10 = this.f15411h;
                    if (i10 == 0) {
                        C2238l.m8975b(obj);
                        InterfaceC4260d<T> interfaceC4260d = this.f15412i;
                        this.f15411h = 1;
                        if (interfaceC4260d.m16343c(this) == m12581c) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends InterfaceC4260d<T>> list, List<InterfaceC4580l<InterfaceC3281d<? super C2245s>, Object>> list2, InterfaceC3281d<? super c> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f15409m = list;
                this.f15410n = list2;
            }

            @Override // sd.InterfaceC4584p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, InterfaceC3281d<? super T> interfaceC3281d) {
                return ((c) create(t10, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                c cVar = new c(this.f15409m, this.f15410n, interfaceC3281d);
                cVar.f15408l = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
            @Override // p173ld.AbstractC3467a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = p161kd.C3385c.m12581c()
                    int r1 = r10.f15407k
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f15404h
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f15408l
                    java.util.List r4 = (java.util.List) r4
                    gd.C2238l.m8975b(r11)
                    r7 = r10
                    goto L8c
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f15406j
                    java.lang.Object r4 = r10.f15405i
                    r0.d r4 = (p246r0.InterfaceC4260d) r4
                    java.lang.Object r5 = r10.f15404h
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f15408l
                    java.util.List r6 = (java.util.List) r6
                    gd.C2238l.m8975b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6a
                L3a:
                    gd.C2238l.m8975b(r11)
                    java.lang.Object r11 = r10.f15408l
                    java.util.List<r0.d<T>> r1 = r10.f15409m
                    java.util.List<sd.l<jd.d<? super gd.s>, java.lang.Object>> r4 = r10.f15410n
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L48:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L91
                    java.lang.Object r6 = r1.next()
                    r0.d r6 = (p246r0.InterfaceC4260d) r6
                    r5.f15408l = r4
                    r5.f15404h = r1
                    r5.f15405i = r6
                    r5.f15406j = r11
                    r5.f15407k = r3
                    java.lang.Object r7 = r6.m16341a(r11, r5)
                    if (r7 != r0) goto L65
                    return r0
                L65:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8e
                    r0.e$a$c$a r11 = new r0.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f15408l = r4
                    r7.f15404h = r5
                    r7.f15405i = r8
                    r7.f15406j = r8
                    r7.f15407k = r2
                    java.lang.Object r11 = r6.m16342b(r1, r7)
                    if (r11 != r0) goto L8f
                    return r0
                L8c:
                    r5 = r7
                    goto L48
                L8e:
                    r11 = r1
                L8f:
                    r1 = r5
                    goto L8c
                L91:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p246r0.C4261e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: b */
        public final <T> InterfaceC4584p<InterfaceC4265i<T>, InterfaceC3281d<? super C2245s>, Object> m16345b(List<? extends InterfaceC4260d<T>> list) {
            C4753m.m18653f(list, "migrations");
            return new C6202a(list, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object m16346c(java.util.List<? extends p246r0.InterfaceC4260d<T>> r7, p246r0.InterfaceC4265i<T> r8, p146jd.InterfaceC3281d<? super gd.C2245s> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p246r0.C4261e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                r0.e$a$b r0 = (p246r0.C4261e.a.b) r0
                int r1 = r0.f15403l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15403l = r1
                goto L18
            L13:
                r0.e$a$b r0 = new r0.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f15401j
                java.lang.Object r1 = p161kd.C3385c.m12581c()
                int r2 = r0.f15403l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f15400i
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f15399h
                td.w r8 = (td.C4763w) r8
                gd.C2238l.m8975b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f15399h
                java.util.List r7 = (java.util.List) r7
                gd.C2238l.m8975b(r9)
                goto L60
            L46:
                gd.C2238l.m8975b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r0.e$a$c r2 = new r0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f15399h = r9
                r0.f15403l = r4
                java.lang.Object r7 = r8.mo16353a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                td.w r8 = new td.w
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                sd.l r9 = (sd.InterfaceC4580l) r9
                r0.f15399h = r8     // Catch: java.lang.Throwable -> L34
                r0.f15400i = r7     // Catch: java.lang.Throwable -> L34
                r0.f15403l = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                T r2 = r8.f17731h
                if (r2 != 0) goto L89
                r8.f17731h = r9
                goto L69
            L89:
                td.C4753m.m18650c(r2)
                T r2 = r8.f17731h
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                gd.C2227a.m8956a(r2, r9)
                goto L69
            L94:
                T r7 = r8.f17731h
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                gd.s r7 = gd.C2245s.f8873a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p246r0.C4261e.a.m16346c(java.util.List, r0.i, jd.d):java.lang.Object");
        }
    }
}
