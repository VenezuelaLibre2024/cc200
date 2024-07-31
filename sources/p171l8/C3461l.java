package p171l8;

import org.json.JSONObject;
import p066e8.InterfaceC1756w;
import p171l8.C3453d;

/* renamed from: l8.l */
/* loaded from: classes.dex */
public class C3461l implements InterfaceC3457h {
    /* renamed from: b */
    public static C3453d.a m12869b(JSONObject jSONObject) {
        return new C3453d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    public static C3453d.b m12870c(JSONObject jSONObject) {
        return new C3453d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    public static long m12871d(InterfaceC1756w interfaceC1756w, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : interfaceC1756w.mo6865a() + (j10 * 1000);
    }

    @Override // p171l8.InterfaceC3457h
    /* renamed from: a */
    public C3453d mo12838a(InterfaceC1756w interfaceC1756w, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C3453d(m12871d(interfaceC1756w, optInt2, jSONObject), m12870c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), m12869b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
