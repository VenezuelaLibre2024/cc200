package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return C1243v.m5149a(context).m5146a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return C1198aj.m5123a(context).m5148a();
    }
}
