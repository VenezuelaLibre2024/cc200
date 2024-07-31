package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;
import p108h6.C2394s;
import p321w7.C5356e;

/* loaded from: classes.dex */
public final class zzafd implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C5356e zze;
    private String zzf;
    private String zzg;

    public zzafd(int i10) {
        this.zza = zza(i10);
    }

    private zzafd(int i10, C5356e c5356e, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C5356e) C2394s.m9619l(c5356e);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzafd zza(C5356e c5356e, String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(c5356e);
        return new zzafd(7, c5356e, null, str2, str, null, null);
    }

    private static String zza(int i10) {
        return i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzafd zza(String str) {
        this.zzg = str;
        return this;
    }

    public final zzafd zza(C5356e c5356e) {
        this.zze = (C5356e) C2394s.m9619l(c5356e);
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        int i10 = 1;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 7;
                break;
            case 3:
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Constants.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(Constants.ID_TOKEN, str4);
        }
        C5356e c5356e = this.zze;
        if (c5356e != null) {
            jSONObject.put("androidInstallApp", c5356e.m21468J());
            jSONObject.put("canHandleCodeInApp", this.zze.m21467I());
            if (this.zze.m21472N() != null) {
                jSONObject.put("continueUrl", this.zze.m21472N());
            }
            if (this.zze.m21471M() != null) {
                jSONObject.put("iosBundleId", this.zze.m21471M());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.m21470L() != null) {
                jSONObject.put("androidPackageName", this.zze.m21470L());
            }
            if (this.zze.m21469K() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.m21469K());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahb.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final zzafd zzb(String str) {
        this.zzb = C2394s.m9613f(str);
        return this;
    }

    public final C5356e zzb() {
        return this.zze;
    }

    public final zzafd zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafd zzd(String str) {
        this.zzd = C2394s.m9613f(str);
        return this;
    }
}
