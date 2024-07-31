package p096g6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.AbstractC1856p;
import p079f6.InterfaceC1853m;
import p108h6.C2394s;

/* renamed from: g6.o1 */
/* loaded from: classes.dex */
public final class RunnableC2052o1 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC1853m f8116h;

    /* renamed from: i */
    public final /* synthetic */ C2061r1 f8117i;

    public RunnableC2052o1(C2061r1 c2061r1, InterfaceC1853m interfaceC1853m) {
        this.f8117i = c2061r1;
        this.f8116h = interfaceC1853m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        HandlerC2055p1 handlerC2055p1;
        HandlerC2055p1 handlerC2055p12;
        WeakReference weakReference2;
        AbstractC1846f abstractC1846f;
        AbstractC1856p abstractC1856p;
        HandlerC2055p1 handlerC2055p13;
        HandlerC2055p1 handlerC2055p14;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                abstractC1856p = this.f8117i.f8133a;
                AbstractC1848h m7606b = ((AbstractC1856p) C2394s.m9619l(abstractC1856p)).m7606b(this.f8116h);
                C2061r1 c2061r1 = this.f8117i;
                handlerC2055p13 = c2061r1.f8140h;
                handlerC2055p14 = c2061r1.f8140h;
                handlerC2055p13.sendMessage(handlerC2055p14.obtainMessage(0, m7606b));
                threadLocal.set(Boolean.FALSE);
                C2061r1 c2061r12 = this.f8117i;
                C2061r1.m8256o(this.f8116h);
                weakReference3 = this.f8117i.f8139g;
                abstractC1846f = (AbstractC1846f) weakReference3.get();
                if (abstractC1846f == null) {
                    return;
                }
            } catch (RuntimeException e10) {
                C2061r1 c2061r13 = this.f8117i;
                handlerC2055p1 = c2061r13.f8140h;
                handlerC2055p12 = c2061r13.f8140h;
                handlerC2055p1.sendMessage(handlerC2055p12.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                C2061r1 c2061r14 = this.f8117i;
                C2061r1.m8256o(this.f8116h);
                weakReference2 = this.f8117i.f8139g;
                abstractC1846f = (AbstractC1846f) weakReference2.get();
                if (abstractC1846f == null) {
                    return;
                }
            }
            abstractC1846f.mo7595i(this.f8117i);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            C2061r1 c2061r15 = this.f8117i;
            C2061r1.m8256o(this.f8116h);
            weakReference = this.f8117i.f8139g;
            AbstractC1846f abstractC1846f2 = (AbstractC1846f) weakReference.get();
            if (abstractC1846f2 != null) {
                abstractC1846f2.mo7595i(this.f8117i);
            }
            throw th;
        }
    }
}
