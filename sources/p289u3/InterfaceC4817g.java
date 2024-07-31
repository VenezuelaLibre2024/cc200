package p289u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p109h7.C2428k;
import p222p5.C4041n0;

/* renamed from: u3.g */
/* loaded from: classes.dex */
public interface InterfaceC4817g {

    /* renamed from: a */
    public static final ByteBuffer f18051a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: u3.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        public static final a f18052e = new a(-1, -1, -1);

        /* renamed from: a */
        public final int f18053a;

        /* renamed from: b */
        public final int f18054b;

        /* renamed from: c */
        public final int f18055c;

        /* renamed from: d */
        public final int f18056d;

        public a(int i10, int i11, int i12) {
            this.f18053a = i10;
            this.f18054b = i11;
            this.f18055c = i12;
            this.f18056d = C4041n0.m15484t0(i12) ? C4041n0.m15452d0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18053a == aVar.f18053a && this.f18054b == aVar.f18054b && this.f18055c == aVar.f18055c;
        }

        public int hashCode() {
            return C2428k.m9689b(Integer.valueOf(this.f18053a), Integer.valueOf(this.f18054b), Integer.valueOf(this.f18055c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f18053a + ", channelCount=" + this.f18054b + ", encoding=" + this.f18055c + ']';
        }
    }

    /* renamed from: u3.g$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    boolean mo19064a();

    /* renamed from: b */
    ByteBuffer mo19065b();

    /* renamed from: c */
    boolean mo19066c();

    /* renamed from: d */
    a mo19067d(a aVar);

    /* renamed from: e */
    void mo19009e(ByteBuffer byteBuffer);

    /* renamed from: f */
    void mo19068f();

    void flush();

    void reset();
}
