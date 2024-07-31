package p021b6;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p079f6.AbstractC1846f;
import p091g1.AbstractC1958a;
import p096g6.InterfaceC2059r;

/* renamed from: b6.g */
/* loaded from: classes.dex */
public final class C0488g extends AbstractC1958a implements InterfaceC2059r {

    /* renamed from: p */
    public final Semaphore f2286p;

    /* renamed from: q */
    public final Set f2287q;

    public C0488g(Context context, Set set) {
        super(context);
        this.f2286p = new Semaphore(0);
        this.f2287q = set;
    }

    @Override // p091g1.AbstractC1958a
    /* renamed from: C */
    public final /* bridge */ /* synthetic */ Object mo2432C() {
        Iterator it = this.f2287q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((AbstractC1846f) it.next()).m7592f(this)) {
                i10++;
            }
        }
        try {
            this.f2286p.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p091g1.C1959b
    /* renamed from: p */
    public final void mo2433p() {
        this.f2286p.drainPermits();
        m7900h();
    }
}
