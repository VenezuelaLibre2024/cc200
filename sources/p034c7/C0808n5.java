package p034c7;

import android.content.SharedPreferences;
import p108h6.C2394s;

/* renamed from: c7.n5 */
/* loaded from: classes.dex */
public final class C0808n5 {

    /* renamed from: a */
    public final String f3345a;

    /* renamed from: b */
    public final long f3346b;

    /* renamed from: c */
    public boolean f3347c;

    /* renamed from: d */
    public long f3348d;

    /* renamed from: e */
    public final /* synthetic */ C0738i5 f3349e;

    public C0808n5(C0738i5 c0738i5, String str, long j10) {
        this.f3349e = c0738i5;
        C2394s.m9613f(str);
        this.f3345a = str;
        this.f3346b = j10;
    }

    /* renamed from: a */
    public final long m3618a() {
        if (!this.f3347c) {
            this.f3347c = true;
            this.f3348d = this.f3349e.m3407D().getLong(this.f3345a, this.f3346b);
        }
        return this.f3348d;
    }

    /* renamed from: b */
    public final void m3619b(long j10) {
        SharedPreferences.Editor edit = this.f3349e.m3407D().edit();
        edit.putLong(this.f3345a, j10);
        edit.apply();
        this.f3348d = j10;
    }
}
