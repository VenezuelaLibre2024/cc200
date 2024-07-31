package ad;

import android.app.Activity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p000.C0433b;
import p000.C1792f;
import td.C4753m;

/* renamed from: ad.b */
/* loaded from: classes2.dex */
public final class C0093b {

    /* renamed from: a */
    public Activity f327a;

    /* renamed from: a */
    public final boolean m395a() {
        Activity activity = this.f327a;
        C4753m.m18650c(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    /* renamed from: b */
    public final C0433b m396b() {
        if (this.f327a != null) {
            return new C0433b(Boolean.valueOf(m395a()));
        }
        throw new C0092a();
    }

    /* renamed from: c */
    public final void m397c(Activity activity) {
        this.f327a = activity;
    }

    /* renamed from: d */
    public final void m398d(C1792f c1792f) {
        C4753m.m18653f(c1792f, Constants.MESSAGE);
        Activity activity = this.f327a;
        if (activity == null) {
            throw new C0092a();
        }
        C4753m.m18650c(activity);
        boolean m395a = m395a();
        Boolean m7242a = c1792f.m7242a();
        C4753m.m18650c(m7242a);
        if (m7242a.booleanValue()) {
            if (m395a) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (m395a) {
            activity.getWindow().clearFlags(128);
        }
    }
}
