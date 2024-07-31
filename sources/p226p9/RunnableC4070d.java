package p226p9;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p240q9.C4212c;
import p255r9.C4324a;

/* renamed from: p9.d */
/* loaded from: classes.dex */
public class RunnableC4070d implements Runnable {

    /* renamed from: h */
    public C4093p f14625h;

    /* renamed from: i */
    public TaskCompletionSource<Void> f14626i;

    /* renamed from: j */
    public C4212c f14627j;

    public RunnableC4070d(C4093p c4093p, TaskCompletionSource<Void> taskCompletionSource) {
        C2394s.m9619l(c4093p);
        C2394s.m9619l(taskCompletionSource);
        this.f14625h = c4093p;
        this.f14626i = taskCompletionSource;
        C4074f m15845u = c4093p.m15845u();
        this.f14627j = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15703i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4324a c4324a = new C4324a(this.f14625h.m15846v(), this.f14625h.m15835i());
        this.f14627j.m16228d(c4324a);
        c4324a.m16588a(this.f14626i, null);
    }
}
