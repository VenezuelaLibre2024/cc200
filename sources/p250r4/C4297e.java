package p250r4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r4.e */
/* loaded from: classes.dex */
public final class C4297e extends AbstractC4294b {
    public static final Parcelable.Creator<C4297e> CREATOR = new a();

    /* renamed from: r4.e$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4297e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4297e createFromParcel(Parcel parcel) {
            return new C4297e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4297e[] newArray(int i10) {
            return new C4297e[i10];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
