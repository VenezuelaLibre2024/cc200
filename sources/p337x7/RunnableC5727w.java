package p337x7;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p154k6.C3363a;
import p195n7.C3767g;
import p321w7.C5349c0;

/* renamed from: x7.w */
/* loaded from: classes.dex */
public final class RunnableC5727w implements Runnable {

    /* renamed from: h */
    public final String f21267h;

    /* renamed from: i */
    public final /* synthetic */ C5718t f21268i;

    public RunnableC5727w(C5718t c5718t, String str) {
        this.f21268i = c5718t;
        this.f21267h = C2394s.m9613f(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3363a c3363a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C3767g.m14335p(this.f21267h));
        if (firebaseAuth.m5238j() != null) {
            Task<C5349c0> mo5225a = firebaseAuth.mo5225a(true);
            c3363a = C5718t.f21245h;
            c3363a.m12512g("Token refreshing started", new Object[0]);
            mo5225a.addOnFailureListener(new C5724v(this));
        }
    }
}
