package p337x7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p321w7.AbstractC5341a0;
import p321w7.InterfaceC5372i;

/* renamed from: x7.j1 */
/* loaded from: classes.dex */
public final class C5690j1 {

    /* renamed from: c */
    public static final C5690j1 f21200c = new C5690j1();

    /* renamed from: a */
    public final C5707p0 f21201a;

    /* renamed from: b */
    public final C5654a0 f21202b;

    public C5690j1() {
        this(C5707p0.m22804j(), C5654a0.m22715b());
    }

    public C5690j1(C5707p0 c5707p0, C5654a0 c5654a0) {
        this.f21201a = c5707p0;
        this.f21202b = c5654a0;
    }

    /* renamed from: f */
    public static C5690j1 m22769f() {
        return f21200c;
    }

    /* renamed from: a */
    public final void m22770a(Context context) {
        this.f21201a.m22805a(context);
    }

    /* renamed from: b */
    public final void m22771b(FirebaseAuth firebaseAuth) {
        this.f21201a.m22806h(firebaseAuth);
    }

    /* renamed from: c */
    public final boolean m22772c(Activity activity, TaskCompletionSource<InterfaceC5372i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f21202b.m22723i(activity, taskCompletionSource, firebaseAuth);
    }

    /* renamed from: d */
    public final boolean m22773d(Activity activity, TaskCompletionSource<InterfaceC5372i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        return this.f21202b.m22724j(activity, taskCompletionSource, firebaseAuth, abstractC5341a0);
    }

    /* renamed from: e */
    public final Task<String> m22774e() {
        return this.f21201a.m22807i();
    }
}
