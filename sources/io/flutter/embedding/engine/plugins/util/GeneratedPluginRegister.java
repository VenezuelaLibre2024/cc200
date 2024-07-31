package io.flutter.embedding.engine.plugins.util;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* loaded from: classes2.dex */
public class GeneratedPluginRegister {
    private static final String TAG = "GeneratedPluginsRegister";

    public static void registerGeneratedPlugins(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e10) {
            Log.m11041e(TAG, "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.m11042e(TAG, "Received exception while registering", e10);
        }
    }
}
