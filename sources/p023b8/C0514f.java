package p023b8;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p066e8.C1733i;

/* renamed from: b8.f */
/* loaded from: classes.dex */
public class C0514f {

    /* renamed from: a */
    public final Context f2310a;

    /* renamed from: b */
    public b f2311b = null;

    /* renamed from: b8.f$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public final String f2312a;

        /* renamed from: b */
        public final String f2313b;

        public b() {
            int m6828p = C1733i.m6828p(C0514f.this.f2310a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m6828p == 0) {
                if (!C0514f.this.m2476c("flutter_assets/NOTICES.Z")) {
                    this.f2312a = null;
                    this.f2313b = null;
                    return;
                } else {
                    this.f2312a = "Flutter";
                    this.f2313b = null;
                    C0515g.m2482f().m2490i("Development platform is: Flutter");
                    return;
                }
            }
            this.f2312a = "Unity";
            String string = C0514f.this.f2310a.getResources().getString(m6828p);
            this.f2313b = string;
            C0515g.m2482f().m2490i("Unity Editor version is: " + string);
        }
    }

    public C0514f(Context context) {
        this.f2310a = context;
    }

    /* renamed from: c */
    public final boolean m2476c(String str) {
        if (this.f2310a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f2310a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public String m2477d() {
        return m2479f().f2312a;
    }

    /* renamed from: e */
    public String m2478e() {
        return m2479f().f2313b;
    }

    /* renamed from: f */
    public final b m2479f() {
        if (this.f2311b == null) {
            this.f2311b = new b();
        }
        return this.f2311b;
    }
}
