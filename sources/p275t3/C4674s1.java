package p275t3;

import android.media.metrics.LogSessionId;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: t3.s1 */
/* loaded from: classes.dex */
public final class C4674s1 {

    /* renamed from: b */
    public static final C4674s1 f17484b;

    /* renamed from: a */
    public final a f17485a;

    /* renamed from: t3.s1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        public static final a f17486b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a */
        public final LogSessionId f17487a;

        public a(LogSessionId logSessionId) {
            this.f17487a = logSessionId;
        }
    }

    static {
        f17484b = C4041n0.f14513a < 31 ? new C4674s1() : new C4674s1(a.f17486b);
    }

    public C4674s1() {
        this((a) null);
        C4014a.m15200f(C4041n0.f14513a < 31);
    }

    public C4674s1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public C4674s1(a aVar) {
        this.f17485a = aVar;
    }

    /* renamed from: a */
    public LogSessionId m18497a() {
        return ((a) C4014a.m15199e(this.f17485a)).f17487a;
    }
}
