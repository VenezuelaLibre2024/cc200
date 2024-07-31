package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.d */
/* loaded from: classes.dex */
public class C5294d extends AbstractC2601a {
    public static final Parcelable.Creator<C5294d> CREATOR = new C5309k0();

    /* renamed from: l */
    public static final Comparator<C5292c> f20059l = new C5307j0();

    /* renamed from: h */
    public final List f20060h;

    /* renamed from: i */
    public final String f20061i;

    /* renamed from: j */
    public final List f20062j;

    /* renamed from: k */
    public String f20063k;

    public C5294d(List list, String str, List list2, String str2) {
        C2394s.m9620m(list, "transitions can't be null");
        C2394s.m9609b(list.size() > 0, "transitions can't be empty.");
        C2394s.m9619l(list);
        TreeSet treeSet = new TreeSet(f20059l);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5292c c5292c = (C5292c) it.next();
            C2394s.m9609b(treeSet.add(c5292c), String.format("Found duplicated transition: %s.", c5292c));
        }
        this.f20060h = Collections.unmodifiableList(list);
        this.f20061i = str;
        this.f20062j = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f20063k = str2;
    }

    /* renamed from: I */
    public final C5294d m21366I(String str) {
        this.f20063k = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5294d c5294d = (C5294d) obj;
            if (C2388q.m9592b(this.f20060h, c5294d.f20060h) && C2388q.m9592b(this.f20061i, c5294d.f20061i) && C2388q.m9592b(this.f20063k, c5294d.f20063k) && C2388q.m9592b(this.f20062j, c5294d.f20062j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f20060h.hashCode() * 31;
        String str = this.f20061i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f20062j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f20063k;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.f20060h) + ", mTag='" + this.f20061i + "', mClients=" + String.valueOf(this.f20062j) + ", mAttributionTag=" + this.f20063k + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C2394s.m9619l(parcel);
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f20060h, false);
        C2603c.m10456F(parcel, 2, this.f20061i, false);
        C2603c.m10460J(parcel, 3, this.f20062j, false);
        C2603c.m10456F(parcel, 4, this.f20063k, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
