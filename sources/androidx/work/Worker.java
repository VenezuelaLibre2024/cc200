package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import p170l7.InterfaceFutureC3445f;
import p190n2.C3703c;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: m */
    public C3703c<ListenableWorker.AbstractC0413a> f1961m;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes.dex */
    public class RunnableC0414a implements Runnable {
        public RunnableC0414a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f1961m.mo13971p(Worker.this.mo2082q());
            } catch (Throwable th) {
                Worker.this.f1961m.mo13972q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    /* renamed from: o */
    public final InterfaceFutureC3445f<ListenableWorker.AbstractC0413a> mo2073o() {
        this.f1961m = C3703c.m13982t();
        m2062c().execute(new RunnableC0414a());
        return this.f1961m;
    }

    /* renamed from: q */
    public abstract ListenableWorker.AbstractC0413a mo2082q();
}
