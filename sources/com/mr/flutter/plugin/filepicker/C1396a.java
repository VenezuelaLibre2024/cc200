package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* renamed from: com.mr.flutter.plugin.filepicker.a */
/* loaded from: classes.dex */
public class C1396a {

    /* renamed from: a */
    public final String f5334a;

    /* renamed from: b */
    public final String f5335b;

    /* renamed from: c */
    public final Uri f5336c;

    /* renamed from: d */
    public final long f5337d;

    /* renamed from: e */
    public final byte[] f5338e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f5339a;

        /* renamed from: b */
        public String f5340b;

        /* renamed from: c */
        public Uri f5341c;

        /* renamed from: d */
        public long f5342d;

        /* renamed from: e */
        public byte[] f5343e;

        /* renamed from: a */
        public C1396a m5962a() {
            return new C1396a(this.f5339a, this.f5340b, this.f5341c, this.f5342d, this.f5343e);
        }

        /* renamed from: b */
        public a m5963b(byte[] bArr) {
            this.f5343e = bArr;
            return this;
        }

        /* renamed from: c */
        public a m5964c(String str) {
            this.f5340b = str;
            return this;
        }

        /* renamed from: d */
        public a m5965d(String str) {
            this.f5339a = str;
            return this;
        }

        /* renamed from: e */
        public a m5966e(long j10) {
            this.f5342d = j10;
            return this;
        }

        /* renamed from: f */
        public a m5967f(Uri uri) {
            this.f5341c = uri;
            return this;
        }
    }

    public C1396a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f5334a = str;
        this.f5335b = str2;
        this.f5337d = j10;
        this.f5338e = bArr;
        this.f5336c = uri;
    }

    /* renamed from: a */
    public HashMap<String, Object> m5961a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.f5334a);
        hashMap.put("name", this.f5335b);
        hashMap.put("size", Long.valueOf(this.f5337d));
        hashMap.put("bytes", this.f5338e);
        hashMap.put(Constants.IDENTIFIER, this.f5336c.toString());
        return hashMap;
    }
}
