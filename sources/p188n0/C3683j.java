package p188n0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p119i0.C2575c;
import p133j0.C3205d;

/* renamed from: n0.j */
/* loaded from: classes.dex */
public final class C3683j {

    /* renamed from: n0.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m13861a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m13862b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m13863c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: n0.j$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Drawable[] m13864a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m13865b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m13866c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m13867d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m13868e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m13869f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        public static void m13870g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m13871h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* renamed from: n0.j$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static int m13872a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m13873b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m13874c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m13875d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m13876e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        /* renamed from: f */
        public static void m13877f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m13878g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m13879h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* renamed from: n0.j$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static DecimalFormatSymbols m13880a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: n0.j$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public static String[] m13881a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        public static PrecomputedText.Params m13882b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        public static void m13883c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* renamed from: n0.j$f */
    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f13126a;

        /* renamed from: b */
        public final TextView f13127b;

        /* renamed from: c */
        public Class<?> f13128c;

        /* renamed from: d */
        public Method f13129d;

        /* renamed from: e */
        public boolean f13130e;

        /* renamed from: f */
        public boolean f13131f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f13126a = callback;
            this.f13127b = textView;
        }

        /* renamed from: a */
        public final Intent m13884a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent m13885b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m13884a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m13888e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> m13886c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m13884a(), 0)) {
                if (m13889f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public ActionMode.Callback m13887d() {
            return this.f13126a;
        }

        /* renamed from: e */
        public final boolean m13888e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        public final boolean m13889f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        public final void m13890g(Menu menu) {
            Context context = this.f13127b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f13131f) {
                this.f13131f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f13128c = cls;
                    this.f13129d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f13130e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f13128c = null;
                    this.f13129d = null;
                    this.f13130e = false;
                }
            }
            try {
                Method declaredMethod = (this.f13130e && this.f13128c.isInstance(menu)) ? this.f13129d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m13886c = m13886c(context, packageManager);
                for (int i10 = 0; i10 < m13886c.size(); i10++) {
                    ResolveInfo resolveInfo = m13886c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m13885b(resolveInfo, this.f13127b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f13126a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f13126a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f13126a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m13890g(menu);
            return this.f13126a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m13847a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m13848b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    public static int m13849c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: d */
    public static TextDirectionHeuristic m13850d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(e.m13881a(d.m13880a(b.m13867d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = b.m13865b(textView) == 1;
        switch (b.m13866c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: e */
    public static C2575c.a m13851e(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new C2575c.a(e.m13882b(textView));
        }
        C2575c.a.C6185a c6185a = new C2575c.a.C6185a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            c6185a.m10316b(c.m13872a(textView));
            c6185a.m10317c(c.m13875d(textView));
        }
        if (i10 >= 18) {
            c6185a.m10318d(m13850d(textView));
        }
        return c6185a.m10315a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static void m13852f(TextView textView, ColorStateList colorStateList) {
        C3205d.m11414j(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m13877f(textView, colorStateList);
        } else if (textView instanceof InterfaceC3687n) {
            ((InterfaceC3687n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m13853g(TextView textView, PorterDuff.Mode mode) {
        C3205d.m11414j(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m13878g(textView, mode);
        } else if (textView instanceof InterfaceC3687n) {
            ((InterfaceC3687n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: h */
    public static void m13854h(TextView textView, int i10) {
        C3205d.m11411g(i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            e.m13883c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = (i11 < 16 || a.m13861a(textView)) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m13855i(TextView textView, int i10) {
        C3205d.m11411g(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = (Build.VERSION.SDK_INT < 16 || a.m13861a(textView)) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: j */
    public static void m13856j(TextView textView, int i10) {
        C3205d.m11411g(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: k */
    public static void m13857k(TextView textView, C2575c c2575c) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedText = c2575c.m10309b();
        } else {
            boolean m10310a = m13851e(textView).m10310a(c2575c.m10308a());
            precomputedText = c2575c;
            if (!m10310a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: l */
    public static void m13858l(TextView textView, C2575c.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            b.m13871h(textView, m13849c(aVar.m10313d()));
        }
        if (i10 >= 23) {
            textView.getPaint().set(aVar.m10314e());
            c.m13876e(textView, aVar.m10311b());
            c.m13879h(textView, aVar.m10312c());
        } else {
            float textScaleX = aVar.m10314e().getTextScaleX();
            textView.getPaint().set(aVar.m10314e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: m */
    public static ActionMode.Callback m13859m(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).m13887d();
    }

    /* renamed from: n */
    public static ActionMode.Callback m13860n(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
