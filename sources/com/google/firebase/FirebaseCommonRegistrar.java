package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p142j9.C3265c;
import p142j9.C3267e;
import p142j9.C3270h;
import p309v8.C5146f;
import p353y7.C5867c;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: e */
    public static /* synthetic */ String m5160e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m5161f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: g */
    public static /* synthetic */ String m5162g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i10 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    /* renamed from: h */
    public static /* synthetic */ String m5163h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m5164i(installerPackageName) : "";
    }

    /* renamed from: i */
    public static String m5164i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5867c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3265c.m11814c());
        arrayList.add(C5146f.m20823g());
        arrayList.add(C3270h.m11823b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C3270h.m11823b("fire-core", "20.4.2"));
        arrayList.add(C3270h.m11823b("device-name", m5164i(Build.PRODUCT)));
        arrayList.add(C3270h.m11823b("device-model", m5164i(Build.DEVICE)));
        arrayList.add(C3270h.m11823b("device-brand", m5164i(Build.BRAND)));
        arrayList.add(C3270h.m11824c("android-target-sdk", new C3270h.a() { // from class: n7.j
            @Override // p142j9.C3270h.a
            /* renamed from: a */
            public final String mo11826a(Object obj) {
                String m5160e;
                m5160e = FirebaseCommonRegistrar.m5160e((Context) obj);
                return m5160e;
            }
        }));
        arrayList.add(C3270h.m11824c("android-min-sdk", new C3270h.a() { // from class: n7.k
            @Override // p142j9.C3270h.a
            /* renamed from: a */
            public final String mo11826a(Object obj) {
                String m5161f;
                m5161f = FirebaseCommonRegistrar.m5161f((Context) obj);
                return m5161f;
            }
        }));
        arrayList.add(C3270h.m11824c("android-platform", new C3270h.a() { // from class: n7.l
            @Override // p142j9.C3270h.a
            /* renamed from: a */
            public final String mo11826a(Object obj) {
                String m5162g;
                m5162g = FirebaseCommonRegistrar.m5162g((Context) obj);
                return m5162g;
            }
        }));
        arrayList.add(C3270h.m11824c("android-installer", new C3270h.a() { // from class: n7.i
            @Override // p142j9.C3270h.a
            /* renamed from: a */
            public final String mo11826a(Object obj) {
                String m5163h;
                m5163h = FirebaseCommonRegistrar.m5163h((Context) obj);
                return m5163h;
            }
        }));
        String m11820a = C3267e.m11820a();
        if (m11820a != null) {
            arrayList.add(C3270h.m11823b("kotlin", m11820a));
        }
        return arrayList;
    }
}
