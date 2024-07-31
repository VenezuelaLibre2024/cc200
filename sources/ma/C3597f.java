package ma;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p129ia.EnumC2669a;

/* renamed from: ma.f */
/* loaded from: classes.dex */
public final class C3597f {

    /* renamed from: a */
    public static final Pattern f12661a = Pattern.compile(",");

    /* renamed from: b */
    public static final Set<EnumC2669a> f12662b;

    /* renamed from: c */
    public static final Set<EnumC2669a> f12663c;

    /* renamed from: d */
    public static final Set<EnumC2669a> f12664d;

    /* renamed from: e */
    public static final Set<EnumC2669a> f12665e;

    /* renamed from: f */
    public static final Set<EnumC2669a> f12666f;

    /* renamed from: g */
    public static final Set<EnumC2669a> f12667g;

    /* renamed from: h */
    public static final Set<EnumC2669a> f12668h;

    /* renamed from: i */
    public static final Map<String, Set<EnumC2669a>> f12669i;

    static {
        EnumSet of = EnumSet.of(EnumC2669a.QR_CODE);
        f12665e = of;
        EnumSet of2 = EnumSet.of(EnumC2669a.DATA_MATRIX);
        f12666f = of2;
        EnumSet of3 = EnumSet.of(EnumC2669a.AZTEC);
        f12667g = of3;
        EnumSet of4 = EnumSet.of(EnumC2669a.PDF_417);
        f12668h = of4;
        EnumSet of5 = EnumSet.of(EnumC2669a.UPC_A, EnumC2669a.UPC_E, EnumC2669a.EAN_13, EnumC2669a.EAN_8, EnumC2669a.RSS_14, EnumC2669a.RSS_EXPANDED);
        f12662b = of5;
        EnumSet of6 = EnumSet.of(EnumC2669a.CODE_39, EnumC2669a.CODE_93, EnumC2669a.CODE_128, EnumC2669a.ITF, EnumC2669a.CODABAR);
        f12663c = of6;
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        f12664d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f12669i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }

    /* renamed from: a */
    public static Set<EnumC2669a> m13329a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m13330b(stringExtra != null ? Arrays.asList(f12661a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    public static Set<EnumC2669a> m13330b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC2669a.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(EnumC2669a.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f12669i.get(str);
        }
        return null;
    }
}
