package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.p */
/* loaded from: classes.dex */
public final class C5318p extends AbstractC2601a {
    public static final Parcelable.Creator<C5318p> CREATOR = new C5339z0();

    /* renamed from: h */
    public final List f20128h;

    /* renamed from: i */
    public final boolean f20129i;

    /* renamed from: j */
    public final boolean f20130j;

    /* renamed from: w6.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final ArrayList f20131a = new ArrayList();

        /* renamed from: b */
        public boolean f20132b = false;

        /* renamed from: c */
        public boolean f20133c = false;

        /* renamed from: a */
        public a m21392a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f20131a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: b */
        public C5318p m21393b() {
            return new C5318p(this.f20131a, this.f20132b, this.f20133c);
        }
    }

    public C5318p(List list, boolean z10, boolean z11) {
        this.f20128h = list;
        this.f20129i = z10;
        this.f20130j = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, Collections.unmodifiableList(this.f20128h), false);
        C2603c.m10471g(parcel, 2, this.f20129i);
        C2603c.m10471g(parcel, 3, this.f20130j);
        C2603c.m10466b(parcel, m10465a);
    }
}
