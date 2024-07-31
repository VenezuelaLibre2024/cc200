package p108h6;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1848h;
import p079f6.InterfaceC1853m;

/* renamed from: h6.r */
/* loaded from: classes.dex */
public class C2391r {

    /* renamed from: a */
    public static final InterfaceC2389q0 f9692a = new C2380n0();

    /* renamed from: h6.r$a */
    /* loaded from: classes.dex */
    public interface a<R extends InterfaceC1853m, T> {
        /* renamed from: a */
        T mo300a(R r10);
    }

    /* renamed from: a */
    public static <R extends InterfaceC1853m, T> Task<T> m9606a(AbstractC1848h<R> abstractC1848h, a<R, T> aVar) {
        InterfaceC2389q0 interfaceC2389q0 = f9692a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC1848h.addStatusListener(new C2383o0(abstractC1848h, taskCompletionSource, aVar, interfaceC2389q0));
        return taskCompletionSource.getTask();
    }

    /* renamed from: b */
    public static <R extends InterfaceC1853m> Task<Void> m9607b(AbstractC1848h<R> abstractC1848h) {
        return m9606a(abstractC1848h, new C2386p0());
    }
}
