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

/* renamed from: u6.g */
/* loaded from: classes.dex */
public class C4925g extends AbstractC4936j {
    public static final Parcelable.Creator<C4925g> CREATOR = new C4965s1();

    /* renamed from: h */
    public final byte[] f18564h;

    /* renamed from: i */
    public final byte[] f18565i;

    /* renamed from: j */
    public final byte[] f18566j;

    /* renamed from: k */
    public final byte[] f18567k;

    /* renamed from: l */
    public final byte[] f18568l;

    public C4925g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f18564h = (byte[]) C2394s.m9619l(bArr);
        this.f18565i = (byte[]) C2394s.m9619l(bArr2);
        this.f18566j = (byte[]) C2394s.m9619l(bArr3);
        this.f18567k = (byte[]) C2394s.m9619l(bArr4);
        this.f18568l = bArr5;
    }

    /* renamed from: I */
    public byte[] m19483I() {
        return this.f18566j;
    }

    /* renamed from: J */
    public byte[] m19484J() {
        return this.f18565i;
    }

    @Deprecated
    /* renamed from: K */
    public byte[] m19485K() {
        return this.f18564h;
    }

    /* renamed from: L */
    public byte[] m19486L() {
        return this.f18567k;
    }

    /* renamed from: M */
    public byte[] m19487M() {
        return this.f18568l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4925g)) {
            return false;
        }
        C4925g c4925g = (C4925g) obj;
        return Arrays.equals(this.f18564h, c4925g.f18564h) && Arrays.equals(this.f18565i, c4925g.f18565i) && Arrays.equals(this.f18566j, c4925g.f18566j) && Arrays.equals(this.f18567k, c4925g.f18567k) && Arrays.equals(this.f18568l, c4925g.f18568l);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(Arrays.hashCode(this.f18564h)), Integer.valueOf(Arrays.hashCode(this.f18565i)), Integer.valueOf(Arrays.hashCode(this.f18566j)), Integer.valueOf(Arrays.hashCode(this.f18567k)), Integer.valueOf(Arrays.hashCode(this.f18568l)));
    }

    public String toString() {
        zzaj zza = zzak.zza(this);
        zzbf zzd = zzbf.zzd();
        byte[] bArr = this.f18564h;
        zza.zzb("keyHandle", zzd.zze(bArr, 0, bArr.length));
        zzbf zzd2 = zzbf.zzd();
        byte[] bArr2 = this.f18565i;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzd3 = zzbf.zzd();
        byte[] bArr3 = this.f18566j;
        zza.zzb("authenticatorData", zzd3.zze(bArr3, 0, bArr3.length));
        zzbf zzd4 = zzbf.zzd();
        byte[] bArr4 = this.f18567k;
        zza.zzb("signature", zzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f18568l;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzbf.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10476l(parcel, 2, m19485K(), false);
        C2603c.m10476l(parcel, 3, m19484J(), false);
        C2603c.m10476l(parcel, 4, m19483I(), false);
        C2603c.m10476l(parcel, 5, m19486L(), false);
        C2603c.m10476l(parcel, 6, m19487M(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
