package p337x7;

import com.google.android.gms.internal.p377firebaseauthapi.zzafj;
import com.google.android.gms.internal.p377firebaseauthapi.zzah;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import p195n7.C3767g;

/* renamed from: x7.b1 */
/* loaded from: classes.dex */
public final class C5659b1 {

    /* renamed from: a */
    public Map<String, Task<RecaptchaTasksClient>> f21110a;

    /* renamed from: b */
    public zzafj f21111b;

    /* renamed from: c */
    public C3767g f21112c;

    /* renamed from: d */
    public FirebaseAuth f21113d;

    /* renamed from: e */
    public InterfaceC5728w0 f21114e;

    public C5659b1(C3767g c3767g, FirebaseAuth firebaseAuth) {
        this(c3767g, firebaseAuth, new C5737z0());
    }

    public C5659b1(C3767g c3767g, FirebaseAuth firebaseAuth, InterfaceC5728w0 interfaceC5728w0) {
        this.f21110a = new HashMap();
        this.f21112c = c3767g;
        this.f21113d = firebaseAuth;
        this.f21114e = interfaceC5728w0;
    }

    /* renamed from: f */
    public static String m22726f(String str) {
        return zzah.zzc(str) ? "*" : str;
    }

    /* renamed from: a */
    public final Task<RecaptchaTasksClient> m22727a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> m22730e;
        String m22726f = m22726f(str);
        return (bool.booleanValue() || (m22730e = m22730e(m22726f)) == null) ? this.f21113d.m5210K("RECAPTCHA_ENTERPRISE").continueWithTask(new C5655a1(this, m22726f)) : m22730e;
    }

    /* renamed from: b */
    public final Task<String> m22728b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String m22726f = m22726f(str);
        Task<RecaptchaTasksClient> m22730e = m22730e(m22726f);
        if (bool.booleanValue() || m22730e == null) {
            m22730e = m22727a(m22726f, bool);
        }
        return m22730e.continueWithTask(new C5667d1(this, recaptchaAction));
    }

    /* renamed from: d */
    public final boolean m22729d(String str) {
        zzafj zzafjVar = this.f21111b;
        return zzafjVar != null && zzafjVar.zzb(str);
    }

    /* renamed from: e */
    public final Task<RecaptchaTasksClient> m22730e(String str) {
        return this.f21110a.get(str);
    }
}
