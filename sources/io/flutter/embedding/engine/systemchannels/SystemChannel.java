package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class SystemChannel {
    private static final String TAG = "SystemChannel";
    public final BasicMessageChannel<Object> channel;

    public SystemChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/system", JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        Log.m11045v(TAG, "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, "memoryPressure");
        this.channel.send(hashMap);
    }
}
