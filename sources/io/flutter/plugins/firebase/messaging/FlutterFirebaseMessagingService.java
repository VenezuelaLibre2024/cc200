package io.flutter.plugins.firebase.messaging;

import com.google.firebase.messaging.C1287d;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(C1287d c1287d) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        FlutterFirebaseTokenLiveData.getInstance().postToken(str);
    }
}
