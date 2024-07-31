package p255r9;

import android.net.Uri;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.HashMap;
import java.util.Map;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.d */
/* loaded from: classes.dex */
public class C4327d extends AbstractC4328e {

    /* renamed from: m */
    public final Integer f15643m;

    /* renamed from: n */
    public final String f15644n;

    public C4327d(C4217h c4217h, C3767g c3767g, Integer num, String str) {
        super(c4217h, c3767g);
        this.f15643m = num;
        this.f15644n = str;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "GET";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: l */
    public Map<String, String> mo16578l() {
        HashMap hashMap = new HashMap();
        String m16596j = m16596j();
        if (!m16596j.isEmpty()) {
            hashMap.put("prefix", m16596j + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        }
        hashMap.put("delimiter", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        Integer num = this.f15643m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f15644n)) {
            hashMap.put("pageToken", this.f15644n);
        }
        return hashMap;
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: u */
    public Uri mo16579u() {
        return Uri.parse(m16603s().m16236b() + "/b/" + m16603s().m16235a().getAuthority() + "/o");
    }
}
