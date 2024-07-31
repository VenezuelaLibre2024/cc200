package p264s3;

/* renamed from: s3.k1 */
/* loaded from: classes.dex */
public final class C4453k1 extends RuntimeException {

    /* renamed from: h */
    public final int f16421h;

    public C4453k1(int i10) {
        super(m17388a(i10));
        this.f16421h = i10;
    }

    /* renamed from: a */
    public static String m17388a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
