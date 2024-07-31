package p325wb;

import android.util.Log;

/* renamed from: wb.e */
/* loaded from: classes.dex */
public class C5472e {

    /* renamed from: b */
    public static int f20360b;

    /* renamed from: a */
    public String f20361a;

    public C5472e(String str) {
        this.f20361a = str;
    }

    /* renamed from: e */
    public static void m21680e(int i10) {
        f20360b = i10;
    }

    /* renamed from: a */
    public void m21681a(String str, Throwable th) {
        m21684d(3, str, th);
    }

    /* renamed from: b */
    public void m21682b(String str) {
        m21683c(str, null);
    }

    /* renamed from: c */
    public void m21683c(String str, Throwable th) {
        m21684d(1, str, th);
    }

    /* renamed from: d */
    public final void m21684d(int i10, String str, Throwable th) {
        if (m21685f(i10)) {
            if (i10 == 0) {
                Log.v(this.f20361a, str, th);
                return;
            }
            if (i10 == 1) {
                Log.i(this.f20361a, str, th);
            } else if (i10 == 2) {
                Log.w(this.f20361a, str, th);
            } else {
                if (i10 != 3) {
                    return;
                }
                Log.e(this.f20361a, str, th);
            }
        }
    }

    /* renamed from: f */
    public final boolean m21685f(int i10) {
        return f20360b <= i10;
    }

    /* renamed from: g */
    public void m21686g(String str) {
        m21687h(str, null);
    }

    /* renamed from: h */
    public void m21687h(String str, Throwable th) {
        m21684d(0, str, th);
    }

    /* renamed from: i */
    public void m21688i(String str) {
        m21689j(str, null);
    }

    /* renamed from: j */
    public void m21689j(String str, Throwable th) {
        m21684d(2, str, th);
    }
}
