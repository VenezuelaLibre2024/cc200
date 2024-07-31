package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC0306j;
import androidx.lifecycle.C0353j0;
import androidx.lifecycle.C0355k0;
import androidx.savedstate.C0395a;
import p057e.InterfaceC1635b;
import p101h.AbstractC2259a;
import p101h.AbstractC2262d;
import p101h.InterfaceC2260b;
import p101h.InterfaceC2261c;
import p162l.AbstractC3391b;
import p187n.C3627d1;
import p247r1.C4276e;
import p329x.C5484b;
import p329x.C5492j;
import p329x.C5504v;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class ActivityC0185b extends ActivityC0306j implements InterfaceC2261c, C5504v.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC2262d mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public class a implements C0395a.c {
        public a() {
        }

        @Override // androidx.savedstate.C0395a.c
        /* renamed from: a */
        public Bundle mo595a() {
            Bundle bundle = new Bundle();
            ActivityC0185b.this.getDelegate().mo9060v(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC1635b {
        public b() {
        }

        @Override // p057e.InterfaceC1635b
        /* renamed from: a */
        public void mo596a(Context context) {
            AbstractC2262d delegate = ActivityC0185b.this.getDelegate();
            delegate.mo9053o();
            delegate.mo9056r(ActivityC0185b.this.getSavedStateRegistry().m1992b(ActivityC0185b.DELEGATE_TAG));
        }
    }

    public ActivityC0185b() {
        initDelegate();
    }

    public ActivityC0185b(int i10) {
        super(i10);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m1997h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C0353j0.m1827a(getWindow().getDecorView(), this);
        C0355k0.m1828a(getWindow().getDecorView(), this);
        C4276e.m16407a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo9045d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo9047f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2259a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo9004g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p329x.ActivityC5490h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2259a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo9015r(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().mo9048i(i10);
    }

    public AbstractC2262d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC2262d.m9032g(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC2260b getDrawerToggleDelegate() {
        return getDelegate().mo9049k();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo9051m();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C3627d1.m13499d()) {
            this.mResources = new C3627d1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC2259a getSupportActionBar() {
        return getDelegate().mo9052n();
    }

    @Override // p329x.C5504v.a
    public Intent getSupportParentActivityIntent() {
        return C5492j.m21802a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo9054p();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo9055q(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C5504v c5504v) {
        c5504v.m22154b(this);
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo9057s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC2259a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo9007j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo9058t(bundle);
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo9059u();
    }

    public void onPrepareSupportNavigateUpTaskStack(C5504v c5504v) {
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo9061w();
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo9062x();
    }

    @Override // p101h.InterfaceC2261c
    public void onSupportActionModeFinished(AbstractC3391b abstractC3391b) {
    }

    @Override // p101h.InterfaceC2261c
    public void onSupportActionModeStarted(AbstractC3391b abstractC3391b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C5504v m22152d = C5504v.m22152d(this);
        onCreateSupportNavigateUpTaskStack(m22152d);
        onPrepareSupportNavigateUpTaskStack(m22152d);
        m22152d.m22156e();
        try {
            C5484b.m21740b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().mo9043H(charSequence);
    }

    @Override // p101h.InterfaceC2261c
    public AbstractC3391b onWindowStartingSupportActionMode(AbstractC3391b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2259a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo9016s()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().mo9038C(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo9039D(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo9040E(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo9041F(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().mo9042G(i10);
    }

    public AbstractC3391b startSupportActionMode(AbstractC3391b.a aVar) {
        return getDelegate().mo9044I(aVar);
    }

    @Override // androidx.fragment.app.ActivityC0306j
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo9054p();
    }

    public void supportNavigateUpTo(Intent intent) {
        C5492j.m21806e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().mo9037A(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C5492j.m21807f(this, intent);
    }
}
