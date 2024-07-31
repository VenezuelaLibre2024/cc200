package p321w7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.p377firebaseauthapi.zzact;
import com.google.android.gms.internal.p377firebaseauthapi.zzaec;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p108h6.C2394s;

/* renamed from: w7.n0 */
/* loaded from: classes.dex */
public class C5391n0 extends AbstractC5390n {

    /* renamed from: a */
    public final Bundle f20220a;

    /* renamed from: w7.n0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final FirebaseAuth f20221a;

        /* renamed from: b */
        public final Bundle f20222b;

        /* renamed from: c */
        public final Bundle f20223c;

        public a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f20222b = bundle;
            Bundle bundle2 = new Bundle();
            this.f20223c = bundle2;
            this.f20221a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.m5236i().m14351r().m14363b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzact.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.m5246n());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.m5236i().m14350q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.m5240k());
        }

        /* renamed from: a */
        public a m21534a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f20223c.putString(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: b */
        public C5391n0 m21535b() {
            return new C5391n0(this.f20222b);
        }

        /* renamed from: c */
        public a m21536c(List<String> list) {
            this.f20222b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    /* renamed from: w7.n0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f20224a;

        /* renamed from: b */
        public String f20225b;

        /* renamed from: c */
        public String f20226c;

        /* renamed from: d */
        public String f20227d;

        public b(String str) {
            this.f20224a = str;
        }

        /* renamed from: a */
        public AbstractC5368h m21537a() {
            return C5428z1.m21584Q(this.f20224a, this.f20225b, this.f20226c, this.f20227d);
        }

        /* renamed from: b */
        public b m21538b(String str) {
            this.f20226c = str;
            return this;
        }

        /* renamed from: c */
        public b m21539c(String str) {
            this.f20225b = str;
            return this;
        }

        /* renamed from: d */
        public b m21540d(String str, String str2) {
            this.f20225b = str;
            this.f20227d = str2;
            return this;
        }
    }

    public C5391n0(Bundle bundle) {
        this.f20220a = bundle;
    }

    /* renamed from: d */
    public static a m21531d(String str) {
        return m21532e(str, FirebaseAuth.getInstance());
    }

    /* renamed from: e */
    public static a m21532e(String str, FirebaseAuth firebaseAuth) {
        C2394s.m9613f(str);
        C2394s.m9619l(firebaseAuth);
        if (!Constants.SIGN_IN_METHOD_FACEBOOK.equals(str) || zzaec.zza(firebaseAuth.m5236i())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    /* renamed from: f */
    public static b m21533f(String str) {
        return new b(C2394s.m9613f(str));
    }

    @Override // p321w7.AbstractC5390n
    /* renamed from: a */
    public final void mo21528a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f20220a);
        activity.startActivity(intent);
    }

    @Override // p321w7.AbstractC5390n
    /* renamed from: b */
    public final void mo21529b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f20220a);
        activity.startActivity(intent);
    }

    @Override // p321w7.AbstractC5390n
    /* renamed from: c */
    public final void mo21530c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f20220a);
        activity.startActivity(intent);
    }
}
