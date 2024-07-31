package p337x7;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import com.google.android.gms.internal.p377firebaseauthapi.zzaq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p108h6.C2394s;
import p125i6.C2605e;
import p207o6.C3938g;
import p321w7.AbstractC5341a0;
import p321w7.InterfaceC5372i;

/* renamed from: x7.p0 */
/* loaded from: classes.dex */
public final class C5707p0 {

    /* renamed from: d */
    public static long f21236d = 3600000;

    /* renamed from: e */
    public static final zzaq<String> f21237e = zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", Constants.TIMESTAMP);

    /* renamed from: f */
    public static final C5707p0 f21238f = new C5707p0();

    /* renamed from: a */
    public Task<InterfaceC5372i> f21239a;

    /* renamed from: b */
    public Task<String> f21240b;

    /* renamed from: c */
    public long f21241c = 0;

    /* renamed from: b */
    public static void m22798b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.m4987J());
        edit.putString("statusMessage", status.m4988K());
        edit.putLong(Constants.TIMESTAMP, C3938g.m14938d().mo14932a());
        edit.commit();
    }

    /* renamed from: c */
    public static void m22799c(Context context, zzags zzagsVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", C2605e.m10496f(zzagsVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(Constants.TIMESTAMP, C3938g.m14938d().mo14932a());
        edit.commit();
    }

    /* renamed from: d */
    public static void m22800d(Context context, FirebaseAuth firebaseAuth) {
        C2394s.m9619l(context);
        C2394s.m9619l(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m5236i().m14350q());
        edit.commit();
    }

    /* renamed from: e */
    public static void m22801e(Context context, FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(context);
        C2394s.m9619l(firebaseAuth);
        C2394s.m9619l(abstractC5341a0);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m5236i().m14350q());
        edit.putString("firebaseUserUid", abstractC5341a0.mo21427b());
        edit.commit();
    }

    /* renamed from: f */
    public static void m22802f(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(Constants.TIMESTAMP, C3938g.m14938d().mo14932a());
        edit.commit();
    }

    /* renamed from: g */
    public static void m22803g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaq<String> zzaqVar = f21237e;
        int size = zzaqVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzaqVar.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }

    /* renamed from: j */
    public static C5707p0 m22804j() {
        return f21238f;
    }

    /* renamed from: a */
    public final void m22805a(Context context) {
        C2394s.m9619l(context);
        m22803g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f21239a = null;
        this.f21241c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L61;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22806h(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p337x7.C5707p0.m22806h(com.google.firebase.auth.FirebaseAuth):void");
    }

    /* renamed from: i */
    public final Task<String> m22807i() {
        if (C3938g.m14938d().mo14932a() - this.f21241c < f21236d) {
            return this.f21240b;
        }
        return null;
    }
}
