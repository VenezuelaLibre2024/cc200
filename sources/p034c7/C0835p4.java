package p034c7;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzqg;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import p034c7.C0810n7;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;

/* renamed from: c7.p4 */
/* loaded from: classes.dex */
public final class C0835p4 extends AbstractC0680e3 {

    /* renamed from: c */
    public String f3423c;

    /* renamed from: d */
    public String f3424d;

    /* renamed from: e */
    public int f3425e;

    /* renamed from: f */
    public String f3426f;

    /* renamed from: g */
    public String f3427g;

    /* renamed from: h */
    public long f3428h;

    /* renamed from: i */
    public long f3429i;

    /* renamed from: j */
    public List<String> f3430j;

    /* renamed from: k */
    public String f3431k;

    /* renamed from: l */
    public int f3432l;

    /* renamed from: m */
    public String f3433m;

    /* renamed from: n */
    public String f3434n;

    /* renamed from: o */
    public String f3435o;

    /* renamed from: p */
    public long f3436p;

    /* renamed from: q */
    public String f3437q;

    public C0835p4(C0767k6 c0767k6, long j10) {
        super(c0767k6);
        this.f3436p = 0L;
        this.f3437q = null;
        this.f3429i = j10;
    }

    /* renamed from: A */
    public final String m3697A() {
        m3155q();
        C2394s.m9619l(this.f3423c);
        return this.f3423c;
    }

    /* renamed from: B */
    public final String m3698B() {
        mo3099i();
        m3155q();
        C2394s.m9619l(this.f3433m);
        return this.f3433m;
    }

    /* renamed from: C */
    public final List<String> m3699C() {
        return this.f3430j;
    }

    /* renamed from: D */
    public final void m3700D() {
        String format;
        mo3099i();
        if (mo3095e().m3410G().m3633l(C0810n7.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            mo3096f().m3783P0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().m3913A().m3995a("Analytics Storage consent is not granted");
            format = null;
        }
        C0947x4 m3913A = zzj().m3913A();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        m3913A.m3995a(String.format("Resetting session stitching token to %s", objArr));
        this.f3435o = format;
        this.f3436p = zzb().mo14932a();
    }

    /* renamed from: E */
    public final String m3701E() {
        C0947x4 m3921I;
        String str;
        if (zzqg.zza() && mo3092a().m3281o(C0733i0.f3114l0)) {
            m3921I = zzj().m3918F();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        m3921I = zzj().m3920H();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    m3921I = zzj().m3921I();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        m3921I.m3995a(str);
        return null;
    }

    /* renamed from: F */
    public final boolean m3702F(String str) {
        String str2 = this.f3437q;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.f3437q = str;
        return z10;
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

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.C0695f4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0633b0 mo3100j() {
        return super.mo3100j();
    }

    @Override // p034c7.C0695f4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0835p4 mo3101k() {
        return super.mo3101k();
    }

    @Override // p034c7.C0695f4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0877s4 mo3102l() {
        return super.mo3102l();
    }

    @Override // p034c7.C0695f4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0936w7 mo3103m() {
        return super.mo3103m();
    }

    @Override // p034c7.C0695f4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0840p9 mo3104n() {
        return super.mo3104n();
    }

    @Override // p034c7.C0695f4
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0966y9 mo3105o() {
        return super.mo3105o();
    }

    @Override // p034c7.C0695f4
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C0716gb mo3106p() {
        return super.mo3106p();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(6:69|70|(1:72)(2:87|(1:89))|73|74|(22:76|(1:78)(1:85)|80|81|5|(1:68)(1:9)|10|11|13|(1:15)(1:58)|16|(1:18)|19|20|(1:22)(1:55)|23|(1:25)|(3:27|(1:29)(1:32)|30)|33|(3:35|(1:37)(3:39|(3:42|(1:44)(1:45)|40)|46)|38)|(1:48)|(2:50|51)(2:53|54)))|4|5|(1:7)|68|10|11|13|(0)(0)|16|(0)|19|20|(0)(0)|23|(0)|(0)|33|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
    
        zzj().m3914B().m3997c("Fetching Google App Id failed with exception. appId", p034c7.C0919v4.m3906q(r0), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154 A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x016d, B:29:0x0181, B:30:0x0186, B:32:0x0184), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x016d, B:29:0x0181, B:30:0x0186, B:32:0x0184), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // p034c7.AbstractC0680e3
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3158t() {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0835p4.mo3158t():void");
    }

    @Override // p034c7.AbstractC0680e3
    /* renamed from: v */
    public final boolean mo3160v() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0871rc m3703w(java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0835p4.m3703w(java.lang.String):c7.rc");
    }

    /* renamed from: x */
    public final int m3704x() {
        m3155q();
        return this.f3432l;
    }

    /* renamed from: y */
    public final int m3705y() {
        m3155q();
        return this.f3425e;
    }

    /* renamed from: z */
    public final String m3706z() {
        m3155q();
        return this.f3434n;
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
