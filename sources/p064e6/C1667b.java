package p064e6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e6.b */
/* loaded from: classes.dex */
public final class C1667b extends AbstractC2601a {

    /* renamed from: h */
    public final int f6229h;

    /* renamed from: i */
    public final int f6230i;

    /* renamed from: j */
    public final PendingIntent f6231j;

    /* renamed from: k */
    public final String f6232k;

    /* renamed from: l */
    public static final C1667b f6228l = new C1667b(0);
    public static final Parcelable.Creator<C1667b> CREATOR = new C1693p();

    public C1667b(int i10) {
        this(i10, null, null);
    }

    public C1667b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f6229h = i10;
        this.f6230i = i11;
        this.f6231j = pendingIntent;
        this.f6232k = str;
    }

    public C1667b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C1667b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* renamed from: N */
    public static String m6676N(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    /* renamed from: I */
    public int m6677I() {
        return this.f6230i;
    }

    /* renamed from: J */
    public String m6678J() {
        return this.f6232k;
    }

    /* renamed from: K */
    public PendingIntent m6679K() {
        return this.f6231j;
    }

    /* renamed from: L */
    public boolean m6680L() {
        return (this.f6230i == 0 || this.f6231j == null) ? false : true;
    }

    /* renamed from: M */
    public boolean m6681M() {
        return this.f6230i == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1667b)) {
            return false;
        }
        C1667b c1667b = (C1667b) obj;
        return this.f6230i == c1667b.f6230i && C2388q.m9592b(this.f6231j, c1667b.f6231j) && C2388q.m9592b(this.f6232k, c1667b.f6232k);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f6230i), this.f6231j, this.f6232k);
    }

    public String toString() {
        C2388q.a m9594d = C2388q.m9594d(this);
        m9594d.m9595a("statusCode", m6676N(this.f6230i));
        m9594d.m9595a("resolution", this.f6231j);
        m9594d.m9595a(Constants.MESSAGE, this.f6232k);
        return m9594d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f6229h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, i11);
        C2603c.m10485u(parcel, 2, m6677I());
        C2603c.m10454D(parcel, 3, m6679K(), i10, false);
        C2603c.m10456F(parcel, 4, m6678J(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
