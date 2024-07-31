package p343xd;

import java.util.NoSuchElementException;
import p115hd.AbstractC2500l;
import td.C4753m;

/* renamed from: xd.b */
/* loaded from: classes2.dex */
public final class C5758b extends AbstractC2500l {

    /* renamed from: h */
    public final int f21327h;

    /* renamed from: i */
    public final int f21328i;

    /* renamed from: j */
    public boolean f21329j;

    /* renamed from: k */
    public int f21330k;

    public C5758b(char c10, char c11, int i10) {
        this.f21327h = i10;
        this.f21328i = c11;
        boolean z10 = true;
        if (i10 <= 0 ? C4753m.m18655h(c10, c11) < 0 : C4753m.m18655h(c10, c11) > 0) {
            z10 = false;
        }
        this.f21329j = z10;
        this.f21330k = z10 ? c10 : c11;
    }

    @Override // p115hd.AbstractC2500l
    /* renamed from: a */
    public char mo9984a() {
        int i10 = this.f21330k;
        if (i10 != this.f21328i) {
            this.f21330k = this.f21327h + i10;
        } else {
            if (!this.f21329j) {
                throw new NoSuchElementException();
            }
            this.f21329j = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21329j;
    }
}
