package tc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import bf.C0566l;
import bf.InterfaceC0559e;
import bf.InterfaceC0573s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p242qc.C4225a;
import p258rc.InterfaceC4341b;
import p297uc.C5003a;
import re.C4349b0;
import re.C4353d0;
import re.C4377y;
import sc.C4567c;

/* renamed from: tc.b */
/* loaded from: classes2.dex */
public class AsyncTaskC4739b extends AsyncTask<Void, Void, a> {

    /* renamed from: a */
    public final WeakReference<Context> f17705a;

    /* renamed from: b */
    public Uri f17706b;

    /* renamed from: c */
    public Uri f17707c;

    /* renamed from: d */
    public final int f17708d;

    /* renamed from: e */
    public final int f17709e;

    /* renamed from: f */
    public final InterfaceC4341b f17710f;

    /* renamed from: tc.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public Bitmap f17711a;

        /* renamed from: b */
        public C4567c f17712b;

        /* renamed from: c */
        public Exception f17713c;

        public a(Bitmap bitmap, C4567c c4567c) {
            this.f17711a = bitmap;
            this.f17712b = c4567c;
        }

        public a(Exception exc) {
            this.f17713c = exc;
        }
    }

    public AsyncTaskC4739b(Context context, Uri uri, Uri uri2, int i10, int i11, InterfaceC4341b interfaceC4341b) {
        this.f17705a = new WeakReference<>(context);
        this.f17706b = uri;
        this.f17707c = uri2;
        this.f17708d = i10;
        this.f17709e = i11;
        this.f17710f = interfaceC4341b;
    }

    /* renamed from: a */
    public final boolean m18626a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = this.f17705a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f17706b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m18630e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C5003a.m19603a(options, this.f17708d, this.f17709e);
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z10) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.f17706b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        C5003a.m19605c(openInputStream);
                    }
                } catch (IOException e10) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e10);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f17706b + "]", e10));
                } catch (OutOfMemoryError e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e11);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f17706b + "]"));
                }
                C5003a.m19605c(openInputStream);
                if (!m18626a(bitmap, options)) {
                    z10 = true;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f17706b + "]"));
            }
            int m19609g = C5003a.m19609g(context, this.f17706b);
            int m19607e = C5003a.m19607e(m19609g);
            int m19608f = C5003a.m19608f(m19609g);
            C4567c c4567c = new C4567c(m19609g, m19607e, m19608f);
            Matrix matrix = new Matrix();
            if (m19607e != 0) {
                matrix.preRotate(m19607e);
            }
            if (m19608f != 1) {
                matrix.postScale(m19608f, 1.0f);
            }
            return !matrix.isIdentity() ? new a(C5003a.m19611i(bitmap, matrix), c4567c) : new a(bitmap, c4567c);
        } catch (IOException | NullPointerException e12) {
            return new a(e12);
        }
    }

    /* renamed from: c */
    public final void m18628c(Uri uri, Uri uri2) {
        Closeable closeable;
        C4353d0 c4353d0;
        C4353d0 mo16648d;
        InterfaceC0559e mo16734n;
        Log.d("BitmapWorkerTask", "downloadFile");
        Objects.requireNonNull(uri2, "Output Uri is null - cannot download image");
        Context context = this.f17705a.get();
        Objects.requireNonNull(context, "Context is null");
        C4377y m16270a = C4225a.f15212b.m16270a();
        InterfaceC0559e interfaceC0559e = null;
        try {
            mo16648d = m16270a.m16917t(new C4349b0.a().m16673g(uri.toString()).m16667a()).mo16648d();
            try {
                mo16734n = mo16648d.m16703a().mo16734n();
            } catch (Throwable th) {
                th = th;
                c4353d0 = mo16648d;
                closeable = null;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            c4353d0 = null;
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
            if (openOutputStream == null) {
                throw new NullPointerException("OutputStream for given output Uri is null");
            }
            InterfaceC0573s m2896d = C0566l.m2896d(openOutputStream);
            mo16734n.mo2811H(m2896d);
            C5003a.m19605c(mo16734n);
            C5003a.m19605c(m2896d);
            C5003a.m19605c(mo16648d.m16703a());
            m16270a.m16908k().m16783a();
            this.f17706b = this.f17707c;
        } catch (Throwable th3) {
            th = th3;
            c4353d0 = mo16648d;
            closeable = null;
            interfaceC0559e = mo16734n;
            C5003a.m19605c(interfaceC0559e);
            C5003a.m19605c(closeable);
            if (c4353d0 != null) {
                C5003a.m19605c(c4353d0.m16703a());
            }
            m16270a.m16908k().m16783a();
            this.f17706b = this.f17707c;
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.f17713c;
        if (exc == null) {
            this.f17710f.mo16629a(aVar.f17711a, aVar.f17712b, this.f17706b, this.f17707c);
        } else {
            this.f17710f.onFailure(exc);
        }
    }

    /* renamed from: e */
    public final void m18630e() {
        String scheme = this.f17706b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                m18628c(this.f17706b, this.f17707c);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (Constants.FILE.equals(scheme) || "content".equals(scheme)) {
            return;
        }
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }
}
