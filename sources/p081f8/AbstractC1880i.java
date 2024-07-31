package p081f8;

import com.google.auto.value.AutoValue;
import org.json.JSONObject;
import p098g8.AbstractC2135f0;
import p239q8.InterfaceC4202a;
import p269s8.C4553d;

@AutoValue
/* renamed from: f8.i */
/* loaded from: classes.dex */
public abstract class AbstractC1880i {

    /* renamed from: a */
    public static final InterfaceC4202a f7112a = new C4553d().m17993j(C1872a.f7066a).m17992i();

    /* renamed from: a */
    public static AbstractC1880i m7688a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return m7689b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    /* renamed from: b */
    public static AbstractC1880i m7689b(String str, String str2, String str3, String str4, long j10) {
        return new C1873b(str, str2, m7690i(str3), str4, j10);
    }

    /* renamed from: i */
    public static String m7690i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* renamed from: c */
    public abstract String mo7617c();

    /* renamed from: d */
    public abstract String mo7618d();

    /* renamed from: e */
    public abstract String mo7619e();

    /* renamed from: f */
    public abstract long mo7620f();

    /* renamed from: g */
    public abstract String mo7621g();

    /* renamed from: h */
    public AbstractC2135f0.e.d.AbstractC6180e m7691h() {
        return AbstractC2135f0.e.d.AbstractC6180e.m8660a().mo8668d(AbstractC2135f0.e.d.AbstractC6180e.b.m8670a().mo8675c(mo7621g()).mo8674b(mo7619e()).mo8673a()).mo8666b(mo7617c()).mo8667c(mo7618d()).mo8669e(mo7620f()).mo8665a();
    }
}
