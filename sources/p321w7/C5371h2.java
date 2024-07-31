package p321w7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p195n7.C3767g;
import p337x7.AbstractC5716s0;

/* renamed from: w7.h2 */
/* loaded from: classes.dex */
public final class C5371h2 extends AbstractC5716s0<Void> {

    /* renamed from: a */
    public final /* synthetic */ String f20202a;

    /* renamed from: b */
    public final /* synthetic */ C5356e f20203b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f20204c;

    public C5371h2(FirebaseAuth firebaseAuth, String str, C5356e c5356e) {
        this.f20202a = str;
        this.f20203b = c5356e;
        this.f20204c = firebaseAuth;
    }

    @Override // p337x7.AbstractC5716s0
    /* renamed from: c */
    public final Task<Void> mo5294c(String str) {
        String str2;
        StringBuilder sb2;
        zzaag zzaagVar;
        C3767g c3767g;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f20202a;
            sb2 = new StringBuilder("Email link sign in for ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f20202a;
            sb2 = new StringBuilder("Got reCAPTCHA token for email link sign in for ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaagVar = this.f20204c.f4734e;
        c3767g = this.f20204c.f4730a;
        String str5 = this.f20202a;
        C5356e c5356e = this.f20203b;
        str3 = this.f20204c.f4740k;
        return zzaagVar.zzb(c3767g, str5, c5356e, str3, str);
    }
}
