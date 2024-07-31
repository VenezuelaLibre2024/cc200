package p162l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p027c0.InterfaceMenuC0579a;
import p027c0.InterfaceMenuItemC0580b;
import p162l.AbstractC3391b;
import p175m.MenuC3489e;
import p175m.MenuItemC3487c;
import p285u.C4777g;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C3395f extends ActionMode {

    /* renamed from: a */
    public final Context f11844a;

    /* renamed from: b */
    public final AbstractC3391b f11845b;

    /* renamed from: l.f$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC3391b.a {

        /* renamed from: a */
        public final ActionMode.Callback f11846a;

        /* renamed from: b */
        public final Context f11847b;

        /* renamed from: c */
        public final ArrayList<C3395f> f11848c = new ArrayList<>();

        /* renamed from: d */
        public final C4777g<Menu, Menu> f11849d = new C4777g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f11847b = context;
            this.f11846a = callback;
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: a */
        public boolean mo9125a(AbstractC3391b abstractC3391b, Menu menu) {
            return this.f11846a.onCreateActionMode(m12617e(abstractC3391b), m12618f(menu));
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: b */
        public boolean mo9126b(AbstractC3391b abstractC3391b, Menu menu) {
            return this.f11846a.onPrepareActionMode(m12617e(abstractC3391b), m12618f(menu));
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: c */
        public void mo9127c(AbstractC3391b abstractC3391b) {
            this.f11846a.onDestroyActionMode(m12617e(abstractC3391b));
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: d */
        public boolean mo9128d(AbstractC3391b abstractC3391b, MenuItem menuItem) {
            return this.f11846a.onActionItemClicked(m12617e(abstractC3391b), new MenuItemC3487c(this.f11847b, (InterfaceMenuItemC0580b) menuItem));
        }

        /* renamed from: e */
        public ActionMode m12617e(AbstractC3391b abstractC3391b) {
            int size = this.f11848c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3395f c3395f = this.f11848c.get(i10);
                if (c3395f != null && c3395f.f11845b == abstractC3391b) {
                    return c3395f;
                }
            }
            C3395f c3395f2 = new C3395f(this.f11847b, abstractC3391b);
            this.f11848c.add(c3395f2);
            return c3395f2;
        }

        /* renamed from: f */
        public final Menu m12618f(Menu menu) {
            Menu menu2 = this.f11849d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC3489e menuC3489e = new MenuC3489e(this.f11847b, (InterfaceMenuC0579a) menu);
            this.f11849d.put(menu, menuC3489e);
            return menuC3489e;
        }
    }

    public C3395f(Context context, AbstractC3391b abstractC3391b) {
        this.f11844a = context;
        this.f11845b = abstractC3391b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f11845b.mo9219c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f11845b.mo9220d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC3489e(this.f11844a, (InterfaceMenuC0579a) this.f11845b.mo9221e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f11845b.mo9222f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f11845b.mo9223g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f11845b.m12607h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f11845b.mo9224i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f11845b.m12608j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f11845b.mo9225k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f11845b.mo9226l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f11845b.mo9227m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f11845b.mo9228n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f11845b.mo9229o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f11845b.m12609p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f11845b.mo9230q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f11845b.mo9231r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f11845b.mo9232s(z10);
    }
}
