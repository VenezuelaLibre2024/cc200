package vn.hunghd.flutterdownloader;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.work.C0416a;
import java.util.concurrent.Executors;
import p029c2.AbstractC0602t;
import td.C4747g;
import td.C4753m;

/* loaded from: classes2.dex */
public final class FlutterDownloaderInitializer extends ContentProvider {

    /* renamed from: h */
    public static final C5179a f19554h = new C5179a(null);

    /* renamed from: vn.hunghd.flutterdownloader.FlutterDownloaderInitializer$a */
    /* loaded from: classes2.dex */
    public static final class C5179a {
        public C5179a() {
        }

        public /* synthetic */ C5179a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: a */
    public final int m20987a(Context context) {
        StringBuilder sb2;
        String message;
        try {
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, "vn.hunghd.flutterdownloader.FlutterDownloaderInitializer"), 128);
            C4753m.m18652e(providerInfo, "context.packageManager.g…T_META_DATA\n            )");
            int i10 = providerInfo.metaData.getInt("vn.hunghd.flutterdownloader.MAX_CONCURRENT_TASKS", 3);
            Log.d("DownloaderInitializer", "MAX_CONCURRENT_TASKS = " + i10);
            return i10;
        } catch (PackageManager.NameNotFoundException e10) {
            sb2 = new StringBuilder();
            sb2.append("Failed to load meta-data, NameNotFound: ");
            message = e10.getMessage();
            sb2.append(message);
            Log.e("DownloaderInitializer", sb2.toString());
            return 3;
        } catch (NullPointerException e11) {
            sb2 = new StringBuilder();
            sb2.append("Failed to load meta-data, NullPointer: ");
            message = e11.getMessage();
            sb2.append(message);
            Log.e("DownloaderInitializer", sb2.toString());
            return 3;
        }
    }

    /* renamed from: b */
    public Void m20988b(Uri uri) {
        C4753m.m18653f(uri, "uri");
        return null;
    }

    /* renamed from: c */
    public Void m20989c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C4753m.m18653f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        C4753m.m18653f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) m20988b(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        C4753m.m18653f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Cannot find context from the provider.".toString());
        }
        C4753m.m18652e(context, "requireNotNull(this.cont…ext from the provider.\" }");
        AbstractC0602t.m2988f(context, new C0416a.b().m2102b(Executors.newFixedThreadPool(m20987a(context))).m2101a());
        return true;
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) m20989c(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C4753m.m18653f(uri, "uri");
        return 0;
    }
}
