package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import ne.InterfaceC3817a;

/* loaded from: classes2.dex */
public class SonyHomeBadger implements InterfaceC3817a {

    /* renamed from: a */
    public final Uri f12745a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public AsyncQueryHandler f12746b;

    /* renamed from: me.leolin.shortcutbadger.impl.SonyHomeBadger$a */
    /* loaded from: classes2.dex */
    public class C3615a extends AsyncQueryHandler {
        public C3615a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* renamed from: d */
    public static void m13375d(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i10 > 0);
        context.sendBroadcast(intent);
    }

    /* renamed from: h */
    public static boolean m13376h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        if (m13376h(context)) {
            m13378e(context, componentName, i10);
        } else {
            m13375d(context, componentName, i10);
        }
    }

    /* renamed from: c */
    public final ContentValues m13377c(int i10, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i10));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* renamed from: e */
    public final void m13378e(Context context, ComponentName componentName, int i10) {
        if (i10 < 0) {
            return;
        }
        ContentValues m13377c = m13377c(i10, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m13380g(context, m13377c);
            return;
        }
        if (this.f12746b == null) {
            this.f12746b = new C3615a(context.getApplicationContext().getContentResolver());
        }
        m13379f(m13377c);
    }

    /* renamed from: f */
    public final void m13379f(ContentValues contentValues) {
        this.f12746b.startInsert(0, null, this.f12745a, contentValues);
    }

    /* renamed from: g */
    public final void m13380g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f12745a, contentValues);
    }
}
