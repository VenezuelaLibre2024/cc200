package p322w8;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p048d6.C1567d;
import p142j9.InterfaceC3271i;
import p195n7.C3767g;
import p309v8.InterfaceC5150j;
import p354y8.InterfaceC5896b;
import p369z8.AbstractC6089m;
import p369z8.InterfaceC6084h;

/* renamed from: w8.k */
/* loaded from: classes.dex */
public class C5439k {

    /* renamed from: a */
    public final C3767g f20281a;

    /* renamed from: b */
    public final C5442n f20282b;

    /* renamed from: c */
    public final C1567d f20283c;

    /* renamed from: d */
    public final InterfaceC5896b<InterfaceC3271i> f20284d;

    /* renamed from: e */
    public final InterfaceC5896b<InterfaceC5150j> f20285e;

    /* renamed from: f */
    public final InterfaceC6084h f20286f;

    public C5439k(C3767g c3767g, C5442n c5442n, C1567d c1567d, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this.f20281a = c3767g;
        this.f20282b = c5442n;
        this.f20283c = c1567d;
        this.f20284d = interfaceC5896b;
        this.f20285e = interfaceC5896b2;
        this.f20286f = interfaceC6084h;
    }

    public C5439k(C3767g c3767g, C5442n c5442n, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this(c3767g, c5442n, new C1567d(c3767g.m14349m()), interfaceC5896b, interfaceC5896b2, interfaceC6084h);
    }

    /* renamed from: a */
    public static String m21588a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: g */
    public static boolean m21589g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: b */
    public Task<?> m21590b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m21591c(m21597j(str, str2, str3, bundle));
    }

    /* renamed from: c */
    public final Task<String> m21591c(Task<Bundle> task) {
        return task.continueWith(C5430b.m21586a(), new Continuation(this) { // from class: w8.j

            /* renamed from: a */
            public final C5439k f20280a;

            {
                this.f20280a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.f20280a.m21595h(task2);
            }
        });
    }

    /* renamed from: d */
    public final String m21592d() {
        try {
            return m21588a(MessageDigest.getInstance("SHA-1").digest(this.f20281a.m14350q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    public Task<String> m21593e(String str, String str2, String str3) {
        return m21591c(m21597j(str, str2, str3, new Bundle()));
    }

    /* renamed from: f */
    public final String m21594f(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(ImagePickerCache.MAP_KEY_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("Unexpected response: ");
        sb2.append(valueOf);
        Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: h */
    public final /* synthetic */ String m21595h(Task task) {
        return m21594f((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: i */
    public final Bundle m21596i(String str, String str2, String str3, Bundle bundle) {
        InterfaceC5150j.a mo20829b;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f20281a.m14351r().m14364c());
        bundle.putString("gmsv", Integer.toString(this.f20282b.m21602d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f20282b.m21600a());
        bundle.putString("app_ver_name", this.f20282b.m21601b());
        bundle.putString("firebase-app-name-hash", m21592d());
        try {
            String mo24293b = ((AbstractC6089m) Tasks.await(this.f20286f.mo24318a(false))).mo24293b();
            if (TextUtils.isEmpty(mo24293b)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo24293b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        InterfaceC5150j interfaceC5150j = this.f20285e.get();
        InterfaceC3271i interfaceC3271i = this.f20284d.get();
        if (interfaceC5150j != null && interfaceC3271i != null && (mo20829b = interfaceC5150j.mo20829b("fire-iid")) != InterfaceC5150j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo20829b.m20832b()));
            bundle.putString("Firebase-Client", interfaceC3271i.mo11817a());
        }
        return bundle;
    }

    /* renamed from: j */
    public final Task<Bundle> m21597j(String str, String str2, String str3, Bundle bundle) {
        m21596i(str, str2, str3, bundle);
        return this.f20283c.m6413b(bundle);
    }
}
