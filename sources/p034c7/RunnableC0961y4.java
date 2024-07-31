package p034c7;

/* renamed from: c7.y4 */
/* loaded from: classes.dex */
public final class RunnableC0961y4 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ int f3762h;

    /* renamed from: i */
    public final /* synthetic */ String f3763i;

    /* renamed from: j */
    public final /* synthetic */ Object f3764j;

    /* renamed from: k */
    public final /* synthetic */ Object f3765k;

    /* renamed from: l */
    public final /* synthetic */ Object f3766l;

    /* renamed from: m */
    public final /* synthetic */ C0919v4 f3767m;

    public RunnableC0961y4(C0919v4 c0919v4, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f3762h = i10;
        this.f3763i = str;
        this.f3764j = obj;
        this.f3765k = obj2;
        this.f3766l = obj3;
        this.f3767m = c0919v4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        C0919v4 c0919v4;
        char c12;
        C0738i5 m3485A = this.f3767m.f3198a.m3485A();
        if (!m3485A.m3433n()) {
            this.f3767m.m3924t(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c10 = this.f3767m.f3653c;
        if (c10 == 0) {
            if (this.f3767m.mo3092a().m3273P()) {
                c0919v4 = this.f3767m;
                c12 = 'C';
            } else {
                c0919v4 = this.f3767m;
                c12 = 'c';
            }
            c0919v4.f3653c = c12;
        }
        j10 = this.f3767m.f3654d;
        if (j10 < 0) {
            this.f3767m.f3654d = 84002L;
        }
        char charAt = "01VDIWEA?".charAt(this.f3762h);
        c11 = this.f3767m.f3653c;
        j11 = this.f3767m.f3654d;
        String str = "2" + charAt + c11 + j11 + ":" + C0919v4.m3908s(true, this.f3763i, this.f3764j, this.f3765k, this.f3766l);
        if (str.length() > 1024) {
            str = this.f3763i.substring(0, 1024);
        }
        C0794m5 c0794m5 = m3485A.f3152f;
        if (c0794m5 != null) {
            c0794m5.m3610b(str, 1L);
        }
    }
}
