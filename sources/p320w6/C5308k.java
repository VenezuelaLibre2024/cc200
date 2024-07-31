package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzdh;
import java.util.ArrayList;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.k */
/* loaded from: classes.dex */
public class C5308k extends AbstractC2601a {
    public static final Parcelable.Creator<C5308k> CREATOR = new C5315n0();

    /* renamed from: h */
    public final List f20095h;

    /* renamed from: i */
    public final int f20096i;

    /* renamed from: j */
    public final String f20097j;

    /* renamed from: k */
    public final String f20098k;

    /* renamed from: w6.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List f20099a = new ArrayList();

        /* renamed from: b */
        public int f20100b = 5;

        /* renamed from: c */
        public String f20101c = "";

        /* renamed from: a */
        public a m21381a(InterfaceC5302h interfaceC5302h) {
            C2394s.m9620m(interfaceC5302h, "geofence can't be null.");
            C2394s.m9609b(interfaceC5302h instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.f20099a.add((zzdh) interfaceC5302h);
            return this;
        }

        /* renamed from: b */
        public a m21382b(List<InterfaceC5302h> list) {
            if (list != null && !list.isEmpty()) {
                for (InterfaceC5302h interfaceC5302h : list) {
                    if (interfaceC5302h != null) {
                        m21381a(interfaceC5302h);
                    }
                }
            }
            return this;
        }

        /* renamed from: c */
        public C5308k m21383c() {
            C2394s.m9609b(!this.f20099a.isEmpty(), "No geofence has been added to this request.");
            return new C5308k(this.f20099a, this.f20100b, this.f20101c, null);
        }

        /* renamed from: d */
        public a m21384d(int i10) {
            this.f20100b = i10 & 7;
            return this;
        }
    }

    public C5308k(List list, int i10, String str, String str2) {
        this.f20095h = list;
        this.f20096i = i10;
        this.f20097j = str;
        this.f20098k = str2;
    }

    /* renamed from: I */
    public int m21379I() {
        return this.f20096i;
    }

    /* renamed from: J */
    public final C5308k m21380J(String str) {
        return new C5308k(this.f20095h, this.f20096i, this.f20097j, str);
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f20095h + ", initialTrigger=" + this.f20096i + ", tag=" + this.f20097j + ", attributionTag=" + this.f20098k + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f20095h, false);
        C2603c.m10485u(parcel, 2, m21379I());
        C2603c.m10456F(parcel, 3, this.f20097j, false);
        C2603c.m10456F(parcel, 4, this.f20098k, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
