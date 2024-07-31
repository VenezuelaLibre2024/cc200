package p246r0;

import com.journeyapps.barcodescanner.C1393b;
import gd.C2234h;
import gd.C2238l;
import gd.C2245s;
import gd.InterfaceC2233g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p038ce.C1124z;
import p038ce.InterfaceC1085p0;
import p038ce.InterfaceC1116x;
import p087fe.C1908d;
import p087fe.C1918n;
import p087fe.InterfaceC1906b;
import p087fe.InterfaceC1907c;
import p087fe.InterfaceC1915k;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.C3468b;
import p173ld.InterfaceC3472f;
import p174le.InterfaceC3479a;
import sd.InterfaceC4569a;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;
import td.C4761u;
import td.C4763w;

/* renamed from: r0.m */
/* loaded from: classes.dex */
public final class C4269m<T> implements InterfaceC4262f<T> {

    /* renamed from: k */
    public static final a f15426k = new a(null);

    /* renamed from: l */
    public static final Set<String> f15427l = new LinkedHashSet();

    /* renamed from: m */
    public static final Object f15428m = new Object();

    /* renamed from: a */
    public final InterfaceC4569a<File> f15429a;

    /* renamed from: b */
    public final InterfaceC4267k<T> f15430b;

    /* renamed from: c */
    public final InterfaceC4258b<T> f15431c;

    /* renamed from: d */
    public final InterfaceC1085p0 f15432d;

    /* renamed from: e */
    public final InterfaceC1906b<T> f15433e;

    /* renamed from: f */
    public final String f15434f;

    /* renamed from: g */
    public final InterfaceC2233g f15435g;

    /* renamed from: h */
    public final InterfaceC1915k<AbstractC4270n<T>> f15436h;

    /* renamed from: i */
    public List<? extends InterfaceC4584p<? super InterfaceC4265i<T>, ? super InterfaceC3281d<? super C2245s>, ? extends Object>> f15437i;

    /* renamed from: j */
    public final C4268l<b<T>> f15438j;

    /* renamed from: r0.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final Set<String> m16389a() {
            return C4269m.f15427l;
        }

        /* renamed from: b */
        public final Object m16390b() {
            return C4269m.f15428m;
        }
    }

    /* renamed from: r0.m$b */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: r0.m$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> extends b<T> {

            /* renamed from: a */
            public final AbstractC4270n<T> f15439a;

            public a(AbstractC4270n<T> abstractC4270n) {
                super(null);
                this.f15439a = abstractC4270n;
            }

            /* renamed from: a */
            public AbstractC4270n<T> m16391a() {
                return this.f15439a;
            }
        }

        /* renamed from: r0.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6204b<T> extends b<T> {

            /* renamed from: a */
            public final InterfaceC4584p<T, InterfaceC3281d<? super T>, Object> f15440a;

            /* renamed from: b */
            public final InterfaceC1116x<T> f15441b;

            /* renamed from: c */
            public final AbstractC4270n<T> f15442c;

            /* renamed from: d */
            public final InterfaceC3284g f15443d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6204b(InterfaceC4584p<? super T, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, InterfaceC1116x<T> interfaceC1116x, AbstractC4270n<T> abstractC4270n, InterfaceC3284g interfaceC3284g) {
                super(null);
                C4753m.m18653f(interfaceC4584p, "transform");
                C4753m.m18653f(interfaceC1116x, "ack");
                C4753m.m18653f(interfaceC3284g, "callerContext");
                this.f15440a = interfaceC4584p;
                this.f15441b = interfaceC1116x;
                this.f15442c = abstractC4270n;
                this.f15443d = interfaceC3284g;
            }

            /* renamed from: a */
            public final InterfaceC1116x<T> m16392a() {
                return this.f15441b;
            }

            /* renamed from: b */
            public final InterfaceC3284g m16393b() {
                return this.f15443d;
            }

            /* renamed from: c */
            public AbstractC4270n<T> m16394c() {
                return this.f15442c;
            }

            /* renamed from: d */
            public final InterfaceC4584p<T, InterfaceC3281d<? super T>, Object> m16395d() {
                return this.f15440a;
            }
        }

        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: r0.m$c */
    /* loaded from: classes.dex */
    public static final class c extends OutputStream {

        /* renamed from: h */
        public final FileOutputStream f15444h;

        public c(FileOutputStream fileOutputStream) {
            C4753m.m18653f(fileOutputStream, "fileOutputStream");
            this.f15444h = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f15444h.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f15444h.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C4753m.m18653f(bArr, C1393b.f5292o);
            this.f15444h.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            C4753m.m18653f(bArr, "bytes");
            this.f15444h.write(bArr, i10, i11);
        }
    }

    /* renamed from: r0.m$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

        /* renamed from: h */
        public final /* synthetic */ C4269m<T> f15445h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4269m<T> c4269m) {
            super(1);
            this.f15445h = c4269m;
        }

        /* renamed from: a */
        public final void m16396a(Throwable th) {
            if (th != null) {
                this.f15445h.f15436h.setValue(new C4264h(th));
            }
            a aVar = C4269m.f15426k;
            Object m16390b = aVar.m16390b();
            C4269m<T> c4269m = this.f15445h;
            synchronized (m16390b) {
                aVar.m16389a().remove(c4269m.m16379q().getAbsolutePath());
                C2245s c2245s = C2245s.f8873a;
            }
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m16396a(th);
            return C2245s.f8873a;
        }
    }

    /* renamed from: r0.m$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC4754n implements InterfaceC4584p<b<T>, Throwable, C2245s> {

        /* renamed from: h */
        public static final e f15446h = new e();

        public e() {
            super(2);
        }

        /* renamed from: a */
        public final void m16397a(b<T> bVar, Throwable th) {
            C4753m.m18653f(bVar, "msg");
            if (bVar instanceof b.C6204b) {
                InterfaceC1116x<T> m16392a = ((b.C6204b) bVar).m16392a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                m16392a.mo4595l0(th);
            }
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ C2245s invoke(Object obj, Throwable th) {
            m16397a((b) obj, th);
            return C2245s.f8873a;
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m12917f = "SingleProcessDataStore.kt", m12918l = {239, 242}, m12919m = "invokeSuspend")
    /* renamed from: r0.m$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC3478l implements InterfaceC4584p<b<T>, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f15447h;

        /* renamed from: i */
        public /* synthetic */ Object f15448i;

        /* renamed from: j */
        public final /* synthetic */ C4269m<T> f15449j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C4269m<T> c4269m, InterfaceC3281d<? super f> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f15449j = c4269m;
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((f) create(bVar, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            f fVar = new f(this.f15449j, interfaceC3281d);
            fVar.f15448i = obj;
            return fVar;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f15447h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                b bVar = (b) this.f15448i;
                if (bVar instanceof b.a) {
                    this.f15447h = 1;
                    if (this.f15449j.m16380r((b.a) bVar, this) == m12581c) {
                        return m12581c;
                    }
                } else if (bVar instanceof b.C6204b) {
                    this.f15447h = 2;
                    if (this.f15449j.m16381s((b.C6204b) bVar, this) == m12581c) {
                        return m12581c;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            return C2245s.f8873a;
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$data$1", m12917f = "SingleProcessDataStore.kt", m12918l = {117}, m12919m = "invokeSuspend")
    /* renamed from: r0.m$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC3478l implements InterfaceC4584p<InterfaceC1907c<? super T>, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f15450h;

        /* renamed from: i */
        public /* synthetic */ Object f15451i;

        /* renamed from: j */
        public final /* synthetic */ C4269m<T> f15452j;

        @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m12917f = "SingleProcessDataStore.kt", m12918l = {}, m12919m = "invokeSuspend")
        /* renamed from: r0.m$g$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC3478l implements InterfaceC4584p<AbstractC4270n<T>, InterfaceC3281d<? super Boolean>, Object> {

            /* renamed from: h */
            public int f15453h;

            /* renamed from: i */
            public /* synthetic */ Object f15454i;

            /* renamed from: j */
            public final /* synthetic */ AbstractC4270n<T> f15455j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4270n<T> abstractC4270n, InterfaceC3281d<? super a> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f15455j = abstractC4270n;
            }

            @Override // sd.InterfaceC4584p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4270n<T> abstractC4270n, InterfaceC3281d<? super Boolean> interfaceC3281d) {
                return ((a) create(abstractC4270n, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                a aVar = new a(this.f15455j, interfaceC3281d);
                aVar.f15454i = obj;
                return aVar;
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                C3385c.m12581c();
                if (this.f15453h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
                AbstractC4270n<T> abstractC4270n = (AbstractC4270n) this.f15454i;
                AbstractC4270n<T> abstractC4270n2 = this.f15455j;
                boolean z10 = false;
                if (!(abstractC4270n2 instanceof C4259c) && !(abstractC4270n2 instanceof C4264h) && abstractC4270n == abstractC4270n2) {
                    z10 = true;
                }
                return C3468b.m12913a(z10);
            }
        }

        /* renamed from: r0.m$g$b */
        /* loaded from: classes.dex */
        public static final class b implements InterfaceC1906b<T> {

            /* renamed from: h */
            public final /* synthetic */ InterfaceC1906b f15456h;

            /* renamed from: r0.m$g$b$a */
            /* loaded from: classes.dex */
            public static final class a implements InterfaceC1907c<AbstractC4270n<T>> {

                /* renamed from: h */
                public final /* synthetic */ InterfaceC1907c f15457h;

                @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m12917f = "SingleProcessDataStore.kt", m12918l = {137}, m12919m = "emit")
                /* renamed from: r0.m$g$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C6205a extends AbstractC3470d {

                    /* renamed from: h */
                    public /* synthetic */ Object f15458h;

                    /* renamed from: i */
                    public int f15459i;

                    public C6205a(InterfaceC3281d interfaceC3281d) {
                        super(interfaceC3281d);
                    }

                    @Override // p173ld.AbstractC3467a
                    public final Object invokeSuspend(Object obj) {
                        this.f15458h = obj;
                        this.f15459i |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC1907c interfaceC1907c) {
                    this.f15457h = interfaceC1907c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // p087fe.InterfaceC1907c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object emit(java.lang.Object r5, p146jd.InterfaceC3281d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p246r0.C4269m.g.b.a.C6205a
                        if (r0 == 0) goto L13
                        r0 = r6
                        r0.m$g$b$a$a r0 = (p246r0.C4269m.g.b.a.C6205a) r0
                        int r1 = r0.f15459i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f15459i = r1
                        goto L18
                    L13:
                        r0.m$g$b$a$a r0 = new r0.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f15458h
                        java.lang.Object r1 = p161kd.C3385c.m12581c()
                        int r2 = r0.f15459i
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        gd.C2238l.m8975b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        gd.C2238l.m8975b(r6)
                        fe.c r6 = r4.f15457h
                        r0.n r5 = (p246r0.AbstractC4270n) r5
                        boolean r2 = r5 instanceof p246r0.C4266j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof p246r0.C4264h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof p246r0.C4259c
                        if (r2 == 0) goto L56
                        r0.c r5 = (p246r0.C4259c) r5
                        java.lang.Object r5 = r5.m16340b()
                        r0.f15459i = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        gd.s r5 = gd.C2245s.f8873a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof p246r0.C4271o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        gd.i r5 = new gd.i
                        r5.<init>()
                        throw r5
                    L6c:
                        r0.h r5 = (p246r0.C4264h) r5
                        java.lang.Throwable r5 = r5.m16352a()
                        throw r5
                    L73:
                        r0.j r5 = (p246r0.C4266j) r5
                        java.lang.Throwable r5 = r5.m16354a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.g.b.a.emit(java.lang.Object, jd.d):java.lang.Object");
                }
            }

            public b(InterfaceC1906b interfaceC1906b) {
                this.f15456h = interfaceC1906b;
            }

            @Override // p087fe.InterfaceC1906b
            /* renamed from: a */
            public Object mo7781a(InterfaceC1907c interfaceC1907c, InterfaceC3281d interfaceC3281d) {
                Object mo7781a = this.f15456h.mo7781a(new a(interfaceC1907c), interfaceC3281d);
                return mo7781a == C3385c.m12581c() ? mo7781a : C2245s.f8873a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C4269m<T> c4269m, InterfaceC3281d<? super g> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f15452j = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            g gVar = new g(this.f15452j, interfaceC3281d);
            gVar.f15451i = obj;
            return gVar;
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1907c<? super T> interfaceC1907c, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((g) create(interfaceC1907c, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f15450h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                InterfaceC1907c interfaceC1907c = (InterfaceC1907c) this.f15451i;
                AbstractC4270n abstractC4270n = (AbstractC4270n) this.f15452j.f15436h.getValue();
                if (!(abstractC4270n instanceof C4259c)) {
                    this.f15452j.f15438j.m16362e(new b.a(abstractC4270n));
                }
                b bVar = new b(C1908d.m7785c(this.f15452j.f15436h, new a(abstractC4270n, null)));
                this.f15450h = 1;
                if (C1908d.m7786d(interfaceC1907c, bVar, this) == m12581c) {
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

    /* renamed from: r0.m$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC4754n implements InterfaceC4569a<File> {

        /* renamed from: h */
        public final /* synthetic */ C4269m<T> f15461h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C4269m<T> c4269m) {
            super(0);
            this.f15461h = c4269m;
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f15461h.f15429a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = C4269m.f15426k;
            synchronized (aVar.m16390b()) {
                if (!(!aVar.m16389a().contains(absolutePath))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> m16389a = aVar.m16389a();
                C4753m.m18652e(absolutePath, "it");
                m16389a.add(absolutePath);
            }
            return file;
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {276, 281, 284}, m12919m = "handleUpdate")
    /* renamed from: r0.m$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC3470d {

        /* renamed from: h */
        public Object f15462h;

        /* renamed from: i */
        public Object f15463i;

        /* renamed from: j */
        public Object f15464j;

        /* renamed from: k */
        public /* synthetic */ Object f15465k;

        /* renamed from: l */
        public final /* synthetic */ C4269m<T> f15466l;

        /* renamed from: m */
        public int f15467m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C4269m<T> c4269m, InterfaceC3281d<? super i> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15466l = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15465k = obj;
            this.f15467m |= Integer.MIN_VALUE;
            return this.f15466l.m16381s(null, this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {322, 348, 505}, m12919m = "readAndInit")
    /* renamed from: r0.m$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC3470d {

        /* renamed from: h */
        public Object f15468h;

        /* renamed from: i */
        public Object f15469i;

        /* renamed from: j */
        public Object f15470j;

        /* renamed from: k */
        public Object f15471k;

        /* renamed from: l */
        public Object f15472l;

        /* renamed from: m */
        public Object f15473m;

        /* renamed from: n */
        public /* synthetic */ Object f15474n;

        /* renamed from: o */
        public final /* synthetic */ C4269m<T> f15475o;

        /* renamed from: p */
        public int f15476p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C4269m<T> c4269m, InterfaceC3281d<? super j> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15475o = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15474n = obj;
            this.f15476p |= Integer.MIN_VALUE;
            return this.f15475o.m16382t(this);
        }
    }

    /* renamed from: r0.m$k */
    /* loaded from: classes.dex */
    public static final class k implements InterfaceC4265i<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3479a f15477a;

        /* renamed from: b */
        public final /* synthetic */ C4761u f15478b;

        /* renamed from: c */
        public final /* synthetic */ C4763w<T> f15479c;

        /* renamed from: d */
        public final /* synthetic */ C4269m<T> f15480d;

        @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", m12917f = "SingleProcessDataStore.kt", m12918l = {503, 337, 339}, m12919m = "updateData")
        /* renamed from: r0.m$k$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC3470d {

            /* renamed from: h */
            public Object f15481h;

            /* renamed from: i */
            public Object f15482i;

            /* renamed from: j */
            public Object f15483j;

            /* renamed from: k */
            public Object f15484k;

            /* renamed from: l */
            public Object f15485l;

            /* renamed from: m */
            public /* synthetic */ Object f15486m;

            /* renamed from: o */
            public int f15488o;

            public a(InterfaceC3281d<? super a> interfaceC3281d) {
                super(interfaceC3281d);
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                this.f15486m = obj;
                this.f15488o |= Integer.MIN_VALUE;
                return k.this.mo16353a(null, this);
            }
        }

        public k(InterfaceC3479a interfaceC3479a, C4761u c4761u, C4763w<T> c4763w, C4269m<T> c4269m) {
            this.f15477a = interfaceC3479a;
            this.f15478b = c4761u;
            this.f15479c = c4763w;
            this.f15480d = c4269m;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00d7, B:47:0x00de), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // p246r0.InterfaceC4265i
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo16353a(sd.InterfaceC4584p<? super T, ? super p146jd.InterfaceC3281d<? super T>, ? extends java.lang.Object> r11, p146jd.InterfaceC3281d<? super T> r12) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.k.mo16353a(sd.p, jd.d):java.lang.Object");
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {302}, m12919m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: r0.m$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC3470d {

        /* renamed from: h */
        public Object f15489h;

        /* renamed from: i */
        public /* synthetic */ Object f15490i;

        /* renamed from: j */
        public final /* synthetic */ C4269m<T> f15491j;

        /* renamed from: k */
        public int f15492k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C4269m<T> c4269m, InterfaceC3281d<? super l> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15491j = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15490i = obj;
            this.f15492k |= Integer.MIN_VALUE;
            return this.f15491j.m16383u(this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {311}, m12919m = "readAndInitOrPropagateFailure")
    /* renamed from: r0.m$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC3470d {

        /* renamed from: h */
        public Object f15493h;

        /* renamed from: i */
        public /* synthetic */ Object f15494i;

        /* renamed from: j */
        public final /* synthetic */ C4269m<T> f15495j;

        /* renamed from: k */
        public int f15496k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C4269m<T> c4269m, InterfaceC3281d<? super m> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15495j = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15494i = obj;
            this.f15496k |= Integer.MIN_VALUE;
            return this.f15495j.m16384v(this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {381}, m12919m = "readData")
    /* renamed from: r0.m$n */
    /* loaded from: classes.dex */
    public static final class n extends AbstractC3470d {

        /* renamed from: h */
        public Object f15497h;

        /* renamed from: i */
        public Object f15498i;

        /* renamed from: j */
        public Object f15499j;

        /* renamed from: k */
        public /* synthetic */ Object f15500k;

        /* renamed from: l */
        public final /* synthetic */ C4269m<T> f15501l;

        /* renamed from: m */
        public int f15502m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C4269m<T> c4269m, InterfaceC3281d<? super n> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15501l = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15500k = obj;
            this.f15502m |= Integer.MIN_VALUE;
            return this.f15501l.m16385w(this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {359, 362, 365}, m12919m = "readDataOrHandleCorruption")
    /* renamed from: r0.m$o */
    /* loaded from: classes.dex */
    public static final class o extends AbstractC3470d {

        /* renamed from: h */
        public Object f15503h;

        /* renamed from: i */
        public Object f15504i;

        /* renamed from: j */
        public /* synthetic */ Object f15505j;

        /* renamed from: k */
        public final /* synthetic */ C4269m<T> f15506k;

        /* renamed from: l */
        public int f15507l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C4269m<T> c4269m, InterfaceC3281d<? super o> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15506k = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15505j = obj;
            this.f15507l |= Integer.MIN_VALUE;
            return this.f15506k.m16386x(this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {402, 410}, m12919m = "transformAndWrite")
    /* renamed from: r0.m$p */
    /* loaded from: classes.dex */
    public static final class p extends AbstractC3470d {

        /* renamed from: h */
        public Object f15508h;

        /* renamed from: i */
        public Object f15509i;

        /* renamed from: j */
        public Object f15510j;

        /* renamed from: k */
        public /* synthetic */ Object f15511k;

        /* renamed from: l */
        public final /* synthetic */ C4269m<T> f15512l;

        /* renamed from: m */
        public int f15513m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C4269m<T> c4269m, InterfaceC3281d<? super p> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15512l = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15511k = obj;
            this.f15513m |= Integer.MIN_VALUE;
            return this.f15512l.m16387y(null, null, this);
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m12917f = "SingleProcessDataStore.kt", m12918l = {402}, m12919m = "invokeSuspend")
    /* renamed from: r0.m$q */
    /* loaded from: classes.dex */
    public static final class q extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super T>, Object> {

        /* renamed from: h */
        public int f15514h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4584p<T, InterfaceC3281d<? super T>, Object> f15515i;

        /* renamed from: j */
        public final /* synthetic */ T f15516j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(InterfaceC4584p<? super T, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, T t10, InterfaceC3281d<? super q> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f15515i = interfaceC4584p;
            this.f15516j = t10;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new q(this.f15515i, this.f15516j, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super T> interfaceC3281d) {
            return ((q) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f15514h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                InterfaceC4584p<T, InterfaceC3281d<? super T>, Object> interfaceC4584p = this.f15515i;
                T t10 = this.f15516j;
                this.f15514h = 1;
                obj = interfaceC4584p.invoke(t10, this);
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

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SingleProcessDataStore", m12917f = "SingleProcessDataStore.kt", m12918l = {426}, m12919m = "writeData$datastore_core")
    /* renamed from: r0.m$r */
    /* loaded from: classes.dex */
    public static final class r extends AbstractC3470d {

        /* renamed from: h */
        public Object f15517h;

        /* renamed from: i */
        public Object f15518i;

        /* renamed from: j */
        public Object f15519j;

        /* renamed from: k */
        public Object f15520k;

        /* renamed from: l */
        public Object f15521l;

        /* renamed from: m */
        public /* synthetic */ Object f15522m;

        /* renamed from: n */
        public final /* synthetic */ C4269m<T> f15523n;

        /* renamed from: o */
        public int f15524o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(C4269m<T> c4269m, InterfaceC3281d<? super r> interfaceC3281d) {
            super(interfaceC3281d);
            this.f15523n = c4269m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f15522m = obj;
            this.f15524o |= Integer.MIN_VALUE;
            return this.f15523n.m16388z(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4269m(InterfaceC4569a<? extends File> interfaceC4569a, InterfaceC4267k<T> interfaceC4267k, List<? extends InterfaceC4584p<? super InterfaceC4265i<T>, ? super InterfaceC3281d<? super C2245s>, ? extends Object>> list, InterfaceC4258b<T> interfaceC4258b, InterfaceC1085p0 interfaceC1085p0) {
        C4753m.m18653f(interfaceC4569a, "produceFile");
        C4753m.m18653f(interfaceC4267k, "serializer");
        C4753m.m18653f(list, "initTasksList");
        C4753m.m18653f(interfaceC4258b, "corruptionHandler");
        C4753m.m18653f(interfaceC1085p0, "scope");
        this.f15429a = interfaceC4569a;
        this.f15430b = interfaceC4267k;
        this.f15431c = interfaceC4258b;
        this.f15432d = interfaceC1085p0;
        this.f15433e = C1908d.m7789g(new g(this, null));
        this.f15434f = ".tmp";
        this.f15435g = C2234h.m8960a(new h(this));
        this.f15436h = C1918n.m7804a(C4271o.f15525a);
        this.f15437i = C2510v.m10008K(list);
        this.f15438j = new C4268l<>(interfaceC1085p0, new d(this), e.f15446h, new f(this, null));
    }

    @Override // p246r0.InterfaceC4262f
    /* renamed from: a */
    public Object mo16350a(InterfaceC4584p<? super T, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super T> interfaceC3281d) {
        InterfaceC1116x m4605b = C1124z.m4605b(null, 1, null);
        this.f15438j.m16362e(new b.C6204b(interfaceC4584p, m4605b, this.f15436h.getValue(), interfaceC3281d.getContext()));
        return m4605b.mo4597f0(interfaceC3281d);
    }

    @Override // p246r0.InterfaceC4262f
    public InterfaceC1906b<T> getData() {
        return this.f15433e;
    }

    /* renamed from: p */
    public final void m16378p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C4753m.m18660m("Unable to create parent directories of ", file));
        }
    }

    /* renamed from: q */
    public final File m16379q() {
        return (File) this.f15435g.getValue();
    }

    /* renamed from: r */
    public final Object m16380r(b.a<T> aVar, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        AbstractC4270n<T> value = this.f15436h.getValue();
        if (!(value instanceof C4259c)) {
            if (value instanceof C4266j) {
                if (value == aVar.m16391a()) {
                    Object m16384v = m16384v(interfaceC3281d);
                    return m16384v == C3385c.m12581c() ? m16384v : C2245s.f8873a;
                }
            } else {
                if (C4753m.m18648a(value, C4271o.f15525a)) {
                    Object m16384v2 = m16384v(interfaceC3281d);
                    return m16384v2 == C3385c.m12581c() ? m16384v2 : C2245s.f8873a;
                }
                if (value instanceof C4264h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return C2245s.f8873a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0052, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [r0.m, java.lang.Object, r0.m<T>] */
    /* JADX WARN: Type inference failed for: r9v20, types: [ce.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ce.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16381s(p246r0.C4269m.b.C6204b<T> r9, p146jd.InterfaceC3281d<? super gd.C2245s> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16381s(r0.m$b$b, jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16382t(p146jd.InterfaceC3281d<? super gd.C2245s> r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16382t(jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16383u(p146jd.InterfaceC3281d<? super gd.C2245s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p246r0.C4269m.l
            if (r0 == 0) goto L13
            r0 = r5
            r0.m$l r0 = (p246r0.C4269m.l) r0
            int r1 = r0.f15492k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15492k = r1
            goto L18
        L13:
            r0.m$l r0 = new r0.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f15490i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15492k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f15489h
            r0.m r0 = (p246r0.C4269m) r0
            gd.C2238l.m8975b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            gd.C2238l.m8975b(r5)
            r0.f15489h = r4     // Catch: java.lang.Throwable -> L48
            r0.f15492k = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.m16382t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            gd.s r5 = gd.C2245s.f8873a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            fe.k<r0.n<T>> r0 = r0.f15436h
            r0.j r1 = new r0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16383u(jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16384v(p146jd.InterfaceC3281d<? super gd.C2245s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p246r0.C4269m.m
            if (r0 == 0) goto L13
            r0 = r5
            r0.m$m r0 = (p246r0.C4269m.m) r0
            int r1 = r0.f15496k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15496k = r1
            goto L18
        L13:
            r0.m$m r0 = new r0.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f15494i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15496k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f15493h
            r0.m r0 = (p246r0.C4269m) r0
            gd.C2238l.m8975b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            gd.C2238l.m8975b(r5)
            r0.f15493h = r4     // Catch: java.lang.Throwable -> L45
            r0.f15496k = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.m16382t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            fe.k<r0.n<T>> r0 = r0.f15436h
            r0.j r1 = new r0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            gd.s r5 = gd.C2245s.f8873a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16384v(jd.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v12, types: [r0.m] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [jd.d, r0.m$n] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [r0.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [r0.k<T>, r0.k] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16385w(p146jd.InterfaceC3281d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p246r0.C4269m.n
            if (r0 == 0) goto L13
            r0 = r6
            r0.m$n r0 = (p246r0.C4269m.n) r0
            int r1 = r0.f15502m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15502m = r1
            goto L18
        L13:
            r0.m$n r0 = new r0.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15500k
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15502m
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f15499j
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f15498i
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f15497h
            r0.m r0 = (p246r0.C4269m) r0
            gd.C2238l.m8975b(r6)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L68
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            gd.C2238l.m8975b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6e
            java.io.File r6 = r5.m16379q()     // Catch: java.io.FileNotFoundException -> L6e
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6e
            r6 = 0
            r0.k<T> r4 = r5.f15430b     // Catch: java.lang.Throwable -> L66
            r0.f15497h = r5     // Catch: java.lang.Throwable -> L66
            r0.f15498i = r2     // Catch: java.lang.Throwable -> L66
            r0.f15499j = r6     // Catch: java.lang.Throwable -> L66
            r0.f15502m = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r4.mo16357c(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r0
            r0 = r5
        L60:
            p243qd.C4236c.m16274a(r2, r1)     // Catch: java.io.FileNotFoundException -> L64
            return r6
        L64:
            r6 = move-exception
            goto L70
        L66:
            r6 = move-exception
            r0 = r5
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            p243qd.C4236c.m16274a(r2, r6)     // Catch: java.io.FileNotFoundException -> L64
            throw r1     // Catch: java.io.FileNotFoundException -> L64
        L6e:
            r6 = move-exception
            r0 = r5
        L70:
            java.io.File r1 = r0.m16379q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L81
            r0.k<T> r6 = r0.f15430b
            java.lang.Object r6 = r6.mo16356b()
            return r6
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16385w(jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16386x(p146jd.InterfaceC3281d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p246r0.C4269m.o
            if (r0 == 0) goto L13
            r0 = r8
            r0.m$o r0 = (p246r0.C4269m.o) r0
            int r1 = r0.f15507l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15507l = r1
            goto L18
        L13:
            r0.m$o r0 = new r0.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f15505j
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15507l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f15504i
            java.lang.Object r0 = r0.f15503h
            r0.a r0 = (p246r0.C4257a) r0
            gd.C2238l.m8975b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f15504i
            r0.a r2 = (p246r0.C4257a) r2
            java.lang.Object r4 = r0.f15503h
            r0.m r4 = (p246r0.C4269m) r4
            gd.C2238l.m8975b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f15503h
            r0.m r2 = (p246r0.C4269m) r2
            gd.C2238l.m8975b(r8)     // Catch: p246r0.C4257a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            gd.C2238l.m8975b(r8)
            r0.f15503h = r7     // Catch: p246r0.C4257a -> L64
            r0.f15507l = r5     // Catch: p246r0.C4257a -> L64
            java.lang.Object r8 = r7.m16385w(r0)     // Catch: p246r0.C4257a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            r0.b<T> r5 = r2.f15431c
            r0.f15503h = r2
            r0.f15504i = r8
            r0.f15507l = r4
            java.lang.Object r4 = r5.mo16338a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f15503h = r2     // Catch: java.io.IOException -> L88
            r0.f15504i = r8     // Catch: java.io.IOException -> L88
            r0.f15507l = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.m16388z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            gd.C2227a.m8956a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16386x(jd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16387y(sd.InterfaceC4584p<? super T, ? super p146jd.InterfaceC3281d<? super T>, ? extends java.lang.Object> r8, p146jd.InterfaceC3284g r9, p146jd.InterfaceC3281d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p246r0.C4269m.p
            if (r0 == 0) goto L13
            r0 = r10
            r0.m$p r0 = (p246r0.C4269m.p) r0
            int r1 = r0.f15513m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15513m = r1
            goto L18
        L13:
            r0.m$p r0 = new r0.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f15511k
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15513m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f15509i
            java.lang.Object r9 = r0.f15508h
            r0.m r9 = (p246r0.C4269m) r9
            gd.C2238l.m8975b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f15510j
            java.lang.Object r9 = r0.f15509i
            r0.c r9 = (p246r0.C4259c) r9
            java.lang.Object r2 = r0.f15508h
            r0.m r2 = (p246r0.C4269m) r2
            gd.C2238l.m8975b(r10)
            goto L73
        L49:
            gd.C2238l.m8975b(r10)
            fe.k<r0.n<T>> r10 = r7.f15436h
            java.lang.Object r10 = r10.getValue()
            r0.c r10 = (p246r0.C4259c) r10
            r10.m16339a()
            java.lang.Object r2 = r10.m16340b()
            r0.m$q r6 = new r0.m$q
            r6.<init>(r8, r2, r3)
            r0.f15508h = r7
            r0.f15509i = r10
            r0.f15510j = r2
            r0.f15513m = r5
            java.lang.Object r8 = p038ce.C1053i.m4362g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.m16339a()
            boolean r9 = td.C4753m.m18648a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f15508h = r2
            r0.f15509i = r10
            r0.f15510j = r3
            r0.f15513m = r4
            java.lang.Object r8 = r2.m16388z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            fe.k<r0.n<T>> r9 = r9.f15436h
            r0.c r10 = new r0.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16387y(sd.p, jd.g, jd.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: IOException -> 0x00c4, TryCatch #1 {IOException -> 0x00c4, blocks: (B:14:0x0092, B:18:0x00a0, B:19:0x00bb, B:26:0x00c0, B:27:0x00c3, B:23:0x00be), top: B:7:0x0021, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.StringBuilder] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m16388z(T r8, p146jd.InterfaceC3281d<? super gd.C2245s> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p246r0.C4269m.r
            if (r0 == 0) goto L13
            r0 = r9
            r0.m$r r0 = (p246r0.C4269m.r) r0
            int r1 = r0.f15524o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15524o = r1
            goto L18
        L13:
            r0.m$r r0 = new r0.m$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f15522m
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f15524o
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f15521l
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f15520k
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f15519j
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f15518i
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f15517h
            r0.m r0 = (p246r0.C4269m) r0
            gd.C2238l.m8975b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lbe
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            gd.C2238l.m8975b(r9)
            java.io.File r9 = r7.m16379q()
            r7.m16378p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.m16379q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f15434f
            java.lang.String r2 = td.C4753m.m18660m(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc7
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc7
            r4 = 0
            r0.k<T> r5 = r7.f15430b     // Catch: java.lang.Throwable -> Lbc
            r0.m$c r6 = new r0.m$c     // Catch: java.lang.Throwable -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r0.f15517h = r7     // Catch: java.lang.Throwable -> Lbc
            r0.f15518i = r9     // Catch: java.lang.Throwable -> Lbc
            r0.f15519j = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f15520k = r4     // Catch: java.lang.Throwable -> Lbc
            r0.f15521l = r2     // Catch: java.lang.Throwable -> Lbc
            r0.f15524o = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r8 = r5.mo16355a(r8, r6, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            gd.s r8 = gd.C2245s.f8873a     // Catch: java.lang.Throwable -> L3d
            p243qd.C4236c.m16274a(r2, r1)     // Catch: java.io.IOException -> Lc4
            java.io.File r9 = r0.m16379q()     // Catch: java.io.IOException -> Lc4
            boolean r9 = r3.renameTo(r9)     // Catch: java.io.IOException -> Lc4
            if (r9 == 0) goto La0
            return r8
        La0:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc4
            r9.<init>()     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            r9.append(r3)     // Catch: java.io.IOException -> Lc4
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc4
            r8.<init>(r9)     // Catch: java.io.IOException -> Lc4
            throw r8     // Catch: java.io.IOException -> Lc4
        Lbc:
            r8 = move-exception
            r3 = r9
        Lbe:
            throw r8     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r9 = move-exception
            p243qd.C4236c.m16274a(r2, r8)     // Catch: java.io.IOException -> Lc4
            throw r9     // Catch: java.io.IOException -> Lc4
        Lc4:
            r8 = move-exception
            r9 = r3
            goto Lc8
        Lc7:
            r8 = move-exception
        Lc8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld1
            r9.delete()
        Ld1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p246r0.C4269m.m16388z(java.lang.Object, jd.d):java.lang.Object");
    }
}
