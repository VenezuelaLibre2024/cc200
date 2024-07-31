package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class C0292c implements Parcelable {
    public static final Parcelable.Creator<C0292c> CREATOR = new a();

    /* renamed from: h */
    public final List<String> f1367h;

    /* renamed from: i */
    public final List<C0290b> f1368i;

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C0292c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0292c createFromParcel(Parcel parcel) {
            return new C0292c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0292c[] newArray(int i10) {
            return new C0292c[i10];
        }
    }

    public C0292c(Parcel parcel) {
        this.f1367h = parcel.createStringArrayList();
        this.f1368i = parcel.createTypedArrayList(C0290b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1367h);
        parcel.writeTypedList(this.f1368i);
    }
}
