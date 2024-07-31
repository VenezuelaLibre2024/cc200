package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C0261e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p102h0.C2277e;
import p133j0.C3205d;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0259c {

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final b f1208a;

        public a(b bVar) {
            this.f1208a = bVar == null ? m1228e() : bVar;
        }

        /* renamed from: e */
        public static b m1228e() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 28 ? new d() : i10 >= 19 ? new c() : new b();
        }

        /* renamed from: a */
        public final C0261e.c m1229a(Context context, C2277e c2277e) {
            if (c2277e == null) {
                return null;
            }
            return new C0266j(context, c2277e);
        }

        /* renamed from: b */
        public final List<List<byte[]>> m1230b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: c */
        public C0261e.c m1231c(Context context) {
            return m1229a(context, m1235h(context));
        }

        /* renamed from: d */
        public final C2277e m1232d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C2277e(str, str2, "emojicompat-emoji-font", m1230b(this.f1208a.mo1237b(packageManager, str2)));
        }

        /* renamed from: f */
        public final boolean m1233f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        public final ProviderInfo m1234g(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f1208a.mo1238c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo mo1236a = this.f1208a.mo1236a(it.next());
                if (m1233f(mo1236a)) {
                    return mo1236a;
                }
            }
            return null;
        }

        /* renamed from: h */
        public C2277e m1235h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C3205d.m11415k(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m1234g = m1234g(packageManager);
            if (m1234g == null) {
                return null;
            }
            try {
                return m1232d(m1234g, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public ProviderInfo mo1236a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        /* renamed from: b */
        public Signature[] mo1237b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo1238c(PackageManager packageManager, Intent intent, int i10) {
            return Collections.emptyList();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.C0259c.b
        /* renamed from: a */
        public ProviderInfo mo1236a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C0259c.b
        /* renamed from: c */
        public List<ResolveInfo> mo1238c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // androidx.emoji2.text.C0259c.b
        /* renamed from: b */
        public Signature[] mo1237b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C0266j m1227a(Context context) {
        return (C0266j) new a(null).m1231c(context);
    }
}
