package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p285u.C4771a;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public final class C1284a {

    /* renamed from: a */
    public static final long f4875a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static C4771a<String, String> m5452a(Bundle bundle) {
            C4771a<String, String> c4771a = new C4771a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c4771a.put(str, str2);
                    }
                }
            }
            return c4771a;
        }
    }
}
