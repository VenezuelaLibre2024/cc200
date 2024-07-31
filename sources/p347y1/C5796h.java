package p347y1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a0.C0007d;
import p015b0.C0436a;
import p285u.C4771a;
import p360z.C5930d;
import p360z.C5934h;
import p360z.C5937k;

/* renamed from: y1.h */
/* loaded from: classes.dex */
public class C5796h extends AbstractC5795g {

    /* renamed from: r */
    public static final PorterDuff.Mode f21658r = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public h f21659i;

    /* renamed from: j */
    public PorterDuffColorFilter f21660j;

    /* renamed from: k */
    public ColorFilter f21661k;

    /* renamed from: l */
    public boolean f21662l;

    /* renamed from: m */
    public boolean f21663m;

    /* renamed from: n */
    public Drawable.ConstantState f21664n;

    /* renamed from: o */
    public final float[] f21665o;

    /* renamed from: p */
    public final Matrix f21666p;

    /* renamed from: q */
    public final Rect f21667q;

    /* renamed from: y1.h$b */
    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // p347y1.C5796h.f
        /* renamed from: c */
        public boolean mo23230c() {
            return true;
        }

        /* renamed from: e */
        public void m23231e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C5937k.m23780j(xmlPullParser, "pathData")) {
                TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21631d);
                m23232f(m23781k, xmlPullParser);
                m23781k.recycle();
            }
        }

        /* renamed from: f */
        public final void m23232f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f21694b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f21693a = C0007d.m24d(string2);
            }
            this.f21695c = C5937k.m23777g(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: y1.h$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        public int[] f21668e;

        /* renamed from: f */
        public C5930d f21669f;

        /* renamed from: g */
        public float f21670g;

        /* renamed from: h */
        public C5930d f21671h;

        /* renamed from: i */
        public float f21672i;

        /* renamed from: j */
        public float f21673j;

        /* renamed from: k */
        public float f21674k;

        /* renamed from: l */
        public float f21675l;

        /* renamed from: m */
        public float f21676m;

        /* renamed from: n */
        public Paint.Cap f21677n;

        /* renamed from: o */
        public Paint.Join f21678o;

        /* renamed from: p */
        public float f21679p;

        public c() {
            this.f21670g = 0.0f;
            this.f21672i = 1.0f;
            this.f21673j = 1.0f;
            this.f21674k = 0.0f;
            this.f21675l = 1.0f;
            this.f21676m = 0.0f;
            this.f21677n = Paint.Cap.BUTT;
            this.f21678o = Paint.Join.MITER;
            this.f21679p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f21670g = 0.0f;
            this.f21672i = 1.0f;
            this.f21673j = 1.0f;
            this.f21674k = 0.0f;
            this.f21675l = 1.0f;
            this.f21676m = 0.0f;
            this.f21677n = Paint.Cap.BUTT;
            this.f21678o = Paint.Join.MITER;
            this.f21679p = 4.0f;
            this.f21668e = cVar.f21668e;
            this.f21669f = cVar.f21669f;
            this.f21670g = cVar.f21670g;
            this.f21672i = cVar.f21672i;
            this.f21671h = cVar.f21671h;
            this.f21695c = cVar.f21695c;
            this.f21673j = cVar.f21673j;
            this.f21674k = cVar.f21674k;
            this.f21675l = cVar.f21675l;
            this.f21676m = cVar.f21676m;
            this.f21677n = cVar.f21677n;
            this.f21678o = cVar.f21678o;
            this.f21679p = cVar.f21679p;
        }

        @Override // p347y1.C5796h.e
        /* renamed from: a */
        public boolean mo23233a() {
            return this.f21671h.m23714i() || this.f21669f.m23714i();
        }

        @Override // p347y1.C5796h.e
        /* renamed from: b */
        public boolean mo23234b(int[] iArr) {
            return this.f21669f.m23715j(iArr) | this.f21671h.m23715j(iArr);
        }

        /* renamed from: e */
        public final Paint.Cap m23235e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        public final Paint.Join m23236f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: g */
        public void m23237g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21630c);
            m23238h(m23781k, xmlPullParser, theme);
            m23781k.recycle();
        }

        public float getFillAlpha() {
            return this.f21673j;
        }

        public int getFillColor() {
            return this.f21671h.m23711e();
        }

        public float getStrokeAlpha() {
            return this.f21672i;
        }

        public int getStrokeColor() {
            return this.f21669f.m23711e();
        }

        public float getStrokeWidth() {
            return this.f21670g;
        }

        public float getTrimPathEnd() {
            return this.f21675l;
        }

        public float getTrimPathOffset() {
            return this.f21676m;
        }

        public float getTrimPathStart() {
            return this.f21674k;
        }

        /* renamed from: h */
        public final void m23238h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f21668e = null;
            if (C5937k.m23780j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f21694b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f21693a = C0007d.m24d(string2);
                }
                this.f21671h = C5937k.m23775e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f21673j = C5937k.m23776f(typedArray, xmlPullParser, "fillAlpha", 12, this.f21673j);
                this.f21677n = m23235e(C5937k.m23777g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f21677n);
                this.f21678o = m23236f(C5937k.m23777g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f21678o);
                this.f21679p = C5937k.m23776f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f21679p);
                this.f21669f = C5937k.m23775e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f21672i = C5937k.m23776f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f21672i);
                this.f21670g = C5937k.m23776f(typedArray, xmlPullParser, "strokeWidth", 4, this.f21670g);
                this.f21675l = C5937k.m23776f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f21675l);
                this.f21676m = C5937k.m23776f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f21676m);
                this.f21674k = C5937k.m23776f(typedArray, xmlPullParser, "trimPathStart", 5, this.f21674k);
                this.f21695c = C5937k.m23777g(typedArray, xmlPullParser, "fillType", 13, this.f21695c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f21673j = f10;
        }

        public void setFillColor(int i10) {
            this.f21671h.m23716k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f21672i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f21669f.m23716k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f21670g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f21675l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f21676m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f21674k = f10;
        }
    }

    /* renamed from: y1.h$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        public final Matrix f21680a;

        /* renamed from: b */
        public final ArrayList<e> f21681b;

        /* renamed from: c */
        public float f21682c;

        /* renamed from: d */
        public float f21683d;

        /* renamed from: e */
        public float f21684e;

        /* renamed from: f */
        public float f21685f;

        /* renamed from: g */
        public float f21686g;

        /* renamed from: h */
        public float f21687h;

        /* renamed from: i */
        public float f21688i;

        /* renamed from: j */
        public final Matrix f21689j;

        /* renamed from: k */
        public int f21690k;

        /* renamed from: l */
        public int[] f21691l;

        /* renamed from: m */
        public String f21692m;

        public d() {
            super();
            this.f21680a = new Matrix();
            this.f21681b = new ArrayList<>();
            this.f21682c = 0.0f;
            this.f21683d = 0.0f;
            this.f21684e = 0.0f;
            this.f21685f = 1.0f;
            this.f21686g = 1.0f;
            this.f21687h = 0.0f;
            this.f21688i = 0.0f;
            this.f21689j = new Matrix();
            this.f21692m = null;
        }

        public d(d dVar, C4771a<String, Object> c4771a) {
            super();
            f bVar;
            this.f21680a = new Matrix();
            this.f21681b = new ArrayList<>();
            this.f21682c = 0.0f;
            this.f21683d = 0.0f;
            this.f21684e = 0.0f;
            this.f21685f = 1.0f;
            this.f21686g = 1.0f;
            this.f21687h = 0.0f;
            this.f21688i = 0.0f;
            Matrix matrix = new Matrix();
            this.f21689j = matrix;
            this.f21692m = null;
            this.f21682c = dVar.f21682c;
            this.f21683d = dVar.f21683d;
            this.f21684e = dVar.f21684e;
            this.f21685f = dVar.f21685f;
            this.f21686g = dVar.f21686g;
            this.f21687h = dVar.f21687h;
            this.f21688i = dVar.f21688i;
            this.f21691l = dVar.f21691l;
            String str = dVar.f21692m;
            this.f21692m = str;
            this.f21690k = dVar.f21690k;
            if (str != null) {
                c4771a.put(str, this);
            }
            matrix.set(dVar.f21689j);
            ArrayList<e> arrayList = dVar.f21681b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f21681b.add(new d((d) eVar, c4771a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f21681b.add(bVar);
                    String str2 = bVar.f21694b;
                    if (str2 != null) {
                        c4771a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p347y1.C5796h.e
        /* renamed from: a */
        public boolean mo23233a() {
            for (int i10 = 0; i10 < this.f21681b.size(); i10++) {
                if (this.f21681b.get(i10).mo23233a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p347y1.C5796h.e
        /* renamed from: b */
        public boolean mo23234b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f21681b.size(); i10++) {
                z10 |= this.f21681b.get(i10).mo23234b(iArr);
            }
            return z10;
        }

        /* renamed from: c */
        public void m23239c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21629b);
            m23241e(m23781k, xmlPullParser);
            m23781k.recycle();
        }

        /* renamed from: d */
        public final void m23240d() {
            this.f21689j.reset();
            this.f21689j.postTranslate(-this.f21683d, -this.f21684e);
            this.f21689j.postScale(this.f21685f, this.f21686g);
            this.f21689j.postRotate(this.f21682c, 0.0f, 0.0f);
            this.f21689j.postTranslate(this.f21687h + this.f21683d, this.f21688i + this.f21684e);
        }

        /* renamed from: e */
        public final void m23241e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f21691l = null;
            this.f21682c = C5937k.m23776f(typedArray, xmlPullParser, "rotation", 5, this.f21682c);
            this.f21683d = typedArray.getFloat(1, this.f21683d);
            this.f21684e = typedArray.getFloat(2, this.f21684e);
            this.f21685f = C5937k.m23776f(typedArray, xmlPullParser, "scaleX", 3, this.f21685f);
            this.f21686g = C5937k.m23776f(typedArray, xmlPullParser, "scaleY", 4, this.f21686g);
            this.f21687h = C5937k.m23776f(typedArray, xmlPullParser, "translateX", 6, this.f21687h);
            this.f21688i = C5937k.m23776f(typedArray, xmlPullParser, "translateY", 7, this.f21688i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f21692m = string;
            }
            m23240d();
        }

        public String getGroupName() {
            return this.f21692m;
        }

        public Matrix getLocalMatrix() {
            return this.f21689j;
        }

        public float getPivotX() {
            return this.f21683d;
        }

        public float getPivotY() {
            return this.f21684e;
        }

        public float getRotation() {
            return this.f21682c;
        }

        public float getScaleX() {
            return this.f21685f;
        }

        public float getScaleY() {
            return this.f21686g;
        }

        public float getTranslateX() {
            return this.f21687h;
        }

        public float getTranslateY() {
            return this.f21688i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f21683d) {
                this.f21683d = f10;
                m23240d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f21684e) {
                this.f21684e = f10;
                m23240d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f21682c) {
                this.f21682c = f10;
                m23240d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f21685f) {
                this.f21685f = f10;
                m23240d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f21686g) {
                this.f21686g = f10;
                m23240d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f21687h) {
                this.f21687h = f10;
                m23240d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f21688i) {
                this.f21688i = f10;
                m23240d();
            }
        }
    }

    /* renamed from: y1.h$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        /* renamed from: a */
        public boolean mo23233a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo23234b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: y1.h$f */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        public C0007d.b[] f21693a;

        /* renamed from: b */
        public String f21694b;

        /* renamed from: c */
        public int f21695c;

        /* renamed from: d */
        public int f21696d;

        public f() {
            super();
            this.f21693a = null;
            this.f21695c = 0;
        }

        public f(f fVar) {
            super();
            this.f21693a = null;
            this.f21695c = 0;
            this.f21694b = fVar.f21694b;
            this.f21696d = fVar.f21696d;
            this.f21693a = C0007d.m26f(fVar.f21693a);
        }

        /* renamed from: c */
        public boolean mo23230c() {
            return false;
        }

        /* renamed from: d */
        public void m23242d(Path path) {
            path.reset();
            C0007d.b[] bVarArr = this.f21693a;
            if (bVarArr != null) {
                C0007d.b.m34e(bVarArr, path);
            }
        }

        public C0007d.b[] getPathData() {
            return this.f21693a;
        }

        public String getPathName() {
            return this.f21694b;
        }

        public void setPathData(C0007d.b[] bVarArr) {
            if (C0007d.m22b(this.f21693a, bVarArr)) {
                C0007d.m30j(this.f21693a, bVarArr);
            } else {
                this.f21693a = C0007d.m26f(bVarArr);
            }
        }
    }

    /* renamed from: y1.h$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q */
        public static final Matrix f21697q = new Matrix();

        /* renamed from: a */
        public final Path f21698a;

        /* renamed from: b */
        public final Path f21699b;

        /* renamed from: c */
        public final Matrix f21700c;

        /* renamed from: d */
        public Paint f21701d;

        /* renamed from: e */
        public Paint f21702e;

        /* renamed from: f */
        public PathMeasure f21703f;

        /* renamed from: g */
        public int f21704g;

        /* renamed from: h */
        public final d f21705h;

        /* renamed from: i */
        public float f21706i;

        /* renamed from: j */
        public float f21707j;

        /* renamed from: k */
        public float f21708k;

        /* renamed from: l */
        public float f21709l;

        /* renamed from: m */
        public int f21710m;

        /* renamed from: n */
        public String f21711n;

        /* renamed from: o */
        public Boolean f21712o;

        /* renamed from: p */
        public final C4771a<String, Object> f21713p;

        public g() {
            this.f21700c = new Matrix();
            this.f21706i = 0.0f;
            this.f21707j = 0.0f;
            this.f21708k = 0.0f;
            this.f21709l = 0.0f;
            this.f21710m = 255;
            this.f21711n = null;
            this.f21712o = null;
            this.f21713p = new C4771a<>();
            this.f21705h = new d();
            this.f21698a = new Path();
            this.f21699b = new Path();
        }

        public g(g gVar) {
            this.f21700c = new Matrix();
            this.f21706i = 0.0f;
            this.f21707j = 0.0f;
            this.f21708k = 0.0f;
            this.f21709l = 0.0f;
            this.f21710m = 255;
            this.f21711n = null;
            this.f21712o = null;
            C4771a<String, Object> c4771a = new C4771a<>();
            this.f21713p = c4771a;
            this.f21705h = new d(gVar.f21705h, c4771a);
            this.f21698a = new Path(gVar.f21698a);
            this.f21699b = new Path(gVar.f21699b);
            this.f21706i = gVar.f21706i;
            this.f21707j = gVar.f21707j;
            this.f21708k = gVar.f21708k;
            this.f21709l = gVar.f21709l;
            this.f21704g = gVar.f21704g;
            this.f21710m = gVar.f21710m;
            this.f21711n = gVar.f21711n;
            String str = gVar.f21711n;
            if (str != null) {
                c4771a.put(str, this);
            }
            this.f21712o = gVar.f21712o;
        }

        /* renamed from: a */
        public static float m23243a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* renamed from: b */
        public void m23244b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            m23245c(this.f21705h, f21697q, canvas, i10, i11, colorFilter);
        }

        /* renamed from: c */
        public final void m23245c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f21680a.set(matrix);
            dVar.f21680a.preConcat(dVar.f21689j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f21681b.size(); i12++) {
                e eVar = dVar.f21681b.get(i12);
                if (eVar instanceof d) {
                    m23245c((d) eVar, dVar.f21680a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    m23246d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void m23246d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f21708k;
            float f11 = i11 / this.f21709l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f21680a;
            this.f21700c.set(matrix);
            this.f21700c.postScale(f10, f11);
            float m23247e = m23247e(matrix);
            if (m23247e == 0.0f) {
                return;
            }
            fVar.m23242d(this.f21698a);
            Path path = this.f21698a;
            this.f21699b.reset();
            if (fVar.mo23230c()) {
                this.f21699b.setFillType(fVar.f21695c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f21699b.addPath(path, this.f21700c);
                canvas.clipPath(this.f21699b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f21674k;
            if (f12 != 0.0f || cVar.f21675l != 1.0f) {
                float f13 = cVar.f21676m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f21675l + f13) % 1.0f;
                if (this.f21703f == null) {
                    this.f21703f = new PathMeasure();
                }
                this.f21703f.setPath(this.f21698a, false);
                float length = this.f21703f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f21703f.getSegment(f16, length, path, true);
                    this.f21703f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f21703f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f21699b.addPath(path, this.f21700c);
            if (cVar.f21671h.m23717l()) {
                C5930d c5930d = cVar.f21671h;
                if (this.f21702e == null) {
                    Paint paint = new Paint(1);
                    this.f21702e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f21702e;
                if (c5930d.m23713h()) {
                    Shader m23712f = c5930d.m23712f();
                    m23712f.setLocalMatrix(this.f21700c);
                    paint2.setShader(m23712f);
                    paint2.setAlpha(Math.round(cVar.f21673j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C5796h.m23220a(c5930d.m23711e(), cVar.f21673j));
                }
                paint2.setColorFilter(colorFilter);
                this.f21699b.setFillType(cVar.f21695c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f21699b, paint2);
            }
            if (cVar.f21669f.m23717l()) {
                C5930d c5930d2 = cVar.f21669f;
                if (this.f21701d == null) {
                    Paint paint3 = new Paint(1);
                    this.f21701d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f21701d;
                Paint.Join join = cVar.f21678o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f21677n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f21679p);
                if (c5930d2.m23713h()) {
                    Shader m23712f2 = c5930d2.m23712f();
                    m23712f2.setLocalMatrix(this.f21700c);
                    paint4.setShader(m23712f2);
                    paint4.setAlpha(Math.round(cVar.f21672i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C5796h.m23220a(c5930d2.m23711e(), cVar.f21672i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f21670g * min * m23247e);
                canvas.drawPath(this.f21699b, paint4);
            }
        }

        /* renamed from: e */
        public final float m23247e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m23243a = m23243a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m23243a) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean m23248f() {
            if (this.f21712o == null) {
                this.f21712o = Boolean.valueOf(this.f21705h.mo23233a());
            }
            return this.f21712o.booleanValue();
        }

        /* renamed from: g */
        public boolean m23249g(int[] iArr) {
            return this.f21705h.mo23234b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f21710m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f21710m = i10;
        }
    }

    /* renamed from: y1.h$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f21714a;

        /* renamed from: b */
        public g f21715b;

        /* renamed from: c */
        public ColorStateList f21716c;

        /* renamed from: d */
        public PorterDuff.Mode f21717d;

        /* renamed from: e */
        public boolean f21718e;

        /* renamed from: f */
        public Bitmap f21719f;

        /* renamed from: g */
        public ColorStateList f21720g;

        /* renamed from: h */
        public PorterDuff.Mode f21721h;

        /* renamed from: i */
        public int f21722i;

        /* renamed from: j */
        public boolean f21723j;

        /* renamed from: k */
        public boolean f21724k;

        /* renamed from: l */
        public Paint f21725l;

        public h() {
            this.f21716c = null;
            this.f21717d = C5796h.f21658r;
            this.f21715b = new g();
        }

        public h(h hVar) {
            this.f21716c = null;
            this.f21717d = C5796h.f21658r;
            if (hVar != null) {
                this.f21714a = hVar.f21714a;
                g gVar = new g(hVar.f21715b);
                this.f21715b = gVar;
                if (hVar.f21715b.f21702e != null) {
                    gVar.f21702e = new Paint(hVar.f21715b.f21702e);
                }
                if (hVar.f21715b.f21701d != null) {
                    this.f21715b.f21701d = new Paint(hVar.f21715b.f21701d);
                }
                this.f21716c = hVar.f21716c;
                this.f21717d = hVar.f21717d;
                this.f21718e = hVar.f21718e;
            }
        }

        /* renamed from: a */
        public boolean m23250a(int i10, int i11) {
            return i10 == this.f21719f.getWidth() && i11 == this.f21719f.getHeight();
        }

        /* renamed from: b */
        public boolean m23251b() {
            return !this.f21724k && this.f21720g == this.f21716c && this.f21721h == this.f21717d && this.f21723j == this.f21718e && this.f21722i == this.f21715b.getRootAlpha();
        }

        /* renamed from: c */
        public void m23252c(int i10, int i11) {
            if (this.f21719f == null || !m23250a(i10, i11)) {
                this.f21719f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f21724k = true;
            }
        }

        /* renamed from: d */
        public void m23253d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f21719f, (Rect) null, rect, m23254e(colorFilter));
        }

        /* renamed from: e */
        public Paint m23254e(ColorFilter colorFilter) {
            if (!m23255f() && colorFilter == null) {
                return null;
            }
            if (this.f21725l == null) {
                Paint paint = new Paint();
                this.f21725l = paint;
                paint.setFilterBitmap(true);
            }
            this.f21725l.setAlpha(this.f21715b.getRootAlpha());
            this.f21725l.setColorFilter(colorFilter);
            return this.f21725l;
        }

        /* renamed from: f */
        public boolean m23255f() {
            return this.f21715b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m23256g() {
            return this.f21715b.m23248f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21714a;
        }

        /* renamed from: h */
        public boolean m23257h(int[] iArr) {
            boolean m23249g = this.f21715b.m23249g(iArr);
            this.f21724k |= m23249g;
            return m23249g;
        }

        /* renamed from: i */
        public void m23258i() {
            this.f21720g = this.f21716c;
            this.f21721h = this.f21717d;
            this.f21722i = this.f21715b.getRootAlpha();
            this.f21723j = this.f21718e;
            this.f21724k = false;
        }

        /* renamed from: j */
        public void m23259j(int i10, int i11) {
            this.f21719f.eraseColor(0);
            this.f21715b.m23244b(new Canvas(this.f21719f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5796h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5796h(this);
        }
    }

    /* renamed from: y1.h$i */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f21726a;

        public i(Drawable.ConstantState constantState) {
            this.f21726a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f21726a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21726a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5796h c5796h = new C5796h();
            c5796h.f21657h = (VectorDrawable) this.f21726a.newDrawable();
            return c5796h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C5796h c5796h = new C5796h();
            c5796h.f21657h = (VectorDrawable) this.f21726a.newDrawable(resources);
            return c5796h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C5796h c5796h = new C5796h();
            c5796h.f21657h = (VectorDrawable) this.f21726a.newDrawable(resources, theme);
            return c5796h;
        }
    }

    public C5796h() {
        this.f21663m = true;
        this.f21665o = new float[9];
        this.f21666p = new Matrix();
        this.f21667q = new Rect();
        this.f21659i = new h();
    }

    public C5796h(h hVar) {
        this.f21663m = true;
        this.f21665o = new float[9];
        this.f21666p = new Matrix();
        this.f21667q = new Rect();
        this.f21659i = hVar;
        this.f21660j = m23229j(this.f21660j, hVar.f21716c, hVar.f21717d);
    }

    /* renamed from: a */
    public static int m23220a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    /* renamed from: b */
    public static C5796h m23221b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C5796h c5796h = new C5796h();
            c5796h.f21657h = C5934h.m23748d(resources, i10, theme);
            c5796h.f21664n = new i(c5796h.f21657h.getConstantState());
            return c5796h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m23222c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    /* renamed from: c */
    public static C5796h m23222c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C5796h c5796h = new C5796h();
        c5796h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c5796h;
    }

    /* renamed from: g */
    public static PorterDuff.Mode m23223g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f21657h;
        if (drawable == null) {
            return false;
        }
        C0436a.m2251b(drawable);
        return false;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object m23224d(String str) {
        return this.f21659i.f21715b.f21713p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f21667q);
        if (this.f21667q.width() <= 0 || this.f21667q.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f21661k;
        if (colorFilter == null) {
            colorFilter = this.f21660j;
        }
        canvas.getMatrix(this.f21666p);
        this.f21666p.getValues(this.f21665o);
        float abs = Math.abs(this.f21665o[0]);
        float abs2 = Math.abs(this.f21665o[4]);
        float abs3 = Math.abs(this.f21665o[1]);
        float abs4 = Math.abs(this.f21665o[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f21667q.width() * abs));
        int min2 = Math.min(2048, (int) (this.f21667q.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f21667q;
        canvas.translate(rect.left, rect.top);
        if (m23226f()) {
            canvas.translate(this.f21667q.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f21667q.offsetTo(0, 0);
        this.f21659i.m23252c(min, min2);
        if (!this.f21663m) {
            this.f21659i.m23259j(min, min2);
        } else if (!this.f21659i.m23251b()) {
            this.f21659i.m23259j(min, min2);
            this.f21659i.m23258i();
        }
        this.f21659i.m23253d(canvas, colorFilter, this.f21667q);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m23225e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        int i11;
        b bVar;
        h hVar = this.f21659i;
        g gVar = hVar.f21715b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f21705h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m23237g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f21681b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f21713p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.m23231e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f21681b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f21713p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m23239c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f21681b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f21713p.put(dVar2.getGroupName(), dVar2);
                    }
                    i10 = hVar.f21714a;
                    i11 = dVar2.f21690k;
                    hVar.f21714a = i11 | i10;
                }
                i10 = hVar.f21714a;
                i11 = bVar.f21696d;
                hVar.f21714a = i11 | i10;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    public final boolean m23226f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0436a.m2254e(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2252c(drawable) : this.f21659i.f21715b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f21659i.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2253d(drawable) : this.f21661k;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f21657h != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f21657h.getConstantState());
        }
        this.f21659i.f21714a = getChangingConfigurations();
        return this.f21659i;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f21659i.f21715b.f21707j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f21659i.f21715b.f21706i;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public void m23227h(boolean z10) {
        this.f21663m = z10;
    }

    /* renamed from: i */
    public final void m23228i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f21659i;
        g gVar = hVar.f21715b;
        hVar.f21717d = m23223g(C5937k.m23777g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m23773c = C5937k.m23773c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m23773c != null) {
            hVar.f21716c = m23773c;
        }
        hVar.f21718e = C5937k.m23771a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f21718e);
        gVar.f21708k = C5937k.m23776f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f21708k);
        float m23776f = C5937k.m23776f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f21709l);
        gVar.f21709l = m23776f;
        if (gVar.f21708k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m23776f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f21706i = typedArray.getDimension(3, gVar.f21706i);
        float dimension = typedArray.getDimension(2, gVar.f21707j);
        gVar.f21707j = dimension;
        if (gVar.f21706i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C5937k.m23776f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f21711n = string;
            gVar.f21713p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2255f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f21659i;
        hVar.f21715b = new g();
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21628a);
        m23228i(m23781k, xmlPullParser, theme);
        m23781k.recycle();
        hVar.f21714a = getChangingConfigurations();
        hVar.f21724k = true;
        m23225e(resources, xmlPullParser, attributeSet, theme);
        this.f21660j = m23229j(this.f21660j, hVar.f21716c, hVar.f21717d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2256g(drawable) : this.f21659i.f21718e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f21659i) != null && (hVar.m23256g() || ((colorStateList = this.f21659i.f21716c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    public PorterDuffColorFilter m23229j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f21662l && super.mutate() == this) {
            this.f21659i = new h(this.f21659i);
            this.f21662l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f21659i;
        ColorStateList colorStateList = hVar.f21716c;
        if (colorStateList != null && (mode = hVar.f21717d) != null) {
            this.f21660j = m23229j(this.f21660j, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.m23256g() || !hVar.m23257h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f21659i.f21715b.getRootAlpha() != i10) {
            this.f21659i.f21715b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2258i(drawable, z10);
        } else {
            this.f21659i.f21718e = z10;
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f21661k = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTint(int i10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2262m(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2263n(drawable, colorStateList);
            return;
        }
        h hVar = this.f21659i;
        if (hVar.f21716c != colorStateList) {
            hVar.f21716c = colorStateList;
            this.f21660j = m23229j(this.f21660j, colorStateList, hVar.f21717d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2264o(drawable, mode);
            return;
        }
        h hVar = this.f21659i;
        if (hVar.f21717d != mode) {
            hVar.f21717d = mode;
            this.f21660j = m23229j(this.f21660j, hVar.f21716c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
