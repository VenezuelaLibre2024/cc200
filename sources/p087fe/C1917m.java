package p087fe;

import gd.C2245s;
import ge.AbstractC2247b;
import ge.C2253h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p116he.C2538l0;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import td.C4753m;

/* renamed from: fe.m */
/* loaded from: classes2.dex */
public final class C1917m<T> extends AbstractC2247b<C1919o> implements InterfaceC1915k<T>, InterfaceC1906b {

    /* renamed from: l */
    public static final AtomicReferenceFieldUpdater f7255l = AtomicReferenceFieldUpdater.newUpdater(C1917m.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: k */
    public int f7256k;

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.StateFlowImpl", m12917f = "StateFlow.kt", m12918l = {384, 396, 401}, m12919m = "collect")
    /* renamed from: fe.m$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3470d {

        /* renamed from: h */
        public Object f7257h;

        /* renamed from: i */
        public Object f7258i;

        /* renamed from: j */
        public Object f7259j;

        /* renamed from: k */
        public Object f7260k;

        /* renamed from: l */
        public Object f7261l;

        /* renamed from: m */
        public /* synthetic */ Object f7262m;

        /* renamed from: n */
        public final /* synthetic */ C1917m<T> f7263n;

        /* renamed from: o */
        public int f7264o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1917m<T> c1917m, InterfaceC3281d<? super a> interfaceC3281d) {
            super(interfaceC3281d);
            this.f7263n = c1917m;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f7262m = obj;
            this.f7264o |= Integer.MIN_VALUE;
            return this.f7263n.mo7781a(null, this);
        }
    }

    public C1917m(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (td.C4753m.m18648a(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ge.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d8 -> B:14:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ea -> B:14:0x00a6). Please report as a decompilation issue!!! */
    @Override // p087fe.InterfaceC1906b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7781a(p087fe.InterfaceC1907c<? super T> r11, p146jd.InterfaceC3281d<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p087fe.C1917m.mo7781a(fe.c, jd.d):java.lang.Object");
    }

    @Override // p087fe.InterfaceC1907c
    public Object emit(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        setValue(t10);
        return C2245s.f8873a;
    }

    @Override // ge.AbstractC2247b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1919o mo7799c() {
        return new C1919o();
    }

    @Override // p087fe.InterfaceC1915k
    public T getValue() {
        C2538l0 c2538l0 = C2253h.f8883a;
        T t10 = (T) f7255l.get(this);
        if (t10 == c2538l0) {
            return null;
        }
        return t10;
    }

    @Override // ge.AbstractC2247b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1919o[] mo7800d(int i10) {
        return new C1919o[i10];
    }

    /* renamed from: i */
    public final boolean m7803i(Object obj, Object obj2) {
        int i10;
        C1919o[] m8981f;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7255l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !C4753m.m18648a(obj3, obj)) {
                return false;
            }
            if (C4753m.m18648a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f7256k;
            if ((i11 & 1) != 0) {
                this.f7256k = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f7256k = i12;
            C1919o[] m8981f2 = m8981f();
            C2245s c2245s = C2245s.f8873a;
            while (true) {
                C1919o[] c1919oArr = m8981f2;
                if (c1919oArr != null) {
                    for (C1919o c1919o : c1919oArr) {
                        if (c1919o != null) {
                            c1919o.m7813g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f7256k;
                    if (i10 == i12) {
                        this.f7256k = i12 + 1;
                        return true;
                    }
                    m8981f = m8981f();
                    C2245s c2245s2 = C2245s.f8873a;
                }
                m8981f2 = m8981f;
                i12 = i10;
            }
        }
    }

    @Override // p087fe.InterfaceC1915k
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) C2253h.f8883a;
        }
        m7803i(null, t10);
    }
}
