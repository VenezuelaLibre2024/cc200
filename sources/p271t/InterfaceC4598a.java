package p271t;

import android.os.Bundle;

/* renamed from: t.a */
/* loaded from: classes.dex */
public interface InterfaceC4598a {

    /* renamed from: t.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC4598a {
        @Override // p271t.InterfaceC4598a
        /* renamed from: a */
        public Bundle mo18120a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* renamed from: t.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC4598a {

        /* renamed from: a */
        public final boolean f17242a;

        /* renamed from: b */
        public final int f17243b;

        public b(boolean z10, int i10) {
            this.f17242a = z10;
            this.f17243b = i10;
        }

        @Override // p271t.InterfaceC4598a
        /* renamed from: a */
        public Bundle mo18120a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f17242a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f17243b);
            return bundle;
        }
    }

    /* renamed from: a */
    Bundle mo18120a();
}
