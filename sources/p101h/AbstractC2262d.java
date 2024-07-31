package p101h;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p162l.AbstractC3391b;
import p187n.C3627d1;
import p285u.C4772b;

/* renamed from: h.d */
/* loaded from: classes.dex */
public abstract class AbstractC2262d {

    /* renamed from: h */
    public static int f8915h = -100;

    /* renamed from: i */
    public static final C4772b<WeakReference<AbstractC2262d>> f8916i = new C4772b<>();

    /* renamed from: j */
    public static final Object f8917j = new Object();

    /* renamed from: B */
    public static void m9030B(boolean z10) {
        C3627d1.m13498c(z10);
    }

    /* renamed from: c */
    public static void m9031c(AbstractC2262d abstractC2262d) {
        synchronized (f8917j) {
            m9036z(abstractC2262d);
            f8916i.add(new WeakReference<>(abstractC2262d));
        }
    }

    /* renamed from: g */
    public static AbstractC2262d m9032g(Activity activity, InterfaceC2261c interfaceC2261c) {
        return new LayoutInflaterFactory2C2263e(activity, interfaceC2261c);
    }

    /* renamed from: h */
    public static AbstractC2262d m9033h(Dialog dialog, InterfaceC2261c interfaceC2261c) {
        return new LayoutInflaterFactory2C2263e(dialog, interfaceC2261c);
    }

    /* renamed from: j */
    public static int m9034j() {
        return f8915h;
    }

    /* renamed from: y */
    public static void m9035y(AbstractC2262d abstractC2262d) {
        synchronized (f8917j) {
            m9036z(abstractC2262d);
        }
    }

    /* renamed from: z */
    public static void m9036z(AbstractC2262d abstractC2262d) {
        synchronized (f8917j) {
            Iterator<WeakReference<AbstractC2262d>> it = f8916i.iterator();
            while (it.hasNext()) {
                AbstractC2262d abstractC2262d2 = it.next().get();
                if (abstractC2262d2 == abstractC2262d || abstractC2262d2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract boolean mo9037A(int i10);

    /* renamed from: C */
    public abstract void mo9038C(int i10);

    /* renamed from: D */
    public abstract void mo9039D(View view);

    /* renamed from: E */
    public abstract void mo9040E(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: F */
    public abstract void mo9041F(Toolbar toolbar);

    /* renamed from: G */
    public void mo9042G(int i10) {
    }

    /* renamed from: H */
    public abstract void mo9043H(CharSequence charSequence);

    /* renamed from: I */
    public abstract AbstractC3391b mo9044I(AbstractC3391b.a aVar);

    /* renamed from: d */
    public abstract void mo9045d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void m9046e(Context context) {
    }

    /* renamed from: f */
    public Context mo9047f(Context context) {
        m9046e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo9048i(int i10);

    /* renamed from: k */
    public abstract InterfaceC2260b mo9049k();

    /* renamed from: l */
    public int mo9050l() {
        return -100;
    }

    /* renamed from: m */
    public abstract MenuInflater mo9051m();

    /* renamed from: n */
    public abstract AbstractC2259a mo9052n();

    /* renamed from: o */
    public abstract void mo9053o();

    /* renamed from: p */
    public abstract void mo9054p();

    /* renamed from: q */
    public abstract void mo9055q(Configuration configuration);

    /* renamed from: r */
    public abstract void mo9056r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo9057s();

    /* renamed from: t */
    public abstract void mo9058t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo9059u();

    /* renamed from: v */
    public abstract void mo9060v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo9061w();

    /* renamed from: x */
    public abstract void mo9062x();
}
