package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0126a();

    /* renamed from: h */
    public int f397h;

    /* renamed from: i */
    public int f398i;

    /* renamed from: j */
    public int f399j;

    /* renamed from: k */
    public int f400k;

    /* renamed from: l */
    public int f401l;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    public static class C0126a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f397h = parcel.readInt();
        this.f399j = parcel.readInt();
        this.f400k = parcel.readInt();
        this.f401l = parcel.readInt();
        this.f398i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f397h);
        parcel.writeInt(this.f399j);
        parcel.writeInt(this.f400k);
        parcel.writeInt(this.f401l);
        parcel.writeInt(this.f398i);
    }
}
