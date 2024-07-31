package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: u6.h */
/* loaded from: classes.dex */
public class C4929h extends AbstractC4936j {
    public static final Parcelable.Creator<C4929h> CREATOR = new C4968t1();

    /* renamed from: h */
    public final byte[] f18570h;

    /* renamed from: i */
    public final byte[] f18571i;

    /* renamed from: j */
    public final byte[] f18572j;

    /* renamed from: k */
    public final String[] f18573k;

    public C4929h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f18570h = (byte[]) C2394s.m9619l(bArr);
        this.f18571i = (byte[]) C2394s.m9619l(bArr2);
        this.f18572j = (byte[]) C2394s.m9619l(bArr3);
        this.f18573k = (String[]) C2394s.m9619l(strArr);
    }

    /* renamed from: I */
    public byte[] m19489I() {
        return this.f18572j;
    }

    /* renamed from: J */
    public byte[] m19490J() {
        return this.f18571i;
    }

    @Deprecated
    /* renamed from: K */
    public byte[] m19491K() {
        return this.f18570h;
    }

    /* renamed from: L */
    public String[] m19492L() {
        return this.f18573k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4929h)) {
            return false;
        }
        C4929h c4929h = (C4929h) obj;
        return Arrays.equals(this.f18570h, c4929h.f18570h) && Arrays.equals(this.f18571i, c4929h.f18571i) && Arrays.equals(this.f18572j, c4929h.f18572j);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(Arrays.hashCode(this.f18570h)), Integer.valueOf(Arrays.hashCode(this.f18571i)), Integer.valueOf(Arrays.hashCode(this.f18572j)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f18570h;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f18571i;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f18572j;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f18573k));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10476l(parcel, 2, m19491K(), false);
        C2603c.m10476l(parcel, 3, m19490J(), false);
        C2603c.m10476l(parcel, 4, m19489I(), false);
        C2603c.m10457G(parcel, 5, m19492L(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
