package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

/* loaded from: classes2.dex */
public class CustomTabsMenuItem {

    /* renamed from: id */
    private int f5378id;
    private String label;

    public CustomTabsMenuItem(int i10, String str) {
        this.f5378id = i10;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get("label"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.f5378id != customTabsMenuItem.f5378id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.f5378id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.f5378id * 31) + this.label.hashCode();
    }

    public void setId(int i10) {
        this.f5378id = i10;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        return "CustomTabsMenuItem{id=" + this.f5378id + ", label='" + this.label + "'}";
    }
}
