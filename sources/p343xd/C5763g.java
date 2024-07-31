package p343xd;

import p115hd.AbstractC2482b0;
import p199nd.C3816c;
import td.C4747g;

/* renamed from: xd.g */
/* loaded from: classes2.dex */
public class C5763g implements Iterable<Long> {

    /* renamed from: k */
    public static final a f21343k = new a(null);

    /* renamed from: h */
    public final long f21344h;

    /* renamed from: i */
    public final long f21345i;

    /* renamed from: j */
    public final long f21346j;

    /* renamed from: xd.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C5763g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f21344h = j10;
        this.f21345i = C3816c.m14518d(j10, j11, j12);
        this.f21346j = j12;
    }

    /* renamed from: a */
    public final long m22900a() {
        return this.f21344h;
    }

    /* renamed from: b */
    public final long m22901b() {
        return this.f21345i;
    }

    @Override // java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2482b0 iterator() {
        return new C5764h(this.f21344h, this.f21345i, this.f21346j);
    }
}
