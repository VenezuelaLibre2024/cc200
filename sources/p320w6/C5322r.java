package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.r */
/* loaded from: classes.dex */
public final class C5322r extends AbstractC2601a implements InterfaceC1853m {
    public static final Parcelable.Creator<C5322r> CREATOR = new C5334x();

    /* renamed from: h */
    public final Status f20134h;

    /* renamed from: i */
    public final C5324s f20135i;

    public C5322r(Status status, C5324s c5324s) {
        this.f20134h = status;
        this.f20135i = c5324s;
    }

    /* renamed from: I */
    public C5324s m21395I() {
        return this.f20135i;
    }

    @Override // p079f6.InterfaceC1853m
    public Status getStatus() {
        return this.f20134h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, getStatus(), i10, false);
        C2603c.m10454D(parcel, 2, m21395I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
