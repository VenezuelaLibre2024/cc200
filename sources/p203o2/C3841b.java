package p203o2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p178m2.ExecutorC3506g;

/* renamed from: o2.b */
/* loaded from: classes.dex */
public class C3841b implements InterfaceC3840a {

    /* renamed from: a */
    public final ExecutorC3506g f13857a;

    /* renamed from: b */
    public final Handler f13858b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f13859c = new a();

    /* renamed from: o2.b$a */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3841b.this.m14613d(runnable);
        }
    }

    public C3841b(Executor executor) {
        this.f13857a = new ExecutorC3506g(executor);
    }

    @Override // p203o2.InterfaceC3840a
    /* renamed from: a */
    public Executor mo14610a() {
        return this.f13859c;
    }

    @Override // p203o2.InterfaceC3840a
    /* renamed from: b */
    public void mo14611b(Runnable runnable) {
        this.f13857a.execute(runnable);
    }

    @Override // p203o2.InterfaceC3840a
    /* renamed from: c */
    public ExecutorC3506g mo14612c() {
        return this.f13857a;
    }

    /* renamed from: d */
    public void m14613d(Runnable runnable) {
        this.f13858b.post(runnable);
    }
}
