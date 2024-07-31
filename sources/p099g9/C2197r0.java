package p099g9;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: g9.r0 */
/* loaded from: classes.dex */
public final class C2197r0 {

    /* renamed from: a */
    public final SharedPreferences f8730a;

    /* renamed from: b */
    public final String f8731b;

    /* renamed from: c */
    public final String f8732c;

    /* renamed from: e */
    public final Executor f8734e;

    /* renamed from: d */
    public final ArrayDeque<String> f8733d = new ArrayDeque<>();

    /* renamed from: f */
    public boolean f8735f = false;

    public C2197r0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8730a = sharedPreferences;
        this.f8731b = str;
        this.f8732c = str2;
        this.f8734e = executor;
    }

    /* renamed from: d */
    public static C2197r0 m8817d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C2197r0 c2197r0 = new C2197r0(sharedPreferences, str, str2, executor);
        c2197r0.m8820e();
        return c2197r0;
    }

    /* renamed from: b */
    public boolean m8818b(String str) {
        boolean m8819c;
        if (TextUtils.isEmpty(str) || str.contains(this.f8732c)) {
            return false;
        }
        synchronized (this.f8733d) {
            m8819c = m8819c(this.f8733d.add(str));
        }
        return m8819c;
    }

    /* renamed from: c */
    public final boolean m8819c(boolean z10) {
        if (z10 && !this.f8735f) {
            m8825j();
        }
        return z10;
    }

    /* renamed from: e */
    public final void m8820e() {
        synchronized (this.f8733d) {
            this.f8733d.clear();
            String string = this.f8730a.getString(this.f8731b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f8732c)) {
                String[] split = string.split(this.f8732c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f8733d.add(str);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public String m8821f() {
        String peek;
        synchronized (this.f8733d) {
            peek = this.f8733d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean m8822g(Object obj) {
        boolean m8819c;
        synchronized (this.f8733d) {
            m8819c = m8819c(this.f8733d.remove(obj));
        }
        return m8819c;
    }

    /* renamed from: h */
    public String m8823h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f8733d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f8732c);
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public final void m8824i() {
        synchronized (this.f8733d) {
            this.f8730a.edit().putString(this.f8731b, m8823h()).commit();
        }
    }

    /* renamed from: j */
    public final void m8825j() {
        this.f8734e.execute(new Runnable() { // from class: g9.q0
            @Override // java.lang.Runnable
            public final void run() {
                C2197r0.this.m8824i();
            }
        });
    }
}
