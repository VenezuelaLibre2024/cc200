package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.InterfaceC4307b;

/* renamed from: z6.e */
/* loaded from: classes.dex */
public class C6004e extends AbstractC2601a {

    /* renamed from: h */
    public final int f22398h;

    /* renamed from: i */
    public final C5998b f22399i;

    /* renamed from: j */
    public final Float f22400j;

    /* renamed from: k */
    public static final String f22397k = C6004e.class.getSimpleName();
    public static final Parcelable.Creator<C6004e> CREATOR = new C6023n0();

    public C6004e(int i10) {
        this(i10, (C5998b) null, (Float) null);
    }

    public C6004e(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new C5998b(InterfaceC4307b.a.m16570c(iBinder)), f10);
    }

    public C6004e(int i10, C5998b c5998b, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            z10 = c5998b != null && z11;
            i10 = 3;
        } else {
            z10 = true;
        }
        C2394s.m9609b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), c5998b, f10));
        this.f22398h = i10;
        this.f22399i = c5998b;
        this.f22400j = f10;
    }

    public C6004e(C5998b c5998b, float f10) {
        this(3, c5998b, Float.valueOf(f10));
    }

    /* renamed from: I */
    public final C6004e m24094I() {
        int i10 = this.f22398h;
        if (i10 == 0) {
            return new C6002d();
        }
        if (i10 == 1) {
            return new C6040w();
        }
        if (i10 == 2) {
            return new C6036u();
        }
        if (i10 == 3) {
            C2394s.m9623p(this.f22399i != null, "bitmapDescriptor must not be null");
            C2394s.m9623p(this.f22400j != null, "bitmapRefWidth must not be null");
            return new C6010h(this.f22399i, this.f22400j.floatValue());
        }
        Log.w(f22397k, "Unknown Cap type: " + i10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6004e)) {
            return false;
        }
        C6004e c6004e = (C6004e) obj;
        return this.f22398h == c6004e.f22398h && C2388q.m9592b(this.f22399i, c6004e.f22399i) && C2388q.m9592b(this.f22400j, c6004e.f22400j);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f22398h), this.f22399i, this.f22400j);
    }

    public String toString() {
        return "[Cap: type=" + this.f22398h + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22398h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, i11);
        C5998b c5998b = this.f22399i;
        C2603c.m10484t(parcel, 3, c5998b == null ? null : c5998b.m24066a().asBinder(), false);
        C2603c.m10483s(parcel, 4, this.f22400j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
