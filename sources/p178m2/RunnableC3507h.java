package p178m2;

import androidx.work.WorkerParameters;
import p044d2.C1527i;

/* renamed from: m2.h */
/* loaded from: classes.dex */
public class RunnableC3507h implements Runnable {

    /* renamed from: h */
    public C1527i f12286h;

    /* renamed from: i */
    public String f12287i;

    /* renamed from: j */
    public WorkerParameters.C0415a f12288j;

    public RunnableC3507h(C1527i c1527i, String str, WorkerParameters.C0415a c0415a) {
        this.f12286h = c1527i;
        this.f12287i = str;
        this.f12288j = c0415a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12286h.m6197m().m6161k(this.f12287i, this.f12288j);
    }
}
