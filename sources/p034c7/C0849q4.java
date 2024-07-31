package p034c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c7.q4 */
/* loaded from: classes.dex */
public final class C0849q4 extends zzbu implements InterfaceC0821o4 {
    public C0849q4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: C0 */
    public final void mo3653C0(C0690f c0690f, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0690f);
        zzbw.zza(m5026a_, c0871rc);
        zzb(12, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: M0 */
    public final void mo3655M0(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        zzb(6, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: Y */
    public final void mo3656Y(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        zzb(4, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: e0 */
    public final List<C0690f> mo3657e0(String str, String str2, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, c0871rc);
        Parcel zza = zza(16, m5026a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C0690f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: f0 */
    public final void mo3658f0(C0705g0 c0705g0, String str, String str2) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0705g0);
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzb(5, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: g0 */
    public final void mo3659g0(C0690f c0690f) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0690f);
        zzb(13, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i */
    public final C0760k mo3660i(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        Parcel zza = zza(21, m5026a_);
        C0760k c0760k = (C0760k) zzbw.zza(zza, C0760k.CREATOR);
        zza.recycle();
        return c0760k;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i0 */
    public final void mo3661i0(long j10, String str, String str2, String str3) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeLong(j10);
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        m5026a_.writeString(str3);
        zzb(10, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i1 */
    public final void mo3662i1(C0705g0 c0705g0, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0705g0);
        zzbw.zza(m5026a_, c0871rc);
        zzb(1, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: j */
    public final List<C0856qb> mo3663j(C0871rc c0871rc, Bundle bundle) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        zzbw.zza(m5026a_, bundle);
        Parcel zza = zza(24, m5026a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C0856qb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: k */
    public final byte[] mo3664k(C0705g0 c0705g0, String str) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0705g0);
        m5026a_.writeString(str);
        Parcel zza = zza(9, m5026a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: l1 */
    public final void mo3665l1(Bundle bundle, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        zzbw.zza(m5026a_, c0871rc);
        zzb(19, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: m0 */
    public final List<C0690f> mo3666m0(String str, String str2, String str3) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        m5026a_.writeString(str3);
        Parcel zza = zza(17, m5026a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C0690f.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: p0 */
    public final void mo3667p0(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        zzb(18, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: q */
    public final List<C0787lc> mo3668q(String str, String str2, boolean z10, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, z10);
        zzbw.zza(m5026a_, c0871rc);
        Parcel zza = zza(14, m5026a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C0787lc.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: q0 */
    public final void mo3669q0(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        zzb(20, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: v */
    public final List<C0787lc> mo3670v(String str, String str2, String str3, boolean z10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        m5026a_.writeString(str3);
        zzbw.zza(m5026a_, z10);
        Parcel zza = zza(15, m5026a_);
        ArrayList createTypedArrayList = zza.createTypedArrayList(C0787lc.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: x1 */
    public final void mo3671x1(C0787lc c0787lc, C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0787lc);
        zzbw.zza(m5026a_, c0871rc);
        zzb(2, m5026a_);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: y */
    public final String mo3672y(C0871rc c0871rc) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, c0871rc);
        Parcel zza = zza(11, m5026a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}
