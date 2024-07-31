package p240q9;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p096g6.C2026h;
import p096g6.InterfaceC2030i;

/* renamed from: q9.a */
/* loaded from: classes.dex */
public class C4210a {

    /* renamed from: c */
    public static final C4210a f15168c = new C4210a();

    /* renamed from: a */
    public final Map<Object, a> f15169a = new HashMap();

    /* renamed from: b */
    public final Object f15170b = new Object();

    /* renamed from: q9.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Activity f15171a;

        /* renamed from: b */
        public final Runnable f15172b;

        /* renamed from: c */
        public final Object f15173c;

        public a(Activity activity, Runnable runnable, Object obj) {
            this.f15171a = activity;
            this.f15172b = runnable;
            this.f15173c = obj;
        }

        /* renamed from: a */
        public Activity m16212a() {
            return this.f15171a;
        }

        /* renamed from: b */
        public Object m16213b() {
            return this.f15173c;
        }

        /* renamed from: c */
        public Runnable m16214c() {
            return this.f15172b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f15173c.equals(this.f15173c) && aVar.f15172b == this.f15172b && aVar.f15171a == this.f15171a;
        }

        public int hashCode() {
            return this.f15173c.hashCode();
        }
    }

    /* renamed from: q9.a$b */
    /* loaded from: classes.dex */
    public static class b extends LifecycleCallback {

        /* renamed from: a */
        public final List<a> f15174a;

        public b(InterfaceC2030i interfaceC2030i) {
            super(interfaceC2030i);
            this.f15174a = new ArrayList();
            this.mLifecycleFragment.mo8156a("StorageOnStopCallback", this);
        }

        /* renamed from: b */
        public static b m16215b(Activity activity) {
            InterfaceC2030i fragment = LifecycleCallback.getFragment(new C2026h(activity));
            b bVar = (b) fragment.mo8157b("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        /* renamed from: a */
        public void m16216a(a aVar) {
            synchronized (this.f15174a) {
                this.f15174a.add(aVar);
            }
        }

        /* renamed from: c */
        public void m16217c(a aVar) {
            synchronized (this.f15174a) {
                this.f15174a.remove(aVar);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f15174a) {
                arrayList = new ArrayList(this.f15174a);
                this.f15174a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.m16214c().run();
                    C4210a.m16209a().m16210b(aVar.m16213b());
                }
            }
        }
    }

    /* renamed from: a */
    public static C4210a m16209a() {
        return f15168c;
    }

    /* renamed from: b */
    public void m16210b(Object obj) {
        synchronized (this.f15170b) {
            a aVar = this.f15169a.get(obj);
            if (aVar != null) {
                b.m16215b(aVar.m16212a()).m16217c(aVar);
            }
        }
    }

    /* renamed from: c */
    public void m16211c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f15170b) {
            a aVar = new a(activity, runnable, obj);
            b.m16215b(activity).m16216a(aVar);
            this.f15169a.put(obj, aVar);
        }
    }
}
