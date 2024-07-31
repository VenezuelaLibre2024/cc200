package p233q2;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import p274t2.C4614a;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public class RunnableC4132c implements Runnable {

    /* renamed from: h */
    public final C4138h f14901h;

    /* renamed from: i */
    public final InterfaceC4139i f14902i;

    public RunnableC4132c(C4138h c4138h) {
        this.f14901h = c4138h;
        this.f14902i = c4138h.m15953C();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4656r(this.f14901h);
        InterfaceC4139i interfaceC4139i = this.f14902i;
        if (interfaceC4139i != null) {
            try {
                interfaceC4139i.mo15960a(this.f14901h);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C4614a.m18192a(e10)));
            }
        }
        InterfaceC4139i m4659u = FFmpegKitConfig.m4659u();
        if (m4659u != null) {
            try {
                m4659u.mo15960a(this.f14901h);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C4614a.m18192a(e11)));
            }
        }
    }
}
