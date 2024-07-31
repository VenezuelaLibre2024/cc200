package p228pc;

import java.util.HashMap;
import java.util.Map;
import nc.C3789c0;

/* renamed from: pc.h */
/* loaded from: classes2.dex */
public class C4116h {
    /* renamed from: a */
    public static Map<String, Object> m15888a(InterfaceC4113e interfaceC4113e) {
        C3789c0 mo15870b = interfaceC4113e.mo15870b();
        if (mo15870b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", mo15870b.m14435c());
        hashMap.put("arguments", mo15870b.m14434b());
        return hashMap;
    }
}
