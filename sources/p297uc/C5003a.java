package p297uc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p258rc.InterfaceC4341b;
import tc.AsyncTaskC4739b;

/* renamed from: uc.a */
/* loaded from: classes2.dex */
public class C5003a {
    /* renamed from: a */
    public static int m19603a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            while (true) {
                if (i12 / i14 <= i11 && i13 / i14 <= i10) {
                    break;
                }
                i14 *= 2;
            }
        }
        return i14;
    }

    /* renamed from: b */
    public static int m19604b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int m19616c = C5005c.m19616c();
        if (m19616c > 0) {
            sqrt = Math.min(sqrt, m19616c);
        }
        Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
        return sqrt;
    }

    /* renamed from: c */
    public static void m19605c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m19606d(Context context, Uri uri, Uri uri2, int i10, int i11, InterfaceC4341b interfaceC4341b) {
        new AsyncTaskC4739b(context, uri, uri2, i10, i11, interfaceC4341b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: e */
    public static int m19607e(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: f */
    public static int m19608f(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    /* renamed from: g */
    public static int m19609g(Context context, Uri uri) {
        int i10 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i10 = new C5008f(openInputStream).m19628g();
            m19605c(openInputStream);
            return i10;
        } catch (IOException e10) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e10);
            return i10;
        }
    }

    /* renamed from: h */
    public static boolean m19610h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    /* renamed from: i */
    public static Bitmap m19611i(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError e10) {
            Log.e("BitmapLoadUtils", "transformBitmap: ", e10);
            return bitmap;
        }
    }
}
