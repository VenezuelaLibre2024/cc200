package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC0306j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p021b6.C0482a0;
import p021b6.C0499r;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC0306j {

    /* renamed from: m */
    public static boolean f4459m = false;

    /* renamed from: h */
    public boolean f4460h = false;

    /* renamed from: i */
    public SignInConfiguration f4461i;

    /* renamed from: j */
    public boolean f4462j;

    /* renamed from: k */
    public int f4463k;

    /* renamed from: l */
    public Intent f4464l;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* renamed from: j */
    public final void m4980j() {
        getSupportLoaderManager().mo7272c(0, null, new C0482a0(this, null));
        f4459m = false;
    }

    /* renamed from: k */
    public final void m4981k(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f4459m = false;
    }

    /* renamed from: l */
    public final void m4982l(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f4461i);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f4460h = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m4981k(17);
        }
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f4460h) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m4970I() != null) {
                GoogleSignInAccount m4970I = signInAccount.m4970I();
                C0499r m2443c = C0499r.m2443c(this);
                GoogleSignInOptions m4977I = this.f4461i.m4977I();
                Objects.requireNonNull(m4970I);
                m2443c.m2448e(m4977I, m4970I);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m4970I);
                this.f4462j = true;
                this.f4463k = i11;
                this.f4464l = intent;
                m4980j();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m4981k(intExtra);
                return;
            }
        }
        m4981k(8);
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m4981k(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        Objects.requireNonNull(bundleExtra);
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f4461i = signInConfiguration;
        if (bundle == null) {
            if (f4459m) {
                setResult(0);
                m4981k(12502);
                return;
            } else {
                f4459m = true;
                m4982l(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f4462j = z10;
        if (z10) {
            this.f4463k = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            Objects.requireNonNull(intent2);
            this.f4464l = intent2;
            m4980j();
        }
    }

    @Override // androidx.fragment.app.ActivityC0306j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f4459m = false;
    }

    @Override // androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f4462j);
        if (this.f4462j) {
            bundle.putInt("signInResultCode", this.f4463k);
            bundle.putParcelable("signInResultData", this.f4464l);
        }
    }
}
