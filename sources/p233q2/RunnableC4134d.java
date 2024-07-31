package p233q2;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import p274t2.C4614a;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public class RunnableC4134d implements Runnable {

    /* renamed from: h */
    public final C4141k f14904h;

    /* renamed from: i */
    public final InterfaceC4142l f14905i;

    public RunnableC4134d(C4141k c4141k) {
        this.f14904h = c4141k;
        this.f14905i = c4141k.m15964A();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4657s(this.f14904h);
        InterfaceC4142l interfaceC4142l = this.f14905i;
        if (interfaceC4142l != null) {
            try {
                interfaceC4142l.mo15965a(this.f14904h);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C4614a.m18192a(e10)));
            }
        }
        InterfaceC4142l m4662x = FFmpegKitConfig.m4662x();
        if (m4662x != null) {
            try {
                m4662x.mo15965a(this.f14904h);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C4614a.m18192a(e11)));
            }
        }
    }
}
