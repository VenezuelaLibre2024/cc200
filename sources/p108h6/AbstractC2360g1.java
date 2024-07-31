package p108h6;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: h6.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC2360g1 {

    /* renamed from: a */
    public Object f9634a;

    /* renamed from: b */
    public boolean f9635b = false;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2346c f9636c;

    public AbstractC2360g1(AbstractC2346c abstractC2346c, Object obj) {
        this.f9636c = abstractC2346c;
        this.f9634a = obj;
    }

    /* renamed from: a */
    public abstract void mo9553a(Object obj);

    /* renamed from: b */
    public abstract void mo9554b();

    /* renamed from: c */
    public final void m9555c() {
        Object obj;
        synchronized (this) {
            obj = this.f9634a;
            if (this.f9635b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo9553a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f9635b = true;
        }
        m9557e();
    }

    /* renamed from: d */
    public final void m9556d() {
        synchronized (this) {
            this.f9634a = null;
        }
    }

    /* renamed from: e */
    public final void m9557e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m9556d();
        arrayList = this.f9636c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f9636c.zzt;
            arrayList2.remove(this);
        }
    }
}
