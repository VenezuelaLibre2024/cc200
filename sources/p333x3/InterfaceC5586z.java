package p333x3;

import p222p5.C4014a;

/* renamed from: x3.z */
/* loaded from: classes.dex */
public interface InterfaceC5586z {

    /* renamed from: x3.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C5557a0 f20963a;

        /* renamed from: b */
        public final C5557a0 f20964b;

        public a(C5557a0 c5557a0) {
            this(c5557a0, c5557a0);
        }

        public a(C5557a0 c5557a0, C5557a0 c5557a02) {
            this.f20963a = (C5557a0) C4014a.m15199e(c5557a0);
            this.f20964b = (C5557a0) C4014a.m15199e(c5557a02);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20963a.equals(aVar.f20963a) && this.f20964b.equals(aVar.f20964b);
        }

        public int hashCode() {
            return (this.f20963a.hashCode() * 31) + this.f20964b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f20963a);
            if (this.f20963a.equals(this.f20964b)) {
                str = "";
            } else {
                str = ", " + this.f20964b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* renamed from: x3.z$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC5586z {

        /* renamed from: a */
        public final long f20965a;

        /* renamed from: b */
        public final a f20966b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f20965a = j10;
            this.f20966b = new a(j11 == 0 ? C5557a0.f20850c : new C5557a0(0L, j11));
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: d */
        public long mo3035d() {
            return this.f20965a;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: f */
        public boolean mo3036f() {
            return false;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: i */
        public a mo3037i(long j10) {
            return this.f20966b;
        }
    }

    /* renamed from: d */
    long mo3035d();

    /* renamed from: f */
    boolean mo3036f();

    /* renamed from: i */
    a mo3037i(long j10);
}
