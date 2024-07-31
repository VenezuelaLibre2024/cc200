package p024b9;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p195n7.C3767g;

/* renamed from: b9.b */
/* loaded from: classes.dex */
public class C0521b {

    /* renamed from: c */
    public static final String[] f2335c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f2336a;

    /* renamed from: b */
    public final String f2337b;

    public C0521b(C3767g c3767g) {
        this.f2336a = c3767g.m14349m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f2337b = m2519b(c3767g);
    }

    /* renamed from: b */
    public static String m2519b(C3767g c3767g) {
        String m14367f = c3767g.m14351r().m14367f();
        if (m14367f != null) {
            return m14367f;
        }
        String m14364c = c3767g.m14351r().m14364c();
        if (!m14364c.startsWith("1:") && !m14364c.startsWith("2:")) {
            return m14364c;
        }
        String[] split = m14364c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m2520c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String m2521a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m2522d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m2523e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    /* renamed from: f */
    public String m2524f() {
        synchronized (this.f2336a) {
            String m2525g = m2525g();
            if (m2525g != null) {
                return m2525g;
            }
            return m2526h();
        }
    }

    /* renamed from: g */
    public final String m2525g() {
        String string;
        synchronized (this.f2336a) {
            string = this.f2336a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    public final String m2526h() {
        synchronized (this.f2336a) {
            String string = this.f2336a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m2523e = m2523e(string);
            if (m2523e == null) {
                return null;
            }
            return m2520c(m2523e);
        }
    }

    /* renamed from: i */
    public String m2527i() {
        synchronized (this.f2336a) {
            for (String str : f2335c) {
                String string = this.f2336a.getString(m2521a(this.f2337b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m2522d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
