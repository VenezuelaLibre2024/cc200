package com.google.android.recaptcha.internal;

import android.content.Context;
import gd.C2240n;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;
import p115hd.C2488e0;

/* loaded from: classes.dex */
public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = C2488e0.m9897e(C2240n.m8977a(2, "activity"), C2240n.m8977a(3, Constants.SIGN_IN_METHOD_PHONE), C2240n.m8977a(4, "input_method"), C2240n.m8977a(5, "audio"));

    public zzeo(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    /* renamed from: cs */
    public final /* synthetic */ Object mo5151cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzae(4, 5, null);
        }
        Object obj2 = this.zzc.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zzb.getSystemService((String) obj2);
        }
        throw new zzae(4, 4, null);
    }
}
