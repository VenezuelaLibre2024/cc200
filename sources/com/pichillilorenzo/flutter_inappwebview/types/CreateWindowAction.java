package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

/* loaded from: classes2.dex */
public class CreateWindowAction extends NavigationAction {
    public boolean isDialog;
    public int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z10, boolean z11, boolean z12, int i10, boolean z13) {
        super(uRLRequest, z10, z11, z12);
        this.windowId = i10;
        this.isDialog = z13;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.NavigationAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
    }

    public int getWindowId() {
        return this.windowId;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.NavigationAction
    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z10) {
        this.isDialog = z10;
    }

    public void setWindowId(int i10) {
        this.windowId = i10;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.NavigationAction
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("androidIsDialog", Boolean.valueOf(this.isDialog));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.NavigationAction
    public String toString() {
        return "CreateWindowAction{windowId=" + this.windowId + ", isDialog=" + this.isDialog + ", request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
    }
}
