package p099g9;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.window.layout.ExecutorC0412c;
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

/* renamed from: g9.d0 */
/* loaded from: classes.dex */
public class C2167d0 {

    /* renamed from: a */
    public final C3767g f8666a;

    /* renamed from: b */
    public final C2177h0 f8667b;

    /* renamed from: c */
    public final C1567d f8668c;

    /* renamed from: d */
    public final InterfaceC5896b<InterfaceC3271i> f8669d;

    /* renamed from: e */
    public final InterfaceC5896b<InterfaceC5150j> f8670e;

    /* renamed from: f */
    public final InterfaceC6084h f8671f;

    public C2167d0(C3767g c3767g, C2177h0 c2177h0, C1567d c1567d, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this.f8666a = c3767g;
        this.f8667b = c2177h0;
        this.f8668c = c1567d;
        this.f8669d = interfaceC5896b;
        this.f8670e = interfaceC5896b2;
        this.f8671f = interfaceC6084h;
    }

    public C2167d0(C3767g c3767g, C2177h0 c2177h0, InterfaceC5896b<InterfaceC3271i> interfaceC5896b, InterfaceC5896b<InterfaceC5150j> interfaceC5896b2, InterfaceC6084h interfaceC6084h) {
        this(c3767g, c2177h0, new C1567d(c3767g.m14349m()), interfaceC5896b, interfaceC5896b2, interfaceC6084h);
    }

    /* renamed from: b */
    public static String m8731b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: h */
    public static boolean m8732h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: i */
    public /* synthetic */ String m8733i(Task task) {
        return m8738g((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: c */
    public Task<?> m8734c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m8735d(m8740k(C2177h0.m8763c(this.f8666a), "*", bundle));
    }

    /* renamed from: d */
    public final Task<String> m8735d(Task<Bundle> task) {
        return task.continueWith(ExecutorC0412c.f1952h, new Continuation() { // from class: g9.c0
            public /* synthetic */ C2164c0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String m8733i;
                m8733i = C2167d0.this.m8733i(task2);
                return m8733i;
            }
        });
    }

    /* renamed from: e */
    public final String m8736e() {
        try {
            return m8731b(MessageDigest.getInstance("SHA-1").digest(this.f8666a.m14350q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public Task<String> m8737f() {
        return m8735d(m8740k(C2177h0.m8763c(this.f8666a), "*", new Bundle()));
    }

    /* renamed from: g */
    public final String m8738g(Bundle bundle) {
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
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: j */
    public final void m8739j(String str, String str2, Bundle bundle) {
        InterfaceC5150j.a mo20829b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f8666a.m14351r().m14364c());
        bundle.putString("gmsv", Integer.toString(this.f8667b.m8766d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8667b.m8764a());
        bundle.putString("app_ver_name", this.f8667b.m8765b());
        bundle.putString("firebase-app-name-hash", m8736e());
        try {
            String mo24293b = ((AbstractC6089m) Tasks.await(this.f8671f.mo24318a(false))).mo24293b();
            if (TextUtils.isEmpty(mo24293b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", mo24293b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f8671f.getId()));
        bundle.putString("cliv", "fcm-23.4.1");
        InterfaceC5150j interfaceC5150j = this.f8670e.get();
        InterfaceC3271i interfaceC3271i = this.f8669d.get();
        if (interfaceC5150j == null || interfaceC3271i == null || (mo20829b = interfaceC5150j.mo20829b("fire-iid")) == InterfaceC5150j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo20829b.m20832b()));
        bundle.putString("Firebase-Client", interfaceC3271i.mo11817a());
    }

    /* renamed from: k */
    public final Task<Bundle> m8740k(String str, String str2, Bundle bundle) {
        try {
            m8739j(str, str2, bundle);
            return this.f8668c.m6413b(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    /* renamed from: l */
    public Task<?> m8741l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m8735d(m8740k(str, "/topics/" + str2, bundle));
    }

    /* renamed from: m */
    public Task<?> m8742m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m8735d(m8740k(str, "/topics/" + str2, bundle));
    }
}
