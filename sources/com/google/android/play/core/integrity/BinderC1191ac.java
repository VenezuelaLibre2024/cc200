package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import p097g7.AbstractBinderC2087a0;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.ac */
/* loaded from: classes.dex */
final class BinderC1191ac extends AbstractBinderC2087a0 {

    /* renamed from: a */
    public final /* synthetic */ C1192ad f4629a;

    /* renamed from: b */
    private final C2091c0 f4630b = new C2091c0("OnRequestIntegrityTokenCallback");

    /* renamed from: c */
    private final TaskCompletionSource f4631c;

    public BinderC1191ac(C1192ad c1192ad, TaskCompletionSource taskCompletionSource) {
        this.f4629a = c1192ad;
        this.f4631c = taskCompletionSource;
    }

    @Override // p097g7.InterfaceC2089b0
    /* renamed from: b */
    public final void mo5117b(Bundle bundle) {
        this.f4629a.f4632a.m8316v(this.f4631c);
        this.f4630b.m8293c("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(ImagePickerCache.MAP_KEY_ERROR);
        if (i10 != 0) {
            this.f4631c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f4631c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f4631c;
        C1188a c1188a = new C1188a();
        c1188a.mo5112c(string);
        c1188a.mo5111b(this.f4630b);
        c1188a.mo5110a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(c1188a.mo5113d());
    }
}
