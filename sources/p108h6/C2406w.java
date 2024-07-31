package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.w */
/* loaded from: classes.dex */
public class C2406w extends AbstractC2601a {
    public static final Parcelable.Creator<C2406w> CREATOR = new C2344b0();

    /* renamed from: h */
    public final int f9727h;

    /* renamed from: i */
    public List f9728i;

    public C2406w(int i10, List list) {
        this.f9727h = i10;
        this.f9728i = list;
    }

    /* renamed from: I */
    public final int m9644I() {
        return this.f9727h;
    }

    /* renamed from: J */
    public final List m9645J() {
        return this.f9728i;
    }

    /* renamed from: K */
    public final void m9646K(C2385p c2385p) {
        if (this.f9728i == null) {
            this.f9728i = new ArrayList();
        }
        this.f9728i.add(c2385p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f9727h);
        C2603c.m10460J(parcel, 2, this.f9728i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
