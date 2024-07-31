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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzacg;
import com.google.android.gms.internal.p377firebaseauthapi.zzaci;
import com.google.android.gms.internal.p377firebaseauthapi.zzacl;
import com.google.android.gms.internal.p377firebaseauthapi.zzacu;
import com.google.android.gms.internal.p377firebaseauthapi.zzaec;
import com.google.android.gms.internal.p377firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p103h1.C2281a;
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
import p354y8.InterfaceC5896b;

/* loaded from: classes.dex */
public class RecaptchaActivity extends ActivityC0306j implements zzaci {

    /* renamed from: i */
    public static final String f4802i = "RecaptchaActivity";

    /* renamed from: j */
    public static long f4803j;

    /* renamed from: k */
    public static final C5690j1 f4804k = C5690j1.m22769f();

    /* renamed from: h */
    public boolean f4805h = false;

    /* renamed from: i */
    public static /* synthetic */ Uri m5301i(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC4547c abstractC4547c = (AbstractC4547c) task.getResult();
            if (abstractC4547c.mo17979a() != null) {
                Log.w(f4802i, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC4547c.mo17979a()));
            }
            buildUpon.fragment("fac=" + abstractC4547c.mo17980b());
        } else {
            Log.e(f4802i, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    /* renamed from: h */
    public final Uri.Builder m5302h(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C3767g m14335p = C3767g.m14335p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m14335p);
        C5729w1.m22827b().m22830d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String m22834a = C5735y1.m22833c(getApplicationContext(), m14335p.m14352s()).m22834a();
        if (TextUtils.isEmpty(m22834a)) {
            Log.e(f4802i, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m5303j(C5712r.m22812a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m5244m()) ? firebaseAuth.m5244m() : zzacu.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter(Constants.APP_NAME, stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m22834a);
        return builder;
    }

    /* renamed from: j */
    public final void m5303j(Status status) {
        f4803j = 0L;
        this.f4805h = false;
        Intent intent = new Intent();
        C5693k1.m22779c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m5305l(intent);
        f4804k.m22770a(this);
        finish();
    }

    /* renamed from: k */
    public final /* synthetic */ void m5304k(String str, Task task) {
        boolean z10 = false;
        if (!(getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
            Log.e(f4802i, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzacl.zzb(this, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            C4382d m16949b = new C4382d.b().m16949b();
            m16949b.f16085a.addFlags(1073741824);
            m16949b.f16085a.addFlags(268435456);
            m16949b.m16946a(this, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    /* renamed from: l */
    public final boolean m5305l(Intent intent) {
        return C2281a.m9279b(this).m9282d(intent);
    }

    /* renamed from: m */
    public final void m5306m() {
        f4803j = 0L;
        this.f4805h = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m5305l(intent);
        f4804k.m22770a(this);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f4802i, "Could not do operation - unknown action: " + action);
            m5306m();
            return;
        }
        long mo14932a = C3938g.m14938d().mo14932a();
        if (mo14932a - f4803j < 30000) {
            Log.e(f4802i, "Could not start operation - already in progress");
            return;
        }
        f4803j = mo14932a;
        if (bundle != null) {
            this.f4805h = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
            if (this.f4805h) {
                m5306m();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = C3940i.m14947b(C3932a.m14916a(this, packageName)).toLowerCase(Locale.US);
                C3767g m14335p = C3767g.m14335p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m14335p);
                if (zzaec.zza(m14335p)) {
                    zza(m5302h(Uri.parse(zzaec.zza(m14335p.m14351r().m14363b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m5260v0());
                } else {
                    new zzacg(packageName, lowerCase, intent, m14335p, this).executeOnExecutor(firebaseAuth.m5196A0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f4802i, "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzacl.zzb(this, packageName);
            }
            this.f4805h = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            m5303j(C5693k1.m22778b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            m5306m();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String m22832g = C5729w1.m22827b().m22832g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(m22832g)) {
            Log.e(f4802i, "Failed to find registration for this event - failing to prevent session injection.");
            m5303j(C5712r.m22812a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = C5735y1.m22833c(getApplicationContext(), C3767g.m14335p(m22832g).m14352s()).m22835b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f4803j = 0L;
        this.f4805h = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m5305l(intent3)) {
            f4804k.m22770a(this);
        } else {
            C5707p0.m22802f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f4805h);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m5302h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            zzaci.zza.m12508c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final void zza(final Uri uri, final String str, InterfaceC5896b<InterfaceC5140b> interfaceC5896b) {
        InterfaceC5140b interfaceC5140b = interfaceC5896b.get();
        (interfaceC5140b != null ? interfaceC5140b.mo18541a(false).continueWith(new Continuation() { // from class: x7.t0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return RecaptchaActivity.m5301i(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: x7.r0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.this.m5304k(str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaci
    public final void zza(String str, Status status) {
        if (status == null) {
            m5306m();
        } else {
            m5303j(status);
        }
    }
}
