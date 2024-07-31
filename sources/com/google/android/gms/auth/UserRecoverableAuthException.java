package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p108h6.C2394s;
import p277t5.C4695d;
import p277t5.EnumC4708q;

@KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends C4695d {

    /* renamed from: h */
    public final Intent f4381h;

    /* renamed from: i */
    public final PendingIntent f4382i;

    /* renamed from: j */
    public final EnumC4708q f4383j;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, EnumC4708q.LEGACY);
    }

    public UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, EnumC4708q enumC4708q) {
        super(str);
        this.f4382i = pendingIntent;
        this.f4381h = intent;
        this.f4383j = (EnumC4708q) C2394s.m9619l(enumC4708q);
    }

    /* renamed from: b */
    public static UserRecoverableAuthException m4891b(String str, Intent intent, PendingIntent pendingIntent) {
        C2394s.m9619l(intent);
        C2394s.m9619l(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, EnumC4708q.AUTH_INSTANTIATION);
    }

    /* renamed from: a */
    public Intent m4892a() {
        String str;
        Intent intent = this.f4381h;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.f4383j.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
        } else {
            if (ordinal != 2) {
                return null;
            }
            str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
        }
        Log.e("Auth", str);
        return null;
    }
}
