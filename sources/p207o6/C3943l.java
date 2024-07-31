package p207o6;

import java.util.HashMap;

/* renamed from: o6.l */
/* loaded from: classes.dex */
public class C3943l {
    /* renamed from: a */
    public static void m14951a(StringBuilder sb2, HashMap<String, String> hashMap) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : hashMap.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
