package p108h6;

import android.app.Activity;
import android.content.Intent;

/* renamed from: h6.g0 */
/* loaded from: classes.dex */
public final class C2359g0 extends AbstractDialogInterfaceOnClickListenerC2365i0 {

    /* renamed from: h */
    public final /* synthetic */ Intent f9631h;

    /* renamed from: i */
    public final /* synthetic */ Activity f9632i;

    /* renamed from: j */
    public final /* synthetic */ int f9633j;

    public C2359g0(Intent intent, Activity activity, int i10) {
        this.f9631h = intent;
        this.f9632i = activity;
        this.f9633j = i10;
    }

    @Override // p108h6.AbstractDialogInterfaceOnClickListenerC2365i0
    /* renamed from: a */
    public final void mo9552a() {
        Intent intent = this.f9631h;
        if (intent != null) {
            this.f9632i.startActivityForResult(intent, this.f9633j);
        }
    }
}
