package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p048d6.C1561a;
import p048d6.C1567d;
import p099g9.AbstractServiceC2174g;
import p099g9.C2166d;
import p099g9.C2186m;
import p099g9.C2191o0;
import p099g9.C2193p0;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC2174g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C1567d rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C1286c.m5484t(extras)) {
            C1286c c1286c = new C1286c(extras);
            ExecutorService m8798e = C2186m.m8798e();
            try {
                if (new C2166d(this, c1286c, m8798e).m8725a()) {
                    return;
                }
                if (C1285b.m5454B(intent)) {
                    C1285b.m5475t(intent);
                }
            } finally {
                m8798e.shutdown();
            }
        }
        onMessageReceived(new C1287d(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C1567d getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new C1567d(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        getRpc(this).m6412a(new C1561a(intent));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                C1285b.m5477v(intent);
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new C2191o0(intent.getStringExtra(ImagePickerCache.MAP_KEY_ERROR)));
                return;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // p099g9.AbstractServiceC2174g
    public Intent getStartCommandIntent(Intent intent) {
        return C2193p0.m8808b().m8810c();
    }

    @Override // p099g9.AbstractServiceC2174g
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
            return;
        }
        if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(C1287d c1287d) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(C1567d c1567d) {
        this.rpc = c1567d;
    }
}
