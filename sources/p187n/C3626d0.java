package p187n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p079f6.C1841a;
import p089g.C1940j;
import p148k0.C3308b0;

/* renamed from: n.d0 */
/* loaded from: classes.dex */
public class C3626d0 {

    /* renamed from: l */
    public static final RectF f12820l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f12821m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f12822n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f12823a = 0;

    /* renamed from: b */
    public boolean f12824b = false;

    /* renamed from: c */
    public float f12825c = -1.0f;

    /* renamed from: d */
    public float f12826d = -1.0f;

    /* renamed from: e */
    public float f12827e = -1.0f;

    /* renamed from: f */
    public int[] f12828f = new int[0];

    /* renamed from: g */
    public boolean f12829g = false;

    /* renamed from: h */
    public TextPaint f12830h;

    /* renamed from: i */
    public final TextView f12831i;

    /* renamed from: j */
    public final Context f12832j;

    /* renamed from: k */
    public final f f12833k;

    /* renamed from: n.d0$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static StaticLayout m13491a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        public static int m13492b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: n.d0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static boolean m13493a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: n.d0$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static StaticLayout m13494a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = C1841a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.mo13495a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: n.d0$d */
    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // p187n.C3626d0.f
        /* renamed from: a */
        public void mo13495a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C3626d0.m13465p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: n.d0$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // p187n.C3626d0.d, p187n.C3626d0.f
        /* renamed from: a */
        public void mo13495a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p187n.C3626d0.f
        /* renamed from: b */
        public boolean mo13496b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: n.d0$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        public void mo13495a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo13496b(TextView textView) {
            return ((Boolean) C3626d0.m13465p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C3626d0(TextView textView) {
        this.f12831i = textView;
        this.f12832j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f12833k = i10 >= 29 ? new e() : i10 >= 23 ? new d() : new f();
    }

    /* renamed from: a */
    public static <T> T m13462a(Object obj, String str, T t10) {
        try {
            Field m13463m = m13463m(str);
            return m13463m == null ? t10 : (T) m13463m.get(obj);
        } catch (IllegalAccessException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return t10;
        }
    }

    /* renamed from: m */
    public static Field m13463m(String str) {
        try {
            Field field = f12822n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f12822n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    /* renamed from: n */
    public static Method m13464n(String str) {
        try {
            Method method = f12821m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f12821m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* renamed from: p */
    public static <T> T m13465p(Object obj, String str, T t10) {
        try {
            return (T) m13464n(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    /* renamed from: A */
    public final boolean m13466A(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f12831i.getText();
        TransformationMethod transformationMethod = this.f12831i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f12831i)) != null) {
            text = transformation;
        }
        int m13492b = Build.VERSION.SDK_INT >= 16 ? a.m13492b(this.f12831i) : -1;
        m13480o(i10);
        StaticLayout m13472e = m13472e(text, (Layout.Alignment) m13465p(this.f12831i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m13492b);
        return (m13492b == -1 || (m13472e.getLineCount() <= m13492b && m13472e.getLineEnd(m13472e.getLineCount() - 1) == text.length())) && ((float) m13472e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: B */
    public final boolean m13467B() {
        return !(this.f12831i instanceof C3642k);
    }

    /* renamed from: C */
    public final void m13468C(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f12823a = 1;
        this.f12826d = f10;
        this.f12827e = f11;
        this.f12825c = f12;
        this.f12829g = false;
    }

    /* renamed from: b */
    public void m13469b() {
        if (m13481q()) {
            if (this.f12824b) {
                if (this.f12831i.getMeasuredHeight() <= 0 || this.f12831i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f12833k.mo13496b(this.f12831i) ? 1048576 : (this.f12831i.getMeasuredWidth() - this.f12831i.getTotalPaddingLeft()) - this.f12831i.getTotalPaddingRight();
                int height = (this.f12831i.getHeight() - this.f12831i.getCompoundPaddingBottom()) - this.f12831i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f12820l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m13474g = m13474g(rectF);
                    if (m13474g != this.f12831i.getTextSize()) {
                        m13487w(0, m13474g);
                    }
                }
            }
            this.f12824b = true;
        }
    }

    /* renamed from: c */
    public final int[] m13470c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public final void m13471d() {
        this.f12823a = 0;
        this.f12826d = -1.0f;
        this.f12827e = -1.0f;
        this.f12825c = -1.0f;
        this.f12828f = new int[0];
        this.f12824b = false;
    }

    /* renamed from: e */
    public StaticLayout m13472e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        return i12 >= 23 ? c.m13494a(charSequence, alignment, i10, i11, this.f12831i, this.f12830h, this.f12833k) : i12 >= 16 ? a.m13491a(charSequence, alignment, i10, this.f12831i, this.f12830h) : m13473f(charSequence, alignment, i10);
    }

    /* renamed from: f */
    public final StaticLayout m13473f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f12830h, i10, alignment, ((Float) m13462a(this.f12831i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m13462a(this.f12831i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m13462a(this.f12831i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: g */
    public final int m13474g(RectF rectF) {
        int i10;
        int length = this.f12828f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = length - 1;
        while (true) {
            int i14 = i12;
            int i15 = i11;
            i11 = i14;
            while (i11 <= i13) {
                i10 = (i11 + i13) / 2;
                if (m13466A(this.f12828f[i10], rectF)) {
                    break;
                }
                i15 = i10 - 1;
                i13 = i15;
            }
            return this.f12828f[i15];
            i12 = i10 + 1;
        }
    }

    /* renamed from: h */
    public int m13475h() {
        return Math.round(this.f12827e);
    }

    /* renamed from: i */
    public int m13476i() {
        return Math.round(this.f12826d);
    }

    /* renamed from: j */
    public int m13477j() {
        return Math.round(this.f12825c);
    }

    /* renamed from: k */
    public int[] m13478k() {
        return this.f12828f;
    }

    /* renamed from: l */
    public int m13479l() {
        return this.f12823a;
    }

    /* renamed from: o */
    public void m13480o(int i10) {
        TextPaint textPaint = this.f12830h;
        if (textPaint == null) {
            this.f12830h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f12830h.set(this.f12831i.getPaint());
        this.f12830h.setTextSize(i10);
    }

    /* renamed from: q */
    public boolean m13481q() {
        return m13467B() && this.f12823a != 0;
    }

    /* renamed from: r */
    public void m13482r(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f12832j;
        int[] iArr = C1940j.f7644g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f12831i;
        C3308b0.m12007U(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = C1940j.f7669l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f12823a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = C1940j.f7664k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = C1940j.f7654i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = C1940j.f7649h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = C1940j.f7659j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m13489y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m13467B()) {
            this.f12823a = 0;
            return;
        }
        if (this.f12823a == 1) {
            if (!this.f12829g) {
                DisplayMetrics displayMetrics = this.f12832j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m13468C(dimension2, dimension3, dimension);
            }
            m13488x();
        }
    }

    /* renamed from: s */
    public void m13483s(int i10, int i11, int i12, int i13) {
        if (m13467B()) {
            DisplayMetrics displayMetrics = this.f12832j.getResources().getDisplayMetrics();
            m13468C(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m13488x()) {
                m13469b();
            }
        }
    }

    /* renamed from: t */
    public void m13484t(int[] iArr, int i10) {
        if (m13467B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f12832j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f12828f = m13470c(iArr2);
                if (!m13490z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f12829g = false;
            }
            if (m13488x()) {
                m13469b();
            }
        }
    }

    /* renamed from: u */
    public void m13485u(int i10) {
        if (m13467B()) {
            if (i10 == 0) {
                m13471d();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f12832j.getResources().getDisplayMetrics();
            m13468C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m13488x()) {
                m13469b();
            }
        }
    }

    /* renamed from: v */
    public final void m13486v(float f10) {
        if (f10 != this.f12831i.getPaint().getTextSize()) {
            this.f12831i.getPaint().setTextSize(f10);
            boolean m13493a = Build.VERSION.SDK_INT >= 18 ? b.m13493a(this.f12831i) : false;
            if (this.f12831i.getLayout() != null) {
                this.f12824b = false;
                try {
                    Method m13464n = m13464n("nullLayouts");
                    if (m13464n != null) {
                        m13464n.invoke(this.f12831i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (m13493a) {
                    this.f12831i.forceLayout();
                } else {
                    this.f12831i.requestLayout();
                }
                this.f12831i.invalidate();
            }
        }
    }

    /* renamed from: w */
    public void m13487w(int i10, float f10) {
        Context context = this.f12832j;
        m13486v(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: x */
    public final boolean m13488x() {
        if (m13467B() && this.f12823a == 1) {
            if (!this.f12829g || this.f12828f.length == 0) {
                int floor = ((int) Math.floor((this.f12827e - this.f12826d) / this.f12825c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f12826d + (i10 * this.f12825c));
                }
                this.f12828f = m13470c(iArr);
            }
            this.f12824b = true;
        } else {
            this.f12824b = false;
        }
        return this.f12824b;
    }

    /* renamed from: y */
    public final void m13489y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f12828f = m13470c(iArr);
            m13490z();
        }
    }

    /* renamed from: z */
    public final boolean m13490z() {
        boolean z10 = this.f12828f.length > 0;
        this.f12829g = z10;
        if (z10) {
            this.f12823a = 1;
            this.f12826d = r0[0];
            this.f12827e = r0[r1 - 1];
            this.f12825c = -1.0f;
        }
        return z10;
    }
}
