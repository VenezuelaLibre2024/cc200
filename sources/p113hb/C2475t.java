package p113hb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import p129ia.C2679k;
import p129ia.C2684p;

/* renamed from: hb.t */
/* loaded from: classes.dex */
public class C2475t {

    /* renamed from: a */
    public C2471p f9899a;

    /* renamed from: b */
    public int f9900b;

    /* renamed from: c */
    public int f9901c;

    /* renamed from: d */
    public Rect f9902d;

    /* renamed from: e */
    public int f9903e = 1;

    /* renamed from: f */
    public boolean f9904f;

    public C2475t(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f9899a = new C2471p(bArr, i10, i11);
        this.f9901c = i13;
        this.f9900b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    /* renamed from: a */
    public C2679k m9867a() {
        C2471p m9852a = this.f9899a.m9856h(this.f9901c).m9852a(this.f9902d, this.f9903e);
        return new C2679k(m9852a.m9853b(), m9852a.m9855d(), m9852a.m9854c(), 0, 0, m9852a.m9855d(), m9852a.m9854c(), false);
    }

    /* renamed from: b */
    public Bitmap m9868b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f9899a.m9855d(), this.f9899a.m9854c());
        } else if (m9869c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f9899a.m9853b(), this.f9900b, this.f9899a.m9855d(), this.f9899a.m9854c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f9901c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f9901c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: c */
    public boolean m9869c() {
        return this.f9901c % 180 != 0;
    }

    /* renamed from: d */
    public void m9870d(Rect rect) {
        this.f9902d = rect;
    }

    /* renamed from: e */
    public void m9871e(boolean z10) {
        this.f9904f = z10;
    }

    /* renamed from: f */
    public C2684p m9872f(C2684p c2684p) {
        float m10908c = (c2684p.m10908c() * this.f9903e) + this.f9902d.left;
        float m10909d = (c2684p.m10909d() * this.f9903e) + this.f9902d.top;
        if (this.f9904f) {
            m10908c = this.f9899a.m9855d() - m10908c;
        }
        return new C2684p(m10908c, m10909d);
    }
}
