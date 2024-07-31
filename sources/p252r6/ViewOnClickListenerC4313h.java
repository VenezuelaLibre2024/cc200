package p252r6;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: r6.h */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4313h implements View.OnClickListener {

    /* renamed from: h */
    public final /* synthetic */ Context f15639h;

    /* renamed from: i */
    public final /* synthetic */ Intent f15640i;

    public ViewOnClickListenerC4313h(Context context, Intent intent) {
        this.f15639h = context;
        this.f15640i = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f15639h.startActivity(this.f15640i);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
