package p034c7;

import android.content.SharedPreferences;
import android.util.Pair;
import p108h6.C2394s;

/* renamed from: c7.m5 */
/* loaded from: classes.dex */
public final class C0794m5 {

    /* renamed from: a */
    public final String f3320a;

    /* renamed from: b */
    public final String f3321b;

    /* renamed from: c */
    public final String f3322c;

    /* renamed from: d */
    public final long f3323d;

    /* renamed from: e */
    public final /* synthetic */ C0738i5 f3324e;

    public C0794m5(C0738i5 c0738i5, String str, long j10) {
        this.f3324e = c0738i5;
        C2394s.m9613f(str);
        C2394s.m9608a(j10 > 0);
        this.f3320a = str + ":start";
        this.f3321b = str + ":count";
        this.f3322c = str + ":value";
        this.f3323d = j10;
    }

    /* renamed from: a */
    public final Pair<String, Long> m3609a() {
        long abs;
        this.f3324e.mo3099i();
        this.f3324e.mo3099i();
        long m3611c = m3611c();
        if (m3611c == 0) {
            m3612d();
            abs = 0;
        } else {
            abs = Math.abs(m3611c - this.f3324e.zzb().mo14932a());
        }
        long j10 = this.f3323d;
        if (abs < j10) {
            return null;
        }
        if (abs > (j10 << 1)) {
            m3612d();
            return null;
        }
        String string = this.f3324e.m3407D().getString(this.f3322c, null);
        long j11 = this.f3324e.m3407D().getLong(this.f3321b, 0L);
        m3612d();
        return (string == null || j11 <= 0) ? C0738i5.f3147B : new Pair<>(string, Long.valueOf(j11));
    }

    /* renamed from: b */
    public final void m3610b(String str, long j10) {
        this.f3324e.mo3099i();
        if (m3611c() == 0) {
            m3612d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f3324e.m3407D().getLong(this.f3321b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f3324e.m3407D().edit();
            edit.putString(this.f3322c, str);
            edit.putLong(this.f3321b, 1L);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f3324e.mo3096f().m3783P0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f3324e.m3407D().edit();
        if (z10) {
            edit2.putString(this.f3322c, str);
        }
        edit2.putLong(this.f3321b, j12);
        edit2.apply();
    }

    /* renamed from: c */
    public final long m3611c() {
        return this.f3324e.m3407D().getLong(this.f3320a, 0L);
    }

    /* renamed from: d */
    public final void m3612d() {
        this.f3324e.mo3099i();
        long mo14932a = this.f3324e.zzb().mo14932a();
        SharedPreferences.Editor edit = this.f3324e.m3407D().edit();
        edit.remove(this.f3321b);
        edit.remove(this.f3322c);
        edit.putLong(this.f3320a, mo14932a);
        edit.apply();
    }
}
