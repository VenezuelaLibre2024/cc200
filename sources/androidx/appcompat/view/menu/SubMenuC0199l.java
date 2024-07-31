package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0192e;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class SubMenuC0199l extends C0192e implements SubMenu {

    /* renamed from: B */
    public C0192e f838B;

    /* renamed from: C */
    public C0194g f839C;

    public SubMenuC0199l(Context context, C0192e c0192e, C0194g c0194g) {
        super(context);
        this.f838B = c0192e;
        this.f839C = c0194g;
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: D */
    public C0192e mo758D() {
        return this.f838B.mo758D();
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: F */
    public boolean mo760F() {
        return this.f838B.mo760F();
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: G */
    public boolean mo761G() {
        return this.f838B.mo761G();
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: H */
    public boolean mo762H() {
        return this.f838B.mo762H();
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: R */
    public void mo772R(C0192e.a aVar) {
        this.f838B.mo772R(aVar);
    }

    /* renamed from: e0 */
    public Menu m860e0() {
        return this.f838B;
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: f */
    public boolean mo790f(C0194g c0194g) {
        return this.f838B.mo790f(c0194g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f839C;
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: h */
    public boolean mo792h(C0192e c0192e, MenuItem menuItem) {
        return super.mo792h(c0192e, menuItem) || this.f838B.mo792h(c0192e, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: k */
    public boolean mo795k(C0194g c0194g) {
        return this.f838B.mo795k(c0194g);
    }

    @Override // androidx.appcompat.view.menu.C0192e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f838B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m775U(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m776V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m778X(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m779Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m780Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f839C.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f839C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0192e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f838B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0192e
    /* renamed from: t */
    public String mo803t() {
        C0194g c0194g = this.f839C;
        int itemId = c0194g != null ? c0194g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo803t() + ":" + itemId;
    }
}
