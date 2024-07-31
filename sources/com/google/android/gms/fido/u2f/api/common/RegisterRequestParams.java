package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;
import p307v6.C5126a;
import p307v6.C5129d;
import p307v6.C5130e;
import p307v6.C5136k;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C5136k();

    /* renamed from: h */
    public final Integer f4511h;

    /* renamed from: i */
    public final Double f4512i;

    /* renamed from: j */
    public final Uri f4513j;

    /* renamed from: k */
    public final List f4514k;

    /* renamed from: l */
    public final List f4515l;

    /* renamed from: m */
    public final C5126a f4516m;

    /* renamed from: n */
    public final String f4517n;

    /* renamed from: o */
    public Set f4518o;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, C5126a c5126a, String str) {
        this.f4511h = num;
        this.f4512i = d10;
        this.f4513j = uri;
        C2394s.m9609b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f4514k = list;
        this.f4515l = list2;
        this.f4516m = c5126a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5129d c5129d = (C5129d) it.next();
            C2394s.m9609b((uri == null && c5129d.m20811I() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (c5129d.m20811I() != null) {
                hashSet.add(Uri.parse(c5129d.m20811I()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C5130e c5130e = (C5130e) it2.next();
            C2394s.m9609b((uri == null && c5130e.m20814I() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (c5130e.m20814I() != null) {
                hashSet.add(Uri.parse(c5130e.m20814I()));
            }
        }
        this.f4518o = hashSet;
        C2394s.m9609b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f4517n = str;
    }

    /* renamed from: I */
    public Uri m5010I() {
        return this.f4513j;
    }

    /* renamed from: J */
    public C5126a m5011J() {
        return this.f4516m;
    }

    /* renamed from: K */
    public String m5012K() {
        return this.f4517n;
    }

    /* renamed from: L */
    public List<C5129d> m5013L() {
        return this.f4514k;
    }

    /* renamed from: M */
    public List<C5130e> m5014M() {
        return this.f4515l;
    }

    /* renamed from: N */
    public Integer m5015N() {
        return this.f4511h;
    }

    /* renamed from: O */
    public Double m5016O() {
        return this.f4512i;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return C2388q.m9592b(this.f4511h, registerRequestParams.f4511h) && C2388q.m9592b(this.f4512i, registerRequestParams.f4512i) && C2388q.m9592b(this.f4513j, registerRequestParams.f4513j) && C2388q.m9592b(this.f4514k, registerRequestParams.f4514k) && (((list = this.f4515l) == null && registerRequestParams.f4515l == null) || (list != null && (list2 = registerRequestParams.f4515l) != null && list.containsAll(list2) && registerRequestParams.f4515l.containsAll(this.f4515l))) && C2388q.m9592b(this.f4516m, registerRequestParams.f4516m) && C2388q.m9592b(this.f4517n, registerRequestParams.f4517n);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4511h, this.f4513j, this.f4512i, this.f4514k, this.f4515l, this.f4516m, this.f4517n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10487w(parcel, 2, m5015N(), false);
        C2603c.m10480p(parcel, 3, m5016O(), false);
        C2603c.m10454D(parcel, 4, m5010I(), i10, false);
        C2603c.m10460J(parcel, 5, m5013L(), false);
        C2603c.m10460J(parcel, 6, m5014M(), false);
        C2603c.m10454D(parcel, 7, m5011J(), i10, false);
        C2603c.m10456F(parcel, 8, m5012K(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
