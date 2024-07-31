package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p321w7.AbstractC5377j0;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.n0 */
/* loaded from: classes.dex */
public final class C5701n0 extends AbstractC2601a {
    public static final Parcelable.Creator<C5701n0> CREATOR = new C5710q0();

    /* renamed from: h */
    public final List<C5403r0> f21221h;

    /* renamed from: i */
    public final List<C5421x0> f21222i;

    public C5701n0(List<C5403r0> list, List<C5421x0> list2) {
        this.f21221h = list == null ? new ArrayList<>() : list;
        this.f21222i = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: J */
    public static C5701n0 m22787J(List<AbstractC5377j0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC5377j0 abstractC5377j0 : list) {
            if (abstractC5377j0 instanceof C5403r0) {
                arrayList.add((C5403r0) abstractC5377j0);
            } else if (abstractC5377j0 instanceof C5421x0) {
                arrayList2.add((C5421x0) abstractC5377j0);
            }
        }
        return new C5701n0(arrayList, arrayList2);
    }

    /* renamed from: I */
    public final List<AbstractC5377j0> m22788I() {
        ArrayList arrayList = new ArrayList();
        Iterator<C5403r0> it = this.f21221h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<C5421x0> it2 = this.f21222i.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f21221h, false);
        C2603c.m10460J(parcel, 2, this.f21222i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
