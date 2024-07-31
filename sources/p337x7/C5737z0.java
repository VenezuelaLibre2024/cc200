package p337x7;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* renamed from: x7.z0 */
/* loaded from: classes.dex */
public final class C5737z0 implements InterfaceC5728w0 {
    @Override // p337x7.InterfaceC5728w0
    /* renamed from: a */
    public final Task<RecaptchaTasksClient> mo22825a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
