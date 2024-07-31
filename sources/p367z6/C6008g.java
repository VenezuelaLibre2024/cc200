package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.g */
/* loaded from: classes.dex */
public final class C6008g extends AbstractC2601a {
    public static final Parcelable.Creator<C6008g> CREATOR = new C6025o0();

    /* renamed from: h */
    public LatLng f22407h;

    /* renamed from: i */
    public double f22408i;

    /* renamed from: j */
    public float f22409j;

    /* renamed from: k */
    public int f22410k;

    /* renamed from: l */
    public int f22411l;

    /* renamed from: m */
    public float f22412m;

    /* renamed from: n */
    public boolean f22413n;

    /* renamed from: o */
    public boolean f22414o;

    /* renamed from: p */
    public List f22415p;

    public C6008g() {
        this.f22407h = null;
        this.f22408i = 0.0d;
        this.f22409j = 10.0f;
        this.f22410k = -16777216;
        this.f22411l = 0;
        this.f22412m = 0.0f;
        this.f22413n = true;
        this.f22414o = false;
        this.f22415p = null;
    }

    public C6008g(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f22407h = latLng;
        this.f22408i = d10;
        this.f22409j = f10;
        this.f22410k = i10;
        this.f22411l = i11;
        this.f22412m = f11;
        this.f22413n = z10;
        this.f22414o = z11;
        this.f22415p = list;
    }

    /* renamed from: I */
    public C6008g m24105I(LatLng latLng) {
        C2394s.m9620m(latLng, "center must not be null.");
        this.f22407h = latLng;
        return this;
    }

    /* renamed from: J */
    public C6008g m24106J(boolean z10) {
        this.f22414o = z10;
        return this;
    }

    /* renamed from: K */
    public C6008g m24107K(int i10) {
        this.f22411l = i10;
        return this;
    }

    /* renamed from: L */
    public LatLng m24108L() {
        return this.f22407h;
    }

    /* renamed from: M */
    public int m24109M() {
        return this.f22411l;
    }

    /* renamed from: N */
    public double m24110N() {
        return this.f22408i;
    }

    /* renamed from: O */
    public int m24111O() {
        return this.f22410k;
    }

    /* renamed from: P */
    public List<C6024o> m24112P() {
        return this.f22415p;
    }

    /* renamed from: Q */
    public float m24113Q() {
        return this.f22409j;
    }

    /* renamed from: R */
    public float m24114R() {
        return this.f22412m;
    }

    /* renamed from: S */
    public boolean m24115S() {
        return this.f22414o;
    }

    /* renamed from: T */
    public boolean m24116T() {
        return this.f22413n;
    }

    /* renamed from: U */
    public C6008g m24117U(double d10) {
        this.f22408i = d10;
        return this;
    }

    /* renamed from: V */
    public C6008g m24118V(int i10) {
        this.f22410k = i10;
        return this;
    }

    /* renamed from: W */
    public C6008g m24119W(float f10) {
        this.f22409j = f10;
        return this;
    }

    /* renamed from: X */
    public C6008g m24120X(boolean z10) {
        this.f22413n = z10;
        return this;
    }

    /* renamed from: Y */
    public C6008g m24121Y(float f10) {
        this.f22412m = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m24108L(), i10, false);
        C2603c.m10478n(parcel, 3, m24110N());
        C2603c.m10481q(parcel, 4, m24113Q());
        C2603c.m10485u(parcel, 5, m24111O());
        C2603c.m10485u(parcel, 6, m24109M());
        C2603c.m10481q(parcel, 7, m24114R());
        C2603c.m10471g(parcel, 8, m24116T());
        C2603c.m10471g(parcel, 9, m24115S());
        C2603c.m10460J(parcel, 10, m24112P(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
