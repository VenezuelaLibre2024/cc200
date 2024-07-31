package p337x7;

import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import java.util.HashMap;
import java.util.Map;
import p154k6.C3363a;
import p321w7.C5349c0;

/* renamed from: x7.m0 */
/* loaded from: classes.dex */
public final class C5698m0 {

    /* renamed from: a */
    public static final C3363a f21216a = new C3363a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C5349c0 m22786a(String str) {
        Map hashMap;
        try {
            hashMap = C5695l0.m22782b(str);
        } catch (zzxv e10) {
            f21216a.m12507b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new C5349c0(str, hashMap);
    }
}
