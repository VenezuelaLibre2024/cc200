package p034c7;

import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import p108h6.C2394s;

/* renamed from: c7.i6 */
/* loaded from: classes.dex */
public final class C0739i6<V> extends FutureTask<V> implements Comparable<C0739i6<V>> {

    /* renamed from: h */
    public final long f3173h;

    /* renamed from: i */
    public final boolean f3174i;

    /* renamed from: j */
    public final String f3175j;

    /* renamed from: k */
    public final /* synthetic */ C0669d6 f3176k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739i6(C0669d6 c0669d6, Runnable runnable, boolean z10, String str) {
        super(zzcl.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.f3176k = c0669d6;
        C2394s.m9619l(str);
        atomicLong = C0669d6.f2860l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f3173h = andIncrement;
        this.f3175j = str;
        this.f3174i = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c0669d6.zzj().m3914B().m3995a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739i6(C0669d6 c0669d6, Callable<V> callable, boolean z10, String str) {
        super(zzcl.zza().zza(callable));
        AtomicLong atomicLong;
        this.f3176k = c0669d6;
        C2394s.m9619l(str);
        atomicLong = C0669d6.f2860l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f3173h = andIncrement;
        this.f3175j = str;
        this.f3174i = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c0669d6.zzj().m3914B().m3995a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C0739i6 c0739i6 = (C0739i6) obj;
        boolean z10 = this.f3174i;
        if (z10 != c0739i6.f3174i) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f3173h;
        long j11 = c0739i6.f3173h;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f3176k.zzj().m3916D().m3996b("Two tasks share the same index. index", Long.valueOf(this.f3173h));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f3176k.zzj().m3914B().m3996b(this.f3175j, th);
        super.setException(th);
    }
}
