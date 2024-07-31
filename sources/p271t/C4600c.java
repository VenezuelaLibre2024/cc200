package p271t;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p260s.C4379a;
import p260s.C4382d;
import p260s.C4384f;
import p271t.InterfaceC4598a;

/* renamed from: t.c */
/* loaded from: classes.dex */
public class C4600c {

    /* renamed from: a */
    public final Uri f17246a;

    /* renamed from: c */
    public List<String> f17248c;

    /* renamed from: d */
    public Bundle f17249d;

    /* renamed from: b */
    public final C4382d.b f17247b = new C4382d.b();

    /* renamed from: e */
    public InterfaceC4598a f17250e = new InterfaceC4598a.a();

    /* renamed from: f */
    public int f17251f = 0;

    public C4600c(Uri uri) {
        this.f17246a = uri;
    }

    /* renamed from: a */
    public C4599b m18122a(C4384f c4384f) {
        Objects.requireNonNull(c4384f, "CustomTabsSession is required for launching a TWA");
        this.f17247b.m16954g(c4384f);
        Intent intent = this.f17247b.m16949b().f16085a;
        intent.setData(this.f17246a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f17248c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f17248c));
        }
        Bundle bundle = this.f17249d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f17250e.mo18120a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f17251f);
        return new C4599b(intent, emptyList);
    }

    /* renamed from: b */
    public C4600c m18123b(List<String> list) {
        this.f17248c = list;
        return this;
    }

    /* renamed from: c */
    public C4600c m18124c(C4379a c4379a) {
        this.f17247b.m16952e(c4379a);
        return this;
    }

    /* renamed from: d */
    public C4600c m18125d(InterfaceC4598a interfaceC4598a) {
        this.f17250e = interfaceC4598a;
        return this;
    }

    /* renamed from: e */
    public C4600c m18126e(int i10) {
        this.f17251f = i10;
        return this;
    }
}
