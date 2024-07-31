package p034c7;

/* renamed from: c7.s6 */
/* loaded from: classes.dex */
public final class RunnableC0879s6 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ String f3561h;

    /* renamed from: i */
    public final /* synthetic */ String f3562i;

    /* renamed from: j */
    public final /* synthetic */ String f3563j;

    /* renamed from: k */
    public final /* synthetic */ long f3564k;

    /* renamed from: l */
    public final /* synthetic */ BinderC0823o6 f3565l;

    public RunnableC0879s6(BinderC0823o6 binderC0823o6, String str, String str2, String str3, long j10) {
        this.f3561h = str;
        this.f3562i = str2;
        this.f3563j = str3;
        this.f3564k = j10;
        this.f3565l = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        String str = this.f3561h;
        if (str == null) {
            c0968yb2 = this.f3565l.f3394a;
            c0968yb2.m4115x(this.f3562i, null);
        } else {
            C0854q9 c0854q9 = new C0854q9(this.f3563j, str, this.f3564k);
            c0968yb = this.f3565l.f3394a;
            c0968yb.m4115x(this.f3562i, c0854q9);
        }
    }
}
