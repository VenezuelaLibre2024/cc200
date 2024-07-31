package p226p9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import p226p9.C4092o;
import p240q9.C4212c;
import p255r9.C4334k;

/* renamed from: p9.m0 */
/* loaded from: classes.dex */
public class RunnableC4089m0 implements Runnable {

    /* renamed from: h */
    public final C4093p f14725h;

    /* renamed from: i */
    public final TaskCompletionSource<C4092o> f14726i;

    /* renamed from: j */
    public final C4092o f14727j;

    /* renamed from: k */
    public C4092o f14728k = null;

    /* renamed from: l */
    public C4212c f14729l;

    public RunnableC4089m0(C4093p c4093p, TaskCompletionSource<C4092o> taskCompletionSource, C4092o c4092o) {
        this.f14725h = c4093p;
        this.f14726i = taskCompletionSource;
        this.f14727j = c4092o;
        C4074f m15845u = c4093p.m15845u();
        this.f14729l = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15704j());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4334k c4334k = new C4334k(this.f14725h.m15846v(), this.f14725h.m15835i(), this.f14727j.m15803q());
        this.f14729l.m16228d(c4334k);
        if (c4334k.m16605v()) {
            try {
                this.f14728k = new C4092o.b(c4334k.m16598n(), this.f14725h).m15813a();
            } catch (JSONException e10) {
                Log.e("UpdateMetadataTask", "Unable to parse a valid JSON object from resulting metadata:" + c4334k.m16597m(), e10);
                this.f14726i.setException(C4090n.m15757d(e10));
                return;
            }
        }
        TaskCompletionSource<C4092o> taskCompletionSource = this.f14726i;
        if (taskCompletionSource != null) {
            c4334k.m16588a(taskCompletionSource, this.f14728k);
        }
    }
}
