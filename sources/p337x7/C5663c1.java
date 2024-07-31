package p337x7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p154k6.C3363a;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5377j0;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.c1 */
/* loaded from: classes.dex */
public final class C5663c1 {

    /* renamed from: a */
    public Context f21127a;

    /* renamed from: b */
    public String f21128b;

    /* renamed from: c */
    public SharedPreferences f21129c;

    /* renamed from: d */
    public C3363a f21130d;

    public C5663c1(Context context, String str) {
        C2394s.m9619l(context);
        this.f21128b = C2394s.m9613f(str);
        this.f21127a = context.getApplicationContext();
        this.f21129c = this.f21127a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f21128b), 0);
        this.f21130d = new C3363a("StorageHelpers", new String[0]);
    }

    /* renamed from: a */
    public final zzafm m22731a(AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(abstractC5341a0);
        String string = this.f21129c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5341a0.mo21427b()), null);
        if (string != null) {
            return zzafm.zzb(string);
        }
        return null;
    }

    /* renamed from: b */
    public final AbstractC5341a0 m22732b() {
        String string = this.f21129c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(ImagePickerCache.MAP_KEY_TYPE) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(ImagePickerCache.MAP_KEY_TYPE))) {
                return m22733c(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final C5685i m22733c(JSONObject jSONObject) {
        JSONArray jSONArray;
        C5691k m22775b;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(C5669e.m22747I(jSONArray2.getString(i10)));
            }
            C5685i c5685i = new C5685i(C3767g.m14335p(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c5685i.mo21433f0(zzafm.zzb(string));
            }
            if (!z10) {
                c5685i.mo21434g0();
            }
            c5685i.m22760k0(str);
            if (jSONObject.has("userMetadata") && (m22775b = C5691k.m22775b(jSONObject.getJSONObject("userMetadata"))) != null) {
                c5685i.m22762m0(m22775b);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i11));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add(Constants.SIGN_IN_METHOD_PHONE.equals(optString) ? C5403r0.m21550L(jSONObject2) : Objects.equals(optString, "totp") ? C5421x0.m21570L(jSONObject2) : null);
                }
                c5685i.mo21435h0(arrayList2);
            }
            return c5685i;
        } catch (zzxv | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e10) {
            this.f21130d.m12515j(e10);
            return null;
        }
    }

    /* renamed from: d */
    public final void m22734d(String str) {
        this.f21129c.edit().remove(str).apply();
    }

    /* renamed from: e */
    public final void m22735e(AbstractC5341a0 abstractC5341a0, zzafm zzafmVar) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(zzafmVar);
        this.f21129c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5341a0.mo21427b()), zzafmVar.zzf()).apply();
    }

    /* renamed from: f */
    public final void m22736f(AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(abstractC5341a0);
        String m22737g = m22737g(abstractC5341a0);
        if (TextUtils.isEmpty(m22737g)) {
            return;
        }
        this.f21129c.edit().putString("com.google.firebase.auth.FIREBASE_USER", m22737g).apply();
    }

    /* renamed from: g */
    public final String m22737g(AbstractC5341a0 abstractC5341a0) {
        JSONObject jSONObject = new JSONObject();
        if (!C5685i.class.isAssignableFrom(abstractC5341a0.getClass())) {
            return null;
        }
        C5685i c5685i = (C5685i) abstractC5341a0;
        try {
            jSONObject.put("cachedTokenState", c5685i.zze());
            jSONObject.put("applicationName", c5685i.mo21430d0().m14350q());
            jSONObject.put(ImagePickerCache.MAP_KEY_TYPE, "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c5685i.m22766q0() != null) {
                JSONArray jSONArray = new JSONArray();
                List<C5669e> m22766q0 = c5685i.m22766q0();
                int size = m22766q0.size();
                if (m22766q0.size() > 30) {
                    this.f21130d.m12513h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(m22766q0.size()));
                    size = 30;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    C5669e c5669e = m22766q0.get(i10);
                    if (c5669e.mo21443c().equals("firebase")) {
                        z10 = true;
                    }
                    if (i10 == size - 1 && !z10) {
                        break;
                    }
                    jSONArray.put(c5669e.m22748J());
                }
                if (!z10) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= m22766q0.size() || i11 < 0) {
                            break;
                        }
                        C5669e c5669e2 = m22766q0.get(i11);
                        if (c5669e2.mo21443c().equals("firebase")) {
                            jSONArray.put(c5669e2.m22748J());
                            z10 = true;
                            break;
                        }
                        if (i11 == m22766q0.size() - 1) {
                            jSONArray.put(c5669e2.m22748J());
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f21130d.m12513h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(m22766q0.size()), Integer.valueOf(size));
                        if (m22766q0.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            Iterator<C5669e> it = m22766q0.iterator();
                            while (it.hasNext()) {
                                sb2.append(String.format("Provider - %s\n", it.next().mo21443c()));
                            }
                            this.f21130d.m12513h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c5685i.mo21414O());
            jSONObject.put("version", "2");
            if (c5685i.mo21410K() != null) {
                jSONObject.put("userMetadata", ((C5691k) c5685i.mo21410K()).m22776a());
            }
            List<AbstractC5377j0> mo21502b = ((C5697m) c5685i.mo21411L()).mo21502b();
            if (mo21502b != null && !mo21502b.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < mo21502b.size(); i12++) {
                    jSONArray2.put(mo21502b.get(i12).mo21514K());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f21130d.m12514i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzxv(e10);
        }
    }
}
