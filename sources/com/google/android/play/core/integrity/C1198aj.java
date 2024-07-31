package com.google.android.play.core.integrity;

import android.content.Context;
import p097g7.C2096f;

/* renamed from: com.google.android.play.core.integrity.aj */
/* loaded from: classes.dex */
final class C1198aj {

    /* renamed from: a */
    private static C1240s f4640a;

    /* renamed from: a */
    public static synchronized C1240s m5123a(Context context) {
        C1240s c1240s;
        synchronized (C1198aj.class) {
            if (f4640a == null) {
                C1238q c1238q = new C1238q(null);
                c1238q.m5147a(C2096f.m8320a(context));
                f4640a = c1238q.mo5122b();
            }
            c1240s = f4640a;
        }
        return c1240s;
    }
}
