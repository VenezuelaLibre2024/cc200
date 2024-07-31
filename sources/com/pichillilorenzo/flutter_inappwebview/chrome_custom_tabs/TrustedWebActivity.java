package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import java.util.List;
import p260s.C4379a;
import p271t.C4599b;
import p271t.C4600c;
import p271t.InterfaceC4598a;

/* loaded from: classes.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    public static final String LOG_TAG = "TrustedWebActivity";
    public C4600c builder;

    private void prepareCustomTabs() {
        String str = this.options.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.builder.m18124c(new C4379a.a().m16938b(Color.parseColor(this.options.toolbarBackgroundColor)).m16937a());
        }
        List<String> list = this.options.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.m18123b(this.options.additionalTrustedOrigins);
        }
        InterfaceC4598a interfaceC4598a = this.options.displayMode;
        if (interfaceC4598a != null) {
            this.builder.m18125d(interfaceC4598a);
        }
        this.builder.m18126e(this.options.screenOrientation.intValue());
    }

    private void prepareCustomTabsIntent(C4599b c4599b) {
        Intent m18121a = c4599b.m18121a();
        String str = this.options.packageName;
        if (str == null) {
            str = CustomTabsHelper.getPackageNameToUse(this);
        }
        m18121a.setPackage(str);
        if (this.options.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, m18121a);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity
    public void customTabsConnected() {
        this.customTabsSession = this.customTabActivityHelper.getSession();
        Uri parse = Uri.parse(this.initialUrl);
        this.customTabActivityHelper.mayLaunchUrl(parse, null, null);
        this.builder = new C4600c(parse);
        prepareCustomTabs();
        C4599b m18122a = this.builder.m18122a(this.customTabsSession);
        prepareCustomTabsIntent(m18122a);
        CustomTabActivityHelper.openCustomTab(this, m18122a, parse, 100);
    }
}
