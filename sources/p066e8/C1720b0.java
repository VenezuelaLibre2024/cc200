package p066e8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p023b8.C0515g;
import p066e8.InterfaceC1722c0;
import p369z8.InterfaceC6084h;

/* renamed from: e8.b0 */
/* loaded from: classes.dex */
public class C1720b0 implements InterfaceC1722c0 {

    /* renamed from: g */
    public static final Pattern f6326g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f6327h = Pattern.quote(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);

    /* renamed from: a */
    public final C1724d0 f6328a;

    /* renamed from: b */
    public final Context f6329b;

    /* renamed from: c */
    public final String f6330c;

    /* renamed from: d */
    public final InterfaceC6084h f6331d;

    /* renamed from: e */
    public final C1757x f6332e;

    /* renamed from: f */
    public InterfaceC1722c0.a f6333f;

    public C1720b0(Context context, String str, InterfaceC6084h interfaceC6084h, C1757x c1757x) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f6329b = context;
        this.f6330c = str;
        this.f6331d = interfaceC6084h;
        this.f6332e = c1757x;
        this.f6328a = new C1724d0();
    }

    /* renamed from: c */
    public static String m6769c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m6770e(String str) {
        if (str == null) {
            return null;
        }
        return f6326g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m6771k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // p066e8.InterfaceC1722c0
    /* renamed from: a */
    public synchronized InterfaceC1722c0.a mo6772a() {
        InterfaceC1722c0.a m6786b;
        if (!m6782n()) {
            return this.f6333f;
        }
        C0515g.m2482f().m2490i("Determining Crashlytics installation ID...");
        SharedPreferences m6829q = C1733i.m6829q(this.f6329b);
        String string = m6829q.getString("firebase.installation.id", null);
        C0515g.m2482f().m2490i("Cached Firebase Installation ID: " + string);
        if (this.f6332e.m7039d()) {
            String m6774d = m6774d();
            C0515g.m2482f().m2490i("Fetched Firebase Installation ID: " + m6774d);
            if (m6774d == null) {
                m6774d = string == null ? m6769c() : string;
            }
            m6786b = m6774d.equals(string) ? InterfaceC1722c0.a.m6785a(m6780l(m6829q), m6774d) : InterfaceC1722c0.a.m6785a(m6773b(m6774d, m6829q), m6774d);
        } else {
            m6786b = m6771k(string) ? InterfaceC1722c0.a.m6786b(m6780l(m6829q)) : InterfaceC1722c0.a.m6786b(m6773b(m6769c(), m6829q));
        }
        this.f6333f = m6786b;
        C0515g.m2482f().m2490i("Install IDs: " + this.f6333f);
        return this.f6333f;
    }

    /* renamed from: b */
    public final synchronized String m6773b(String str, SharedPreferences sharedPreferences) {
        String m6770e;
        m6770e = m6770e(UUID.randomUUID().toString());
        C0515g.m2482f().m2490i("Created new Crashlytics installation ID: " + m6770e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m6770e).putString("firebase.installation.id", str).apply();
        return m6770e;
    }

    /* renamed from: d */
    public String m6774d() {
        try {
            return (String) C1750q0.m6963f(this.f6331d.getId());
        } catch (Exception e10) {
            C0515g.m2482f().m2493l("Failed to retrieve Firebase Installation ID.", e10);
            return null;
        }
    }

    /* renamed from: f */
    public String m6775f() {
        return this.f6330c;
    }

    /* renamed from: g */
    public String m6776g() {
        return this.f6328a.m6789a(this.f6329b);
    }

    /* renamed from: h */
    public String m6777h() {
        return String.format(Locale.US, "%s/%s", m6781m(Build.MANUFACTURER), m6781m(Build.MODEL));
    }

    /* renamed from: i */
    public String m6778i() {
        return m6781m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m6779j() {
        return m6781m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String m6780l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    public final String m6781m(String str) {
        return str.replaceAll(f6327h, "");
    }

    /* renamed from: n */
    public final boolean m6782n() {
        InterfaceC1722c0.a aVar = this.f6333f;
        return aVar == null || (aVar.mo6784d() == null && this.f6332e.m7039d());
    }
}
