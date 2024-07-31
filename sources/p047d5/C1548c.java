package p047d5;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4018c;

/* renamed from: d5.c */
/* loaded from: classes.dex */
public final class C1548c {
    /* renamed from: a */
    public AbstractC2651u<C1547b> m6337a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C4018c.m15267b(C1547b.f5778Q, (ArrayList) C4014a.m15199e(readBundle.getParcelableArrayList("c")));
    }
}
