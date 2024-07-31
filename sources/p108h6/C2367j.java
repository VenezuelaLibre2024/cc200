package p108h6;

import android.util.Log;

/* renamed from: h6.j */
/* loaded from: classes.dex */
public final class C2367j {

    /* renamed from: a */
    public final String f9648a;

    /* renamed from: b */
    public final String f9649b;

    public C2367j(String str) {
        this(str, null);
    }

    public C2367j(String str, String str2) {
        C2394s.m9620m(str, "log tag cannot be null");
        C2394s.m9610c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f9648a = str;
        this.f9649b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    /* renamed from: a */
    public boolean m9571a(int i10) {
        return Log.isLoggable(this.f9648a, i10);
    }

    /* renamed from: b */
    public void m9572b(String str, String str2) {
        if (m9571a(3)) {
            Log.d(str, m9576f(str2));
        }
    }

    /* renamed from: c */
    public void m9573c(String str, String str2, Throwable th) {
        if (m9571a(6)) {
            Log.e(str, m9576f(str2), th);
        }
    }

    /* renamed from: d */
    public void m9574d(String str, String str2) {
        if (m9571a(2)) {
            Log.v(str, m9576f(str2));
        }
    }

    /* renamed from: e */
    public void m9575e(String str, String str2) {
        if (m9571a(5)) {
            Log.w(str, m9576f(str2));
        }
    }

    /* renamed from: f */
    public final String m9576f(String str) {
        String str2 = this.f9649b;
        return str2 == null ? str : str2.concat(str);
    }
}
