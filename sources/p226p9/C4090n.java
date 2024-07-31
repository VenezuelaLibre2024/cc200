package p226p9;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p108h6.C2394s;
import p195n7.C3773m;

/* renamed from: p9.n */
/* loaded from: classes.dex */
public class C4090n extends C3773m {

    /* renamed from: h */
    public final int f14730h;

    /* renamed from: i */
    public final int f14731i;

    /* renamed from: j */
    public Throwable f14732j;

    public C4090n(int i10, Throwable th, int i11) {
        super(m15759g(i10));
        this.f14732j = th;
        this.f14730h = i10;
        this.f14731i = i11;
        Log.e("StorageException", "StorageException has occurred.\n" + m15759g(i10) + "\n Code: " + i10 + " HttpResult: " + i11);
        Throwable th2 = this.f14732j;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f14732j);
        }
    }

    /* renamed from: a */
    public static int m15754a(Status status) {
        if (status.m4990M()) {
            return -13040;
        }
        return status.equals(Status.f4473p) ? -13030 : -13000;
    }

    /* renamed from: b */
    public static int m15755b(Throwable th, int i10) {
        if (th instanceof C4064a) {
            return -13040;
        }
        if (i10 == -2) {
            return -13030;
        }
        if (i10 == 401) {
            return -13020;
        }
        if (i10 == 409) {
            return -13031;
        }
        if (i10 != 403) {
            return i10 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    /* renamed from: c */
    public static C4090n m15756c(Status status) {
        C2394s.m9619l(status);
        C2394s.m9608a(!status.m4991N());
        return new C4090n(m15754a(status), null, 0);
    }

    /* renamed from: d */
    public static C4090n m15757d(Throwable th) {
        return m15758e(th, 0);
    }

    /* renamed from: e */
    public static C4090n m15758e(Throwable th, int i10) {
        if (th instanceof C4090n) {
            return (C4090n) th;
        }
        if (m15760h(i10) && th == null) {
            return null;
        }
        return new C4090n(m15755b(th, i10), th, i10);
    }

    /* renamed from: g */
    public static String m15759g(int i10) {
        if (i10 == -13040) {
            return "The operation was cancelled.";
        }
        if (i10 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i10 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i10 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i10 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i10) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    /* renamed from: h */
    public static boolean m15760h(int i10) {
        return i10 == 0 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: f */
    public int m15761f() {
        return this.f14730h;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th = this.f14732j;
        if (th == this) {
            return null;
        }
        return th;
    }
}
