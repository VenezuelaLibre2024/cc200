package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0301g0;
import androidx.fragment.app.AbstractC0326x;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0288a extends AbstractC0301g0 implements AbstractC0326x.n {

    /* renamed from: t */
    public final AbstractC0326x f1341t;

    /* renamed from: u */
    public boolean f1342u;

    /* renamed from: v */
    public int f1343v;

    /* renamed from: w */
    public boolean f1344w;

    public C0288a(AbstractC0326x abstractC0326x) {
        super(abstractC0326x.m1726t0(), abstractC0326x.m1732v0() != null ? abstractC0326x.m1732v0().m1597f().getClassLoader() : null);
        this.f1343v = -1;
        this.f1344w = false;
        this.f1341t = abstractC0326x;
    }

    @Override // androidx.fragment.app.AbstractC0326x.n
    /* renamed from: a */
    public boolean mo1358a(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1472i) {
            return true;
        }
        this.f1341t.m1695i(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: f */
    public int mo1359f() {
        return m1366o(false);
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: g */
    public int mo1360g() {
        return m1366o(true);
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: h */
    public void mo1361h() {
        m1489j();
        this.f1341t.m1686d0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: i */
    public void mo1362i() {
        m1489j();
        this.f1341t.m1686d0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: k */
    public void mo1363k(int i10, Fragment fragment, String str, int i11) {
        super.mo1363k(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f1341t;
    }

    @Override // androidx.fragment.app.AbstractC0301g0
    /* renamed from: l */
    public AbstractC0301g0 mo1364l(Fragment fragment) {
        AbstractC0326x abstractC0326x = fragment.mFragmentManager;
        if (abstractC0326x == null || abstractC0326x == this.f1341t) {
            return super.mo1364l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: n */
    public void m1365n(int i10) {
        if (this.f1472i) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f1466c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0301g0.a aVar = this.f1466c.get(i11);
                Fragment fragment = aVar.f1484b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1484b + " to " + aVar.f1484b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public int m1366o(boolean z10) {
        if (this.f1342u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0311l0("FragmentManager"));
            m1367p("  ", printWriter);
            printWriter.close();
        }
        this.f1342u = true;
        this.f1343v = this.f1472i ? this.f1341t.m1706m() : -1;
        this.f1341t.m1680a0(this, z10);
        return this.f1343v;
    }

    /* renamed from: p */
    public void m1367p(String str, PrintWriter printWriter) {
        m1368q(str, printWriter, true);
    }

    /* renamed from: q */
    public void m1368q(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1474k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1343v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1342u);
            if (this.f1471h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1471h));
            }
            if (this.f1467d != 0 || this.f1468e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1467d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1468e));
            }
            if (this.f1469f != 0 || this.f1470g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1469f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1470g));
            }
            if (this.f1475l != 0 || this.f1476m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1475l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1476m);
            }
            if (this.f1477n != 0 || this.f1478o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1477n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1478o);
            }
        }
        if (this.f1466c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1466c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0301g0.a aVar = this.f1466c.get(i10);
            switch (aVar.f1483a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1483a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1484b);
            if (z10) {
                if (aVar.f1486d != 0 || aVar.f1487e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1486d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1487e));
                }
                if (aVar.f1488f != 0 || aVar.f1489g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1488f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1489g));
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* renamed from: r */
    public void m1369r() {
        AbstractC0326x abstractC0326x;
        int size = this.f1466c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0301g0.a aVar = this.f1466c.get(i10);
            Fragment fragment = aVar.f1484b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f1344w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f1471h);
                fragment.setSharedElementNames(this.f1479p, this.f1480q);
            }
            switch (aVar.f1483a) {
                case 1:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, false);
                    this.f1341t.m1698j(fragment);
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1483a);
                case 3:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1694h1(fragment);
                case 4:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1645F0(fragment);
                case 5:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, false);
                    this.f1341t.m1727t1(fragment);
                case 6:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1739y(fragment);
                case 7:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, false);
                    this.f1341t.m1710o(fragment);
                case 8:
                    abstractC0326x = this.f1341t;
                    abstractC0326x.m1721r1(fragment);
                case 9:
                    abstractC0326x = this.f1341t;
                    fragment = null;
                    abstractC0326x.m1721r1(fragment);
                case 10:
                    this.f1341t.m1718q1(fragment, aVar.f1491i);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002f. Please report as an issue. */
    /* renamed from: s */
    public void m1370s() {
        AbstractC0326x abstractC0326x;
        for (int size = this.f1466c.size() - 1; size >= 0; size--) {
            AbstractC0301g0.a aVar = this.f1466c.get(size);
            Fragment fragment = aVar.f1484b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f1344w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(AbstractC0326x.m1634m1(this.f1471h));
                fragment.setSharedElementNames(this.f1480q, this.f1479p);
            }
            switch (aVar.f1483a) {
                case 1:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, true);
                    this.f1341t.m1694h1(fragment);
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1483a);
                case 3:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1698j(fragment);
                case 4:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1727t1(fragment);
                case 5:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, true);
                    this.f1341t.m1645F0(fragment);
                case 6:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1710o(fragment);
                case 7:
                    fragment.setAnimations(aVar.f1486d, aVar.f1487e, aVar.f1488f, aVar.f1489g);
                    this.f1341t.m1715p1(fragment, true);
                    this.f1341t.m1739y(fragment);
                case 8:
                    abstractC0326x = this.f1341t;
                    fragment = null;
                    abstractC0326x.m1721r1(fragment);
                case 9:
                    abstractC0326x = this.f1341t;
                    abstractC0326x.m1721r1(fragment);
                case 10:
                    this.f1341t.m1718q1(fragment, aVar.f1490h);
            }
        }
    }

    /* renamed from: t */
    public Fragment m1371t(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f1466c.size()) {
            AbstractC0301g0.a aVar = this.f1466c.get(i10);
            int i11 = aVar.f1483a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f1484b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1466c.add(i10, new AbstractC0301g0.a(9, fragment4, true));
                                    i10++;
                                    fragment2 = null;
                                }
                                AbstractC0301g0.a aVar2 = new AbstractC0301g0.a(3, fragment4, true);
                                aVar2.f1486d = aVar.f1486d;
                                aVar2.f1488f = aVar.f1488f;
                                aVar2.f1487e = aVar.f1487e;
                                aVar2.f1489g = aVar.f1489g;
                                this.f1466c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f1466c.remove(i10);
                        i10--;
                    } else {
                        aVar.f1483a = 1;
                        aVar.f1485c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f1484b);
                    Fragment fragment5 = aVar.f1484b;
                    if (fragment5 == fragment2) {
                        this.f1466c.add(i10, new AbstractC0301g0.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f1466c.add(i10, new AbstractC0301g0.a(9, fragment2, true));
                        aVar.f1485c = true;
                        i10++;
                        fragment2 = aVar.f1484b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f1484b);
            i10++;
        }
        return fragment2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1343v >= 0) {
            sb2.append(" #");
            sb2.append(this.f1343v);
        }
        if (this.f1474k != null) {
            sb2.append(" ");
            sb2.append(this.f1474k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public String m1372u() {
        return this.f1474k;
    }

    /* renamed from: v */
    public void m1373v() {
        if (this.f1482s != null) {
            for (int i10 = 0; i10 < this.f1482s.size(); i10++) {
                this.f1482s.get(i10).run();
            }
            this.f1482s = null;
        }
    }

    /* renamed from: w */
    public Fragment m1374w(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1466c.size() - 1; size >= 0; size--) {
            AbstractC0301g0.a aVar = this.f1466c.get(size);
            int i10 = aVar.f1483a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1484b;
                            break;
                        case 10:
                            aVar.f1491i = aVar.f1490h;
                            break;
                    }
                }
                arrayList.add(aVar.f1484b);
            }
            arrayList.remove(aVar.f1484b);
        }
        return fragment;
    }
}
