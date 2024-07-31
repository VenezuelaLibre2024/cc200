package p292u6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: u6.l */
/* loaded from: classes.dex */
public class C4942l extends AbstractC4948n {
    public static final Parcelable.Creator<C4942l> CREATOR = new C4977w1();

    /* renamed from: h */
    public final C4969u f18591h;

    /* renamed from: i */
    public final Uri f18592i;

    /* renamed from: j */
    public final byte[] f18593j;

    public C4942l(C4969u c4969u, Uri uri, byte[] bArr) {
        this.f18591h = (C4969u) C2394s.m9619l(c4969u);
        m19502L(uri);
        this.f18592i = uri;
        m19503M(bArr);
        this.f18593j = bArr;
    }

    /* renamed from: L */
    public static Uri m19502L(Uri uri) {
        C2394s.m9619l(uri);
        C2394s.m9609b(uri.getScheme() != null, "origin scheme must be non-empty");
        C2394s.m9609b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: M */
    public static byte[] m19503M(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        C2394s.m9609b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    /* renamed from: I */
    public byte[] m19504I() {
        return this.f18593j;
    }

    /* renamed from: J */
    public Uri m19505J() {
        return this.f18592i;
    }

    /* renamed from: K */
    public C4969u m19506K() {
        return this.f18591h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4942l)) {
            return false;
        }
        C4942l c4942l = (C4942l) obj;
        return C2388q.m9592b(this.f18591h, c4942l.f18591h) && C2388q.m9592b(this.f18592i, c4942l.f18592i);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18591h, this.f18592i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m19506K(), i10, false);
        C2603c.m10454D(parcel, 3, m19505J(), i10, false);
        C2603c.m10476l(parcel, 4, m19504I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
