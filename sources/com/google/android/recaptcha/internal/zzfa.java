package com.google.android.recaptcha.internal;

import android.os.Build;
import gd.C2240n;
import java.util.Map;
import p115hd.C2488e0;

/* loaded from: classes.dex */
public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        Map m9898f = C2488e0.m9898f(C2240n.m8977a(-4, zzl.zzz), C2240n.m8977a(-12, zzl.zzA), C2240n.m8977a(-6, zzl.zzv), C2240n.m8977a(-11, zzl.zzx), C2240n.m8977a(-13, zzl.zzB), C2240n.m8977a(-14, zzl.zzC), C2240n.m8977a(-2, zzl.zzw), C2240n.m8977a(-7, zzl.zzD), C2240n.m8977a(-5, zzl.zzE), C2240n.m8977a(-9, zzl.zzF), C2240n.m8977a(-8, zzl.zzP), C2240n.m8977a(-15, zzl.zzy), C2240n.m8977a(-1, zzl.zzG), C2240n.m8977a(-3, zzl.zzI), C2240n.m8977a(-10, zzl.zzJ));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            m9898f.put(-16, zzl.zzH);
        }
        if (i10 >= 27) {
            m9898f.put(1, zzl.zzL);
            m9898f.put(2, zzl.zzM);
            m9898f.put(0, zzl.zzN);
            m9898f.put(3, zzl.zzO);
        }
        if (i10 >= 29) {
            m9898f.put(4, zzl.zzK);
        }
        return m9898f;
    }
}
