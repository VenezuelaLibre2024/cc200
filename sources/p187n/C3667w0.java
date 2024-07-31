package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p118i.C2572a;
import p360z.C5934h;

/* renamed from: n.w0 */
/* loaded from: classes.dex */
public class C3667w0 {

    /* renamed from: a */
    public final Context f13045a;

    /* renamed from: b */
    public final TypedArray f13046b;

    /* renamed from: c */
    public TypedValue f13047c;

    public C3667w0(Context context, TypedArray typedArray) {
        this.f13045a = context;
        this.f13046b = typedArray;
    }

    /* renamed from: s */
    public static C3667w0 m13715s(Context context, int i10, int[] iArr) {
        return new C3667w0(context, context.obtainStyledAttributes(i10, iArr));
    }

    /* renamed from: t */
    public static C3667w0 m13716t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C3667w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: u */
    public static C3667w0 m13717u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new C3667w0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    /* renamed from: a */
    public boolean m13718a(int i10, boolean z10) {
        return this.f13046b.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public int m13719b(int i10, int i11) {
        return this.f13046b.getColor(i10, i11);
    }

    /* renamed from: c */
    public ColorStateList m13720c(int i10) {
        int resourceId;
        ColorStateList m10277a;
        return (!this.f13046b.hasValue(i10) || (resourceId = this.f13046b.getResourceId(i10, 0)) == 0 || (m10277a = C2572a.m10277a(this.f13045a, resourceId)) == null) ? this.f13046b.getColorStateList(i10) : m10277a;
    }

    /* renamed from: d */
    public int m13721d(int i10, int i11) {
        return this.f13046b.getDimensionPixelOffset(i10, i11);
    }

    /* renamed from: e */
    public int m13722e(int i10, int i11) {
        return this.f13046b.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: f */
    public Drawable m13723f(int i10) {
        int resourceId;
        return (!this.f13046b.hasValue(i10) || (resourceId = this.f13046b.getResourceId(i10, 0)) == 0) ? this.f13046b.getDrawable(i10) : C2572a.m10278b(this.f13045a, resourceId);
    }

    /* renamed from: g */
    public Drawable m13724g(int i10) {
        int resourceId;
        if (!this.f13046b.hasValue(i10) || (resourceId = this.f13046b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C3640j.m13541b().m13546d(this.f13045a, resourceId, true);
    }

    /* renamed from: h */
    public float m13725h(int i10, float f10) {
        return this.f13046b.getFloat(i10, f10);
    }

    /* renamed from: i */
    public Typeface m13726i(int i10, int i11, C5934h.f fVar) {
        int resourceId = this.f13046b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f13047c == null) {
            this.f13047c = new TypedValue();
        }
        return C5934h.m23750f(this.f13045a, resourceId, this.f13047c, i11, fVar);
    }

    /* renamed from: j */
    public int m13727j(int i10, int i11) {
        return this.f13046b.getInt(i10, i11);
    }

    /* renamed from: k */
    public int m13728k(int i10, int i11) {
        return this.f13046b.getInteger(i10, i11);
    }

    /* renamed from: l */
    public int m13729l(int i10, int i11) {
        return this.f13046b.getLayoutDimension(i10, i11);
    }

    /* renamed from: m */
    public int m13730m(int i10, int i11) {
        return this.f13046b.getResourceId(i10, i11);
    }

    /* renamed from: n */
    public String m13731n(int i10) {
        return this.f13046b.getString(i10);
    }

    /* renamed from: o */
    public CharSequence m13732o(int i10) {
        return this.f13046b.getText(i10);
    }

    /* renamed from: p */
    public CharSequence[] m13733p(int i10) {
        return this.f13046b.getTextArray(i10);
    }

    /* renamed from: q */
    public TypedArray m13734q() {
        return this.f13046b;
    }

    /* renamed from: r */
    public boolean m13735r(int i10) {
        return this.f13046b.hasValue(i10);
    }

    /* renamed from: v */
    public void m13736v() {
        this.f13046b.recycle();
    }
}
