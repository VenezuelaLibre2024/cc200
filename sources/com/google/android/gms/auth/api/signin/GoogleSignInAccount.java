package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a6.C0062d;
import p008a6.C0063e;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3938g;
import p207o6.InterfaceC3935d;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0063e();

    /* renamed from: u */
    @VisibleForTesting
    public static InterfaceC3935d f4412u = C3938g.m14938d();

    /* renamed from: h */
    public final int f4413h;

    /* renamed from: i */
    public String f4414i;

    /* renamed from: j */
    public String f4415j;

    /* renamed from: k */
    public String f4416k;

    /* renamed from: l */
    public String f4417l;

    /* renamed from: m */
    public Uri f4418m;

    /* renamed from: n */
    public String f4419n;

    /* renamed from: o */
    public long f4420o;

    /* renamed from: p */
    public String f4421p;

    /* renamed from: q */
    public List f4422q;

    /* renamed from: r */
    public String f4423r;

    /* renamed from: s */
    public String f4424s;

    /* renamed from: t */
    public Set f4425t = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f4413h = i10;
        this.f4414i = str;
        this.f4415j = str2;
        this.f4416k = str3;
        this.f4417l = str4;
        this.f4418m = uri;
        this.f4419n = str5;
        this.f4420o = j10;
        this.f4421p = str6;
        this.f4422q = list;
        this.f4423r = str7;
        this.f4424s = str8;
    }

    /* renamed from: Q */
    public static GoogleSignInAccount m4922Q(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), C2394s.m9613f(str7), new ArrayList((Collection) C2394s.m9619l(set)), str5, str6);
    }

    /* renamed from: R */
    public static GoogleSignInAccount m4923R(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount m4922Q = m4922Q(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(Constants.EMAIL) ? jSONObject.optString(Constants.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        m4922Q.f4419n = jSONObject.has(Constants.SERVER_AUTH_CODE) ? jSONObject.optString(Constants.SERVER_AUTH_CODE) : null;
        return m4922Q;
    }

    /* renamed from: C */
    public String m4924C() {
        return this.f4416k;
    }

    /* renamed from: I */
    public String m4925I() {
        return this.f4424s;
    }

    /* renamed from: J */
    public String m4926J() {
        return this.f4423r;
    }

    /* renamed from: K */
    public Set<Scope> m4927K() {
        return new HashSet(this.f4422q);
    }

    /* renamed from: L */
    public String m4928L() {
        return this.f4414i;
    }

    /* renamed from: M */
    public String m4929M() {
        return this.f4415j;
    }

    /* renamed from: N */
    public Set<Scope> m4930N() {
        HashSet hashSet = new HashSet(this.f4422q);
        hashSet.addAll(this.f4425t);
        return hashSet;
    }

    /* renamed from: O */
    public String m4931O() {
        return this.f4419n;
    }

    /* renamed from: P */
    public boolean m4932P() {
        return f4412u.mo14932a() / 1000 >= this.f4420o + (-300);
    }

    /* renamed from: S */
    public final String m4933S() {
        return this.f4421p;
    }

    /* renamed from: T */
    public final String m4934T() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m4928L() != null) {
                jSONObject.put("id", m4928L());
            }
            if (m4929M() != null) {
                jSONObject.put("tokenId", m4929M());
            }
            if (m4924C() != null) {
                jSONObject.put(Constants.EMAIL, m4924C());
            }
            if (m4936s() != null) {
                jSONObject.put("displayName", m4936s());
            }
            if (m4926J() != null) {
                jSONObject.put("givenName", m4926J());
            }
            if (m4925I() != null) {
                jSONObject.put("familyName", m4925I());
            }
            Uri m4935e = m4935e();
            if (m4935e != null) {
                jSONObject.put("photoUrl", m4935e.toString());
            }
            if (m4931O() != null) {
                jSONObject.put(Constants.SERVER_AUTH_CODE, m4931O());
            }
            jSONObject.put("expirationTime", this.f4420o);
            jSONObject.put("obfuscatedIdentifier", this.f4421p);
            JSONArray jSONArray = new JSONArray();
            List list = this.f4422q;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C0062d.f256h);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m4985I());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove(Constants.SERVER_AUTH_CODE);
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public Uri m4935e() {
        return this.f4418m;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4421p.equals(this.f4421p) && googleSignInAccount.m4930N().equals(m4930N());
    }

    public int hashCode() {
        return ((this.f4421p.hashCode() + 527) * 31) + m4930N().hashCode();
    }

    /* renamed from: s */
    public String m4936s() {
        return this.f4417l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f4413h);
        C2603c.m10456F(parcel, 2, m4928L(), false);
        C2603c.m10456F(parcel, 3, m4929M(), false);
        C2603c.m10456F(parcel, 4, m4924C(), false);
        C2603c.m10456F(parcel, 5, m4936s(), false);
        C2603c.m10454D(parcel, 6, m4935e(), i10, false);
        C2603c.m10456F(parcel, 7, m4931O(), false);
        C2603c.m10489y(parcel, 8, this.f4420o);
        C2603c.m10456F(parcel, 9, this.f4421p, false);
        C2603c.m10460J(parcel, 10, this.f4422q, false);
        C2603c.m10456F(parcel, 11, m4926J(), false);
        C2603c.m10456F(parcel, 12, m4925I(), false);
        C2603c.m10466b(parcel, m10465a);
    }

    /* renamed from: y */
    public Account m4937y() {
        String str = this.f4416k;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }
}
