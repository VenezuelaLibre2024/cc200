package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p367z6.C6029q0;

/* loaded from: classes.dex */
public final class LatLngBounds extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C6029q0();

    /* renamed from: h */
    public final LatLng f4596h;

    /* renamed from: i */
    public final LatLng f4597i;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    /* loaded from: classes.dex */
    public static final class C1180a {

        /* renamed from: a */
        public double f4598a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        public double f4599b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        public double f4600c = Double.NaN;

        /* renamed from: d */
        public double f4601d = Double.NaN;

        /* renamed from: a */
        public LatLngBounds m5098a() {
            C2394s.m9623p(!Double.isNaN(this.f4600c), "no included points");
            return new LatLngBounds(new LatLng(this.f4598a, this.f4600c), new LatLng(this.f4599b, this.f4601d));
        }

        /* renamed from: b */
        public C1180a m5099b(LatLng latLng) {
            C2394s.m9620m(latLng, "point must not be null");
            this.f4598a = Math.min(this.f4598a, latLng.f4594h);
            this.f4599b = Math.max(this.f4599b, latLng.f4594h);
            double d10 = latLng.f4595i;
            if (!Double.isNaN(this.f4600c)) {
                double d11 = this.f4600c;
                double d12 = this.f4601d;
                if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                        this.f4600c = d10;
                    }
                }
                return this;
            }
            this.f4600c = d10;
            this.f4601d = d10;
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C2394s.m9620m(latLng, "southwest must not be null.");
        C2394s.m9620m(latLng2, "northeast must not be null.");
        double d10 = latLng2.f4594h;
        double d11 = latLng.f4594h;
        C2394s.m9610c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f4594h));
        this.f4596h = latLng;
        this.f4597i = latLng2;
    }

    /* renamed from: I */
    public static C1180a m5095I() {
        return new C1180a();
    }

    /* renamed from: J */
    public boolean m5096J(LatLng latLng) {
        LatLng latLng2 = (LatLng) C2394s.m9620m(latLng, "point must not be null.");
        double d10 = latLng2.f4594h;
        return this.f4596h.f4594h <= d10 && d10 <= this.f4597i.f4594h && m5097K(latLng2.f4595i);
    }

    /* renamed from: K */
    public final boolean m5097K(double d10) {
        LatLng latLng = this.f4597i;
        double d11 = this.f4596h.f4595i;
        double d12 = latLng.f4595i;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f4596h.equals(latLngBounds.f4596h) && this.f4597i.equals(latLngBounds.f4597i);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4596h, this.f4597i);
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("southwest", this.f4596h).m9595a("northeast", this.f4597i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f4596h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, latLng, i10, false);
        C2603c.m10454D(parcel, 3, this.f4597i, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
