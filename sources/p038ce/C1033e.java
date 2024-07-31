package p038ce;

import gd.C2237k;
import gd.C2245s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3474h;
import td.C4753m;

/* renamed from: ce.e */
/* loaded from: classes2.dex */
public final class C1033e<T> {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f3987b = AtomicIntegerFieldUpdater.newUpdater(C1033e.class, "notCompletedCount");

    /* renamed from: a */
    public final InterfaceC1117x0<T>[] f3988a;
    private volatile int notCompletedCount;

    /* renamed from: ce.e$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractC1056i2 {

        /* renamed from: o */
        public static final AtomicReferenceFieldUpdater f3989o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: l */
        public final InterfaceC1076n<List<? extends T>> f3990l;

        /* renamed from: m */
        public InterfaceC1055i1 f3991m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC1076n<? super List<? extends T>> interfaceC1076n) {
            this.f3990l = interfaceC1076n;
        }

        /* renamed from: A */
        public final void m4301A(InterfaceC1055i1 interfaceC1055i1) {
            this.f3991m = interfaceC1055i1;
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            mo4259u(th);
            return C2245s.f8873a;
        }

        @Override // p038ce.AbstractC1034e0
        /* renamed from: u */
        public void mo4259u(Throwable th) {
            if (th != null) {
                Object mo4488f = this.f3990l.mo4488f(th);
                if (mo4488f != null) {
                    this.f3990l.mo4492m(mo4488f);
                    C1033e<T>.b m4302x = m4302x();
                    if (m4302x != null) {
                        m4302x.m4306f();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1033e.f3987b.decrementAndGet(C1033e.this) == 0) {
                InterfaceC1076n<List<? extends T>> interfaceC1076n = this.f3990l;
                InterfaceC1117x0[] interfaceC1117x0Arr = C1033e.this.f3988a;
                ArrayList arrayList = new ArrayList(interfaceC1117x0Arr.length);
                for (InterfaceC1117x0 interfaceC1117x0 : interfaceC1117x0Arr) {
                    arrayList.add(interfaceC1117x0.mo4598j());
                }
                C2237k.a aVar = C2237k.f8865i;
                interfaceC1076n.resumeWith(C2237k.m8966b(arrayList));
            }
        }

        /* renamed from: x */
        public final C1033e<T>.b m4302x() {
            return (b) f3989o.get(this);
        }

        /* renamed from: y */
        public final InterfaceC1055i1 m4303y() {
            InterfaceC1055i1 interfaceC1055i1 = this.f3991m;
            if (interfaceC1055i1 != null) {
                return interfaceC1055i1;
            }
            C4753m.m18667t("handle");
            return null;
        }

        /* renamed from: z */
        public final void m4304z(C1033e<T>.b bVar) {
            f3989o.set(this, bVar);
        }
    }

    /* renamed from: ce.e$b */
    /* loaded from: classes2.dex */
    public final class b extends AbstractC1068l {

        /* renamed from: h */
        public final C1033e<T>.a[] f3993h;

        public b(C1033e<T>.a[] aVarArr) {
            this.f3993h = aVarArr;
        }

        @Override // p038ce.AbstractC1072m
        /* renamed from: e */
        public void mo4305e(Throwable th) {
            m4306f();
        }

        /* renamed from: f */
        public final void m4306f() {
            for (C1033e<T>.a aVar : this.f3993h) {
                aVar.m4303y().dispose();
            }
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            mo4305e(th);
            return C2245s.f8873a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f3993h + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1033e(InterfaceC1117x0<? extends T>[] interfaceC1117x0Arr) {
        this.f3988a = interfaceC1117x0Arr;
        this.notCompletedCount = interfaceC1117x0Arr.length;
    }

    /* renamed from: c */
    public final Object m4300c(InterfaceC3281d<? super List<? extends T>> interfaceC3281d) {
        C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
        c1084p.m4530B();
        int length = this.f3988a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC1117x0 interfaceC1117x0 = this.f3988a[i10];
            interfaceC1117x0.start();
            a aVar = new a(c1084p);
            aVar.m4301A(interfaceC1117x0.mo4278x0(aVar));
            C2245s c2245s = C2245s.f8873a;
            aVarArr[i10] = aVar;
        }
        C1033e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].m4304z(bVar);
        }
        if (c1084p.mo4491k()) {
            bVar.m4306f();
        } else {
            c1084p.mo4486c(bVar);
        }
        Object m4553y = c1084p.m4553y();
        if (m4553y == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4553y;
    }
}
