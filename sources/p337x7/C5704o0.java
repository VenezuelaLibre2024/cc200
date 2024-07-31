package p337x7;

import android.text.TextUtils;
import com.google.android.gms.internal.p377firebaseauthapi.zzafq;
import com.google.android.gms.internal.p377firebaseauthapi.zzagq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108h6.C2394s;
import p321w7.AbstractC5377j0;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.o0 */
/* loaded from: classes.dex */
public final class C5704o0 {
    /* renamed from: a */
    public static List<AbstractC5377j0> m22791a(List<zzafq> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzafq> it = list.iterator();
        while (it.hasNext()) {
            AbstractC5377j0 m22792b = m22792b(it.next());
            if (m22792b != null) {
                arrayList.add(m22792b);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static AbstractC5377j0 m22792b(zzafq zzafqVar) {
        if (zzafqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafqVar.zze())) {
            return new C5403r0(zzafqVar.zzd(), zzafqVar.zzc(), zzafqVar.zza(), C2394s.m9613f(zzafqVar.zze()));
        }
        if (zzafqVar.zzb() != null) {
            return new C5421x0(zzafqVar.zzd(), zzafqVar.zzc(), zzafqVar.zza(), (zzagq) C2394s.m9620m(zzafqVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }
}
