package p337x7;

import com.google.android.gms.internal.p377firebaseauthapi.zzafv;
import p321w7.C5344b;
import p321w7.InterfaceC5352d;

/* renamed from: x7.c2 */
/* loaded from: classes.dex */
public final class C5664c2 implements InterfaceC5352d {

    /* renamed from: a */
    public final int f21131a;

    /* renamed from: b */
    public final String f21132b;

    /* renamed from: c */
    public final String f21133c;

    /* renamed from: d */
    public final C5344b f21134d;

    public C5664c2(zzafv zzafvVar) {
        this.f21132b = zzafvVar.zzg() ? zzafvVar.zzc() : zzafvVar.zzb();
        this.f21133c = zzafvVar.zzb();
        C5344b c5344b = null;
        if (!zzafvVar.zzh()) {
            this.f21131a = 3;
            this.f21134d = null;
            return;
        }
        String zzd = zzafvVar.zzd();
        zzd.hashCode();
        char c10 = 65535;
        int i10 = 5;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c10 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 6;
                break;
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f21131a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f21134d = null;
            return;
        }
        if (zzafvVar.zzf()) {
            c5344b = new C5668d2(zzafvVar.zzb(), C5704o0.m22792b(zzafvVar.zza()));
        } else if (zzafvVar.zzg()) {
            c5344b = new C5660b2(zzafvVar.zzc(), zzafvVar.zzb());
        } else if (zzafvVar.zze()) {
            c5344b = new C5656a2(zzafvVar.zzb());
        }
        this.f21134d = c5344b;
    }

    @Override // p321w7.InterfaceC5352d
    /* renamed from: a */
    public final int mo21459a() {
        return this.f21131a;
    }

    @Override // p321w7.InterfaceC5352d
    /* renamed from: b */
    public final C5344b mo21460b() {
        return this.f21134d;
    }
}
