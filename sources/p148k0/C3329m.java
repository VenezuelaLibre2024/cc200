package p148k0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p027c0.InterfaceMenuItemC0580b;

/* renamed from: k0.m */
/* loaded from: classes.dex */
public final class C3329m {

    /* renamed from: k0.m$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m12346a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        public static CharSequence m12347b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        public static ColorStateList m12348c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        public static PorterDuff.Mode m12349d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        public static int m12350e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        public static CharSequence m12351f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        public static MenuItem m12352g(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        /* renamed from: h */
        public static MenuItem m12353h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        public static MenuItem m12354i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        public static MenuItem m12355j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        public static MenuItem m12356k(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        /* renamed from: l */
        public static MenuItem m12357l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            return menuItem.setShortcut(c10, c11, i10, i11);
        }

        /* renamed from: m */
        public static MenuItem m12358m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m12339a(MenuItem menuItem, AbstractC3307b abstractC3307b) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            return ((InterfaceMenuItemC0580b) menuItem).mo820b(abstractC3307b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m12340b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12352g(menuItem, c10, i10);
        }
    }

    /* renamed from: c */
    public static void m12341c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12353h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m12342d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12354i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m12343e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12355j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m12344f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12356k(menuItem, c10, i10);
        }
    }

    /* renamed from: g */
    public static void m12345g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0580b) {
            ((InterfaceMenuItemC0580b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m12358m(menuItem, charSequence);
        }
    }
}
