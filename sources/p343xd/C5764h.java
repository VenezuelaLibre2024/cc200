package p343xd;

import java.util.NoSuchElementException;
import p115hd.AbstractC2482b0;

/* renamed from: xd.h */
/* loaded from: classes2.dex */
public final class C5764h extends AbstractC2482b0 {

    /* renamed from: h */
    public final long f21347h;

    /* renamed from: i */
    public final long f21348i;

    /* renamed from: j */
    public boolean f21349j;

    /* renamed from: k */
    public long f21350k;

    public C5764h(long j10, long j11, long j12) {
        this.f21347h = j12;
        this.f21348i = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f21349j = z10;
        this.f21350k = z10 ? j10 : j11;
    }

    @Override // p115hd.AbstractC2482b0
    /* renamed from: a */
    public long mo9882a() {
        long j10 = this.f21350k;
        if (j10 != this.f21348i) {
            this.f21350k = this.f21347h + j10;
        } else {
            if (!this.f21349j) {
                throw new NoSuchElementException();
            }
            this.f21349j = false;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21349j;
    }
}
