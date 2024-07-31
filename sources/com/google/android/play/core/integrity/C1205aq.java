package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import p097g7.AbstractRunnableC2093d0;
import p097g7.C2100h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.aq */
/* loaded from: classes.dex */
public final class C1205aq extends AbstractRunnableC2093d0 {

    /* renamed from: a */
    public final /* synthetic */ Context f4649a;

    /* renamed from: b */
    public final /* synthetic */ C1212ax f4650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205aq(C1212ax c1212ax, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f4650b = c1212ax;
        this.f4649a = context;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.f4650b.f4667d;
        taskCompletionSource.trySetResult(Boolean.valueOf(C2100h.m8322a(this.f4649a)));
    }
}
