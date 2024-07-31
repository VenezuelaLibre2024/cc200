package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import ne.C3818b;
import ne.InterfaceC3817a;
import pe.C4118a;

@Deprecated
/* loaded from: classes2.dex */
public class XiaomiHomeBadger implements InterfaceC3817a {

    /* renamed from: a */
    public ResolveInfo f12748a;

    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        Object valueOf;
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                valueOf = "";
            } else {
                try {
                    valueOf = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i10 != 0 ? Integer.valueOf(i10) : ""));
            try {
                C4118a.m15892c(context, intent);
            } catch (C3818b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            m13381c(context, i10);
        }
    }

    @TargetApi(16)
    /* renamed from: c */
    public final void m13381c(Context context, int i10) {
        if (this.f12748a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f12748a = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.f12748a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f12748a.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                notificationManager.notify(0, build);
            } catch (Exception e10) {
                throw new C3818b("not able to set badge", e10);
            }
        }
    }
}
