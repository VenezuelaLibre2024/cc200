package p101h;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p089g.C1940j;
import p148k0.C3308b0;
import p162l.C3393d;
import p187n.C3622c;
import p187n.C3623c0;
import p187n.C3628e;
import p187n.C3629e0;
import p187n.C3631f;
import p187n.C3634g;
import p187n.C3642k;
import p187n.C3650o;
import p187n.C3654q;
import p187n.C3656r;
import p187n.C3661t0;
import p187n.C3662u;
import p187n.C3664v;
import p187n.C3668x;
import p187n.C3672z;
import p285u.C4777g;

/* renamed from: h.h */
/* loaded from: classes.dex */
public class C2266h {

    /* renamed from: b */
    public static final Class<?>[] f9023b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f9024c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f9025d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f9026e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f9027f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f9028g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C4777g<String, Constructor<? extends View>> f9029h = new C4777g<>();

    /* renamed from: a */
    public final Object[] f9030a = new Object[2];

    /* renamed from: h.h$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: h */
        public final View f9031h;

        /* renamed from: i */
        public final String f9032i;

        /* renamed from: j */
        public Method f9033j;

        /* renamed from: k */
        public Context f9034k;

        public a(View view, String str) {
            this.f9031h = view;
            this.f9032i = str;
        }

        /* renamed from: a */
        public final void m9176a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f9032i, View.class)) != null) {
                        this.f9033j = method;
                        this.f9034k = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f9031h.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f9031h.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f9032i + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f9031h.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f9033j == null) {
                m9176a(this.f9031h.getContext());
            }
            try {
                this.f9033j.invoke(this.f9034k, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* renamed from: u */
    public static Context m9154u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7722v3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(C1940j.f7727w3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C1940j.f7732x3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C3393d) && ((C3393d) context).m12613c() == resourceId) ? context : new C3393d(context, resourceId) : context;
    }

    /* renamed from: a */
    public final void m9155a(Context context, View view, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9025d);
        if (obtainStyledAttributes.hasValue(0)) {
            C3308b0.m12010X(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f9026e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C3308b0.m12011Y(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f9027f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C3308b0.m12028h0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    public final void m9156b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C3308b0.m11989C(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9024c);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: c */
    public C3622c m9157c(Context context, AttributeSet attributeSet) {
        return new C3622c(context, attributeSet);
    }

    /* renamed from: d */
    public C3628e m9158d(Context context, AttributeSet attributeSet) {
        return new C3628e(context, attributeSet);
    }

    /* renamed from: e */
    public C3631f m9159e(Context context, AttributeSet attributeSet) {
        return new C3631f(context, attributeSet);
    }

    /* renamed from: f */
    public C3634g m9160f(Context context, AttributeSet attributeSet) {
        return new C3634g(context, attributeSet);
    }

    /* renamed from: g */
    public C3642k m9161g(Context context, AttributeSet attributeSet) {
        return new C3642k(context, attributeSet);
    }

    /* renamed from: h */
    public C3650o m9162h(Context context, AttributeSet attributeSet) {
        return new C3650o(context, attributeSet);
    }

    /* renamed from: i */
    public C3654q m9163i(Context context, AttributeSet attributeSet) {
        return new C3654q(context, attributeSet);
    }

    /* renamed from: j */
    public C3656r m9164j(Context context, AttributeSet attributeSet) {
        return new C3656r(context, attributeSet);
    }

    /* renamed from: k */
    public C3662u m9165k(Context context, AttributeSet attributeSet) {
        return new C3662u(context, attributeSet);
    }

    /* renamed from: l */
    public C3664v m9166l(Context context, AttributeSet attributeSet) {
        return new C3664v(context, attributeSet);
    }

    /* renamed from: m */
    public C3668x m9167m(Context context, AttributeSet attributeSet) {
        return new C3668x(context, attributeSet);
    }

    /* renamed from: n */
    public C3672z m9168n(Context context, AttributeSet attributeSet) {
        return new C3672z(context, attributeSet);
    }

    /* renamed from: o */
    public C3623c0 m9169o(Context context, AttributeSet attributeSet) {
        return new C3623c0(context, attributeSet);
    }

    /* renamed from: p */
    public C3629e0 m9170p(Context context, AttributeSet attributeSet) {
        return new C3629e0(context, attributeSet);
    }

    /* renamed from: q */
    public View m9171q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View m9172r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View m9166l;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = m9154u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = C3661t0.m13708b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m9166l = m9166l(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 1:
                m9166l = m9160f(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 2:
                m9166l = m9164j(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 3:
                m9166l = m9169o(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 4:
                m9166l = m9162h(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 5:
                m9166l = m9167m(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 6:
                m9166l = m9168n(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 7:
                m9166l = m9165k(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case '\b':
                m9166l = m9170p(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case '\t':
                m9166l = m9163i(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case '\n':
                m9166l = m9157c(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case 11:
                m9166l = m9159e(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case '\f':
                m9166l = m9161g(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            case '\r':
                m9166l = m9158d(context2, attributeSet);
                m9175v(m9166l, str);
                break;
            default:
                m9166l = m9171q(context2, str, attributeSet);
                break;
        }
        if (m9166l == null && context != context2) {
            m9166l = m9174t(context2, str, attributeSet);
        }
        if (m9166l != null) {
            m9156b(m9166l, attributeSet);
            m9155a(context2, m9166l, attributeSet);
        }
        return m9166l;
    }

    /* renamed from: s */
    public final View m9173s(Context context, String str, String str2) {
        String str3;
        C4777g<String, Constructor<? extends View>> c4777g = f9029h;
        Constructor<? extends View> constructor = c4777g.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f9023b);
            c4777g.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f9030a);
    }

    /* renamed from: t */
    public final View m9174t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Constants.CLASS);
        }
        try {
            Object[] objArr = this.f9030a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m9173s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f9028g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View m9173s = m9173s(context, str, strArr[i10]);
                if (m9173s != null) {
                    return m9173s;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f9030a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: v */
    public final void m9175v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
