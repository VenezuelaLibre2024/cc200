package p264s3;

import java.io.IOException;

/* renamed from: s3.t2 */
/* loaded from: classes.dex */
public class C4499t2 extends IOException {

    /* renamed from: h */
    public final boolean f16699h;

    /* renamed from: i */
    public final int f16700i;

    public C4499t2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f16699h = z10;
        this.f16700i = i10;
    }

    /* renamed from: a */
    public static C4499t2 m17594a(String str, Throwable th) {
        return new C4499t2(str, th, true, 1);
    }

    /* renamed from: b */
    public static C4499t2 m17595b(String str, Throwable th) {
        return new C4499t2(str, th, true, 0);
    }

    /* renamed from: c */
    public static C4499t2 m17596c(String str, Throwable th) {
        return new C4499t2(str, th, true, 4);
    }

    /* renamed from: d */
    public static C4499t2 m17597d(String str) {
        return new C4499t2(str, null, false, 1);
    }
}
