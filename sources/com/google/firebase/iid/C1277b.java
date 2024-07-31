package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p285u.C4771a;
import p345y.C5782a;

/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes.dex */
public class C1277b {

    /* renamed from: a */
    public final SharedPreferences f4836a;

    /* renamed from: b */
    public final Context f4837b;

    /* renamed from: c */
    public final Map<String, Long> f4838c = new C4771a();

    /* renamed from: com.google.firebase.iid.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        public static final long f4839d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f4840a;

        /* renamed from: b */
        public final String f4841b;

        /* renamed from: c */
        public final long f4842c;

        public a(String str, String str2, long j10) {
            this.f4840a = str;
            this.f4841b = str2;
            this.f4842c = j10;
        }

        /* renamed from: a */
        public static String m5384a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* renamed from: b */
        public static String m5385b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f4840a;
        }

        /* renamed from: d */
        public static a m5386d(String str) {
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
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* renamed from: c */
        public boolean m5387c(String str) {
            return System.currentTimeMillis() > this.f4842c + f4839d || !str.equals(this.f4841b);
        }
    }

    public C1277b(Context context) {
        this.f4837b = context;
        this.f4836a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m5374a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: b */
    public static String m5373b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
        sb2.append(str);
        sb2.append("|S|cre");
        return sb2.toString();
    }

    /* renamed from: a */
    public final void m5374a(String str) {
        File file = new File(C5782a.getNoBackupFilesDir(this.f4837b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m5380h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            m5376d();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: c */
    public final String m5375c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: d */
    public synchronized void m5376d() {
        this.f4838c.clear();
        this.f4836a.edit().clear().commit();
    }

    /* renamed from: e */
    public synchronized void m5377e(String str, String str2, String str3) {
        String m5375c = m5375c(str, str2, str3);
        SharedPreferences.Editor edit = this.f4836a.edit();
        edit.remove(m5375c);
        edit.commit();
    }

    /* renamed from: f */
    public final long m5378f(String str) {
        String string = this.f4836a.getString(m5373b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: g */
    public synchronized a m5379g(String str, String str2, String str3) {
        return a.m5386d(this.f4836a.getString(m5375c(str, str2, str3), null));
    }

    /* renamed from: h */
    public synchronized boolean m5380h() {
        return this.f4836a.getAll().isEmpty();
    }

    /* renamed from: i */
    public synchronized void m5381i(String str, String str2, String str3, String str4, String str5) {
        String m5384a = a.m5384a(str4, str5, System.currentTimeMillis());
        if (m5384a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f4836a.edit();
        edit.putString(m5375c(str, str2, str3), m5384a);
        edit.commit();
    }

    /* renamed from: j */
    public synchronized long m5382j(String str) {
        long m5383k;
        m5383k = m5383k(str);
        this.f4838c.put(str, Long.valueOf(m5383k));
        return m5383k;
    }

    /* renamed from: k */
    public final long m5383k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f4836a.contains(m5373b(str, "cre"))) {
            return m5378f(str);
        }
        SharedPreferences.Editor edit = this.f4836a.edit();
        edit.putString(m5373b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }
}
