package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import p008a6.C0060b;
import p008a6.C0061c;
import p021b6.C0498q;
import p021b6.C0499r;
import p108h6.C2343b;
import p108h6.C2394s;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes.dex */
public final class C1162a {
    /* renamed from: a */
    public static C0060b m4971a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new C0060b(context, (GoogleSignInOptions) C2394s.m9619l(googleSignInOptions));
    }

    /* renamed from: b */
    public static GoogleSignInAccount m4972b(Context context) {
        return C0499r.m2443c(context).m2445a();
    }

    /* renamed from: c */
    public static Task<GoogleSignInAccount> m4973c(Intent intent) {
        C0061c m2438d = C0498q.m2438d(intent);
        GoogleSignInAccount m299a = m2438d.m299a();
        return (!m2438d.getStatus().m4991N() || m299a == null) ? Tasks.forException(C2343b.m9513a(m2438d.getStatus())) : Tasks.forResult(m299a);
    }

    /* renamed from: d */
    public static boolean m4974d(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.m4927K().containsAll(hashSet);
    }

    /* renamed from: e */
    public static void m4975e(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        C2394s.m9620m(activity, "Please provide a non-null Activity");
        C2394s.m9620m(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(m4976f(activity, googleSignInAccount, scopeArr), i10);
    }

    /* renamed from: f */
    public static Intent m4976f(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.C1161a c1161a = new GoogleSignInOptions.C1161a();
        if (scopeArr.length > 0) {
            c1161a.m4964f(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.m4924C())) {
            c1161a.m4966h((String) C2394s.m9619l(googleSignInAccount.m4924C()));
        }
        return new C0060b(activity, c1161a.m4959a()).m295b();
    }
}
