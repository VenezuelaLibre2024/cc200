package p175m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p015b0.C0436a;
import p027c0.InterfaceMenuItemC0580b;
import p148k0.AbstractC3307b;
import p345y.C5782a;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C3485a implements InterfaceMenuItemC0580b {

    /* renamed from: a */
    public final int f12217a;

    /* renamed from: b */
    public final int f12218b;

    /* renamed from: c */
    public final int f12219c;

    /* renamed from: d */
    public CharSequence f12220d;

    /* renamed from: e */
    public CharSequence f12221e;

    /* renamed from: f */
    public Intent f12222f;

    /* renamed from: g */
    public char f12223g;

    /* renamed from: i */
    public char f12225i;

    /* renamed from: k */
    public Drawable f12227k;

    /* renamed from: l */
    public Context f12228l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f12229m;

    /* renamed from: n */
    public CharSequence f12230n;

    /* renamed from: o */
    public CharSequence f12231o;

    /* renamed from: h */
    public int f12224h = 4096;

    /* renamed from: j */
    public int f12226j = 4096;

    /* renamed from: p */
    public ColorStateList f12232p = null;

    /* renamed from: q */
    public PorterDuff.Mode f12233q = null;

    /* renamed from: r */
    public boolean f12234r = false;

    /* renamed from: s */
    public boolean f12235s = false;

    /* renamed from: t */
    public int f12236t = 16;

    public C3485a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f12228l = context;
        this.f12217a = i11;
        this.f12218b = i10;
        this.f12219c = i13;
        this.f12220d = charSequence;
    }

    @Override // p027c0.InterfaceMenuItemC0580b
    /* renamed from: a */
    public AbstractC3307b mo819a() {
        return null;
    }

    @Override // p027c0.InterfaceMenuItemC0580b
    /* renamed from: b */
    public InterfaceMenuItemC0580b mo820b(AbstractC3307b abstractC3307b) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m12970c() {
        Drawable drawable = this.f12227k;
        if (drawable != null) {
            if (this.f12234r || this.f12235s) {
                Drawable m2265p = C0436a.m2265p(drawable);
                this.f12227k = m2265p;
                Drawable mutate = m2265p.mutate();
                this.f12227k = mutate;
                if (this.f12234r) {
                    C0436a.m2263n(mutate, this.f12232p);
                }
                if (this.f12235s) {
                    C0436a.m2264o(this.f12227k, this.f12233q);
                }
            }
        }
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0580b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0580b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC0580b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f12226j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f12225i;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f12230n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f12218b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f12227k;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f12232p;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f12233q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f12222f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f12217a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f12224h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f12223g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f12219c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f12220d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f12221e;
        return charSequence != null ? charSequence : this.f12220d;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f12231o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f12236t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f12236t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f12236t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f12236t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f12225i = Character.toLowerCase(c10);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f12225i = Character.toLowerCase(c10);
        this.f12226j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f12236t = (z10 ? 1 : 0) | (this.f12236t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f12236t = (z10 ? 2 : 0) | (this.f12236t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0580b setContentDescription(CharSequence charSequence) {
        this.f12230n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f12236t = (z10 ? 16 : 0) | (this.f12236t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f12227k = C5782a.getDrawable(this.f12228l, i10);
        m12970c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f12227k = drawable;
        m12970c();
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f12232p = colorStateList;
        this.f12234r = true;
        m12970c();
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f12233q = mode;
        this.f12235s = true;
        m12970c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f12222f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f12223g = c10;
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f12223g = c10;
        this.f12224h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f12229m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f12223g = c10;
        this.f12225i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f12223g = c10;
        this.f12224h = KeyEvent.normalizeMetaState(i10);
        this.f12225i = Character.toLowerCase(c11);
        this.f12226j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f12220d = this.f12228l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f12220d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f12221e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0580b setTooltipText(CharSequence charSequence) {
        this.f12231o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f12236t = (this.f12236t & 8) | (z10 ? 0 : 8);
        return this;
    }
}
