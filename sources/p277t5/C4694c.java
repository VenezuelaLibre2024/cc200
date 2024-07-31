package p277t5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: t5.c */
/* loaded from: classes.dex */
public class C4694c extends AbstractC2601a {
    public static final Parcelable.Creator<C4694c> CREATOR = new C4700i();

    /* renamed from: h */
    public final int f17536h;

    /* renamed from: i */
    public final List f17537i;

    public C4694c(int i10, List list) {
        this.f17536h = i10;
        this.f17537i = (List) C2394s.m9619l(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f17536h);
        C2603c.m10460J(parcel, 2, this.f17537i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
