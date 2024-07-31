package p243qd;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import td.C4753m;

/* renamed from: qd.b */
/* loaded from: classes2.dex */
public final class C4235b {
    /* renamed from: a */
    public static final long m16271a(InputStream inputStream, OutputStream outputStream, int i10) {
        C4753m.m18653f(inputStream, "<this>");
        C4753m.m18653f(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    /* renamed from: b */
    public static /* synthetic */ long m16272b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m16271a(inputStream, outputStream, i10);
    }

    /* renamed from: c */
    public static final byte[] m16273c(InputStream inputStream) {
        C4753m.m18653f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m16272b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C4753m.m18652e(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
