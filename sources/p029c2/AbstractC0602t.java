package p029c2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0416a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p044d2.C1527i;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: c2.t */
/* loaded from: classes.dex */
public abstract class AbstractC0602t {
    /* renamed from: e */
    public static AbstractC0602t m2987e(Context context) {
        return C1527i.m6192k(context);
    }

    /* renamed from: f */
    public static void m2988f(Context context, C0416a c0416a) {
        C1527i.m6190f(context, c0416a);
    }

    /* renamed from: a */
    public abstract InterfaceC0595m mo2989a(String str);

    /* renamed from: b */
    public abstract InterfaceC0595m mo2990b(UUID uuid);

    /* renamed from: c */
    public final InterfaceC0595m m2991c(AbstractC0603u abstractC0603u) {
        return mo2992d(Collections.singletonList(abstractC0603u));
    }

    /* renamed from: d */
    public abstract InterfaceC0595m mo2992d(List<? extends AbstractC0603u> list);
}
