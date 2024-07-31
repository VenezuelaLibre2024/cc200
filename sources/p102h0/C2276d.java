package p102h0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p102h0.C2279g;
import p360z.C5931e;

/* renamed from: h0.d */
/* loaded from: classes.dex */
public class C2276d {

    /* renamed from: a */
    public static final Comparator<byte[]> f9122a = new Comparator() { // from class: h0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m9244g;
            m9244g = C2276d.m9244g((byte[]) obj, (byte[]) obj2);
            return m9244g;
        }
    };

    /* renamed from: h0.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Cursor m9246a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    public static List<byte[]> m9239b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m9240c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m9241d(C2277e c2277e, Resources resources) {
        return c2277e.m9248b() != null ? c2277e.m9248b() : C5931e.m23720c(resources, c2277e.m9249c());
    }

    /* renamed from: e */
    public static C2279g.a m9242e(Context context, C2277e c2277e, CancellationSignal cancellationSignal) {
        ProviderInfo m9243f = m9243f(context.getPackageManager(), c2277e, context.getResources());
        return m9243f == null ? C2279g.a.m9267a(1, null) : C2279g.a.m9267a(0, m9245h(context, c2277e, m9243f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m9243f(PackageManager packageManager, C2277e c2277e, Resources resources) {
        String m9251e = c2277e.m9251e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m9251e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m9251e);
        }
        if (!resolveContentProvider.packageName.equals(c2277e.m9252f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m9251e + ", but package was not " + c2277e.m9252f());
        }
        List<byte[]> m9239b = m9239b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m9239b, f9122a);
        List<List<byte[]>> m9241d = m9241d(c2277e, resources);
        for (int i10 = 0; i10 < m9241d.size(); i10++) {
            ArrayList arrayList = new ArrayList(m9241d.get(i10));
            Collections.sort(arrayList, f9122a);
            if (m9240c(m9239b, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ int m9244g(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        if (bArr.length == bArr2.length) {
            for (int i12 = 0; i12 < bArr.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    i10 = bArr[i12];
                    i11 = bArr2[i12];
                }
            }
            return 0;
        }
        i10 = bArr.length;
        i11 = bArr2.length;
        return i10 - i11;
    }

    /* renamed from: h */
    public static C2279g.b[] m9245h(Context context, C2277e c2277e, String str, CancellationSignal cancellationSignal) {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(Constants.FILE).build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            int i11 = 0;
            cursor = Build.VERSION.SDK_INT > 16 ? a.m9246a(contentResolver, build, strArr, "query = ?", new String[]{c2277e.m9253g()}, null, cancellationSignal) : contentResolver.query(build, strArr, "query = ?", new String[]{c2277e.m9253g()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : i11;
                    int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i11;
                    int i14 = i12;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i15 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i10 = i14;
                        z10 = false;
                    } else {
                        i10 = i14;
                        z10 = true;
                    }
                    arrayList2.add(C2279g.b.m9270a(withAppendedId, i13, i15, z10, i10));
                    i11 = 0;
                }
                arrayList = arrayList2;
            }
            return (C2279g.b[]) arrayList.toArray(new C2279g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
