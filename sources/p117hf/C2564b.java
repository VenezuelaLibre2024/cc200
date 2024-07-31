package p117hf;

import android.media.MediaDataSource;
import td.C4753m;

/* renamed from: hf.b */
/* loaded from: classes2.dex */
public final class C2564b extends MediaDataSource {

    /* renamed from: h */
    public final byte[] f10046h;

    public C2564b(byte[] bArr) {
        C4753m.m18653f(bArr, "data");
        this.f10046h = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public synchronized long getSize() {
        return this.f10046h.length;
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long j10, byte[] bArr, int i10, int i11) {
        C4753m.m18653f(bArr, "buffer");
        byte[] bArr2 = this.f10046h;
        if (j10 >= bArr2.length) {
            return -1;
        }
        if (i11 + j10 > bArr2.length) {
            i11 -= (((int) j10) + i11) - bArr2.length;
        }
        System.arraycopy(bArr2, (int) j10, bArr, i10, i11);
        return i11;
    }
}
