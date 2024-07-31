package p162l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p089g.C1931a;
import p089g.C1932b;
import p089g.C1934d;
import p089g.C1940j;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C3390a {

    /* renamed from: a */
    public Context f11828a;

    public C3390a(Context context) {
        this.f11828a = context;
    }

    /* renamed from: b */
    public static C3390a m12599b(Context context) {
        return new C3390a(context);
    }

    /* renamed from: a */
    public boolean m12600a() {
        return this.f11828a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m12601c() {
        return this.f11828a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m12602d() {
        Configuration configuration = this.f11828a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m12603e() {
        return this.f11828a.getResources().getDimensionPixelSize(C1934d.f7365b);
    }

    /* renamed from: f */
    public int m12604f() {
        TypedArray obtainStyledAttributes = this.f11828a.obtainStyledAttributes(null, C1940j.f7613a, C1931a.f7331c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1940j.f7658j, 0);
        Resources resources = this.f11828a.getResources();
        if (!m12605g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1934d.f7364a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m12605g() {
        return this.f11828a.getResources().getBoolean(C1932b.f7355a);
    }

    /* renamed from: h */
    public boolean m12606h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f11828a).hasPermanentMenuKey();
    }
}
