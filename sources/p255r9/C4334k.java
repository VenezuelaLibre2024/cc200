package p255r9;

import org.json.JSONObject;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.k */
/* loaded from: classes.dex */
public class C4334k extends AbstractC4328e {

    /* renamed from: m */
    public final JSONObject f15667m;

    public C4334k(C4217h c4217h, C3767g c3767g, JSONObject jSONObject) {
        super(c4217h, c3767g);
        this.f15667m = jSONObject;
        m16587G("X-HTTP-Method-Override", "PATCH");
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "PUT";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: g */
    public JSONObject mo16593g() {
        return this.f15667m;
    }
}
