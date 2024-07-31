package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.a */
/* loaded from: classes.dex */
public final class C5596a extends AbstractC2601a {
    public static final Parcelable.Creator<C5596a> CREATOR = new C5613n();

    /* renamed from: h */
    public final String f20984h;

    /* renamed from: i */
    public final String f20985i;

    /* renamed from: j */
    public final String f20986j;

    /* renamed from: k */
    public final List f20987k;

    /* renamed from: l */
    public final GoogleSignInAccount f20988l;

    /* renamed from: m */
    public final PendingIntent f20989m;

    public C5596a(String str, String str2, String str3, List<String> list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f20984h = str;
        this.f20985i = str2;
        this.f20986j = str3;
        this.f20987k = (List) C2394s.m9619l(list);
        this.f20989m = pendingIntent;
        this.f20988l = googleSignInAccount;
    }

    /* renamed from: I */
    public String m22529I() {
        return this.f20985i;
    }

    /* renamed from: J */
    public List<String> m22530J() {
        return this.f20987k;
    }

    /* renamed from: K */
    public PendingIntent m22531K() {
        return this.f20989m;
    }

    /* renamed from: L */
    public String m22532L() {
        return this.f20984h;
    }

    /* renamed from: M */
    public GoogleSignInAccount m22533M() {
        return this.f20988l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5596a)) {
            return false;
        }
        C5596a c5596a = (C5596a) obj;
        return C2388q.m9592b(this.f20984h, c5596a.f20984h) && C2388q.m9592b(this.f20985i, c5596a.f20985i) && C2388q.m9592b(this.f20986j, c5596a.f20986j) && C2388q.m9592b(this.f20987k, c5596a.f20987k) && C2388q.m9592b(this.f20989m, c5596a.f20989m) && C2388q.m9592b(this.f20988l, c5596a.f20988l);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f20984h, this.f20985i, this.f20986j, this.f20987k, this.f20989m, this.f20988l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m22532L(), false);
        C2603c.m10456F(parcel, 2, m22529I(), false);
        C2603c.m10456F(parcel, 3, this.f20986j, false);
        C2603c.m10458H(parcel, 4, m22530J(), false);
        C2603c.m10454D(parcel, 5, m22533M(), i10, false);
        C2603c.m10454D(parcel, 6, m22531K(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
