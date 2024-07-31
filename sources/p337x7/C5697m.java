package p337x7;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import p108h6.C2394s;
import p321w7.AbstractC5369h0;
import p321w7.AbstractC5373i0;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5385l0;

/* renamed from: x7.m */
/* loaded from: classes.dex */
public final class C5697m extends AbstractC5369h0 {

    /* renamed from: a */
    public final C5685i f21215a;

    public C5697m(C5685i c5685i) {
        C2394s.m9619l(c5685i);
        this.f21215a = c5685i;
    }

    @Override // p321w7.AbstractC5369h0
    /* renamed from: a */
    public final Task<Void> mo21501a(AbstractC5373i0 abstractC5373i0, String str) {
        C2394s.m9619l(abstractC5373i0);
        C5685i c5685i = this.f21215a;
        return FirebaseAuth.getInstance(c5685i.mo21430d0()).m5218S(c5685i, abstractC5373i0, str);
    }

    @Override // p321w7.AbstractC5369h0
    /* renamed from: b */
    public final List<AbstractC5377j0> mo21502b() {
        return this.f21215a.zzh();
    }

    @Override // p321w7.AbstractC5369h0
    /* renamed from: c */
    public final Task<AbstractC5385l0> mo21503c() {
        return this.f21215a.m21409J(false).continueWithTask(new C5694l(this));
    }

    @Override // p321w7.AbstractC5369h0
    /* renamed from: d */
    public final Task<Void> mo21504d(String str) {
        C2394s.m9613f(str);
        C5685i c5685i = this.f21215a;
        return FirebaseAuth.getInstance(c5685i.mo21430d0()).m5216Q(c5685i, str);
    }
}
