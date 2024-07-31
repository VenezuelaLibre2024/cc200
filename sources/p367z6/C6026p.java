package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;

/* renamed from: z6.p */
/* loaded from: classes.dex */
public class C6026p extends AbstractC2601a {
    public static final Parcelable.Creator<C6026p> CREATOR = new C6041w0();

    /* renamed from: h */
    public final int f22448h;

    /* renamed from: i */
    public final int f22449i;

    /* renamed from: j */
    public final a f22450j;

    /* renamed from: z6.p$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2601a {
        public static final Parcelable.Creator<a> CREATOR = new C6027p0();

        /* renamed from: h */
        public String f22451h;

        /* renamed from: i */
        public C5998b f22452i;

        /* renamed from: j */
        public int f22453j;

        /* renamed from: k */
        public int f22454k;

        public a(String str, IBinder iBinder, int i10, int i11) {
            this.f22453j = -5041134;
            this.f22454k = -16777216;
            this.f22451h = str;
            this.f22452i = iBinder == null ? null : new C5998b(InterfaceC4307b.a.m16570c(iBinder));
            this.f22453j = i10;
            this.f22454k = i11;
        }

        /* renamed from: I */
        public int m24172I() {
            return this.f22453j;
        }

        /* renamed from: J */
        public String m24173J() {
            return this.f22451h;
        }

        /* renamed from: K */
        public int m24174K() {
            return this.f22454k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22453j != aVar.f22453j || !C6039v0.m24240a(this.f22451h, aVar.f22451h) || this.f22454k != aVar.f22454k) {
                return false;
            }
            C5998b c5998b = this.f22452i;
            if ((c5998b == null && aVar.f22452i != null) || (c5998b != null && aVar.f22452i == null)) {
                return false;
            }
            C5998b c5998b2 = aVar.f22452i;
            if (c5998b == null || c5998b2 == null) {
                return true;
            }
            return C6039v0.m24240a(BinderC4309d.m16571e(c5998b.m24066a()), BinderC4309d.m16571e(c5998b2.m24066a()));
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f22451h, this.f22452i, Integer.valueOf(this.f22453j)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int m10465a = C2603c.m10465a(parcel);
            C2603c.m10456F(parcel, 2, m24173J(), false);
            C5998b c5998b = this.f22452i;
            C2603c.m10484t(parcel, 3, c5998b == null ? null : c5998b.m24066a().asBinder(), false);
            C2603c.m10485u(parcel, 4, m24172I());
            C2603c.m10485u(parcel, 5, m24174K());
            C2603c.m10466b(parcel, m10465a);
        }
    }

    public C6026p(int i10, int i11, a aVar) {
        this.f22448h = i10;
        this.f22449i = i11;
        this.f22450j = aVar;
    }

    /* renamed from: I */
    public int m24169I() {
        return this.f22448h;
    }

    /* renamed from: J */
    public int m24170J() {
        return this.f22449i;
    }

    /* renamed from: K */
    public a m24171K() {
        return this.f22450j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, m24169I());
        C2603c.m10485u(parcel, 3, m24170J());
        C2603c.m10454D(parcel, 4, m24171K(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
