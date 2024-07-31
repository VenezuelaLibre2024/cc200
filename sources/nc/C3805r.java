package nc;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: nc.r */
/* loaded from: classes2.dex */
public class C3805r implements InterfaceC3801n {

    /* renamed from: a */
    public final String f13710a;

    /* renamed from: b */
    public final int f13711b;

    /* renamed from: c */
    public HandlerThread f13712c;

    /* renamed from: d */
    public Handler f13713d;

    public C3805r(String str, int i10) {
        this.f13710a = str;
        this.f13711b = i10;
    }

    @Override // nc.InterfaceC3801n
    /* renamed from: a */
    public void mo14501a(C3798k c3798k) {
        this.f13713d.post(c3798k.f13690b);
    }

    @Override // nc.InterfaceC3801n
    /* renamed from: c */
    public void mo14502c() {
        HandlerThread handlerThread = this.f13712c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13712c = null;
            this.f13713d = null;
        }
    }

    @Override // nc.InterfaceC3801n
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f13710a, this.f13711b);
        this.f13712c = handlerThread;
        handlerThread.start();
        this.f13713d = new Handler(this.f13712c.getLooper());
    }
}
