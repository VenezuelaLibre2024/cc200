package p187n;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p002a0.C0008e;
import p118i.C2572a;
import p119i0.C2575c;
import p148k0.InterfaceC3343z;
import p188n0.C3683j;
import p188n0.InterfaceC3675b;
import p188n0.InterfaceC3687n;

/* renamed from: n.c0 */
/* loaded from: classes.dex */
public class C3623c0 extends TextView implements InterfaceC3343z, InterfaceC3687n, InterfaceC3675b {

    /* renamed from: h */
    public final C3625d f12801h;

    /* renamed from: i */
    public final C3620b0 f12802i;

    /* renamed from: j */
    public final C3617a0 f12803j;

    /* renamed from: k */
    public C3646m f12804k;

    /* renamed from: l */
    public boolean f12805l;

    /* renamed from: m */
    public Future<C2575c> f12806m;

    public C3623c0(Context context) {
        this(context, null);
    }

    public C3623c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C3623c0(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        this.f12805l = false;
        C3657r0.m13693a(this, getContext());
        C3625d c3625d = new C3625d(this);
        this.f12801h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12802i = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        c3620b0.m13397b();
        this.f12803j = new C3617a0(this);
        getEmojiTextViewHelper().m13609b(attributeSet, i10);
    }

    private C3646m getEmojiTextViewHelper() {
        if (this.f12804k == null) {
            this.f12804k = new C3646m(this);
        }
        return this.f12804k;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    /* renamed from: e */
    public final void m13445e() {
        Future<C2575c> future = this.f12806m;
        if (future != null) {
            try {
                this.f12806m = null;
                C3683j.m13857k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeMaxTextSize();
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            return c3620b0.m13399e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeMinTextSize();
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            return c3620b0.m13400f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeStepGranularity();
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            return c3620b0.m13401g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3620b0 c3620b0 = this.f12802i;
        return c3620b0 != null ? c3620b0.m13402h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            return c3620b0.m13403i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C3683j.m13859m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C3683j.m13847a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C3683j.m13848b(this);
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12802i.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12802i.m13405k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m13445e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3617a0 c3617a0;
        return (Build.VERSION.SDK_INT >= 28 || (c3617a0 = this.f12803j) == null) ? super.getTextClassifier() : c3617a0.m13388a();
    }

    public C2575c.a getTextMetricsParamsCompat() {
        return C3683j.m13851e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12802i.m13412r(this, onCreateInputConnection, editorInfo);
        return C3648n.m13620a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13409o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m13445e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 == null || InterfaceC3675b.f13116f || !c3620b0.m13406l()) {
            return;
        }
        this.f12802i.m13398c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m13610c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (InterfaceC3675b.f13116f) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13414t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (InterfaceC3675b.f13116f) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13415u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (InterfaceC3675b.f13116f) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13416v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C2572a.m10278b(context, i10) : null, i11 != 0 ? C2572a.m10278b(context, i11) : null, i12 != 0 ? C2572a.m10278b(context, i12) : null, i13 != 0 ? C2572a.m10278b(context, i13) : null);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C2572a.m10278b(context, i10) : null, i11 != 0 ? C2572a.m10278b(context, i11) : null, i12 != 0 ? C2572a.m10278b(context, i12) : null, i13 != 0 ? C2572a.m10278b(context, i13) : null);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C3683j.m13860n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m13611d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m13608a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            C3683j.m13854h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            C3683j.m13855i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C3683j.m13856j(this, i10);
    }

    public void setPrecomputedText(C2575c c2575c) {
        C3683j.m13857k(this, c2575c);
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12801h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12802i.m13417w(colorStateList);
        this.f12802i.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12802i.m13418x(mode);
        this.f12802i.m13397b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13411q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3617a0 c3617a0;
        if (Build.VERSION.SDK_INT >= 28 || (c3617a0 = this.f12803j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3617a0.m13389b(textClassifier);
        }
    }

    public void setTextFuture(Future<C2575c> future) {
        this.f12806m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C2575c.a aVar) {
        C3683j.m13858l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC3675b.f13116f) {
            super.setTextSize(i10, f10);
            return;
        }
        C3620b0 c3620b0 = this.f12802i;
        if (c3620b0 != null) {
            c3620b0.m13393A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f12805l) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            typeface2 = C0008e.m36a(getContext(), typeface, i10);
        }
        this.f12805l = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f12805l = false;
        }
    }
}
