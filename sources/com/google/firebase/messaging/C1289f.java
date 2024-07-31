package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p345y.C5782a;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
public class C1289f {

    /* renamed from: a */
    public final SharedPreferences f4910a;

    /* renamed from: com.google.firebase.messaging.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        public static final long f4911d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f4912a;

        /* renamed from: b */
        public final String f4913b;

        /* renamed from: c */
        public final long f4914c;

        public a(String str, String str2, long j10) {
            this.f4912a = str;
            this.f4913b = str2;
            this.f4914c = j10;
        }

        /* renamed from: a */
        public static String m5555a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        /* renamed from: c */
        public static a m5556c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(Constants.TIMESTAMP));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* renamed from: b */
        public boolean m5557b(String str) {
            return System.currentTimeMillis() > this.f4914c + f4911d || !str.equals(this.f4913b);
        }
    }

    public C1289f(Context context) {
        this.f4910a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m5548a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void m5548a(Context context, String str) {
        File file = new File(C5782a.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m5553f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m5550c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final String m5549b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m5550c() {
        this.f4910a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m5551d(String str, String str2) {
        String m5549b = m5549b(str, str2);
        SharedPreferences.Editor edit = this.f4910a.edit();
        edit.remove(m5549b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized a m5552e(String str, String str2) {
        return a.m5556c(this.f4910a.getString(m5549b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m5553f() {
        return this.f4910a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m5554g(String str, String str2, String str3, String str4) {
        String m5555a = a.m5555a(str3, str4, System.currentTimeMillis());
        if (m5555a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f4910a.edit();
        edit.putString(m5549b(str, str2), m5555a);
        edit.commit();
    }
}
