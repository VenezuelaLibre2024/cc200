package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p148k0.InterfaceC3343z;
import p188n0.InterfaceC3688o;

/* renamed from: n.q */
/* loaded from: classes.dex */
public class C3654q extends ImageView implements InterfaceC3343z, InterfaceC3688o {

    /* renamed from: h */
    public final C3625d f12990h;

    /* renamed from: i */
    public final C3652p f12991i;

    /* renamed from: j */
    public boolean f12992j;

    public C3654q(Context context) {
        this(context, null);
    }

    public C3654q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3654q(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        this.f12992j = false;
        C3657r0.m13693a(this, getContext());
        C3625d c3625d = new C3625d(this);
        this.f12990h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3652p c3652p = new C3652p(this);
        this.f12991i = c3652p;
        c3652p.m13656g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13652c();
        }
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    @Override // p188n0.InterfaceC3688o
    public ColorStateList getSupportImageTintList() {
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            return c3652p.m13653d();
        }
        return null;
    }

    @Override // p188n0.InterfaceC3688o
    public PorterDuff.Mode getSupportImageTintMode() {
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            return c3652p.m13654e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f12991i.m13655f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13652c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C3652p c3652p = this.f12991i;
        if (c3652p != null && drawable != null && !this.f12992j) {
            c3652p.m13657h(drawable);
        }
        super.setImageDrawable(drawable);
        C3652p c3652p2 = this.f12991i;
        if (c3652p2 != null) {
            c3652p2.m13652c();
            if (this.f12992j) {
                return;
            }
            this.f12991i.m13651b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f12992j = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13658i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13652c();
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12990h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3688o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13659j(colorStateList);
        }
    }

    @Override // p188n0.InterfaceC3688o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C3652p c3652p = this.f12991i;
        if (c3652p != null) {
            c3652p.m13660k(mode);
        }
    }
}
