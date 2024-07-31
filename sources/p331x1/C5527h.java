package p331x1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: x1.h */
/* loaded from: classes.dex */
public class C5527h<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f20699a;

    /* renamed from: b */
    public final PathMeasure f20700b;

    /* renamed from: c */
    public final float f20701c;

    /* renamed from: d */
    public final float[] f20702d;

    /* renamed from: e */
    public final PointF f20703e;

    /* renamed from: f */
    public float f20704f;

    public C5527h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f20702d = new float[2];
        this.f20703e = new PointF();
        this.f20699a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f20700b = pathMeasure;
        this.f20701c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t10) {
        return Float.valueOf(this.f20704f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t10, Float f10) {
        this.f20704f = f10.floatValue();
        this.f20700b.getPosTan(this.f20701c * f10.floatValue(), this.f20702d, null);
        PointF pointF = this.f20703e;
        float[] fArr = this.f20702d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f20699a.set(t10, pointF);
    }
}
