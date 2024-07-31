package p034c7;

import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzs;

/* renamed from: c7.b6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0639b6 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2785a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f2786b;

    static {
        int[] iArr = new int[zzfc.zza.zze.values().length];
        f2786b = iArr;
        try {
            iArr[zzfc.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2786b[zzfc.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2786b[zzfc.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2786b[zzfc.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzs.values().length];
        f2785a = iArr2;
        try {
            iArr2[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f2785a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f2785a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f2785a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
