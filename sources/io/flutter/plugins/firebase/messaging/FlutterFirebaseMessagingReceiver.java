package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.C1287d;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    private static final String TAG = "FLTFireMsgReceiver";
    public static HashMap<String, C1287d> notifications = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "broadcast received for message");
        if (ContextHolder.getApplicationContext() == null) {
            ContextHolder.setApplicationContext(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d(TAG, "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        C1287d c1287d = new C1287d(intent.getExtras());
        if (c1287d.m5514O() != null) {
            notifications.put(c1287d.m5511L(), c1287d);
            FlutterFirebaseMessagingStore.getInstance().storeFirebaseMessage(c1287d);
        }
        if (FlutterFirebaseMessagingUtils.isApplicationForeground(context)) {
            FlutterFirebaseRemoteMessageLiveData.getInstance().postRemoteMessage(c1287d);
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        intent2.putExtra(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, c1287d);
        FlutterFirebaseMessagingBackgroundService.enqueueMessageProcessing(context, intent2);
    }
}
