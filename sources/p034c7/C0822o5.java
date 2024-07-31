package p034c7;

import android.content.SharedPreferences;
import p108h6.C2394s;

/* renamed from: c7.o5 */
/* loaded from: classes.dex */
public final class C0822o5 {

    /* renamed from: a */
    public final String f3389a;

    /* renamed from: b */
    public final String f3390b;

    /* renamed from: c */
    public boolean f3391c;

    /* renamed from: d */
    public String f3392d;

    /* renamed from: e */
    public final /* synthetic */ C0738i5 f3393e;

    public C0822o5(C0738i5 c0738i5, String str, String str2) {
        this.f3393e = c0738i5;
        C2394s.m9613f(str);
        this.f3389a = str;
        this.f3390b = null;
    }

    /* renamed from: a */
    public final String m3673a() {
        if (!this.f3391c) {
            this.f3391c = true;
            this.f3392d = this.f3393e.m3407D().getString(this.f3389a, null);
        }
        return this.f3392d;
    }

    /* renamed from: b */
    public final void m3674b(String str) {
        SharedPreferences.Editor edit = this.f3393e.m3407D().edit();
        edit.putString(this.f3389a, str);
        edit.apply();
        this.f3392d = str;
    }
}
