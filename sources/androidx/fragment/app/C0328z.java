package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC0326x;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C0328z implements Parcelable {
    public static final Parcelable.Creator<C0328z> CREATOR = new a();

    /* renamed from: h */
    public ArrayList<String> f1646h;

    /* renamed from: i */
    public ArrayList<String> f1647i;

    /* renamed from: j */
    public C0290b[] f1648j;

    /* renamed from: k */
    public int f1649k;

    /* renamed from: l */
    public String f1650l;

    /* renamed from: m */
    public ArrayList<String> f1651m;

    /* renamed from: n */
    public ArrayList<C0292c> f1652n;

    /* renamed from: o */
    public ArrayList<AbstractC0326x.l> f1653o;

    /* renamed from: androidx.fragment.app.z$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C0328z> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0328z createFromParcel(Parcel parcel) {
            return new C0328z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0328z[] newArray(int i10) {
            return new C0328z[i10];
        }
    }

    public C0328z() {
        this.f1650l = null;
        this.f1651m = new ArrayList<>();
        this.f1652n = new ArrayList<>();
    }

    public C0328z(Parcel parcel) {
        this.f1650l = null;
        this.f1651m = new ArrayList<>();
        this.f1652n = new ArrayList<>();
        this.f1646h = parcel.createStringArrayList();
        this.f1647i = parcel.createStringArrayList();
        this.f1648j = (C0290b[]) parcel.createTypedArray(C0290b.CREATOR);
        this.f1649k = parcel.readInt();
        this.f1650l = parcel.readString();
        this.f1651m = parcel.createStringArrayList();
        this.f1652n = parcel.createTypedArrayList(C0292c.CREATOR);
        this.f1653o = parcel.createTypedArrayList(AbstractC0326x.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1646h);
        parcel.writeStringList(this.f1647i);
        parcel.writeTypedArray(this.f1648j, i10);
        parcel.writeInt(this.f1649k);
        parcel.writeString(this.f1650l);
        parcel.writeStringList(this.f1651m);
        parcel.writeTypedList(this.f1652n);
        parcel.writeTypedList(this.f1653o);
    }
}
