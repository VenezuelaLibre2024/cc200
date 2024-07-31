package p244qe;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;
import td.C4753m;

/* renamed from: qe.d */
/* loaded from: classes2.dex */
public final class C4252d extends PlatformViewFactory {

    /* renamed from: a */
    public final BinaryMessenger f15382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4252d(BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        C4753m.m18653f(binaryMessenger, "messenger");
        this.f15382a = binaryMessenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        C4753m.m18651d(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        if (context != null) {
            return new C4251c(context, this.f15382a, i10, hashMap);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
