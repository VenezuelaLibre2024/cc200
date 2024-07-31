package io.flutter.plugins.firebase.storage;

import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import p226p9.C4090n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterFirebaseStorageException {
    public static String getCode(int i10) {
        if (i10 == -13040) {
            return "canceled";
        }
        if (i10 == -13031) {
            return "invalid-checksum";
        }
        if (i10 == -13030) {
            return "retry-limit-exceeded";
        }
        if (i10 == -13021) {
            return "unauthorized";
        }
        if (i10 == -13020) {
            return "unauthenticated";
        }
        switch (i10) {
            case -13013:
                return "quota-exceeded";
            case -13012:
                return "project-not-found";
            case -13011:
                return "bucket-not-found";
            case -13010:
                return "object-not-found";
            default:
                return "unknown";
        }
    }

    public static String getMessage(int i10) {
        if (i10 == -13040) {
            return "User cancelled the operation.";
        }
        if (i10 == -13031) {
            return "File on the client does not match the checksum of the file received by the server.";
        }
        if (i10 == -13030) {
            return "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
        }
        if (i10 == -13021) {
            return "User is not authorized to perform the desired action.";
        }
        if (i10 == -13020) {
            return "User is unauthenticated. Authenticate and try again.";
        }
        switch (i10) {
            case -13013:
                return "Quota on your Firebase Storage bucket has been exceeded.";
            case -13012:
                return "No project is configured for Firebase Storage.";
            case -13011:
                return "No bucket is configured for Firebase Storage.";
            case -13010:
                return "No object exists at the desired reference.";
            default:
                return "An unknown error occurred";
        }
    }

    public static GeneratedAndroidFirebaseStorage.FlutterError parserExceptionToFlutter(Exception exc) {
        String str = "UNKNOWN";
        if (exc == null) {
            return new GeneratedAndroidFirebaseStorage.FlutterError("UNKNOWN", "An unknown error occurred", null);
        }
        String str2 = "An unknown error occurred:" + exc.getMessage();
        if (exc instanceof C4090n) {
            int m15761f = ((C4090n) exc).m15761f();
            str = getCode(m15761f);
            str2 = getMessage(m15761f);
        }
        return new GeneratedAndroidFirebaseStorage.FlutterError(str, str2, null);
    }
}
