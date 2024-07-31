package p222p5;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: p5.c0 */
/* loaded from: classes.dex */
public final class C4019c0 {

    /* renamed from: a */
    public final Object f14455a = new Object();

    /* renamed from: b */
    public final PriorityQueue<Integer> f14456b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    public int f14457c = Integer.MIN_VALUE;

    /* renamed from: a */
    public void m15269a(int i10) {
        synchronized (this.f14455a) {
            this.f14456b.add(Integer.valueOf(i10));
            this.f14457c = Math.max(this.f14457c, i10);
        }
    }

    /* renamed from: b */
    public void m15270b(int i10) {
        synchronized (this.f14455a) {
            this.f14456b.remove(Integer.valueOf(i10));
            this.f14457c = this.f14456b.isEmpty() ? Integer.MIN_VALUE : ((Integer) C4041n0.m15463j(this.f14456b.peek())).intValue();
            this.f14455a.notifyAll();
        }
    }
}
