package p034c7;

/* renamed from: c7.m8 */
/* loaded from: classes.dex */
public final class RunnableC0797m8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ long f3330h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3331i;

    public RunnableC0797m8(C0936w7 c0936w7, long j10) {
        this.f3330h = j10;
        this.f3331i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3331i.mo3095e().f3159m.m3619b(this.f3330h);
        this.f3331i.zzj().m3913A().m3996b("Session timeout duration set", Long.valueOf(this.f3330h));
    }
}
