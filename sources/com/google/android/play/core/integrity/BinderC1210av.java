package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.av */
/* loaded from: classes.dex */
final class BinderC1210av extends BinderC1208at {

    /* renamed from: c */
    private final C2091c0 f4662c;

    public BinderC1210av(C1212ax c1212ax, TaskCompletionSource taskCompletionSource) {
        super(c1212ax, taskCompletionSource);
        this.f4662c = new C2091c0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC1208at, p097g7.InterfaceC2120w
    /* renamed from: e */
    public final void mo5129e(Bundle bundle) {
        super.mo5129e(bundle);
        this.f4662c.m8293c("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(ImagePickerCache.MAP_KEY_ERROR);
        if (i10 != 0) {
            this.f4659a.trySetException(new StandardIntegrityException(i10, null));
        } else {
            this.f4659a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
