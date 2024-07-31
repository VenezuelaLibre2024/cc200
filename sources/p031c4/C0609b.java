package p031c4;

import java.util.List;
import p235q4.C4164b;

/* renamed from: c4.b */
/* loaded from: classes.dex */
public final class C0609b {

    /* renamed from: a */
    public final long f2662a;

    /* renamed from: b */
    public final List<a> f2663b;

    /* renamed from: c4.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f2664a;

        /* renamed from: b */
        public final String f2665b;

        /* renamed from: c */
        public final long f2666c;

        /* renamed from: d */
        public final long f2667d;

        public a(String str, String str2, long j10, long j11) {
            this.f2664a = str;
            this.f2665b = str2;
            this.f2666c = j10;
            this.f2667d = j11;
        }
    }

    public C0609b(long j10, List<a> list) {
        this.f2662a = j10;
        this.f2663b = list;
    }

    /* renamed from: a */
    public C4164b m3028a(long j10) {
        long j11;
        if (this.f2663b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f2663b.size() - 1; size >= 0; size--) {
            a aVar = this.f2663b.get(size);
            boolean equals = "video/mp4".equals(aVar.f2664a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f2667d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f2666c;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new C4164b(j13, j14, this.f2662a, j15, j16);
    }
}
