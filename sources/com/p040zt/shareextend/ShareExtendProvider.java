package com.p040zt.shareextend;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p326wc.C5477b;

/* loaded from: classes2.dex */
public class ShareExtendProvider extends ContentProvider {

    /* renamed from: h */
    public static final String[] f5489h = {"_display_name", "_size", "_data"};

    /* renamed from: a */
    public static Object[] m6099a(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    /* renamed from: b */
    public static String[] m6100b(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    /* renamed from: d */
    public static Uri m6101d(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(Uri.encode(str2)).build();
    }

    /* renamed from: e */
    public static int m6102e(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    /* renamed from: c */
    public final File m6103c(Uri uri) {
        return new File(Uri.decode(uri.getPath()).substring(1));
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external deletes");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return C5477b.m21704b(m6103c(uri));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m6103c(uri), m6102e(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File m6103c = m6103c(uri);
        if (strArr == null) {
            strArr = f5489h;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = m6103c.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(m6103c.length());
            } else if ("_data".equals(str3)) {
                strArr3[i11] = "_data";
                i10 = i11 + 1;
                objArr[i11] = m6103c.getAbsolutePath();
            }
            i11 = i10;
        }
        String[] m6100b = m6100b(strArr3, i11);
        Object[] m6099a = m6099a(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(m6100b, 1);
        matrixCursor.addRow(m6099a);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
