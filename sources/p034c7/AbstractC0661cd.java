package p034c7;

import com.google.android.gms.internal.measurement.zzew;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p108h6.C2394s;

/* renamed from: c7.cd */
/* loaded from: classes.dex */
public abstract class AbstractC0661cd {

    /* renamed from: a */
    public String f2846a;

    /* renamed from: b */
    public int f2847b;

    /* renamed from: c */
    public Boolean f2848c;

    /* renamed from: d */
    public Boolean f2849d;

    /* renamed from: e */
    public Long f2850e;

    /* renamed from: f */
    public Long f2851f;

    public AbstractC0661cd(String str, int i10) {
        this.f2846a = str;
        this.f2847b = i10;
    }

    /* renamed from: b */
    public static Boolean m3128b(double d10, zzew.zzd zzdVar) {
        try {
            return m3134h(new BigDecimal(d10), zzdVar, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Boolean m3129c(long j10, zzew.zzd zzdVar) {
        try {
            return m3134h(new BigDecimal(j10), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Boolean m3130d(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* renamed from: e */
    public static Boolean m3131e(String str, zzew.zzd zzdVar) {
        if (!C0745ic.m3449d0(str)) {
            return null;
        }
        try {
            return m3134h(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Boolean m3132f(String str, zzew.zzf.zza zzaVar, boolean z10, String str2, List<String> list, String str3, C0919v4 c0919v4) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (zzaVar == zzew.zzf.zza.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && zzaVar != zzew.zzf.zza.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C0941wc.f3720a[zzaVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z10 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c0919v4 != null) {
                        c0919v4.m3919G().m3996b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: g */
    public static Boolean m3133g(String str, zzew.zzf zzfVar, C0919v4 c0919v4) {
        List<String> list;
        C2394s.m9619l(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzew.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzew.zzf.zza zzb = zzfVar.zzb();
        zzew.zzf.zza zzaVar = zzew.zzf.zza.IN_LIST;
        if (zzb == zzaVar) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzew.zzf.zza zzb2 = zzfVar.zzb();
        boolean zzg = zzfVar.zzg();
        String zze = (zzg || zzb2 == zzew.zzf.zza.REGEXP || zzb2 == zzaVar) ? zzfVar.zze() : zzfVar.zze().toUpperCase(Locale.ENGLISH);
        if (zzfVar.zza() == 0) {
            list = null;
        } else {
            List<String> zzf = zzfVar.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator<String> it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
            list = zzf;
        }
        return m3132f(str, zzb2, zzg, zze, list, zzb2 == zzew.zzf.zza.REGEXP ? zze : null, c0919v4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean m3134h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzew.zzd r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.AbstractC0661cd.m3134h(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzew$zzd, double):java.lang.Boolean");
    }

    /* renamed from: a */
    public abstract int mo3085a();

    /* renamed from: i */
    public abstract boolean mo3086i();

    /* renamed from: j */
    public abstract boolean mo3087j();
}
