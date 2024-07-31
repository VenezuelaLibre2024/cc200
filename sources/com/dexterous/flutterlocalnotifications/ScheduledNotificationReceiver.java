package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import p329x.C5497o;
import p339x9.C5740a;

@Keep
/* loaded from: classes.dex */
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    private static final String TAG = "ScheduledNotifReceiver";

    /* renamed from: com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver$1 */
    /* loaded from: classes.dex */
    public class C11411 extends C5740a<NotificationDetails> {
        public C11411() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (!StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().m5585h(stringExtra, new C5740a<NotificationDetails>() { // from class: com.dexterous.flutterlocalnotifications.ScheduledNotificationReceiver.1
                public C11411() {
                }
            }.getType());
            FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
            FlutterLocalNotificationsPlugin.scheduleNextNotification(context, notificationDetails);
            return;
        }
        int intExtra = intent.getIntExtra("notification_id", 0);
        Notification notification = (Notification) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, Notification.class) : intent.getParcelableExtra(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE));
        if (notification == null) {
            FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
            Log.e(TAG, "Failed to parse a notification from  Intent. ID: " + intExtra);
            return;
        }
        notification.when = System.currentTimeMillis();
        C5497o.m22067f(context).m22076i(intExtra, notification);
        if (intent.getBooleanExtra("repeat", false)) {
            return;
        }
        FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
    }
}
