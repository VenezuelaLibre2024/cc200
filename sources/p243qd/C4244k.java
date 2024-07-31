package p243qd;

import gd.C2245s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import p115hd.C2495i;
import td.C4753m;

/* renamed from: qd.k */
/* loaded from: classes2.dex */
public class C4244k extends C4243j {
    /* renamed from: a */
    public static final byte[] m16289a(File file) {
        C4753m.m18653f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int read = fileInputStream.read(bArr, i12, i11);
                if (read < 0) {
                    break;
                }
                i11 -= read;
                i12 += read;
            }
            if (i11 > 0) {
                bArr = Arrays.copyOf(bArr, i12);
                C4753m.m18652e(bArr, "copyOf(this, newSize)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C4238e c4238e = new C4238e(8193);
                    c4238e.write(read2);
                    C4235b.m16272b(fileInputStream, c4238e, 0, 2, null);
                    int size = c4238e.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] m16277a = c4238e.m16277a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    C4753m.m18652e(copyOf, "copyOf(this, newSize)");
                    bArr = C2495i.m9932c(m16277a, copyOf, i10, 0, c4238e.size());
                }
            }
            C4236c.m16274a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C4236c.m16274a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static final void m16290b(File file, byte[] bArr) {
        C4753m.m18653f(file, "<this>");
        C4753m.m18653f(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            C2245s c2245s = C2245s.f8873a;
            C4236c.m16274a(fileOutputStream, null);
        } finally {
        }
    }
}
