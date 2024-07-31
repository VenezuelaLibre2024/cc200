package p372zc;

import ae.C0108n;
import ae.C0109o;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ActionBroadcastReceiver;
import dev.fluttercommunity.plus.share.C1624a;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import gd.C2234h;
import gd.InterfaceC2233g;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115hd.C2502n;
import p115hd.C2510v;
import p243qd.C4246m;
import p345y.C5783b;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: zc.b */
/* loaded from: classes2.dex */
public final class C6121b {

    /* renamed from: a */
    public final Context f22670a;

    /* renamed from: b */
    public Activity f22671b;

    /* renamed from: c */
    public final C1624a f22672c;

    /* renamed from: d */
    public final InterfaceC2233g f22673d;

    /* renamed from: e */
    public final InterfaceC2233g f22674e;

    /* renamed from: zc.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<Integer> {

        /* renamed from: h */
        public static final a f22675h = new a();

        public a() {
            super(0);
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT >= 23 ? 33554432 : 0);
        }
    }

    /* renamed from: zc.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4569a<String> {
        public b() {
            super(0);
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C6121b.this.m24421e().getPackageName() + ".flutter.share_provider";
        }
    }

    public C6121b(Context context, Activity activity, C1624a c1624a) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(c1624a, "manager");
        this.f22670a = context;
        this.f22671b = activity;
        this.f22672c = c1624a;
        this.f22673d = C2234h.m8960a(new b());
        this.f22674e = C2234h.m8960a(a.f22675h);
    }

    /* renamed from: b */
    public final void m24418b() {
        File m24425i = m24425i();
        File[] listFiles = m24425i.listFiles();
        if (m24425i.exists()) {
            boolean z10 = true;
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    z10 = false;
                }
            }
            if (z10) {
                return;
            }
            C4753m.m18652e(listFiles, "files");
            for (File file : listFiles) {
                file.delete();
            }
            m24425i.delete();
        }
    }

    /* renamed from: c */
    public final File m24419c(File file) {
        File m24425i = m24425i();
        if (!m24425i.exists()) {
            m24425i.mkdirs();
        }
        File file2 = new File(m24425i, file.getName());
        C4246m.m16294f(file, file2, true, 0, 4, null);
        return file2;
    }

    /* renamed from: d */
    public final boolean m24420d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            C4753m.m18652e(canonicalPath, "filePath");
            String canonicalPath2 = m24425i().getCanonicalPath();
            C4753m.m18652e(canonicalPath2, "shareCacheFolder.canonicalPath");
            return C0108n.m433s(canonicalPath, canonicalPath2, false, 2, null);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final Context m24421e() {
        Activity activity = this.f22671b;
        if (activity == null) {
            return this.f22670a;
        }
        C4753m.m18650c(activity);
        return activity;
    }

    /* renamed from: f */
    public final int m24422f() {
        return ((Number) this.f22674e.getValue()).intValue();
    }

    /* renamed from: g */
    public final String m24423g(String str) {
        if (str == null || !C0109o.m482v(str, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, false, 2, null)) {
            return "*";
        }
        String substring = str.substring(0, C0109o.m438E(str, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, null));
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h */
    public final String m24424h() {
        return (String) this.f22673d.getValue();
    }

    /* renamed from: i */
    public final File m24425i() {
        return new File(m24421e().getCacheDir(), "share_plus");
    }

    /* renamed from: j */
    public final ArrayList<Uri> m24426j(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (m24420d(file)) {
                throw new IOException("Shared file can not be located in '" + m24425i().getCanonicalPath() + '\'');
            }
            arrayList.add(C5783b.getUriForFile(m24421e(), m24424h(), m24419c(file)));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final String m24427k(List<String> list) {
        int i10 = 1;
        if (list != null ? list.isEmpty() : true) {
            return "*/*";
        }
        C4753m.m18650c(list);
        if (list.size() == 1) {
            return (String) C2510v.m10019r(list);
        }
        String str = (String) C2510v.m10019r(list);
        int m9990f = C2502n.m9990f(list);
        if (1 <= m9990f) {
            while (true) {
                if (!C4753m.m18648a(str, list.get(i10))) {
                    if (!C4753m.m18648a(m24423g(str), m24423g(list.get(i10)))) {
                        return "*/*";
                    }
                    str = m24423g(list.get(i10)) + "/*";
                }
                if (i10 == m9990f) {
                    break;
                }
                i10++;
            }
        }
        return str;
    }

    /* renamed from: l */
    public final void m24428l(Activity activity) {
        this.f22671b = activity;
    }

    /* renamed from: m */
    public final void m24429m(String str, String str2, boolean z10) {
        C4753m.m18653f(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        Intent createChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f22670a, 0, new Intent(this.f22670a, (Class<?>) SharePlusPendingIntent.class), 134217728 | m24422f()).getIntentSender()) : Intent.createChooser(intent, null);
        C4753m.m18652e(createChooser, "chooserIntent");
        m24431o(createChooser, z10);
    }

    /* renamed from: n */
    public final void m24430n(List<String> list, List<String> list2, String str, String str2, boolean z10) {
        C4753m.m18653f(list, "paths");
        m24418b();
        ArrayList<Uri> m24426j = m24426j(list);
        Intent intent = new Intent();
        if (m24426j.isEmpty()) {
            if (!(str == null || C0108n.m428n(str))) {
                m24429m(str, str2, z10);
                return;
            }
        }
        if (m24426j.size() == 1) {
            String str3 = !(list2 == null || list2.isEmpty()) ? (String) C2510v.m10019r(list2) : "*/*";
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) C2510v.m10019r(m24426j));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(m24427k(list2));
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", m24426j);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str2);
        }
        intent.addFlags(1);
        Intent createChooser = z10 ? Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.f22670a, 0, new Intent(this.f22670a, (Class<?>) SharePlusPendingIntent.class), 134217728 | m24422f()).getIntentSender()) : Intent.createChooser(intent, null);
        List<ResolveInfo> queryIntentActivities = m24421e().getPackageManager().queryIntentActivities(createChooser, 65536);
        C4753m.m18652e(queryIntentActivities, "getContext().packageMana…CH_DEFAULT_ONLY\n        )");
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            String str4 = ((ResolveInfo) it.next()).activityInfo.packageName;
            Iterator<T> it2 = m24426j.iterator();
            while (it2.hasNext()) {
                m24421e().grantUriPermission(str4, (Uri) it2.next(), 3);
            }
        }
        C4753m.m18652e(createChooser, "chooserIntent");
        m24431o(createChooser, z10);
    }

    /* renamed from: o */
    public final void m24431o(Intent intent, boolean z10) {
        Activity activity = this.f22671b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f22672c.m6485c();
            }
            this.f22670a.startActivity(intent);
            return;
        }
        C4753m.m18650c(activity);
        if (z10) {
            activity.startActivityForResult(intent, 22643);
        } else {
            activity.startActivity(intent);
        }
    }
}
