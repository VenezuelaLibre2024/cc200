package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CredentialDatabaseHandler implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "CredentialDatabaseHandler";
    public static CredentialDatabase credentialDatabase;
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_credential_database");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.plugin = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0062. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.util.List, java.util.ArrayList] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Context context;
        Object obj;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851697792:
                if (str.equals("clearAllAuthCredentials")) {
                    c10 = 0;
                    break;
                }
                break;
            case -410271914:
                if (str.equals("getHttpAuthCredentials")) {
                    c10 = 1;
                    break;
                }
                break;
            case 589173355:
                if (str.equals("removeHttpAuthCredential")) {
                    c10 = 2;
                    break;
                }
                break;
            case 998955721:
                if (str.equals("setHttpAuthCredential")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1084504936:
                if (str.equals("removeHttpAuthCredentials")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1930845769:
                if (str.equals("getAllAuthCredentials")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                credentialDatabase.clearAllAuthCredentials();
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
                    WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                }
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 1:
                String str2 = (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
                String str3 = (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
                String str4 = (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
                Integer num = (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT);
                ArrayList arrayList = new ArrayList();
                Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials(str2, str3, str4, num).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toMap());
                }
                result.success(arrayList);
                return;
            case 2:
                credentialDatabase.removeHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument("password"));
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 3:
                credentialDatabase.setHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument("password"));
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 4:
                credentialDatabase.removeHttpAuthCredentials((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 5:
                obj = new ArrayList();
                for (URLProtectionSpace uRLProtectionSpace : credentialDatabase.protectionSpaceDao.getAll()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().toMap());
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("protectionSpace", uRLProtectionSpace.toMap());
                    hashMap.put("credentials", arrayList2);
                    obj.add(hashMap);
                }
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
