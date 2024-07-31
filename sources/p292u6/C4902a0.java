package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.a0 */
/* loaded from: classes.dex */
public class C4902a0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4902a0> CREATOR = new C4903a1();

    /* renamed from: h */
    public final byte[] f18509h;

    /* renamed from: i */
    public final String f18510i;

    /* renamed from: j */
    public final String f18511j;

    /* renamed from: k */
    public final String f18512k;

    public C4902a0(byte[] bArr, String str, String str2, String str3) {
        this.f18509h = (byte[]) C2394s.m9619l(bArr);
        this.f18510i = (String) C2394s.m9619l(str);
        this.f18511j = str2;
        this.f18512k = (String) C2394s.m9619l(str3);
    }

    /* renamed from: I */
    public String m19467I() {
        return this.f18511j;
    }

    /* renamed from: J */
    public byte[] m19468J() {
        return this.f18509h;
    }

    /* renamed from: K */
    public String m19469K() {
        return this.f18510i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4902a0)) {
            return false;
        }
        C4902a0 c4902a0 = (C4902a0) obj;
        return Arrays.equals(this.f18509h, c4902a0.f18509h) && C2388q.m9592b(this.f18510i, c4902a0.f18510i) && C2388q.m9592b(this.f18511j, c4902a0.f18511j) && C2388q.m9592b(this.f18512k, c4902a0.f18512k);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18509h, this.f18510i, this.f18511j, this.f18512k);
    }

    /* renamed from: s */
    public String m19470s() {
        return this.f18512k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10476l(parcel, 2, m19468J(), false);
        C2603c.m10456F(parcel, 3, m19469K(), false);
        C2603c.m10456F(parcel, 4, m19467I(), false);
        C2603c.m10456F(parcel, 5, m19470s(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
