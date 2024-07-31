package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p097g7.AbstractBinderC2122y;
import p097g7.C2091c0;
import p097g7.C2092d;
import p097g7.C2100h;
import p097g7.C2113p;
import p097g7.InterfaceC2105j0;

/* renamed from: com.google.android.play.core.integrity.ad */
/* loaded from: classes.dex */
final class C1192ad {

    /* renamed from: a */
    public final C2092d f4632a;

    /* renamed from: b */
    private final C2091c0 f4633b;

    /* renamed from: c */
    private final String f4634c;

    public C1192ad(Context context, C2091c0 c2091c0) {
        this.f4634c = context.getPackageName();
        this.f4633b = c2091c0;
        if (C2100h.m8322a(context)) {
            this.f4632a = new C2092d(context, c2091c0, "IntegrityService", C1193ae.f4635a, new InterfaceC2105j0() { // from class: com.google.android.play.core.integrity.aa
                @Override // p097g7.InterfaceC2105j0
                /* renamed from: a */
                public final Object mo5114a(IBinder iBinder) {
                    return AbstractBinderC2122y.m8339c(iBinder);
                }
            }, null);
        } else {
            c2091c0.m8291a("Phonesky is not installed.", new Object[0]);
            this.f4632a = null;
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m5118a(C1192ad c1192ad, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c1192ad.f4634c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        C2113p.m8331b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C2113p.m8330a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    public final Task m5120b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f4632a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (Build.VERSION.SDK_INT >= 23) {
                integrityTokenRequest.mo5107a();
            }
            this.f4633b.m8293c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f4632a.m8314t(new C1190ab(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
