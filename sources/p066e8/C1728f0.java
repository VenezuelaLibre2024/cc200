package p066e8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: e8.f0 */
/* loaded from: classes.dex */
public class C1728f0 {
    /* renamed from: a */
    public static void m6798a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        C1733i.m6819g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C1733i.m6819g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public static void m6799b(File file, List<InterfaceC1726e0> list) {
        for (InterfaceC1726e0 interfaceC1726e0 : list) {
            InputStream inputStream = null;
            try {
                inputStream = interfaceC1726e0.mo6763g();
                if (inputStream != null) {
                    m6798a(inputStream, new File(file, interfaceC1726e0.mo6764h()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1733i.m6819g(null);
                throw th;
            }
            C1733i.m6819g(inputStream);
        }
    }
}
