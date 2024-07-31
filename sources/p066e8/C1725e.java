package p066e8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p023b8.C0515g;

/* renamed from: e8.e */
/* loaded from: classes.dex */
public class C1725e {

    /* renamed from: a */
    public final Float f6337a;

    /* renamed from: b */
    public final boolean f6338b;

    public C1725e(Float f10, boolean z10) {
        this.f6338b = z10;
        this.f6337a = f10;
    }

    /* renamed from: a */
    public static C1725e m6790a(Context context) {
        Float f10 = null;
        boolean z10 = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = m6792e(registerReceiver);
                f10 = m6791d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            C0515g.m2482f().m2487e("An error occurred getting battery state.", e10);
        }
        return new C1725e(f10, z10);
    }

    /* renamed from: d */
    public static Float m6791d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    public static boolean m6792e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m6793b() {
        return this.f6337a;
    }

    /* renamed from: c */
    public int m6794c() {
        Float f10;
        if (!this.f6338b || (f10 = this.f6337a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
