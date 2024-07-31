package p163l0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public final class C3399a extends ClickableSpan {

    /* renamed from: h */
    public final int f11901h;

    /* renamed from: i */
    public final C3400b f11902i;

    /* renamed from: j */
    public final int f11903j;

    public C3399a(int i10, C3400b c3400b, int i11) {
        this.f11901h = i10;
        this.f11902i = c3400b;
        this.f11903j = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f11901h);
        this.f11902i.m12654G(this.f11903j, bundle);
    }
}
