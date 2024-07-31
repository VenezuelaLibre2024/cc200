package io.flutter.plugins.googlesignin;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.C1162a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import p008a6.C0060b;

/* loaded from: classes2.dex */
public class GoogleSignInWrapper {
    public C0060b getClient(Context context, GoogleSignInOptions googleSignInOptions) {
        return C1162a.m4971a(context, googleSignInOptions);
    }

    public GoogleSignInAccount getLastSignedInAccount(Context context) {
        return C1162a.m4972b(context);
    }

    public boolean hasPermissions(GoogleSignInAccount googleSignInAccount, Scope scope) {
        return C1162a.m4974d(googleSignInAccount, scope);
    }

    public void requestPermissions(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        C1162a.m4975e(activity, i10, googleSignInAccount, scopeArr);
    }
}
