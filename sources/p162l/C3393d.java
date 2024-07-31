package p162l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p089g.C1939i;

/* renamed from: l.d */
/* loaded from: classes.dex */
public class C3393d extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f11831f;

    /* renamed from: a */
    public int f11832a;

    /* renamed from: b */
    public Resources.Theme f11833b;

    /* renamed from: c */
    public LayoutInflater f11834c;

    /* renamed from: d */
    public Configuration f11835d;

    /* renamed from: e */
    public Resources f11836e;

    /* renamed from: l.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Context m12616a(C3393d c3393d, Configuration configuration) {
            return c3393d.createConfigurationContext(configuration);
        }
    }

    public C3393d() {
        super(null);
    }

    public C3393d(Context context, int i10) {
        super(context);
        this.f11832a = i10;
    }

    public C3393d(Context context, Resources.Theme theme) {
        super(context);
        this.f11833b = theme;
    }

    /* renamed from: e */
    public static boolean m12610e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f11831f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f11831f = configuration2;
        }
        return configuration.equals(f11831f);
    }

    /* renamed from: a */
    public void m12611a(Configuration configuration) {
        if (this.f11836e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f11835d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f11835d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources m12612b() {
        Resources resources;
        int i10;
        if (this.f11836e == null) {
            Configuration configuration = this.f11835d;
            if (configuration == null || ((i10 = Build.VERSION.SDK_INT) >= 26 && m12610e(configuration))) {
                resources = super.getResources();
            } else if (i10 >= 17) {
                resources = a.m12616a(this, this.f11835d).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f11835d);
                this.f11836e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f11836e = resources;
        }
        return this.f11836e;
    }

    /* renamed from: c */
    public int m12613c() {
        return this.f11832a;
    }

    /* renamed from: d */
    public final void m12614d() {
        boolean z10 = this.f11833b == null;
        if (z10) {
            this.f11833b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11833b.setTo(theme);
            }
        }
        m12615f(this.f11833b, this.f11832a, z10);
    }

    /* renamed from: f */
    public void m12615f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m12612b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f11834c == null) {
            this.f11834c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f11834c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11833b;
        if (theme != null) {
            return theme;
        }
        if (this.f11832a == 0) {
            this.f11832a = C1939i.f7502e;
        }
        m12614d();
        return this.f11833b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f11832a != i10) {
            this.f11832a = i10;
            m12614d();
        }
    }
}
