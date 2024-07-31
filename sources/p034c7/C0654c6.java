package p034c7;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* renamed from: c7.c6 */
/* loaded from: classes.dex */
public final class C0654c6 implements zzo {

    /* renamed from: a */
    public final /* synthetic */ String f2824a;

    /* renamed from: b */
    public final /* synthetic */ C0906u5 f2825b;

    public C0654c6(C0906u5 c0906u5, String str) {
        this.f2824a = str;
        this.f2825b = c0906u5;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f2825b.f3615d;
        Map map2 = (Map) map.get(this.f2824a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
