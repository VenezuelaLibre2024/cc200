package p343xd;

import p115hd.AbstractC2500l;
import p199nd.C3816c;
import td.C4747g;

/* renamed from: xd.a */
/* loaded from: classes2.dex */
public class C5757a implements Iterable<Character> {

    /* renamed from: k */
    public static final a f21323k = new a(null);

    /* renamed from: h */
    public final char f21324h;

    /* renamed from: i */
    public final char f21325i;

    /* renamed from: j */
    public final int f21326j;

    /* renamed from: xd.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C5757a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f21324h = c10;
        this.f21325i = (char) C3816c.m14517c(c10, c11, i10);
        this.f21326j = i10;
    }

    /* renamed from: a */
    public final char m22887a() {
        return this.f21324h;
    }

    /* renamed from: b */
    public final char m22888b() {
        return this.f21325i;
    }

    @Override // java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2500l iterator() {
        return new C5758b(this.f21324h, this.f21325i, this.f21326j);
    }
}
