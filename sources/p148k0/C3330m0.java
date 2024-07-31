package p148k0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p285u.C4777g;

/* renamed from: k0.m0 */
/* loaded from: classes.dex */
public final class C3330m0 {

    /* renamed from: a */
    public final e f11635a;

    /* renamed from: k0.m0$a */
    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a */
        public final Window f11636a;

        /* renamed from: b */
        public final View f11637b;

        public a(Window window, View view) {
            this.f11636a = window;
            this.f11637b = view;
        }

        /* renamed from: c */
        public void m12361c(int i10) {
            View decorView = this.f11636a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        public void m12362d(int i10) {
            this.f11636a.addFlags(i10);
        }

        /* renamed from: e */
        public void m12363e(int i10) {
            View decorView = this.f11636a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* renamed from: f */
        public void m12364f(int i10) {
            this.f11636a.clearFlags(i10);
        }
    }

    /* renamed from: k0.m0$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // p148k0.C3330m0.e
        /* renamed from: b */
        public void mo12365b(boolean z10) {
            if (!z10) {
                m12363e(8192);
                return;
            }
            m12364f(67108864);
            m12362d(Integer.MIN_VALUE);
            m12361c(8192);
        }
    }

    /* renamed from: k0.m0$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // p148k0.C3330m0.e
        /* renamed from: a */
        public void mo12366a(boolean z10) {
            if (!z10) {
                m12363e(16);
                return;
            }
            m12364f(134217728);
            m12362d(Integer.MIN_VALUE);
            m12361c(16);
        }
    }

    /* renamed from: k0.m0$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        public final C3330m0 f11638a;

        /* renamed from: b */
        public final WindowInsetsController f11639b;

        /* renamed from: c */
        public final C4777g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f11640c;

        /* renamed from: d */
        public Window f11641d;

        public d(Window window, C3330m0 c3330m0) {
            this(window.getInsetsController(), c3330m0);
            this.f11641d = window;
        }

        public d(WindowInsetsController windowInsetsController, C3330m0 c3330m0) {
            this.f11640c = new C4777g<>();
            this.f11639b = windowInsetsController;
            this.f11638a = c3330m0;
        }

        @Override // p148k0.C3330m0.e
        /* renamed from: a */
        public void mo12366a(boolean z10) {
            if (z10) {
                if (this.f11641d != null) {
                    m12367c(16);
                }
                this.f11639b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f11641d != null) {
                    m12368d(16);
                }
                this.f11639b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p148k0.C3330m0.e
        /* renamed from: b */
        public void mo12365b(boolean z10) {
            if (z10) {
                if (this.f11641d != null) {
                    m12367c(8192);
                }
                this.f11639b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f11641d != null) {
                    m12368d(8192);
                }
                this.f11639b.setSystemBarsAppearance(0, 8);
            }
        }

        /* renamed from: c */
        public void m12367c(int i10) {
            View decorView = this.f11641d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        public void m12368d(int i10) {
            View decorView = this.f11641d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: k0.m0$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public void mo12366a(boolean z10) {
        }

        /* renamed from: b */
        public void mo12365b(boolean z10) {
        }
    }

    public C3330m0(Window window, View view) {
        e aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f11635a = new d(window, this);
            return;
        }
        if (i10 >= 26) {
            aVar = new c(window, view);
        } else if (i10 >= 23) {
            aVar = new b(window, view);
        } else {
            if (i10 < 20) {
                this.f11635a = new e();
                return;
            }
            aVar = new a(window, view);
        }
        this.f11635a = aVar;
    }

    /* renamed from: a */
    public void m12359a(boolean z10) {
        this.f11635a.mo12366a(z10);
    }

    /* renamed from: b */
    public void m12360b(boolean z10) {
        this.f11635a.mo12365b(z10);
    }
}
