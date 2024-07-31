package p255r9;

import android.net.Uri;
import android.text.TextUtils;
import com.journeyapps.barcodescanner.C1393b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.j */
/* loaded from: classes.dex */
public class C4333j extends AbstractC4329f {

    /* renamed from: m */
    public final JSONObject f15665m;

    /* renamed from: n */
    public final String f15666n;

    public C4333j(C4217h c4217h, C3767g c3767g, JSONObject jSONObject, String str) {
        super(c4217h, c3767g);
        this.f15665m = jSONObject;
        this.f15666n = str;
        if (TextUtils.isEmpty(str)) {
            this.f15647a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.m16587G("X-Goog-Upload-Protocol", "resumable");
        super.m16587G("X-Goog-Upload-Command", "start");
        super.m16587G("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "POST";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: g */
    public JSONObject mo16593g() {
        return this.f15665m;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: l */
    public Map<String, String> mo16578l() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", m16596j());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: u */
    public Uri mo16579u() {
        String authority = m16603s().m16235a().getAuthority();
        Uri.Builder buildUpon = m16603s().m16236b().buildUpon();
        buildUpon.appendPath(C1393b.f5292o);
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
