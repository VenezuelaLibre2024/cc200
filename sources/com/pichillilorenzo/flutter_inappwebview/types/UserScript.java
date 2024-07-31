package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

/* loaded from: classes2.dex */
public class UserScript {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld) {
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld == null ? ContentWorld.PAGE : contentWorld;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        String str = this.groupName;
        if (str == null ? userScript.groupName != null : !str.equals(userScript.groupName)) {
            return false;
        }
        if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime) {
            return this.contentWorld.equals(userScript.contentWorld);
        }
        return false;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.groupName;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.source.hashCode()) * 31) + this.injectionTime.hashCode()) * 31) + this.contentWorld.hashCode();
    }

    public void setContentWorld(ContentWorld contentWorld) {
        if (contentWorld == null) {
            contentWorld = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        return "UserScript{groupName='" + this.groupName + "', source='" + this.source + "', injectionTime=" + this.injectionTime + ", contentWorld=" + this.contentWorld + '}';
    }
}
