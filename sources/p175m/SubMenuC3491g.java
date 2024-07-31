package p175m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p027c0.InterfaceSubMenuC0581c;

/* renamed from: m.g */
/* loaded from: classes.dex */
public class SubMenuC3491g extends MenuC3489e implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC0581c f12253e;

    public SubMenuC3491g(Context context, InterfaceSubMenuC0581c interfaceSubMenuC0581c) {
        super(context, interfaceSubMenuC0581c);
        this.f12253e = interfaceSubMenuC0581c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f12253e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m12974c(this.f12253e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f12253e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f12253e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f12253e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f12253e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f12253e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f12253e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f12253e.setIcon(drawable);
        return this;
    }
}
