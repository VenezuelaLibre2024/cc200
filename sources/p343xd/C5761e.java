package p343xd;

import java.util.NoSuchElementException;
import p115hd.AbstractC2480a0;

/* renamed from: xd.e */
/* loaded from: classes2.dex */
public final class C5761e extends AbstractC2480a0 {

    /* renamed from: h */
    public final int f21337h;

    /* renamed from: i */
    public final int f21338i;

    /* renamed from: j */
    public boolean f21339j;

    /* renamed from: k */
    public int f21340k;

    public C5761e(int i10, int i11, int i12) {
        this.f21337h = i12;
        this.f21338i = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f21339j = z10;
        this.f21340k = z10 ? i10 : i11;
    }

    @Override // p115hd.AbstractC2480a0
    /* renamed from: a */
    public int mo9877a() {
        int i10 = this.f21340k;
        if (i10 != this.f21338i) {
            this.f21340k = this.f21337h + i10;
        } else {
            if (!this.f21339j) {
                throw new NoSuchElementException();
            }
            this.f21339j = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21339j;
    }
}
