package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0306j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzacg;
import com.google.android.gms.internal.p377firebaseauthapi.zzaci;
import com.google.android.gms.internal.p377firebaseauthapi.zzacl;
import com.google.android.gms.internal.p377firebaseauthapi.zzaec;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import com.google.android.gms.internal.p377firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p103h1.C2281a;
import p125i6.C2605e;
import p195n7.C3767g;
import p207o6.C3932a;
import p207o6.C3938g;
import p207o6.C3940i;
import p260s.C4382d;
import p268s7.AbstractC4547c;
import p308v7.InterfaceC5140b;
import p337x7.C5690j1;
import p337x7.C5693k1;
import p337x7.C5707p0;
import p337x7.C5712r;
import p337x7.C5729w1;
import p337x7.C5735y1;
import p337x7.C5738z1;
import p354y8.InterfaceC5896b;

@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends ActivityC0306j implements zzaci {

    /* renamed from: i */
    public static long f4799i;

    /* renamed from: j */
    public static final C5690j1 f4800j = C5690j1.m22769f();

    /* renamed from: h */
    public boolean f4801h = false;

    /* renamed from: i */
    public static /* synthetic */ Uri m5295i(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC4547c abstractC4547c = (AbstractC4547c) task.getResult();
            if (abstractC4547c.mo17979a() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC4547c.mo17979a()));
            }
            buildUpon.fragment("fac=" + abstractC4547c.mo17980b());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    /* renamed from: j */
    public static String m5296j(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    /* renamed from: h */
    public final Uri.Builder m5297h(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String m5296j = m5296j(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza = zzacl.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = join;
        C5729w1.m22827b().m22831e(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String m22834a = C5735y1.m22833c(getApplicationContext(), C3767g.m14335p(stringExtra4).m14352s()).m22834a();
        if (TextUtils.isEmpty(m22834a)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m5298k(C5712r.m22812a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter(Constants.PROVIDER_ID, stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m22834a);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(m5296j)) {
            builder.appendQueryParameter("customParameters", m5296j);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    /* renamed from: k */
    public final void m5298k(Status status) {
        f4799i = 0L;
        this.f4801h = false;
        Intent intent = new Intent();
        C5693k1.m22779c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m5299l(intent)) {
            f4800j.m22770a(this);
        } else {
            C5707p0.m22798b(getApplicationContext(), status);
        }
        finish();
    }

    /* renamed from: l */
    public final boolean m5299l(Intent intent) {
        return C2281a.m9279b(this).m9282d(intent);
    }

    /* renamed from: m */
    public final void m5300m() {
        f4799i = 0L;
        this.f4801h = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m5299l(intent)) {
            f4800j.m22770a(this);
        } else {
            C5707p0.m22798b(this, C5712r.m22812a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            m5300m();
            return;
        }
        long mo14932a = C3938g.m14938d().mo14932a();
        if (mo14932a - f4799i < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f4799i = mo14932a;
        if (bundle != null) {
            this.f4801h = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f4801h) {
                m5300m();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = C3940i.m14947b(C3932a.m14916a(this, packageName)).toLowerCase(Locale.US);
                C3767g m14335p = C3767g.m14335p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m14335p);
                if (zzaec.zza(m14335p)) {
                    zza(m5297h(Uri.parse(zzaec.zza(m14335p.m14351r().m14363b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m5260v0());
                } else {
                    new zzacg(packageName, lowerCase, getIntent(), m14335p, this).executeOnExecutor(firebaseAuth.m5196A0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzacl.zzb(this, packageName);
            }
            this.f4801h = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m5298k(C5693k1.m22778b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            m5300m();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        C5738z1 m22829c = C5729w1.m22827b().m22829c(this, packageName2, stringExtra2);
        if (m22829c == null) {
            m5300m();
        }
        if (booleanExtra) {
            stringExtra = C5735y1.m22833c(getApplicationContext(), C3767g.m14335p(m22829c.m22836a()).m14352s()).m22835b(stringExtra);
        }
        zzags zzagsVar = new zzags(m22829c, stringExtra);
        String m22840e = m22829c.m22840e();
        String m22837b = m22829c.m22837b();
        zzagsVar.zzb(m22840e);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(m22837b) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(m22837b) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(m22837b)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + m22837b);
            m5300m();
            return;
        }
        f4799i = 0L;
        this.f4801h = false;
        Intent intent2 = new Intent();
        C2605e.m10495e(zzagsVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", m22837b);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m5299l(intent2)) {
            f4800j.m22770a(this);
        } else {
            C5707p0.m22799c(getApplicationContext(), zzagsVar, m22837b, m22840e);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f4801h);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m5297h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final String zza(String str) {
        return zzaec.zzb(str);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final void zza(final Uri uri, final String str, InterfaceC5896b<InterfaceC5140b> interfaceC5896b) {
        InterfaceC5140b interfaceC5140b = interfaceC5896b.get();
        (interfaceC5140b != null ? interfaceC5140b.mo18541a(false).continueWith(new Continuation() { // from class: x7.j0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return GenericIdpActivity.m5295i(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: x7.k0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity genericIdpActivity = GenericIdpActivity.this;
                String str2 = str;
                boolean z10 = false;
                if (!(genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzacl.zzb(genericIdpActivity, str2);
                    return;
                }
                List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    z10 = true;
                }
                if (z10) {
                    C4382d m16949b = new C4382d.b().m16949b();
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    m16949b.m16946a(genericIdpActivity, (Uri) task.getResult());
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str2);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final void zza(String str, Status status) {
        if (status == null) {
            m5300m();
        } else {
            m5298k(status);
        }
    }
}
