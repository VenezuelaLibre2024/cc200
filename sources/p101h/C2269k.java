package p101h;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.widget.C0243e;
import androidx.appcompat.widget.Toolbar;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import p101h.AbstractC2259a;
import p101h.LayoutInflaterFactory2C2263e;
import p133j0.C3205d;
import p148k0.C3308b0;
import p187n.InterfaceC3635g0;

/* renamed from: h.k */
/* loaded from: classes.dex */
public class C2269k extends AbstractC2259a {

    /* renamed from: a */
    public final InterfaceC3635g0 f9044a;

    /* renamed from: b */
    public final Window.Callback f9045b;

    /* renamed from: c */
    public final LayoutInflaterFactory2C2263e.i f9046c;

    /* renamed from: d */
    public boolean f9047d;

    /* renamed from: e */
    public boolean f9048e;

    /* renamed from: f */
    public boolean f9049f;

    /* renamed from: g */
    public ArrayList<AbstractC2259a.b> f9050g = new ArrayList<>();

    /* renamed from: h */
    public final Runnable f9051h = new a();

    /* renamed from: i */
    public final Toolbar.InterfaceC0236f f9052i;

    /* renamed from: h.k$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2269k.this.m9188C();
        }
    }

    /* renamed from: h.k$b */
    /* loaded from: classes.dex */
    public class b implements Toolbar.InterfaceC0236f {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0236f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C2269k.this.f9045b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: h.k$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC0196i.a {

        /* renamed from: h */
        public boolean f9055h;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: b */
        public void mo813b(C0192e c0192e, boolean z10) {
            if (this.f9055h) {
                return;
            }
            this.f9055h = true;
            C2269k.this.f9044a.mo1096i();
            C2269k.this.f9045b.onPanelClosed(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            this.f9055h = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: c */
        public boolean mo814c(C0192e c0192e) {
            C2269k.this.f9045b.onMenuOpened(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            return true;
        }
    }

    /* renamed from: h.k$d */
    /* loaded from: classes.dex */
    public final class d implements C0192e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: a */
        public boolean mo810a(C0192e c0192e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: b */
        public void mo811b(C0192e c0192e) {
            if (C2269k.this.f9044a.mo1089b()) {
                C2269k.this.f9045b.onPanelClosed(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            } else if (C2269k.this.f9045b.onPreparePanel(0, null, c0192e)) {
                C2269k.this.f9045b.onMenuOpened(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            }
        }
    }

    /* renamed from: h.k$e */
    /* loaded from: classes.dex */
    public class e implements LayoutInflaterFactory2C2263e.i {
        public e() {
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.i
        /* renamed from: a */
        public boolean mo9124a(int i10) {
            if (i10 != 0) {
                return false;
            }
            C2269k c2269k = C2269k.this;
            if (c2269k.f9047d) {
                return false;
            }
            c2269k.f9044a.mo1090c();
            C2269k.this.f9047d = true;
            return false;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.i
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(C2269k.this.f9044a.getContext());
            }
            return null;
        }
    }

    public C2269k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f9052i = bVar;
        C3205d.m11414j(toolbar);
        C0243e c0243e = new C0243e(toolbar, false);
        this.f9044a = c0243e;
        this.f9045b = (Window.Callback) C3205d.m11414j(callback);
        c0243e.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c0243e.setWindowTitle(charSequence);
        this.f9046c = new e();
    }

    /* renamed from: B */
    public final Menu m9187B() {
        if (!this.f9048e) {
            this.f9044a.mo1104q(new c(), new d());
            this.f9048e = true;
        }
        return this.f9044a.mo1100m();
    }

    /* renamed from: C */
    public void m9188C() {
        Menu m9187B = m9187B();
        C0192e c0192e = m9187B instanceof C0192e ? (C0192e) m9187B : null;
        if (c0192e != null) {
            c0192e.m788d0();
        }
        try {
            m9187B.clear();
            if (!this.f9045b.onCreatePanelMenu(0, m9187B) || !this.f9045b.onPreparePanel(0, null, m9187B)) {
                m9187B.clear();
            }
        } finally {
            if (c0192e != null) {
                c0192e.m786c0();
            }
        }
    }

    /* renamed from: D */
    public void m9189D(int i10, int i11) {
        this.f9044a.mo1099l((i10 & i11) | ((~i11) & this.f9044a.mo1108u()));
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: g */
    public boolean mo9004g() {
        return this.f9044a.mo1094g();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: h */
    public boolean mo9005h() {
        if (!this.f9044a.mo1098k()) {
            return false;
        }
        this.f9044a.collapseActionView();
        return true;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: i */
    public void mo9006i(boolean z10) {
        if (z10 == this.f9049f) {
            return;
        }
        this.f9049f = z10;
        int size = this.f9050g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9050g.get(i10).m9024a(z10);
        }
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: j */
    public int mo9007j() {
        return this.f9044a.mo1108u();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: k */
    public Context mo9008k() {
        return this.f9044a.getContext();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: l */
    public void mo9009l() {
        this.f9044a.mo1105r(8);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: m */
    public boolean mo9010m() {
        this.f9044a.mo1106s().removeCallbacks(this.f9051h);
        C3308b0.m12004R(this.f9044a.mo1106s(), this.f9051h);
        return true;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: n */
    public boolean mo9011n() {
        return this.f9044a.getVisibility() == 0;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: o */
    public void mo9012o(Configuration configuration) {
        super.mo9012o(configuration);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: p */
    public void mo9013p() {
        this.f9044a.mo1106s().removeCallbacks(this.f9051h);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: q */
    public boolean mo9014q(int i10, KeyEvent keyEvent) {
        Menu m9187B = m9187B();
        if (m9187B == null) {
            return false;
        }
        m9187B.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m9187B.performShortcut(i10, keyEvent, 0);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: r */
    public boolean mo9015r(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo9016s();
        }
        return true;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: s */
    public boolean mo9016s() {
        return this.f9044a.mo1095h();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: t */
    public void mo9017t(Drawable drawable) {
        this.f9044a.mo1092e(drawable);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: u */
    public void mo9018u(boolean z10) {
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: v */
    public void mo9019v(boolean z10) {
        m9189D(z10 ? 8 : 0, 8);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: w */
    public void mo9020w(boolean z10) {
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: x */
    public void mo9021x(CharSequence charSequence) {
        this.f9044a.setTitle(charSequence);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: y */
    public void mo9022y(CharSequence charSequence) {
        this.f9044a.setWindowTitle(charSequence);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: z */
    public void mo9023z() {
        this.f9044a.mo1105r(0);
    }
}
