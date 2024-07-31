package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import p097g7.C2091c0;

/* renamed from: com.google.android.play.core.integrity.au */
/* loaded from: classes.dex */
final class BinderC1209au extends BinderC1208at {

    /* renamed from: c */
    private final C2091c0 f4661c;

    public BinderC1209au(C1212ax c1212ax, TaskCompletionSource taskCompletionSource) {
        super(c1212ax, taskCompletionSource);
        this.f4661c = new C2091c0("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC1208at, p097g7.InterfaceC2120w
    /* renamed from: c */
    public final void mo5127c(Bundle bundle) {
        super.mo5127c(bundle);
        this.f4661c.m8293c("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(ImagePickerCache.MAP_KEY_ERROR);
        if (i10 != 0) {
            this.f4659a.trySetException(new StandardIntegrityException(i10, null));
            return;
        }
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("dialog.intent", PendingIntent.class) : bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f4659a;
        C1215b c1215b = new C1215b();
        c1215b.mo5139c(bundle.getString("token"));
        c1215b.mo5138b(this.f4661c);
        c1215b.mo5137a((PendingIntent) parcelable);
        taskCompletionSource.trySetResult(c1215b.mo5140d());
    }
}
