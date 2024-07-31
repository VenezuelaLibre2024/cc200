package p029c2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: c2.v */
/* loaded from: classes.dex */
public abstract class AbstractC0604v {

    /* renamed from: a */
    public static final String f2635a = AbstractC0592j.m2972f("WorkerFactory");

    /* renamed from: c2.v$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0604v {
        @Override // p029c2.AbstractC0604v
        /* renamed from: a */
        public ListenableWorker mo3003a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static AbstractC0604v m3002c() {
        return new a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo3003a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker m3004b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker mo3003a = mo3003a(context, str, workerParameters);
        if (mo3003a == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                AbstractC0592j.m2970c().mo2974b(f2635a, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    mo3003a = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    AbstractC0592j.m2970c().mo2974b(f2635a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (mo3003a == null || !mo3003a.m2069k()) {
            return mo3003a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
