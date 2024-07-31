package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* loaded from: classes2.dex */
public class FlutterLifecycleAdapter {
    public static AbstractC0344f getActivityLifecycle(ActivityPluginBinding activityPluginBinding) {
        return ((HiddenLifecycleReference) activityPluginBinding.getLifecycle()).getLifecycle();
    }
}
