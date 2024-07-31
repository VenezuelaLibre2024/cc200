package p148k0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public abstract class AbstractC3307b {

    /* renamed from: a */
    public final Context f11531a;

    /* renamed from: b */
    public a f11532b;

    /* renamed from: c */
    public b f11533c;

    /* renamed from: k0.b$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: k0.b$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC3307b(Context context) {
        this.f11531a = context;
    }

    /* renamed from: a */
    public boolean mo11977a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo11978b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo11979c();

    /* renamed from: d */
    public View mo11980d(MenuItem menuItem) {
        return mo11979c();
    }

    /* renamed from: e */
    public boolean mo11981e() {
        return false;
    }

    /* renamed from: f */
    public void mo11982f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo11983g() {
        return false;
    }

    /* renamed from: h */
    public void m11984h() {
        this.f11533c = null;
        this.f11532b = null;
    }

    /* renamed from: i */
    public void m11985i(a aVar) {
        this.f11532b = aVar;
    }

    /* renamed from: j */
    public void mo11986j(b bVar) {
        if (this.f11533c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f11533c = bVar;
    }
}
