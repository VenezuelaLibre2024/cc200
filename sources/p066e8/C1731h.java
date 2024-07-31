package p066e8;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e8.h */
/* loaded from: classes.dex */
public class C1731h {

    /* renamed from: a */
    public static final AtomicLong f6347a = new AtomicLong(0);

    /* renamed from: b */
    public static String f6348b;

    public C1731h(C1720b0 c1720b0) {
        byte[] bArr = new byte[10];
        m6811e(bArr);
        m6810d(bArr);
        m6809c(bArr);
        String m6838z = C1733i.m6838z(c1720b0.mo6772a().mo6783c());
        String m6832t = C1733i.m6832t(bArr);
        Locale locale = Locale.US;
        f6348b = String.format(locale, "%s%s%s%s", m6832t.substring(0, 12), m6832t.substring(12, 16), m6832t.subSequence(16, 20), m6838z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m6807a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m6808b(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void m6809c(byte[] bArr) {
        byte[] m6808b = m6808b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m6808b[0];
        bArr[9] = m6808b[1];
    }

    /* renamed from: d */
    public final void m6810d(byte[] bArr) {
        byte[] m6808b = m6808b(f6347a.incrementAndGet());
        bArr[6] = m6808b[0];
        bArr[7] = m6808b[1];
    }

    /* renamed from: e */
    public final void m6811e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m6807a = m6807a(time / 1000);
        bArr[0] = m6807a[0];
        bArr[1] = m6807a[1];
        bArr[2] = m6807a[2];
        bArr[3] = m6807a[3];
        byte[] m6808b = m6808b(time % 1000);
        bArr[4] = m6808b[0];
        bArr[5] = m6808b[1];
    }

    public String toString() {
        return f6348b;
    }
}
