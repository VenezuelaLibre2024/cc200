package p316w2;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p329x.C5494l;
import p329x.C5497o;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public class C5200b {

    /* renamed from: a */
    public final Context f19724a;

    /* renamed from: b */
    public final Integer f19725b;

    /* renamed from: c */
    public final String f19726c;

    /* renamed from: d */
    public C5494l.e f19727d;

    public C5200b(Context context, String str, Integer num, C5202d c5202d) {
        this.f19724a = context;
        this.f19725b = num;
        this.f19726c = str;
        this.f19727d = new C5494l.e(context, str).m21866I(1);
        m21053e(c5202d, false);
    }

    /* renamed from: a */
    public Notification m21049a() {
        return this.f19727d.m21883c();
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    /* renamed from: b */
    public final PendingIntent m21050b() {
        Intent launchIntentForPackage = this.f19724a.getPackageManager().getLaunchIntentForPackage(this.f19724a.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return PendingIntent.getActivity(this.f19724a, 0, launchIntentForPackage, Build.VERSION.SDK_INT > 23 ? 201326592 : 134217728);
    }

    /* renamed from: c */
    public final int m21051c(String str, String str2) {
        return this.f19724a.getResources().getIdentifier(str, str2, this.f19724a.getPackageName());
    }

    /* renamed from: d */
    public void m21052d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C5497o m22067f = C5497o.m22067f(this.f19724a);
            NotificationChannel notificationChannel = new NotificationChannel(this.f19726c, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            m22067f.m22074e(notificationChannel);
        }
    }

    /* renamed from: e */
    public final void m21053e(C5202d c5202d, boolean z10) {
        int m21051c = m21051c(c5202d.m21058a().m21048b(), c5202d.m21058a().m21047a());
        if (m21051c == 0) {
            m21051c("ic_launcher.png", "mipmap");
        }
        this.f19727d = this.f19727d.m21900u(c5202d.m21060c()).m21871N(m21051c).m21899t(c5202d.m21059b()).m21898s(m21050b()).m21864G(c5202d.m21063f());
        if (z10) {
            C5497o.m22067f(this.f19724a).m22076i(this.f19725b.intValue(), this.f19727d.m21883c());
        }
    }

    /* renamed from: f */
    public void m21054f(C5202d c5202d, boolean z10) {
        m21053e(c5202d, z10);
    }
}
