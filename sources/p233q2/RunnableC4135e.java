package p233q2;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import p274t2.C4614a;

/* renamed from: q2.e */
/* loaded from: classes.dex */
public class RunnableC4135e implements Runnable {

    /* renamed from: h */
    public final C4149s f14906h;

    /* renamed from: i */
    public final InterfaceC4150t f14907i;

    /* renamed from: j */
    public final Integer f14908j;

    public RunnableC4135e(C4149s c4149s, Integer num) {
        this.f14906h = c4149s;
        this.f14907i = c4149s.m15977A();
        this.f14908j = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m4620D(this.f14906h, this.f14908j.intValue());
        InterfaceC4150t interfaceC4150t = this.f14907i;
        if (interfaceC4150t != null) {
            try {
                interfaceC4150t.mo15980a(this.f14906h);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C4614a.m18192a(e10)));
            }
        }
        InterfaceC4150t m4621E = FFmpegKitConfig.m4621E();
        if (m4621E != null) {
            try {
                m4621E.mo15980a(this.f14906h);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C4614a.m18192a(e11)));
            }
        }
    }
}
