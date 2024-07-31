package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p321w7.AbstractC5341a0;

/* loaded from: classes2.dex */
public class IdTokenChannelStreamHandler implements EventChannel.StreamHandler {
    private final FirebaseAuth firebaseAuth;
    private FirebaseAuth.InterfaceC1256b idTokenListener;

    public IdTokenChannelStreamHandler(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onListen$0(AtomicBoolean atomicBoolean, Map map, EventChannel.EventSink eventSink, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        AbstractC5341a0 m5238j = firebaseAuth.m5238j();
        map.put(Constants.USER, m5238j == null ? null : PigeonParser.parseFirebaseUser(m5238j).toList());
        eventSink.success(map);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        FirebaseAuth.InterfaceC1256b interfaceC1256b = this.idTokenListener;
        if (interfaceC1256b != null) {
            this.firebaseAuth.m5252r(interfaceC1256b);
            this.idTokenListener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        hashMap.put(Constants.APP_NAME, this.firebaseAuth.m5236i().m14350q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.InterfaceC1256b interfaceC1256b = new FirebaseAuth.InterfaceC1256b() { // from class: io.flutter.plugins.firebase.auth.q2
            @Override // com.google.firebase.auth.FirebaseAuth.InterfaceC1256b
            /* renamed from: a */
            public final void mo5268a(FirebaseAuth firebaseAuth) {
                IdTokenChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.idTokenListener = interfaceC1256b;
        this.firebaseAuth.m5229c(interfaceC1256b);
    }
}
