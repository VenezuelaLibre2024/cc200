package p101h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0185b;
import androidx.appcompat.view.menu.C0190c;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.InterfaceC0197j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0240b;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0354k;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.lang.Thread;
import java.util.List;
import p089g.C1931a;
import p089g.C1933c;
import p089g.C1936f;
import p089g.C1937g;
import p089g.C1939i;
import p089g.C1940j;
import p118i.C2572a;
import p133j0.C3203b;
import p148k0.C3308b0;
import p148k0.C3315f;
import p148k0.C3317g;
import p148k0.C3320h0;
import p148k0.C3324j0;
import p148k0.C3328l0;
import p148k0.InterfaceC3339v;
import p162l.AbstractC3391b;
import p162l.C3393d;
import p162l.C3395f;
import p162l.C3396g;
import p162l.WindowCallbackC3398i;
import p187n.C3630e1;
import p187n.C3640j;
import p187n.C3667w0;
import p187n.InterfaceC3632f0;
import p285u.C4777g;
import p329x.C5484b;
import p329x.C5492j;
import p345y.C5782a;
import p360z.C5934h;

/* renamed from: h.e */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C2263e extends AbstractC2262d implements C0192e.a, LayoutInflater.Factory2 {

    /* renamed from: i0 */
    public static final C4777g<String, Integer> f8918i0 = new C4777g<>();

    /* renamed from: j0 */
    public static final boolean f8919j0;

    /* renamed from: k0 */
    public static final int[] f8920k0;

    /* renamed from: l0 */
    public static final boolean f8921l0;

    /* renamed from: m0 */
    public static final boolean f8922m0;

    /* renamed from: n0 */
    public static boolean f8923n0;

    /* renamed from: A */
    public boolean f8924A;

    /* renamed from: B */
    public boolean f8925B;

    /* renamed from: C */
    public ViewGroup f8926C;

    /* renamed from: D */
    public TextView f8927D;

    /* renamed from: E */
    public View f8928E;

    /* renamed from: F */
    public boolean f8929F;

    /* renamed from: G */
    public boolean f8930G;

    /* renamed from: H */
    public boolean f8931H;

    /* renamed from: I */
    public boolean f8932I;

    /* renamed from: J */
    public boolean f8933J;

    /* renamed from: K */
    public boolean f8934K;

    /* renamed from: L */
    public boolean f8935L;

    /* renamed from: M */
    public boolean f8936M;

    /* renamed from: N */
    public v[] f8937N;

    /* renamed from: O */
    public v f8938O;

    /* renamed from: P */
    public boolean f8939P;

    /* renamed from: Q */
    public boolean f8940Q;

    /* renamed from: R */
    public boolean f8941R;

    /* renamed from: S */
    public boolean f8942S;

    /* renamed from: T */
    public Configuration f8943T;

    /* renamed from: U */
    public int f8944U;

    /* renamed from: V */
    public int f8945V;

    /* renamed from: W */
    public boolean f8946W;

    /* renamed from: X */
    public boolean f8947X;

    /* renamed from: Y */
    public r f8948Y;

    /* renamed from: Z */
    public r f8949Z;

    /* renamed from: a0 */
    public boolean f8950a0;

    /* renamed from: b0 */
    public int f8951b0;

    /* renamed from: c0 */
    public final Runnable f8952c0;

    /* renamed from: d0 */
    public boolean f8953d0;

    /* renamed from: e0 */
    public Rect f8954e0;

    /* renamed from: f0 */
    public Rect f8955f0;

    /* renamed from: g0 */
    public C2266h f8956g0;

    /* renamed from: h0 */
    public C2267i f8957h0;

    /* renamed from: k */
    public final Object f8958k;

    /* renamed from: l */
    public final Context f8959l;

    /* renamed from: m */
    public Window f8960m;

    /* renamed from: n */
    public p f8961n;

    /* renamed from: o */
    public final InterfaceC2261c f8962o;

    /* renamed from: p */
    public AbstractC2259a f8963p;

    /* renamed from: q */
    public MenuInflater f8964q;

    /* renamed from: r */
    public CharSequence f8965r;

    /* renamed from: s */
    public InterfaceC3632f0 f8966s;

    /* renamed from: t */
    public j f8967t;

    /* renamed from: u */
    public w f8968u;

    /* renamed from: v */
    public AbstractC3391b f8969v;

    /* renamed from: w */
    public ActionBarContextView f8970w;

    /* renamed from: x */
    public PopupWindow f8971x;

    /* renamed from: y */
    public Runnable f8972y;

    /* renamed from: z */
    public C3320h0 f8973z;

    /* renamed from: h.e$a */
    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f8974a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f8974a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        public final boolean m9122a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m9122a(th)) {
                this.f8974a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f8974a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: h.e$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
            if ((layoutInflaterFactory2C2263e.f8951b0 & 1) != 0) {
                layoutInflaterFactory2C2263e.m9095Y(0);
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e2 = LayoutInflaterFactory2C2263e.this;
            if ((layoutInflaterFactory2C2263e2.f8951b0 & 4096) != 0) {
                layoutInflaterFactory2C2263e2.m9095Y(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e3 = LayoutInflaterFactory2C2263e.this;
            layoutInflaterFactory2C2263e3.f8950a0 = false;
            layoutInflaterFactory2C2263e3.f8951b0 = 0;
        }
    }

    /* renamed from: h.e$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3339v {
        public c() {
        }

        @Override // p148k0.InterfaceC3339v
        /* renamed from: a */
        public C3328l0 mo9123a(View view, C3328l0 c3328l0) {
            int m12288k = c3328l0.m12288k();
            int m9084O0 = LayoutInflaterFactory2C2263e.this.m9084O0(c3328l0, null);
            if (m12288k != m9084O0) {
                c3328l0 = c3328l0.m12292p(c3328l0.m12286i(), m9084O0, c3328l0.m12287j(), c3328l0.m12285h());
            }
            return C3308b0.m12000N(view, c3328l0);
        }
    }

    /* renamed from: h.e$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0240b.a {
        public d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0240b.a
        /* renamed from: a */
        public void mo1050a(Rect rect) {
            rect.top = LayoutInflaterFactory2C2263e.this.m9084O0(null, rect);
        }
    }

    /* renamed from: h.e$e */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.InterfaceC0212a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0212a
        /* renamed from: a */
        public void mo925a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0212a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C2263e.this.m9093W();
        }
    }

    /* renamed from: h.e$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: h.e$f$a */
        /* loaded from: classes.dex */
        public class a extends C3324j0 {
            public a() {
            }

            @Override // p148k0.InterfaceC3322i0
            /* renamed from: b */
            public void mo1115b(View view) {
                LayoutInflaterFactory2C2263e.this.f8970w.setAlpha(1.0f);
                LayoutInflaterFactory2C2263e.this.f8973z.m12255h(null);
                LayoutInflaterFactory2C2263e.this.f8973z = null;
            }

            @Override // p148k0.C3324j0, p148k0.InterfaceC3322i0
            /* renamed from: c */
            public void mo1116c(View view) {
                LayoutInflaterFactory2C2263e.this.f8970w.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
            layoutInflaterFactory2C2263e.f8971x.showAtLocation(layoutInflaterFactory2C2263e.f8970w, 55, 0, 0);
            LayoutInflaterFactory2C2263e.this.m9096Z();
            if (!LayoutInflaterFactory2C2263e.this.m9071H0()) {
                LayoutInflaterFactory2C2263e.this.f8970w.setAlpha(1.0f);
                LayoutInflaterFactory2C2263e.this.f8970w.setVisibility(0);
            } else {
                LayoutInflaterFactory2C2263e.this.f8970w.setAlpha(0.0f);
                LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e2 = LayoutInflaterFactory2C2263e.this;
                layoutInflaterFactory2C2263e2.f8973z = C3308b0.m12017c(layoutInflaterFactory2C2263e2.f8970w).m12250b(1.0f);
                LayoutInflaterFactory2C2263e.this.f8973z.m12255h(new a());
            }
        }
    }

    /* renamed from: h.e$g */
    /* loaded from: classes.dex */
    public class g extends C3324j0 {
        public g() {
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            LayoutInflaterFactory2C2263e.this.f8970w.setAlpha(1.0f);
            LayoutInflaterFactory2C2263e.this.f8973z.m12255h(null);
            LayoutInflaterFactory2C2263e.this.f8973z = null;
        }

        @Override // p148k0.C3324j0, p148k0.InterfaceC3322i0
        /* renamed from: c */
        public void mo1116c(View view) {
            LayoutInflaterFactory2C2263e.this.f8970w.setVisibility(0);
            if (LayoutInflaterFactory2C2263e.this.f8970w.getParent() instanceof View) {
                C3308b0.m12006T((View) LayoutInflaterFactory2C2263e.this.f8970w.getParent());
            }
        }
    }

    /* renamed from: h.e$h */
    /* loaded from: classes.dex */
    public class h implements InterfaceC2260b {
        public h() {
        }
    }

    /* renamed from: h.e$i */
    /* loaded from: classes.dex */
    public interface i {
        /* renamed from: a */
        boolean mo9124a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: h.e$j */
    /* loaded from: classes.dex */
    public final class j implements InterfaceC0196i.a {
        public j() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: b */
        public void mo813b(C0192e c0192e, boolean z10) {
            LayoutInflaterFactory2C2263e.this.m9085P(c0192e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: c */
        public boolean mo814c(C0192e c0192e) {
            Window.Callback m9105j0 = LayoutInflaterFactory2C2263e.this.m9105j0();
            if (m9105j0 == null) {
                return true;
            }
            m9105j0.onMenuOpened(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            return true;
        }
    }

    /* renamed from: h.e$k */
    /* loaded from: classes.dex */
    public class k implements AbstractC3391b.a {

        /* renamed from: a */
        public AbstractC3391b.a f8984a;

        /* renamed from: h.e$k$a */
        /* loaded from: classes.dex */
        public class a extends C3324j0 {
            public a() {
            }

            @Override // p148k0.InterfaceC3322i0
            /* renamed from: b */
            public void mo1115b(View view) {
                LayoutInflaterFactory2C2263e.this.f8970w.setVisibility(8);
                LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
                PopupWindow popupWindow = layoutInflaterFactory2C2263e.f8971x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C2263e.f8970w.getParent() instanceof View) {
                    C3308b0.m12006T((View) LayoutInflaterFactory2C2263e.this.f8970w.getParent());
                }
                LayoutInflaterFactory2C2263e.this.f8970w.m869k();
                LayoutInflaterFactory2C2263e.this.f8973z.m12255h(null);
                LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e2 = LayoutInflaterFactory2C2263e.this;
                layoutInflaterFactory2C2263e2.f8973z = null;
                C3308b0.m12006T(layoutInflaterFactory2C2263e2.f8926C);
            }
        }

        public k(AbstractC3391b.a aVar) {
            this.f8984a = aVar;
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: a */
        public boolean mo9125a(AbstractC3391b abstractC3391b, Menu menu) {
            return this.f8984a.mo9125a(abstractC3391b, menu);
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: b */
        public boolean mo9126b(AbstractC3391b abstractC3391b, Menu menu) {
            C3308b0.m12006T(LayoutInflaterFactory2C2263e.this.f8926C);
            return this.f8984a.mo9126b(abstractC3391b, menu);
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: c */
        public void mo9127c(AbstractC3391b abstractC3391b) {
            this.f8984a.mo9127c(abstractC3391b);
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
            if (layoutInflaterFactory2C2263e.f8971x != null) {
                layoutInflaterFactory2C2263e.f8960m.getDecorView().removeCallbacks(LayoutInflaterFactory2C2263e.this.f8972y);
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e2 = LayoutInflaterFactory2C2263e.this;
            if (layoutInflaterFactory2C2263e2.f8970w != null) {
                layoutInflaterFactory2C2263e2.m9096Z();
                LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e3 = LayoutInflaterFactory2C2263e.this;
                layoutInflaterFactory2C2263e3.f8973z = C3308b0.m12017c(layoutInflaterFactory2C2263e3.f8970w).m12250b(0.0f);
                LayoutInflaterFactory2C2263e.this.f8973z.m12255h(new a());
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e4 = LayoutInflaterFactory2C2263e.this;
            InterfaceC2261c interfaceC2261c = layoutInflaterFactory2C2263e4.f8962o;
            if (interfaceC2261c != null) {
                interfaceC2261c.onSupportActionModeFinished(layoutInflaterFactory2C2263e4.f8969v);
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e5 = LayoutInflaterFactory2C2263e.this;
            layoutInflaterFactory2C2263e5.f8969v = null;
            C3308b0.m12006T(layoutInflaterFactory2C2263e5.f8926C);
        }

        @Override // p162l.AbstractC3391b.a
        /* renamed from: d */
        public boolean mo9128d(AbstractC3391b abstractC3391b, MenuItem menuItem) {
            return this.f8984a.mo9128d(abstractC3391b, menuItem);
        }
    }

    /* renamed from: h.e$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        public static Context m9129a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m9130b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* renamed from: h.e$m */
    /* loaded from: classes.dex */
    public static class m {
        /* renamed from: a */
        public static boolean m9131a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: h.e$n */
    /* loaded from: classes.dex */
    public static class n {
        /* renamed from: a */
        public static void m9132a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* renamed from: h.e$o */
    /* loaded from: classes.dex */
    public static class o {
        /* renamed from: a */
        public static void m9133a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* renamed from: h.e$p */
    /* loaded from: classes.dex */
    public class p extends WindowCallbackC3398i {

        /* renamed from: i */
        public i f8987i;

        /* renamed from: j */
        public boolean f8988j;

        /* renamed from: k */
        public boolean f8989k;

        /* renamed from: l */
        public boolean f8990l;

        public p(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m9134b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f8989k = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f8989k = false;
            }
        }

        /* renamed from: c */
        public void m9135c(Window.Callback callback) {
            try {
                this.f8988j = true;
                callback.onContentChanged();
            } finally {
                this.f8988j = false;
            }
        }

        /* renamed from: d */
        public void m9136d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f8990l = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f8990l = false;
            }
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f8989k ? m12640a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C2263e.this.m9094X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C2263e.this.m9117v0(keyEvent.getKeyCode(), keyEvent);
        }

        /* renamed from: e */
        public void m9137e(i iVar) {
            this.f8987i = iVar;
        }

        /* renamed from: f */
        public final ActionMode m9138f(ActionMode.Callback callback) {
            C3395f.a aVar = new C3395f.a(LayoutInflaterFactory2C2263e.this.f8959l, callback);
            AbstractC3391b mo9044I = LayoutInflaterFactory2C2263e.this.mo9044I(aVar);
            if (mo9044I != null) {
                return aVar.m12617e(mo9044I);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f8988j) {
                m12640a().onContentChanged();
            }
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0192e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            i iVar = this.f8987i;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C2263e.this.m9120y0(i10);
            return true;
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f8990l) {
                m12640a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                LayoutInflaterFactory2C2263e.this.m9121z0(i10);
            }
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0192e c0192e = menu instanceof C0192e ? (C0192e) menu : null;
            if (i10 == 0 && c0192e == null) {
                return false;
            }
            if (c0192e != null) {
                c0192e.m782a0(true);
            }
            i iVar = this.f8987i;
            boolean z10 = iVar != null && iVar.mo9124a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (c0192e != null) {
                c0192e.m782a0(false);
            }
            return z10;
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0192e c0192e;
            v m9103h0 = LayoutInflaterFactory2C2263e.this.m9103h0(0, true);
            if (m9103h0 == null || (c0192e = m9103h0.f9009j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, c0192e, i10);
            }
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C2263e.this.m9112q0() ? m9138f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p162l.WindowCallbackC3398i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (LayoutInflaterFactory2C2263e.this.m9112q0() && i10 == 0) ? m9138f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* renamed from: h.e$q */
    /* loaded from: classes.dex */
    public class q extends r {

        /* renamed from: c */
        public final PowerManager f8992c;

        public q(Context context) {
            super();
            this.f8992c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: b */
        public IntentFilter mo9139b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: c */
        public int mo9140c() {
            return (Build.VERSION.SDK_INT < 21 || !m.m9131a(this.f8992c)) ? 1 : 2;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: d */
        public void mo9141d() {
            LayoutInflaterFactory2C2263e.this.m9073J();
        }
    }

    /* renamed from: h.e$r */
    /* loaded from: classes.dex */
    public abstract class r {

        /* renamed from: a */
        public BroadcastReceiver f8994a;

        /* renamed from: h.e$r$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.mo9141d();
            }
        }

        public r() {
        }

        /* renamed from: a */
        public void m9142a() {
            BroadcastReceiver broadcastReceiver = this.f8994a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C2263e.this.f8959l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f8994a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo9139b();

        /* renamed from: c */
        public abstract int mo9140c();

        /* renamed from: d */
        public abstract void mo9141d();

        /* renamed from: e */
        public void m9143e() {
            m9142a();
            IntentFilter mo9139b = mo9139b();
            if (mo9139b == null || mo9139b.countActions() == 0) {
                return;
            }
            if (this.f8994a == null) {
                this.f8994a = new a();
            }
            LayoutInflaterFactory2C2263e.this.f8959l.registerReceiver(this.f8994a, mo9139b);
        }
    }

    /* renamed from: h.e$s */
    /* loaded from: classes.dex */
    public class s extends r {

        /* renamed from: c */
        public final C2271m f8997c;

        public s(C2271m c2271m) {
            super();
            this.f8997c = c2271m;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: b */
        public IntentFilter mo9139b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: c */
        public int mo9140c() {
            return this.f8997c.m9195d() ? 2 : 1;
        }

        @Override // p101h.LayoutInflaterFactory2C2263e.r
        /* renamed from: d */
        public void mo9141d() {
            LayoutInflaterFactory2C2263e.this.m9073J();
        }
    }

    /* renamed from: h.e$t */
    /* loaded from: classes.dex */
    public static class t {
        /* renamed from: a */
        public static void m9144a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: h.e$u */
    /* loaded from: classes.dex */
    public class u extends ContentFrameLayout {
        public u(Context context) {
            super(context);
        }

        /* renamed from: c */
        public final boolean m9145c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C2263e.this.m9094X(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m9145c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C2263e.this.m9088R(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C2572a.m10278b(getContext(), i10));
        }
    }

    /* renamed from: h.e$v */
    /* loaded from: classes.dex */
    public static final class v {

        /* renamed from: a */
        public int f9000a;

        /* renamed from: b */
        public int f9001b;

        /* renamed from: c */
        public int f9002c;

        /* renamed from: d */
        public int f9003d;

        /* renamed from: e */
        public int f9004e;

        /* renamed from: f */
        public int f9005f;

        /* renamed from: g */
        public ViewGroup f9006g;

        /* renamed from: h */
        public View f9007h;

        /* renamed from: i */
        public View f9008i;

        /* renamed from: j */
        public C0192e f9009j;

        /* renamed from: k */
        public C0190c f9010k;

        /* renamed from: l */
        public Context f9011l;

        /* renamed from: m */
        public boolean f9012m;

        /* renamed from: n */
        public boolean f9013n;

        /* renamed from: o */
        public boolean f9014o;

        /* renamed from: p */
        public boolean f9015p;

        /* renamed from: q */
        public boolean f9016q = false;

        /* renamed from: r */
        public boolean f9017r;

        /* renamed from: s */
        public Bundle f9018s;

        public v(int i10) {
            this.f9000a = i10;
        }

        /* renamed from: a */
        public InterfaceC0197j m9146a(InterfaceC0196i.a aVar) {
            if (this.f9009j == null) {
                return null;
            }
            if (this.f9010k == null) {
                C0190c c0190c = new C0190c(this.f9011l, C1937g.f7475j);
                this.f9010k = c0190c;
                c0190c.mo713g(aVar);
                this.f9009j.m783b(this.f9010k);
            }
            return this.f9010k.m747j(this.f9006g);
        }

        /* renamed from: b */
        public boolean m9147b() {
            if (this.f9007h == null) {
                return false;
            }
            return this.f9008i != null || this.f9010k.m746a().getCount() > 0;
        }

        /* renamed from: c */
        public void m9148c(C0192e c0192e) {
            C0190c c0190c;
            C0192e c0192e2 = this.f9009j;
            if (c0192e == c0192e2) {
                return;
            }
            if (c0192e2 != null) {
                c0192e2.m769O(this.f9010k);
            }
            this.f9009j = c0192e;
            if (c0192e == null || (c0190c = this.f9010k) == null) {
                return;
            }
            c0192e.m783b(c0190c);
        }

        /* renamed from: d */
        public void m9149d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C1931a.f7329a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C1931a.f7320E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = C1939i.f7499b;
            }
            newTheme.applyStyle(i11, true);
            C3393d c3393d = new C3393d(context, 0);
            c3393d.getTheme().setTo(newTheme);
            this.f9011l = c3393d;
            TypedArray obtainStyledAttributes = c3393d.obtainStyledAttributes(C1940j.f7734y0);
            this.f9001b = obtainStyledAttributes.getResourceId(C1940j.f7509B0, 0);
            this.f9005f = obtainStyledAttributes.getResourceId(C1940j.f7504A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h.e$w */
    /* loaded from: classes.dex */
    public final class w implements InterfaceC0196i.a {
        public w() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: b */
        public void mo813b(C0192e c0192e, boolean z10) {
            C0192e mo758D = c0192e.mo758D();
            boolean z11 = mo758D != c0192e;
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
            if (z11) {
                c0192e = mo758D;
            }
            v m9099c0 = layoutInflaterFactory2C2263e.m9099c0(c0192e);
            if (m9099c0 != null) {
                if (!z11) {
                    LayoutInflaterFactory2C2263e.this.m9089S(m9099c0, z10);
                } else {
                    LayoutInflaterFactory2C2263e.this.m9083O(m9099c0.f9000a, m9099c0, mo758D);
                    LayoutInflaterFactory2C2263e.this.m9089S(m9099c0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: c */
        public boolean mo814c(C0192e c0192e) {
            Window.Callback m9105j0;
            if (c0192e != c0192e.mo758D()) {
                return true;
            }
            LayoutInflaterFactory2C2263e layoutInflaterFactory2C2263e = LayoutInflaterFactory2C2263e.this;
            if (!layoutInflaterFactory2C2263e.f8931H || (m9105j0 = layoutInflaterFactory2C2263e.m9105j0()) == null || LayoutInflaterFactory2C2263e.this.f8942S) {
                return true;
            }
            m9105j0.onMenuOpened(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 < 21;
        f8919j0 = z10;
        f8920k0 = new int[]{R.attr.windowBackground};
        f8921l0 = !"robolectric".equals(Build.FINGERPRINT);
        f8922m0 = i10 >= 17;
        if (!z10 || f8923n0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f8923n0 = true;
    }

    public LayoutInflaterFactory2C2263e(Activity activity, InterfaceC2261c interfaceC2261c) {
        this(activity, null, interfaceC2261c, activity);
    }

    public LayoutInflaterFactory2C2263e(Dialog dialog, InterfaceC2261c interfaceC2261c) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC2261c, dialog);
    }

    public LayoutInflaterFactory2C2263e(Context context, Window window, InterfaceC2261c interfaceC2261c, Object obj) {
        C4777g<String, Integer> c4777g;
        Integer num;
        ActivityC0185b m9078L0;
        this.f8973z = null;
        this.f8924A = true;
        this.f8944U = -100;
        this.f8952c0 = new b();
        this.f8959l = context;
        this.f8962o = interfaceC2261c;
        this.f8958k = obj;
        if (this.f8944U == -100 && (obj instanceof Dialog) && (m9078L0 = m9078L0()) != null) {
            this.f8944U = m9078L0.getDelegate().mo9050l();
        }
        if (this.f8944U == -100 && (num = (c4777g = f8918i0).get(obj.getClass().getName())) != null) {
            this.f8944U = num.intValue();
            c4777g.remove(obj.getClass().getName());
        }
        if (window != null) {
            m9079M(window);
        }
        C3640j.m13543h();
    }

    /* renamed from: d0 */
    public static Configuration m9063d0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                n.m9132a(configuration, configuration2, configuration3);
            } else if (!C3203b.m11399a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                o.m9133a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                l.m9130b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: A */
    public boolean mo9037A(int i10) {
        int m9070G0 = m9070G0(i10);
        if (this.f8935L && m9070G0 == 108) {
            return false;
        }
        if (this.f8931H && m9070G0 == 1) {
            this.f8931H = false;
        }
        if (m9070G0 == 1) {
            m9076K0();
            this.f8935L = true;
            return true;
        }
        if (m9070G0 == 2) {
            m9076K0();
            this.f8929F = true;
            return true;
        }
        if (m9070G0 == 5) {
            m9076K0();
            this.f8930G = true;
            return true;
        }
        if (m9070G0 == 10) {
            m9076K0();
            this.f8933J = true;
            return true;
        }
        if (m9070G0 == 108) {
            m9076K0();
            this.f8931H = true;
            return true;
        }
        if (m9070G0 != 109) {
            return this.f8960m.requestFeature(m9070G0);
        }
        m9076K0();
        this.f8932I = true;
        return true;
    }

    /* renamed from: A0 */
    public void m9064A0(ViewGroup viewGroup) {
    }

    /* renamed from: B0 */
    public final void m9065B0(v vVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (vVar.f9014o || this.f8942S) {
            return;
        }
        if (vVar.f9000a == 0) {
            if ((this.f8959l.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m9105j0 = m9105j0();
        if (m9105j0 != null && !m9105j0.onMenuOpened(vVar.f9000a, vVar.f9009j)) {
            m9089S(vVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8959l.getSystemService("window");
        if (windowManager != null && m9068E0(vVar, keyEvent)) {
            ViewGroup viewGroup = vVar.f9006g;
            if (viewGroup == null || vVar.f9016q) {
                if (viewGroup == null) {
                    if (!m9108m0(vVar) || vVar.f9006g == null) {
                        return;
                    }
                } else if (vVar.f9016q && viewGroup.getChildCount() > 0) {
                    vVar.f9006g.removeAllViews();
                }
                if (!m9107l0(vVar) || !vVar.m9147b()) {
                    vVar.f9016q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = vVar.f9007h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                vVar.f9006g.setBackgroundResource(vVar.f9001b);
                ViewParent parent = vVar.f9007h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(vVar.f9007h);
                }
                vVar.f9006g.addView(vVar.f9007h, layoutParams2);
                if (!vVar.f9007h.hasFocus()) {
                    vVar.f9007h.requestFocus();
                }
            } else {
                View view = vVar.f9008i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    vVar.f9013n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, vVar.f9003d, vVar.f9004e, 1002, 8519680, -3);
                    layoutParams3.gravity = vVar.f9002c;
                    layoutParams3.windowAnimations = vVar.f9005f;
                    windowManager.addView(vVar.f9006g, layoutParams3);
                    vVar.f9014o = true;
                }
            }
            i10 = -2;
            vVar.f9013n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, vVar.f9003d, vVar.f9004e, 1002, 8519680, -3);
            layoutParams32.gravity = vVar.f9002c;
            layoutParams32.windowAnimations = vVar.f9005f;
            windowManager.addView(vVar.f9006g, layoutParams32);
            vVar.f9014o = true;
        }
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: C */
    public void mo9038C(int i10) {
        m9097a0();
        ViewGroup viewGroup = (ViewGroup) this.f8926C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8959l).inflate(i10, viewGroup);
        this.f8961n.m9135c(this.f8960m.getCallback());
    }

    /* renamed from: C0 */
    public final AbstractC2259a m9066C0() {
        return this.f8963p;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: D */
    public void mo9039D(View view) {
        m9097a0();
        ViewGroup viewGroup = (ViewGroup) this.f8926C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8961n.m9135c(this.f8960m.getCallback());
    }

    /* renamed from: D0 */
    public final boolean m9067D0(v vVar, int i10, KeyEvent keyEvent, int i11) {
        C0192e c0192e;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f9012m || m9068E0(vVar, keyEvent)) && (c0192e = vVar.f9009j) != null) {
            z10 = c0192e.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f8966s == null) {
            m9089S(vVar, true);
        }
        return z10;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: E */
    public void mo9040E(View view, ViewGroup.LayoutParams layoutParams) {
        m9097a0();
        ViewGroup viewGroup = (ViewGroup) this.f8926C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8961n.m9135c(this.f8960m.getCallback());
    }

    /* renamed from: E0 */
    public final boolean m9068E0(v vVar, KeyEvent keyEvent) {
        InterfaceC3632f0 interfaceC3632f0;
        InterfaceC3632f0 interfaceC3632f02;
        InterfaceC3632f0 interfaceC3632f03;
        if (this.f8942S) {
            return false;
        }
        if (vVar.f9012m) {
            return true;
        }
        v vVar2 = this.f8938O;
        if (vVar2 != null && vVar2 != vVar) {
            m9089S(vVar2, false);
        }
        Window.Callback m9105j0 = m9105j0();
        if (m9105j0 != null) {
            vVar.f9008i = m9105j0.onCreatePanelView(vVar.f9000a);
        }
        int i10 = vVar.f9000a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC3632f03 = this.f8966s) != null) {
            interfaceC3632f03.mo873c();
        }
        if (vVar.f9008i == null && (!z10 || !(m9066C0() instanceof C2269k))) {
            C0192e c0192e = vVar.f9009j;
            if (c0192e == null || vVar.f9017r) {
                if (c0192e == null && (!m9109n0(vVar) || vVar.f9009j == null)) {
                    return false;
                }
                if (z10 && this.f8966s != null) {
                    if (this.f8967t == null) {
                        this.f8967t = new j();
                    }
                    this.f8966s.mo871a(vVar.f9009j, this.f8967t);
                }
                vVar.f9009j.m788d0();
                if (!m9105j0.onCreatePanelMenu(vVar.f9000a, vVar.f9009j)) {
                    vVar.m9148c(null);
                    if (z10 && (interfaceC3632f0 = this.f8966s) != null) {
                        interfaceC3632f0.mo871a(null, this.f8967t);
                    }
                    return false;
                }
                vVar.f9017r = false;
            }
            vVar.f9009j.m788d0();
            Bundle bundle = vVar.f9018s;
            if (bundle != null) {
                vVar.f9009j.m770P(bundle);
                vVar.f9018s = null;
            }
            if (!m9105j0.onPreparePanel(0, vVar.f9008i, vVar.f9009j)) {
                if (z10 && (interfaceC3632f02 = this.f8966s) != null) {
                    interfaceC3632f02.mo871a(null, this.f8967t);
                }
                vVar.f9009j.m786c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f9015p = z11;
            vVar.f9009j.setQwertyMode(z11);
            vVar.f9009j.m786c0();
        }
        vVar.f9012m = true;
        vVar.f9013n = false;
        this.f8938O = vVar;
        return true;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: F */
    public void mo9041F(Toolbar toolbar) {
        if (this.f8958k instanceof Activity) {
            AbstractC2259a mo9052n = mo9052n();
            if (mo9052n instanceof C2272n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f8964q = null;
            if (mo9052n != null) {
                mo9052n.mo9013p();
            }
            this.f8963p = null;
            if (toolbar != null) {
                C2269k c2269k = new C2269k(toolbar, m9104i0(), this.f8961n);
                this.f8963p = c2269k;
                this.f8961n.m9137e(c2269k.f9046c);
            } else {
                this.f8961n.m9137e(null);
            }
            mo9054p();
        }
    }

    /* renamed from: F0 */
    public final void m9069F0(boolean z10) {
        InterfaceC3632f0 interfaceC3632f0 = this.f8966s;
        if (interfaceC3632f0 == null || !interfaceC3632f0.mo874d() || (ViewConfiguration.get(this.f8959l).hasPermanentMenuKey() && !this.f8966s.mo876f())) {
            v m9103h0 = m9103h0(0, true);
            m9103h0.f9016q = true;
            m9089S(m9103h0, false);
            m9065B0(m9103h0, null);
            return;
        }
        Window.Callback m9105j0 = m9105j0();
        if (this.f8966s.mo872b() && z10) {
            this.f8966s.mo877g();
            if (this.f8942S) {
                return;
            }
            m9105j0.onPanelClosed(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, m9103h0(0, true).f9009j);
            return;
        }
        if (m9105j0 == null || this.f8942S) {
            return;
        }
        if (this.f8950a0 && (this.f8951b0 & 1) != 0) {
            this.f8960m.getDecorView().removeCallbacks(this.f8952c0);
            this.f8952c0.run();
        }
        v m9103h02 = m9103h0(0, true);
        C0192e c0192e = m9103h02.f9009j;
        if (c0192e == null || m9103h02.f9017r || !m9105j0.onPreparePanel(0, m9103h02.f9008i, c0192e)) {
            return;
        }
        m9105j0.onMenuOpened(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, m9103h02.f9009j);
        this.f8966s.mo878h();
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: G */
    public void mo9042G(int i10) {
        this.f8945V = i10;
    }

    /* renamed from: G0 */
    public final int m9070G0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: H */
    public final void mo9043H(CharSequence charSequence) {
        this.f8965r = charSequence;
        InterfaceC3632f0 interfaceC3632f0 = this.f8966s;
        if (interfaceC3632f0 != null) {
            interfaceC3632f0.setWindowTitle(charSequence);
            return;
        }
        if (m9066C0() != null) {
            m9066C0().mo9022y(charSequence);
            return;
        }
        TextView textView = this.f8927D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: H0 */
    public final boolean m9071H0() {
        ViewGroup viewGroup;
        return this.f8925B && (viewGroup = this.f8926C) != null && C3308b0.m11993G(viewGroup);
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: I */
    public AbstractC3391b mo9044I(AbstractC3391b.a aVar) {
        InterfaceC2261c interfaceC2261c;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC3391b abstractC3391b = this.f8969v;
        if (abstractC3391b != null) {
            abstractC3391b.mo9219c();
        }
        k kVar = new k(aVar);
        AbstractC2259a mo9052n = mo9052n();
        if (mo9052n != null) {
            AbstractC3391b mo9003A = mo9052n.mo9003A(kVar);
            this.f8969v = mo9003A;
            if (mo9003A != null && (interfaceC2261c = this.f8962o) != null) {
                interfaceC2261c.onSupportActionModeStarted(mo9003A);
            }
        }
        if (this.f8969v == null) {
            this.f8969v = m9074J0(kVar);
        }
        return this.f8969v;
    }

    /* renamed from: I0 */
    public final boolean m9072I0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f8960m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C3308b0.m11992F((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: J */
    public boolean m9073J() {
        return m9075K(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p162l.AbstractC3391b m9074J0(p162l.AbstractC3391b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h.LayoutInflaterFactory2C2263e.m9074J0(l.b$a):l.b");
    }

    /* renamed from: K */
    public final boolean m9075K(boolean z10) {
        if (this.f8942S) {
            return false;
        }
        int m9081N = m9081N();
        boolean m9080M0 = m9080M0(m9113r0(this.f8959l, m9081N), z10);
        if (m9081N == 0) {
            m9102g0(this.f8959l).m9143e();
        } else {
            r rVar = this.f8948Y;
            if (rVar != null) {
                rVar.m9142a();
            }
        }
        if (m9081N == 3) {
            m9101f0(this.f8959l).m9143e();
        } else {
            r rVar2 = this.f8949Z;
            if (rVar2 != null) {
                rVar2.m9142a();
            }
        }
        return m9080M0;
    }

    /* renamed from: K0 */
    public final void m9076K0() {
        if (this.f8925B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: L */
    public final void m9077L() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f8926C.findViewById(R.id.content);
        View decorView = this.f8960m.getDecorView();
        contentFrameLayout.m924b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f8959l.obtainStyledAttributes(C1940j.f7734y0);
        obtainStyledAttributes.getValue(C1940j.f7550K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1940j.f7554L0, contentFrameLayout.getMinWidthMinor());
        int i10 = C1940j.f7542I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = C1940j.f7546J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = C1940j.f7534G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = C1940j.f7538H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: L0 */
    public final ActivityC0185b m9078L0() {
        for (Context context = this.f8959l; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0185b) {
                return (ActivityC0185b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final void m9079M(Window window) {
        if (this.f8960m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p pVar = new p(callback);
        this.f8961n = pVar;
        window.setCallback(pVar);
        C3667w0 m13716t = C3667w0.m13716t(this.f8959l, null, f8920k0);
        Drawable m13724g = m13716t.m13724g(0);
        if (m13724g != null) {
            window.setBackgroundDrawable(m13724g);
        }
        m13716t.m13736v();
        this.f8960m = window;
    }

    /* renamed from: M0 */
    public final boolean m9080M0(int i10, boolean z10) {
        boolean z11 = false;
        Configuration m9090T = m9090T(this.f8959l, i10, null, false);
        boolean m9111p0 = m9111p0(this.f8959l);
        Configuration configuration = this.f8943T;
        if (configuration == null) {
            configuration = this.f8959l.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = m9090T.uiMode & 48;
        boolean z12 = true;
        if (i11 != i12 && z10 && !m9111p0 && this.f8940Q && (f8921l0 || this.f8941R)) {
            Object obj = this.f8958k;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C5484b.m21744f((Activity) this.f8958k);
                z11 = true;
            }
        }
        if (z11 || i11 == i12) {
            z12 = z11;
        } else {
            m9082N0(i12, m9111p0, null);
        }
        if (z12) {
            Object obj2 = this.f8958k;
            if (obj2 instanceof ActivityC0185b) {
                ((ActivityC0185b) obj2).onNightModeChanged(i10);
            }
        }
        return z12;
    }

    /* renamed from: N */
    public final int m9081N() {
        int i10 = this.f8944U;
        return i10 != -100 ? i10 : AbstractC2262d.m9034j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N0 */
    public final void m9082N0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f8959l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            C2268j.m9181a(resources);
        }
        int i12 = this.f8945V;
        if (i12 != 0) {
            this.f8959l.setTheme(i12);
            if (i11 >= 23) {
                this.f8959l.getTheme().applyStyle(this.f8945V, true);
            }
        }
        if (z10) {
            Object obj = this.f8958k;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0354k) {
                    if (!((InterfaceC0354k) activity).getLifecycle().mo1801b().m1811c(AbstractC0344f.b.CREATED)) {
                        return;
                    }
                } else if (!this.f8941R || this.f8942S) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: O */
    public void m9083O(int i10, v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i10 >= 0) {
                v[] vVarArr = this.f8937N;
                if (i10 < vVarArr.length) {
                    vVar = vVarArr[i10];
                }
            }
            if (vVar != null) {
                menu = vVar.f9009j;
            }
        }
        if ((vVar == null || vVar.f9014o) && !this.f8942S) {
            this.f8961n.m9136d(this.f8960m.getCallback(), i10, menu);
        }
    }

    /* renamed from: O0 */
    public final int m9084O0(C3328l0 c3328l0, Rect rect) {
        boolean z10;
        boolean z11;
        int m12288k = c3328l0 != null ? c3328l0.m12288k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f8970w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8970w.getLayoutParams();
            if (this.f8970w.isShown()) {
                if (this.f8954e0 == null) {
                    this.f8954e0 = new Rect();
                    this.f8955f0 = new Rect();
                }
                Rect rect2 = this.f8954e0;
                Rect rect3 = this.f8955f0;
                if (c3328l0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c3328l0.m12286i(), c3328l0.m12288k(), c3328l0.m12287j(), c3328l0.m12285h());
                }
                C3630e1.m13500a(this.f8926C, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                C3328l0 m12051y = C3308b0.m12051y(this.f8926C);
                int m12286i = m12051y == null ? 0 : m12051y.m12286i();
                int m12287j = m12051y == null ? 0 : m12051y.m12287j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f8928E != null) {
                    View view = this.f8928E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != m12286i || marginLayoutParams2.rightMargin != m12287j) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = m12286i;
                            marginLayoutParams2.rightMargin = m12287j;
                            this.f8928E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f8959l);
                    this.f8928E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m12286i;
                    layoutParams.rightMargin = m12287j;
                    this.f8926C.addView(this.f8928E, -1, layoutParams);
                }
                View view3 = this.f8928E;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m9086P0(this.f8928E);
                }
                if (!this.f8933J && r5) {
                    m12288k = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f8970w.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f8928E;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return m12288k;
    }

    /* renamed from: P */
    public void m9085P(C0192e c0192e) {
        if (this.f8936M) {
            return;
        }
        this.f8936M = true;
        this.f8966s.mo880j();
        Window.Callback m9105j0 = m9105j0();
        if (m9105j0 != null && !this.f8942S) {
            m9105j0.onPanelClosed(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, c0192e);
        }
        this.f8936M = false;
    }

    /* renamed from: P0 */
    public final void m9086P0(View view) {
        Context context;
        int i10;
        if ((C3308b0.m11988B(view) & 8192) != 0) {
            context = this.f8959l;
            i10 = C1933c.f7357b;
        } else {
            context = this.f8959l;
            i10 = C1933c.f7356a;
        }
        view.setBackgroundColor(C5782a.getColor(context, i10));
    }

    /* renamed from: Q */
    public final void m9087Q() {
        r rVar = this.f8948Y;
        if (rVar != null) {
            rVar.m9142a();
        }
        r rVar2 = this.f8949Z;
        if (rVar2 != null) {
            rVar2.m9142a();
        }
    }

    /* renamed from: R */
    public void m9088R(int i10) {
        m9089S(m9103h0(i10, true), true);
    }

    /* renamed from: S */
    public void m9089S(v vVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC3632f0 interfaceC3632f0;
        if (z10 && vVar.f9000a == 0 && (interfaceC3632f0 = this.f8966s) != null && interfaceC3632f0.mo872b()) {
            m9085P(vVar.f9009j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8959l.getSystemService("window");
        if (windowManager != null && vVar.f9014o && (viewGroup = vVar.f9006g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m9083O(vVar.f9000a, vVar, null);
            }
        }
        vVar.f9012m = false;
        vVar.f9013n = false;
        vVar.f9014o = false;
        vVar.f9007h = null;
        vVar.f9016q = true;
        if (this.f8938O == vVar) {
            this.f8938O = null;
        }
    }

    /* renamed from: T */
    public final Configuration m9090T(Context context, int i10, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: U */
    public final ViewGroup m9091U() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f8959l.obtainStyledAttributes(C1940j.f7734y0);
        int i10 = C1940j.f7519D0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C1940j.f7558M0, false)) {
            mo9037A(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            mo9037A(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (obtainStyledAttributes.getBoolean(C1940j.f7524E0, false)) {
            mo9037A(C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (obtainStyledAttributes.getBoolean(C1940j.f7529F0, false)) {
            mo9037A(10);
        }
        this.f8934K = obtainStyledAttributes.getBoolean(C1940j.f7739z0, false);
        obtainStyledAttributes.recycle();
        m9098b0();
        this.f8960m.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f8959l);
        if (this.f8935L) {
            viewGroup = (ViewGroup) from.inflate(this.f8933J ? C1937g.f7480o : C1937g.f7479n, (ViewGroup) null);
        } else if (this.f8934K) {
            viewGroup = (ViewGroup) from.inflate(C1937g.f7471f, (ViewGroup) null);
            this.f8932I = false;
            this.f8931H = false;
        } else if (this.f8931H) {
            TypedValue typedValue = new TypedValue();
            this.f8959l.getTheme().resolveAttribute(C1931a.f7334f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3393d(this.f8959l, typedValue.resourceId) : this.f8959l).inflate(C1937g.f7481p, (ViewGroup) null);
            InterfaceC3632f0 interfaceC3632f0 = (InterfaceC3632f0) viewGroup.findViewById(C1936f.f7455p);
            this.f8966s = interfaceC3632f0;
            interfaceC3632f0.setWindowCallback(m9105j0());
            if (this.f8932I) {
                this.f8966s.mo879i(C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.f8929F) {
                this.f8966s.mo879i(2);
            }
            if (this.f8930G) {
                this.f8966s.mo879i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8931H + ", windowActionBarOverlay: " + this.f8932I + ", android:windowIsFloating: " + this.f8934K + ", windowActionModeOverlay: " + this.f8933J + ", windowNoTitle: " + this.f8935L + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            C3308b0.m12026g0(viewGroup, new c());
        } else if (viewGroup instanceof InterfaceC0240b) {
            ((InterfaceC0240b) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.f8966s == null) {
            this.f8927D = (TextView) viewGroup.findViewById(C1936f.f7436M);
        }
        C3630e1.m13502c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1936f.f7441b);
        ViewGroup viewGroup2 = (ViewGroup) this.f8960m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f8960m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m9092V(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            h.h r0 = r11.f8956g0
            r1 = 0
            if (r0 != 0) goto L5a
            android.content.Context r0 = r11.f8959l
            int[] r2 = p089g.C1940j.f7734y0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p089g.C1940j.f7514C0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            h.h r0 = new h.h
            r0.<init>()
        L1a:
            r11.f8956g0 = r0
            goto L5a
        L1d:
            android.content.Context r2 = r11.f8959l     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L38
            h.h r2 = (p101h.C2266h) r2     // Catch: java.lang.Throwable -> L38
            r11.f8956g0 = r2     // Catch: java.lang.Throwable -> L38
            goto L5a
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            h.h r0 = new h.h
            r0.<init>()
            goto L1a
        L5a:
            boolean r8 = p101h.LayoutInflaterFactory2C2263e.f8919j0
            r0 = 1
            if (r8 == 0) goto L8a
            h.i r2 = r11.f8957h0
            if (r2 != 0) goto L6a
            h.i r2 = new h.i
            r2.<init>()
            r11.f8957h0 = r2
        L6a:
            h.i r2 = r11.f8957h0
            boolean r2 = r2.m9180a(r15)
            if (r2 == 0) goto L74
            r7 = r0
            goto L8b
        L74:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L82
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L8a
            goto L89
        L82:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.m9072I0(r0)
        L89:
            r1 = r0
        L8a:
            r7 = r1
        L8b:
            h.h r2 = r11.f8956g0
            r9 = 1
            boolean r10 = p187n.C3627d1.m13499d()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.m9172r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h.LayoutInflaterFactory2C2263e.m9092V(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: W */
    public void m9093W() {
        C0192e c0192e;
        InterfaceC3632f0 interfaceC3632f0 = this.f8966s;
        if (interfaceC3632f0 != null) {
            interfaceC3632f0.mo880j();
        }
        if (this.f8971x != null) {
            this.f8960m.getDecorView().removeCallbacks(this.f8972y);
            if (this.f8971x.isShowing()) {
                try {
                    this.f8971x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f8971x = null;
        }
        m9096Z();
        v m9103h0 = m9103h0(0, false);
        if (m9103h0 == null || (c0192e = m9103h0.f9009j) == null) {
            return;
        }
        c0192e.close();
    }

    /* renamed from: X */
    public boolean m9094X(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f8958k;
        if (((obj instanceof C3315f.a) || (obj instanceof DialogC2265g)) && (decorView = this.f8960m.getDecorView()) != null && C3315f.m12219d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f8961n.m9134b(this.f8960m.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m9115t0(keyCode, keyEvent) : m9118w0(keyCode, keyEvent);
    }

    /* renamed from: Y */
    public void m9095Y(int i10) {
        v m9103h0;
        v m9103h02 = m9103h0(i10, true);
        if (m9103h02.f9009j != null) {
            Bundle bundle = new Bundle();
            m9103h02.f9009j.m771Q(bundle);
            if (bundle.size() > 0) {
                m9103h02.f9018s = bundle;
            }
            m9103h02.f9009j.m788d0();
            m9103h02.f9009j.clear();
        }
        m9103h02.f9017r = true;
        m9103h02.f9016q = true;
        if ((i10 != 108 && i10 != 0) || this.f8966s == null || (m9103h0 = m9103h0(0, false)) == null) {
            return;
        }
        m9103h0.f9012m = false;
        m9068E0(m9103h0, null);
    }

    /* renamed from: Z */
    public void m9096Z() {
        C3320h0 c3320h0 = this.f8973z;
        if (c3320h0 != null) {
            c3320h0.m12251c();
        }
    }

    @Override // androidx.appcompat.view.menu.C0192e.a
    /* renamed from: a */
    public boolean mo810a(C0192e c0192e, MenuItem menuItem) {
        v m9099c0;
        Window.Callback m9105j0 = m9105j0();
        if (m9105j0 == null || this.f8942S || (m9099c0 = m9099c0(c0192e.mo758D())) == null) {
            return false;
        }
        return m9105j0.onMenuItemSelected(m9099c0.f9000a, menuItem);
    }

    /* renamed from: a0 */
    public final void m9097a0() {
        if (this.f8925B) {
            return;
        }
        this.f8926C = m9091U();
        CharSequence m9104i0 = m9104i0();
        if (!TextUtils.isEmpty(m9104i0)) {
            InterfaceC3632f0 interfaceC3632f0 = this.f8966s;
            if (interfaceC3632f0 != null) {
                interfaceC3632f0.setWindowTitle(m9104i0);
            } else if (m9066C0() != null) {
                m9066C0().mo9022y(m9104i0);
            } else {
                TextView textView = this.f8927D;
                if (textView != null) {
                    textView.setText(m9104i0);
                }
            }
        }
        m9077L();
        m9064A0(this.f8926C);
        this.f8925B = true;
        v m9103h0 = m9103h0(0, false);
        if (this.f8942S) {
            return;
        }
        if (m9103h0 == null || m9103h0.f9009j == null) {
            m9110o0(C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
    }

    @Override // androidx.appcompat.view.menu.C0192e.a
    /* renamed from: b */
    public void mo811b(C0192e c0192e) {
        m9069F0(true);
    }

    /* renamed from: b0 */
    public final void m9098b0() {
        if (this.f8960m == null) {
            Object obj = this.f8958k;
            if (obj instanceof Activity) {
                m9079M(((Activity) obj).getWindow());
            }
        }
        if (this.f8960m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: c0 */
    public v m9099c0(Menu menu) {
        v[] vVarArr = this.f8937N;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            v vVar = vVarArr[i10];
            if (vVar != null && vVar.f9009j == menu) {
                return vVar;
            }
        }
        return null;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: d */
    public void mo9045d(View view, ViewGroup.LayoutParams layoutParams) {
        m9097a0();
        ((ViewGroup) this.f8926C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f8961n.m9135c(this.f8960m.getCallback());
    }

    /* renamed from: e0 */
    public final Context m9100e0() {
        AbstractC2259a mo9052n = mo9052n();
        Context mo9008k = mo9052n != null ? mo9052n.mo9008k() : null;
        return mo9008k == null ? this.f8959l : mo9008k;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: f */
    public Context mo9047f(Context context) {
        this.f8940Q = true;
        int m9113r0 = m9113r0(context, m9081N());
        Configuration configuration = null;
        boolean z10 = false;
        if (f8922m0 && (context instanceof ContextThemeWrapper)) {
            try {
                t.m9144a((ContextThemeWrapper) context, m9090T(context, m9113r0, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C3393d) {
            try {
                ((C3393d) context).m12611a(m9090T(context, m9113r0, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f8921l0) {
            return super.mo9047f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = l.m9129a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m9063d0(configuration3, configuration4);
            }
        }
        Configuration m9090T = m9090T(context, m9113r0, configuration, true);
        C3393d c3393d = new C3393d(context, C1939i.f7501d);
        c3393d.m12611a(m9090T);
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            C5934h.g.m23768a(c3393d.getTheme());
        }
        return super.mo9047f(c3393d);
    }

    /* renamed from: f0 */
    public final r m9101f0(Context context) {
        if (this.f8949Z == null) {
            this.f8949Z = new q(context);
        }
        return this.f8949Z;
    }

    /* renamed from: g0 */
    public final r m9102g0(Context context) {
        if (this.f8948Y == null) {
            this.f8948Y = new s(C2271m.m9192a(context));
        }
        return this.f8948Y;
    }

    /* renamed from: h0 */
    public v m9103h0(int i10, boolean z10) {
        v[] vVarArr = this.f8937N;
        if (vVarArr == null || vVarArr.length <= i10) {
            v[] vVarArr2 = new v[i10 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.f8937N = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i10];
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(i10);
        vVarArr[i10] = vVar2;
        return vVar2;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: i */
    public <T extends View> T mo9048i(int i10) {
        m9097a0();
        return (T) this.f8960m.findViewById(i10);
    }

    /* renamed from: i0 */
    public final CharSequence m9104i0() {
        Object obj = this.f8958k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f8965r;
    }

    /* renamed from: j0 */
    public final Window.Callback m9105j0() {
        return this.f8960m.getCallback();
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: k */
    public final InterfaceC2260b mo9049k() {
        return new h();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9106k0() {
        /*
            r3 = this;
            r3.m9097a0()
            boolean r0 = r3.f8931H
            if (r0 == 0) goto L37
            h.a r0 = r3.f8963p
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f8958k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            h.n r0 = new h.n
            java.lang.Object r1 = r3.f8958k
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f8932I
            r0.<init>(r1, r2)
        L1d:
            r3.f8963p = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            h.n r0 = new h.n
            java.lang.Object r1 = r3.f8958k
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            h.a r0 = r3.f8963p
            if (r0 == 0) goto L37
            boolean r1 = r3.f8953d0
            r0.mo9018u(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h.LayoutInflaterFactory2C2263e.m9106k0():void");
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: l */
    public int mo9050l() {
        return this.f8944U;
    }

    /* renamed from: l0 */
    public final boolean m9107l0(v vVar) {
        View view = vVar.f9008i;
        if (view != null) {
            vVar.f9007h = view;
            return true;
        }
        if (vVar.f9009j == null) {
            return false;
        }
        if (this.f8968u == null) {
            this.f8968u = new w();
        }
        View view2 = (View) vVar.m9146a(this.f8968u);
        vVar.f9007h = view2;
        return view2 != null;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: m */
    public MenuInflater mo9051m() {
        if (this.f8964q == null) {
            m9106k0();
            AbstractC2259a abstractC2259a = this.f8963p;
            this.f8964q = new C3396g(abstractC2259a != null ? abstractC2259a.mo9008k() : this.f8959l);
        }
        return this.f8964q;
    }

    /* renamed from: m0 */
    public final boolean m9108m0(v vVar) {
        vVar.m9149d(m9100e0());
        vVar.f9006g = new u(vVar.f9011l);
        vVar.f9002c = 81;
        return true;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: n */
    public AbstractC2259a mo9052n() {
        m9106k0();
        return this.f8963p;
    }

    /* renamed from: n0 */
    public final boolean m9109n0(v vVar) {
        Context context = this.f8959l;
        int i10 = vVar.f9000a;
        if ((i10 == 0 || i10 == 108) && this.f8966s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C1931a.f7334f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C1931a.f7335g, typedValue, true);
            } else {
                theme.resolveAttribute(C1931a.f7335g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3393d c3393d = new C3393d(context, 0);
                c3393d.getTheme().setTo(theme2);
                context = c3393d;
            }
        }
        C0192e c0192e = new C0192e(context);
        c0192e.mo772R(this);
        vVar.m9148c(c0192e);
        return true;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: o */
    public void mo9053o() {
        LayoutInflater from = LayoutInflater.from(this.f8959l);
        if (from.getFactory() == null) {
            C3317g.m12237b(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C2263e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: o0 */
    public final void m9110o0(int i10) {
        this.f8951b0 = (1 << i10) | this.f8951b0;
        if (this.f8950a0) {
            return;
        }
        C3308b0.m12004R(this.f8960m.getDecorView(), this.f8952c0);
        this.f8950a0 = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m9092V(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: p */
    public void mo9054p() {
        if (m9066C0() == null || mo9052n().mo9010m()) {
            return;
        }
        m9110o0(0);
    }

    /* renamed from: p0 */
    public final boolean m9111p0(Context context) {
        if (!this.f8947X && (this.f8958k instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f8958k.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f8946W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f8946W = false;
            }
        }
        this.f8947X = true;
        return this.f8946W;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: q */
    public void mo9055q(Configuration configuration) {
        AbstractC2259a mo9052n;
        if (this.f8931H && this.f8925B && (mo9052n = mo9052n()) != null) {
            mo9052n.mo9012o(configuration);
        }
        C3640j.m13541b().m13548g(this.f8959l);
        this.f8943T = new Configuration(this.f8959l.getResources().getConfiguration());
        m9075K(false);
        configuration.updateFrom(this.f8959l.getResources().getConfiguration());
    }

    /* renamed from: q0 */
    public boolean m9112q0() {
        return this.f8924A;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: r */
    public void mo9056r(Bundle bundle) {
        this.f8940Q = true;
        m9075K(false);
        m9098b0();
        Object obj = this.f8958k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C5492j.m21804c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC2259a m9066C0 = m9066C0();
                if (m9066C0 == null) {
                    this.f8953d0 = true;
                } else {
                    m9066C0.mo9018u(true);
                }
            }
            AbstractC2262d.m9031c(this);
        }
        this.f8943T = new Configuration(this.f8959l.getResources().getConfiguration());
        this.f8941R = true;
    }

    /* renamed from: r0 */
    public int m9113r0(Context context, int i10) {
        r m9102g0;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    m9102g0 = m9101f0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                m9102g0 = m9102g0(context);
            }
            return m9102g0.mo9140c();
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // p101h.AbstractC2262d
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9057s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8958k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            p101h.AbstractC2262d.m9035y(r3)
        L9:
            boolean r0 = r3.f8950a0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f8960m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f8952c0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f8942S = r0
            int r0 = r3.f8944U
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f8958k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            u.g<java.lang.String, java.lang.Integer> r0 = p101h.LayoutInflaterFactory2C2263e.f8918i0
            java.lang.Object r1 = r3.f8958k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f8944U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            u.g<java.lang.String, java.lang.Integer> r0 = p101h.LayoutInflaterFactory2C2263e.f8918i0
            java.lang.Object r1 = r3.f8958k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            h.a r0 = r3.f8963p
            if (r0 == 0) goto L5b
            r0.mo9013p()
        L5b:
            r3.m9087Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h.LayoutInflaterFactory2C2263e.mo9057s():void");
    }

    /* renamed from: s0 */
    public boolean m9114s0() {
        AbstractC3391b abstractC3391b = this.f8969v;
        if (abstractC3391b != null) {
            abstractC3391b.mo9219c();
            return true;
        }
        AbstractC2259a mo9052n = mo9052n();
        return mo9052n != null && mo9052n.mo9005h();
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: t */
    public void mo9058t(Bundle bundle) {
        m9097a0();
    }

    /* renamed from: t0 */
    public boolean m9115t0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f8939P = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            m9116u0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: u */
    public void mo9059u() {
        AbstractC2259a mo9052n = mo9052n();
        if (mo9052n != null) {
            mo9052n.mo9020w(true);
        }
    }

    /* renamed from: u0 */
    public final boolean m9116u0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        v m9103h0 = m9103h0(i10, true);
        if (m9103h0.f9014o) {
            return false;
        }
        return m9068E0(m9103h0, keyEvent);
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: v */
    public void mo9060v(Bundle bundle) {
    }

    /* renamed from: v0 */
    public boolean m9117v0(int i10, KeyEvent keyEvent) {
        AbstractC2259a mo9052n = mo9052n();
        if (mo9052n != null && mo9052n.mo9014q(i10, keyEvent)) {
            return true;
        }
        v vVar = this.f8938O;
        if (vVar != null && m9067D0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            v vVar2 = this.f8938O;
            if (vVar2 != null) {
                vVar2.f9013n = true;
            }
            return true;
        }
        if (this.f8938O == null) {
            v m9103h0 = m9103h0(0, true);
            m9068E0(m9103h0, keyEvent);
            boolean m9067D0 = m9067D0(m9103h0, keyEvent.getKeyCode(), keyEvent, 1);
            m9103h0.f9012m = false;
            if (m9067D0) {
                return true;
            }
        }
        return false;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: w */
    public void mo9061w() {
        m9073J();
    }

    /* renamed from: w0 */
    public boolean m9118w0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.f8939P;
            this.f8939P = false;
            v m9103h0 = m9103h0(0, false);
            if (m9103h0 != null && m9103h0.f9014o) {
                if (!z10) {
                    m9089S(m9103h0, true);
                }
                return true;
            }
            if (m9114s0()) {
                return true;
            }
        } else if (i10 == 82) {
            m9119x0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // p101h.AbstractC2262d
    /* renamed from: x */
    public void mo9062x() {
        AbstractC2259a mo9052n = mo9052n();
        if (mo9052n != null) {
            mo9052n.mo9020w(false);
        }
    }

    /* renamed from: x0 */
    public final boolean m9119x0(int i10, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC3632f0 interfaceC3632f0;
        if (this.f8969v != null) {
            return false;
        }
        boolean z11 = true;
        v m9103h0 = m9103h0(i10, true);
        if (i10 != 0 || (interfaceC3632f0 = this.f8966s) == null || !interfaceC3632f0.mo874d() || ViewConfiguration.get(this.f8959l).hasPermanentMenuKey()) {
            boolean z12 = m9103h0.f9014o;
            if (z12 || m9103h0.f9013n) {
                m9089S(m9103h0, true);
                z11 = z12;
            } else {
                if (m9103h0.f9012m) {
                    if (m9103h0.f9017r) {
                        m9103h0.f9012m = false;
                        z10 = m9068E0(m9103h0, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        m9065B0(m9103h0, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f8966s.mo872b()) {
            z11 = this.f8966s.mo877g();
        } else {
            if (!this.f8942S && m9068E0(m9103h0, keyEvent)) {
                z11 = this.f8966s.mo878h();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f8959l.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* renamed from: y0 */
    public void m9120y0(int i10) {
        AbstractC2259a mo9052n;
        if (i10 != 108 || (mo9052n = mo9052n()) == null) {
            return;
        }
        mo9052n.mo9006i(true);
    }

    /* renamed from: z0 */
    public void m9121z0(int i10) {
        if (i10 == 108) {
            AbstractC2259a mo9052n = mo9052n();
            if (mo9052n != null) {
                mo9052n.mo9006i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            v m9103h0 = m9103h0(i10, true);
            if (m9103h0.f9014o) {
                m9089S(m9103h0, false);
            }
        }
    }
}
