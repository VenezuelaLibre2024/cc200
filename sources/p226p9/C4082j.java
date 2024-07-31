package p226p9;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: p9.j */
/* loaded from: classes.dex */
public final class C4082j {

    /* renamed from: a */
    public final List<C4093p> f14706a;

    /* renamed from: b */
    public final List<C4093p> f14707b;

    /* renamed from: c */
    public final String f14708c;

    public C4082j(List<C4093p> list, List<C4093p> list2, String str) {
        this.f14706a = list;
        this.f14707b = list2;
        this.f14708c = str;
    }

    /* renamed from: a */
    public static C4082j m15741a(C4074f c4074f, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(c4074f.m15708n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(c4074f.m15708n(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new C4082j(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    /* renamed from: b */
    public List<C4093p> m15742b() {
        return this.f14707b;
    }

    /* renamed from: c */
    public String m15743c() {
        return this.f14708c;
    }

    /* renamed from: d */
    public List<C4093p> m15744d() {
        return this.f14706a;
    }
}
