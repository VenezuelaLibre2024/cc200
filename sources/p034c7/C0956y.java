package p034c7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p108h6.C2394s;

/* renamed from: c7.y */
/* loaded from: classes.dex */
public final class C0956y {

    /* renamed from: a */
    public final String f3752a;

    /* renamed from: b */
    public final String f3753b;

    /* renamed from: c */
    public final String f3754c;

    /* renamed from: d */
    public final long f3755d;

    /* renamed from: e */
    public final long f3756e;

    /* renamed from: f */
    public final C0618a0 f3757f;

    public C0956y(C0767k6 c0767k6, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        C0618a0 c0618a0;
        C2394s.m9613f(str2);
        C2394s.m9613f(str3);
        this.f3752a = str2;
        this.f3753b = str3;
        this.f3754c = TextUtils.isEmpty(str) ? null : str;
        this.f3755d = j10;
        this.f3756e = j11;
        if (j11 != 0 && j11 > j10) {
            c0767k6.zzj().m3919G().m3996b("Event created with reverse previous/current timestamps. appId", C0919v4.m3906q(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c0618a0 = new C0618a0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c0767k6.zzj().m3914B().m3995a("Param name can't be null");
                } else {
                    Object m3802n0 = c0767k6.m3491G().m3802n0(next, bundle2.get(next));
                    if (m3802n0 == null) {
                        c0767k6.zzj().m3919G().m3996b("Param value can't be null", c0767k6.m3517y().m3859f(next));
                    } else {
                        c0767k6.m3491G().m3776J(bundle2, next, m3802n0);
                    }
                }
                it.remove();
            }
            c0618a0 = new C0618a0(bundle2);
        }
        this.f3757f = c0618a0;
    }

    public C0956y(C0767k6 c0767k6, String str, String str2, String str3, long j10, long j11, C0618a0 c0618a0) {
        C2394s.m9613f(str2);
        C2394s.m9613f(str3);
        C2394s.m9619l(c0618a0);
        this.f3752a = str2;
        this.f3753b = str3;
        this.f3754c = TextUtils.isEmpty(str) ? null : str;
        this.f3755d = j10;
        this.f3756e = j11;
        if (j11 != 0 && j11 > j10) {
            c0767k6.zzj().m3919G().m3997c("Event created with reverse previous/current timestamps. appId, name", C0919v4.m3906q(str2), C0919v4.m3906q(str3));
        }
        this.f3757f = c0618a0;
    }

    /* renamed from: a */
    public final C0956y m4008a(C0767k6 c0767k6, long j10) {
        return new C0956y(c0767k6, this.f3754c, this.f3752a, this.f3753b, this.f3755d, j10, this.f3757f);
    }

    public final String toString() {
        return "Event{appId='" + this.f3752a + "', name='" + this.f3753b + "', params=" + String.valueOf(this.f3757f) + "}";
    }
}
