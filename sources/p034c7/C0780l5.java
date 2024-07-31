package p034c7;

import android.content.SharedPreferences;
import p108h6.C2394s;

/* renamed from: c7.l5 */
/* loaded from: classes.dex */
public final class C0780l5 {

    /* renamed from: a */
    public final String f3270a;

    /* renamed from: b */
    public final boolean f3271b;

    /* renamed from: c */
    public boolean f3272c;

    /* renamed from: d */
    public boolean f3273d;

    /* renamed from: e */
    public final /* synthetic */ C0738i5 f3274e;

    public C0780l5(C0738i5 c0738i5, String str, boolean z10) {
        this.f3274e = c0738i5;
        C2394s.m9613f(str);
        this.f3270a = str;
        this.f3271b = z10;
    }

    /* renamed from: a */
    public final void m3527a(boolean z10) {
        SharedPreferences.Editor edit = this.f3274e.m3407D().edit();
        edit.putBoolean(this.f3270a, z10);
        edit.apply();
        this.f3273d = z10;
    }

    /* renamed from: b */
    public final boolean m3528b() {
        if (!this.f3272c) {
            this.f3272c = true;
            this.f3273d = this.f3274e.m3407D().getBoolean(this.f3270a, this.f3271b);
        }
        return this.f3273d;
    }
}
