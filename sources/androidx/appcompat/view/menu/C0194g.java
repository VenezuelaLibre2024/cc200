package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0197j;
import p015b0.C0436a;
import p027c0.InterfaceMenuItemC0580b;
import p089g.C1938h;
import p118i.C2572a;
import p148k0.AbstractC3307b;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0194g implements InterfaceMenuItemC0580b {

    /* renamed from: A */
    public View f770A;

    /* renamed from: B */
    public AbstractC3307b f771B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f772C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f774E;

    /* renamed from: a */
    public final int f775a;

    /* renamed from: b */
    public final int f776b;

    /* renamed from: c */
    public final int f777c;

    /* renamed from: d */
    public final int f778d;

    /* renamed from: e */
    public CharSequence f779e;

    /* renamed from: f */
    public CharSequence f780f;

    /* renamed from: g */
    public Intent f781g;

    /* renamed from: h */
    public char f782h;

    /* renamed from: j */
    public char f784j;

    /* renamed from: l */
    public Drawable f786l;

    /* renamed from: n */
    public C0192e f788n;

    /* renamed from: o */
    public SubMenuC0199l f789o;

    /* renamed from: p */
    public Runnable f790p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f791q;

    /* renamed from: r */
    public CharSequence f792r;

    /* renamed from: s */
    public CharSequence f793s;

    /* renamed from: z */
    public int f800z;

    /* renamed from: i */
    public int f783i = 4096;

    /* renamed from: k */
    public int f785k = 4096;

    /* renamed from: m */
    public int f787m = 0;

    /* renamed from: t */
    public ColorStateList f794t = null;

    /* renamed from: u */
    public PorterDuff.Mode f795u = null;

    /* renamed from: v */
    public boolean f796v = false;

    /* renamed from: w */
    public boolean f797w = false;

    /* renamed from: x */
    public boolean f798x = false;

    /* renamed from: y */
    public int f799y = 16;

    /* renamed from: D */
    public boolean f773D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public class a implements AbstractC3307b.b {
        public a() {
        }

        @Override // p148k0.AbstractC3307b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0194g c0194g = C0194g.this;
            c0194g.f788n.m764J(c0194g);
        }
    }

    public C0194g(C0192e c0192e, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f800z = 0;
        this.f788n = c0192e;
        this.f775a = i11;
        this.f776b = i10;
        this.f777c = i12;
        this.f778d = i13;
        this.f779e = charSequence;
        this.f800z = i14;
    }

    /* renamed from: d */
    public static void m816d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: A */
    public boolean m817A() {
        return this.f788n.mo762H() && m824g() != 0;
    }

    /* renamed from: B */
    public boolean m818B() {
        return (this.f800z & 4) == 4;
    }

    @Override // p027c0.InterfaceMenuItemC0580b
    /* renamed from: a */
    public AbstractC3307b mo819a() {
        return this.f771B;
    }

    @Override // p027c0.InterfaceMenuItemC0580b
    /* renamed from: b */
    public InterfaceMenuItemC0580b mo820b(AbstractC3307b abstractC3307b) {
        AbstractC3307b abstractC3307b2 = this.f771B;
        if (abstractC3307b2 != null) {
            abstractC3307b2.m11984h();
        }
        this.f770A = null;
        this.f771B = abstractC3307b;
        this.f788n.m765K(true);
        AbstractC3307b abstractC3307b3 = this.f771B;
        if (abstractC3307b3 != null) {
            abstractC3307b3.mo11986j(new a());
        }
        return this;
    }

    /* renamed from: c */
    public void m821c() {
        this.f788n.m763I(this);
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f800z & 8) == 0) {
            return false;
        }
        if (this.f770A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f772C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f788n.mo790f(this);
        }
        return false;
    }

    /* renamed from: e */
    public final Drawable m822e(Drawable drawable) {
        if (drawable != null && this.f798x && (this.f796v || this.f797w)) {
            drawable = C0436a.m2265p(drawable).mutate();
            if (this.f796v) {
                C0436a.m2263n(drawable, this.f794t);
            }
            if (this.f797w) {
                C0436a.m2264o(drawable, this.f795u);
            }
            this.f798x = false;
        }
        return drawable;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m827j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f772C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f788n.mo795k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m823f() {
        return this.f778d;
    }

    /* renamed from: g */
    public char m824g() {
        return this.f788n.mo761G() ? this.f784j : this.f782h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public View getActionView() {
        View view = this.f770A;
        if (view != null) {
            return view;
        }
        AbstractC3307b abstractC3307b = this.f771B;
        if (abstractC3307b == null) {
            return null;
        }
        View mo11980d = abstractC3307b.mo11980d(this);
        this.f770A = mo11980d;
        return mo11980d;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f785k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f784j;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f792r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f776b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f786l;
        if (drawable != null) {
            return m822e(drawable);
        }
        if (this.f787m == 0) {
            return null;
        }
        Drawable m10278b = C2572a.m10278b(this.f788n.m804u(), this.f787m);
        this.f787m = 0;
        this.f786l = m10278b;
        return m822e(m10278b);
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f794t;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f795u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f781g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f775a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f774E;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f783i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f782h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f777c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f789o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f779e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f780f;
        if (charSequence == null) {
            charSequence = this.f779e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f793s;
    }

    /* renamed from: h */
    public String m825h() {
        int i10;
        char m824g = m824g();
        if (m824g == 0) {
            return "";
        }
        Resources resources = this.f788n.m804u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f788n.m804u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C1938h.f7496k));
        }
        int i11 = this.f788n.mo761G() ? this.f785k : this.f783i;
        m816d(sb2, i11, 65536, resources.getString(C1938h.f7492g));
        m816d(sb2, i11, 4096, resources.getString(C1938h.f7488c));
        m816d(sb2, i11, 2, resources.getString(C1938h.f7487b));
        m816d(sb2, i11, 1, resources.getString(C1938h.f7493h));
        m816d(sb2, i11, 4, resources.getString(C1938h.f7495j));
        m816d(sb2, i11, 8, resources.getString(C1938h.f7491f));
        if (m824g == '\b') {
            i10 = C1938h.f7489d;
        } else if (m824g == '\n') {
            i10 = C1938h.f7490e;
        } else {
            if (m824g != ' ') {
                sb2.append(m824g);
                return sb2.toString();
            }
            i10 = C1938h.f7494i;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f789o != null;
    }

    /* renamed from: i */
    public CharSequence m826i(InterfaceC0197j.a aVar) {
        return (aVar == null || !aVar.mo692c()) ? getTitle() : getTitleCondensed();
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f773D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f799y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f799y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f799y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC3307b abstractC3307b = this.f771B;
        return (abstractC3307b == null || !abstractC3307b.mo11983g()) ? (this.f799y & 8) == 0 : (this.f799y & 8) == 0 && this.f771B.mo11978b();
    }

    /* renamed from: j */
    public boolean m827j() {
        AbstractC3307b abstractC3307b;
        if ((this.f800z & 8) == 0) {
            return false;
        }
        if (this.f770A == null && (abstractC3307b = this.f771B) != null) {
            this.f770A = abstractC3307b.mo11980d(this);
        }
        return this.f770A != null;
    }

    /* renamed from: k */
    public boolean m828k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f791q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0192e c0192e = this.f788n;
        if (c0192e.mo792h(c0192e, this)) {
            return true;
        }
        Runnable runnable = this.f790p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f781g != null) {
            try {
                this.f788n.m804u().startActivity(this.f781g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC3307b abstractC3307b = this.f771B;
        return abstractC3307b != null && abstractC3307b.mo11981e();
    }

    /* renamed from: l */
    public boolean m829l() {
        return (this.f799y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m830m() {
        return (this.f799y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m831n() {
        return (this.f800z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m832o() {
        return (this.f800z & 2) == 2;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC0580b setActionView(int i10) {
        Context m804u = this.f788n.m804u();
        setActionView(LayoutInflater.from(m804u).inflate(i10, (ViewGroup) new LinearLayout(m804u), false));
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC0580b setActionView(View view) {
        int i10;
        this.f770A = view;
        this.f771B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f775a) > 0) {
            view.setId(i10);
        }
        this.f788n.m763I(this);
        return this;
    }

    /* renamed from: r */
    public void m835r(boolean z10) {
        this.f773D = z10;
        this.f788n.m765K(false);
    }

    /* renamed from: s */
    public void m836s(boolean z10) {
        int i10 = this.f799y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f799y = i11;
        if (i10 != i11) {
            this.f788n.m765K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f784j == c10) {
            return this;
        }
        this.f784j = Character.toLowerCase(c10);
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f784j == c10 && this.f785k == i10) {
            return this;
        }
        this.f784j = Character.toLowerCase(c10);
        this.f785k = KeyEvent.normalizeMetaState(i10);
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f799y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f799y = i11;
        if (i10 != i11) {
            this.f788n.m765K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f799y & 4) != 0) {
            this.f788n.m774T(this);
        } else {
            m836s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0580b setContentDescription(CharSequence charSequence) {
        this.f792r = charSequence;
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f799y = z10 ? this.f799y | 16 : this.f799y & (-17);
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f786l = null;
        this.f787m = i10;
        this.f798x = true;
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f787m = 0;
        this.f786l = drawable;
        this.f798x = true;
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f794t = colorStateList;
        this.f796v = true;
        this.f798x = true;
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f795u = mode;
        this.f797w = true;
        this.f798x = true;
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f781g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f782h == c10) {
            return this;
        }
        this.f782h = c10;
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f782h == c10 && this.f783i == i10) {
            return this;
        }
        this.f782h = c10;
        this.f783i = KeyEvent.normalizeMetaState(i10);
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f772C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f791q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f782h = c10;
        this.f784j = Character.toLowerCase(c11);
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f782h = c10;
        this.f783i = KeyEvent.normalizeMetaState(i10);
        this.f784j = Character.toLowerCase(c11);
        this.f785k = KeyEvent.normalizeMetaState(i11);
        this.f788n.m765K(false);
        return this;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f800z = i10;
        this.f788n.m763I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f788n.m804u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f779e = charSequence;
        this.f788n.m765K(false);
        SubMenuC0199l subMenuC0199l = this.f789o;
        if (subMenuC0199l != null) {
            subMenuC0199l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f780f = charSequence;
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC0580b setTooltipText(CharSequence charSequence) {
        this.f793s = charSequence;
        this.f788n.m765K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m842y(z10)) {
            this.f788n.m764J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m837t(boolean z10) {
        this.f799y = (z10 ? 4 : 0) | (this.f799y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f779e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m838u(boolean z10) {
        this.f799y = z10 ? this.f799y | 32 : this.f799y & (-33);
    }

    /* renamed from: v */
    public void m839v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f774E = contextMenuInfo;
    }

    @Override // p027c0.InterfaceMenuItemC0580b, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC0580b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* renamed from: x */
    public void m841x(SubMenuC0199l subMenuC0199l) {
        this.f789o = subMenuC0199l;
        subMenuC0199l.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m842y(boolean z10) {
        int i10 = this.f799y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f799y = i11;
        return i10 != i11;
    }

    /* renamed from: z */
    public boolean m843z() {
        return this.f788n.m756A();
    }
}
