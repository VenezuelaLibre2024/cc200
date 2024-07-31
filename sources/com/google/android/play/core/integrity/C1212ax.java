package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import p097g7.AbstractBinderC2117t;
import p097g7.C2091c0;
import p097g7.C2092d;
import p097g7.C2113p;
import p097g7.InterfaceC2105j0;

/* renamed from: com.google.android.play.core.integrity.ax */
/* loaded from: classes.dex */
final class C1212ax {

    /* renamed from: a */
    public final C2092d f4664a;

    /* renamed from: b */
    private final C2091c0 f4665b;

    /* renamed from: c */
    private final String f4666c;

    /* renamed from: d */
    private final TaskCompletionSource f4667d;

    public C1212ax(Context context, C2091c0 c2091c0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4667d = taskCompletionSource;
        this.f4666c = context.getPackageName();
        this.f4665b = c2091c0;
        C2092d c2092d = new C2092d(context, c2091c0, "ExpressIntegrityService", C1213ay.f4668a, new InterfaceC2105j0() { // from class: com.google.android.play.core.integrity.ap
            @Override // p097g7.InterfaceC2105j0
            /* renamed from: a */
            public final Object mo5114a(IBinder iBinder) {
                return AbstractBinderC2117t.m8337c(iBinder);
            }
        }, null);
        this.f4664a = c2092d;
        c2092d.m8312c().post(new C1205aq(this, taskCompletionSource, context));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m5130a(C1212ax c1212ax, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c1212ax.f4666c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        C2113p.m8331b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C2113p.m8330a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m5131b(C1212ax c1212ax, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c1212ax.f4666c);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        C2113p.m8331b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C2113p.m8330a(arrayList)));
        return bundle;
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m5134g(C1212ax c1212ax) {
        return c1212ax.f4667d.getTask().isSuccessful() && !((Boolean) c1212ax.f4667d.getTask().getResult()).booleanValue();
    }

    /* renamed from: c */
    public final Task m5135c(String str, long j10, long j11) {
        this.f4665b.m8293c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4664a.m8314t(new C1207as(this, taskCompletionSource, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public final Task m5136d(long j10) {
        this.f4665b.m8293c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4664a.m8314t(new C1206ar(this, taskCompletionSource, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
