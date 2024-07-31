package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.C1259a;
import com.google.firebase.auth.C1260b;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p195n7.C3773m;
import p321w7.AbstractC5385l0;
import p321w7.C5394o0;
import p321w7.C5403r0;

/* loaded from: classes2.dex */
public class PhoneNumberVerificationStreamHandler implements EventChannel.StreamHandler {
    private static final HashMap<Integer, C1260b.a> forceResendingTokens = new HashMap<>();
    public final AtomicReference<Activity> activityRef;
    public String autoRetrievedSmsCodeForTesting;
    private EventChannel.EventSink eventSink;
    public final FirebaseAuth firebaseAuth;
    public Integer forceResendingToken;
    public final C5403r0 multiFactorInfo;
    public final AbstractC5385l0 multiFactorSession;
    public final OnCredentialsListener onCredentialsListener;
    public final String phoneNumber;
    public final int timeout;

    /* loaded from: classes2.dex */
    public interface OnCredentialsListener {
        void onCredentialsReceived(C5394o0 c5394o0);
    }

    public PhoneNumberVerificationStreamHandler(Activity activity, GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, AbstractC5385l0 abstractC5385l0, C5403r0 c5403r0, OnCredentialsListener onCredentialsListener) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.activityRef = atomicReference;
        atomicReference.set(activity);
        this.multiFactorSession = abstractC5385l0;
        this.multiFactorInfo = c5403r0;
        this.firebaseAuth = FlutterFirebaseAuthPlugin.getAuthFromPigeon(authPigeonFirebaseApp);
        this.phoneNumber = pigeonVerifyPhoneNumberRequest.getPhoneNumber();
        this.timeout = Math.toIntExact(pigeonVerifyPhoneNumberRequest.getTimeout().longValue());
        if (pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting() != null) {
            this.autoRetrievedSmsCodeForTesting = pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting();
        }
        if (pigeonVerifyPhoneNumberRequest.getForceResendingToken() != null) {
            this.forceResendingToken = Integer.valueOf(Math.toIntExact(pigeonVerifyPhoneNumberRequest.getForceResendingToken().longValue()));
        }
        this.onCredentialsListener = onCredentialsListener;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
        this.activityRef.set(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        C1260b.a aVar;
        this.eventSink = eventSink;
        C1260b.b bVar = new C1260b.b() { // from class: io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.1
            @Override // com.google.firebase.auth.C1260b.b
            public void onCodeAutoRetrievalTimeOut(String str) {
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.VERIFICATION_ID, str);
                hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.C1260b.b
            public void onCodeSent(String str, C1260b.a aVar2) {
                int hashCode = aVar2.hashCode();
                PhoneNumberVerificationStreamHandler.forceResendingTokens.put(Integer.valueOf(hashCode), aVar2);
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.VERIFICATION_ID, str);
                hashMap.put(Constants.FORCE_RESENDING_TOKEN, Integer.valueOf(hashCode));
                hashMap.put("name", "Auth#phoneCodeSent");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.C1260b.b
            public void onVerificationCompleted(C5394o0 c5394o0) {
                int hashCode = c5394o0.hashCode();
                PhoneNumberVerificationStreamHandler.this.onCredentialsListener.onCredentialsReceived(c5394o0);
                HashMap hashMap = new HashMap();
                hashMap.put("token", Integer.valueOf(hashCode));
                if (c5394o0.m21543L() != null) {
                    hashMap.put(Constants.SMS_CODE, c5394o0.m21543L());
                }
                hashMap.put("name", "Auth#phoneVerificationCompleted");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.C1260b.b
            public void onVerificationFailed(C3773m c3773m) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter = FlutterFirebaseAuthPluginException.parserExceptionToFlutter(c3773m);
                hashMap2.put("code", parserExceptionToFlutter.code.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
                hashMap2.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, parserExceptionToFlutter.getMessage());
                hashMap2.put("details", parserExceptionToFlutter.details);
                hashMap.put(ImagePickerCache.MAP_KEY_ERROR, hashMap2);
                hashMap.put("name", "Auth#phoneVerificationFailed");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }
        };
        if (this.autoRetrievedSmsCodeForTesting != null) {
            this.firebaseAuth.m5242l().mo21561c(this.phoneNumber, this.autoRetrievedSmsCodeForTesting);
        }
        C1259a.a aVar2 = new C1259a.a(this.firebaseAuth);
        aVar2.m5284b(this.activityRef.get());
        aVar2.m5285c(bVar);
        String str = this.phoneNumber;
        if (str != null) {
            aVar2.m5289g(str);
        }
        AbstractC5385l0 abstractC5385l0 = this.multiFactorSession;
        if (abstractC5385l0 != null) {
            aVar2.m5288f(abstractC5385l0);
        }
        C5403r0 c5403r0 = this.multiFactorInfo;
        if (c5403r0 != null) {
            aVar2.m5287e(c5403r0);
        }
        aVar2.m5290h(Long.valueOf(this.timeout), TimeUnit.MILLISECONDS);
        Integer num = this.forceResendingToken;
        if (num != null && (aVar = forceResendingTokens.get(num)) != null) {
            aVar2.m5286d(aVar);
        }
        C1260b.m5292b(aVar2.m5283a());
    }
}
