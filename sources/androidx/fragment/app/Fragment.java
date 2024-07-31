package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0172c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0171b;
import androidx.activity.result.InterfaceC0173d;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0337b0;
import androidx.lifecycle.C0345f0;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.C0353j0;
import androidx.lifecycle.C0355k0;
import androidx.lifecycle.C0356l;
import androidx.lifecycle.C0361q;
import androidx.lifecycle.C0369y;
import androidx.lifecycle.InterfaceC0342e;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0351i0;
import androidx.lifecycle.InterfaceC0354k;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C0395a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p003a1.C0019d;
import p059e1.AbstractC1637a;
import p059e1.C1640d;
import p072f.AbstractC1793a;
import p074f1.AbstractC1800a;
import p148k0.C3317g;
import p230q.InterfaceC4120a;
import p247r1.C4274c;
import p247r1.C4276e;
import p247r1.InterfaceC4275d;
import p329x.AbstractC5503u;
import p329x.C5485c;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0354k, InterfaceC0351i0, InterfaceC0342e, InterfaceC4275d {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C0283j mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public AbstractC0326x mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public C0345f0.b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public AbstractC0326x mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AbstractC0318p<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C0356l mLifecycleRegistry;
    public AbstractC0344f.b mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0286m> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final AbstractC0286m mSavedStateAttachListener;
    public C4274c mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C0309k0 mViewLifecycleOwner;
    public C0361q<InterfaceC0354k> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* renamed from: androidx.fragment.app.Fragment$6 */
    /* loaded from: classes.dex */
    public class C02736 implements InterfaceC0350i {
        public C02736() {
        }

        @Override // androidx.lifecycle.InterfaceC0350i
        /* renamed from: a */
        public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
            View view;
            if (aVar != AbstractC0344f.a.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            C0284k.m1354a(view);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    public class C0274a<I> extends AbstractC0172c<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f1297a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1793a f1298b;

        public C0274a(AtomicReference atomicReference, AbstractC1793a abstractC1793a) {
            this.f1297a = atomicReference;
            this.f1298b = abstractC1793a;
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: b */
        public void mo618b(I i10, C5485c c5485c) {
            AbstractC0172c abstractC0172c = (AbstractC0172c) this.f1297a.get();
            if (abstractC0172c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0172c.mo618b(i10, c5485c);
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: c */
        public void mo619c() {
            AbstractC0172c abstractC0172c = (AbstractC0172c) this.f1297a.getAndSet(null);
            if (abstractC0172c != null) {
                abstractC0172c.mo619c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC0275b implements Runnable {
        public RunnableC0275b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class C0276c extends AbstractC0286m {
        public C0276c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0286m
        /* renamed from: a */
        public void mo1349a() {
            Fragment.this.mSavedStateRegistryController.m16403c();
            C0369y.m1885c(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class RunnableC0277d implements Runnable {
        public RunnableC0277d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public class RunnableC0278e implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC0313m0 f1303h;

        public RunnableC0278e(AbstractC0313m0 abstractC0313m0) {
            this.f1303h = abstractC0313m0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1303h.m1552g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public class C0279f extends AbstractC0310l {
        public C0279f() {
        }

        @Override // androidx.fragment.app.AbstractC0310l
        /* renamed from: c */
        public View mo1350c(int i10) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0310l
        /* renamed from: d */
        public boolean mo1351d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public class C0280g implements InterfaceC4120a<Void, ActivityResultRegistry> {
        public C0280g() {
        }

        @Override // p230q.InterfaceC4120a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC0173d ? ((InterfaceC0173d) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public class C0281h implements InterfaceC4120a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f1307a;

        public C0281h(ActivityResultRegistry activityResultRegistry) {
            this.f1307a = activityResultRegistry;
        }

        @Override // p230q.InterfaceC4120a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r12) {
            return this.f1307a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: classes.dex */
    public class C0282i extends AbstractC0286m {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4120a f1309a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f1310b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC1793a f1311c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC0171b f1312d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0282i(InterfaceC4120a interfaceC4120a, AtomicReference atomicReference, AbstractC1793a abstractC1793a, InterfaceC0171b interfaceC0171b) {
            super(null);
            this.f1309a = interfaceC4120a;
            this.f1310b = atomicReference;
            this.f1311c = abstractC1793a;
            this.f1312d = interfaceC0171b;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0286m
        /* renamed from: a */
        public void mo1349a() {
            String generateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f1310b.set(((ActivityResultRegistry) this.f1309a.apply(null)).m614i(generateActivityResultKey, Fragment.this, this.f1311c, this.f1312d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    /* loaded from: classes.dex */
    public static class C0283j {

        /* renamed from: a */
        public View f1314a;

        /* renamed from: b */
        public boolean f1315b;

        /* renamed from: c */
        public int f1316c;

        /* renamed from: d */
        public int f1317d;

        /* renamed from: e */
        public int f1318e;

        /* renamed from: f */
        public int f1319f;

        /* renamed from: g */
        public int f1320g;

        /* renamed from: h */
        public ArrayList<String> f1321h;

        /* renamed from: i */
        public ArrayList<String> f1322i;

        /* renamed from: j */
        public Object f1323j = null;

        /* renamed from: k */
        public Object f1324k;

        /* renamed from: l */
        public Object f1325l;

        /* renamed from: m */
        public Object f1326m;

        /* renamed from: n */
        public Object f1327n;

        /* renamed from: o */
        public Object f1328o;

        /* renamed from: p */
        public Boolean f1329p;

        /* renamed from: q */
        public Boolean f1330q;

        /* renamed from: r */
        public AbstractC5503u f1331r;

        /* renamed from: s */
        public AbstractC5503u f1332s;

        /* renamed from: t */
        public float f1333t;

        /* renamed from: u */
        public View f1334u;

        /* renamed from: v */
        public boolean f1335v;

        public C0283j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f1324k = obj;
            this.f1325l = null;
            this.f1326m = obj;
            this.f1327n = null;
            this.f1328o = obj;
            this.f1333t = 1.0f;
            this.f1334u = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    /* loaded from: classes.dex */
    public static class C0284k {
        /* renamed from: a */
        public static void m1354a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    /* loaded from: classes.dex */
    public static class C0285l extends RuntimeException {
        public C0285l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$m */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0286m {
        public AbstractC0286m() {
        }

        public /* synthetic */ AbstractC0286m(RunnableC0275b runnableC0275b) {
            this();
        }

        /* renamed from: a */
        public abstract void mo1349a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.Fragment$n */
    /* loaded from: classes.dex */
    public static class C0287n implements Parcelable {
        public static final Parcelable.Creator<C0287n> CREATOR = new a();

        /* renamed from: h */
        public final Bundle f1336h;

        /* renamed from: androidx.fragment.app.Fragment$n$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<C0287n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0287n createFromParcel(Parcel parcel) {
                return new C0287n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0287n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0287n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0287n[] newArray(int i10) {
                return new C0287n[i10];
            }
        }

        public C0287n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1336h = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f1336h);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0327y();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0275b();
        this.mMaxState = AbstractC0344f.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0361q<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C0276c();
        initLifecycle();
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private C0283j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0283j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC0344f.b bVar = this.mMaxState;
        return (bVar == AbstractC0344f.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            C0019d.m105l(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        if (abstractC0326x == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC0326x.m1691g0(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0356l(this);
        this.mSavedStateRegistryController = C4274c.m16401a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C0316o.m1594d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new C0285l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new C0285l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0285l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0285l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private <I, O> AbstractC0172c<I> prepareCallInternal(AbstractC1793a<I, O> abstractC1793a, InterfaceC4120a<Void, ActivityResultRegistry> interfaceC4120a, InterfaceC0171b<O> interfaceC0171b) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0282i(interfaceC4120a, atomicReference, abstractC1793a, interfaceC0171b));
            return new C0274a(atomicReference, abstractC1793a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(AbstractC0286m abstractC0286m) {
        if (this.mState >= 0) {
            abstractC0286m.mo1349a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0286m);
        }
    }

    private void restoreViewState() {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        AbstractC0326x abstractC0326x;
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j != null) {
            c0283j.f1335v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0326x = this.mFragmentManager) == null) {
            return;
        }
        AbstractC0313m0 m1545n = AbstractC0313m0.m1545n(viewGroup, abstractC0326x);
        m1545n.m1559p();
        if (z10) {
            this.mHost.m1598g().post(new RunnableC0278e(m1545n));
        } else {
            m1545n.m1552g();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC0310l createFragmentContainer() {
        return new C0279f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC1800a.m7270b(this).mo7271a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m1676Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m1702k0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC0306j getActivity() {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p == null) {
            return null;
        }
        return (ActivityC0306j) abstractC0318p.m1596e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null || (bool = c0283j.f1330q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null || (bool = c0283j.f1329p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1314a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC0326x getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p == null) {
            return null;
        }
        return abstractC0318p.m1597f();
    }

    @Override // androidx.lifecycle.InterfaceC0342e
    public AbstractC1637a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C1640d c1640d = new C1640d();
        if (application != null) {
            c1640d.m6518c(C0345f0.a.f1716h, application);
        }
        c1640d.m6518c(C0369y.f1767a, this);
        c1640d.m6518c(C0369y.f1768b, this);
        if (getArguments() != null) {
            c1640d.m6518c(C0369y.f1769c, getArguments());
        }
        return c1640d;
    }

    public C0345f0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC0326x.m1617I0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C0337b0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 0;
        }
        return c0283j.f1316c;
    }

    public Object getEnterTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1323j;
    }

    public AbstractC5503u getEnterTransitionCallback() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1331r;
    }

    public int getExitAnim() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 0;
        }
        return c0283j.f1317d;
    }

    public Object getExitTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1325l;
    }

    public AbstractC5503u getExitTransitionCallback() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1332s;
    }

    public View getFocusedView() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1334u;
    }

    @Deprecated
    public final AbstractC0326x getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p == null) {
            return null;
        }
        return abstractC0318p.mo1519i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo1520j = abstractC0318p.mo1520j();
        C3317g.m12237b(mo1520j, this.mChildFragmentManager.m1735w0());
        return mo1520j;
    }

    @Override // androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC1800a getLoaderManager() {
        return AbstractC1800a.m7270b(this);
    }

    public int getNextTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 0;
        }
        return c0283j.f1320g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC0326x getParentFragmentManager() {
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        if (abstractC0326x != null) {
            return abstractC0326x;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return false;
        }
        return c0283j.f1315b;
    }

    public int getPopEnterAnim() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 0;
        }
        return c0283j.f1318e;
    }

    public int getPopExitAnim() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 0;
        }
        return c0283j.f1319f;
    }

    public float getPostOnViewCreatedAlpha() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return 1.0f;
        }
        return c0283j.f1333t;
    }

    public Object getReenterTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        Object obj = c0283j.f1326m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C0019d.m103j(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        Object obj = c0283j.f1324k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p247r1.InterfaceC4275d
    public final C0395a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m16402b();
    }

    public Object getSharedElementEnterTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        return c0283j.f1327n;
    }

    public Object getSharedElementReturnTransition() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return null;
        }
        Object obj = c0283j.f1328o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0283j c0283j = this.mAnimationInfo;
        return (c0283j == null || (arrayList = c0283j.f1321h) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0283j c0283j = this.mAnimationInfo;
        return (c0283j == null || (arrayList = c0283j.f1322i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C0019d.m104k(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0354k getViewLifecycleOwner() {
        C0309k0 c0309k0 = this.mViewLifecycleOwner;
        if (c0309k0 != null) {
            return c0309k0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<InterfaceC0354k> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0351i0
    public C0349h0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC0344f.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m1641D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0327y();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        AbstractC0326x abstractC0326x;
        return this.mHidden || ((abstractC0326x = this.mFragmentManager) != null && abstractC0326x.m1656L0(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        AbstractC0326x abstractC0326x;
        return this.mMenuVisible && ((abstractC0326x = this.mFragmentManager) == null || abstractC0326x.m1658M0(this.mParentFragment));
    }

    public boolean isPostponed() {
        C0283j c0283j = this.mAnimationInfo;
        if (c0283j == null) {
            return false;
        }
        return c0283j.f1335v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        if (abstractC0326x == null) {
            return false;
        }
        return abstractC0326x.m1664P0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m1679Z0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC0318p<?> abstractC0318p = this.mHost;
        Activity m1596e = abstractC0318p == null ? null : abstractC0318p.m1596e();
        if (m1596e != null) {
            this.mCalled = false;
            onAttach(m1596e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m1662O0(1)) {
            return;
        }
        this.mChildFragmentManager.m1640D();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC0318p<?> abstractC0318p = this.mHost;
        Activity m1596e = abstractC0318p == null ? null : abstractC0318p.m1596e();
        if (m1596e != null) {
            this.mCalled = false;
            onInflate(m1596e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m1679Z0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m1741z();
        } else {
            throw new C0317o0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<AbstractC0286m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo1349a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m1707n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m1597f());
        if (this.mCalled) {
            this.mFragmentManager.m1651J(this);
            this.mChildFragmentManager.m1635A();
        } else {
            throw new C0317o0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m1639C(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m1679Z0();
        this.mState = 1;
        this.mCalled = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.mo1800a(new InterfaceC0350i() { // from class: androidx.fragment.app.Fragment.6
                public C02736() {
                }

                @Override // androidx.lifecycle.InterfaceC0350i
                /* renamed from: a */
                public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                    View view;
                    if (aVar != AbstractC0344f.a.ON_STOP || (view = Fragment.this.mView) == null) {
                        return;
                    }
                    C0284k.m1354a(view);
                }
            });
        }
        this.mSavedStateRegistryController.m16404d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m1833h(AbstractC0344f.a.ON_CREATE);
            return;
        }
        throw new C0317o0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z10 | this.mChildFragmentManager.m1642E(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m1679Z0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0309k0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.m1537c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m1536b();
            C0353j0.m1827a(this.mView, this.mViewLifecycleOwner);
            C0355k0.m1828a(this.mView, this.mViewLifecycleOwner);
            C4276e.m16407a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.m1644F();
        this.mLifecycleRegistry.m1833h(AbstractC0344f.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C0317o0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m1646G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo1801b().m1811c(AbstractC0344f.b.CREATED)) {
            this.mViewLifecycleOwner.m1535a(AbstractC0344f.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC1800a.m7270b(this).mo7273d();
            this.mPerformedCreateView = false;
        } else {
            throw new C0317o0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m1649H0()) {
                return;
            }
            this.mChildFragmentManager.m1644F();
            this.mChildFragmentManager = new C0327y();
            return;
        }
        throw new C0317o0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m1655L(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m1657M(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m1661O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1535a(AbstractC0344f.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m1833h(AbstractC0344f.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C0317o0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onPrepareOptionsMenu(menu);
        }
        return z10 | this.mChildFragmentManager.m1665Q(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m1660N0 = this.mFragmentManager.m1660N0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m1660N0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m1660N0);
            onPrimaryNavigationFragmentChanged(m1660N0);
            this.mChildFragmentManager.m1666R();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m1679Z0();
        this.mChildFragmentManager.m1684c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0317o0("Fragment " + this + " did not call through to super.onResume()");
        }
        C0356l c0356l = this.mLifecycleRegistry;
        AbstractC0344f.a aVar = AbstractC0344f.a.ON_RESUME;
        c0356l.m1833h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1535a(aVar);
        }
        this.mChildFragmentManager.m1667S();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m16405e(bundle);
        Bundle m1618Q0 = this.mChildFragmentManager.m1618Q0();
        if (m1618Q0 != null) {
            bundle.putParcelable("android:support:fragments", m1618Q0);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m1679Z0();
        this.mChildFragmentManager.m1684c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0317o0("Fragment " + this + " did not call through to super.onStart()");
        }
        C0356l c0356l = this.mLifecycleRegistry;
        AbstractC0344f.a aVar = AbstractC0344f.a.ON_START;
        c0356l.m1833h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1535a(aVar);
        }
        this.mChildFragmentManager.m1668T();
    }

    public void performStop() {
        this.mChildFragmentManager.m1670V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1535a(AbstractC0344f.a.ON_STOP);
        }
        this.mLifecycleRegistry.m1833h(AbstractC0344f.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C0317o0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m1672W();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1335v = true;
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f1335v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        this.mPostponedHandler = abstractC0326x != null ? abstractC0326x.m1732v0().m1598g() : new Handler(Looper.getMainLooper());
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> AbstractC0172c<I> registerForActivityResult(AbstractC1793a<I, O> abstractC1793a, ActivityResultRegistry activityResultRegistry, InterfaceC0171b<O> interfaceC0171b) {
        return prepareCallInternal(abstractC1793a, new C0281h(activityResultRegistry), interfaceC0171b);
    }

    public final <I, O> AbstractC0172c<I> registerForActivityResult(AbstractC1793a<I, O> abstractC1793a, InterfaceC0171b<O> interfaceC0171b) {
        return prepareCallInternal(abstractC1793a, new C0280g(), interfaceC0171b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().m1671V0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC0306j requireActivity() {
        ActivityC0306j activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final AbstractC0326x requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m1705l1(parcelable);
        this.mChildFragmentManager.m1640D();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1538d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m1535a(AbstractC0344f.a.ON_CREATE);
            }
        } else {
            throw new C0317o0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1330q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f1329p = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f1316c = i10;
        ensureAnimationInfo().f1317d = i11;
        ensureAnimationInfo().f1318e = i12;
        ensureAnimationInfo().f1319f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC5503u abstractC5503u) {
        ensureAnimationInfo().f1331r = abstractC5503u;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f1323j = obj;
    }

    public void setExitSharedElementCallback(AbstractC5503u abstractC5503u) {
        ensureAnimationInfo().f1332s = abstractC5503u;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f1325l = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f1334u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo1522o();
        }
    }

    public void setInitialSavedState(C0287n c0287n) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c0287n == null || (bundle = c0287n.f1336h) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo1522o();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f1320g = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f1315b = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f1333t = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f1326m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        C0019d.m106m(this);
        this.mRetainInstance = z10;
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        if (abstractC0326x == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            abstractC0326x.m1704l(this);
        } else {
            abstractC0326x.m1700j1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f1324k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f1327n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0283j c0283j = this.mAnimationInfo;
        c0283j.f1321h = arrayList;
        c0283j.f1322i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f1328o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        if (fragment != null) {
            C0019d.m107n(this, fragment, i10);
        }
        AbstractC0326x abstractC0326x = this.mFragmentManager;
        AbstractC0326x abstractC0326x2 = fragment != null ? fragment.mFragmentManager : null;
        if (abstractC0326x != null && abstractC0326x2 != null && abstractC0326x != abstractC0326x2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
                this.mTargetRequestCode = i10;
            }
            this.mTargetWho = fragment.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        C0019d.m108o(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC0326x abstractC0326x = this.mFragmentManager;
            abstractC0326x.m1683b1(abstractC0326x.m1737x(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p != null) {
            return abstractC0318p.mo1521l(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0318p<?> abstractC0318p = this.mHost;
        if (abstractC0318p != null) {
            abstractC0318p.m1600m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m1673W0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m1675X0(this, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f1335v) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f1335v = false;
        } else if (Looper.myLooper() != this.mHost.m1598g().getLooper()) {
            this.mHost.m1598g().postAtFrontOfQueue(new RunnableC0277d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
