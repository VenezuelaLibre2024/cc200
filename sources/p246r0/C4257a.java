package p246r0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import td.C4747g;
import td.C4753m;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C4257a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4257a(String str, Throwable th) {
        super(str, th);
        C4753m.m18653f(str, Constants.MESSAGE);
    }

    public /* synthetic */ C4257a(String str, Throwable th, int i10, C4747g c4747g) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
