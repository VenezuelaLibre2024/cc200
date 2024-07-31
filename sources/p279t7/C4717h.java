package p279t7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p108h6.C2394s;
import p195n7.C3767g;
import p195n7.C3773m;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p253r7.InterfaceC4321d;
import p268s7.AbstractC4546b;
import p268s7.AbstractC4547c;
import p268s7.AbstractC4548d;
import p268s7.InterfaceC4545a;
import p293u7.InterfaceC4987a;
import p308v7.InterfaceC5139a;
import p309v8.InterfaceC5149i;
import p354y8.InterfaceC5896b;

/* renamed from: t7.h */
/* loaded from: classes.dex */
public class C4717h extends AbstractC4548d {

    /* renamed from: a */
    public final C3767g f17604a;

    /* renamed from: b */
    public final InterfaceC5896b<InterfaceC5149i> f17605b;

    /* renamed from: c */
    public final List<InterfaceC5139a> f17606c;

    /* renamed from: d */
    public final List<AbstractC4548d.a> f17607d;

    /* renamed from: e */
    public final C4722m f17608e;

    /* renamed from: f */
    public final C4723n f17609f;

    /* renamed from: g */
    public final Executor f17610g;

    /* renamed from: h */
    public final Executor f17611h;

    /* renamed from: i */
    public final Executor f17612i;

    /* renamed from: j */
    public final Task<Void> f17613j;

    /* renamed from: k */
    public final InterfaceC4987a f17614k;

    /* renamed from: l */
    public InterfaceC4545a f17615l;

    /* renamed from: m */
    public AbstractC4546b f17616m;

    /* renamed from: n */
    public Task<AbstractC4546b> f17617n;

    public C4717h(C3767g c3767g, InterfaceC5896b<InterfaceC5149i> interfaceC5896b, @InterfaceC4321d Executor executor, @InterfaceC4320c Executor executor2, @InterfaceC4318a Executor executor3, @InterfaceC4319b ScheduledExecutorService scheduledExecutorService) {
        C2394s.m9619l(c3767g);
        C2394s.m9619l(interfaceC5896b);
        this.f17604a = c3767g;
        this.f17605b = interfaceC5896b;
        this.f17606c = new ArrayList();
        this.f17607d = new ArrayList();
        this.f17608e = new C4722m(c3767g.m14349m(), c3767g.m14352s());
        this.f17609f = new C4723n(c3767g.m14349m(), this, executor2, scheduledExecutorService);
        this.f17610g = executor;
        this.f17611h = executor2;
        this.f17612i = executor3;
        this.f17613j = m18545o(executor3);
        this.f17614k = new InterfaceC4987a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m18536j(AbstractC4546b abstractC4546b) {
        m18547q(abstractC4546b);
        Iterator<AbstractC4548d.a> it = this.f17607d.iterator();
        while (it.hasNext()) {
            it.next().m17981a(abstractC4546b);
        }
        C4711b m18529c = C4711b.m18529c(abstractC4546b);
        Iterator<InterfaceC5139a> it2 = this.f17606c.iterator();
        while (it2.hasNext()) {
            it2.next().mo15713a(m18529c);
        }
        return Tasks.forResult(abstractC4546b);
    }

    /* renamed from: k */
    public static /* synthetic */ Task m18537k(Task task) {
        return Tasks.forResult(task.isSuccessful() ? C4711b.m18529c((AbstractC4546b) task.getResult()) : C4711b.m18530d(new C3773m(task.getException().getMessage(), task.getException())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Task m18538l(boolean z10, Task task) {
        if (!z10 && m18544i()) {
            return Tasks.forResult(C4711b.m18529c(this.f17616m));
        }
        if (this.f17615l == null) {
            return Tasks.forResult(C4711b.m18530d(new C3773m("No AppCheckProvider installed.")));
        }
        Task<AbstractC4546b> task2 = this.f17617n;
        if (task2 == null || task2.isComplete() || this.f17617n.isCanceled()) {
            this.f17617n = m18543h();
        }
        return this.f17617n.continueWithTask(this.f17611h, new Continuation() { // from class: t7.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task m18537k;
                m18537k = C4717h.m18537k(task3);
                return m18537k;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m18539m(TaskCompletionSource taskCompletionSource) {
        AbstractC4546b m18559d = this.f17608e.m18559d();
        if (m18559d != null) {
            m18546p(m18559d);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m18540n(AbstractC4546b abstractC4546b) {
        this.f17608e.m18560e(abstractC4546b);
    }

    @Override // p308v7.InterfaceC5140b
    /* renamed from: a */
    public Task<AbstractC4547c> mo18541a(final boolean z10) {
        return this.f17613j.continueWithTask(this.f17611h, new Continuation() { // from class: t7.c
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m18538l;
                m18538l = C4717h.this.m18538l(z10, task);
                return m18538l;
            }
        });
    }

    @Override // p308v7.InterfaceC5140b
    /* renamed from: b */
    public void mo18542b(InterfaceC5139a interfaceC5139a) {
        C2394s.m9619l(interfaceC5139a);
        this.f17606c.add(interfaceC5139a);
        this.f17609f.m18565e(this.f17606c.size() + this.f17607d.size());
        if (m18544i()) {
            interfaceC5139a.mo15713a(C4711b.m18529c(this.f17616m));
        }
    }

    /* renamed from: h */
    public Task<AbstractC4546b> m18543h() {
        return this.f17615l.m17976a().onSuccessTask(this.f17610g, new SuccessContinuation() { // from class: t7.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m18536j;
                m18536j = C4717h.this.m18536j((AbstractC4546b) obj);
                return m18536j;
            }
        });
    }

    /* renamed from: i */
    public final boolean m18544i() {
        AbstractC4546b abstractC4546b = this.f17616m;
        return abstractC4546b != null && abstractC4546b.mo17977a() - this.f17614k.mo19550a() > 300000;
    }

    /* renamed from: o */
    public final Task<Void> m18545o(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: t7.f
            @Override // java.lang.Runnable
            public final void run() {
                C4717h.this.m18539m(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: p */
    public void m18546p(AbstractC4546b abstractC4546b) {
        this.f17616m = abstractC4546b;
    }

    /* renamed from: q */
    public final void m18547q(final AbstractC4546b abstractC4546b) {
        this.f17612i.execute(new Runnable() { // from class: t7.g
            @Override // java.lang.Runnable
            public final void run() {
                C4717h.this.m18540n(abstractC4546b);
            }
        });
        m18546p(abstractC4546b);
        this.f17609f.m18564d(abstractC4546b);
    }
}
