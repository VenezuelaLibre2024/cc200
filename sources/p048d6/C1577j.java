package p048d6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d6.j */
/* loaded from: classes.dex */
public final class C1577j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C1579l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1579l[i10];
    }
}
