package p195n7;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: n7.r */
/* loaded from: classes.dex */
public abstract class AbstractC3778r {
    /* renamed from: a */
    public static AbstractC3778r m14378a(long j10, long j11, long j12) {
        return new C3761a(j10, j11, j12);
    }

    /* renamed from: e */
    public static AbstractC3778r m14379e() {
        return m14378a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo14320b();

    /* renamed from: c */
    public abstract long mo14321c();

    /* renamed from: d */
    public abstract long mo14322d();
}
