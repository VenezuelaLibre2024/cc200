package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview.Options;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p271t.InterfaceC4598a;

/* loaded from: classes.dex */
public class ChromeCustomTabsOptions implements Options<ChromeCustomTabsActivity> {
    public static final String LOG_TAG = "ChromeCustomTabsOptions";

    @Deprecated
    public Boolean addDefaultShareMenuItem;
    public List<String> additionalTrustedOrigins;
    public InterfaceC4598a displayMode;
    public Boolean enableUrlBarHiding;
    public Boolean instantAppsEnabled;
    public Boolean isSingleInstance;
    public Boolean isTrustedWebActivity;
    public Boolean keepAliveEnabled;
    public Boolean noHistory;
    public String packageName;
    public Integer screenOrientation;
    public Integer shareState = 0;
    public Boolean showTitle = Boolean.TRUE;
    public String toolbarBackgroundColor;

    public ChromeCustomTabsOptions() {
        Boolean bool = Boolean.FALSE;
        this.enableUrlBarHiding = bool;
        this.instantAppsEnabled = bool;
        this.keepAliveEnabled = bool;
        this.isSingleInstance = bool;
        this.noHistory = bool;
        this.isTrustedWebActivity = bool;
        this.additionalTrustedOrigins = new ArrayList();
        this.displayMode = null;
        this.screenOrientation = 0;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(ChromeCustomTabsActivity chromeCustomTabsActivity) {
        Intent intent;
        Map<String, Object> map = toMap();
        if (chromeCustomTabsActivity != null && (intent = chromeCustomTabsActivity.getIntent()) != null) {
            map.put("packageName", intent.getPackage());
            map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra(CustomTabsHelper.EXTRA_CUSTOM_TABS_KEEP_ALIVE)));
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public ChromeCustomTabsOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.hashCode();
                char c10 = 65535;
                switch (key.hashCode()) {
                    case -2112880751:
                        if (key.equals("addDefaultShareMenuItem")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1913803429:
                        if (key.equals("showTitle")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1799055374:
                        if (key.equals("shareState")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -632275769:
                        if (key.equals("isSingleInstance")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -227713574:
                        if (key.equals("toolbarBackgroundColor")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 137483238:
                        if (key.equals("enableUrlBarHiding")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 227582404:
                        if (key.equals("screenOrientation")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 390710230:
                        if (key.equals("isTrustedWebActivity")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 472764366:
                        if (key.equals("instantAppsEnabled")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 908759025:
                        if (key.equals("packageName")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1518510995:
                        if (key.equals("noHistory")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1578203421:
                        if (key.equals("additionalTrustedOrigins")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 1714132357:
                        if (key.equals("displayMode")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 2126240217:
                        if (key.equals("keepAliveEnabled")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.addDefaultShareMenuItem = (Boolean) value;
                        break;
                    case 1:
                        this.showTitle = (Boolean) value;
                        break;
                    case 2:
                        this.shareState = (Integer) value;
                        break;
                    case 3:
                        this.isSingleInstance = (Boolean) value;
                        break;
                    case 4:
                        this.toolbarBackgroundColor = (String) value;
                        break;
                    case 5:
                        this.enableUrlBarHiding = (Boolean) value;
                        break;
                    case 6:
                        this.screenOrientation = (Integer) value;
                        break;
                    case 7:
                        this.isTrustedWebActivity = (Boolean) value;
                        break;
                    case '\b':
                        this.instantAppsEnabled = (Boolean) value;
                        break;
                    case '\t':
                        this.packageName = (String) value;
                        break;
                    case '\n':
                        this.noHistory = (Boolean) value;
                        break;
                    case 11:
                        this.additionalTrustedOrigins = (List) value;
                        break;
                    case '\f':
                        Map map2 = (Map) value;
                        String str = (String) map2.get(ImagePickerCache.MAP_KEY_TYPE);
                        if (str == null) {
                            break;
                        } else if (str.equals("IMMERSIVE_MODE")) {
                            this.displayMode = new InterfaceC4598a.b(((Boolean) map2.get("isSticky")).booleanValue(), ((Integer) map2.get("layoutInDisplayCutoutMode")).intValue());
                            break;
                        } else if (str.equals("DEFAULT_MODE")) {
                            this.displayMode = new InterfaceC4598a.a();
                            break;
                        } else {
                            break;
                        }
                    case '\r':
                        this.keepAliveEnabled = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
        hashMap.put("showTitle", this.showTitle);
        hashMap.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
        hashMap.put("enableUrlBarHiding", this.enableUrlBarHiding);
        hashMap.put("instantAppsEnabled", this.instantAppsEnabled);
        hashMap.put("packageName", this.packageName);
        hashMap.put("keepAliveEnabled", this.keepAliveEnabled);
        hashMap.put("isSingleInstance", this.isSingleInstance);
        hashMap.put("noHistory", this.noHistory);
        hashMap.put("isTrustedWebActivity", this.isTrustedWebActivity);
        hashMap.put("additionalTrustedOrigins", this.additionalTrustedOrigins);
        hashMap.put("screenOrientation", this.screenOrientation);
        return hashMap;
    }
}
