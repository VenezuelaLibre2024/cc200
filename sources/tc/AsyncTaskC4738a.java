package tc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import p258rc.InterfaceC4340a;
import p297uc.C5003a;
import p297uc.C5007e;
import p297uc.C5008f;
import p346y0.C5787a;
import sc.C4566b;
import sc.C4567c;
import sc.C4568d;

/* renamed from: tc.a */
/* loaded from: classes2.dex */
public class AsyncTaskC4738a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    public final WeakReference<Context> f17685a;

    /* renamed from: b */
    public Bitmap f17686b;

    /* renamed from: c */
    public final RectF f17687c;

    /* renamed from: d */
    public final RectF f17688d;

    /* renamed from: e */
    public float f17689e;

    /* renamed from: f */
    public float f17690f;

    /* renamed from: g */
    public final int f17691g;

    /* renamed from: h */
    public final int f17692h;

    /* renamed from: i */
    public final Bitmap.CompressFormat f17693i;

    /* renamed from: j */
    public final int f17694j;

    /* renamed from: k */
    public final String f17695k;

    /* renamed from: l */
    public final String f17696l;

    /* renamed from: m */
    public final Uri f17697m;

    /* renamed from: n */
    public final Uri f17698n;

    /* renamed from: o */
    public final C4567c f17699o;

    /* renamed from: p */
    public final InterfaceC4340a f17700p;

    /* renamed from: q */
    public int f17701q;

    /* renamed from: r */
    public int f17702r;

    /* renamed from: s */
    public int f17703s;

    /* renamed from: t */
    public int f17704t;

    public AsyncTaskC4738a(Context context, Bitmap bitmap, C4568d c4568d, C4566b c4566b, InterfaceC4340a interfaceC4340a) {
        this.f17685a = new WeakReference<>(context);
        this.f17686b = bitmap;
        this.f17687c = c4568d.m18077a();
        this.f17688d = c4568d.m18079c();
        this.f17689e = c4568d.m18080d();
        this.f17690f = c4568d.m18078b();
        this.f17691g = c4566b.m18073h();
        this.f17692h = c4566b.m18074i();
        this.f17693i = c4566b.m18066a();
        this.f17694j = c4566b.m18067b();
        this.f17695k = c4566b.m18071f();
        this.f17696l = c4566b.m18072g();
        this.f17697m = c4566b.m18068c();
        this.f17698n = c4566b.m18069d();
        this.f17699o = c4566b.m18070e();
        this.f17700p = interfaceC4340a;
    }

    /* renamed from: a */
    public final void m18620a(Context context) {
        boolean m19610h = C5003a.m19610h(this.f17697m);
        boolean m19610h2 = C5003a.m19610h(this.f17698n);
        if (m19610h && m19610h2) {
            if (Build.VERSION.SDK_INT >= 21) {
                C5008f.m19621b(context, this.f17701q, this.f17702r, this.f17697m, this.f17698n);
                return;
            }
        } else if (m19610h) {
            C5008f.m19622c(context, this.f17701q, this.f17702r, this.f17697m, this.f17696l);
            return;
        } else if (!m19610h2) {
            C5008f.m19624e(new C5787a(this.f17695k), this.f17701q, this.f17702r, this.f17696l);
            return;
        } else if (Build.VERSION.SDK_INT >= 21) {
            C5008f.m19623d(context, new C5787a(this.f17695k), this.f17701q, this.f17702r, this.f17698n);
            return;
        }
        Log.e("BitmapCropTask", "It is not possible to write exif info into file represented by \"content\" Uri if Android < LOLLIPOP");
    }

    /* renamed from: b */
    public final boolean m18621b() {
        Context context = this.f17685a.get();
        if (context == null) {
            return false;
        }
        if (this.f17691g > 0 && this.f17692h > 0) {
            float width = this.f17687c.width() / this.f17689e;
            float height = this.f17687c.height() / this.f17689e;
            int i10 = this.f17691g;
            if (width > i10 || height > this.f17692h) {
                float min = Math.min(i10 / width, this.f17692h / height);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f17686b, Math.round(r3.getWidth() * min), Math.round(this.f17686b.getHeight() * min), false);
                Bitmap bitmap = this.f17686b;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.f17686b = createScaledBitmap;
                this.f17689e /= min;
            }
        }
        if (this.f17690f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f17690f, this.f17686b.getWidth() / 2, this.f17686b.getHeight() / 2);
            Bitmap bitmap2 = this.f17686b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f17686b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f17686b;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.f17686b = createBitmap;
        }
        this.f17703s = Math.round((this.f17687c.left - this.f17688d.left) / this.f17689e);
        this.f17704t = Math.round((this.f17687c.top - this.f17688d.top) / this.f17689e);
        this.f17701q = Math.round(this.f17687c.width() / this.f17689e);
        int round = Math.round(this.f17687c.height() / this.f17689e);
        this.f17702r = round;
        boolean m18625f = m18625f(this.f17701q, round);
        Log.i("BitmapCropTask", "Should crop: " + m18625f);
        if (!m18625f) {
            C5007e.m19619a(context, this.f17697m, this.f17698n);
            return false;
        }
        m18624e(Bitmap.createBitmap(this.f17686b, this.f17703s, this.f17704t, this.f17701q, this.f17702r));
        if (!this.f17693i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        m18620a(context);
        return true;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f17686b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f17688d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f17698n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            m18621b();
            this.f17686b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        InterfaceC4340a interfaceC4340a = this.f17700p;
        if (interfaceC4340a != null) {
            if (th != null) {
                interfaceC4340a.mo6043b(th);
            } else {
                this.f17700p.mo6042a(C5003a.m19610h(this.f17698n) ? this.f17698n : Uri.fromFile(new File(this.f17696l)), this.f17703s, this.f17704t, this.f17701q, this.f17702r);
            }
        }
    }

    /* renamed from: e */
    public final void m18624e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream openOutputStream;
        Context context = this.f17685a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            openOutputStream = context.getContentResolver().openOutputStream(this.f17698n);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                byteArrayOutputStream = null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            bitmap.compress(this.f17693i, this.f17694j, byteArrayOutputStream);
            openOutputStream.write(byteArrayOutputStream.toByteArray());
            bitmap.recycle();
            C5003a.m19605c(openOutputStream);
        } catch (IOException e12) {
            e = e12;
            outputStream = openOutputStream;
            try {
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                C5003a.m19605c(outputStream);
                C5003a.m19605c(byteArrayOutputStream);
            } catch (Throwable th3) {
                th = th3;
                C5003a.m19605c(outputStream);
                C5003a.m19605c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = openOutputStream;
            C5003a.m19605c(outputStream);
            C5003a.m19605c(byteArrayOutputStream);
            throw th;
        }
        C5003a.m19605c(byteArrayOutputStream);
    }

    /* renamed from: f */
    public final boolean m18625f(int i10, int i11) {
        int round = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f17691g > 0 && this.f17692h > 0) {
            return true;
        }
        float f10 = round;
        return Math.abs(this.f17687c.left - this.f17688d.left) > f10 || Math.abs(this.f17687c.top - this.f17688d.top) > f10 || Math.abs(this.f17687c.bottom - this.f17688d.bottom) > f10 || Math.abs(this.f17687c.right - this.f17688d.right) > f10 || this.f17690f != 0.0f;
    }
}
