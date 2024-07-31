package p292u6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: u6.m */
/* loaded from: classes.dex */
public class C4945m extends AbstractC4948n {
    public static final Parcelable.Creator<C4945m> CREATOR = new C4980x1();

    /* renamed from: h */
    public final C4978x f18594h;

    /* renamed from: i */
    public final Uri f18595i;

    /* renamed from: j */
    public final byte[] f18596j;

    public C4945m(C4978x c4978x, Uri uri, byte[] bArr) {
        this.f18594h = (C4978x) C2394s.m9619l(c4978x);
        m19507L(uri);
        this.f18595i = uri;
        m19508M(bArr);
        this.f18596j = bArr;
    }

    /* renamed from: L */
    public static Uri m19507L(Uri uri) {
        C2394s.m9619l(uri);
        C2394s.m9609b(uri.getScheme() != null, "origin scheme must be non-empty");
        C2394s.m9609b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: M */
    public static byte[] m19508M(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        C2394s.m9609b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    /* renamed from: I */
    public byte[] m19509I() {
        return this.f18596j;
    }

    /* renamed from: J */
    public Uri m19510J() {
        return this.f18595i;
    }

    /* renamed from: K */
    public C4978x m19511K() {
        return this.f18594h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4945m)) {
            return false;
        }
        C4945m c4945m = (C4945m) obj;
        return C2388q.m9592b(this.f18594h, c4945m.f18594h) && C2388q.m9592b(this.f18595i, c4945m.f18595i);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18594h, this.f18595i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m19511K(), i10, false);
        C2603c.m10454D(parcel, 3, m19510J(), i10, false);
        C2603c.m10476l(parcel, 4, m19509I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
