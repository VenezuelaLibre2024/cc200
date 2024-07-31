package p240q9;

import android.util.Log;
import java.io.InputStream;

/* renamed from: q9.b */
/* loaded from: classes.dex */
public class C4211b {

    /* renamed from: f */
    public static final Runtime f15175f = Runtime.getRuntime();

    /* renamed from: a */
    public final InputStream f15176a;

    /* renamed from: b */
    public byte[] f15177b;

    /* renamed from: c */
    public int f15178c = 0;

    /* renamed from: e */
    public boolean f15180e = true;

    /* renamed from: d */
    public boolean f15179d = false;

    public C4211b(InputStream inputStream, int i10) {
        this.f15176a = inputStream;
        this.f15177b = new byte[i10];
    }

    /* renamed from: a */
    public int m16218a(int i10) {
        int i11 = this.f15178c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f15178c = i13;
            byte[] bArr = this.f15177b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f15178c = 0;
        while (i12 < i10) {
            int skip = (int) this.f15176a.skip(i10 - i12);
            if (skip > 0) {
                i12 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (this.f15176a.read() == -1) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    /* renamed from: b */
    public int m16219b() {
        return this.f15178c;
    }

    /* renamed from: c */
    public void m16220c() {
        this.f15176a.close();
    }

    /* renamed from: d */
    public int m16221d(int i10) {
        if (i10 > this.f15177b.length) {
            i10 = Math.min(i10, m16224g(i10));
        }
        while (true) {
            int i11 = this.f15178c;
            if (i11 >= i10) {
                break;
            }
            int read = this.f15176a.read(this.f15177b, i11, i10 - i11);
            if (read == -1) {
                this.f15179d = true;
                break;
            }
            this.f15178c += read;
        }
        return this.f15178c;
    }

    /* renamed from: e */
    public byte[] m16222e() {
        return this.f15177b;
    }

    /* renamed from: f */
    public boolean m16223f() {
        return this.f15179d;
    }

    /* renamed from: g */
    public final int m16224g(int i10) {
        int max = Math.max(this.f15177b.length * 2, i10);
        Runtime runtime = f15175f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f15180e || max >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f15177b, 0, bArr, 0, this.f15178c);
                this.f15177b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f15180e = false;
            }
        }
        return this.f15177b.length;
    }
}
