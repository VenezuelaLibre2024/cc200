package p099g9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p108h6.C2394s;

/* renamed from: g9.f0 */
/* loaded from: classes.dex */
public class C2173f0 implements Closeable {

    /* renamed from: h */
    public final URL f8688h;

    /* renamed from: i */
    public volatile Future<?> f8689i;

    /* renamed from: j */
    public Task<Bitmap> f8690j;

    public C2173f0(URL url) {
        this.f8688h = url;
    }

    /* renamed from: j */
    public static C2173f0 m8755j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2173f0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m8756n(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m8757d());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8689i.cancel(true);
    }

    /* renamed from: d */
    public Bitmap m8757d() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f8688h);
        }
        byte[] m8758f = m8758f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m8758f, 0, m8758f.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f8688h);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f8688h);
        }
        return decodeByteArray;
    }

    /* renamed from: f */
    public final byte[] m8758f() {
        URLConnection openConnection = this.f8688h.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] m8702d = C2160b.m8702d(C2160b.m8700b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + m8702d.length + " bytes from " + this.f8688h);
            }
            if (m8702d.length <= 1048576) {
                return m8702d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: l */
    public Task<Bitmap> m8759l() {
        return (Task) C2394s.m9619l(this.f8690j);
    }

    /* renamed from: w */
    public void m8760w(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f8689i = executorService.submit(new Runnable() { // from class: g9.e0
            @Override // java.lang.Runnable
            public final void run() {
                C2173f0.this.m8756n(taskCompletionSource);
            }
        });
        this.f8690j = taskCompletionSource.getTask();
    }
}
