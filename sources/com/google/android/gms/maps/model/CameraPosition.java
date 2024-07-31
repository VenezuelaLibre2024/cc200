package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p367z6.C6007f0;

/* loaded from: classes.dex */
public final class CameraPosition extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C6007f0();

    /* renamed from: h */
    public final LatLng f4586h;

    /* renamed from: i */
    public final float f4587i;

    /* renamed from: j */
    public final float f4588j;

    /* renamed from: k */
    public final float f4589k;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    /* loaded from: classes.dex */
    public static final class C1179a {

        /* renamed from: a */
        public LatLng f4590a;

        /* renamed from: b */
        public float f4591b;

        /* renamed from: c */
        public float f4592c;

        /* renamed from: d */
        public float f4593d;

        /* renamed from: a */
        public C1179a m5090a(float f10) {
            this.f4593d = f10;
            return this;
        }

        /* renamed from: b */
        public CameraPosition m5091b() {
            return new CameraPosition(this.f4590a, this.f4591b, this.f4592c, this.f4593d);
        }

        /* renamed from: c */
        public C1179a m5092c(LatLng latLng) {
            this.f4590a = (LatLng) C2394s.m9620m(latLng, "location must not be null.");
            return this;
        }

        /* renamed from: d */
        public C1179a m5093d(float f10) {
            this.f4592c = f10;
            return this;
        }

        /* renamed from: e */
        public C1179a m5094e(float f10) {
            this.f4591b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        C2394s.m9620m(latLng, "camera target must not be null.");
        C2394s.m9610c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f4586h = latLng;
        this.f4587i = f10;
        this.f4588j = f11 + 0.0f;
        this.f4589k = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    /* renamed from: I */
    public static C1179a m5089I() {
        return new C1179a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f4586h.equals(cameraPosition.f4586h) && Float.floatToIntBits(this.f4587i) == Float.floatToIntBits(cameraPosition.f4587i) && Float.floatToIntBits(this.f4588j) == Float.floatToIntBits(cameraPosition.f4588j) && Float.floatToIntBits(this.f4589k) == Float.floatToIntBits(cameraPosition.f4589k);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4586h, Float.valueOf(this.f4587i), Float.valueOf(this.f4588j), Float.valueOf(this.f4589k));
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("target", this.f4586h).m9595a("zoom", Float.valueOf(this.f4587i)).m9595a("tilt", Float.valueOf(this.f4588j)).m9595a("bearing", Float.valueOf(this.f4589k)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f4586h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, latLng, i10, false);
        C2603c.m10481q(parcel, 3, this.f4587i);
        C2603c.m10481q(parcel, 4, this.f4588j);
        C2603c.m10481q(parcel, 5, this.f4589k);
        C2603c.m10466b(parcel, m10465a);
    }
}
