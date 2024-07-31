package p248r2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;
import p233q2.C4141k;

/* renamed from: r2.m */
/* loaded from: classes.dex */
public class RunnableC4289m implements Runnable {

    /* renamed from: h */
    public final C4141k f15563h;

    /* renamed from: i */
    public final C4281e f15564i;

    /* renamed from: j */
    public final MethodChannel.Result f15565j;

    public RunnableC4289m(C4141k c4141k, C4281e c4281e, MethodChannel.Result result) {
        this.f15563h = c4141k;
        this.f15564i = c4281e;
        this.f15565j = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4657s(this.f15563h);
        this.f15564i.m16420m(this.f15565j, null);
    }
}
