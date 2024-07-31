package com.google.android.play.core.integrity;

import android.content.Context;
import p097g7.C2096f;

/* renamed from: com.google.android.play.core.integrity.v */
/* loaded from: classes.dex */
final class C1243v {

    /* renamed from: a */
    private static C1236o f4709a;

    /* renamed from: a */
    public static synchronized C1236o m5149a(Context context) {
        C1236o c1236o;
        synchronized (C1243v.class) {
            if (f4709a == null) {
                C1232m c1232m = new C1232m(null);
                c1232m.m5142a(C2096f.m8320a(context));
                f4709a = c1232m.mo5143b();
            }
            c1236o = f4709a;
        }
        return c1236o;
    }
}
