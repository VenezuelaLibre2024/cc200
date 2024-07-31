package se;

/* renamed from: se.b */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4593b implements Runnable {

    /* renamed from: h */
    public final String f17226h;

    public AbstractRunnableC4593b(String str, Object... objArr) {
        this.f17226h = C4596e.m18108p(str, objArr);
    }

    /* renamed from: k */
    public abstract void mo16654k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f17226h);
        try {
            mo16654k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
