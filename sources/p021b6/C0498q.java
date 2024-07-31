package p021b6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import p008a6.C0061c;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.C1849i;
import p096g6.C2018f;
import p154k6.C3363a;

/* renamed from: b6.q */
/* loaded from: classes.dex */
public final class C0498q {

    /* renamed from: a */
    public static final C3363a f2294a = new C3363a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m2435a(Context context, GoogleSignInOptions googleSignInOptions) {
        f2294a.m12506a("getFallbackSignInIntent()", new Object[0]);
        Intent m2437c = m2437c(context, googleSignInOptions);
        m2437c.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return m2437c;
    }

    /* renamed from: b */
    public static Intent m2436b(Context context, GoogleSignInOptions googleSignInOptions) {
        f2294a.m12506a("getNoImplementationSignInIntent()", new Object[0]);
        Intent m2437c = m2437c(context, googleSignInOptions);
        m2437c.setAction("com.google.android.gms.auth.NO_IMPL");
        return m2437c;
    }

    /* renamed from: c */
    public static Intent m2437c(Context context, GoogleSignInOptions googleSignInOptions) {
        f2294a.m12506a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: d */
    public static C0061c m2438d(Intent intent) {
        if (intent == null) {
            return new C0061c(null, Status.f4472o);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C0061c(googleSignInAccount, Status.f4470m);
        }
        if (status == null) {
            status = Status.f4472o;
        }
        return new C0061c(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p079f6.AbstractC1847g m2439e(p079f6.AbstractC1846f r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            k6.a r0 = p021b6.C0498q.f2294a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.m12506a(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "getEligibleSavedSignInResult()"
            r0.m12506a(r3, r2)
            p108h6.C2394s.m9619l(r8)
            b6.r r2 = p021b6.C0499r.m2443c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.m2446b()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.m4958y()
            android.accounts.Account r5 = r8.m4958y()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.m4956O()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.m4955N()
            if (r4 == 0) goto L59
            boolean r4 = r2.m4955N()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.m4953L()
            java.lang.String r5 = r2.m4953L()
            boolean r4 = p108h6.C2388q.m9592b(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.m4952K()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.m4952K()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            b6.r r2 = p021b6.C0499r.m2443c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.m2445a()
            if (r2 == 0) goto L1f
            boolean r4 = r2.m4932P()
            if (r4 != 0) goto L1f
            a6.c r4 = new a6.c
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f4470m
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.m12506a(r8, r7)
            f6.g r6 = p079f6.C1849i.m7598b(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            a6.c r7 = new a6.c
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            f6.g r6 = p079f6.C1849i.m7598b(r7, r6)
            return r6
        La9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.m12506a(r1, r9)
            b6.k r9 = new b6.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.a r6 = r6.mo7588a(r9)
            g6.n r7 = new g6.n
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b6.C0498q.m2439e(f6.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):f6.g");
    }

    /* renamed from: f */
    public static AbstractC1848h m2440f(AbstractC1846f abstractC1846f, Context context, boolean z10) {
        f2294a.m12506a("Revoking access", new Object[0]);
        String m2424e = C0484c.m2419b(context).m2424e();
        m2442h(context);
        return z10 ? RunnableC0487f.m2431a(m2424e) : abstractC1846f.mo7589b(new C0496o(abstractC1846f));
    }

    /* renamed from: g */
    public static AbstractC1848h m2441g(AbstractC1846f abstractC1846f, Context context, boolean z10) {
        f2294a.m12506a("Signing out", new Object[0]);
        m2442h(context);
        return z10 ? C1849i.m7599c(Status.f4470m, abstractC1846f) : abstractC1846f.mo7589b(new C0494m(abstractC1846f));
    }

    /* renamed from: h */
    public static void m2442h(Context context) {
        C0499r.m2443c(context).m2447d();
        Iterator<AbstractC1846f> it = AbstractC1846f.m7587c().iterator();
        while (it.hasNext()) {
            it.next().m7593g();
        }
        C2018f.m8114a();
    }
}
