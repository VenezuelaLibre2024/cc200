package p226p9;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;
import p108h6.C2394s;
import p240q9.C4212c;
import p255r9.C4325b;

/* renamed from: p9.h */
/* loaded from: classes.dex */
public class RunnableC4078h implements Runnable {

    /* renamed from: h */
    public C4093p f14676h;

    /* renamed from: i */
    public TaskCompletionSource<Uri> f14677i;

    /* renamed from: j */
    public C4212c f14678j;

    public RunnableC4078h(C4093p c4093p, TaskCompletionSource<Uri> taskCompletionSource) {
        C2394s.m9619l(c4093p);
        C2394s.m9619l(taskCompletionSource);
        this.f14676h = c4093p;
        this.f14677i = taskCompletionSource;
        if (c4093p.m15844t().m15841q().equals(c4093p.m15841q())) {
            throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
        }
        C4074f m15845u = this.f14676h.m15845u();
        this.f14678j = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15704j());
    }

    /* renamed from: a */
    public final Uri m15726a(JSONObject jSONObject) {
        String optString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String str = optString.split(",", -1)[0];
        Uri.Builder buildUpon = this.f14676h.m15846v().m16237c().buildUpon();
        buildUpon.appendQueryParameter("alt", "media");
        buildUpon.appendQueryParameter("token", str);
        return buildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        C4325b c4325b = new C4325b(this.f14676h.m15846v(), this.f14676h.m15835i());
        this.f14678j.m16228d(c4325b);
        Uri m15726a = c4325b.m16605v() ? m15726a(c4325b.m16598n()) : null;
        TaskCompletionSource<Uri> taskCompletionSource = this.f14677i;
        if (taskCompletionSource != null) {
            c4325b.m16588a(taskCompletionSource, m15726a);
        }
    }
}
