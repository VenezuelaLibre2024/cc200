package p034c7;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import java.util.Collection;

/* renamed from: c7.n4 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0807n4 extends zzbx implements InterfaceC0821o4 {
    public AbstractBinderC0807n4() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Collection mo3654E1;
        switch (i10) {
            case 1:
                C0705g0 c0705g0 = (C0705g0) zzbw.zza(parcel, C0705g0.CREATOR);
                C0871rc c0871rc = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3662i1(c0705g0, c0871rc);
                parcel2.writeNoException();
                return true;
            case 2:
                C0787lc c0787lc = (C0787lc) zzbw.zza(parcel, C0787lc.CREATOR);
                C0871rc c0871rc2 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3671x1(c0787lc, c0871rc2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                C0871rc c0871rc3 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3656Y(c0871rc3);
                parcel2.writeNoException();
                return true;
            case 5:
                C0705g0 c0705g02 = (C0705g0) zzbw.zza(parcel, C0705g0.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                mo3658f0(c0705g02, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C0871rc c0871rc4 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3655M0(c0871rc4);
                parcel2.writeNoException();
                return true;
            case 7:
                C0871rc c0871rc5 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                mo3654E1 = mo3654E1(c0871rc5, zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
            case 9:
                C0705g0 c0705g03 = (C0705g0) zzbw.zza(parcel, C0705g0.CREATOR);
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] mo3664k = mo3664k(c0705g03, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo3664k);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                mo3661i0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C0871rc c0871rc6 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                String mo3672y = mo3672y(c0871rc6);
                parcel2.writeNoException();
                parcel2.writeString(mo3672y);
                return true;
            case 12:
                C0690f c0690f = (C0690f) zzbw.zza(parcel, C0690f.CREATOR);
                C0871rc c0871rc7 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3653C0(c0690f, c0871rc7);
                parcel2.writeNoException();
                return true;
            case 13:
                C0690f c0690f2 = (C0690f) zzbw.zza(parcel, C0690f.CREATOR);
                zzbw.zzb(parcel);
                mo3659g0(c0690f2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                C0871rc c0871rc8 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3654E1 = mo3668q(readString7, readString8, zzc2, c0871rc8);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                mo3654E1 = mo3670v(readString9, readString10, readString11, zzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                C0871rc c0871rc9 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3654E1 = mo3657e0(readString12, readString13, c0871rc9);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbw.zzb(parcel);
                mo3654E1 = mo3666m0(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
            case 18:
                C0871rc c0871rc10 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3667p0(c0871rc10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                C0871rc c0871rc11 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3665l1(bundle, c0871rc11);
                parcel2.writeNoException();
                return true;
            case 20:
                C0871rc c0871rc12 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                mo3669q0(c0871rc12);
                parcel2.writeNoException();
                return true;
            case 21:
                C0871rc c0871rc13 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                zzbw.zzb(parcel);
                C0760k mo3660i = mo3660i(c0871rc13);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, mo3660i);
                return true;
            case 24:
                C0871rc c0871rc14 = (C0871rc) zzbw.zza(parcel, C0871rc.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                mo3654E1 = mo3663j(c0871rc14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo3654E1);
                return true;
        }
    }
}
