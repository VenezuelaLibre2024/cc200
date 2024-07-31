package p034c7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzov;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p064e6.C1675f;
import p064e6.C1683j;
import p108h6.C2394s;
import p164l1.AbstractC3404a;
import p207o6.C3936e;
import p207o6.InterfaceC3935d;
import p237q6.C4195c;

/* renamed from: c7.qc */
/* loaded from: classes.dex */
public final class C0857qc extends AbstractC0740i7 {

    /* renamed from: i */
    public static final String[] f3488i = {"firebase_", "google_", "ga_"};

    /* renamed from: j */
    public static final String[] f3489j = {"_err"};

    /* renamed from: c */
    public SecureRandom f3490c;

    /* renamed from: d */
    public final AtomicLong f3491d;

    /* renamed from: e */
    public int f3492e;

    /* renamed from: f */
    public AbstractC3404a f3493f;

    /* renamed from: g */
    public Boolean f3494g;

    /* renamed from: h */
    public Integer f3495h;

    public C0857qc(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3495h = null;
        this.f3491d = new AtomicLong(0L);
    }

    /* renamed from: B */
    public static Bundle m3734B(List<C0787lc> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C0787lc c0787lc : list) {
            String str = c0787lc.f3293m;
            if (str != null) {
                bundle.putString(c0787lc.f3289i, str);
            } else {
                Long l10 = c0787lc.f3291k;
                if (l10 != null) {
                    bundle.putLong(c0787lc.f3289i, l10.longValue());
                } else {
                    Double d10 = c0787lc.f3295o;
                    if (d10 != null) {
                        bundle.putDouble(c0787lc.f3289i, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: C0 */
    public static boolean m3735C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: E */
    public static String m3736E(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i10)) + "...";
    }

    /* renamed from: E0 */
    public static boolean m3737E0(String str) {
        C2394s.m9613f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: G */
    public static void m3738G(Bundle bundle, int i10, String str, Object obj) {
        if (m3755q0(bundle, i10)) {
            bundle.putString("_ev", m3736E(str, 40, true));
            if (obj != null) {
                C2394s.m9619l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: G0 */
    public static boolean m3739G0(String str) {
        for (String str2 : f3489j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public static int m3740J0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    /* renamed from: L */
    public static void m3741L(C0854q9 c0854q9, Bundle bundle, boolean z10) {
        if (bundle == null || c0854q9 == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && c0854q9 == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c0854q9.f3473a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c0854q9.f3474b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c0854q9.f3475c);
    }

    /* renamed from: M */
    public static void m3742M(InterfaceC0843pc interfaceC0843pc, int i10, String str, String str2, int i11) {
        m3744N(interfaceC0843pc, null, i10, str, str2, i11);
    }

    /* renamed from: M0 */
    public static boolean m3743M0(String str) {
        C2394s.m9619l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: N */
    public static void m3744N(InterfaceC0843pc interfaceC0843pc, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m3755q0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC0843pc.mo3167a(str, "_err", bundle);
    }

    /* renamed from: O0 */
    public static MessageDigest m3745O0() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: Y */
    public static boolean m3746Y(Context context) {
        ActivityInfo receiverInfo;
        C2394s.m9619l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: Z */
    public static boolean m3747Z(Context context, boolean z10) {
        C2394s.m9619l(context);
        return m3761w0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a0 */
    public static boolean m3748a0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: b0 */
    public static boolean m3749b0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* renamed from: c0 */
    public static boolean m3750c0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: h0 */
    public static boolean m3751h0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C2394s.m9619l(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: i0 */
    public static boolean m3752i0(String str, String[] strArr) {
        C2394s.m9619l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public static byte[] m3753l0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: o0 */
    public static ArrayList<Bundle> m3754o0(List<C0690f> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C0690f c0690f : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0690f.f2907h);
            bundle.putString("origin", c0690f.f2908i);
            bundle.putLong("creation_timestamp", c0690f.f2910k);
            bundle.putString("name", c0690f.f2909j.f3289i);
            C0768k7.m3520b(bundle, C2394s.m9619l(c0690f.f2909j.m3529I()));
            bundle.putBoolean("active", c0690f.f2911l);
            String str = c0690f.f2912m;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0705g0 c0705g0 = c0690f.f2913n;
            if (c0705g0 != null) {
                bundle.putString("timed_out_event_name", c0705g0.f2943h);
                C0618a0 c0618a0 = c0705g0.f2944i;
                if (c0618a0 != null) {
                    bundle.putBundle("timed_out_event_params", c0618a0.m3079L());
                }
            }
            bundle.putLong("trigger_timeout", c0690f.f2914o);
            C0705g0 c0705g02 = c0690f.f2915p;
            if (c0705g02 != null) {
                bundle.putString("triggered_event_name", c0705g02.f2943h);
                C0618a0 c0618a02 = c0705g02.f2944i;
                if (c0618a02 != null) {
                    bundle.putBundle("triggered_event_params", c0618a02.m3079L());
                }
            }
            bundle.putLong("triggered_timestamp", c0690f.f2909j.f3290j);
            bundle.putLong("time_to_live", c0690f.f2916q);
            C0705g0 c0705g03 = c0690f.f2917r;
            if (c0705g03 != null) {
                bundle.putString("expired_event_name", c0705g03.f2943h);
                C0618a0 c0618a03 = c0705g03.f2944i;
                if (c0618a03 != null) {
                    bundle.putBundle("expired_event_params", c0618a03.m3079L());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: q0 */
    public static boolean m3755q0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* renamed from: s0 */
    public static Bundle[] m3756s0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: t */
    public static long m3757t(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    /* renamed from: t0 */
    public static int m3758t0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* renamed from: v */
    public static long m3759v(C0618a0 c0618a0) {
        long j10 = 0;
        if (c0618a0 == null) {
            return 0L;
        }
        Iterator<String> it = c0618a0.iterator();
        while (it.hasNext()) {
            if (c0618a0.m3081N(it.next()) instanceof Parcelable[]) {
                j10 += ((Parcelable[]) r3).length;
            }
        }
        return j10;
    }

    /* renamed from: w */
    public static long m3760w(byte[] bArr) {
        C2394s.m9619l(bArr);
        int i10 = 0;
        C2394s.m9622o(bArr.length > 0);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* renamed from: w0 */
    public static boolean m3761w0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: y */
    public static Bundle m3762y(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: y0 */
    public static boolean m3763y0(String str) {
        String m3607a = C0733i0.f3093b0.m3607a(null);
        return m3607a.equals("*") || Arrays.asList(m3607a.split(",")).contains(str);
    }

    /* renamed from: A */
    public final Bundle m3764A(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int m3775I0;
        int i10;
        C0857qc c0857qc = this;
        boolean m3752i0 = m3752i0(str2, C0824o7.f3400d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int m3261B = mo3092a().m3261B();
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                m3775I0 = !z10 ? c0857qc.m3775I0(str3) : 0;
                if (m3775I0 == 0) {
                    m3775I0 = c0857qc.m3773H0(str3);
                }
            } else {
                m3775I0 = 0;
            }
            if (m3775I0 != 0) {
                m3738G(bundle2, m3775I0, str3, m3775I0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i10 = m3261B;
            } else {
                i10 = m3261B;
                int m3808s = m3808s(str, str2, str3, bundle.get(str3), bundle2, list, z10, m3752i0);
                if (m3808s == 17) {
                    m3738G(bundle2, m3808s, str3, Boolean.FALSE);
                } else if (m3808s != 0 && !"_ev".equals(str3)) {
                    m3738G(bundle2, m3808s, m3808s == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m3737E0(str3)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        zzj().m3915C().m3997c("Event can't contain more than " + i10 + " params", mo3094d().m3857c(str2), mo3094d().m3855a(bundle));
                        m3755q0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i11 = i12;
                }
            }
            m3261B = i10;
            c0857qc = this;
        }
        return bundle2;
    }

    /* renamed from: A0 */
    public final boolean m3765A0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo3092a().m3266I().equals(str);
    }

    /* renamed from: B0 */
    public final int m3766B0() {
        if (this.f3495h == null) {
            this.f3495h = Integer.valueOf(C1675f.m6715f().m6716a(zza()) / 1000);
        }
        return this.f3495h.intValue();
    }

    /* renamed from: C */
    public final C0705g0 m3767C(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m3805q(str2) != 0) {
            zzj().m3914B().m3996b("Invalid conditional property event name", mo3094d().m3860g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle m3764A = m3764A(str, str2, bundle2, C3936e.m14935a("_o"), true);
        if (z10) {
            m3764A = m3814z(m3764A, str);
        }
        C2394s.m9619l(m3764A);
        return new C0705g0(str2, new C0618a0(m3764A), str3, j10);
    }

    /* renamed from: D */
    public final Object m3768D(int i10, Object obj, boolean z10, boolean z11, String str) {
        Bundle m3814z;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m3736E(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (m3814z = m3814z((Bundle) parcelable, null)) != null && !m3814z.isEmpty()) {
                arrayList.add(m3814z);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: D0 */
    public final long m3769D0() {
        mo3099i();
        if (!m3763y0(this.f3198a.m3515w().m3697A())) {
            return 0L;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : m3758t0() < C0733i0.f3083X.m3607a(null).intValue() ? 16L : 0L;
        if (!m3815z0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !m3789S0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    /* renamed from: F */
    public final URL m3770F(long j10, String str, String str2, long j11, String str3) {
        try {
            C2394s.m9613f(str2);
            C2394s.m9613f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j10), Integer.valueOf(m3766B0())), str2, str, Long.valueOf(j11));
            if (str.equals(mo3092a().m3267J())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            zzj().m3914B().m3996b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* renamed from: F0 */
    public final boolean m3771F0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    /* renamed from: H */
    public final void m3772H(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().m3919G().m3996b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* renamed from: H0 */
    public final int m3773H0(String str) {
        if (!m3807r0("event param", str)) {
            return 3;
        }
        if (m3799j0("event param", null, str)) {
            return !m3796e0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* renamed from: I */
    public final void m3774I(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                mo3096f().m3776J(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: I0 */
    public final int m3775I0(String str) {
        if (!m3813x0("event param", str)) {
            return 3;
        }
        if (m3799j0("event param", null, str)) {
            return !m3796e0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* renamed from: J */
    public final void m3776J(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().m3920H().m3997c("Not putting event parameter. Invalid value type. name, type", mo3094d().m3859f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: K */
    public final void m3777K(C0975z4 c0975z4, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c0975z4.f3838d.keySet())) {
            if (m3737E0(str) && (i11 = i11 + 1) > i10) {
                zzj().m3915C().m3997c("Event can't contain more than " + i10 + " params", mo3094d().m3857c(c0975z4.f3835a), mo3094d().m3855a(c0975z4.f3838d));
                m3755q0(c0975z4.f3838d, 5);
                c0975z4.f3838d.remove(str);
            }
        }
    }

    /* renamed from: K0 */
    public final long m3778K0() {
        long andIncrement;
        long j10;
        if (this.f3491d.get() != 0) {
            synchronized (this.f3491d) {
                this.f3491d.compareAndSet(-1L, 1L);
                andIncrement = this.f3491d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f3491d) {
            long nextLong = new Random(System.nanoTime() ^ zzb().mo14932a()).nextLong();
            int i10 = this.f3492e + 1;
            this.f3492e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    /* renamed from: L0 */
    public final AbstractC3404a m3779L0() {
        if (this.f3493f == null) {
            this.f3493f = AbstractC3404a.m12701a(zza());
        }
        return this.f3493f;
    }

    /* renamed from: N0 */
    public final String m3780N0() {
        byte[] bArr = new byte[16];
        m3783P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: O */
    public final void m3781O(zzcv zzcvVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning int value to wrapper", e10);
        }
    }

    /* renamed from: P */
    public final void m3782P(zzcv zzcvVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning long value to wrapper", e10);
        }
    }

    /* renamed from: P0 */
    public final SecureRandom m3783P0() {
        mo3099i();
        if (this.f3490c == null) {
            this.f3490c = new SecureRandom();
        }
        return this.f3490c;
    }

    /* renamed from: Q */
    public final void m3784Q(zzcv zzcvVar, Bundle bundle) {
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning bundle value to wrapper", e10);
        }
    }

    /* renamed from: Q0 */
    public final boolean m3785Q0() {
        mo3099i();
        return m3769D0() == 1;
    }

    /* renamed from: R */
    public final void m3786R(zzcv zzcvVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning string value to wrapper", e10);
        }
    }

    /* renamed from: R0 */
    public final boolean m3787R0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: S */
    public final void m3788S(zzcv zzcvVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning bundle list to wrapper", e10);
        }
    }

    @TargetApi(C1417R.styleable.AppCompatTheme_actionModeTheme)
    /* renamed from: S0 */
    public final boolean m3789S0() {
        Integer num;
        if (this.f3494g == null) {
            AbstractC3404a m3779L0 = m3779L0();
            boolean z10 = false;
            if (m3779L0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = m3779L0.mo12702b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        num2 = num;
                        zzj().m3919G().m3996b("Measurement manager api exception", e);
                        this.f3494g = Boolean.FALSE;
                        num = num2;
                        zzj().m3918F().m3996b("Measurement manager api status result", num);
                        return this.f3494g.booleanValue();
                    } catch (CancellationException e11) {
                        e = e11;
                        num2 = num;
                        zzj().m3919G().m3996b("Measurement manager api exception", e);
                        this.f3494g = Boolean.FALSE;
                        num = num2;
                        zzj().m3918F().m3996b("Measurement manager api status result", num);
                        return this.f3494g.booleanValue();
                    } catch (ExecutionException e12) {
                        e = e12;
                        num2 = num;
                        zzj().m3919G().m3996b("Measurement manager api exception", e);
                        this.f3494g = Boolean.FALSE;
                        num = num2;
                        zzj().m3918F().m3996b("Measurement manager api status result", num);
                        return this.f3494g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().m3919G().m3996b("Measurement manager api exception", e);
                        this.f3494g = Boolean.FALSE;
                        num = num2;
                        zzj().m3918F().m3996b("Measurement manager api status result", num);
                        return this.f3494g.booleanValue();
                    }
                }
                this.f3494g = Boolean.valueOf(z10);
            } catch (InterruptedException e14) {
                e = e14;
            } catch (CancellationException e15) {
                e = e15;
            } catch (ExecutionException e16) {
                e = e16;
            } catch (TimeoutException e17) {
                e = e17;
            }
            zzj().m3918F().m3996b("Measurement manager api status result", num);
        }
        return this.f3494g.booleanValue();
    }

    /* renamed from: T */
    public final void m3790T(zzcv zzcvVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning boolean value to wrapper", e10);
        }
    }

    /* renamed from: U */
    public final void m3791U(zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f3198a.zzj().m3919G().m3996b("Error returning byte array to wrapper", e10);
        }
    }

    /* renamed from: V */
    public final void m3792V(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int m3775I0;
        String str4;
        int m3808s;
        C0947x4 m3915C;
        String m3857c;
        String m3855a;
        String str5;
        if (bundle == null) {
            return;
        }
        int m3285s = mo3092a().m3285s();
        int i10 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                m3775I0 = !z10 ? m3775I0(str6) : 0;
                if (m3775I0 == 0) {
                    m3775I0 = m3773H0(str6);
                }
            } else {
                m3775I0 = 0;
            }
            if (m3775I0 != 0) {
                m3738G(bundle, m3775I0, str6, m3775I0 == 3 ? str6 : null);
                bundle.remove(str6);
            } else {
                if (m3750c0(bundle.get(str6))) {
                    zzj().m3920H().m3998d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    m3808s = 22;
                    str4 = str6;
                } else {
                    str4 = str6;
                    m3808s = m3808s(str, str2, str6, bundle.get(str6), bundle, list, z10, false);
                }
                if (m3808s != 0 && !"_ev".equals(str4)) {
                    m3738G(bundle, m3808s, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m3737E0(str4) && !m3752i0(str4, C0852q7.f3470d)) {
                    int i11 = i10 + 1;
                    if (m3794X(231100000, true)) {
                        if (i11 > m3285s) {
                            if (zzov.zza() && mo3092a().m3281o(C0733i0.f3046E0)) {
                                zzj().m3915C().m3997c("Item can't contain more than " + m3285s + " item-scoped custom params", mo3094d().m3857c(str2), mo3094d().m3855a(bundle));
                                m3755q0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                m3915C = zzj().m3915C();
                                m3857c = mo3094d().m3857c(str2);
                                m3855a = mo3094d().m3855a(bundle);
                                str5 = "Item cannot contain custom parameters";
                            }
                        }
                        i10 = i11;
                    } else {
                        m3915C = zzj().m3915C();
                        m3857c = mo3094d().m3857c(str2);
                        m3855a = mo3094d().m3855a(bundle);
                        str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    }
                    m3915C.m3997c(str5, m3857c, m3855a);
                    m3755q0(bundle, 23);
                    bundle.remove(str4);
                    i10 = i11;
                }
            }
        }
    }

    /* renamed from: W */
    public final void m3793W(Parcelable[] parcelableArr, int i10, boolean z10) {
        int i11;
        C2394s.m9619l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m3737E0(str) && !m3752i0(str, C0852q7.f3470d) && (i12 = i12 + 1) > i10) {
                    C0947x4 m3915C = zzj().m3915C();
                    if (z10) {
                        m3915C.m3997c("Param can't contain more than " + i10 + " item-scoped custom parameters", mo3094d().m3859f(str), mo3094d().m3855a(bundle));
                        i11 = 28;
                    } else {
                        m3915C.m3997c("Param cannot contain item-scoped custom parameters", mo3094d().m3859f(str), mo3094d().m3855a(bundle));
                        i11 = 23;
                    }
                    m3755q0(bundle, i11);
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: X */
    public final boolean m3794X(int i10, boolean z10) {
        Boolean m4031R = this.f3198a.m3489E().m4031R();
        if (m3766B0() < i10 / 1000) {
            return (m4031R == null || m4031R.booleanValue()) ? false : true;
        }
        return true;
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

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: d0 */
    public final boolean m3795d0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(Constants.TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().m3914B().m3996b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    /* renamed from: e0 */
    public final boolean m3796e0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().m3915C().m3996b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().m3915C().m3998d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    /* renamed from: f0 */
    public final boolean m3797f0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m3743M0(str)) {
                return true;
            }
            if (this.f3198a.m3505m()) {
                zzj().m3915C().m3996b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C0919v4.m3906q(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f3198a.m3505m()) {
                zzj().m3915C().m3995a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (m3743M0(str2)) {
            return true;
        }
        zzj().m3915C().m3996b("Invalid admob_app_id. Analytics disabled.", C0919v4.m3906q(str2));
        return false;
    }

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    /* renamed from: g0 */
    public final boolean m3798g0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().m3920H().m3998d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: j */
    public final void mo3418j() {
        mo3099i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().m3919G().m3995a("Utils falling back to Random for random id");
            }
        }
        this.f3491d.set(nextLong);
    }

    /* renamed from: j0 */
    public final boolean m3799j0(String str, String[] strArr, String str2) {
        return m3800k0(str, strArr, null, str2);
    }

    /* renamed from: k0 */
    public final boolean m3800k0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().m3915C().m3996b("Name is required and can't be null. Type", str);
            return false;
        }
        C2394s.m9619l(str2);
        String[] strArr3 = f3488i;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            zzj().m3915C().m3997c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !m3752i0(str2, strArr) || (strArr2 != null && m3752i0(str2, strArr2))) {
            return true;
        }
        zzj().m3915C().m3997c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: m0 */
    public final int m3801m0(String str) {
        if (!m3807r0("user property", str)) {
            return 6;
        }
        if (m3799j0("user property", C0838p7.f3440a, str)) {
            return !m3796e0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* renamed from: n0 */
    public final Object m3802n0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m3768D(mo3092a().m3284r(null, false), obj, true, true, null);
        }
        return m3768D(m3735C0(str) ? mo3092a().m3284r(null, false) : mo3092a().m3279m(null, false), obj, false, true, null);
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: o */
    public final boolean mo3146o() {
        return true;
    }

    /* renamed from: p */
    public final int m3803p(int i10) {
        return C1675f.m6715f().mo6698h(zza(), C1683j.f6269a);
    }

    /* renamed from: p0 */
    public final boolean m3804p0(Context context, String str) {
        C0947x4 m3914B;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m16180e = C4195c.m16183a(context).m16180e(str, 64);
            if (m16180e == null || (signatureArr = m16180e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            m3914B = zzj().m3914B();
            str2 = "Package name not found";
            m3914B.m3996b(str2, e);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            m3914B = zzj().m3914B();
            str2 = "Error obtaining certificate";
            m3914B.m3996b(str2, e);
            return true;
        }
    }

    /* renamed from: q */
    public final int m3805q(String str) {
        if (!m3807r0("event", str)) {
            return 2;
        }
        if (m3800k0("event", C0824o7.f3397a, C0824o7.f3398b, str)) {
            return !m3796e0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* renamed from: r */
    public final int m3806r(String str, Object obj) {
        int m3740J0;
        String str2;
        if ("_ldl".equals(str)) {
            m3740J0 = m3740J0(str);
            str2 = "user property referrer";
        } else {
            m3740J0 = m3740J0(str);
            str2 = "user property";
        }
        return m3798g0(str2, str, m3740J0, obj) ? 0 : 7;
    }

    /* renamed from: r0 */
    public final boolean m3807r0(String str, String str2) {
        if (str2 == null) {
            zzj().m3915C().m3996b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m3915C().m3996b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().m3915C().m3997c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().m3915C().m3997c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3808s(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0857qc.m3808s(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0065 -> B:7:0x0072). Please report as a decompilation issue!!! */
    /* renamed from: u */
    public final long m3809u(Context context, String str) {
        mo3099i();
        C2394s.m9619l(context);
        C2394s.m9613f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest m3745O0 = m3745O0();
        long j10 = -1;
        if (m3745O0 == null) {
            zzj().m3914B().m3995a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e10) {
                    zzj().m3914B().m3996b("Package name not found", e10);
                }
                if (!m3804p0(context, str)) {
                    Signature[] signatureArr = C4195c.m16183a(context).m16180e(zza().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        zzj().m3919G().m3995a("Could not get signatures");
                    } else {
                        j10 = m3760w(m3745O0.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j10 = 0;
        }
        return j10;
    }

    /* renamed from: u0 */
    public final long m3810u0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo m16178c = C4195c.m16183a(zza()).m16178c(str, 0);
            if (m16178c != null) {
                i10 = m16178c.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().m3917E().m3996b("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    /* renamed from: v0 */
    public final Object m3811v0(String str, Object obj) {
        return "_ldl".equals(str) ? m3768D(m3740J0(str), obj, true, false, null) : m3768D(m3740J0(str), obj, false, false, null);
    }

    /* renamed from: x */
    public final Bundle m3812x(Uri uri, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z11 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = z10 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z11 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z10 || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z11 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z10 && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().m3919G().m3996b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* renamed from: x0 */
    public final boolean m3813x0(String str, String str2) {
        if (str2 == null) {
            zzj().m3915C().m3996b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m3915C().m3996b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().m3915C().m3997c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().m3915C().m3997c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: z */
    public final Bundle m3814z(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object m3802n0 = m3802n0(str2, bundle.get(str2));
                if (m3802n0 == null) {
                    zzj().m3920H().m3996b("Param value can't be null", mo3094d().m3859f(str2));
                } else {
                    m3776J(bundle2, str2, m3802n0);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: z0 */
    public final boolean m3815z0(String str) {
        mo3099i();
        if (C4195c.m16183a(zza()).m16176a(str) == 0) {
            return true;
        }
        zzj().m3913A().m3996b("Permission not granted", str);
        return false;
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
