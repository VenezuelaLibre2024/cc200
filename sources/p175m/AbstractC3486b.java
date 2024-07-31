package p175m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p027c0.InterfaceMenuItemC0580b;
import p027c0.InterfaceSubMenuC0581c;
import p285u.C4777g;

/* renamed from: m.b */
/* loaded from: classes.dex */
public abstract class AbstractC3486b {

    /* renamed from: a */
    public final Context f12237a;

    /* renamed from: b */
    public C4777g<InterfaceMenuItemC0580b, MenuItem> f12238b;

    /* renamed from: c */
    public C4777g<InterfaceSubMenuC0581c, SubMenu> f12239c;

    public AbstractC3486b(Context context) {
        this.f12237a = context;
    }

    /* renamed from: c */
    public final MenuItem m12974c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0580b)) {
            return menuItem;
        }
        InterfaceMenuItemC0580b interfaceMenuItemC0580b = (InterfaceMenuItemC0580b) menuItem;
        if (this.f12238b == null) {
            this.f12238b = new C4777g<>();
        }
        MenuItem menuItem2 = this.f12238b.get(interfaceMenuItemC0580b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC3487c menuItemC3487c = new MenuItemC3487c(this.f12237a, interfaceMenuItemC0580b);
        this.f12238b.put(interfaceMenuItemC0580b, menuItemC3487c);
        return menuItemC3487c;
    }

    /* renamed from: d */
    public final SubMenu m12975d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0581c)) {
            return subMenu;
        }
        InterfaceSubMenuC0581c interfaceSubMenuC0581c = (InterfaceSubMenuC0581c) subMenu;
        if (this.f12239c == null) {
            this.f12239c = new C4777g<>();
        }
        SubMenu subMenu2 = this.f12239c.get(interfaceSubMenuC0581c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC3491g subMenuC3491g = new SubMenuC3491g(this.f12237a, interfaceSubMenuC0581c);
        this.f12239c.put(interfaceSubMenuC0581c, subMenuC3491g);
        return subMenuC3491g;
    }

    /* renamed from: e */
    public final void m12976e() {
        C4777g<InterfaceMenuItemC0580b, MenuItem> c4777g = this.f12238b;
        if (c4777g != null) {
            c4777g.clear();
        }
        C4777g<InterfaceSubMenuC0581c, SubMenu> c4777g2 = this.f12239c;
        if (c4777g2 != null) {
            c4777g2.clear();
        }
    }

    /* renamed from: f */
    public final void m12977f(int i10) {
        if (this.f12238b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f12238b.size()) {
            if (this.f12238b.m18761i(i11).getGroupId() == i10) {
                this.f12238b.m18763k(i11);
                i11--;
            }
            i11++;
        }
    }

    /* renamed from: g */
    public final void m12978g(int i10) {
        if (this.f12238b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f12238b.size(); i11++) {
            if (this.f12238b.m18761i(i11).getItemId() == i10) {
                this.f12238b.m18763k(i11);
                return;
            }
        }
    }
}
