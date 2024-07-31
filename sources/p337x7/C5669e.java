package p337x7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzafb;
import com.google.android.gms.internal.p377firebaseauthapi.zzafr;
import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p321w7.InterfaceC5346b1;

/* renamed from: x7.e */
/* loaded from: classes.dex */
public final class C5669e extends AbstractC2601a implements InterfaceC5346b1 {
    public static final Parcelable.Creator<C5669e> CREATOR = new C5665d();

    /* renamed from: h */
    public String f21140h;

    /* renamed from: i */
    public String f21141i;

    /* renamed from: j */
    public String f21142j;

    /* renamed from: k */
    public String f21143k;

    /* renamed from: l */
    public Uri f21144l;

    /* renamed from: m */
    public String f21145m;

    /* renamed from: n */
    public String f21146n;

    /* renamed from: o */
    public boolean f21147o;

    /* renamed from: p */
    public String f21148p;

    public C5669e(zzafb zzafbVar, String str) {
        C2394s.m9619l(zzafbVar);
        C2394s.m9613f(str);
        this.f21140h = C2394s.m9613f(zzafbVar.zzi());
        this.f21141i = str;
        this.f21145m = zzafbVar.zzh();
        this.f21142j = zzafbVar.zzg();
        Uri zzc = zzafbVar.zzc();
        if (zzc != null) {
            this.f21143k = zzc.toString();
            this.f21144l = zzc;
        }
        this.f21147o = zzafbVar.zzm();
        this.f21148p = null;
        this.f21146n = zzafbVar.zzj();
    }

    public C5669e(zzafr zzafrVar) {
        C2394s.m9619l(zzafrVar);
        this.f21140h = zzafrVar.zzd();
        this.f21141i = C2394s.m9613f(zzafrVar.zzf());
        this.f21142j = zzafrVar.zzb();
        Uri zza = zzafrVar.zza();
        if (zza != null) {
            this.f21143k = zza.toString();
            this.f21144l = zza;
        }
        this.f21145m = zzafrVar.zzc();
        this.f21146n = zzafrVar.zze();
        this.f21147o = false;
        this.f21148p = zzafrVar.zzg();
    }

    public C5669e(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f21140h = str;
        this.f21141i = str2;
        this.f21145m = str3;
        this.f21146n = str4;
        this.f21142j = str5;
        this.f21143k = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f21144l = Uri.parse(this.f21143k);
        }
        this.f21147o = z10;
        this.f21148p = str7;
    }

    /* renamed from: I */
    public static C5669e m22747I(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C5669e(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzxv(e10);
        }
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: C */
    public final String mo21407C() {
        return this.f21145m;
    }

    /* renamed from: J */
    public final String m22748J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.f21140h);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.f21141i);
            jSONObject.putOpt("displayName", this.f21142j);
            jSONObject.putOpt("photoUrl", this.f21143k);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.EMAIL, this.f21145m);
            jSONObject.putOpt("phoneNumber", this.f21146n);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f21147o));
            jSONObject.putOpt("rawUserInfo", this.f21148p);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzxv(e10);
        }
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: b */
    public final String mo21427b() {
        return this.f21140h;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: c */
    public final String mo21443c() {
        return this.f21141i;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: e */
    public final Uri mo21431e() {
        if (!TextUtils.isEmpty(this.f21143k) && this.f21144l == null) {
            this.f21144l = Uri.parse(this.f21143k);
        }
        return this.f21144l;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: h */
    public final boolean mo21444h() {
        return this.f21147o;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: m */
    public final String mo21438m() {
        return this.f21146n;
    }

    @Override // p321w7.InterfaceC5346b1
    /* renamed from: s */
    public final String mo21439s() {
        return this.f21142j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, mo21427b(), false);
        C2603c.m10456F(parcel, 2, mo21443c(), false);
        C2603c.m10456F(parcel, 3, mo21439s(), false);
        C2603c.m10456F(parcel, 4, this.f21143k, false);
        C2603c.m10456F(parcel, 5, mo21407C(), false);
        C2603c.m10456F(parcel, 6, mo21438m(), false);
        C2603c.m10471g(parcel, 7, mo21444h());
        C2603c.m10456F(parcel, 8, this.f21148p, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zza() {
        return this.f21148p;
    }
}
