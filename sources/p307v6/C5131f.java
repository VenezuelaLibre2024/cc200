package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import p307v6.C5126a;

/* renamed from: v6.f */
/* loaded from: classes.dex */
public final class C5131f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C5126a.m20801L(parcel.readInt());
        } catch (C5126a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5126a.a[i10];
    }
}
