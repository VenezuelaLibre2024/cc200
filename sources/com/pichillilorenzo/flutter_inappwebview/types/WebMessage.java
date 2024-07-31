package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.List;

/* loaded from: classes2.dex */
public class WebMessage {
    public String data;
    public List<WebMessagePort> ports;

    public WebMessage(String str, List<WebMessagePort> list) {
        this.data = str;
        this.ports = list;
    }

    public void dispose() {
        List<WebMessagePort> list = this.ports;
        if (list != null) {
            list.clear();
        }
    }
}
