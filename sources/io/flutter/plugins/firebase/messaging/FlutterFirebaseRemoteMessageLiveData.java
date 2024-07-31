package io.flutter.plugins.firebase.messaging;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.C1287d;

/* loaded from: classes2.dex */
public class FlutterFirebaseRemoteMessageLiveData extends LiveData<C1287d> {
    private static FlutterFirebaseRemoteMessageLiveData instance;

    public static FlutterFirebaseRemoteMessageLiveData getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseRemoteMessageLiveData();
        }
        return instance;
    }

    public void postRemoteMessage(C1287d c1287d) {
        postValue(c1287d);
    }
}
