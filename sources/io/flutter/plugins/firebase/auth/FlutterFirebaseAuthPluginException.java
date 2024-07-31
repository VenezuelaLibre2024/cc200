package io.flutter.plugins.firebase.auth;

import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import p195n7.C3764d;
import p195n7.C3775o;
import p195n7.C3777q;
import p321w7.AbstractC5368h;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5381k0;
import p321w7.AbstractC5385l0;
import p321w7.C5399q;
import p321w7.C5411u;
import p321w7.C5420x;
import p321w7.C5423y;

/* loaded from: classes2.dex */
public class FlutterFirebaseAuthPluginException {
    public static GeneratedAndroidFirebaseAuth.FlutterError alreadyLinkedProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError invalidCredential() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noSuchProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noUser() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter(Exception exc) {
        if (exc == null) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof C5411u) {
            C5411u c5411u = (C5411u) exc;
            HashMap hashMap2 = new HashMap();
            AbstractC5381k0 m21554b = c5411u.m21554b();
            List<AbstractC5377j0> mo21520J = m21554b.mo21520J();
            AbstractC5385l0 mo21521K = m21554b.mo21521K();
            String uuid = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorSessionMap.put(uuid, mo21521K);
            String uuid2 = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorResolverMap.put(uuid2, m21554b);
            List<List<Object>> multiFactorInfoToMap = PigeonParser.multiFactorInfoToMap(mo21520J);
            hashMap2.put(Constants.APP_NAME, c5411u.m21554b().mo21519I().m5236i().m14350q());
            hashMap2.put(Constants.MULTI_FACTOR_HINTS, multiFactorInfoToMap);
            hashMap2.put(Constants.MULTI_FACTOR_SESSION_ID, uuid);
            hashMap2.put(Constants.MULTI_FACTOR_RESOLVER_ID, uuid2);
            return new GeneratedAndroidFirebaseAuth.FlutterError(c5411u.m21548a(), c5411u.getLocalizedMessage(), hashMap2);
        }
        if (exc instanceof ExecutionException) {
            return noSuchProvider();
        }
        if ((exc instanceof C3775o) || (exc.getCause() != null && (exc.getCause() instanceof C3775o))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof C3764d) || (exc.getCause() != null && (exc.getCause() instanceof C3764d))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof C3777q) || (exc.getCause() != null && (exc.getCause() instanceof C3777q))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return alreadyLinkedProvider();
        }
        String m21548a = exc instanceof C5399q ? ((C5399q) exc).m21548a() : "UNKNOWN";
        if (exc instanceof C5423y) {
            message = ((C5423y) exc).m21571b();
        }
        if (exc instanceof C5420x) {
            C5420x c5420x = (C5420x) exc;
            String m21565b = c5420x.m21565b();
            if (m21565b != null) {
                hashMap.put(Constants.EMAIL, m21565b);
            }
            AbstractC5368h m21566c = c5420x.m21566c();
            if (m21566c != null) {
                hashMap.put("authCredential", PigeonParser.parseAuthCredential(m21566c));
            }
        }
        return new GeneratedAndroidFirebaseAuth.FlutterError(m21548a, message, hashMap);
    }
}
