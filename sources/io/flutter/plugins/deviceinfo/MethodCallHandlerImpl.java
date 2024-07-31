package io.flutter.plugins.deviceinfo;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    private static final String[] EMPTY_STRING_LIST = new String[0];
    private final ContentResolver contentResolver;
    private final PackageManager packageManager;

    public MethodCallHandlerImpl(ContentResolver contentResolver, PackageManager packageManager) {
        this.contentResolver = contentResolver;
        this.packageManager = packageManager;
    }

    @SuppressLint({"HardwareIds"})
    private String getAndroidId() {
        return Settings.Secure.getString(this.contentResolver, "android_id");
    }

    private String[] getSystemFeatures() {
        FeatureInfo[] systemAvailableFeatures = this.packageManager.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return EMPTY_STRING_LIST;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i10 = 0; i10 < systemAvailableFeatures.length; i10++) {
            strArr[i10] = systemAvailableFeatures[i10].name;
        }
        return strArr;
    }

    private boolean isEmulator() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List asList;
        if (!methodCall.method.equals("getAndroidDeviceInfo")) {
            result.notImplemented();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device", Build.DEVICE);
        hashMap.put("display", Build.DISPLAY);
        hashMap.put("fingerprint", Build.FINGERPRINT);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
        hashMap.put("id", Build.ID);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("product", Build.PRODUCT);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
            hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
            asList = Arrays.asList(Build.SUPPORTED_ABIS);
        } else {
            String[] strArr = EMPTY_STRING_LIST;
            hashMap.put("supported32BitAbis", Arrays.asList(strArr));
            hashMap.put("supported64BitAbis", Arrays.asList(strArr));
            asList = Arrays.asList(strArr);
        }
        hashMap.put("supportedAbis", asList);
        hashMap.put("tags", Build.TAGS);
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, Build.TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!isEmulator()));
        hashMap.put("androidId", getAndroidId());
        hashMap.put("systemFeatures", Arrays.asList(getSystemFeatures()));
        HashMap hashMap2 = new HashMap();
        if (i10 >= 23) {
            hashMap2.put("baseOS", Build.VERSION.BASE_OS);
            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
            hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        }
        hashMap2.put("codename", Build.VERSION.CODENAME);
        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap2.put("release", Build.VERSION.RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i10));
        hashMap.put("version", hashMap2);
        result.success(hashMap);
    }
}
