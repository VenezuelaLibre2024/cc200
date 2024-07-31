package p226p9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import p108h6.C2394s;
import p226p9.C4092o;
import p240q9.C4212c;
import p255r9.C4325b;

/* renamed from: p9.i */
/* loaded from: classes.dex */
public class RunnableC4080i implements Runnable {

    /* renamed from: h */
    public C4093p f14700h;

    /* renamed from: i */
    public TaskCompletionSource<C4092o> f14701i;

    /* renamed from: j */
    public C4092o f14702j;

    /* renamed from: k */
    public C4212c f14703k;

    public RunnableC4080i(C4093p c4093p, TaskCompletionSource<C4092o> taskCompletionSource) {
        C2394s.m9619l(c4093p);
        C2394s.m9619l(taskCompletionSource);
        this.f14700h = c4093p;
        this.f14701i = taskCompletionSource;
        if (c4093p.m15844t().m15841q().equals(c4093p.m15841q())) {
            throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
        }
        C4074f m15845u = this.f14700h.m15845u();
        this.f14703k = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15703i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4325b c4325b = new C4325b(this.f14700h.m15846v(), this.f14700h.m15835i());
        this.f14703k.m16228d(c4325b);
        if (c4325b.m16605v()) {
            try {
                this.f14702j = new C4092o.b(c4325b.m16598n(), this.f14700h).m15813a();
            } catch (JSONException e10) {
                Log.e("GetMetadataTask", "Unable to parse resulting metadata. " + c4325b.m16597m(), e10);
                this.f14701i.setException(C4090n.m15757d(e10));
                return;
            }
        }
        TaskCompletionSource<C4092o> taskCompletionSource = this.f14701i;
        if (taskCompletionSource != null) {
            c4325b.m16588a(taskCompletionSource, this.f14702j);
        }
    }
}
