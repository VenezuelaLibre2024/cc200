package p171l8;

import org.json.JSONObject;
import p023b8.C0515g;
import p066e8.InterfaceC1756w;

/* renamed from: l8.g */
/* loaded from: classes.dex */
public class C3456g {

    /* renamed from: a */
    public final InterfaceC1756w f12149a;

    public C3456g(InterfaceC1756w interfaceC1756w) {
        this.f12149a = interfaceC1756w;
    }

    /* renamed from: a */
    public static InterfaceC3457h m12867a(int i10) {
        if (i10 == 3) {
            return new C3461l();
        }
        C0515g.m2482f().m2486d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new C3451b();
    }

    /* renamed from: b */
    public C3453d m12868b(JSONObject jSONObject) {
        return m12867a(jSONObject.getInt("settings_version")).mo12838a(this.f12149a, jSONObject);
    }
}
