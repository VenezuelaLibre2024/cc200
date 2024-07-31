package p154k6;

import android.util.Log;
import java.util.Locale;
import p108h6.C2367j;

/* renamed from: k6.a */
/* loaded from: classes.dex */
public class C3363a {

    /* renamed from: a */
    public final String f11743a;

    /* renamed from: b */
    public final String f11744b;

    /* renamed from: c */
    public final C2367j f11745c;

    /* renamed from: d */
    public final int f11746d;

    public C3363a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f11744b = sb2;
        this.f11743a = str;
        this.f11745c = new C2367j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f11743a, i10)) {
            i10++;
        }
        this.f11746d = i10;
    }

    /* renamed from: a */
    public void m12506a(String str, Object... objArr) {
        if (m12511f(3)) {
            Log.d(this.f11743a, m12509d(str, objArr));
        }
    }

    /* renamed from: b */
    public void m12507b(String str, Throwable th, Object... objArr) {
        Log.e(this.f11743a, m12509d(str, objArr), th);
    }

    /* renamed from: c */
    public void m12508c(String str, Object... objArr) {
        Log.e(this.f11743a, m12509d(str, objArr));
    }

    /* renamed from: d */
    public String m12509d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f11744b.concat(str);
    }

    /* renamed from: e */
    public void m12510e(String str, Object... objArr) {
        Log.i(this.f11743a, m12509d(str, objArr));
    }

    /* renamed from: f */
    public boolean m12511f(int i10) {
        return this.f11746d <= i10;
    }

    /* renamed from: g */
    public void m12512g(String str, Object... objArr) {
        if (m12511f(2)) {
            Log.v(this.f11743a, m12509d(str, objArr));
        }
    }

    /* renamed from: h */
    public void m12513h(String str, Object... objArr) {
        Log.w(this.f11743a, m12509d(str, objArr));
    }

    /* renamed from: i */
    public void m12514i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f11743a, m12509d(str, objArr), th);
    }

    /* renamed from: j */
    public void m12515j(Throwable th) {
        Log.wtf(this.f11743a, th);
    }
}
