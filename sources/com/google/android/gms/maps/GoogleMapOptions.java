package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p336x6.C5638l;
import p352y6.C5828f;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends AbstractC2601a implements ReflectedParcelable {

    /* renamed from: h */
    public Boolean f4567h;

    /* renamed from: i */
    public Boolean f4568i;

    /* renamed from: j */
    public int f4569j;

    /* renamed from: k */
    public CameraPosition f4570k;

    /* renamed from: l */
    public Boolean f4571l;

    /* renamed from: m */
    public Boolean f4572m;

    /* renamed from: n */
    public Boolean f4573n;

    /* renamed from: o */
    public Boolean f4574o;

    /* renamed from: p */
    public Boolean f4575p;

    /* renamed from: q */
    public Boolean f4576q;

    /* renamed from: r */
    public Boolean f4577r;

    /* renamed from: s */
    public Boolean f4578s;

    /* renamed from: t */
    public Boolean f4579t;

    /* renamed from: u */
    public Float f4580u;

    /* renamed from: v */
    public Float f4581v;

    /* renamed from: w */
    public LatLngBounds f4582w;

    /* renamed from: x */
    public Boolean f4583x;

    /* renamed from: y */
    public Integer f4584y;

    /* renamed from: z */
    public String f4585z;
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C5638l();

    /* renamed from: A */
    public static final Integer f4566A = Integer.valueOf(Color.argb(255, 236, 233, 225));

    public GoogleMapOptions() {
        this.f4569j = -1;
        this.f4580u = null;
        this.f4581v = null;
        this.f4582w = null;
        this.f4584y = null;
        this.f4585z = null;
    }

    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f4569j = -1;
        this.f4580u = null;
        this.f4581v = null;
        this.f4582w = null;
        this.f4584y = null;
        this.f4585z = null;
        this.f4567h = C5828f.m23447b(b10);
        this.f4568i = C5828f.m23447b(b11);
        this.f4569j = i10;
        this.f4570k = cameraPosition;
        this.f4571l = C5828f.m23447b(b12);
        this.f4572m = C5828f.m23447b(b13);
        this.f4573n = C5828f.m23447b(b14);
        this.f4574o = C5828f.m23447b(b15);
        this.f4575p = C5828f.m23447b(b16);
        this.f4576q = C5828f.m23447b(b17);
        this.f4577r = C5828f.m23447b(b18);
        this.f4578s = C5828f.m23447b(b19);
        this.f4579t = C5828f.m23447b(b20);
        this.f4580u = f10;
        this.f4581v = f11;
        this.f4582w = latLngBounds;
        this.f4583x = C5828f.m23447b(b21);
        this.f4584y = num;
        this.f4585z = str;
    }

    /* renamed from: I */
    public GoogleMapOptions m5067I(CameraPosition cameraPosition) {
        this.f4570k = cameraPosition;
        return this;
    }

    /* renamed from: J */
    public GoogleMapOptions m5068J(boolean z10) {
        this.f4572m = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: K */
    public Integer m5069K() {
        return this.f4584y;
    }

    /* renamed from: L */
    public CameraPosition m5070L() {
        return this.f4570k;
    }

    /* renamed from: M */
    public LatLngBounds m5071M() {
        return this.f4582w;
    }

    /* renamed from: N */
    public Boolean m5072N() {
        return this.f4577r;
    }

    /* renamed from: O */
    public String m5073O() {
        return this.f4585z;
    }

    /* renamed from: P */
    public int m5074P() {
        return this.f4569j;
    }

    /* renamed from: Q */
    public Float m5075Q() {
        return this.f4581v;
    }

    /* renamed from: R */
    public Float m5076R() {
        return this.f4580u;
    }

    /* renamed from: S */
    public GoogleMapOptions m5077S(LatLngBounds latLngBounds) {
        this.f4582w = latLngBounds;
        return this;
    }

    /* renamed from: T */
    public GoogleMapOptions m5078T(boolean z10) {
        this.f4577r = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: U */
    public GoogleMapOptions m5079U(String str) {
        this.f4585z = str;
        return this;
    }

    /* renamed from: V */
    public GoogleMapOptions m5080V(boolean z10) {
        this.f4578s = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: W */
    public GoogleMapOptions m5081W(int i10) {
        this.f4569j = i10;
        return this;
    }

    /* renamed from: X */
    public GoogleMapOptions m5082X(float f10) {
        this.f4581v = Float.valueOf(f10);
        return this;
    }

    /* renamed from: Y */
    public GoogleMapOptions m5083Y(float f10) {
        this.f4580u = Float.valueOf(f10);
        return this;
    }

    /* renamed from: Z */
    public GoogleMapOptions m5084Z(boolean z10) {
        this.f4576q = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: a0 */
    public GoogleMapOptions m5085a0(boolean z10) {
        this.f4573n = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: b0 */
    public GoogleMapOptions m5086b0(boolean z10) {
        this.f4575p = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: c0 */
    public GoogleMapOptions m5087c0(boolean z10) {
        this.f4571l = Boolean.valueOf(z10);
        return this;
    }

    /* renamed from: d0 */
    public GoogleMapOptions m5088d0(boolean z10) {
        this.f4574o = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("MapType", Integer.valueOf(this.f4569j)).m9595a("LiteMode", this.f4577r).m9595a("Camera", this.f4570k).m9595a("CompassEnabled", this.f4572m).m9595a("ZoomControlsEnabled", this.f4571l).m9595a("ScrollGesturesEnabled", this.f4573n).m9595a("ZoomGesturesEnabled", this.f4574o).m9595a("TiltGesturesEnabled", this.f4575p).m9595a("RotateGesturesEnabled", this.f4576q).m9595a("ScrollGesturesEnabledDuringRotateOrZoom", this.f4583x).m9595a("MapToolbarEnabled", this.f4578s).m9595a("AmbientEnabled", this.f4579t).m9595a("MinZoomPreference", this.f4580u).m9595a("MaxZoomPreference", this.f4581v).m9595a("BackgroundColor", this.f4584y).m9595a("LatLngBoundsForCameraTarget", this.f4582w).m9595a("ZOrderOnTop", this.f4567h).m9595a("UseViewLifecycleInFragment", this.f4568i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10475k(parcel, 2, C5828f.m23446a(this.f4567h));
        C2603c.m10475k(parcel, 3, C5828f.m23446a(this.f4568i));
        C2603c.m10485u(parcel, 4, m5074P());
        C2603c.m10454D(parcel, 5, m5070L(), i10, false);
        C2603c.m10475k(parcel, 6, C5828f.m23446a(this.f4571l));
        C2603c.m10475k(parcel, 7, C5828f.m23446a(this.f4572m));
        C2603c.m10475k(parcel, 8, C5828f.m23446a(this.f4573n));
        C2603c.m10475k(parcel, 9, C5828f.m23446a(this.f4574o));
        C2603c.m10475k(parcel, 10, C5828f.m23446a(this.f4575p));
        C2603c.m10475k(parcel, 11, C5828f.m23446a(this.f4576q));
        C2603c.m10475k(parcel, 12, C5828f.m23446a(this.f4577r));
        C2603c.m10475k(parcel, 14, C5828f.m23446a(this.f4578s));
        C2603c.m10475k(parcel, 15, C5828f.m23446a(this.f4579t));
        C2603c.m10483s(parcel, 16, m5076R(), false);
        C2603c.m10483s(parcel, 17, m5075Q(), false);
        C2603c.m10454D(parcel, 18, m5071M(), i10, false);
        C2603c.m10475k(parcel, 19, C5828f.m23446a(this.f4583x));
        C2603c.m10487w(parcel, 20, m5069K(), false);
        C2603c.m10456F(parcel, 21, m5073O(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
