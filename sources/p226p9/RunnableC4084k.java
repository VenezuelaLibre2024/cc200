package p226p9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import p108h6.C2394s;
import p240q9.C4212c;
import p255r9.C4327d;

/* renamed from: p9.k */
/* loaded from: classes.dex */
public class RunnableC4084k implements Runnable {

    /* renamed from: h */
    public final C4093p f14712h;

    /* renamed from: i */
    public final TaskCompletionSource<C4082j> f14713i;

    /* renamed from: j */
    public final C4212c f14714j;

    /* renamed from: k */
    public final String f14715k;

    /* renamed from: l */
    public final Integer f14716l;

    public RunnableC4084k(C4093p c4093p, Integer num, String str, TaskCompletionSource<C4082j> taskCompletionSource) {
        C2394s.m9619l(c4093p);
        C2394s.m9619l(taskCompletionSource);
        this.f14712h = c4093p;
        this.f14716l = num;
        this.f14715k = str;
        this.f14713i = taskCompletionSource;
        C4074f m15845u = c4093p.m15845u();
        this.f14714j = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15703i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C4082j m15741a;
        C4327d c4327d = new C4327d(this.f14712h.m15846v(), this.f14712h.m15835i(), this.f14716l, this.f14715k);
        this.f14714j.m16228d(c4327d);
        if (c4327d.m16605v()) {
            try {
                m15741a = C4082j.m15741a(this.f14712h.m15845u(), c4327d.m16598n());
            } catch (JSONException e10) {
                Log.e("ListTask", "Unable to parse response body. " + c4327d.m16597m(), e10);
                this.f14713i.setException(C4090n.m15757d(e10));
                return;
            }
        } else {
            m15741a = null;
        }
        TaskCompletionSource<C4082j> taskCompletionSource = this.f14713i;
        if (taskCompletionSource != null) {
            c4327d.m16588a(taskCompletionSource, m15741a);
        }
    }
}
