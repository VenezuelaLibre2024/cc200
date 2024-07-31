package me;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.util.concurrent.CancellationException;
import p038ce.C1084p;
import p038ce.InterfaceC1076n;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3474h;
import sd.InterfaceC4580l;
import td.AbstractC4754n;

/* renamed from: me.b */
/* loaded from: classes2.dex */
public final class C3614b {

    /* renamed from: me.b$a */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements OnCompleteListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1076n<T> f12743a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC1076n<? super T> interfaceC1076n) {
            this.f12743a = interfaceC1076n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC3281d interfaceC3281d = this.f12743a;
                C2237k.a aVar = C2237k.f8865i;
                interfaceC3281d.resumeWith(C2237k.m8966b(C2238l.m8974a(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC1076n.a.m4493a(this.f12743a, null, 1, null);
                    return;
                }
                InterfaceC3281d interfaceC3281d2 = this.f12743a;
                C2237k.a aVar2 = C2237k.f8865i;
                interfaceC3281d2.resumeWith(C2237k.m8966b(task.getResult()));
            }
        }
    }

    /* renamed from: me.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

        /* renamed from: h */
        public final /* synthetic */ CancellationTokenSource f12744h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f12744h = cancellationTokenSource;
        }

        /* renamed from: a */
        public final void m13371a(Throwable th) {
            this.f12744h.cancel();
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m13371a(th);
            return C2245s.f8873a;
        }
    }

    /* renamed from: a */
    public static final <T> Object m13369a(Task<T> task, InterfaceC3281d<? super T> interfaceC3281d) {
        return m13370b(task, null, interfaceC3281d);
    }

    /* renamed from: b */
    public static final <T> Object m13370b(Task<T> task, CancellationTokenSource cancellationTokenSource, InterfaceC3281d<? super T> interfaceC3281d) {
        if (!task.isComplete()) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            task.addOnCompleteListener(ExecutorC3613a.f12742h, new a(c1084p));
            if (cancellationTokenSource != null) {
                c1084p.mo4486c(new b(cancellationTokenSource));
            }
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
