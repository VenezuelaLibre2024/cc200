package p034c7;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p207o6.InterfaceC3935d;
import p345y.C5782a;

/* renamed from: c7.z */
/* loaded from: classes.dex */
public final class C0970z extends AbstractC0740i7 {

    /* renamed from: c */
    public long f3826c;

    /* renamed from: d */
    public String f3827d;

    /* renamed from: e */
    public AccountManager f3828e;

    /* renamed from: f */
    public Boolean f3829f;

    /* renamed from: g */
    public long f3830g;

    public C0970z(C0767k6 c0767k6) {
        super(c0767k6);
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
        Calendar calendar = Calendar.getInstance();
        this.f3826c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f3827d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* renamed from: p */
    public final long m4119p() {
        mo3099i();
        return this.f3830g;
    }

    /* renamed from: q */
    public final long m4120q() {
        m3430k();
        return this.f3826c;
    }

    /* renamed from: r */
    public final String m4121r() {
        m3430k();
        return this.f3827d;
    }

    /* renamed from: s */
    public final void m4122s() {
        mo3099i();
        this.f3829f = null;
        this.f3830g = 0L;
    }

    /* renamed from: t */
    public final boolean m4123t() {
        mo3099i();
        long mo14932a = zzb().mo14932a();
        if (mo14932a - this.f3830g > 86400000) {
            this.f3829f = null;
        }
        Boolean bool = this.f3829f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C5782a.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().m3921I().m3995a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f3828e == null) {
                this.f3828e = AccountManager.get(zza());
            }
            try {
                Account[] result = this.f3828e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f3829f = Boolean.TRUE;
                    this.f3830g = mo14932a;
                    return true;
                }
                Account[] result2 = this.f3828e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f3829f = Boolean.TRUE;
                    this.f3830g = mo14932a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                zzj().m3916D().m3996b("Exception checking account types", e10);
            }
        }
        this.f3830g = mo14932a;
        this.f3829f = Boolean.FALSE;
        return false;
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
