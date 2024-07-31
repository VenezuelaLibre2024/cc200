package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a6.C0064f;
import p008a6.C0065g;
import p008a6.C0066h;
import p021b6.C0481a;
import p021b6.C0483b;
import p079f6.C1841a;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC2601a implements C1841a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: s */
    public static final GoogleSignInOptions f4426s;

    /* renamed from: t */
    public static final GoogleSignInOptions f4427t;

    /* renamed from: u */
    @VisibleForTesting
    public static final Scope f4428u = new Scope("profile");

    /* renamed from: v */
    @VisibleForTesting
    public static final Scope f4429v = new Scope(Constants.EMAIL);

    /* renamed from: w */
    @VisibleForTesting
    public static final Scope f4430w = new Scope("openid");

    /* renamed from: x */
    @VisibleForTesting
    public static final Scope f4431x;

    /* renamed from: y */
    @VisibleForTesting
    public static final Scope f4432y;

    /* renamed from: z */
    public static Comparator f4433z;

    /* renamed from: h */
    public final int f4434h;

    /* renamed from: i */
    public final ArrayList f4435i;

    /* renamed from: j */
    public Account f4436j;

    /* renamed from: k */
    public boolean f4437k;

    /* renamed from: l */
    public final boolean f4438l;

    /* renamed from: m */
    public final boolean f4439m;

    /* renamed from: n */
    public String f4440n;

    /* renamed from: o */
    public String f4441o;

    /* renamed from: p */
    public ArrayList f4442p;

    /* renamed from: q */
    public String f4443q;

    /* renamed from: r */
    public Map f4444r;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes.dex */
    public static final class C1161a {

        /* renamed from: a */
        public Set f4445a;

        /* renamed from: b */
        public boolean f4446b;

        /* renamed from: c */
        public boolean f4447c;

        /* renamed from: d */
        public boolean f4448d;

        /* renamed from: e */
        public String f4449e;

        /* renamed from: f */
        public Account f4450f;

        /* renamed from: g */
        public String f4451g;

        /* renamed from: h */
        public Map f4452h;

        /* renamed from: i */
        public String f4453i;

        public C1161a() {
            this.f4445a = new HashSet();
            this.f4452h = new HashMap();
        }

        public C1161a(GoogleSignInOptions googleSignInOptions) {
            this.f4445a = new HashSet();
            this.f4452h = new HashMap();
            C2394s.m9619l(googleSignInOptions);
            this.f4445a = new HashSet(googleSignInOptions.f4435i);
            this.f4446b = googleSignInOptions.f4438l;
            this.f4447c = googleSignInOptions.f4439m;
            this.f4448d = googleSignInOptions.f4437k;
            this.f4449e = googleSignInOptions.f4440n;
            this.f4450f = googleSignInOptions.f4436j;
            this.f4451g = googleSignInOptions.f4441o;
            this.f4452h = GoogleSignInOptions.m4949b0(googleSignInOptions.f4442p);
            this.f4453i = googleSignInOptions.f4443q;
        }

        /* renamed from: a */
        public GoogleSignInOptions m4959a() {
            if (this.f4445a.contains(GoogleSignInOptions.f4432y)) {
                Set set = this.f4445a;
                Scope scope = GoogleSignInOptions.f4431x;
                if (set.contains(scope)) {
                    this.f4445a.remove(scope);
                }
            }
            if (this.f4448d && (this.f4450f == null || !this.f4445a.isEmpty())) {
                m4961c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f4445a), this.f4450f, this.f4448d, this.f4446b, this.f4447c, this.f4449e, this.f4451g, this.f4452h, this.f4453i);
        }

        /* renamed from: b */
        public C1161a m4960b() {
            this.f4445a.add(GoogleSignInOptions.f4429v);
            return this;
        }

        /* renamed from: c */
        public C1161a m4961c() {
            this.f4445a.add(GoogleSignInOptions.f4430w);
            return this;
        }

        /* renamed from: d */
        public C1161a m4962d(String str) {
            this.f4448d = true;
            m4969k(str);
            this.f4449e = str;
            return this;
        }

        /* renamed from: e */
        public C1161a m4963e() {
            this.f4445a.add(GoogleSignInOptions.f4428u);
            return this;
        }

        /* renamed from: f */
        public C1161a m4964f(Scope scope, Scope... scopeArr) {
            this.f4445a.add(scope);
            this.f4445a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: g */
        public C1161a m4965g(String str, boolean z10) {
            this.f4446b = true;
            m4969k(str);
            this.f4449e = str;
            this.f4447c = z10;
            return this;
        }

        /* renamed from: h */
        public C1161a m4966h(String str) {
            this.f4450f = new Account(C2394s.m9613f(str), "com.google");
            return this;
        }

        /* renamed from: i */
        public C1161a m4967i(String str) {
            this.f4451g = C2394s.m9613f(str);
            return this;
        }

        /* renamed from: j */
        public C1161a m4968j(String str) {
            this.f4453i = str;
            return this;
        }

        /* renamed from: k */
        public final String m4969k(String str) {
            C2394s.m9613f(str);
            String str2 = this.f4449e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            C2394s.m9609b(z10, "two different server client ids provided");
            return str;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f4431x = scope;
        f4432y = new Scope("https://www.googleapis.com/auth/games");
        C1161a c1161a = new C1161a();
        c1161a.m4961c();
        c1161a.m4963e();
        f4426s = c1161a.m4959a();
        C1161a c1161a2 = new C1161a();
        c1161a2.m4964f(scope, new Scope[0]);
        f4427t = c1161a2.m4959a();
        CREATOR = new C0066h();
        f4433z = new C0064f();
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, m4949b0(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f4434h = i10;
        this.f4435i = arrayList;
        this.f4436j = account;
        this.f4437k = z10;
        this.f4438l = z11;
        this.f4439m = z12;
        this.f4440n = str;
        this.f4441o = str2;
        this.f4442p = new ArrayList(map.values());
        this.f4444r = map;
        this.f4443q = str3;
    }

    public /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, C0065g c0065g) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    /* renamed from: Q */
    public static GoogleSignInOptions m4939Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* renamed from: b0 */
    public static Map m4949b0(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0481a c0481a = (C0481a) it.next();
            hashMap.put(Integer.valueOf(c0481a.m2412I()), c0481a);
        }
        return hashMap;
    }

    /* renamed from: I */
    public ArrayList<C0481a> m4950I() {
        return this.f4442p;
    }

    /* renamed from: J */
    public String m4951J() {
        return this.f4443q;
    }

    /* renamed from: K */
    public ArrayList<Scope> m4952K() {
        return new ArrayList<>(this.f4435i);
    }

    /* renamed from: L */
    public String m4953L() {
        return this.f4440n;
    }

    /* renamed from: M */
    public boolean m4954M() {
        return this.f4439m;
    }

    /* renamed from: N */
    public boolean m4955N() {
        return this.f4437k;
    }

    /* renamed from: O */
    public boolean m4956O() {
        return this.f4438l;
    }

    /* renamed from: U */
    public final String m4957U() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f4435i, f4433z);
            Iterator it = this.f4435i.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).m4985I());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f4436j;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f4437k);
            jSONObject.put("forceCodeForRefreshToken", this.f4439m);
            jSONObject.put("serverAuthRequested", this.f4438l);
            if (!TextUtils.isEmpty(this.f4440n)) {
                jSONObject.put("serverClientId", this.f4440n);
            }
            if (!TextUtils.isEmpty(this.f4441o)) {
                jSONObject.put("hostedDomain", this.f4441o);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.m4958y()) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f4442p     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList r1 = r4.f4442p     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f4435i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m4952K()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f4435i     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.m4952K()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f4436j     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.m4958y()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.m4958y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f4440n     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.m4953L()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f4440n     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.m4953L()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f4439m     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m4954M()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f4437k     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m4955N()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f4438l     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.m4956O()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f4443q     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.m4951J()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4435i;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).m4985I());
        }
        Collections.sort(arrayList);
        C0483b c0483b = new C0483b();
        c0483b.m2416a(arrayList);
        c0483b.m2416a(this.f4436j);
        c0483b.m2416a(this.f4440n);
        c0483b.m2418c(this.f4439m);
        c0483b.m2418c(this.f4437k);
        c0483b.m2418c(this.f4438l);
        c0483b.m2416a(this.f4443q);
        return c0483b.m2417b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f4434h);
        C2603c.m10460J(parcel, 2, m4952K(), false);
        C2603c.m10454D(parcel, 3, m4958y(), i10, false);
        C2603c.m10471g(parcel, 4, m4955N());
        C2603c.m10471g(parcel, 5, m4956O());
        C2603c.m10471g(parcel, 6, m4954M());
        C2603c.m10456F(parcel, 7, m4953L(), false);
        C2603c.m10456F(parcel, 8, this.f4441o, false);
        C2603c.m10460J(parcel, 9, m4950I(), false);
        C2603c.m10456F(parcel, 10, m4951J(), false);
        C2603c.m10466b(parcel, m10465a);
    }

    /* renamed from: y */
    public Account m4958y() {
        return this.f4436j;
    }
}
