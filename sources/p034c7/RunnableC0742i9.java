package p034c7;

import android.net.Uri;

/* renamed from: c7.i9 */
/* loaded from: classes.dex */
public final class RunnableC0742i9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ boolean f3179h;

    /* renamed from: i */
    public final /* synthetic */ Uri f3180i;

    /* renamed from: j */
    public final /* synthetic */ String f3181j;

    /* renamed from: k */
    public final /* synthetic */ String f3182k;

    /* renamed from: l */
    public final /* synthetic */ C0686e9 f3183l;

    public RunnableC0742i9(C0686e9 c0686e9, boolean z10, Uri uri, String str, String str2) {
        this.f3179h = z10;
        this.f3180i = uri;
        this.f3181j = str;
        this.f3182k = str2;
        this.f3183l = c0686e9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0686e9.m3163a(this.f3183l, this.f3179h, this.f3180i, this.f3181j, this.f3182k);
    }
}
