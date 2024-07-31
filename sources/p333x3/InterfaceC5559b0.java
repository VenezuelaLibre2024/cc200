package p333x3;

import java.util.Arrays;
import p206o5.InterfaceC3906h;
import p222p5.C4015a0;
import p264s3.C4463m1;

/* renamed from: x3.b0 */
/* loaded from: classes.dex */
public interface InterfaceC5559b0 {

    /* renamed from: x3.b0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f20853a;

        /* renamed from: b */
        public final byte[] f20854b;

        /* renamed from: c */
        public final int f20855c;

        /* renamed from: d */
        public final int f20856d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f20853a = i10;
            this.f20854b = bArr;
            this.f20855c = i11;
            this.f20856d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20853a == aVar.f20853a && this.f20855c == aVar.f20855c && this.f20856d == aVar.f20856d && Arrays.equals(this.f20854b, aVar.f20854b);
        }

        public int hashCode() {
            return (((((this.f20853a * 31) + Arrays.hashCode(this.f20854b)) * 31) + this.f20855c) * 31) + this.f20856d;
        }
    }

    /* renamed from: a */
    void mo4851a(long j10, int i10, int i11, int i12, a aVar);

    /* renamed from: b */
    void mo4852b(C4463m1 c4463m1);

    /* renamed from: c */
    default int m22407c(InterfaceC3906h interfaceC3906h, int i10, boolean z10) {
        return mo4854f(interfaceC3906h, i10, z10, 0);
    }

    /* renamed from: d */
    void mo4853d(C4015a0 c4015a0, int i10, int i11);

    /* renamed from: e */
    default void m22408e(C4015a0 c4015a0, int i10) {
        mo4853d(c4015a0, i10, 0);
    }

    /* renamed from: f */
    int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11);
}
