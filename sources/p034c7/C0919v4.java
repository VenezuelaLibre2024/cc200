package p034c7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzoe;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;

/* renamed from: c7.v4 */
/* loaded from: classes.dex */
public final class C0919v4 extends AbstractC0740i7 {

    /* renamed from: c */
    public char f3653c;

    /* renamed from: d */
    public long f3654d;

    /* renamed from: e */
    public String f3655e;

    /* renamed from: f */
    public final C0947x4 f3656f;

    /* renamed from: g */
    public final C0947x4 f3657g;

    /* renamed from: h */
    public final C0947x4 f3658h;

    /* renamed from: i */
    public final C0947x4 f3659i;

    /* renamed from: j */
    public final C0947x4 f3660j;

    /* renamed from: k */
    public final C0947x4 f3661k;

    /* renamed from: l */
    public final C0947x4 f3662l;

    /* renamed from: m */
    public final C0947x4 f3663m;

    /* renamed from: n */
    public final C0947x4 f3664n;

    public C0919v4(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3653c = (char) 0;
        this.f3654d = -1L;
        this.f3656f = new C0947x4(this, 6, false, false);
        this.f3657g = new C0947x4(this, 6, true, false);
        this.f3658h = new C0947x4(this, 6, false, true);
        this.f3659i = new C0947x4(this, 5, false, false);
        this.f3660j = new C0947x4(this, 5, true, false);
        this.f3661k = new C0947x4(this, 5, false, true);
        this.f3662l = new C0947x4(this, 4, false, false);
        this.f3663m = new C0947x4(this, 3, false, false);
        this.f3664n = new C0947x4(this, 2, false, false);
    }

    /* renamed from: q */
    public static Object m3906q(String str) {
        if (str == null) {
            return null;
        }
        return new C0623a5(str);
    }

    /* renamed from: r */
    public static String m3907r(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof C0623a5)) {
                return z10 ? "-" : String.valueOf(obj);
            }
            str = ((C0623a5) obj).f2759a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String m3912z = m3912z(C0767k6.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m3912z(className).equals(m3912z)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    /* renamed from: s */
    public static String m3908s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m3907r = m3907r(z10, obj);
        String m3907r2 = m3907r(z10, obj2);
        String m3907r3 = m3907r(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m3907r)) {
            sb2.append(str2);
            sb2.append(m3907r);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m3907r2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(m3907r2);
        }
        if (!TextUtils.isEmpty(m3907r3)) {
            sb2.append(str3);
            sb2.append(m3907r3);
        }
        return sb2.toString();
    }

    /* renamed from: z */
    public static String m3912z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (zzoe.zza() && C0733i0.f3044D0.m3607a(null).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C0947x4 m3913A() {
        return this.f3663m;
    }

    /* renamed from: B */
    public final C0947x4 m3914B() {
        return this.f3656f;
    }

    /* renamed from: C */
    public final C0947x4 m3915C() {
        return this.f3658h;
    }

    /* renamed from: D */
    public final C0947x4 m3916D() {
        return this.f3657g;
    }

    /* renamed from: E */
    public final C0947x4 m3917E() {
        return this.f3662l;
    }

    /* renamed from: F */
    public final C0947x4 m3918F() {
        return this.f3664n;
    }

    /* renamed from: G */
    public final C0947x4 m3919G() {
        return this.f3659i;
    }

    /* renamed from: H */
    public final C0947x4 m3920H() {
        return this.f3661k;
    }

    /* renamed from: I */
    public final C0947x4 m3921I() {
        return this.f3660j;
    }

    /* renamed from: J */
    public final String m3922J() {
        Pair<String, Long> m3609a;
        if (mo3095e().f3152f == null || (m3609a = mo3095e().f3152f.m3609a()) == null || m3609a == C0738i5.f3147B) {
            return null;
        }
        return String.valueOf(m3609a.second) + ":" + ((String) m3609a.first);
    }

    /* renamed from: K */
    public final String m3923K() {
        String str;
        synchronized (this) {
            if (this.f3655e == null) {
                this.f3655e = this.f3198a.m3494J() != null ? this.f3198a.m3494J() : "FA";
            }
            C2394s.m9619l(this.f3655e);
            str = this.f3655e;
        }
        return str;
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: o */
    public final boolean mo3146o() {
        return false;
    }

    /* renamed from: t */
    public final void m3924t(int i10, String str) {
        Log.println(i10, m3923K(), str);
    }

    /* renamed from: u */
    public final void m3925u(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z10 && m3926x(i10)) {
            m3924t(i10, m3908s(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C2394s.m9619l(str);
        C0669d6 m3486B = this.f3198a.m3486B();
        if (m3486B == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (m3486B.m3433n()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                m3486B.m3152y(new RunnableC0961y4(this, i10, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        m3924t(6, str2);
    }

    /* renamed from: x */
    public final boolean m3926x(int i10) {
        return Log.isLoggable(m3923K(), i10);
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
