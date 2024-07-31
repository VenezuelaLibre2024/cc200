package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0161n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0173d;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.C0356l;
import androidx.lifecycle.InterfaceC0351i0;
import androidx.savedstate.C0395a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p057e.InterfaceC1635b;
import p074f1.AbstractC1800a;
import p133j0.InterfaceC3202a;
import p148k0.InterfaceC3321i;
import p148k0.InterfaceC3331n;
import p247r1.InterfaceC4275d;
import p329x.AbstractC5503u;
import p329x.C5484b;
import p329x.C5491i;
import p329x.C5501s;
import p329x.InterfaceC5498p;
import p329x.InterfaceC5499q;
import p345y.InterfaceC5784c;
import p345y.InterfaceC5785d;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class ActivityC0306j extends ComponentActivity implements C5484b.g, C5484b.i {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C0356l mFragmentLifecycleRegistry;
    public final C0314n mFragments;
    public boolean mResumed;
    public boolean mStopped;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0318p<ActivityC0306j> implements InterfaceC5784c, InterfaceC5785d, InterfaceC5498p, InterfaceC5499q, InterfaceC0351i0, InterfaceC0161n, InterfaceC0173d, InterfaceC4275d, InterfaceC0291b0, InterfaceC3321i {
        public a() {
            super(ActivityC0306j.this);
        }

        @Override // androidx.fragment.app.InterfaceC0291b0
        /* renamed from: a */
        public void mo1394a(AbstractC0326x abstractC0326x, Fragment fragment) {
            ActivityC0306j.this.onAttachFragment(fragment);
        }

        @Override // p148k0.InterfaceC3321i
        public void addMenuProvider(InterfaceC3331n interfaceC3331n) {
            ActivityC0306j.this.addMenuProvider(interfaceC3331n);
        }

        @Override // p345y.InterfaceC5784c
        public void addOnConfigurationChangedListener(InterfaceC3202a<Configuration> interfaceC3202a) {
            ActivityC0306j.this.addOnConfigurationChangedListener(interfaceC3202a);
        }

        @Override // p329x.InterfaceC5498p
        public void addOnMultiWindowModeChangedListener(InterfaceC3202a<C5491i> interfaceC3202a) {
            ActivityC0306j.this.addOnMultiWindowModeChangedListener(interfaceC3202a);
        }

        @Override // p329x.InterfaceC5499q
        public void addOnPictureInPictureModeChangedListener(InterfaceC3202a<C5501s> interfaceC3202a) {
            ActivityC0306j.this.addOnPictureInPictureModeChangedListener(interfaceC3202a);
        }

        @Override // p345y.InterfaceC5785d
        public void addOnTrimMemoryListener(InterfaceC3202a<Integer> interfaceC3202a) {
            ActivityC0306j.this.addOnTrimMemoryListener(interfaceC3202a);
        }

        @Override // androidx.fragment.app.AbstractC0318p, androidx.fragment.app.AbstractC0310l
        /* renamed from: c */
        public View mo1350c(int i10) {
            return ActivityC0306j.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC0318p, androidx.fragment.app.AbstractC0310l
        /* renamed from: d */
        public boolean mo1351d() {
            Window window = ActivityC0306j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.InterfaceC0173d
        public ActivityResultRegistry getActivityResultRegistry() {
            return ActivityC0306j.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0354k
        public AbstractC0344f getLifecycle() {
            return ActivityC0306j.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0161n
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC0306j.this.getOnBackPressedDispatcher();
        }

        @Override // p247r1.InterfaceC4275d
        public C0395a getSavedStateRegistry() {
            return ActivityC0306j.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0351i0
        public C0349h0 getViewModelStore() {
            return ActivityC0306j.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0318p
        /* renamed from: h */
        public void mo1518h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0306j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0318p
        /* renamed from: j */
        public LayoutInflater mo1520j() {
            return ActivityC0306j.this.getLayoutInflater().cloneInContext(ActivityC0306j.this);
        }

        @Override // androidx.fragment.app.AbstractC0318p
        /* renamed from: l */
        public boolean mo1521l(String str) {
            return C5484b.m21748j(ActivityC0306j.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0318p
        /* renamed from: o */
        public void mo1522o() {
            m1523p();
        }

        /* renamed from: p */
        public void m1523p() {
            ActivityC0306j.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC0318p
        /* renamed from: q */
        public ActivityC0306j mo1519i() {
            return ActivityC0306j.this;
        }

        @Override // p148k0.InterfaceC3321i
        public void removeMenuProvider(InterfaceC3331n interfaceC3331n) {
            ActivityC0306j.this.removeMenuProvider(interfaceC3331n);
        }

        @Override // p345y.InterfaceC5784c
        public void removeOnConfigurationChangedListener(InterfaceC3202a<Configuration> interfaceC3202a) {
            ActivityC0306j.this.removeOnConfigurationChangedListener(interfaceC3202a);
        }

        @Override // p329x.InterfaceC5498p
        public void removeOnMultiWindowModeChangedListener(InterfaceC3202a<C5491i> interfaceC3202a) {
            ActivityC0306j.this.removeOnMultiWindowModeChangedListener(interfaceC3202a);
        }

        @Override // p329x.InterfaceC5499q
        public void removeOnPictureInPictureModeChangedListener(InterfaceC3202a<C5501s> interfaceC3202a) {
            ActivityC0306j.this.removeOnPictureInPictureModeChangedListener(interfaceC3202a);
        }

        @Override // p345y.InterfaceC5785d
        public void removeOnTrimMemoryListener(InterfaceC3202a<Integer> interfaceC3202a) {
            ActivityC0306j.this.removeOnTrimMemoryListener(interfaceC3202a);
        }
    }

    public ActivityC0306j() {
        this.mFragments = C0314n.m1577b(new a());
        this.mFragmentLifecycleRegistry = new C0356l(this);
        this.mStopped = true;
        init();
    }

    public ActivityC0306j(int i10) {
        super(i10);
        this.mFragments = C0314n.m1577b(new a());
        this.mFragmentLifecycleRegistry = new C0356l(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m1997h(LIFECYCLE_TAG, new C0395a.c() { // from class: androidx.fragment.app.f
            public /* synthetic */ C0298f() {
            }

            @Override // androidx.savedstate.C0395a.c
            /* renamed from: a */
            public final Bundle mo595a() {
                Bundle lambda$init$0;
                lambda$init$0 = ActivityC0306j.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new InterfaceC3202a() { // from class: androidx.fragment.app.i
            public /* synthetic */ C0304i() {
            }

            @Override // p133j0.InterfaceC3202a
            public final void accept(Object obj) {
                ActivityC0306j.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC3202a() { // from class: androidx.fragment.app.h
            public /* synthetic */ C0302h() {
            }

            @Override // p133j0.InterfaceC3202a
            public final void accept(Object obj) {
                ActivityC0306j.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC1635b() { // from class: androidx.fragment.app.g
            public /* synthetic */ C0300g() {
            }

            @Override // p057e.InterfaceC1635b
            /* renamed from: a */
            public final void mo596a(Context context) {
                ActivityC0306j.this.lambda$init$3(context);
            }
        });
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m1589m();
    }

    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m1589m();
    }

    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.m1578a(null);
    }

    private static boolean markState(AbstractC0326x abstractC0326x, AbstractC0344f.b bVar) {
        boolean z10 = false;
        for (Fragment fragment : abstractC0326x.m1729u0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), bVar);
                }
                C0309k0 c0309k0 = fragment.mViewLifecycleOwner;
                if (c0309k0 != null && c0309k0.getLifecycle().mo1801b().m1811c(AbstractC0344f.b.STARTED)) {
                    fragment.mViewLifecycleOwner.m1540f(bVar);
                    z10 = true;
                }
                if (fragment.mLifecycleRegistry.mo1801b().m1811c(AbstractC0344f.b.STARTED)) {
                    fragment.mLifecycleRegistry.m1839n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m1590n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC1800a.m7270b(this).mo7271a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.m1588l().m1676Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC0326x getSupportFragmentManager() {
        return this.mFragments.m1588l();
    }

    @Deprecated
    public AbstractC1800a getSupportLoaderManager() {
        return AbstractC1800a.m7270b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), AbstractC0344f.b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m1589m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_CREATE);
        this.mFragments.m1581e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m1582f();
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.m1580d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m1583g();
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m1589m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m1589m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m1587k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_RESUME);
        this.mFragments.m1584h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m1589m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m1579c();
        }
        this.mFragments.m1587k();
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_START);
        this.mFragments.m1585i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m1589m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m1586j();
        this.mFragmentLifecycleRegistry.m1833h(AbstractC0344f.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC5503u abstractC5503u) {
        C5484b.m21746h(this, abstractC5503u);
    }

    public void setExitSharedElementCallback(AbstractC5503u abstractC5503u) {
        C5484b.m21747i(this, abstractC5503u);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            C5484b.m21749k(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            C5484b.m21750l(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C5484b.m21741c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C5484b.m21743e(this);
    }

    public void supportStartPostponedEnterTransition() {
        C5484b.m21751m(this);
    }

    @Override // p329x.C5484b.i
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
