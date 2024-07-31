package p175m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p027c0.InterfaceMenuC0579a;

/* renamed from: m.e */
/* loaded from: classes.dex */
public class MenuC3489e extends AbstractC3486b implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC0579a f12252d;

    public MenuC3489e(Context context, InterfaceMenuC0579a interfaceMenuC0579a) {
        super(context);
        if (interfaceMenuC0579a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f12252d = interfaceMenuC0579a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m12974c(this.f12252d.add(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m12974c(this.f12252d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m12974c(this.f12252d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m12974c(this.f12252d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f12252d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m12974c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m12975d(this.f12252d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m12975d(this.f12252d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m12975d(this.f12252d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m12975d(this.f12252d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m12976e();
        this.f12252d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f12252d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m12974c(this.f12252d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m12974c(this.f12252d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f12252d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f12252d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f12252d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f12252d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m12977f(i10);
        this.f12252d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m12978g(i10);
        this.f12252d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f12252d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f12252d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f12252d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f12252d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f12252d.size();
    }
}
