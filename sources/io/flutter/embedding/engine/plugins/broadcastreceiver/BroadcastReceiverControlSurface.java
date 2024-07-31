package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.lifecycle.AbstractC0344f;

/* loaded from: classes2.dex */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver, AbstractC0344f abstractC0344f);

    void detachFromBroadcastReceiver();
}
