package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.C4918e0;

/* renamed from: u6.c1 */
/* loaded from: classes.dex */
public final class C4911c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4918e0.a.m19480b(parcel.readString());
        } catch (C4918e0.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4918e0.a[i10];
    }
}
