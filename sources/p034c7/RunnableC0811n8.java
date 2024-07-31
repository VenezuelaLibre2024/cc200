package p034c7;

/* renamed from: c7.n8 */
/* loaded from: classes.dex */
public final class RunnableC0811n8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ String f3362h;

    /* renamed from: i */
    public final /* synthetic */ String f3363i;

    /* renamed from: j */
    public final /* synthetic */ Object f3364j;

    /* renamed from: k */
    public final /* synthetic */ long f3365k;

    /* renamed from: l */
    public final /* synthetic */ C0936w7 f3366l;

    public RunnableC0811n8(C0936w7 c0936w7, String str, String str2, Object obj, long j10) {
        this.f3362h = str;
        this.f3363i = str2;
        this.f3364j = obj;
        this.f3365k = j10;
        this.f3366l = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3366l.m3962W(this.f3362h, this.f3363i, this.f3364j, this.f3365k);
    }
}
