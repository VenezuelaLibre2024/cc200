package p081f8;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f8.g */
/* loaded from: classes.dex */
public class C1878g implements Closeable {

    /* renamed from: n */
    public static final Logger f7087n = Logger.getLogger(C1878g.class.getName());

    /* renamed from: h */
    public final RandomAccessFile f7088h;

    /* renamed from: i */
    public int f7089i;

    /* renamed from: j */
    public int f7090j;

    /* renamed from: k */
    public b f7091k;

    /* renamed from: l */
    public b f7092l;

    /* renamed from: m */
    public final byte[] f7093m = new byte[16];

    /* renamed from: f8.g$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        public boolean f7094a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f7095b;

        public a(StringBuilder sb2) {
            this.f7095b = sb2;
        }

        @Override // p081f8.C1878g.d
        /* renamed from: a */
        public void mo7684a(InputStream inputStream, int i10) {
            if (this.f7094a) {
                this.f7094a = false;
            } else {
                this.f7095b.append(", ");
            }
            this.f7095b.append(i10);
        }
    }

    /* renamed from: f8.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        public static final b f7097c = new b(0, 0);

        /* renamed from: a */
        public final int f7098a;

        /* renamed from: b */
        public final int f7099b;

        public b(int i10, int i11) {
            this.f7098a = i10;
            this.f7099b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f7098a + ", length = " + this.f7099b + "]";
        }
    }

    /* renamed from: f8.g$c */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: h */
        public int f7100h;

        /* renamed from: i */
        public int f7101i;

        public c(b bVar) {
            this.f7100h = C1878g.this.m7680r0(bVar.f7098a + 4);
            this.f7101i = bVar.f7099b;
        }

        public /* synthetic */ c(C1878g c1878g, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f7101i == 0) {
                return -1;
            }
            C1878g.this.f7088h.seek(this.f7100h);
            int read = C1878g.this.f7088h.read();
            this.f7100h = C1878g.this.m7680r0(this.f7100h + 1);
            this.f7101i--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            C1878g.m7659P(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f7101i;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            C1878g.this.m7674h0(this.f7100h, bArr, i10, i11);
            this.f7100h = C1878g.this.m7680r0(this.f7100h + i11);
            this.f7101i -= i11;
            return i11;
        }
    }

    /* renamed from: f8.g$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo7684a(InputStream inputStream, int i10);
    }

    public C1878g(File file) {
        if (!file.exists()) {
            m7658I(file);
        }
        this.f7088h = m7660W(file);
        m7671c0();
    }

    /* renamed from: I */
    public static void m7658I(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m7660W = m7660W(file2);
        try {
            m7660W.setLength(4096L);
            m7660W.seek(0L);
            byte[] bArr = new byte[16];
            m7667v0(bArr, 4096, 0, 0, 0);
            m7660W.write(bArr);
            m7660W.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m7660W.close();
            throw th;
        }
    }

    /* renamed from: P */
    public static <T> T m7659P(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: W */
    public static RandomAccessFile m7660W(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: e0 */
    public static int m7663e0(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* renamed from: u0 */
    public static void m7666u0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* renamed from: v0 */
    public static void m7667v0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            m7666u0(bArr, i10, i11);
            i10 += 4;
        }
    }

    /* renamed from: E */
    public synchronized void m7668E(d dVar) {
        int i10 = this.f7091k.f7098a;
        for (int i11 = 0; i11 < this.f7090j; i11++) {
            b m7670b0 = m7670b0(i10);
            dVar.mo7684a(new c(this, m7670b0, null), m7670b0.f7099b);
            i10 = m7680r0(m7670b0.f7098a + 4 + m7670b0.f7099b);
        }
    }

    /* renamed from: K */
    public synchronized boolean m7669K() {
        return this.f7090j == 0;
    }

    /* renamed from: b0 */
    public final b m7670b0(int i10) {
        if (i10 == 0) {
            return b.f7097c;
        }
        this.f7088h.seek(i10);
        return new b(i10, this.f7088h.readInt());
    }

    /* renamed from: c0 */
    public final void m7671c0() {
        this.f7088h.seek(0L);
        this.f7088h.readFully(this.f7093m);
        int m7663e0 = m7663e0(this.f7093m, 0);
        this.f7089i = m7663e0;
        if (m7663e0 <= this.f7088h.length()) {
            this.f7090j = m7663e0(this.f7093m, 4);
            int m7663e02 = m7663e0(this.f7093m, 8);
            int m7663e03 = m7663e0(this.f7093m, 12);
            this.f7091k = m7670b0(m7663e02);
            this.f7092l = m7670b0(m7663e03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f7089i + ", Actual length: " + this.f7088h.length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7088h.close();
    }

    /* renamed from: f0 */
    public final int m7672f0() {
        return this.f7089i - m7679n0();
    }

    /* renamed from: g0 */
    public synchronized void m7673g0() {
        if (m7669K()) {
            throw new NoSuchElementException();
        }
        if (this.f7090j == 1) {
            m7682w();
        } else {
            b bVar = this.f7091k;
            int m7680r0 = m7680r0(bVar.f7098a + 4 + bVar.f7099b);
            m7674h0(m7680r0, this.f7093m, 0, 4);
            int m7663e0 = m7663e0(this.f7093m, 0);
            m7681s0(this.f7089i, this.f7090j - 1, m7680r0, this.f7092l.f7098a);
            this.f7090j--;
            this.f7091k = new b(m7680r0, m7663e0);
        }
    }

    /* renamed from: h0 */
    public final void m7674h0(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int m7680r0 = m7680r0(i10);
        int i13 = m7680r0 + i12;
        int i14 = this.f7089i;
        if (i13 <= i14) {
            this.f7088h.seek(m7680r0);
            randomAccessFile = this.f7088h;
        } else {
            int i15 = i14 - m7680r0;
            this.f7088h.seek(m7680r0);
            this.f7088h.readFully(bArr, i11, i15);
            this.f7088h.seek(16L);
            randomAccessFile = this.f7088h;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    /* renamed from: i0 */
    public final void m7675i0(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int m7680r0 = m7680r0(i10);
        int i13 = m7680r0 + i12;
        int i14 = this.f7089i;
        if (i13 <= i14) {
            this.f7088h.seek(m7680r0);
            randomAccessFile = this.f7088h;
        } else {
            int i15 = i14 - m7680r0;
            this.f7088h.seek(m7680r0);
            this.f7088h.write(bArr, i11, i15);
            this.f7088h.seek(16L);
            randomAccessFile = this.f7088h;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    /* renamed from: l */
    public void m7676l(byte[] bArr) {
        m7678n(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public final void m7677l0(int i10) {
        this.f7088h.setLength(i10);
        this.f7088h.getChannel().force(true);
    }

    /* renamed from: n */
    public synchronized void m7678n(byte[] bArr, int i10, int i11) {
        int m7680r0;
        m7659P(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        m7683x(i11);
        boolean m7669K = m7669K();
        if (m7669K) {
            m7680r0 = 16;
        } else {
            b bVar = this.f7092l;
            m7680r0 = m7680r0(bVar.f7098a + 4 + bVar.f7099b);
        }
        b bVar2 = new b(m7680r0, i11);
        m7666u0(this.f7093m, 0, i11);
        m7675i0(bVar2.f7098a, this.f7093m, 0, 4);
        m7675i0(bVar2.f7098a + 4, bArr, i10, i11);
        m7681s0(this.f7089i, this.f7090j + 1, m7669K ? bVar2.f7098a : this.f7091k.f7098a, bVar2.f7098a);
        this.f7092l = bVar2;
        this.f7090j++;
        if (m7669K) {
            this.f7091k = bVar2;
        }
    }

    /* renamed from: n0 */
    public int m7679n0() {
        if (this.f7090j == 0) {
            return 16;
        }
        b bVar = this.f7092l;
        int i10 = bVar.f7098a;
        int i11 = this.f7091k.f7098a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f7099b + 16 : (((i10 + 4) + bVar.f7099b) + this.f7089i) - i11;
    }

    /* renamed from: r0 */
    public final int m7680r0(int i10) {
        int i11 = this.f7089i;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* renamed from: s0 */
    public final void m7681s0(int i10, int i11, int i12, int i13) {
        m7667v0(this.f7093m, i10, i11, i12, i13);
        this.f7088h.seek(0L);
        this.f7088h.write(this.f7093m);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f7089i);
        sb2.append(", size=");
        sb2.append(this.f7090j);
        sb2.append(", first=");
        sb2.append(this.f7091k);
        sb2.append(", last=");
        sb2.append(this.f7092l);
        sb2.append(", element lengths=[");
        try {
            m7668E(new a(sb2));
        } catch (IOException e10) {
            f7087n.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* renamed from: w */
    public synchronized void m7682w() {
        m7681s0(4096, 0, 0, 0);
        this.f7090j = 0;
        b bVar = b.f7097c;
        this.f7091k = bVar;
        this.f7092l = bVar;
        if (this.f7089i > 4096) {
            m7677l0(4096);
        }
        this.f7089i = 4096;
    }

    /* renamed from: x */
    public final void m7683x(int i10) {
        int i11 = i10 + 4;
        int m7672f0 = m7672f0();
        if (m7672f0 >= i11) {
            return;
        }
        int i12 = this.f7089i;
        do {
            m7672f0 += i12;
            i12 <<= 1;
        } while (m7672f0 < i11);
        m7677l0(i12);
        b bVar = this.f7092l;
        int m7680r0 = m7680r0(bVar.f7098a + 4 + bVar.f7099b);
        if (m7680r0 < this.f7091k.f7098a) {
            FileChannel channel = this.f7088h.getChannel();
            channel.position(this.f7089i);
            long j10 = m7680r0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f7092l.f7098a;
        int i14 = this.f7091k.f7098a;
        if (i13 < i14) {
            int i15 = (this.f7089i + i13) - 16;
            m7681s0(i12, this.f7090j, i14, i15);
            this.f7092l = new b(i15, this.f7092l.f7099b);
        } else {
            m7681s0(i12, this.f7090j, i14, i13);
        }
        this.f7089i = i12;
    }
}
