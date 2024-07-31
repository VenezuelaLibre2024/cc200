package p090g0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import io.flutter.plugins.firebase.crashlytics.Constants;
import td.C4753m;

/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class C1943c {

    /* renamed from: a */
    public static final C1943c f7752a = new C1943c();

    /* renamed from: a */
    public static final void m7850a(Bundle bundle, String str, Size size) {
        C4753m.m18653f(bundle, "bundle");
        C4753m.m18653f(str, Constants.KEY);
        bundle.putSize(str, size);
    }

    /* renamed from: b */
    public static final void m7851b(Bundle bundle, String str, SizeF sizeF) {
        C4753m.m18653f(bundle, "bundle");
        C4753m.m18653f(str, Constants.KEY);
        bundle.putSizeF(str, sizeF);
    }
}
