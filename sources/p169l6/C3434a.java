package p169l6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: l6.a */
/* loaded from: classes.dex */
public final class C3434a extends AbstractC2601a implements AbstractC3537a.b<String, Integer> {
    public static final Parcelable.Creator<C3434a> CREATOR = new C3438e();

    /* renamed from: h */
    public final int f12075h;

    /* renamed from: i */
    public final HashMap f12076i;

    /* renamed from: j */
    public final SparseArray f12077j;

    public C3434a() {
        this.f12075h = 1;
        this.f12076i = new HashMap();
        this.f12077j = new SparseArray();
    }

    public C3434a(int i10, ArrayList arrayList) {
        this.f12075h = i10;
        this.f12076i = new HashMap();
        this.f12077j = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3437d c3437d = (C3437d) arrayList.get(i11);
            m12783I(c3437d.f12081i, c3437d.f12082j);
        }
    }

    /* renamed from: I */
    public C3434a m12783I(String str, int i10) {
        this.f12076i.put(str, Integer.valueOf(i10));
        this.f12077j.put(i10, str);
        return this;
    }

    @Override // p182m6.AbstractC3537a.b
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo12784k(Object obj) {
        String str = (String) this.f12077j.get(((Integer) obj).intValue());
        return (str == null && this.f12076i.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // p182m6.AbstractC3537a.b
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ Object mo12785p(Object obj) {
        Integer num = (Integer) this.f12076i.get((String) obj);
        return num == null ? (Integer) this.f12076i.get("gms_unknown") : num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12075h);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12076i.keySet()) {
            arrayList.add(new C3437d(str, ((Integer) this.f12076i.get(str)).intValue()));
        }
        C2603c.m10460J(parcel, 2, arrayList, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
