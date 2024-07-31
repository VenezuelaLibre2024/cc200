package p048d6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: d6.y */
/* loaded from: classes.dex */
public abstract class AbstractC1592y {

    /* renamed from: a */
    public final int f5908a;

    /* renamed from: b */
    public final TaskCompletionSource f5909b = new TaskCompletionSource();

    /* renamed from: c */
    public final int f5910c;

    /* renamed from: d */
    public final Bundle f5911d;

    public AbstractC1592y(int i10, int i11, Bundle bundle) {
        this.f5908a = i10;
        this.f5910c = i11;
        this.f5911d = bundle;
    }

    /* renamed from: a */
    public abstract void mo6391a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo6392b();

    /* renamed from: c */
    public final void m6430c(C1593z c1593z) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c1593z.toString());
        }
        this.f5909b.setException(c1593z);
    }

    /* renamed from: d */
    public final void m6431d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f5909b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f5910c + " id=" + this.f5908a + " oneWay=" + mo6392b() + "}";
    }
}
