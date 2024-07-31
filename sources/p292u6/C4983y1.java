package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p292u6.C4951o;

/* renamed from: u6.y1 */
/* loaded from: classes.dex */
public final class C4983y1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4951o.m19512a(parcel.readInt());
        } catch (C4951o.a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4951o[i10];
    }
}
