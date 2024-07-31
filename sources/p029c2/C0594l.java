package p029c2;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p029c2.AbstractC0603u;

/* renamed from: c2.l */
/* loaded from: classes.dex */
public final class C0594l extends AbstractC0603u {

    /* renamed from: c2.l$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0603u.a<a, C0594l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f2632c.f12013d = OverwritingInputMerger.class.getName();
        }

        @Override // p029c2.AbstractC0603u.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C0594l mo2979c() {
            if (this.f2630a && Build.VERSION.SDK_INT >= 23 && this.f2632c.f12019j.m2943h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C0594l(this);
        }

        @Override // p029c2.AbstractC0603u.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo2980d() {
            return this;
        }
    }

    public C0594l(a aVar) {
        super(aVar.f2631b, aVar.f2632c, aVar.f2633d);
    }

    /* renamed from: e */
    public static C0594l m2978e(Class<? extends ListenableWorker> cls) {
        return new a(cls).m2998b();
    }
}
