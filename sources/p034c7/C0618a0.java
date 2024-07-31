package p034c7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.a0 */
/* loaded from: classes.dex */
public final class C0618a0 extends AbstractC2601a implements Iterable<String> {
    public static final Parcelable.Creator<C0618a0> CREATOR = new C0663d0();

    /* renamed from: h */
    public final Bundle f2754h;

    public C0618a0(Bundle bundle) {
        this.f2754h = bundle;
    }

    /* renamed from: I */
    public final int m3077I() {
        return this.f2754h.size();
    }

    /* renamed from: K */
    public final Double m3078K(String str) {
        return Double.valueOf(this.f2754h.getDouble(str));
    }

    /* renamed from: L */
    public final Bundle m3079L() {
        return new Bundle(this.f2754h);
    }

    /* renamed from: M */
    public final Long m3080M(String str) {
        return Long.valueOf(this.f2754h.getLong(str));
    }

    /* renamed from: N */
    public final Object m3081N(String str) {
        return this.f2754h.get(str);
    }

    /* renamed from: O */
    public final String m3082O(String str) {
        return this.f2754h.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C0677e0(this);
    }

    public final String toString() {
        return this.f2754h.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10474j(parcel, 2, m3079L(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
