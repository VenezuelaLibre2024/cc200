package p034c7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p034c7.C0810n7;
import p108h6.C2394s;
import p125i6.C2602b;
import p207o6.InterfaceC3935d;

/* renamed from: c7.ic */
/* loaded from: classes.dex */
public final class C0745ic extends AbstractC0954xb {
    public C0745ic(C0968yb c0968yb) {
        super(c0968yb);
    }

    /* renamed from: D */
    public static zzfi.zzg m3434D(zzfi.zze zzeVar, String str) {
        for (zzfi.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    /* renamed from: E */
    public static <BuilderT extends zzku> BuilderT m3435E(BuilderT buildert, byte[] bArr) {
        zzis zza = zzis.zza();
        return zza != null ? (BuilderT) buildert.zza(bArr, zza) : (BuilderT) buildert.zza(bArr);
    }

    /* renamed from: I */
    public static String m3436I(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: J */
    public static List<Long> m3437J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j10 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: M */
    public static void m3438M(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: N */
    public static void m3439N(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m3438M(builder, str3, string, set);
            }
        }
    }

    /* renamed from: O */
    public static void m3440O(zzfi.zze.zza zzaVar, String str, Object obj) {
        List<zzfi.zzg> zzf = zzaVar.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfi.zzg.zza zza = zzfi.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zzaVar.zza(i10, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    /* renamed from: S */
    public static void m3441S(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: U */
    public static void m3442U(StringBuilder sb2, int i10, String str, zzew.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        m3441S(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            m3444W(sb2, i10, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            m3444W(sb2, i10, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            m3444W(sb2, i10, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            m3444W(sb2, i10, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            m3444W(sb2, i10, "max_comparison_value", zzdVar.zze());
        }
        m3441S(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: V */
    public static void m3443V(StringBuilder sb2, int i10, String str, zzfi.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        m3441S(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzlVar.zzb() != 0) {
            m3441S(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zzlVar.zzi()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzlVar.zzd() != 0) {
            m3441S(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zzlVar.zzk()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzlVar.zza() != 0) {
            m3441S(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (zzfi.zzd zzdVar : zzlVar.zzh()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzdVar.zzf() ? Integer.valueOf(zzdVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzdVar.zze() ? Long.valueOf(zzdVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzlVar.zzc() != 0) {
            m3441S(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (zzfi.zzm zzmVar : zzlVar.zzj()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzmVar.zzf() ? Integer.valueOf(zzmVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zzmVar.zze().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        m3441S(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: W */
    public static void m3444W(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m3441S(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: Z */
    public static boolean m3445Z(C0705g0 c0705g0, C0871rc c0871rc) {
        C2394s.m9619l(c0705g0);
        C2394s.m9619l(c0871rc);
        return (TextUtils.isEmpty(c0871rc.f3535i) && TextUtils.isEmpty(c0871rc.f3550x)) ? false : true;
    }

    /* renamed from: a0 */
    public static boolean m3446a0(List<Long> list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: b0 */
    public static Bundle m3447b0(List<zzfi.zzg> list) {
        String valueOf;
        Bundle bundle = new Bundle();
        for (zzfi.zzg zzgVar : list) {
            String zzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                valueOf = String.valueOf(zzgVar.zza());
            } else if (zzgVar.zzk()) {
                valueOf = String.valueOf(zzgVar.zzb());
            } else if (zzgVar.zzn()) {
                valueOf = zzgVar.zzh();
            } else if (zzgVar.zzl()) {
                valueOf = String.valueOf(zzgVar.zzd());
            }
            bundle.putString(zzg, valueOf);
        }
        return bundle;
    }

    /* renamed from: c0 */
    public static Object m3448c0(zzfi.zze zzeVar, String str) {
        zzfi.zzg m3434D = m3434D(zzeVar, str);
        if (m3434D == null) {
            return null;
        }
        if (m3434D.zzn()) {
            return m3434D.zzh();
        }
        if (m3434D.zzl()) {
            return Long.valueOf(m3434D.zzd());
        }
        if (m3434D.zzj()) {
            return Double.valueOf(m3434D.zza());
        }
        if (m3434D.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> zzi = m3434D.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfi.zzg zzgVar : zzi) {
            if (zzgVar != null) {
                Bundle bundle = new Bundle();
                for (zzfi.zzg zzgVar2 : zzgVar.zzi()) {
                    if (zzgVar2.zzn()) {
                        bundle.putString(zzgVar2.zzg(), zzgVar2.zzh());
                    } else if (zzgVar2.zzl()) {
                        bundle.putLong(zzgVar2.zzg(), zzgVar2.zzd());
                    } else if (zzgVar2.zzj()) {
                        bundle.putDouble(zzgVar2.zzg(), zzgVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: d0 */
    public static boolean m3449d0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: f0 */
    public static Bundle m3450f0(List<zzfi.zzn> list) {
        String valueOf;
        Bundle bundle = new Bundle();
        for (zzfi.zzn zznVar : list) {
            String zzg = zznVar.zzg();
            if (zznVar.zzi()) {
                valueOf = String.valueOf(zznVar.zza());
            } else if (zznVar.zzj()) {
                valueOf = String.valueOf(zznVar.zzb());
            } else if (zznVar.zzm()) {
                valueOf = zznVar.zzh();
            } else if (zznVar.zzk()) {
                valueOf = String.valueOf(zznVar.zzc());
            }
            bundle.putString(zzg, valueOf);
        }
        return bundle;
    }

    /* renamed from: t */
    public static int m3451t(zzfi.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zzaVar.zzd(); i10++) {
            if (str.equals(zzaVar.zzj(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static Bundle m3452w(List<zzfi.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfi.zzg zzgVar : list) {
            String zzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putDouble(zzg, zzgVar.zza());
            } else if (zzgVar.zzk()) {
                bundle.putFloat(zzg, zzgVar.zzb());
            } else if (zzgVar.zzn()) {
                bundle.putString(zzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putLong(zzg, zzgVar.zzd());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0155  */
    @android.annotation.TargetApi(com.pichillilorenzo.flutter_inappwebview.C1417R.styleable.AppCompatTheme_actionModeTheme)
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0856qb m3453A(java.lang.String r10, com.google.android.gms.internal.measurement.zzfi.zzj.zza r11, com.google.android.gms.internal.measurement.zzfi.zze.zza r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0745ic.m3453A(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj$zza, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):c7.qb");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0155  */
    @android.annotation.TargetApi(com.pichillilorenzo.flutter_inappwebview.C1417R.styleable.AppCompatTheme_actionModeTheme)
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0856qb m3454B(java.lang.String r10, com.google.android.gms.internal.measurement.zzfi.zzj r11, com.google.android.gms.internal.measurement.zzfi.zze.zza r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0745ic.m3454B(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):c7.qb");
    }

    /* renamed from: C */
    public final zzfi.zze m3455C(C0956y c0956y) {
        zzfi.zze.zza zza = zzfi.zze.zze().zza(c0956y.f3756e);
        Iterator<String> it = c0956y.f3757f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
            Object m3081N = c0956y.f3757f.m3081N(next);
            C2394s.m9619l(m3081N);
            m3461P(zza2, m3081N);
            zza.zza(zza2);
        }
        return (zzfi.zze) ((zzjf) zza.zzah());
    }

    /* renamed from: F */
    public final String m3456F(zzew.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            m3444W(sb2, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        m3444W(sb2, 0, "event_name", mo3094d().m3857c(zzbVar.zzf()));
        String m3436I = m3436I(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!m3436I.isEmpty()) {
            m3444W(sb2, 0, "filter_type", m3436I);
        }
        if (zzbVar.zzk()) {
            m3442U(sb2, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb2.append("  filters {\n");
            Iterator<zzew.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                m3464T(sb2, 2, it.next());
            }
        }
        m3441S(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* renamed from: G */
    public final String m3457G(zzew.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            m3444W(sb2, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        m3444W(sb2, 0, "property_name", mo3094d().m3860g(zzeVar.zze()));
        String m3436I = m3436I(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!m3436I.isEmpty()) {
            m3444W(sb2, 0, "filter_type", m3436I);
        }
        m3464T(sb2, 1, zzeVar.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: H */
    public final String m3458H(zzfi.zzi zziVar) {
        zzfi.zzb zzt;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (zzfi.zzj zzjVar : zziVar.zzd()) {
            if (zzjVar != null) {
                m3441S(sb2, 1);
                sb2.append("bundle {\n");
                if (zzjVar.zzbk()) {
                    m3444W(sb2, 1, "protocol_version", Integer.valueOf(zzjVar.zze()));
                }
                if (zzpt.zza() && mo3092a().m3291y(zzjVar.zzx(), C0733i0.f3130t0) && zzjVar.zzbn()) {
                    m3444W(sb2, 1, "session_stitching_token", zzjVar.zzam());
                }
                m3444W(sb2, 1, "platform", zzjVar.zzak());
                if (zzjVar.zzbf()) {
                    m3444W(sb2, 1, "gmp_version", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbs()) {
                    m3444W(sb2, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbd()) {
                    m3444W(sb2, 1, "dynamite_version", Long.valueOf(zzjVar.zzk()));
                }
                if (zzjVar.zzay()) {
                    m3444W(sb2, 1, "config_version", Long.valueOf(zzjVar.zzi()));
                }
                m3444W(sb2, 1, "gmp_app_id", zzjVar.zzah());
                m3444W(sb2, 1, "admob_app_id", zzjVar.zzw());
                m3444W(sb2, 1, "app_id", zzjVar.zzx());
                m3444W(sb2, 1, "app_version", zzjVar.zzaa());
                if (zzjVar.zzav()) {
                    m3444W(sb2, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                m3444W(sb2, 1, "firebase_instance_id", zzjVar.zzag());
                if (zzjVar.zzbc()) {
                    m3444W(sb2, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzj()));
                }
                m3444W(sb2, 1, "app_store", zzjVar.zzz());
                if (zzjVar.zzbr()) {
                    m3444W(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzr()));
                }
                if (zzjVar.zzbo()) {
                    m3444W(sb2, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbe()) {
                    m3444W(sb2, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzbj()) {
                    m3444W(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                if (zzjVar.zzbi()) {
                    m3444W(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzn()));
                }
                m3444W(sb2, 1, "app_instance_id", zzjVar.zzy());
                m3444W(sb2, 1, "resettable_device_id", zzjVar.zzal());
                m3444W(sb2, 1, "ds_id", zzjVar.zzaf());
                if (zzjVar.zzbh()) {
                    m3444W(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzat()));
                }
                m3444W(sb2, 1, "os_version", zzjVar.zzaj());
                m3444W(sb2, 1, "device_model", zzjVar.zzae());
                m3444W(sb2, 1, "user_default_language", zzjVar.zzan());
                if (zzjVar.zzbq()) {
                    m3444W(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzax()) {
                    m3444W(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzjVar.zzbm()) {
                    m3444W(sb2, 1, "service_upload", Boolean.valueOf(zzjVar.zzau()));
                }
                m3444W(sb2, 1, "health_monitor", zzjVar.zzai());
                if (zzjVar.zzbl()) {
                    m3444W(sb2, 1, "retry_counter", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzjVar.zzba()) {
                    m3444W(sb2, 1, "consent_signals", zzjVar.zzac());
                }
                if (zzjVar.zzbg()) {
                    m3444W(sb2, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzas()));
                }
                if (zzjVar.zzbb()) {
                    m3444W(sb2, 1, "core_platform_services", zzjVar.zzad());
                }
                if (zzjVar.zzaz()) {
                    m3444W(sb2, 1, "consent_diagnostics", zzjVar.zzab());
                }
                if (zzjVar.zzbp()) {
                    m3444W(sb2, 1, "target_os_version", Long.valueOf(zzjVar.zzq()));
                }
                if (zzph.zza() && mo3092a().m3291y(zzjVar.zzx(), C0733i0.f3052H0)) {
                    m3444W(sb2, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzaw() && (zzt = zzjVar.zzt()) != null) {
                        m3441S(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        m3444W(sb2, 2, "eligible", Boolean.valueOf(zzt.zzf()));
                        m3444W(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzt.zzh()));
                        m3444W(sb2, 2, "pre_r", Boolean.valueOf(zzt.zzi()));
                        m3444W(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzt.zzj()));
                        m3444W(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzt.zze()));
                        m3444W(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzt.zzd()));
                        m3444W(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzt.zzg()));
                        m3441S(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                List<zzfi.zzn> zzaq = zzjVar.zzaq();
                if (zzaq != null) {
                    for (zzfi.zzn zznVar : zzaq) {
                        if (zznVar != null) {
                            m3441S(sb2, 2);
                            sb2.append("user_property {\n");
                            m3444W(sb2, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            m3444W(sb2, 2, "name", mo3094d().m3860g(zznVar.zzg()));
                            m3444W(sb2, 2, "string_value", zznVar.zzh());
                            m3444W(sb2, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            m3444W(sb2, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            m3441S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> zzao = zzjVar.zzao();
                zzjVar.zzx();
                if (zzao != null) {
                    for (zzfi.zzc zzcVar : zzao) {
                        if (zzcVar != null) {
                            m3441S(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                m3444W(sb2, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                m3444W(sb2, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            m3443V(sb2, 2, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                m3443V(sb2, 2, "previous_data", zzcVar.zze());
                            }
                            m3441S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> zzap = zzjVar.zzap();
                if (zzap != null) {
                    for (zzfi.zze zzeVar : zzap) {
                        if (zzeVar != null) {
                            m3441S(sb2, 2);
                            sb2.append("event {\n");
                            m3444W(sb2, 2, "name", mo3094d().m3857c(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                m3444W(sb2, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                m3444W(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                m3444W(sb2, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                m3465X(sb2, 2, zzeVar.zzh());
                            }
                            m3441S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m3441S(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: K */
    public final List<Long> m3459K(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().m3919G().m3996b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().m3919G().m3997c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* renamed from: L */
    public final Map<String, Object> m3460L(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m3460L((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m3460L((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m3460L((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: P */
    public final void m3461P(zzfi.zzg.zza zzaVar, Object obj) {
        C2394s.m9619l(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().m3914B().m3996b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfi.zzg.zza zze = zzfi.zzg.zze();
                for (String str : bundle.keySet()) {
                    zzfi.zzg.zza zza = zzfi.zzg.zze().zza(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zza.zza(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zza.zzb((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zza.zza(((Double) obj2).doubleValue());
                    }
                    zze.zza(zza);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzfi.zzg) ((zzjf) zze.zzah()));
                }
            }
        }
        zzaVar.zza(arrayList);
    }

    /* renamed from: Q */
    public final void m3462Q(zzfi.zzj.zza zzaVar) {
        zzj().m3918F().m3995a("Checking account type status for ad personalization signals");
        if (m3468g0(zzaVar.zzt())) {
            zzj().m3913A().m3995a("Turning off ad personalization due to account type");
            zzfi.zzn zznVar = (zzfi.zzn) ((zzjf) zzfi.zzn.zze().zza("_npa").zzb(mo3093c().m4119p()).zza(1L).zzah());
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= zzaVar.zzd()) {
                    break;
                }
                if ("_npa".equals(zzaVar.zzj(i10).zzg())) {
                    zzaVar.zza(i10, zznVar);
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                zzaVar.zza(zznVar);
            }
            if (zzns.zza() && mo3092a().m3281o(C0733i0.f3070Q0)) {
                C0732i m3299a = C0732i.m3299a(zzaVar.zzv());
                m3299a.m3302d(C0810n7.a.AD_PERSONALIZATION, EnumC0774l.CHILD_ACCOUNT);
                zzaVar.zzf(m3299a.toString());
            }
        }
    }

    /* renamed from: R */
    public final void m3463R(zzfi.zzn.zza zzaVar, Object obj) {
        C2394s.m9619l(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().m3914B().m3996b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: T */
    public final void m3464T(StringBuilder sb2, int i10, zzew.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        m3441S(sb2, i10);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            m3444W(sb2, i10, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            m3444W(sb2, i10, "param_name", mo3094d().m3859f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i11 = i10 + 1;
            zzew.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                m3441S(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzd.zzj()) {
                    m3444W(sb2, i11, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    m3444W(sb2, i11, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    m3444W(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    m3441S(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        m3441S(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m3441S(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            m3442U(sb2, i10 + 1, "number_filter", zzcVar.zzc());
        }
        m3441S(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: X */
    public final void m3465X(StringBuilder sb2, int i10, List<zzfi.zzg> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (zzfi.zzg zzgVar : list) {
            if (zzgVar != null) {
                m3441S(sb2, i11);
                sb2.append("param {\n");
                m3444W(sb2, i11, "name", zzgVar.zzm() ? mo3094d().m3859f(zzgVar.zzg()) : null);
                m3444W(sb2, i11, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                m3444W(sb2, i11, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                m3444W(sb2, i11, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    m3465X(sb2, i11, zzgVar.zzi());
                }
                m3441S(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: Y */
    public final boolean m3466Y(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().mo14932a() - j10) > j11;
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    /* renamed from: e0 */
    public final byte[] m3467e0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().m3914B().m3996b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    /* renamed from: g0 */
    public final boolean m3468g0(String str) {
        if (zznr.zza() && mo3092a().m3281o(C0733i0.f3088Z0)) {
            return false;
        }
        C2394s.m9619l(str);
        C0710g5 m3604y0 = mo3122l().m3604y0(str);
        return m3604y0 != null && mo3093c().m4123t() && m3604y0.m3229r() && mo3123m().m3881Q(str);
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    /* renamed from: h0 */
    public final byte[] m3469h0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e10) {
            zzj().m3914B().m3996b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    /* renamed from: i0 */
    public final List<Integer> m3470i0() {
        Map<String, String> m3356c = C0733i0.m3356c(this.f3647b.zza());
        if (m3356c == null || m3356c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C0733i0.f3071R.m3607a(null).intValue();
        for (Map.Entry<String, String> entry : m3356c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().m3919G().m3996b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().m3919G().m3996b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // p034c7.C0912ub
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0745ic mo3120j() {
        return super.mo3120j();
    }

    @Override // p034c7.C0912ub
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0955xc mo3121k() {
        return super.mo3121k();
    }

    @Override // p034c7.C0912ub
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0788m mo3122l() {
        return super.mo3122l();
    }

    @Override // p034c7.C0912ub
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0906u5 mo3123m() {
        return super.mo3123m();
    }

    @Override // p034c7.C0912ub
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0953xa mo3124n() {
        return super.mo3124n();
    }

    @Override // p034c7.C0912ub
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0940wb mo3125o() {
        return super.mo3125o();
    }

    @Override // p034c7.AbstractC0954xb
    /* renamed from: s */
    public final boolean mo3126s() {
        return false;
    }

    /* renamed from: u */
    public final long m3471u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m3472v(str.getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: v */
    public final long m3472v(byte[] bArr) {
        C2394s.m9619l(bArr);
        mo3096f().mo3099i();
        MessageDigest m3745O0 = C0857qc.m3745O0();
        if (m3745O0 != null) {
            return C0857qc.m3760w(m3745O0.digest(bArr));
        }
        zzj().m3914B().m3995a("Failed to get MD5");
        return 0L;
    }

    /* renamed from: x */
    public final Bundle m3473x(Map<String, Object> map, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(m3473x((Map) obj2, false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    /* renamed from: y */
    public final <T extends Parcelable> T m3474y(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (C2602b.a unused) {
            zzj().m3914B().m3995a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: z */
    public final C0705g0 m3475z(zzad zzadVar) {
        Object obj;
        Bundle m3473x = m3473x(zzadVar.zzc(), true);
        String obj2 = (!m3473x.containsKey("_o") || (obj = m3473x.get("_o")) == null) ? "app" : obj.toString();
        String m3684b = C0824o7.m3684b(zzadVar.zzb());
        if (m3684b == null) {
            m3684b = zzadVar.zzb();
        }
        return new C0705g0(m3684b, new C0618a0(m3473x), obj2, zzadVar.zza());
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
