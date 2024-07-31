package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p377firebaseauthapi.zzyi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108h6.C2394s;
import p125i6.C2603c;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5373i0;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5381k0;
import p321w7.AbstractC5385l0;
import p321w7.C5403r0;
import p321w7.C5421x0;
import p321w7.C5428z1;
import p321w7.InterfaceC5372i;

/* renamed from: x7.o */
/* loaded from: classes.dex */
public final class C5703o extends AbstractC5381k0 {
    public static final Parcelable.Creator<C5703o> CREATOR = new C5709q();

    /* renamed from: h */
    public final List<C5403r0> f21224h;

    /* renamed from: i */
    public final C5706p f21225i;

    /* renamed from: j */
    public final String f21226j;

    /* renamed from: k */
    public final C5428z1 f21227k;

    /* renamed from: l */
    public final C5685i f21228l;

    /* renamed from: m */
    public final List<C5421x0> f21229m;

    public C5703o(List<C5403r0> list, C5706p c5706p, String str, C5428z1 c5428z1, C5685i c5685i, List<C5421x0> list2) {
        this.f21224h = (List) C2394s.m9619l(list);
        this.f21225i = (C5706p) C2394s.m9619l(c5706p);
        this.f21226j = C2394s.m9613f(str);
        this.f21227k = c5428z1;
        this.f21228l = c5685i;
        this.f21229m = (List) C2394s.m9619l(list2);
    }

    /* renamed from: N */
    public static C5703o m22790N(zzyi zzyiVar, FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        List<AbstractC5377j0> zzc = zzyiVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (AbstractC5377j0 abstractC5377j0 : zzc) {
            if (abstractC5377j0 instanceof C5403r0) {
                arrayList.add((C5403r0) abstractC5377j0);
            }
        }
        List<AbstractC5377j0> zzc2 = zzyiVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC5377j0 abstractC5377j02 : zzc2) {
            if (abstractC5377j02 instanceof C5421x0) {
                arrayList2.add((C5421x0) abstractC5377j02);
            }
        }
        return new C5703o(arrayList, C5706p.m22794K(zzyiVar.zzc(), zzyiVar.zzb()), firebaseAuth.m5236i().m14350q(), zzyiVar.zza(), (C5685i) abstractC5341a0, arrayList2);
    }

    @Override // p321w7.AbstractC5381k0
    /* renamed from: I */
    public final FirebaseAuth mo21519I() {
        return FirebaseAuth.getInstance(C3767g.m14335p(this.f21226j));
    }

    @Override // p321w7.AbstractC5381k0
    /* renamed from: J */
    public final List<AbstractC5377j0> mo21520J() {
        ArrayList arrayList = new ArrayList();
        Iterator<C5403r0> it = this.f21224h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<C5421x0> it2 = this.f21229m.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // p321w7.AbstractC5381k0
    /* renamed from: K */
    public final AbstractC5385l0 mo21521K() {
        return this.f21225i;
    }

    @Override // p321w7.AbstractC5381k0
    /* renamed from: L */
    public final Task<InterfaceC5372i> mo21522L(AbstractC5373i0 abstractC5373i0) {
        return mo21519I().m5223X(abstractC5373i0, this.f21225i, this.f21228l).continueWithTask(new C5700n(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f21224h, false);
        C2603c.m10454D(parcel, 2, mo21521K(), i10, false);
        C2603c.m10456F(parcel, 3, this.f21226j, false);
        C2603c.m10454D(parcel, 4, this.f21227k, i10, false);
        C2603c.m10454D(parcel, 5, this.f21228l, i10, false);
        C2603c.m10460J(parcel, 6, this.f21229m, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
