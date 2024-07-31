package p206o5;

import java.io.IOException;
import p222p5.C4014a;
import p290u4.C4870n;
import p290u4.C4876q;

/* renamed from: o5.d0 */
/* loaded from: classes.dex */
public interface InterfaceC3899d0 {

    /* renamed from: o5.d0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f13985a;

        /* renamed from: b */
        public final int f13986b;

        /* renamed from: c */
        public final int f13987c;

        /* renamed from: d */
        public final int f13988d;

        public a(int i10, int i11, int i12, int i13) {
            this.f13985a = i10;
            this.f13986b = i11;
            this.f13987c = i12;
            this.f13988d = i13;
        }

        /* renamed from: a */
        public boolean m14779a(int i10) {
            if (i10 == 1) {
                if (this.f13985a - this.f13986b <= 1) {
                    return false;
                }
            } else if (this.f13987c - this.f13988d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o5.d0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f13989a;

        /* renamed from: b */
        public final long f13990b;

        public b(int i10, long j10) {
            C4014a.m15195a(j10 >= 0);
            this.f13989a = i10;
            this.f13990b = j10;
        }
    }

    /* renamed from: o5.d0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final C4870n f13991a;

        /* renamed from: b */
        public final C4876q f13992b;

        /* renamed from: c */
        public final IOException f13993c;

        /* renamed from: d */
        public final int f13994d;

        public c(C4870n c4870n, C4876q c4876q, IOException iOException, int i10) {
            this.f13991a = c4870n;
            this.f13992b = c4876q;
            this.f13993c = iOException;
            this.f13994d = i10;
        }
    }

    /* renamed from: a */
    long mo14775a(c cVar);

    /* renamed from: b */
    default void m14776b(long j10) {
    }

    /* renamed from: c */
    b mo14777c(a aVar, c cVar);

    /* renamed from: d */
    int mo14778d(int i10);
}
