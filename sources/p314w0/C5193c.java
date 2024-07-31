package p314w0;

import java.nio.ByteBuffer;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public class C5193c {

    /* renamed from: a */
    public int f19712a;

    /* renamed from: b */
    public ByteBuffer f19713b;

    /* renamed from: c */
    public int f19714c;

    /* renamed from: d */
    public int f19715d;

    /* renamed from: e */
    public AbstractC5194d f19716e = AbstractC5194d.m21032a();

    /* renamed from: a */
    public int m21027a(int i10) {
        return i10 + this.f19713b.getInt(i10);
    }

    /* renamed from: b */
    public int m21028b(int i10) {
        if (i10 < this.f19715d) {
            return this.f19713b.getShort(this.f19714c + i10);
        }
        return 0;
    }

    /* renamed from: c */
    public void m21029c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f19713b = byteBuffer;
        if (byteBuffer != null) {
            this.f19712a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f19714c = i11;
            s10 = this.f19713b.getShort(i11);
        } else {
            s10 = 0;
            this.f19712a = 0;
            this.f19714c = 0;
        }
        this.f19715d = s10;
    }

    /* renamed from: d */
    public int m21030d(int i10) {
        int i11 = i10 + this.f19712a;
        return i11 + this.f19713b.getInt(i11) + 4;
    }

    /* renamed from: e */
    public int m21031e(int i10) {
        int i11 = i10 + this.f19712a;
        return this.f19713b.getInt(i11 + this.f19713b.getInt(i11));
    }
}
