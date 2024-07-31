package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import p097g7.AbstractRunnableC2093d0;
import p097g7.C2094e;

/* renamed from: com.google.android.play.core.integrity.aw */
/* loaded from: classes.dex */
abstract class AbstractC1211aw extends AbstractRunnableC2093d0 {

    /* renamed from: f */
    public final /* synthetic */ C1212ax f4663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1211aw(C1212ax c1212ax, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f4663f = c1212ax;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: a */
    public final void mo5115a(Exception exc) {
        if (exc instanceof C2094e) {
            super.mo5115a(C1212ax.m5134g(this.f4663f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.mo5115a(exc);
        }
    }
}
