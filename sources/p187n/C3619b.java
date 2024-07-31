package p187n;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: n.b */
/* loaded from: classes.dex */
public class C3619b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f12763a;

    /* renamed from: n.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13391a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C3619b(ActionBarContainer actionBarContainer) {
        this.f12763a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f12763a;
        if (actionBarContainer.f847o) {
            Drawable drawable = actionBarContainer.f846n;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f844l;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f12763a;
        Drawable drawable3 = actionBarContainer2.f845m;
        if (drawable3 == null || !actionBarContainer2.f848p) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f12763a;
        if (!actionBarContainer.f847o) {
            drawable = actionBarContainer.f844l;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f846n == null) {
            return;
        } else {
            drawable = actionBarContainer.f844l;
        }
        a.m13391a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
