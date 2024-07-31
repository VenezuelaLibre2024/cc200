package p108h6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: h6.p1 */
/* loaded from: classes.dex */
public final class C2387p1 {

    /* renamed from: f */
    public static final Uri f9677f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f9678a;

    /* renamed from: b */
    public final String f9679b;

    /* renamed from: c */
    public final ComponentName f9680c;

    /* renamed from: d */
    public final int f9681d;

    /* renamed from: e */
    public final boolean f9682e;

    public C2387p1(ComponentName componentName, int i10) {
        this.f9678a = null;
        this.f9679b = null;
        C2394s.m9619l(componentName);
        this.f9680c = componentName;
        this.f9681d = 4225;
        this.f9682e = false;
    }

    public C2387p1(String str, String str2, int i10, boolean z10) {
        C2394s.m9613f(str);
        this.f9678a = str;
        C2394s.m9613f(str2);
        this.f9679b = str2;
        this.f9680c = null;
        this.f9681d = 4225;
        this.f9682e = z10;
    }

    /* renamed from: a */
    public final ComponentName m9588a() {
        return this.f9680c;
    }

    /* renamed from: b */
    public final Intent m9589b(Context context) {
        Bundle bundle;
        if (this.f9678a == null) {
            return new Intent().setComponent(this.f9680c);
        }
        if (this.f9682e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f9678a);
            try {
                bundle = context.getContentResolver().call(f9677f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9678a)));
            }
        }
        return r2 == null ? new Intent(this.f9678a).setPackage(this.f9679b) : r2;
    }

    /* renamed from: c */
    public final String m9590c() {
        return this.f9679b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2387p1)) {
            return false;
        }
        C2387p1 c2387p1 = (C2387p1) obj;
        return C2388q.m9592b(this.f9678a, c2387p1.f9678a) && C2388q.m9592b(this.f9679b, c2387p1.f9679b) && C2388q.m9592b(this.f9680c, c2387p1.f9680c) && this.f9682e == c2387p1.f9682e;
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f9678a, this.f9679b, this.f9680c, 4225, Boolean.valueOf(this.f9682e));
    }

    public final String toString() {
        String str = this.f9678a;
        if (str != null) {
            return str;
        }
        C2394s.m9619l(this.f9680c);
        return this.f9680c.flattenToString();
    }
}
