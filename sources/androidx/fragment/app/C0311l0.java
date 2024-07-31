package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.l0 */
/* loaded from: classes.dex */
public final class C0311l0 extends Writer {

    /* renamed from: h */
    public final String f1530h;

    /* renamed from: i */
    public StringBuilder f1531i = new StringBuilder(128);

    public C0311l0(String str) {
        this.f1530h = str;
    }

    /* renamed from: a */
    public final void m1542a() {
        if (this.f1531i.length() > 0) {
            Log.d(this.f1530h, this.f1531i.toString());
            StringBuilder sb2 = this.f1531i;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1542a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m1542a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m1542a();
            } else {
                this.f1531i.append(c10);
            }
        }
    }
}
