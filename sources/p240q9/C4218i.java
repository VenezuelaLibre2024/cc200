package p240q9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p108h6.C2388q;
import p108h6.C2394s;
import p195n7.C3767g;
import p255r9.AbstractC4328e;
import p268s7.AbstractC4547c;
import p308v7.InterfaceC5140b;
import p321w7.C5349c0;
import p337x7.InterfaceC5657b;

/* renamed from: q9.i */
/* loaded from: classes.dex */
public class C4218i {
    /* renamed from: a */
    public static boolean m16238a(Object obj, Object obj2) {
        return C2388q.m9592b(obj, obj2);
    }

    /* renamed from: b */
    public static String m16239b(InterfaceC5140b interfaceC5140b) {
        if (interfaceC5140b == null) {
            return null;
        }
        try {
            AbstractC4547c abstractC4547c = (AbstractC4547c) Tasks.await(interfaceC5140b.mo18541a(false), 30000L, TimeUnit.MILLISECONDS);
            if (abstractC4547c.mo17979a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + abstractC4547c.mo17979a());
            }
            return abstractC4547c.mo17980b();
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e10);
            return null;
        }
    }

    /* renamed from: c */
    public static String m16240c(InterfaceC5657b interfaceC5657b) {
        String str;
        if (interfaceC5657b != null) {
            try {
                str = ((C5349c0) Tasks.await(interfaceC5657b.mo5225a(false), 30000L, TimeUnit.MILLISECONDS)).m21451g();
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.e("StorageUtil", "error getting token " + e10);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* renamed from: d */
    public static Uri m16241d(C3767g c3767g, String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = AbstractC4328e.f15645k;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + C4213d.m16231b(C4213d.m16230a(str.substring(5))));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(m16238a(scheme.toLowerCase(), "http") || m16238a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String m16232c = C4213d.m16232c(parse.getEncodedPath());
        if (indexOf == 0 && m16232c.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            int indexOf2 = m16232c.indexOf("/b/", 0);
            int i10 = indexOf2 + 3;
            int indexOf3 = m16232c.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, i10);
            int indexOf4 = m16232c.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = m16232c.substring(i10, indexOf3);
            m16232c = indexOf4 != -1 ? m16232c.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        C2394s.m9614g(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(m16232c).build();
    }

    /* renamed from: e */
    public static long m16242e(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e10) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e10);
            return 0L;
        }
    }
}
