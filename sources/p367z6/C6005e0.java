package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.e0 */
/* loaded from: classes.dex */
public final class C6005e0 extends AbstractC2601a {
    public static final Parcelable.Creator<C6005e0> CREATOR = new C6021m0();

    /* renamed from: h */
    public final LatLng f22401h;

    /* renamed from: i */
    public final LatLng f22402i;

    /* renamed from: j */
    public final LatLng f22403j;

    /* renamed from: k */
    public final LatLng f22404k;

    /* renamed from: l */
    public final LatLngBounds f22405l;

    public C6005e0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f22401h = latLng;
        this.f22402i = latLng2;
        this.f22403j = latLng3;
        this.f22404k = latLng4;
        this.f22405l = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6005e0)) {
            return false;
        }
        C6005e0 c6005e0 = (C6005e0) obj;
        return this.f22401h.equals(c6005e0.f22401h) && this.f22402i.equals(c6005e0.f22402i) && this.f22403j.equals(c6005e0.f22403j) && this.f22404k.equals(c6005e0.f22404k) && this.f22405l.equals(c6005e0.f22405l);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f22401h, this.f22402i, this.f22403j, this.f22404k, this.f22405l);
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("nearLeft", this.f22401h).m9595a("nearRight", this.f22402i).m9595a("farLeft", this.f22403j).m9595a("farRight", this.f22404k).m9595a("latLngBounds", this.f22405l).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f22401h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, latLng, i10, false);
        C2603c.m10454D(parcel, 3, this.f22402i, i10, false);
        C2603c.m10454D(parcel, 4, this.f22403j, i10, false);
        C2603c.m10454D(parcel, 5, this.f22404k, i10, false);
        C2603c.m10454D(parcel, 6, this.f22405l, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
