package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: m6.f */
/* loaded from: classes.dex */
public final class C3542f extends AbstractC2601a {
    public static final Parcelable.Creator<C3542f> CREATOR = new C3546j();

    /* renamed from: h */
    public final int f12437h;

    /* renamed from: i */
    public final String f12438i;

    /* renamed from: j */
    public final ArrayList f12439j;

    public C3542f(int i10, String str, ArrayList arrayList) {
        this.f12437h = i10;
        this.f12438i = str;
        this.f12439j = arrayList;
    }

    public C3542f(String str, Map map) {
        ArrayList arrayList;
        this.f12437h = 1;
        this.f12438i = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C3543g(str2, (AbstractC3537a.a) map.get(str2)));
            }
        }
        this.f12439j = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12437h);
        C2603c.m10456F(parcel, 2, this.f12438i, false);
        C2603c.m10460J(parcel, 3, this.f12439j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
