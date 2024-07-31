package p099g9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p079f6.C1841a;

/* renamed from: g9.b */
/* loaded from: classes.dex */
public final class C2160b {

    /* renamed from: g9.b$a */
    /* loaded from: classes.dex */
    public static final class a extends FilterInputStream {

        /* renamed from: h */
        public long f8653h;

        /* renamed from: i */
        public long f8654i;

        public a(InputStream inputStream, long j10) {
            super(inputStream);
            this.f8654i = -1L;
            this.f8653h = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f8653h);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f8654i = this.f8653h;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f8653h == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f8653h--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f8653h;
            if (j10 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (read != -1) {
                this.f8653h -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f8654i == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f8653h = this.f8654i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f8653h));
            this.f8653h -= skip;
            return skip;
        }
    }

    /* renamed from: a */
    public static byte[] m8699a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i10) {
            return remove;
        }
        int length = i10 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i10);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m8700b(InputStream inputStream, long j10) {
        return new a(inputStream, j10);
    }

    /* renamed from: c */
    public static int m8701c(long j10) {
        if (j10 > 2147483647L) {
            return C1841a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: d */
    public static byte[] m8702d(InputStream inputStream) {
        return m8703e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m8703e(InputStream inputStream, Queue<byte[]> queue, int i10) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return m8699a(queue, i10);
                }
                i11 += read;
                i10 += read;
            }
            min = m8701c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return m8699a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
