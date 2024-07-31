package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: m6.h */
/* loaded from: classes.dex */
public final class C3544h extends AbstractC2601a {
    public static final Parcelable.Creator<C3544h> CREATOR = new C3545i();

    /* renamed from: h */
    public final int f12443h;

    /* renamed from: i */
    public final HashMap f12444i;

    /* renamed from: j */
    public final String f12445j;

    public C3544h(int i10, ArrayList arrayList, String str) {
        this.f12443h = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3542f c3542f = (C3542f) arrayList.get(i11);
            String str2 = c3542f.f12438i;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C2394s.m9619l(c3542f.f12439j)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                C3543g c3543g = (C3543g) c3542f.f12439j.get(i12);
                hashMap2.put(c3543g.f12441i, c3543g.f12442j);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f12444i = hashMap;
        this.f12445j = (String) C2394s.m9619l(str);
        m13195K();
    }

    /* renamed from: I */
    public final String m13193I() {
        return this.f12445j;
    }

    /* renamed from: J */
    public final Map m13194J(String str) {
        return (Map) this.f12444i.get(str);
    }

    /* renamed from: K */
    public final void m13195K() {
        Iterator it = this.f12444i.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f12444i.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC3537a.a) map.get((String) it2.next())).m13186V(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f12444i.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f12444i.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12443h);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12444i.keySet()) {
            arrayList.add(new C3542f(str, (Map) this.f12444i.get(str)));
        }
        C2603c.m10460J(parcel, 2, arrayList, false);
        C2603c.m10456F(parcel, 3, this.f12445j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
