package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0343e0;
import androidx.lifecycle.C0345f0;
import androidx.lifecycle.C0349h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes.dex */
public final class C0289a0 extends AbstractC0343e0 {

    /* renamed from: k */
    public static final C0345f0.b f1345k = new a();

    /* renamed from: g */
    public final boolean f1349g;

    /* renamed from: d */
    public final HashMap<String, Fragment> f1346d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C0289a0> f1347e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, C0349h0> f1348f = new HashMap<>();

    /* renamed from: h */
    public boolean f1350h = false;

    /* renamed from: i */
    public boolean f1351i = false;

    /* renamed from: j */
    public boolean f1352j = false;

    /* renamed from: androidx.fragment.app.a0$a */
    /* loaded from: classes.dex */
    public class a implements C0345f0.b {
        @Override // androidx.lifecycle.C0345f0.b
        /* renamed from: a */
        public <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
            return new C0289a0(true);
        }
    }

    public C0289a0(boolean z10) {
        this.f1349g = z10;
    }

    /* renamed from: l */
    public static C0289a0 m1375l(C0349h0 c0349h0) {
        return (C0289a0) new C0345f0(c0349h0, f1345k).m1812a(C0289a0.class);
    }

    @Override // androidx.lifecycle.AbstractC0343e0
    /* renamed from: d */
    public void mo1376d() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1350h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0289a0.class != obj.getClass()) {
            return false;
        }
        C0289a0 c0289a0 = (C0289a0) obj;
        return this.f1346d.equals(c0289a0.f1346d) && this.f1347e.equals(c0289a0.f1347e) && this.f1348f.equals(c0289a0.f1348f);
    }

    /* renamed from: f */
    public void m1377f(Fragment fragment) {
        if (this.f1352j) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1346d.containsKey(fragment.mWho)) {
                return;
            }
            this.f1346d.put(fragment.mWho, fragment);
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: g */
    public void m1378g(Fragment fragment) {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m1380i(fragment.mWho);
    }

    /* renamed from: h */
    public void m1379h(String str) {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m1380i(str);
    }

    public int hashCode() {
        return (((this.f1346d.hashCode() * 31) + this.f1347e.hashCode()) * 31) + this.f1348f.hashCode();
    }

    /* renamed from: i */
    public final void m1380i(String str) {
        C0289a0 c0289a0 = this.f1347e.get(str);
        if (c0289a0 != null) {
            c0289a0.mo1376d();
            this.f1347e.remove(str);
        }
        C0349h0 c0349h0 = this.f1348f.get(str);
        if (c0349h0 != null) {
            c0349h0.m1823a();
            this.f1348f.remove(str);
        }
    }

    /* renamed from: j */
    public Fragment m1381j(String str) {
        return this.f1346d.get(str);
    }

    /* renamed from: k */
    public C0289a0 m1382k(Fragment fragment) {
        C0289a0 c0289a0 = this.f1347e.get(fragment.mWho);
        if (c0289a0 != null) {
            return c0289a0;
        }
        C0289a0 c0289a02 = new C0289a0(this.f1349g);
        this.f1347e.put(fragment.mWho, c0289a02);
        return c0289a02;
    }

    /* renamed from: m */
    public Collection<Fragment> m1383m() {
        return new ArrayList(this.f1346d.values());
    }

    /* renamed from: n */
    public C0349h0 m1384n(Fragment fragment) {
        C0349h0 c0349h0 = this.f1348f.get(fragment.mWho);
        if (c0349h0 != null) {
            return c0349h0;
        }
        C0349h0 c0349h02 = new C0349h0();
        this.f1348f.put(fragment.mWho, c0349h02);
        return c0349h02;
    }

    /* renamed from: o */
    public boolean m1385o() {
        return this.f1350h;
    }

    /* renamed from: p */
    public void m1386p(Fragment fragment) {
        if (this.f1352j) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f1346d.remove(fragment.mWho) != null) && AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: q */
    public void m1387q(boolean z10) {
        this.f1352j = z10;
    }

    /* renamed from: r */
    public boolean m1388r(Fragment fragment) {
        if (this.f1346d.containsKey(fragment.mWho)) {
            return this.f1349g ? this.f1350h : !this.f1351i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f1346d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f1347e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1348f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
