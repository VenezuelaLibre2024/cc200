package p187n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p089g.C1931a;
import p148k0.InterfaceC3343z;
import p188n0.C3683j;
import p188n0.InterfaceC3675b;
import p188n0.InterfaceC3687n;

/* renamed from: n.e */
/* loaded from: classes.dex */
public class C3628e extends Button implements InterfaceC3343z, InterfaceC3675b, InterfaceC3687n {

    /* renamed from: h */
    public final C3625d f12836h;

    /* renamed from: i */
    public final C3620b0 f12837i;

    /* renamed from: j */
    public C3646m f12838j;

    public C3628e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7345q);
    }

    public C3628e(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3625d c3625d = new C3625d(this);
        this.f12836h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12837i = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        c3620b0.m13397b();
        getEmojiTextViewHelper().m13609b(attributeSet, i10);
    }

    private C3646m getEmojiTextViewHelper() {
        if (this.f12838j == null) {
            this.f12838j = new C3646m(this);
        }
        return this.f12838j;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeMaxTextSize();
        }
        C3620b0 c3620b0 = this.f12837i;
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
        C3620b0 c3620b0 = this.f12837i;
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
        C3620b0 c3620b0 = this.f12837i;
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
        C3620b0 c3620b0 = this.f12837i;
        return c3620b0 != null ? c3620b0.m13402h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC3675b.f13116f) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            return c3620b0.m13403i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C3683j.m13859m(super.getCustomSelectionActionModeCallback());
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12837i.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12837i.m13405k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13409o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 == null || InterfaceC3675b.f13116f || !c3620b0.m13406l()) {
            return;
        }
        this.f12837i.m13398c();
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
        C3620b0 c3620b0 = this.f12837i;
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
        C3620b0 c3620b0 = this.f12837i;
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
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13416v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
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

    public void setSupportAllCaps(boolean z10) {
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13413s(z10);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12836h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12837i.m13417w(colorStateList);
        this.f12837i.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12837i.m13418x(mode);
        this.f12837i.m13397b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13411q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC3675b.f13116f) {
            super.setTextSize(i10, f10);
            return;
        }
        C3620b0 c3620b0 = this.f12837i;
        if (c3620b0 != null) {
            c3620b0.m13393A(i10, f10);
        }
    }
}
