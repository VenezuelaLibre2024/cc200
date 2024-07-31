package io.flutter.plugins.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p142j9.C3270h;
import p353y7.C5867c;

@Keep
/* loaded from: classes2.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        return Collections.singletonList(C3270h.m11823b(BuildConfig.LIBRARY_NAME, BuildConfig.LIBRARY_VERSION));
    }
}
