package p236q5;

import android.os.Bundle;
import java.util.Arrays;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: q5.c */
/* loaded from: classes.dex */
public final class C4170c implements InterfaceC4436h {

    /* renamed from: m */
    public static final C4170c f14984m = new C4170c(1, 2, 3, null);

    /* renamed from: n */
    public static final String f14985n = C4041n0.m15478q0(0);

    /* renamed from: o */
    public static final String f14986o = C4041n0.m15478q0(1);

    /* renamed from: p */
    public static final String f14987p = C4041n0.m15478q0(2);

    /* renamed from: q */
    public static final String f14988q = C4041n0.m15478q0(3);

    /* renamed from: r */
    public static final InterfaceC4436h.a<C4170c> f14989r = new InterfaceC4436h.a() { // from class: q5.b
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4170c m16031d;
            m16031d = C4170c.m16031d(bundle);
            return m16031d;
        }
    };

    /* renamed from: h */
    public final int f14990h;

    /* renamed from: i */
    public final int f14991i;

    /* renamed from: j */
    public final int f14992j;

    /* renamed from: k */
    public final byte[] f14993k;

    /* renamed from: l */
    public int f14994l;

    public C4170c(int i10, int i11, int i12, byte[] bArr) {
        this.f14990h = i10;
        this.f14991i = i11;
        this.f14992j = i12;
        this.f14993k = bArr;
    }

    /* renamed from: b */
    public static int m16029b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: c */
    public static int m16030c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: d */
    public static /* synthetic */ C4170c m16031d(Bundle bundle) {
        return new C4170c(bundle.getInt(f14985n, -1), bundle.getInt(f14986o, -1), bundle.getInt(f14987p, -1), bundle.getByteArray(f14988q));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4170c.class != obj.getClass()) {
            return false;
        }
        C4170c c4170c = (C4170c) obj;
        return this.f14990h == c4170c.f14990h && this.f14991i == c4170c.f14991i && this.f14992j == c4170c.f14992j && Arrays.equals(this.f14993k, c4170c.f14993k);
    }

    public int hashCode() {
        if (this.f14994l == 0) {
            this.f14994l = ((((((527 + this.f14990h) * 31) + this.f14991i) * 31) + this.f14992j) * 31) + Arrays.hashCode(this.f14993k);
        }
        return this.f14994l;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f14990h);
        sb2.append(", ");
        sb2.append(this.f14991i);
        sb2.append(", ");
        sb2.append(this.f14992j);
        sb2.append(", ");
        sb2.append(this.f14993k != null);
        sb2.append(")");
        return sb2.toString();
    }
}
