package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC0313m0;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0351i0;
import p003a1.C0019d;
import p148k0.C3308b0;
import p361z0.C5940b;

/* renamed from: androidx.fragment.app.e0 */
/* loaded from: classes.dex */
public class C0297e0 {

    /* renamed from: a */
    public final C0320r f1450a;

    /* renamed from: b */
    public final C0299f0 f1451b;

    /* renamed from: c */
    public final Fragment f1452c;

    /* renamed from: d */
    public boolean f1453d = false;

    /* renamed from: e */
    public int f1454e = -1;

    /* renamed from: androidx.fragment.app.e0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: h */
        public final /* synthetic */ View f1455h;

        public a(View view) {
            this.f1455h = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f1455h.removeOnAttachStateChangeListener(this);
            C3308b0.m12006T(this.f1455h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.e0$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1457a;

        static {
            int[] iArr = new int[AbstractC0344f.b.values().length];
            f1457a = iArr;
            try {
                iArr[AbstractC0344f.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1457a[AbstractC0344f.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1457a[AbstractC0344f.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1457a[AbstractC0344f.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0297e0(C0320r c0320r, C0299f0 c0299f0, Fragment fragment) {
        this.f1450a = c0320r;
        this.f1451b = c0299f0;
        this.f1452c = fragment;
    }

    public C0297e0(C0320r c0320r, C0299f0 c0299f0, Fragment fragment, C0295d0 c0295d0) {
        this.f1450a = c0320r;
        this.f1451b = c0299f0;
        this.f1452c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = c0295d0.f1427t;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public C0297e0(C0320r c0320r, C0299f0 c0299f0, ClassLoader classLoader, C0316o c0316o, C0295d0 c0295d0) {
        this.f1450a = c0320r;
        this.f1451b = c0299f0;
        Fragment m1418a = c0295d0.m1418a(c0316o, classLoader);
        this.f1452c = m1418a;
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m1418a);
        }
    }

    /* renamed from: a */
    public void m1435a() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0320r c0320r = this.f1450a;
        Fragment fragment2 = this.f1452c;
        c0320r.m1602a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void m1436b() {
        int m1468j = this.f1451b.m1468j(this.f1452c);
        Fragment fragment = this.f1452c;
        fragment.mContainer.addView(fragment.mView, m1468j);
    }

    /* renamed from: c */
    public void m1437c() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        Fragment fragment2 = fragment.mTarget;
        C0297e0 c0297e0 = null;
        if (fragment2 != null) {
            C0297e0 m1472n = this.f1451b.m1472n(fragment2.mWho);
            if (m1472n == null) {
                throw new IllegalStateException("Fragment " + this.f1452c + " declared target fragment " + this.f1452c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f1452c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c0297e0 = m1472n;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0297e0 = this.f1451b.m1472n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f1452c + " declared target fragment " + this.f1452c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c0297e0 != null) {
            c0297e0.m1447m();
        }
        Fragment fragment4 = this.f1452c;
        fragment4.mHost = fragment4.mFragmentManager.m1732v0();
        Fragment fragment5 = this.f1452c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m1740y0();
        this.f1450a.m1608g(this.f1452c, false);
        this.f1452c.performAttach();
        this.f1450a.m1603b(this.f1452c, false);
    }

    /* renamed from: d */
    public int m1438d() {
        Fragment fragment = this.f1452c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i10 = this.f1454e;
        int i11 = b.f1457a[fragment.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment2 = this.f1452c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i10 = Math.max(this.f1454e, 2);
                View view = this.f1452c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f1454e < 4 ? Math.min(i10, fragment2.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f1452c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        Fragment fragment3 = this.f1452c;
        ViewGroup viewGroup = fragment3.mContainer;
        AbstractC0313m0.e.b m1557l = viewGroup != null ? AbstractC0313m0.m1545n(viewGroup, fragment3.getParentFragmentManager()).m1557l(this) : null;
        if (m1557l == AbstractC0313m0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (m1557l == AbstractC0313m0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f1452c;
            if (fragment4.mRemoving) {
                i10 = fragment4.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f1452c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f1452c);
        }
        return i10;
    }

    /* renamed from: e */
    public void m1439e() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f1452c.mState = 1;
            return;
        }
        this.f1450a.m1609h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f1452c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0320r c0320r = this.f1450a;
        Fragment fragment3 = this.f1452c;
        c0320r.m1604c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* renamed from: f */
    public void m1440f() {
        String str;
        if (this.f1452c.mFromLayout) {
            return;
        }
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f1452c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1452c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m1720r0().mo1350c(this.f1452c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f1452c;
                    if (!fragment3.mRestored) {
                        try {
                            str = fragment3.getResources().getResourceName(this.f1452c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1452c.mContainerId) + " (" + str + ") for fragment " + this.f1452c);
                    }
                } else if (!(viewGroup instanceof C0312m)) {
                    C0019d.m109p(this.f1452c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f1452c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f1452c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f1452c;
            fragment5.mView.setTag(C5940b.f22086a, fragment5);
            if (viewGroup != null) {
                m1436b();
            }
            Fragment fragment6 = this.f1452c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C3308b0.m11992F(this.f1452c.mView)) {
                C3308b0.m12006T(this.f1452c.mView);
            } else {
                View view2 = this.f1452c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f1452c.performViewCreated();
            C0320r c0320r = this.f1450a;
            Fragment fragment7 = this.f1452c;
            c0320r.m1614m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f1452c.mView.getVisibility();
            this.f1452c.setPostOnViewCreatedAlpha(this.f1452c.mView.getAlpha());
            Fragment fragment8 = this.f1452c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f1452c.setFocusedView(findFocus);
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1452c);
                    }
                }
                this.f1452c.mView.setAlpha(0.0f);
            }
        }
        this.f1452c.mState = 2;
    }

    /* renamed from: g */
    public void m1441g() {
        Fragment m1464f;
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11) {
            Fragment fragment2 = this.f1452c;
            if (!fragment2.mBeingSaved) {
                this.f1451b.m1458B(fragment2.mWho, null);
            }
        }
        if (!(z11 || this.f1451b.m1474p().m1388r(this.f1452c))) {
            String str = this.f1452c.mTargetWho;
            if (str != null && (m1464f = this.f1451b.m1464f(str)) != null && m1464f.mRetainInstance) {
                this.f1452c.mTarget = m1464f;
            }
            this.f1452c.mState = 0;
            return;
        }
        AbstractC0318p<?> abstractC0318p = this.f1452c.mHost;
        if (abstractC0318p instanceof InterfaceC0351i0) {
            z10 = this.f1451b.m1474p().m1385o();
        } else if (abstractC0318p.m1597f() instanceof Activity) {
            z10 = true ^ ((Activity) abstractC0318p.m1597f()).isChangingConfigurations();
        }
        if ((z11 && !this.f1452c.mBeingSaved) || z10) {
            this.f1451b.m1474p().m1378g(this.f1452c);
        }
        this.f1452c.performDestroy();
        this.f1450a.m1605d(this.f1452c, false);
        for (C0297e0 c0297e0 : this.f1451b.m1469k()) {
            if (c0297e0 != null) {
                Fragment m1445k = c0297e0.m1445k();
                if (this.f1452c.mWho.equals(m1445k.mTargetWho)) {
                    m1445k.mTarget = this.f1452c;
                    m1445k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f1452c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f1451b.m1464f(str2);
        }
        this.f1451b.m1477s(this);
    }

    /* renamed from: h */
    public void m1442h() {
        View view;
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f1452c);
        }
        Fragment fragment = this.f1452c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f1452c.performDestroyView();
        this.f1450a.m1615n(this.f1452c, false);
        Fragment fragment2 = this.f1452c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f1452c.mInLayout = false;
    }

    /* renamed from: i */
    public void m1443i() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1452c);
        }
        this.f1452c.performDetach();
        boolean z10 = false;
        this.f1450a.m1606e(this.f1452c, false);
        Fragment fragment = this.f1452c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f1451b.m1474p().m1388r(this.f1452c)) {
            if (AbstractC0326x.m1617I0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1452c);
            }
            this.f1452c.initState();
        }
    }

    /* renamed from: j */
    public void m1444j() {
        Fragment fragment = this.f1452c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (AbstractC0326x.m1617I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1452c);
            }
            Fragment fragment2 = this.f1452c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f1452c.mSavedFragmentState);
            View view = this.f1452c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1452c;
                fragment3.mView.setTag(C5940b.f22086a, fragment3);
                Fragment fragment4 = this.f1452c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f1452c.performViewCreated();
                C0320r c0320r = this.f1450a;
                Fragment fragment5 = this.f1452c;
                c0320r.m1614m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f1452c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m1445k() {
        return this.f1452c;
    }

    /* renamed from: l */
    public final boolean m1446l(View view) {
        if (view == this.f1452c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f1452c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m1447m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f1453d) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m1445k());
                return;
            }
            return;
        }
        try {
            this.f1453d = true;
            boolean z10 = false;
            while (true) {
                int m1438d = m1438d();
                Fragment fragment = this.f1452c;
                int i10 = fragment.mState;
                if (m1438d == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f1452c.mBeingSaved) {
                        if (AbstractC0326x.m1617I0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1452c);
                        }
                        this.f1451b.m1474p().m1378g(this.f1452c);
                        this.f1451b.m1477s(this);
                        if (AbstractC0326x.m1617I0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f1452c);
                        }
                        this.f1452c.initState();
                    }
                    Fragment fragment2 = this.f1452c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            AbstractC0313m0 m1545n = AbstractC0313m0.m1545n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f1452c.mHidden) {
                                m1545n.m1549c(this);
                            } else {
                                m1545n.m1551e(this);
                            }
                        }
                        Fragment fragment3 = this.f1452c;
                        AbstractC0326x abstractC0326x = fragment3.mFragmentManager;
                        if (abstractC0326x != null) {
                            abstractC0326x.m1647G0(fragment3);
                        }
                        Fragment fragment4 = this.f1452c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f1452c.mChildFragmentManager.m1653K();
                    }
                    return;
                }
                if (m1438d <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m1443i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f1451b.m1475q(fragment.mWho) == null) {
                                m1452r();
                            }
                            m1441g();
                            break;
                        case 1:
                            m1442h();
                            this.f1452c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (AbstractC0326x.m1617I0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1452c);
                            }
                            Fragment fragment5 = this.f1452c;
                            if (fragment5.mBeingSaved) {
                                m1452r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                m1453s();
                            }
                            Fragment fragment6 = this.f1452c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                AbstractC0313m0.m1545n(viewGroup2, fragment6.getParentFragmentManager()).m1550d(this);
                            }
                            this.f1452c.mState = 3;
                            break;
                        case 4:
                            m1456v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m1448n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m1437c();
                            break;
                        case 1:
                            m1439e();
                            break;
                        case 2:
                            m1444j();
                            m1440f();
                            break;
                        case 3:
                            m1435a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC0313m0.m1545n(viewGroup3, fragment.getParentFragmentManager()).m1548b(AbstractC0313m0.e.c.m1574c(this.f1452c.mView.getVisibility()), this);
                            }
                            this.f1452c.mState = 4;
                            break;
                        case 5:
                            m1455u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m1450p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f1453d = false;
        }
    }

    /* renamed from: n */
    public void m1448n() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1452c);
        }
        this.f1452c.performPause();
        this.f1450a.m1607f(this.f1452c, false);
    }

    /* renamed from: o */
    public void m1449o(ClassLoader classLoader) {
        Bundle bundle = this.f1452c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1452c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1452c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f1452c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f1452c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f1452c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f1452c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f1452c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: p */
    public void m1450p() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1452c);
        }
        View focusedView = this.f1452c.getFocusedView();
        if (focusedView != null && m1446l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (AbstractC0326x.m1617I0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f1452c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f1452c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f1452c.setFocusedView(null);
        this.f1452c.performResume();
        this.f1450a.m1610i(this.f1452c, false);
        Fragment fragment = this.f1452c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public final Bundle m1451q() {
        Bundle bundle = new Bundle();
        this.f1452c.performSaveInstanceState(bundle);
        this.f1450a.m1611j(this.f1452c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1452c.mView != null) {
            m1453s();
        }
        if (this.f1452c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1452c.mSavedViewState);
        }
        if (this.f1452c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f1452c.mSavedViewRegistryState);
        }
        if (!this.f1452c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1452c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: r */
    public void m1452r() {
        C0295d0 c0295d0 = new C0295d0(this.f1452c);
        Fragment fragment = this.f1452c;
        if (fragment.mState <= -1 || c0295d0.f1427t != null) {
            c0295d0.f1427t = fragment.mSavedFragmentState;
        } else {
            Bundle m1451q = m1451q();
            c0295d0.f1427t = m1451q;
            if (this.f1452c.mTargetWho != null) {
                if (m1451q == null) {
                    c0295d0.f1427t = new Bundle();
                }
                c0295d0.f1427t.putString("android:target_state", this.f1452c.mTargetWho);
                int i10 = this.f1452c.mTargetRequestCode;
                if (i10 != 0) {
                    c0295d0.f1427t.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f1451b.m1458B(this.f1452c.mWho, c0295d0);
    }

    /* renamed from: s */
    public void m1453s() {
        if (this.f1452c.mView == null) {
            return;
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f1452c + " with view " + this.f1452c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1452c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1452c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1452c.mViewLifecycleOwner.m1539e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1452c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: t */
    public void m1454t(int i10) {
        this.f1454e = i10;
    }

    /* renamed from: u */
    public void m1455u() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1452c);
        }
        this.f1452c.performStart();
        this.f1450a.m1612k(this.f1452c, false);
    }

    /* renamed from: v */
    public void m1456v() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1452c);
        }
        this.f1452c.performStop();
        this.f1450a.m1613l(this.f1452c, false);
    }
}
