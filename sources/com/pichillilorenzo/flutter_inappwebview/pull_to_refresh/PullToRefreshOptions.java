package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview.Options;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PullToRefreshOptions implements Options<PullToRefreshLayout> {
    public static final String LOG_TAG = "PullToRefreshOptions";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled = Boolean.TRUE;
    public Integer size;
    public Integer slingshotDistance;

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(PullToRefreshLayout pullToRefreshLayout) {
        return toMap();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public PullToRefreshOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.hashCode();
                char c10 = 65535;
                switch (key.hashCode()) {
                    case -1878912765:
                        if (key.equals("distanceToTriggerSync")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1609594047:
                        if (key.equals("enabled")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3530753:
                        if (key.equals("size")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 94842723:
                        if (key.equals("color")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1287124693:
                        if (key.equals("backgroundColor")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 1719097976:
                        if (key.equals("slingshotDistance")) {
                            c10 = 5;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.distanceToTriggerSync = (Integer) value;
                        break;
                    case 1:
                        this.enabled = (Boolean) value;
                        break;
                    case 2:
                        this.size = (Integer) value;
                        break;
                    case 3:
                        this.color = (String) value;
                        break;
                    case 4:
                        this.backgroundColor = (String) value;
                        break;
                    case 5:
                        this.slingshotDistance = (Integer) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", this.enabled);
        hashMap.put("color", this.color);
        hashMap.put("backgroundColor", this.backgroundColor);
        hashMap.put("distanceToTriggerSync", this.distanceToTriggerSync);
        hashMap.put("slingshotDistance", this.slingshotDistance);
        hashMap.put("size", this.size);
        return hashMap;
    }
}
