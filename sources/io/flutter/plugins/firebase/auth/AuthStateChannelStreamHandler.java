package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p321w7.AbstractC5341a0;

/* loaded from: classes2.dex */
public class AuthStateChannelStreamHandler implements EventChannel.StreamHandler {
    private FirebaseAuth.InterfaceC1255a authStateListener;
    private final FirebaseAuth firebaseAuth;

    public AuthStateChannelStreamHandler(FirebaseAuth firebaseAuth) {
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
        FirebaseAuth.InterfaceC1255a interfaceC1255a = this.authStateListener;
        if (interfaceC1255a != null) {
            this.firebaseAuth.m5251q(interfaceC1255a);
            this.authStateListener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        hashMap.put(Constants.APP_NAME, this.firebaseAuth.m5236i().m14350q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.InterfaceC1255a interfaceC1255a = new FirebaseAuth.InterfaceC1255a() { // from class: io.flutter.plugins.firebase.auth.a
            @Override // com.google.firebase.auth.FirebaseAuth.InterfaceC1255a
            /* renamed from: a */
            public final void mo5267a(FirebaseAuth firebaseAuth) {
                AuthStateChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.authStateListener = interfaceC1255a;
        this.firebaseAuth.m5227b(interfaceC1255a);
    }
}
