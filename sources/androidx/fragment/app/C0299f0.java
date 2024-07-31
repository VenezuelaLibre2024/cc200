package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.f0 */
/* loaded from: classes.dex */
public class C0299f0 {

    /* renamed from: a */
    public final ArrayList<Fragment> f1459a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0297e0> f1460b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C0295d0> f1461c = new HashMap<>();

    /* renamed from: d */
    public C0289a0 f1462d;

    /* renamed from: A */
    public void m1457A(C0289a0 c0289a0) {
        this.f1462d = c0289a0;
    }

    /* renamed from: B */
    public C0295d0 m1458B(String str, C0295d0 c0295d0) {
        return c0295d0 != null ? this.f1461c.put(str, c0295d0) : this.f1461c.remove(str);
    }

    /* renamed from: a */
    public void m1459a(Fragment fragment) {
        if (this.f1459a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1459a) {
            this.f1459a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    public void m1460b() {
        this.f1460b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m1461c(String str) {
        return this.f1460b.get(str) != null;
    }

    /* renamed from: d */
    public void m1462d(int i10) {
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null) {
                c0297e0.m1454t(i10);
            }
        }
    }

    /* renamed from: e */
    public void m1463e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1460b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0297e0 c0297e0 : this.f1460b.values()) {
                printWriter.print(str);
                if (c0297e0 != null) {
                    Fragment m1445k = c0297e0.m1445k();
                    printWriter.println(m1445k);
                    m1445k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1459a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f1459a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m1464f(String str) {
        C0297e0 c0297e0 = this.f1460b.get(str);
        if (c0297e0 != null) {
            return c0297e0.m1445k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m1465g(int i10) {
        for (int size = this.f1459a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1459a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null) {
                Fragment m1445k = c0297e0.m1445k();
                if (m1445k.mFragmentId == i10) {
                    return m1445k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m1466h(String str) {
        if (str != null) {
            for (int size = this.f1459a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1459a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null) {
                Fragment m1445k = c0297e0.m1445k();
                if (str.equals(m1445k.mTag)) {
                    return m1445k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m1467i(String str) {
        Fragment findFragmentByWho;
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null && (findFragmentByWho = c0297e0.m1445k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m1468j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f1459a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f1459a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f1459a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f1459a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List<C0297e0> m1469k() {
        ArrayList arrayList = new ArrayList();
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null) {
                arrayList.add(c0297e0);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> m1470l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0297e0> it = this.f1460b.values().iterator();
        while (it.hasNext()) {
            C0297e0 next = it.next();
            arrayList.add(next != null ? next.m1445k() : null);
        }
        return arrayList;
    }

    /* renamed from: m */
    public ArrayList<C0295d0> m1471m() {
        return new ArrayList<>(this.f1461c.values());
    }

    /* renamed from: n */
    public C0297e0 m1472n(String str) {
        return this.f1460b.get(str);
    }

    /* renamed from: o */
    public List<Fragment> m1473o() {
        ArrayList arrayList;
        if (this.f1459a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1459a) {
            arrayList = new ArrayList(this.f1459a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public C0289a0 m1474p() {
        return this.f1462d;
    }

    /* renamed from: q */
    public C0295d0 m1475q(String str) {
        return this.f1461c.get(str);
    }

    /* renamed from: r */
    public void m1476r(C0297e0 c0297e0) {
        Fragment m1445k = c0297e0.m1445k();
        if (m1461c(m1445k.mWho)) {
            return;
        }
        this.f1460b.put(m1445k.mWho, c0297e0);
        if (m1445k.mRetainInstanceChangedWhileDetached) {
            if (m1445k.mRetainInstance) {
                this.f1462d.m1377f(m1445k);
            } else {
                this.f1462d.m1386p(m1445k);
            }
            m1445k.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m1445k);
        }
    }

    /* renamed from: s */
    public void m1477s(C0297e0 c0297e0) {
        Fragment m1445k = c0297e0.m1445k();
        if (m1445k.mRetainInstance) {
            this.f1462d.m1386p(m1445k);
        }
        if (this.f1460b.put(m1445k.mWho, null) != null && AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m1445k);
        }
    }

    /* renamed from: t */
    public void m1478t() {
        Iterator<Fragment> it = this.f1459a.iterator();
        while (it.hasNext()) {
            C0297e0 c0297e0 = this.f1460b.get(it.next().mWho);
            if (c0297e0 != null) {
                c0297e0.m1447m();
            }
        }
        for (C0297e0 c0297e02 : this.f1460b.values()) {
            if (c0297e02 != null) {
                c0297e02.m1447m();
                Fragment m1445k = c0297e02.m1445k();
                if (m1445k.mRemoving && !m1445k.isInBackStack()) {
                    if (m1445k.mBeingSaved && !this.f1461c.containsKey(m1445k.mWho)) {
                        c0297e02.m1452r();
                    }
                    m1477s(c0297e02);
                }
            }
        }
    }

    /* renamed from: u */
    public void m1479u(Fragment fragment) {
        synchronized (this.f1459a) {
            this.f1459a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: v */
    public void m1480v() {
        this.f1460b.clear();
    }

    /* renamed from: w */
    public void m1481w(List<String> list) {
        this.f1459a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m1464f = m1464f(str);
                if (m1464f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m1464f);
                }
                m1459a(m1464f);
            }
        }
    }

    /* renamed from: x */
    public void m1482x(ArrayList<C0295d0> arrayList) {
        this.f1461c.clear();
        Iterator<C0295d0> it = arrayList.iterator();
        while (it.hasNext()) {
            C0295d0 next = it.next();
            this.f1461c.put(next.f1416i, next);
        }
    }

    /* renamed from: y */
    public ArrayList<String> m1483y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f1460b.size());
        for (C0297e0 c0297e0 : this.f1460b.values()) {
            if (c0297e0 != null) {
                Fragment m1445k = c0297e0.m1445k();
                c0297e0.m1452r();
                arrayList.add(m1445k.mWho);
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m1445k + ": " + m1445k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public ArrayList<String> m1484z() {
        synchronized (this.f1459a) {
            if (this.f1459a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1459a.size());
            Iterator<Fragment> it = this.f1459a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
