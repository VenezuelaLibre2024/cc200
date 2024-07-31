package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p307v6.EnumC5128c;

@Deprecated
/* renamed from: v6.d */
/* loaded from: classes.dex */
public class C5129d extends AbstractC2601a {
    public static final Parcelable.Creator<C5129d> CREATOR = new C5135j();

    /* renamed from: h */
    public final int f19387h;

    /* renamed from: i */
    public final EnumC5128c f19388i;

    /* renamed from: j */
    public final byte[] f19389j;

    /* renamed from: k */
    public final String f19390k;

    public C5129d(int i10, String str, byte[] bArr, String str2) {
        this.f19387h = i10;
        try {
            this.f19388i = EnumC5128c.m20810b(str);
            this.f19389j = bArr;
            this.f19390k = str2;
        } catch (EnumC5128c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: I */
    public String m20811I() {
        return this.f19390k;
    }

    /* renamed from: J */
    public byte[] m20812J() {
        return this.f19389j;
    }

    /* renamed from: K */
    public int m20813K() {
        return this.f19387h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5129d)) {
            return false;
        }
        C5129d c5129d = (C5129d) obj;
        if (!Arrays.equals(this.f19389j, c5129d.f19389j) || this.f19388i != c5129d.f19388i) {
            return false;
        }
        String str = this.f19390k;
        String str2 = c5129d.f19390k;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f19389j) + 31) * 31) + this.f19388i.hashCode();
        String str = this.f19390k;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m20813K());
        C2603c.m10456F(parcel, 2, this.f19388i.toString(), false);
        C2603c.m10476l(parcel, 3, m20812J(), false);
        C2603c.m10456F(parcel, 4, m20811I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
