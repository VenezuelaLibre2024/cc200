package p265s4;

import android.os.Parcel;
import android.os.Parcelable;
import p192n4.C3730b;

/* renamed from: s4.a */
/* loaded from: classes.dex */
public final class C4531a extends C3730b {
    public static final Parcelable.Creator<C4531a> CREATOR = new a();

    /* renamed from: s4.a$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C4531a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4531a createFromParcel(Parcel parcel) {
            return new C4531a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4531a[] newArray(int i10) {
            return new C4531a[i10];
        }
    }

    public C4531a(Parcel parcel) {
        super(parcel);
    }

    public C4531a(String str, String str2) {
        super(str, str2);
    }
}
