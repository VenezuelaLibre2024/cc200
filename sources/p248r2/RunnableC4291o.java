package p248r2;

import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;

/* renamed from: r2.o */
/* loaded from: classes.dex */
public class RunnableC4291o implements Runnable {

    /* renamed from: h */
    public final String f15570h;

    /* renamed from: i */
    public final String f15571i;

    /* renamed from: j */
    public final C4281e f15572j;

    /* renamed from: k */
    public final MethodChannel.Result f15573k;

    public RunnableC4291o(String str, String str2, C4281e c4281e, MethodChannel.Result result) {
        this.f15570h = str;
        this.f15571i = str2;
        this.f15572j = c4281e;
        this.f15573k = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = "cat " + this.f15570h + " > " + this.f15571i;
            Log.d("ffmpeg-kit-flutter", String.format("Starting copy %s to pipe %s operation.", this.f15570h, this.f15571i));
            long currentTimeMillis = System.currentTimeMillis();
            int waitFor = Runtime.getRuntime().exec(new String[]{"sh", "-c", str}).waitFor();
            Log.d("ffmpeg-kit-flutter", String.format("Copying %s to pipe %s operation completed with rc %d in %d seconds.", this.f15570h, this.f15571i, Integer.valueOf(waitFor), Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000)));
            this.f15572j.m16420m(this.f15573k, Integer.valueOf(waitFor));
        } catch (IOException | InterruptedException e10) {
            Log.e("ffmpeg-kit-flutter", String.format("Copy %s to pipe %s failed with error.", this.f15570h, this.f15571i), e10);
            this.f15572j.m16416e(this.f15573k, "WRITE_TO_PIPE_FAILED", e10.getMessage());
        }
    }
}
