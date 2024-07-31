package p029c2;

import android.app.Notification;

/* renamed from: c2.e */
/* loaded from: classes.dex */
public final class C0587e {

    /* renamed from: a */
    public final int f2593a;

    /* renamed from: b */
    public final int f2594b;

    /* renamed from: c */
    public final Notification f2595c;

    public C0587e(int i10, Notification notification, int i11) {
        this.f2593a = i10;
        this.f2595c = notification;
        this.f2594b = i11;
    }

    /* renamed from: a */
    public int m2961a() {
        return this.f2594b;
    }

    /* renamed from: b */
    public Notification m2962b() {
        return this.f2595c;
    }

    /* renamed from: c */
    public int m2963c() {
        return this.f2593a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0587e.class != obj.getClass()) {
            return false;
        }
        C0587e c0587e = (C0587e) obj;
        if (this.f2593a == c0587e.f2593a && this.f2594b == c0587e.f2594b) {
            return this.f2595c.equals(c0587e.f2595c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2593a * 31) + this.f2594b) * 31) + this.f2595c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f2593a + ", mForegroundServiceType=" + this.f2594b + ", mNotification=" + this.f2595c + '}';
    }
}
