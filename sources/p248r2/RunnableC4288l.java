package p248r2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;
import p233q2.C4138h;

/* renamed from: r2.l */
/* loaded from: classes.dex */
public class RunnableC4288l implements Runnable {

    /* renamed from: h */
    public final C4138h f15560h;

    /* renamed from: i */
    public final C4281e f15561i;

    /* renamed from: j */
    public final MethodChannel.Result f15562j;

    public RunnableC4288l(C4138h c4138h, C4281e c4281e, MethodChannel.Result result) {
        this.f15560h = c4138h;
        this.f15561i = c4281e;
        this.f15562j = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4656r(this.f15560h);
        this.f15561i.m16420m(this.f15562j, null);
    }
}
