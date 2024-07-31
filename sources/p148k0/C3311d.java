package p148k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;
import p133j0.C3203b;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class C3311d {

    /* renamed from: a */
    public final DisplayCutout f11573a;

    /* renamed from: k0.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static DisplayCutout m12201a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m12202b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        public static int m12203c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        public static int m12204d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        public static int m12205e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        public static int m12206f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C3311d(DisplayCutout displayCutout) {
        this.f11573a = displayCutout;
    }

    /* renamed from: e */
    public static C3311d m12196e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C3311d(displayCutout);
    }

    /* renamed from: a */
    public int m12197a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m12203c(this.f11573a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m12198b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m12204d(this.f11573a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m12199c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m12205e(this.f11573a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m12200d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m12206f(this.f11573a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3311d.class != obj.getClass()) {
            return false;
        }
        return C3203b.m11399a(this.f11573a, ((C3311d) obj).f11573a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f11573a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f11573a + "}";
    }
}
