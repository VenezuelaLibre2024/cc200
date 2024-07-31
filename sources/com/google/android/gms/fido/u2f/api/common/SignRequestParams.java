package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;
import p307v6.C5126a;
import p307v6.C5130e;
import p307v6.C5138m;

@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C5138m();

    /* renamed from: h */
    public final Integer f4519h;

    /* renamed from: i */
    public final Double f4520i;

    /* renamed from: j */
    public final Uri f4521j;

    /* renamed from: k */
    public final byte[] f4522k;

    /* renamed from: l */
    public final List f4523l;

    /* renamed from: m */
    public final C5126a f4524m;

    /* renamed from: n */
    public final String f4525n;

    /* renamed from: o */
    public final Set f4526o;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, C5126a c5126a, String str) {
        this.f4519h = num;
        this.f4520i = d10;
        this.f4521j = uri;
        this.f4522k = bArr;
        C2394s.m9609b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f4523l = list;
        this.f4524m = c5126a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            C2394s.m9609b((c5130e.m20814I() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            c5130e.m20815J();
            C2394s.m9609b(true, "register request has null challenge and no default challenge isprovided");
            if (c5130e.m20814I() != null) {
                hashSet.add(Uri.parse(c5130e.m20814I()));
            }
        }
        this.f4526o = hashSet;
        C2394s.m9609b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f4525n = str;
    }

    /* renamed from: I */
    public Uri m5017I() {
        return this.f4521j;
    }

    /* renamed from: J */
    public C5126a m5018J() {
        return this.f4524m;
    }

    /* renamed from: K */
    public byte[] m5019K() {
        return this.f4522k;
    }

    /* renamed from: L */
    public String m5020L() {
        return this.f4525n;
    }

    /* renamed from: M */
    public List<C5130e> m5021M() {
        return this.f4523l;
    }

    /* renamed from: N */
    public Integer m5022N() {
        return this.f4519h;
    }

    /* renamed from: O */
    public Double m5023O() {
        return this.f4520i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return C2388q.m9592b(this.f4519h, signRequestParams.f4519h) && C2388q.m9592b(this.f4520i, signRequestParams.f4520i) && C2388q.m9592b(this.f4521j, signRequestParams.f4521j) && Arrays.equals(this.f4522k, signRequestParams.f4522k) && this.f4523l.containsAll(signRequestParams.f4523l) && signRequestParams.f4523l.containsAll(this.f4523l) && C2388q.m9592b(this.f4524m, signRequestParams.f4524m) && C2388q.m9592b(this.f4525n, signRequestParams.f4525n);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4519h, this.f4521j, this.f4520i, this.f4523l, this.f4524m, this.f4525n, Integer.valueOf(Arrays.hashCode(this.f4522k)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10487w(parcel, 2, m5022N(), false);
        C2603c.m10480p(parcel, 3, m5023O(), false);
        C2603c.m10454D(parcel, 4, m5017I(), i10, false);
        C2603c.m10476l(parcel, 5, m5019K(), false);
        C2603c.m10460J(parcel, 6, m5021M(), false);
        C2603c.m10454D(parcel, 7, m5018J(), i10, false);
        C2603c.m10456F(parcel, 8, m5020L(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
