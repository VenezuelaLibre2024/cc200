package p096g6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p079f6.C1842b;

/* renamed from: g6.a0 */
/* loaded from: classes.dex */
public final class C1999a0 {

    /* renamed from: a */
    public final Map f7983a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f7984b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void m8077c(BasePendingResult basePendingResult, boolean z10) {
        this.f7983a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.addStatusListener(new C2080y(this, basePendingResult));
    }

    /* renamed from: d */
    public final void m8078d(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.f7984b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new C2083z(this, taskCompletionSource));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8079e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.m8082h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096g6.C1999a0.m8079e(int, java.lang.String):void");
    }

    /* renamed from: f */
    public final void m8080f() {
        m8082h(false, C2018f.f8016y);
    }

    /* renamed from: g */
    public final boolean m8081g() {
        return (this.f7983a.isEmpty() && this.f7984b.isEmpty()) ? false : true;
    }

    /* renamed from: h */
    public final void m8082h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f7983a) {
            hashMap = new HashMap(this.f7983a);
        }
        synchronized (this.f7984b) {
            hashMap2 = new HashMap(this.f7984b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new C1842b(status));
            }
        }
    }
}
