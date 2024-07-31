package p226p9;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p9.f0 */
/* loaded from: classes.dex */
public class C4075f0 {

    /* renamed from: c */
    public static final C4075f0 f14663c = new C4075f0();

    /* renamed from: a */
    public final Map<String, WeakReference<AbstractC4073e0<?>>> f14664a = new HashMap();

    /* renamed from: b */
    public final Object f14665b = new Object();

    /* renamed from: b */
    public static C4075f0 m15714b() {
        return f14663c;
    }

    /* renamed from: a */
    public void m15715a(AbstractC4073e0<?> abstractC4073e0) {
        synchronized (this.f14665b) {
            this.f14664a.put(abstractC4073e0.mo15622I().toString(), new WeakReference<>(abstractC4073e0));
        }
    }

    /* renamed from: c */
    public void m15716c(AbstractC4073e0<?> abstractC4073e0) {
        synchronized (this.f14665b) {
            String c4093p = abstractC4073e0.mo15622I().toString();
            WeakReference<AbstractC4073e0<?>> weakReference = this.f14664a.get(c4093p);
            AbstractC4073e0<?> abstractC4073e02 = weakReference != null ? weakReference.get() : null;
            if (abstractC4073e02 == null || abstractC4073e02 == abstractC4073e0) {
                this.f14664a.remove(c4093p);
            }
        }
    }
}
