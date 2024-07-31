package p175m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p027c0.InterfaceMenuItemC0580b;
import p148k0.AbstractC3307b;
import p162l.InterfaceC3392c;

/* renamed from: m.c */
/* loaded from: classes.dex */
public class MenuItemC3487c extends AbstractC3486b implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC0580b f12240d;

    /* renamed from: e */
    public Method f12241e;

    /* renamed from: m.c$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3307b {

        /* renamed from: d */
        public final ActionProvider f12242d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f12242d = actionProvider;
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: a */
        public boolean mo11977a() {
            return this.f12242d.hasSubMenu();
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: c */
        public View mo11979c() {
            return this.f12242d.onCreateActionView();
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: e */
        public boolean mo11981e() {
            return this.f12242d.onPerformDefaultAction();
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: f */
        public void mo11982f(SubMenu subMenu) {
            this.f12242d.onPrepareSubMenu(MenuItemC3487c.this.m12975d(subMenu));
        }
    }

    /* renamed from: m.c$b */
    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public AbstractC3307b.b f12244f;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: b */
        public boolean mo11978b() {
            return this.f12242d.isVisible();
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: d */
        public View mo11980d(MenuItem menuItem) {
            return this.f12242d.onCreateActionView(menuItem);
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: g */
        public boolean mo11983g() {
            return this.f12242d.overridesItemVisibility();
        }

        @Override // p148k0.AbstractC3307b
        /* renamed from: j */
        public void mo11986j(AbstractC3307b.b bVar) {
            this.f12244f = bVar;
            this.f12242d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC3307b.b bVar = this.f12244f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: m.c$c */
    /* loaded from: classes.dex */
    public static class c extends FrameLayout implements InterfaceC3392c {

        /* renamed from: h */
        public final CollapsibleActionView f12246h;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f12246h = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m12980a() {
            return (View) this.f12246h;
        }

        @Override // p162l.InterfaceC3392c
        /* renamed from: c */
        public void mo954c() {
            this.f12246h.onActionViewExpanded();
        }

        @Override // p162l.InterfaceC3392c
        /* renamed from: d */
        public void mo956d() {
            this.f12246h.onActionViewCollapsed();
        }
    }

    /* renamed from: m.c$d */
    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f12247a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f12247a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f12247a.onMenuItemActionCollapse(MenuItemC3487c.this.m12974c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f12247a.onMenuItemActionExpand(MenuItemC3487c.this.m12974c(menuItem));
        }
    }

    /* renamed from: m.c$e */
    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f12249a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f12249a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f12249a.onMenuItemClick(MenuItemC3487c.this.m12974c(menuItem));
        }
    }

    public MenuItemC3487c(Context context, InterfaceMenuItemC0580b interfaceMenuItemC0580b) {
        super(context);
        if (interfaceMenuItemC0580b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f12240d = interfaceMenuItemC0580b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f12240d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f12240d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC3307b mo819a = this.f12240d.mo819a();
        if (mo819a instanceof a) {
            return ((a) mo819a).f12242d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f12240d.getActionView();
        return actionView instanceof c ? ((c) actionView).m12980a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f12240d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f12240d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f12240d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f12240d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f12240d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f12240d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f12240d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f12240d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f12240d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f12240d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f12240d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f12240d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f12240d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m12975d(this.f12240d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f12240d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f12240d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f12240d.getTooltipText();
    }

    /* renamed from: h */
    public void m12979h(boolean z10) {
        try {
            if (this.f12241e == null) {
                this.f12241e = this.f12240d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f12241e.invoke(this.f12240d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f12240d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f12240d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f12240d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f12240d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f12240d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f12240d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC3307b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.f12237a, actionProvider) : new a(this.f12237a, actionProvider);
        InterfaceMenuItemC0580b interfaceMenuItemC0580b = this.f12240d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC0580b.mo820b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f12240d.setActionView(i10);
        View actionView = this.f12240d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f12240d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f12240d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f12240d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f12240d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f12240d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f12240d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f12240d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f12240d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f12240d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f12240d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12240d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12240d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f12240d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f12240d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f12240d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f12240d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12240d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f12240d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f12240d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f12240d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f12240d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f12240d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f12240d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12240d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f12240d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f12240d.setVisible(z10);
    }
}
