package p248r2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;
import p233q2.C4149s;

/* renamed from: r2.n */
/* loaded from: classes.dex */
public class RunnableC4290n implements Runnable {

    /* renamed from: h */
    public final C4149s f15566h;

    /* renamed from: i */
    public final int f15567i;

    /* renamed from: j */
    public final C4281e f15568j;

    /* renamed from: k */
    public final MethodChannel.Result f15569k;

    public RunnableC4290n(C4149s c4149s, int i10, C4281e c4281e, MethodChannel.Result result) {
        this.f15566h = c4149s;
        this.f15567i = i10;
        this.f15568j = c4281e;
        this.f15569k = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4620D(this.f15566h, this.f15567i);
        this.f15568j.m16420m(this.f15569k, null);
    }
}
