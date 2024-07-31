package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0172c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0174e;
import androidx.activity.result.InterfaceC0171b;
import androidx.activity.result.InterfaceC0173d;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0337b0;
import androidx.lifecycle.C0345f0;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.C0353j0;
import androidx.lifecycle.C0355k0;
import androidx.lifecycle.C0356l;
import androidx.lifecycle.C0369y;
import androidx.lifecycle.FragmentC0366v;
import androidx.lifecycle.InterfaceC0342e;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0351i0;
import androidx.lifecycle.InterfaceC0354k;
import androidx.savedstate.C0395a;
import gd.C2245s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p057e.C1634a;
import p057e.InterfaceC1635b;
import p059e1.AbstractC1637a;
import p059e1.C1640d;
import p072f.AbstractC1793a;
import p090g0.C1941a;
import p133j0.InterfaceC3202a;
import p148k0.C3327l;
import p148k0.InterfaceC3321i;
import p148k0.InterfaceC3331n;
import p247r1.C4274c;
import p247r1.C4276e;
import p247r1.InterfaceC4275d;
import p315w1.C5196a;
import p329x.ActivityC5490h;
import p329x.C5484b;
import p329x.C5485c;
import p329x.C5491i;
import p329x.C5501s;
import p329x.InterfaceC5498p;
import p329x.InterfaceC5499q;
import p345y.C5782a;
import p345y.InterfaceC5784c;
import p345y.InterfaceC5785d;
import sd.InterfaceC4569a;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC5490h implements InterfaceC0351i0, InterfaceC0342e, InterfaceC4275d, InterfaceC0161n, InterfaceC0173d, InterfaceC5784c, InterfaceC5785d, InterfaceC5498p, InterfaceC5499q, InterfaceC3321i, InterfaceC0158k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final C1634a mContextAwareHelper;
    private C0345f0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    public final C0157j mFullyDrawnReporter;
    private final C0356l mLifecycleRegistry;
    private final C3327l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC3202a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3202a<C5491i>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3202a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC3202a<C5501s>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3202a<Integer>> mOnTrimMemoryListeners;
    public final InterfaceExecutorC0141f mReportFullyDrawnExecutor;
    public final C4274c mSavedStateRegistryController;
    private C0349h0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC0136a implements Runnable {
        public RunnableC0136a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C0137b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f434h;

            /* renamed from: i */
            public final /* synthetic */ AbstractC1793a.a f435i;

            public a(int i10, AbstractC1793a.a aVar) {
                this.f434h = i10;
                this.f435i = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0137b.this.m609c(this.f434h, this.f435i.m7246a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ int f437h;

            /* renamed from: i */
            public final /* synthetic */ IntentSender.SendIntentException f438i;

            public b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f437h = i10;
                this.f438i = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0137b.this.m608b(this.f437h, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f438i));
            }
        }

        public C0137b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo572f(int i10, AbstractC1793a<I, O> abstractC1793a, I i11, C5485c c5485c) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1793a.a<O> mo7245b = abstractC1793a.mo7245b(componentActivity, i11);
            if (mo7245b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, mo7245b));
                return;
            }
            Intent mo1750a = abstractC1793a.mo1750a(componentActivity, i11);
            Bundle bundle = null;
            if (mo1750a.getExtras() != null && mo1750a.getExtras().getClassLoader() == null) {
                mo1750a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo1750a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo1750a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo1750a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo1750a.getAction())) {
                String[] stringArrayExtra = mo1750a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C5484b.m21745g(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo1750a.getAction())) {
                C5484b.m21749k(componentActivity, mo1750a, i10, bundle2);
                return;
            }
            C0174e c0174e = (C0174e) mo1750a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C5484b.m21750l(componentActivity, c0174e.m632e(), i10, c0174e.m629a(), c0174e.m630b(), c0174e.m631d(), 0, bundle2);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new b(i10, e10));
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes.dex */
    public static class C0138c {
        /* renamed from: a */
        public static void m573a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes.dex */
    public static class C0139d {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m574a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes.dex */
    public static final class C0140e {

        /* renamed from: a */
        public Object f440a;

        /* renamed from: b */
        public C0349h0 f441b;
    }

    /* renamed from: androidx.activity.ComponentActivity$f */
    /* loaded from: classes.dex */
    public interface InterfaceExecutorC0141f extends Executor {
        /* renamed from: f */
        void mo575f();

        /* renamed from: i0 */
        void mo576i0(View view);
    }

    /* renamed from: androidx.activity.ComponentActivity$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnDrawListenerC0142g implements InterfaceExecutorC0141f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: i */
        public Runnable f443i;

        /* renamed from: h */
        public final long f442h = SystemClock.uptimeMillis() + 10000;

        /* renamed from: j */
        public boolean f444j = false;

        public ViewTreeObserverOnDrawListenerC0142g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m578b() {
            Runnable runnable = this.f443i;
            if (runnable != null) {
                runnable.run();
                this.f443i = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f443i = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f444j) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.ViewTreeObserverOnDrawListenerC0142g.this.m578b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0141f
        /* renamed from: f */
        public void mo575f() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0141f
        /* renamed from: i0 */
        public void mo576i0(View view) {
            if (this.f444j) {
                return;
            }
            this.f444j = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f443i;
            if (runnable != null) {
                runnable.run();
                this.f443i = null;
                if (!ComponentActivity.this.mFullyDrawnReporter.m604c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f442h) {
                return;
            }
            this.f444j = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$h */
    /* loaded from: classes.dex */
    public static class C0143h implements InterfaceExecutorC0141f {

        /* renamed from: h */
        public final Handler f446h = m579a();

        /* renamed from: a */
        public final Handler m579a() {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f446h.postAtFrontOfQueue(runnable);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0141f
        /* renamed from: f */
        public void mo575f() {
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC0141f
        /* renamed from: i0 */
        public void mo576i0(View view) {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C1634a();
        this.mMenuHostHelper = new C3327l(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new C0356l(this);
        C4274c m16401a = C4274c.m16401a(this);
        this.mSavedStateRegistryController = m16401a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0136a());
        InterfaceExecutorC0141f createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new C0157j(createFullyDrawnExecutor, new InterfaceC4569a() { // from class: androidx.activity.e
            @Override // sd.InterfaceC4569a
            public final Object invoke() {
                C2245s lambda$new$0;
                lambda$new$0 = ComponentActivity.this.lambda$new$0();
                return lambda$new$0;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0137b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            getLifecycle().mo1800a(new InterfaceC0350i() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC0350i
                /* renamed from: a */
                public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                    if (aVar == AbstractC0344f.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            C0138c.m573a(peekDecorView);
                        }
                    }
                }
            });
        }
        getLifecycle().mo1800a(new InterfaceC0350i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                if (aVar == AbstractC0344f.a.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m6509b();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().m1823a();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.mo575f();
                }
            }
        });
        getLifecycle().mo1800a(new InterfaceC0350i() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo1802c(this);
            }
        });
        m16401a.m16403c();
        C0369y.m1885c(this);
        if (19 <= i10 && i10 <= 23) {
            getLifecycle().mo1800a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().m1997h(ACTIVITY_RESULT_TAG, new C0395a.c() { // from class: androidx.activity.b
            @Override // androidx.savedstate.C0395a.c
            /* renamed from: a */
            public final Bundle mo595a() {
                Bundle lambda$new$1;
                lambda$new$1 = ComponentActivity.this.lambda$new$1();
                return lambda$new$1;
            }
        });
        addOnContextAvailableListener(new InterfaceC1635b() { // from class: androidx.activity.c
            @Override // p057e.InterfaceC1635b
            /* renamed from: a */
            public final void mo596a(Context context) {
                ComponentActivity.this.lambda$new$2(context);
            }
        });
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private InterfaceExecutorC0141f createFullyDrawnExecutor() {
        return Build.VERSION.SDK_INT < 16 ? new C0143h() : new ViewTreeObserverOnDrawListenerC0142g();
    }

    private void initViewTreeOwners() {
        C0353j0.m1827a(getWindow().getDecorView(), this);
        C0355k0.m1828a(getWindow().getDecorView(), this);
        C4276e.m16407a(getWindow().getDecorView(), this);
        C0164q.m606a(getWindow().getDecorView(), this);
        C0163p.m605a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2245s lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.m613h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle m1992b = getSavedStateRegistry().m1992b(ACTIVITY_RESULT_TAG);
        if (m1992b != null) {
            this.mActivityResultRegistry.m612g(m1992b);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo576i0(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p148k0.InterfaceC3321i
    public void addMenuProvider(InterfaceC3331n interfaceC3331n) {
        this.mMenuHostHelper.m12266c(interfaceC3331n);
    }

    public void addMenuProvider(InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k) {
        this.mMenuHostHelper.m12267d(interfaceC3331n, interfaceC0354k);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k, AbstractC0344f.b bVar) {
        this.mMenuHostHelper.m12268e(interfaceC3331n, interfaceC0354k, bVar);
    }

    @Override // p345y.InterfaceC5784c
    public final void addOnConfigurationChangedListener(InterfaceC3202a<Configuration> interfaceC3202a) {
        this.mOnConfigurationChangedListeners.add(interfaceC3202a);
    }

    public final void addOnContextAvailableListener(InterfaceC1635b interfaceC1635b) {
        this.mContextAwareHelper.m6508a(interfaceC1635b);
    }

    @Override // p329x.InterfaceC5498p
    public final void addOnMultiWindowModeChangedListener(InterfaceC3202a<C5491i> interfaceC3202a) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC3202a);
    }

    public final void addOnNewIntentListener(InterfaceC3202a<Intent> interfaceC3202a) {
        this.mOnNewIntentListeners.add(interfaceC3202a);
    }

    @Override // p329x.InterfaceC5499q
    public final void addOnPictureInPictureModeChangedListener(InterfaceC3202a<C5501s> interfaceC3202a) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC3202a);
    }

    @Override // p345y.InterfaceC5785d
    public final void addOnTrimMemoryListener(InterfaceC3202a<Integer> interfaceC3202a) {
        this.mOnTrimMemoryListeners.add(interfaceC3202a);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0140e c0140e = (C0140e) getLastNonConfigurationInstance();
            if (c0140e != null) {
                this.mViewModelStore = c0140e.f441b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0349h0();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0173d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0342e
    public AbstractC1637a getDefaultViewModelCreationExtras() {
        C1640d c1640d = new C1640d();
        if (getApplication() != null) {
            c1640d.m6518c(C0345f0.a.f1716h, getApplication());
        }
        c1640d.m6518c(C0369y.f1767a, this);
        c1640d.m6518c(C0369y.f1768b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c1640d.m6518c(C0369y.f1769c, getIntent().getExtras());
        }
        return c1640d;
    }

    public C0345f0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0337b0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public C0157j getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0140e c0140e = (C0140e) getLastNonConfigurationInstance();
        if (c0140e != null) {
            return c0140e.f440a;
        }
        return null;
    }

    @Override // p329x.ActivityC5490h, androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0161n
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p247r1.InterfaceC4275d
    public final C0395a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m16402b();
    }

    @Override // androidx.lifecycle.InterfaceC0351i0
    public C0349h0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.m608b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m585e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC3202a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m16404d(bundle);
        this.mContextAwareHelper.m6510c(this);
        super.onCreate(bundle);
        FragmentC0366v.m1866e(this);
        if (C1941a.m7848d()) {
            this.mOnBackPressedDispatcher.m586f(C0139d.m574a(this));
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.m12269h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.m12271j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC3202a<C5491i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C5491i(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC3202a<C5491i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C5491i(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC3202a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.mMenuHostHelper.m12270i(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC3202a<C5501s>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C5501s(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC3202a<C5501s>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C5501s(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.m12272k(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m608b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0140e c0140e;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0349h0 c0349h0 = this.mViewModelStore;
        if (c0349h0 == null && (c0140e = (C0140e) getLastNonConfigurationInstance()) != null) {
            c0349h0 = c0140e.f441b;
        }
        if (c0349h0 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0140e c0140e2 = new C0140e();
        c0140e2.f440a = onRetainCustomNonConfigurationInstance;
        c0140e2.f441b = c0349h0;
        return c0140e2;
    }

    @Override // p329x.ActivityC5490h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0344f lifecycle = getLifecycle();
        if (lifecycle instanceof C0356l) {
            ((C0356l) lifecycle).m1839n(AbstractC0344f.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m16405e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<InterfaceC3202a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m6511d();
    }

    public final <I, O> AbstractC0172c<I> registerForActivityResult(AbstractC1793a<I, O> abstractC1793a, ActivityResultRegistry activityResultRegistry, InterfaceC0171b<O> interfaceC0171b) {
        return activityResultRegistry.m614i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC1793a, interfaceC0171b);
    }

    public final <I, O> AbstractC0172c<I> registerForActivityResult(AbstractC1793a<I, O> abstractC1793a, InterfaceC0171b<O> interfaceC0171b) {
        return registerForActivityResult(abstractC1793a, this.mActivityResultRegistry, interfaceC0171b);
    }

    @Override // p148k0.InterfaceC3321i
    public void removeMenuProvider(InterfaceC3331n interfaceC3331n) {
        this.mMenuHostHelper.m12273l(interfaceC3331n);
    }

    @Override // p345y.InterfaceC5784c
    public final void removeOnConfigurationChangedListener(InterfaceC3202a<Configuration> interfaceC3202a) {
        this.mOnConfigurationChangedListeners.remove(interfaceC3202a);
    }

    public final void removeOnContextAvailableListener(InterfaceC1635b interfaceC1635b) {
        this.mContextAwareHelper.m6512e(interfaceC1635b);
    }

    @Override // p329x.InterfaceC5498p
    public final void removeOnMultiWindowModeChangedListener(InterfaceC3202a<C5491i> interfaceC3202a) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC3202a);
    }

    public final void removeOnNewIntentListener(InterfaceC3202a<Intent> interfaceC3202a) {
        this.mOnNewIntentListeners.remove(interfaceC3202a);
    }

    @Override // p329x.InterfaceC5499q
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3202a<C5501s> interfaceC3202a) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC3202a);
    }

    @Override // p345y.InterfaceC5785d
    public final void removeOnTrimMemoryListener(InterfaceC3202a<Integer> interfaceC3202a) {
        this.mOnTrimMemoryListeners.remove(interfaceC3202a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C5196a.m21040h()) {
                C5196a.m21035c("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 19) {
                if (i10 == 19 && C5782a.checkSelfPermission(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                }
                this.mFullyDrawnReporter.m603b();
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m603b();
        } finally {
            C5196a.m21038f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo576i0(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo576i0(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo576i0(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
