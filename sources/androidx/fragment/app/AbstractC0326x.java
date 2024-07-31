package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0159l;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0172c;
import androidx.activity.result.C0170a;
import androidx.activity.result.C0174e;
import androidx.activity.result.InterfaceC0171b;
import androidx.fragment.app.AbstractC0301g0;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.InterfaceC0351i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p003a1.C0019d;
import p072f.AbstractC1793a;
import p133j0.InterfaceC3202a;
import p148k0.InterfaceC3321i;
import p148k0.InterfaceC3331n;
import p329x.C5491i;
import p329x.C5501s;
import p329x.InterfaceC5498p;
import p329x.InterfaceC5499q;
import p345y.InterfaceC5784c;
import p345y.InterfaceC5785d;
import p361z0.C5940b;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
public abstract class AbstractC0326x {

    /* renamed from: S */
    public static boolean f1585S = false;

    /* renamed from: D */
    public AbstractC0172c<Intent> f1589D;

    /* renamed from: E */
    public AbstractC0172c<C0174e> f1590E;

    /* renamed from: F */
    public AbstractC0172c<String[]> f1591F;

    /* renamed from: H */
    public boolean f1593H;

    /* renamed from: I */
    public boolean f1594I;

    /* renamed from: J */
    public boolean f1595J;

    /* renamed from: K */
    public boolean f1596K;

    /* renamed from: L */
    public boolean f1597L;

    /* renamed from: M */
    public ArrayList<C0288a> f1598M;

    /* renamed from: N */
    public ArrayList<Boolean> f1599N;

    /* renamed from: O */
    public ArrayList<Fragment> f1600O;

    /* renamed from: P */
    public C0289a0 f1601P;

    /* renamed from: Q */
    public C0019d.c f1602Q;

    /* renamed from: b */
    public boolean f1605b;

    /* renamed from: d */
    public ArrayList<C0288a> f1607d;

    /* renamed from: e */
    public ArrayList<Fragment> f1608e;

    /* renamed from: g */
    public OnBackPressedDispatcher f1610g;

    /* renamed from: m */
    public ArrayList<m> f1616m;

    /* renamed from: v */
    public AbstractC0318p<?> f1625v;

    /* renamed from: w */
    public AbstractC0310l f1626w;

    /* renamed from: x */
    public Fragment f1627x;

    /* renamed from: y */
    public Fragment f1628y;

    /* renamed from: a */
    public final ArrayList<n> f1604a = new ArrayList<>();

    /* renamed from: c */
    public final C0299f0 f1606c = new C0299f0();

    /* renamed from: f */
    public final LayoutInflaterFactory2C0319q f1609f = new LayoutInflaterFactory2C0319q(this);

    /* renamed from: h */
    public final AbstractC0159l f1611h = new b(false);

    /* renamed from: i */
    public final AtomicInteger f1612i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, C0292c> f1613j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f1614k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, Object> f1615l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final C0320r f1617n = new C0320r(this);

    /* renamed from: o */
    public final CopyOnWriteArrayList<InterfaceC0291b0> f1618o = new CopyOnWriteArrayList<>();

    /* renamed from: p */
    public final InterfaceC3202a<Configuration> f1619p = new InterfaceC3202a() { // from class: androidx.fragment.app.t
        public /* synthetic */ C0322t() {
        }

        @Override // p133j0.InterfaceC3202a
        public final void accept(Object obj) {
            AbstractC0326x.this.m1619R0((Configuration) obj);
        }
    };

    /* renamed from: q */
    public final InterfaceC3202a<Integer> f1620q = new InterfaceC3202a() { // from class: androidx.fragment.app.w
        public /* synthetic */ C0325w() {
        }

        @Override // p133j0.InterfaceC3202a
        public final void accept(Object obj) {
            AbstractC0326x.this.m1620S0((Integer) obj);
        }
    };

    /* renamed from: r */
    public final InterfaceC3202a<C5491i> f1621r = new InterfaceC3202a() { // from class: androidx.fragment.app.u
        public /* synthetic */ C0323u() {
        }

        @Override // p133j0.InterfaceC3202a
        public final void accept(Object obj) {
            AbstractC0326x.this.m1621T0((C5491i) obj);
        }
    };

    /* renamed from: s */
    public final InterfaceC3202a<C5501s> f1622s = new InterfaceC3202a() { // from class: androidx.fragment.app.v
        public /* synthetic */ C0324v() {
        }

        @Override // p133j0.InterfaceC3202a
        public final void accept(Object obj) {
            AbstractC0326x.this.m1622U0((C5501s) obj);
        }
    };

    /* renamed from: t */
    public final InterfaceC3331n f1623t = new c();

    /* renamed from: u */
    public int f1624u = -1;

    /* renamed from: z */
    public C0316o f1629z = null;

    /* renamed from: A */
    public C0316o f1586A = new d();

    /* renamed from: B */
    public InterfaceC0315n0 f1587B = null;

    /* renamed from: C */
    public InterfaceC0315n0 f1588C = new e();

    /* renamed from: G */
    public ArrayDeque<l> f1592G = new ArrayDeque<>();

    /* renamed from: R */
    public Runnable f1603R = new f();

    /* renamed from: androidx.fragment.app.x$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0171b<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.InterfaceC0171b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo627a(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l pollFirst = AbstractC0326x.this.f1592G.pollFirst();
            if (pollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = pollFirst.f1640h;
                int i11 = pollFirst.f1641i;
                Fragment m1467i = AbstractC0326x.this.f1606c.m1467i(str);
                if (m1467i != null) {
                    m1467i.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC0159l {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.AbstractC0159l
        public void handleOnBackPressed() {
            AbstractC0326x.this.m1643E0();
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3331n {
        public c() {
        }

        @Override // p148k0.InterfaceC3331n
        /* renamed from: a */
        public boolean mo1744a(MenuItem menuItem) {
            return AbstractC0326x.this.m1655L(menuItem);
        }

        @Override // p148k0.InterfaceC3331n
        /* renamed from: b */
        public void mo1745b(Menu menu) {
            AbstractC0326x.this.m1657M(menu);
        }

        @Override // p148k0.InterfaceC3331n
        /* renamed from: c */
        public void mo1746c(Menu menu, MenuInflater menuInflater) {
            AbstractC0326x.this.m1642E(menu, menuInflater);
        }

        @Override // p148k0.InterfaceC3331n
        /* renamed from: d */
        public void mo1747d(Menu menu) {
            AbstractC0326x.this.m1665Q(menu);
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    /* loaded from: classes.dex */
    public class d extends C0316o {
        public d() {
        }

        @Override // androidx.fragment.app.C0316o
        /* renamed from: a */
        public Fragment mo1595a(ClassLoader classLoader, String str) {
            return AbstractC0326x.this.m1732v0().m1541b(AbstractC0326x.this.m1732v0().m1597f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    /* loaded from: classes.dex */
    public class e implements InterfaceC0315n0 {
        public e() {
        }

        @Override // androidx.fragment.app.InterfaceC0315n0
        /* renamed from: a */
        public AbstractC0313m0 mo1591a(ViewGroup viewGroup) {
            return new C0294d(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.x$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0326x.this.m1684c0(true);
        }
    }

    /* renamed from: androidx.fragment.app.x$g */
    /* loaded from: classes.dex */
    public class g implements InterfaceC0291b0 {

        /* renamed from: h */
        public final /* synthetic */ Fragment f1636h;

        public g(Fragment fragment) {
            this.f1636h = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0291b0
        /* renamed from: a */
        public void mo1394a(AbstractC0326x abstractC0326x, Fragment fragment) {
            this.f1636h.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.x$h */
    /* loaded from: classes.dex */
    public class h implements InterfaceC0171b<C0170a> {
        public h() {
        }

        @Override // androidx.activity.result.InterfaceC0171b
        /* renamed from: b */
        public void mo627a(C0170a c0170a) {
            l pollFirst = AbstractC0326x.this.f1592G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f1640h;
            int i10 = pollFirst.f1641i;
            Fragment m1467i = AbstractC0326x.this.f1606c.m1467i(str);
            if (m1467i != null) {
                m1467i.onActivityResult(i10, c0170a.m624b(), c0170a.m623a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.x$i */
    /* loaded from: classes.dex */
    public class i implements InterfaceC0171b<C0170a> {
        public i() {
        }

        @Override // androidx.activity.result.InterfaceC0171b
        /* renamed from: b */
        public void mo627a(C0170a c0170a) {
            l pollFirst = AbstractC0326x.this.f1592G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f1640h;
            int i10 = pollFirst.f1641i;
            Fragment m1467i = AbstractC0326x.this.f1606c.m1467i(str);
            if (m1467i != null) {
                m1467i.onActivityResult(i10, c0170a.m624b(), c0170a.m623a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.x$j */
    /* loaded from: classes.dex */
    public static class j extends AbstractC1793a<C0174e, C0170a> {
        @Override // p072f.AbstractC1793a
        /* renamed from: d */
        public Intent mo1750a(Context context, C0174e c0174e) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m629a = c0174e.m629a();
            if (m629a != null && (bundleExtra = m629a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m629a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m629a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c0174e = new C0174e.a(c0174e.m632e()).m634b(null).m635c(c0174e.m631d(), c0174e.m630b()).m633a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0174e);
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p072f.AbstractC1793a
        /* renamed from: e */
        public C0170a mo1751c(int i10, Intent intent) {
            return new C0170a(i10, intent);
        }
    }

    /* renamed from: androidx.fragment.app.x$k */
    /* loaded from: classes.dex */
    public static abstract class k {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.x$l */
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: h */
        public String f1640h;

        /* renamed from: i */
        public int f1641i;

        /* renamed from: androidx.fragment.app.x$l$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcel parcel) {
            this.f1640h = parcel.readString();
            this.f1641i = parcel.readInt();
        }

        public l(String str, int i10) {
            this.f1640h = str;
            this.f1641i = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1640h);
            parcel.writeInt(this.f1641i);
        }
    }

    /* renamed from: androidx.fragment.app.x$m */
    /* loaded from: classes.dex */
    public interface m {
        /* renamed from: a */
        void m1756a();
    }

    /* renamed from: androidx.fragment.app.x$n */
    /* loaded from: classes.dex */
    public interface n {
        /* renamed from: a */
        boolean mo1358a(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.x$o */
    /* loaded from: classes.dex */
    public class o implements n {

        /* renamed from: a */
        public final String f1642a;

        /* renamed from: b */
        public final int f1643b;

        /* renamed from: c */
        public final int f1644c;

        public o(String str, int i10, int i11) {
            this.f1642a = str;
            this.f1643b = i10;
            this.f1644c = i11;
        }

        @Override // androidx.fragment.app.AbstractC0326x.n
        /* renamed from: a */
        public boolean mo1358a(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = AbstractC0326x.this.f1628y;
            if (fragment == null || this.f1643b >= 0 || this.f1642a != null || !fragment.getChildFragmentManager().m1687d1()) {
                return AbstractC0326x.this.m1692g1(arrayList, arrayList2, this.f1642a, this.f1643b, this.f1644c);
            }
            return false;
        }
    }

    /* renamed from: C0 */
    public static Fragment m1616C0(View view) {
        Object tag = view.getTag(C5940b.f22086a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: I0 */
    public static boolean m1617I0(int i10) {
        return f1585S || Log.isLoggable("FragmentManager", i10);
    }

    /* renamed from: R0 */
    public /* synthetic */ void m1619R0(Configuration configuration) {
        if (m1654K0()) {
            m1637B(configuration, false);
        }
    }

    /* renamed from: S0 */
    public /* synthetic */ void m1620S0(Integer num) {
        if (m1654K0() && num.intValue() == 80) {
            m1648H(false);
        }
    }

    /* renamed from: T0 */
    public /* synthetic */ void m1621T0(C5491i c5491i) {
        if (m1654K0()) {
            m1650I(c5491i.m21801a(), false);
        }
    }

    /* renamed from: U0 */
    public /* synthetic */ void m1622U0(C5501s c5501s) {
        if (m1654K0()) {
            m1663P(c5501s.m22123a(), false);
        }
    }

    /* renamed from: e0 */
    public static void m1628e0(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C0288a c0288a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c0288a.m1365n(-1);
                c0288a.m1370s();
            } else {
                c0288a.m1365n(1);
                c0288a.m1369r();
            }
            i10++;
        }
    }

    /* renamed from: l0 */
    public static AbstractC0326x m1632l0(View view) {
        Fragment m1633m0 = m1633m0(view);
        if (m1633m0 != null) {
            if (m1633m0.isAdded()) {
                return m1633m0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + m1633m0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        ActivityC0306j activityC0306j = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof ActivityC0306j) {
                activityC0306j = (ActivityC0306j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activityC0306j != null) {
            return activityC0306j.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: m0 */
    public static Fragment m1633m0(View view) {
        while (view != null) {
            Fragment m1616C0 = m1616C0(view);
            if (m1616C0 != null) {
                return m1616C0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: m1 */
    public static int m1634m1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* renamed from: A */
    public void m1635A() {
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        m1669U(0);
    }

    /* renamed from: A0 */
    public InterfaceC0315n0 m1636A0() {
        InterfaceC0315n0 interfaceC0315n0 = this.f1587B;
        if (interfaceC0315n0 != null) {
            return interfaceC0315n0;
        }
        Fragment fragment = this.f1627x;
        return fragment != null ? fragment.mFragmentManager.m1636A0() : this.f1588C;
    }

    /* renamed from: B */
    public void m1637B(Configuration configuration, boolean z10) {
        if (z10 && (this.f1625v instanceof InterfaceC5784c)) {
            m1733v1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.m1637B(configuration, true);
                }
            }
        }
    }

    /* renamed from: B0 */
    public C0019d.c m1638B0() {
        return this.f1602Q;
    }

    /* renamed from: C */
    public boolean m1639C(MenuItem menuItem) {
        if (this.f1624u < 1) {
            return false;
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public void m1640D() {
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        m1669U(1);
    }

    /* renamed from: D0 */
    public C0349h0 m1641D0(Fragment fragment) {
        return this.f1601P.m1384n(fragment);
    }

    /* renamed from: E */
    public boolean m1642E(Menu menu, MenuInflater menuInflater) {
        if (this.f1624u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null && m1658M0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f1608e != null) {
            for (int i10 = 0; i10 < this.f1608e.size(); i10++) {
                Fragment fragment2 = this.f1608e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1608e = arrayList;
        return z10;
    }

    /* renamed from: E0 */
    public void m1643E0() {
        m1684c0(true);
        if (this.f1611h.isEnabled()) {
            m1687d1();
        } else {
            this.f1610g.m585e();
        }
    }

    /* renamed from: F */
    public void m1644F() {
        this.f1596K = true;
        m1684c0(true);
        m1678Z();
        m1725t();
        m1669U(-1);
        Object obj = this.f1625v;
        if (obj instanceof InterfaceC5785d) {
            ((InterfaceC5785d) obj).removeOnTrimMemoryListener(this.f1620q);
        }
        Object obj2 = this.f1625v;
        if (obj2 instanceof InterfaceC5784c) {
            ((InterfaceC5784c) obj2).removeOnConfigurationChangedListener(this.f1619p);
        }
        Object obj3 = this.f1625v;
        if (obj3 instanceof InterfaceC5498p) {
            ((InterfaceC5498p) obj3).removeOnMultiWindowModeChangedListener(this.f1621r);
        }
        Object obj4 = this.f1625v;
        if (obj4 instanceof InterfaceC5499q) {
            ((InterfaceC5499q) obj4).removeOnPictureInPictureModeChangedListener(this.f1622s);
        }
        Object obj5 = this.f1625v;
        if ((obj5 instanceof InterfaceC3321i) && this.f1627x == null) {
            ((InterfaceC3321i) obj5).removeMenuProvider(this.f1623t);
        }
        this.f1625v = null;
        this.f1626w = null;
        this.f1627x = null;
        if (this.f1610g != null) {
            this.f1611h.remove();
            this.f1610g = null;
        }
        AbstractC0172c<Intent> abstractC0172c = this.f1589D;
        if (abstractC0172c != null) {
            abstractC0172c.mo619c();
            this.f1590E.mo619c();
            this.f1591F.mo619c();
        }
    }

    /* renamed from: F0 */
    public void m1645F0(Fragment fragment) {
        if (m1617I0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m1724s1(fragment);
    }

    /* renamed from: G */
    public void m1646G() {
        m1669U(1);
    }

    /* renamed from: G0 */
    public void m1647G0(Fragment fragment) {
        if (fragment.mAdded && m1652J0(fragment)) {
            this.f1593H = true;
        }
    }

    /* renamed from: H */
    public void m1648H(boolean z10) {
        if (z10 && (this.f1625v instanceof InterfaceC5785d)) {
            m1733v1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.m1648H(true);
                }
            }
        }
    }

    /* renamed from: H0 */
    public boolean m1649H0() {
        return this.f1596K;
    }

    /* renamed from: I */
    public void m1650I(boolean z10, boolean z11) {
        if (z11 && (this.f1625v instanceof InterfaceC5498p)) {
            m1733v1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.m1650I(z10, true);
                }
            }
        }
    }

    /* renamed from: J */
    public void m1651J(Fragment fragment) {
        Iterator<InterfaceC0291b0> it = this.f1618o.iterator();
        while (it.hasNext()) {
            it.next().mo1394a(this, fragment);
        }
    }

    /* renamed from: J0 */
    public final boolean m1652J0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m1716q();
    }

    /* renamed from: K */
    public void m1653K() {
        for (Fragment fragment : this.f1606c.m1470l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m1653K();
            }
        }
    }

    /* renamed from: K0 */
    public final boolean m1654K0() {
        Fragment fragment = this.f1627x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f1627x.getParentFragmentManager().m1654K0();
    }

    /* renamed from: L */
    public boolean m1655L(MenuItem menuItem) {
        if (this.f1624u < 1) {
            return false;
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public boolean m1656L0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: M */
    public void m1657M(Menu menu) {
        if (this.f1624u < 1) {
            return;
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: M0 */
    public boolean m1658M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: N */
    public final void m1659N(Fragment fragment) {
        if (fragment == null || !fragment.equals(m1691g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: N0 */
    public boolean m1660N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC0326x abstractC0326x = fragment.mFragmentManager;
        return fragment.equals(abstractC0326x.m1742z0()) && m1660N0(abstractC0326x.f1627x);
    }

    /* renamed from: O */
    public void m1661O() {
        m1669U(5);
    }

    /* renamed from: O0 */
    public boolean m1662O0(int i10) {
        return this.f1624u >= i10;
    }

    /* renamed from: P */
    public void m1663P(boolean z10, boolean z11) {
        if (z11 && (this.f1625v instanceof InterfaceC5499q)) {
            m1733v1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.m1663P(z10, true);
                }
            }
        }
    }

    /* renamed from: P0 */
    public boolean m1664P0() {
        return this.f1594I || this.f1595J;
    }

    /* renamed from: Q */
    public boolean m1665Q(Menu menu) {
        boolean z10 = false;
        if (this.f1624u < 1) {
            return false;
        }
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null && m1658M0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: R */
    public void m1666R() {
        m1736w1();
        m1659N(this.f1628y);
    }

    /* renamed from: S */
    public void m1667S() {
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        m1669U(7);
    }

    /* renamed from: T */
    public void m1668T() {
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        m1669U(5);
    }

    /* renamed from: U */
    public final void m1669U(int i10) {
        try {
            this.f1605b = true;
            this.f1606c.m1462d(i10);
            m1677Y0(i10, false);
            Iterator<AbstractC0313m0> it = m1731v().iterator();
            while (it.hasNext()) {
                it.next().m1555j();
            }
            this.f1605b = false;
            m1684c0(true);
        } catch (Throwable th) {
            this.f1605b = false;
            throw th;
        }
    }

    /* renamed from: V */
    public void m1670V() {
        this.f1595J = true;
        this.f1601P.m1387q(true);
        m1669U(4);
    }

    /* renamed from: V0 */
    public void m1671V0(Fragment fragment, String[] strArr, int i10) {
        if (this.f1591F == null) {
            this.f1625v.m1599k(fragment, strArr, i10);
            return;
        }
        this.f1592G.addLast(new l(fragment.mWho, i10));
        this.f1591F.m628a(strArr);
    }

    /* renamed from: W */
    public void m1672W() {
        m1669U(2);
    }

    /* renamed from: W0 */
    public void m1673W0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f1589D == null) {
            this.f1625v.m1600m(fragment, intent, i10, bundle);
            return;
        }
        this.f1592G.addLast(new l(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f1589D.m628a(intent);
    }

    /* renamed from: X */
    public final void m1674X() {
        if (this.f1597L) {
            this.f1597L = false;
            m1730u1();
        }
    }

    /* renamed from: X0 */
    public void m1675X0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (this.f1590E == null) {
            this.f1625v.m1601n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (m1617I0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        C0174e m633a = new C0174e.a(intentSender).m634b(intent2).m635c(i12, i11).m633a();
        this.f1592G.addLast(new l(fragment.mWho, i10));
        if (m1617I0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f1590E.m628a(m633a);
    }

    /* renamed from: Y */
    public void m1676Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1606c.m1463e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1608e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f1608e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0288a> arrayList2 = this.f1607d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C0288a c0288a = this.f1607d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c0288a.toString());
                c0288a.m1367p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1612i.get());
        synchronized (this.f1604a) {
            int size3 = this.f1604a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    n nVar = this.f1604a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(nVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1625v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1626w);
        if (this.f1627x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1627x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1624u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1594I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1595J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1596K);
        if (this.f1593H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1593H);
        }
    }

    /* renamed from: Y0 */
    public void m1677Y0(int i10, boolean z10) {
        AbstractC0318p<?> abstractC0318p;
        if (this.f1625v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f1624u) {
            this.f1624u = i10;
            this.f1606c.m1478t();
            m1730u1();
            if (this.f1593H && (abstractC0318p = this.f1625v) != null && this.f1624u == 7) {
                abstractC0318p.mo1522o();
                this.f1593H = false;
            }
        }
    }

    /* renamed from: Z */
    public final void m1678Z() {
        Iterator<AbstractC0313m0> it = m1731v().iterator();
        while (it.hasNext()) {
            it.next().m1555j();
        }
    }

    /* renamed from: Z0 */
    public void m1679Z0() {
        if (this.f1625v == null) {
            return;
        }
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        for (Fragment fragment : this.f1606c.m1473o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: a0 */
    public void m1680a0(n nVar, boolean z10) {
        if (!z10) {
            if (this.f1625v == null) {
                if (!this.f1596K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m1719r();
        }
        synchronized (this.f1604a) {
            if (this.f1625v == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1604a.add(nVar);
                m1712o1();
            }
        }
    }

    /* renamed from: a1 */
    public void m1681a1(C0312m c0312m) {
        View view;
        for (C0297e0 c0297e0 : this.f1606c.m1469k()) {
            Fragment m1445k = c0297e0.m1445k();
            if (m1445k.mContainerId == c0312m.getId() && (view = m1445k.mView) != null && view.getParent() == null) {
                m1445k.mContainer = c0312m;
                c0297e0.m1436b();
            }
        }
    }

    /* renamed from: b0 */
    public final void m1682b0(boolean z10) {
        if (this.f1605b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1625v == null) {
            if (!this.f1596K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1625v.m1598g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            m1719r();
        }
        if (this.f1598M == null) {
            this.f1598M = new ArrayList<>();
            this.f1599N = new ArrayList<>();
        }
    }

    /* renamed from: b1 */
    public void m1683b1(C0297e0 c0297e0) {
        Fragment m1445k = c0297e0.m1445k();
        if (m1445k.mDeferStart) {
            if (this.f1605b) {
                this.f1597L = true;
            } else {
                m1445k.mDeferStart = false;
                c0297e0.m1447m();
            }
        }
    }

    /* renamed from: c0 */
    public boolean m1684c0(boolean z10) {
        m1682b0(z10);
        boolean z11 = false;
        while (m1711o0(this.f1598M, this.f1599N)) {
            this.f1605b = true;
            try {
                m1697i1(this.f1598M, this.f1599N);
                m1722s();
                z11 = true;
            } catch (Throwable th) {
                m1722s();
                throw th;
            }
        }
        m1736w1();
        m1674X();
        this.f1606c.m1460b();
        return z11;
    }

    /* renamed from: c1 */
    public void m1685c1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            m1680a0(new o(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: d0 */
    public void m1686d0(n nVar, boolean z10) {
        if (z10 && (this.f1625v == null || this.f1596K)) {
            return;
        }
        m1682b0(z10);
        if (nVar.mo1358a(this.f1598M, this.f1599N)) {
            this.f1605b = true;
            try {
                m1697i1(this.f1598M, this.f1599N);
            } finally {
                m1722s();
            }
        }
        m1736w1();
        m1674X();
        this.f1606c.m1460b();
    }

    /* renamed from: d1 */
    public boolean m1687d1() {
        return m1690f1(null, -1, 0);
    }

    /* renamed from: e1 */
    public boolean m1688e1(int i10, int i11) {
        if (i10 >= 0) {
            return m1690f1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: f0 */
    public final void m1689f0(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f1481r;
        ArrayList<Fragment> arrayList3 = this.f1600O;
        if (arrayList3 == null) {
            this.f1600O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f1600O.addAll(this.f1606c.m1473o());
        Fragment m1742z0 = m1742z0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C0288a c0288a = arrayList.get(i12);
            m1742z0 = !arrayList2.get(i12).booleanValue() ? c0288a.m1371t(this.f1600O, m1742z0) : c0288a.m1374w(this.f1600O, m1742z0);
            z11 = z11 || c0288a.f1472i;
        }
        this.f1600O.clear();
        if (!z10 && this.f1624u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<AbstractC0301g0.a> it = arrayList.get(i13).f1466c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f1484b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f1606c.m1476r(m1737x(fragment));
                    }
                }
            }
        }
        m1628e0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        for (int i14 = i10; i14 < i11; i14++) {
            C0288a c0288a2 = arrayList.get(i14);
            if (booleanValue) {
                for (int size = c0288a2.f1466c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c0288a2.f1466c.get(size).f1484b;
                    if (fragment2 != null) {
                        m1737x(fragment2).m1447m();
                    }
                }
            } else {
                Iterator<AbstractC0301g0.a> it2 = c0288a2.f1466c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f1484b;
                    if (fragment3 != null) {
                        m1737x(fragment3).m1447m();
                    }
                }
            }
        }
        m1677Y0(this.f1624u, true);
        for (AbstractC0313m0 abstractC0313m0 : m1734w(arrayList, i10, i11)) {
            abstractC0313m0.m1561r(booleanValue);
            abstractC0313m0.m1559p();
            abstractC0313m0.m1552g();
        }
        while (i10 < i11) {
            C0288a c0288a3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c0288a3.f1343v >= 0) {
                c0288a3.f1343v = -1;
            }
            c0288a3.m1373v();
            i10++;
        }
        if (z11) {
            m1703k1();
        }
    }

    /* renamed from: f1 */
    public final boolean m1690f1(String str, int i10, int i11) {
        m1684c0(false);
        m1682b0(true);
        Fragment fragment = this.f1628y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().m1687d1()) {
            return true;
        }
        boolean m1692g1 = m1692g1(this.f1598M, this.f1599N, str, i10, i11);
        if (m1692g1) {
            this.f1605b = true;
            try {
                m1697i1(this.f1598M, this.f1599N);
            } finally {
                m1722s();
            }
        }
        m1736w1();
        m1674X();
        this.f1606c.m1460b();
        return m1692g1;
    }

    /* renamed from: g0 */
    public Fragment m1691g0(String str) {
        return this.f1606c.m1464f(str);
    }

    /* renamed from: g1 */
    public boolean m1692g1(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int m1693h0 = m1693h0(str, i10, (i11 & 1) != 0);
        if (m1693h0 < 0) {
            return false;
        }
        for (int size = this.f1607d.size() - 1; size >= m1693h0; size--) {
            arrayList.add(this.f1607d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: h0 */
    public final int m1693h0(String str, int i10, boolean z10) {
        ArrayList<C0288a> arrayList = this.f1607d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f1607d.size() - 1;
        }
        int size = this.f1607d.size() - 1;
        while (size >= 0) {
            C0288a c0288a = this.f1607d.get(size);
            if ((str != null && str.equals(c0288a.m1372u())) || (i10 >= 0 && i10 == c0288a.f1343v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f1607d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0288a c0288a2 = this.f1607d.get(size - 1);
            if ((str == null || !str.equals(c0288a2.m1372u())) && (i10 < 0 || i10 != c0288a2.f1343v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    /* renamed from: h1 */
    public void m1694h1(Fragment fragment) {
        if (m1617I0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f1606c.m1479u(fragment);
            if (m1652J0(fragment)) {
                this.f1593H = true;
            }
            fragment.mRemoving = true;
            m1724s1(fragment);
        }
    }

    /* renamed from: i */
    public void m1695i(C0288a c0288a) {
        if (this.f1607d == null) {
            this.f1607d = new ArrayList<>();
        }
        this.f1607d.add(c0288a);
    }

    /* renamed from: i0 */
    public Fragment m1696i0(int i10) {
        return this.f1606c.m1465g(i10);
    }

    /* renamed from: i1 */
    public final void m1697i1(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f1481r) {
                if (i11 != i10) {
                    m1689f0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1481r) {
                        i11++;
                    }
                }
                m1689f0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m1689f0(arrayList, arrayList2, i11, size);
        }
    }

    /* renamed from: j */
    public C0297e0 m1698j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C0019d.m101h(fragment, str);
        }
        if (m1617I0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0297e0 m1737x = m1737x(fragment);
        fragment.mFragmentManager = this;
        this.f1606c.m1476r(m1737x);
        if (!fragment.mDetached) {
            this.f1606c.m1459a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m1652J0(fragment)) {
                this.f1593H = true;
            }
        }
        return m1737x;
    }

    /* renamed from: j0 */
    public Fragment m1699j0(String str) {
        return this.f1606c.m1466h(str);
    }

    /* renamed from: j1 */
    public void m1700j1(Fragment fragment) {
        this.f1601P.m1386p(fragment);
    }

    /* renamed from: k */
    public void m1701k(InterfaceC0291b0 interfaceC0291b0) {
        this.f1618o.add(interfaceC0291b0);
    }

    /* renamed from: k0 */
    public Fragment m1702k0(String str) {
        return this.f1606c.m1467i(str);
    }

    /* renamed from: k1 */
    public final void m1703k1() {
        if (this.f1616m != null) {
            for (int i10 = 0; i10 < this.f1616m.size(); i10++) {
                this.f1616m.get(i10).m1756a();
            }
        }
    }

    /* renamed from: l */
    public void m1704l(Fragment fragment) {
        this.f1601P.m1377f(fragment);
    }

    /* renamed from: l1 */
    public void m1705l1(Parcelable parcelable) {
        C0297e0 c0297e0;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1625v.m1597f().getClassLoader());
                this.f1614k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<C0295d0> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1625v.m1597f().getClassLoader());
                arrayList.add((C0295d0) bundle.getParcelable("state"));
            }
        }
        this.f1606c.m1482x(arrayList);
        C0328z c0328z = (C0328z) bundle3.getParcelable("state");
        if (c0328z == null) {
            return;
        }
        this.f1606c.m1480v();
        Iterator<String> it = c0328z.f1646h.iterator();
        while (it.hasNext()) {
            C0295d0 m1458B = this.f1606c.m1458B(it.next(), null);
            if (m1458B != null) {
                Fragment m1381j = this.f1601P.m1381j(m1458B.f1416i);
                if (m1381j != null) {
                    if (m1617I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m1381j);
                    }
                    c0297e0 = new C0297e0(this.f1617n, this.f1606c, m1381j, m1458B);
                } else {
                    c0297e0 = new C0297e0(this.f1617n, this.f1606c, this.f1625v.m1597f().getClassLoader(), m1726t0(), m1458B);
                }
                Fragment m1445k = c0297e0.m1445k();
                m1445k.mFragmentManager = this;
                if (m1617I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m1445k.mWho + "): " + m1445k);
                }
                c0297e0.m1449o(this.f1625v.m1597f().getClassLoader());
                this.f1606c.m1476r(c0297e0);
                c0297e0.m1454t(this.f1624u);
            }
        }
        for (Fragment fragment : this.f1601P.m1383m()) {
            if (!this.f1606c.m1461c(fragment.mWho)) {
                if (m1617I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c0328z.f1646h);
                }
                this.f1601P.m1386p(fragment);
                fragment.mFragmentManager = this;
                C0297e0 c0297e02 = new C0297e0(this.f1617n, this.f1606c, fragment);
                c0297e02.m1454t(1);
                c0297e02.m1447m();
                fragment.mRemoving = true;
                c0297e02.m1447m();
            }
        }
        this.f1606c.m1481w(c0328z.f1647i);
        if (c0328z.f1648j != null) {
            this.f1607d = new ArrayList<>(c0328z.f1648j.length);
            int i10 = 0;
            while (true) {
                C0290b[] c0290bArr = c0328z.f1648j;
                if (i10 >= c0290bArr.length) {
                    break;
                }
                C0288a m1391b = c0290bArr[i10].m1391b(this);
                if (m1617I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + m1391b.f1343v + "): " + m1391b);
                    PrintWriter printWriter = new PrintWriter(new C0311l0("FragmentManager"));
                    m1391b.m1368q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1607d.add(m1391b);
                i10++;
            }
        } else {
            this.f1607d = null;
        }
        this.f1612i.set(c0328z.f1649k);
        String str3 = c0328z.f1650l;
        if (str3 != null) {
            Fragment m1691g0 = m1691g0(str3);
            this.f1628y = m1691g0;
            m1659N(m1691g0);
        }
        ArrayList<String> arrayList2 = c0328z.f1651m;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                this.f1613j.put(arrayList2.get(i11), c0328z.f1652n.get(i11));
            }
        }
        this.f1592G = new ArrayDeque<>(c0328z.f1653o);
    }

    /* renamed from: m */
    public int m1706m() {
        return this.f1612i.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1707n(androidx.fragment.app.AbstractC0318p<?> r4, androidx.fragment.app.AbstractC0310l r5, androidx.fragment.app.Fragment r6) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0326x.m1707n(androidx.fragment.app.p, androidx.fragment.app.l, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: n0 */
    public final void m1708n0() {
        Iterator<AbstractC0313m0> it = m1731v().iterator();
        while (it.hasNext()) {
            it.next().m1556k();
        }
    }

    /* renamed from: n1 */
    public Bundle m1618Q0() {
        int size;
        Bundle bundle = new Bundle();
        m1708n0();
        m1678Z();
        m1684c0(true);
        this.f1594I = true;
        this.f1601P.m1387q(true);
        ArrayList<String> m1483y = this.f1606c.m1483y();
        ArrayList<C0295d0> m1471m = this.f1606c.m1471m();
        if (!m1471m.isEmpty()) {
            ArrayList<String> m1484z = this.f1606c.m1484z();
            C0290b[] c0290bArr = null;
            ArrayList<C0288a> arrayList = this.f1607d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                c0290bArr = new C0290b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c0290bArr[i10] = new C0290b(this.f1607d.get(i10));
                    if (m1617I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f1607d.get(i10));
                    }
                }
            }
            C0328z c0328z = new C0328z();
            c0328z.f1646h = m1483y;
            c0328z.f1647i = m1484z;
            c0328z.f1648j = c0290bArr;
            c0328z.f1649k = this.f1612i.get();
            Fragment fragment = this.f1628y;
            if (fragment != null) {
                c0328z.f1650l = fragment.mWho;
            }
            c0328z.f1651m.addAll(this.f1613j.keySet());
            c0328z.f1652n.addAll(this.f1613j.values());
            c0328z.f1653o = new ArrayList<>(this.f1592G);
            bundle.putParcelable("state", c0328z);
            for (String str : this.f1614k.keySet()) {
                bundle.putBundle("result_" + str, this.f1614k.get(str));
            }
            Iterator<C0295d0> it = m1471m.iterator();
            while (it.hasNext()) {
                C0295d0 next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.f1416i, bundle2);
            }
        } else if (m1617I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* renamed from: o */
    public void m1710o(Fragment fragment) {
        if (m1617I0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f1606c.m1459a(fragment);
            if (m1617I0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m1652J0(fragment)) {
                this.f1593H = true;
            }
        }
    }

    /* renamed from: o0 */
    public final boolean m1711o0(ArrayList<C0288a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1604a) {
            if (this.f1604a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f1604a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.f1604a.get(i10).mo1358a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f1604a.clear();
                this.f1625v.m1598g().removeCallbacks(this.f1603R);
            }
        }
    }

    /* renamed from: o1 */
    public void m1712o1() {
        synchronized (this.f1604a) {
            boolean z10 = true;
            if (this.f1604a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1625v.m1598g().removeCallbacks(this.f1603R);
                this.f1625v.m1598g().post(this.f1603R);
                m1736w1();
            }
        }
    }

    /* renamed from: p */
    public AbstractC0301g0 m1713p() {
        return new C0288a(this);
    }

    /* renamed from: p0 */
    public int m1714p0() {
        ArrayList<C0288a> arrayList = this.f1607d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: p1 */
    public void m1715p1(Fragment fragment, boolean z10) {
        ViewGroup m1723s0 = m1723s0(fragment);
        if (m1723s0 == null || !(m1723s0 instanceof C0312m)) {
            return;
        }
        ((C0312m) m1723s0).setDrawDisappearingViewsLast(!z10);
    }

    /* renamed from: q */
    public boolean m1716q() {
        boolean z10 = false;
        for (Fragment fragment : this.f1606c.m1470l()) {
            if (fragment != null) {
                z10 = m1652J0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    public final C0289a0 m1717q0(Fragment fragment) {
        return this.f1601P.m1382k(fragment);
    }

    /* renamed from: q1 */
    public void m1718q1(Fragment fragment, AbstractC0344f.b bVar) {
        if (fragment.equals(m1691g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r */
    public final void m1719r() {
        if (m1664P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: r0 */
    public AbstractC0310l m1720r0() {
        return this.f1626w;
    }

    /* renamed from: r1 */
    public void m1721r1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m1691g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f1628y;
            this.f1628y = fragment;
            m1659N(fragment2);
            m1659N(this.f1628y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: s */
    public final void m1722s() {
        this.f1605b = false;
        this.f1599N.clear();
        this.f1598M.clear();
    }

    /* renamed from: s0 */
    public final ViewGroup m1723s0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1626w.mo1351d()) {
            View mo1350c = this.f1626w.mo1350c(fragment.mContainerId);
            if (mo1350c instanceof ViewGroup) {
                return (ViewGroup) mo1350c;
            }
        }
        return null;
    }

    /* renamed from: s1 */
    public final void m1724s1(Fragment fragment) {
        ViewGroup m1723s0 = m1723s0(fragment);
        if (m1723s0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = C5940b.f22088c;
        if (m1723s0.getTag(i10) == null) {
            m1723s0.setTag(i10, fragment);
        }
        ((Fragment) m1723s0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: t */
    public final void m1725t() {
        AbstractC0318p<?> abstractC0318p = this.f1625v;
        boolean z10 = true;
        if (abstractC0318p instanceof InterfaceC0351i0) {
            z10 = this.f1606c.m1474p().m1385o();
        } else if (abstractC0318p.m1597f() instanceof Activity) {
            z10 = true ^ ((Activity) this.f1625v.m1597f()).isChangingConfigurations();
        }
        if (z10) {
            Iterator<C0292c> it = this.f1613j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f1367h.iterator();
                while (it2.hasNext()) {
                    this.f1606c.m1474p().m1379h(it2.next());
                }
            }
        }
    }

    /* renamed from: t0 */
    public C0316o m1726t0() {
        C0316o c0316o = this.f1629z;
        if (c0316o != null) {
            return c0316o;
        }
        Fragment fragment = this.f1627x;
        return fragment != null ? fragment.mFragmentManager.m1726t0() : this.f1586A;
    }

    /* renamed from: t1 */
    public void m1727t1(Fragment fragment) {
        if (m1617I0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f1627x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f1627x;
        } else {
            AbstractC0318p<?> abstractC0318p = this.f1625v;
            if (abstractC0318p == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(abstractC0318p.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f1625v;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    public final void m1728u(String str) {
        this.f1614k.remove(str);
        if (m1617I0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    /* renamed from: u0 */
    public List<Fragment> m1729u0() {
        return this.f1606c.m1473o();
    }

    /* renamed from: u1 */
    public final void m1730u1() {
        Iterator<C0297e0> it = this.f1606c.m1469k().iterator();
        while (it.hasNext()) {
            m1683b1(it.next());
        }
    }

    /* renamed from: v */
    public final Set<AbstractC0313m0> m1731v() {
        HashSet hashSet = new HashSet();
        Iterator<C0297e0> it = this.f1606c.m1469k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m1445k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC0313m0.m1546o(viewGroup, m1636A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: v0 */
    public AbstractC0318p<?> m1732v0() {
        return this.f1625v;
    }

    /* renamed from: v1 */
    public final void m1733v1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0311l0("FragmentManager"));
        AbstractC0318p<?> abstractC0318p = this.f1625v;
        try {
            if (abstractC0318p != null) {
                abstractC0318p.mo1518h("  ", null, printWriter, new String[0]);
            } else {
                m1676Y("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw runtimeException;
        }
    }

    /* renamed from: w */
    public final Set<AbstractC0313m0> m1734w(ArrayList<C0288a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<AbstractC0301g0.a> it = arrayList.get(i10).f1466c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f1484b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC0313m0.m1545n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: w0 */
    public LayoutInflater.Factory2 m1735w0() {
        return this.f1609f;
    }

    /* renamed from: w1 */
    public final void m1736w1() {
        synchronized (this.f1604a) {
            if (this.f1604a.isEmpty()) {
                this.f1611h.setEnabled(m1714p0() > 0 && m1660N0(this.f1627x));
            } else {
                this.f1611h.setEnabled(true);
            }
        }
    }

    /* renamed from: x */
    public C0297e0 m1737x(Fragment fragment) {
        C0297e0 m1472n = this.f1606c.m1472n(fragment.mWho);
        if (m1472n != null) {
            return m1472n;
        }
        C0297e0 c0297e0 = new C0297e0(this.f1617n, this.f1606c, fragment);
        c0297e0.m1449o(this.f1625v.m1597f().getClassLoader());
        c0297e0.m1454t(this.f1624u);
        return c0297e0;
    }

    /* renamed from: x0 */
    public C0320r m1738x0() {
        return this.f1617n;
    }

    /* renamed from: y */
    public void m1739y(Fragment fragment) {
        if (m1617I0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m1617I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1606c.m1479u(fragment);
            if (m1652J0(fragment)) {
                this.f1593H = true;
            }
            m1724s1(fragment);
        }
    }

    /* renamed from: y0 */
    public Fragment m1740y0() {
        return this.f1627x;
    }

    /* renamed from: z */
    public void m1741z() {
        this.f1594I = false;
        this.f1595J = false;
        this.f1601P.m1387q(false);
        m1669U(4);
    }

    /* renamed from: z0 */
    public Fragment m1742z0() {
        return this.f1628y;
    }
}
