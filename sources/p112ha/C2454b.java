package p112ha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.p039ui.RotationLayout;
import p370z9.C6094b;
import p370z9.C6095c;
import p370z9.C6096d;

/* renamed from: ha.b */
/* loaded from: classes.dex */
public class C2454b {

    /* renamed from: a */
    public final Context f9847a;

    /* renamed from: b */
    public ViewGroup f9848b;

    /* renamed from: c */
    public RotationLayout f9849c;

    /* renamed from: d */
    public TextView f9850d;

    /* renamed from: e */
    public View f9851e;

    /* renamed from: f */
    public int f9852f;

    /* renamed from: g */
    public float f9853g = 0.5f;

    /* renamed from: h */
    public float f9854h = 1.0f;

    /* renamed from: i */
    public C2453a f9855i;

    public C2454b(Context context) {
        this.f9847a = context;
        this.f9855i = new C2453a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C6095c.f22622a, (ViewGroup) null);
        this.f9848b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f9849c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(C6094b.f22621a);
        this.f9850d = textView;
        this.f9851e = textView;
        m9819h(1);
    }

    /* renamed from: a */
    public static int m9812a(int i10) {
        if (i10 == 3) {
            return -3407872;
        }
        if (i10 == 4) {
            return -16737844;
        }
        if (i10 == 5) {
            return -10053376;
        }
        if (i10 != 6) {
            return i10 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    /* renamed from: b */
    public static int m9813b(int i10) {
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? C6096d.f22624b : C6096d.f22623a;
    }

    /* renamed from: c */
    public Bitmap m9814c() {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f9848b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f9848b.getMeasuredWidth();
        int measuredHeight = this.f9848b.getMeasuredHeight();
        this.f9848b.layout(0, 0, measuredWidth, measuredHeight);
        int i10 = this.f9852f;
        if (i10 == 1 || i10 == 3) {
            measuredHeight = this.f9848b.getMeasuredWidth();
            measuredWidth = this.f9848b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = this.f9852f;
        if (i11 != 1) {
            if (i11 == 2) {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            } else if (i11 == 3) {
                canvas.translate(0.0f, measuredHeight);
                f10 = 270.0f;
            }
            this.f9848b.draw(canvas);
            return createBitmap;
        }
        canvas.translate(measuredWidth, 0.0f);
        f10 = 90.0f;
        canvas.rotate(f10);
        this.f9848b.draw(canvas);
        return createBitmap;
    }

    /* renamed from: d */
    public Bitmap m9815d(CharSequence charSequence) {
        TextView textView = this.f9850d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return m9814c();
    }

    /* renamed from: e */
    public void m9816e(Drawable drawable) {
        this.f9848b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f9848b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f9848b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: f */
    public void m9817f(int i10) {
        this.f9855i.m9811a(i10);
        m9816e(this.f9855i);
    }

    /* renamed from: g */
    public void m9818g(View view) {
        this.f9849c.removeAllViews();
        this.f9849c.addView(view);
        this.f9851e = view;
        View findViewById = this.f9849c.findViewById(C6094b.f22621a);
        this.f9850d = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    /* renamed from: h */
    public void m9819h(int i10) {
        m9817f(m9812a(i10));
        m9821j(this.f9847a, m9813b(i10));
    }

    /* renamed from: i */
    public void m9820i(int i10) {
        m9821j(this.f9847a, i10);
    }

    /* renamed from: j */
    public void m9821j(Context context, int i10) {
        TextView textView = this.f9850d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }
}
