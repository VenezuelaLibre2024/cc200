package p240q9;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p226p9.C4077g0;

/* renamed from: q9.g */
/* loaded from: classes.dex */
public class C4216g {

    /* renamed from: b */
    public static boolean f15189b = false;

    /* renamed from: a */
    public final Executor f15190a;

    @SuppressLint({"ThreadPoolCreation"})
    public C4216g(Executor executor) {
        this.f15190a = executor == null ? !f15189b ? C4077g0.m15718b().m15721c() : null : executor;
    }

    /* renamed from: a */
    public void m16234a(Runnable runnable) {
        C2394s.m9619l(runnable);
        Executor executor = this.f15190a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            C4077g0.m15718b().m15722e(runnable);
        }
    }
}
