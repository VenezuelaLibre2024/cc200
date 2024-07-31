package p205o4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p152k4.C3348a;
import p222p5.C4014a;
import p264s3.C4528z1;

/* renamed from: o4.c */
/* loaded from: classes.dex */
public final class C3891c implements C3348a.b {
    public static final Parcelable.Creator<C3891c> CREATOR = new a();

    /* renamed from: h */
    public final byte[] f13963h;

    /* renamed from: i */
    public final String f13964i;

    /* renamed from: j */
    public final String f13965j;

    /* renamed from: o4.c$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C3891c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3891c createFromParcel(Parcel parcel) {
            return new C3891c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3891c[] newArray(int i10) {
            return new C3891c[i10];
        }
    }

    public C3891c(Parcel parcel) {
        this.f13963h = (byte[]) C4014a.m15199e(parcel.createByteArray());
        this.f13964i = parcel.readString();
        this.f13965j = parcel.readString();
    }

    public C3891c(byte[] bArr, String str, String str2) {
        this.f13963h = bArr;
        this.f13964i = str;
        this.f13965j = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3891c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13963h, ((C3891c) obj).f13963h);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13963h);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f13964i, this.f13965j, Integer.valueOf(this.f13963h.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f13963h);
        parcel.writeString(this.f13964i);
        parcel.writeString(this.f13965j);
    }

    @Override // p152k4.C3348a.b
    /* renamed from: z */
    public void mo12419z(C4528z1.b bVar) {
        String str = this.f13964i;
        if (str != null) {
            bVar.m17938m0(str);
        }
    }
}
