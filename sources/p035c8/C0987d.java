package p035c8;

import android.os.Bundle;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p023b8.C0515g;
import p050d8.InterfaceC1601a;
import p050d8.InterfaceC1602b;

/* renamed from: c8.d */
/* loaded from: classes.dex */
public class C0987d implements InterfaceC0985b, InterfaceC1602b {

    /* renamed from: a */
    public InterfaceC1601a f3869a;

    /* renamed from: b */
    public static String m4143b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    @Override // p050d8.InterfaceC1602b
    /* renamed from: a */
    public void mo302a(InterfaceC1601a interfaceC1601a) {
        this.f3869a = interfaceC1601a;
        C0515g.m2482f().m2484b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p035c8.InterfaceC0985b
    /* renamed from: f */
    public void mo4142f(String str, Bundle bundle) {
        InterfaceC1601a interfaceC1601a = this.f3869a;
        if (interfaceC1601a != null) {
            try {
                interfaceC1601a.mo6434a("$A$:" + m4143b(str, bundle));
            } catch (JSONException unused) {
                C0515g.m2482f().m2492k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
