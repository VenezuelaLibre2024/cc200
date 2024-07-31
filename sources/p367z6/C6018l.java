package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.l */
/* loaded from: classes.dex */
public final class C6018l extends AbstractC2601a {

    /* renamed from: h */
    public final String f22424h;

    /* renamed from: i */
    public static final String f22423i = C6018l.class.getSimpleName();
    public static final Parcelable.Creator<C6018l> CREATOR = new C6033s0();

    public C6018l(String str) {
        C2394s.m9620m(str, "json must not be null");
        this.f22424h = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22424h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, str, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
