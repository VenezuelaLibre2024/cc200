package p260s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import p260s.C4379a;
import p329x.C5489g;
import p345y.C5782a;

/* renamed from: s.d */
/* loaded from: classes.dex */
public final class C4382d {

    /* renamed from: a */
    public final Intent f16085a;

    /* renamed from: b */
    public final Bundle f16086b;

    /* renamed from: s.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static String m16947a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: s.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        public ArrayList<Bundle> f16089c;

        /* renamed from: d */
        public Bundle f16090d;

        /* renamed from: e */
        public ArrayList<Bundle> f16091e;

        /* renamed from: f */
        public SparseArray<Bundle> f16092f;

        /* renamed from: g */
        public Bundle f16093g;

        /* renamed from: a */
        public final Intent f16087a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C4379a.a f16088b = new C4379a.a();

        /* renamed from: h */
        public int f16094h = 0;

        /* renamed from: i */
        public boolean f16095i = true;

        public b() {
        }

        public b(C4384f c4384f) {
            if (c4384f != null) {
                m16954g(c4384f);
            }
        }

        /* renamed from: a */
        public b m16948a(String str, PendingIntent pendingIntent) {
            if (this.f16089c == null) {
                this.f16089c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f16089c.add(bundle);
            return this;
        }

        /* renamed from: b */
        public C4382d m16949b() {
            if (!this.f16087a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m16955h(null, null);
            }
            ArrayList<Bundle> arrayList = this.f16089c;
            if (arrayList != null) {
                this.f16087a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f16091e;
            if (arrayList2 != null) {
                this.f16087a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f16087a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f16095i);
            this.f16087a.putExtras(this.f16088b.m16937a().m16936a());
            Bundle bundle = this.f16093g;
            if (bundle != null) {
                this.f16087a.putExtras(bundle);
            }
            if (this.f16092f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f16092f);
                this.f16087a.putExtras(bundle2);
            }
            this.f16087a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f16094h);
            if (Build.VERSION.SDK_INT >= 24) {
                m16951d();
            }
            return new C4382d(this.f16087a, this.f16090d);
        }

        /* renamed from: c */
        public b m16950c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f16087a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f16087a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        /* renamed from: d */
        public final void m16951d() {
            String m16947a = a.m16947a();
            if (TextUtils.isEmpty(m16947a)) {
                return;
            }
            Bundle bundleExtra = this.f16087a.hasExtra("com.android.browser.headers") ? this.f16087a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", m16947a);
            this.f16087a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* renamed from: e */
        public b m16952e(C4379a c4379a) {
            this.f16093g = c4379a.m16936a();
            return this;
        }

        /* renamed from: f */
        public b m16953f(boolean z10) {
            this.f16095i = z10;
            return this;
        }

        /* renamed from: g */
        public b m16954g(C4384f c4384f) {
            this.f16087a.setPackage(c4384f.m16962d().getPackageName());
            m16955h(c4384f.m16961c(), c4384f.m16963e());
            return this;
        }

        /* renamed from: h */
        public final void m16955h(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C5489g.m21796b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f16087a.putExtras(bundle);
        }

        /* renamed from: i */
        public b m16956i(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f16094h = i10;
            if (i10 == 1) {
                this.f16087a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f16087a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f16087a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        /* renamed from: j */
        public b m16957j(boolean z10) {
            this.f16087a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        /* renamed from: k */
        public b m16958k(boolean z10) {
            this.f16087a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }
    }

    public C4382d(Intent intent, Bundle bundle) {
        this.f16085a = intent;
        this.f16086b = bundle;
    }

    /* renamed from: a */
    public void m16946a(Context context, Uri uri) {
        this.f16085a.setData(uri);
        C5782a.startActivity(context, this.f16085a, this.f16086b);
    }
}
