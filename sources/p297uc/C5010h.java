package p297uc;

import android.view.MotionEvent;

/* renamed from: uc.h */
/* loaded from: classes2.dex */
public class C5010h {

    /* renamed from: a */
    public float f18733a;

    /* renamed from: b */
    public float f18734b;

    /* renamed from: c */
    public float f18735c;

    /* renamed from: d */
    public float f18736d;

    /* renamed from: e */
    public int f18737e = -1;

    /* renamed from: f */
    public int f18738f = -1;

    /* renamed from: g */
    public float f18739g;

    /* renamed from: h */
    public boolean f18740h;

    /* renamed from: i */
    public a f18741i;

    /* renamed from: uc.h$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        boolean mo6076a(C5010h c5010h);
    }

    /* renamed from: uc.h$b */
    /* loaded from: classes2.dex */
    public static class b implements a {
    }

    public C5010h(a aVar) {
        this.f18741i = aVar;
    }

    /* renamed from: a */
    public final float m19644a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return m19645b((float) Math.toDegrees((float) Math.atan2(f11 - f13, f10 - f12)), (float) Math.toDegrees((float) Math.atan2(f15 - f17, f14 - f16)));
    }

    /* renamed from: b */
    public final float m19645b(float f10, float f11) {
        float f12;
        float f13 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f18739g = f13;
        if (f13 >= -180.0f) {
            if (f13 > 180.0f) {
                f12 = f13 - 360.0f;
            }
            return this.f18739g;
        }
        f12 = f13 + 360.0f;
        this.f18739g = f12;
        return this.f18739g;
    }

    /* renamed from: c */
    public float m19646c() {
        return this.f18739g;
    }

    /* renamed from: d */
    public boolean m19647d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f18737e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f18733a = motionEvent.getX();
                    this.f18734b = motionEvent.getY();
                    this.f18738f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f18738f = -1;
                }
            } else if (this.f18737e != -1 && this.f18738f != -1 && motionEvent.getPointerCount() > this.f18738f) {
                float x10 = motionEvent.getX(this.f18737e);
                float y10 = motionEvent.getY(this.f18737e);
                float x11 = motionEvent.getX(this.f18738f);
                float y11 = motionEvent.getY(this.f18738f);
                if (this.f18740h) {
                    this.f18739g = 0.0f;
                    this.f18740h = false;
                } else {
                    m19644a(this.f18733a, this.f18734b, this.f18735c, this.f18736d, x11, y11, x10, y10);
                }
                a aVar = this.f18741i;
                if (aVar != null) {
                    aVar.mo6076a(this);
                }
                this.f18733a = x11;
                this.f18734b = y11;
                this.f18735c = x10;
                this.f18736d = y10;
            }
            return true;
        }
        this.f18735c = motionEvent.getX();
        this.f18736d = motionEvent.getY();
        this.f18737e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        this.f18739g = 0.0f;
        this.f18740h = true;
        return true;
    }
}
