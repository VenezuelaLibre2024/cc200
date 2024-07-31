package p096g6;

import android.app.Activity;
import androidx.fragment.app.ActivityC0306j;
import p108h6.C2394s;

/* renamed from: g6.h */
/* loaded from: classes.dex */
public class C2026h {

    /* renamed from: a */
    public final Object f8042a;

    public C2026h(Activity activity) {
        C2394s.m9620m(activity, "Activity must not be null");
        this.f8042a = activity;
    }

    /* renamed from: a */
    public final Activity m8148a() {
        return (Activity) this.f8042a;
    }

    /* renamed from: b */
    public final ActivityC0306j m8149b() {
        return (ActivityC0306j) this.f8042a;
    }

    /* renamed from: c */
    public final boolean m8150c() {
        return this.f8042a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m8151d() {
        return this.f8042a instanceof ActivityC0306j;
    }
}
