package p337x7;

import com.google.android.gms.tasks.OnFailureListener;
import p154k6.C3363a;
import p195n7.C3775o;

/* renamed from: x7.v */
/* loaded from: classes.dex */
public final class C5724v implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ RunnableC5727w f21259a;

    public C5724v(RunnableC5727w runnableC5727w) {
        this.f21259a = runnableC5727w;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C3363a c3363a;
        if (exc instanceof C3775o) {
            c3363a = C5718t.f21245h;
            c3363a.m12512g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f21259a.f21268i.m22824d();
        }
    }
}
