package p280t8;

import java.io.OutputStream;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public final class C4725b extends OutputStream {

    /* renamed from: h */
    public long f17646h = 0;

    /* renamed from: a */
    public long m18570a() {
        return this.f17646h;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f17646h++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f17646h += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f17646h += i11;
    }
}
