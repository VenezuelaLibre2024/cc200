package p034c7;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzph;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p130ib.C2699n;

/* renamed from: c7.k5 */
/* loaded from: classes.dex */
public final class C0766k5 {

    /* renamed from: a */
    public final String f3211a;

    /* renamed from: b */
    public final Bundle f3212b;

    /* renamed from: c */
    public Bundle f3213c;

    /* renamed from: d */
    public final /* synthetic */ C0738i5 f3214d;

    public C0766k5(C0738i5 c0738i5, String str, Bundle bundle) {
        this.f3214d = c0738i5;
        C2394s.m9613f(str);
        this.f3211a = str;
        this.f3212b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m3477a() {
        if (this.f3213c == null) {
            String string = this.f3214d.m3407D().getString(this.f3211a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(C2699n.f10571b);
                            String string3 = jSONObject.getString("t");
                            char c10 = 65535;
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode != 115) {
                                        if (hashCode != 3352) {
                                            if (hashCode == 3445 && string3.equals("la")) {
                                                c10 = 4;
                                            }
                                        } else if (string3.equals("ia")) {
                                            c10 = 3;
                                        }
                                    } else if (string3.equals("s")) {
                                        c10 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c10 = 2;
                                }
                            } else if (string3.equals("d")) {
                                c10 = 1;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c10 != 3) {
                                if (c10 != 4) {
                                    this.f3214d.zzj().m3914B().m3996b("Unrecognized persisted bundle type. Type", string3);
                                } else if (zzph.zza() && this.f3214d.mo3092a().m3281o(C0733i0.f3054I0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    long[] jArr = new long[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        jArr[i11] = jSONArray2.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            } else if (zzph.zza() && this.f3214d.mo3092a().m3281o(C0733i0.f3054I0)) {
                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                int length2 = jSONArray3.length();
                                int[] iArr = new int[length2];
                                for (int i12 = 0; i12 < length2; i12++) {
                                    iArr[i12] = jSONArray3.optInt(i12);
                                }
                                bundle.putIntArray(string2, iArr);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f3214d.zzj().m3914B().m3995a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f3213c = bundle;
                } catch (JSONException unused2) {
                    this.f3214d.zzj().m3914B().m3995a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f3213c == null) {
                this.f3213c = this.f3212b;
            }
        }
        return this.f3213c;
    }

    /* renamed from: b */
    public final void m3478b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f3214d.m3407D().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f3211a);
        } else {
            edit.putString(this.f3211a, m3479c(bundle));
        }
        edit.apply();
        this.f3213c = bundle;
    }

    /* renamed from: c */
    public final String m3479c(Bundle bundle) {
        C0947x4 m3914B;
        Class<?> cls;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C2699n.f10571b, str2);
                    if (!zzph.zza() || !this.f3214d.mo3092a().m3281o(C0733i0.f3054I0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            m3914B = this.f3214d.zzj().m3914B();
                            cls = obj.getClass();
                            m3914B.m3996b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                    } else {
                        if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            str = "ia";
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            str = "la";
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                        } else {
                            m3914B = this.f3214d.zzj().m3914B();
                            cls = obj.getClass();
                            m3914B.m3996b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                        jSONObject.put("t", str);
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e10) {
                    this.f3214d.zzj().m3914B().m3996b("Cannot serialize bundle value to SharedPreferences", e10);
                }
            }
        }
        return jSONArray.toString();
    }
}
