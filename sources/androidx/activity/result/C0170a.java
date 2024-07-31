package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0170a implements Parcelable {
    public static final Parcelable.Creator<C0170a> CREATOR = new a();

    /* renamed from: h */
    public final int f510h;

    /* renamed from: i */
    public final Intent f511i;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C0170a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0170a createFromParcel(Parcel parcel) {
            return new C0170a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0170a[] newArray(int i10) {
            return new C0170a[i10];
        }
    }

    public C0170a(int i10, Intent intent) {
        this.f510h = i10;
        this.f511i = intent;
    }

    public C0170a(Parcel parcel) {
        this.f510h = parcel.readInt();
        this.f511i = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: d */
    public static String m622d(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m623a() {
        return this.f511i;
    }

    /* renamed from: b */
    public int m624b() {
        return this.f510h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m622d(this.f510h) + ", data=" + this.f511i + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f510h);
        parcel.writeInt(this.f511i == null ? 0 : 1);
        Intent intent = this.f511i;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
