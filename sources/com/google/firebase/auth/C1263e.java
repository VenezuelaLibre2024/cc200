package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C1260b;
import p125i6.C2602b;

/* renamed from: com.google.firebase.auth.e */
/* loaded from: classes.dex */
public final class C1263e implements Parcelable.Creator<C1260b.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1260b.a createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            C2602b.m10446v(m10412D);
            C2602b.m10421M(parcel, m10412D);
        }
        C2602b.m10445u(parcel, m10422N);
        return new C1260b.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1260b.a[] newArray(int i10) {
        return new C1260b.a[i10];
    }
}
