package p222p5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: p5.g0 */
/* loaded from: classes.dex */
public class C4027g0 implements InterfaceC4020d {
    @Override // p222p5.InterfaceC4020d
    /* renamed from: a */
    public long mo15271a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p222p5.InterfaceC4020d
    /* renamed from: b */
    public long mo15272b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p222p5.InterfaceC4020d
    /* renamed from: c */
    public InterfaceC4040n mo15273c(Looper looper, Handler.Callback callback) {
        return new C4029h0(new Handler(looper, callback));
    }

    @Override // p222p5.InterfaceC4020d
    /* renamed from: d */
    public void mo15274d() {
    }
}
