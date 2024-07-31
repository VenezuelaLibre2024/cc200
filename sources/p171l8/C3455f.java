package p171l8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p023b8.C0515g;
import p066e8.C1720b0;
import p066e8.C1733i;
import p066e8.C1738k0;
import p066e8.C1757x;
import p066e8.EnumC1758y;
import p066e8.InterfaceC1756w;
import p127i8.C2664b;
import p141j8.C3262f;

/* renamed from: l8.f */
/* loaded from: classes.dex */
public class C3455f implements InterfaceC3458i {

    /* renamed from: a */
    public final Context f12139a;

    /* renamed from: b */
    public final C3459j f12140b;

    /* renamed from: c */
    public final C3456g f12141c;

    /* renamed from: d */
    public final InterfaceC1756w f12142d;

    /* renamed from: e */
    public final C3450a f12143e;

    /* renamed from: f */
    public final InterfaceC3460k f12144f;

    /* renamed from: g */
    public final C1757x f12145g;

    /* renamed from: h */
    public final AtomicReference<C3453d> f12146h;

    /* renamed from: i */
    public final AtomicReference<TaskCompletionSource<C3453d>> f12147i;

    /* renamed from: l8.f$a */
    /* loaded from: classes.dex */
    public class a implements SuccessContinuation<Void, Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Void r52) {
            JSONObject mo12839a = C3455f.this.f12144f.mo12839a(C3455f.this.f12140b, true);
            if (mo12839a != null) {
                C3453d m12868b = C3455f.this.f12141c.m12868b(mo12839a);
                C3455f.this.f12143e.m12836c(m12868b.f12124c, mo12839a);
                C3455f.this.m12864q(mo12839a, "Loaded settings: ");
                C3455f c3455f = C3455f.this;
                c3455f.m12865r(c3455f.f12140b.f12155f);
                C3455f.this.f12146h.set(m12868b);
                ((TaskCompletionSource) C3455f.this.f12147i.get()).trySetResult(m12868b);
            }
            return Tasks.forResult(null);
        }
    }

    public C3455f(Context context, C3459j c3459j, InterfaceC1756w interfaceC1756w, C3456g c3456g, C3450a c3450a, InterfaceC3460k interfaceC3460k, C1757x c1757x) {
        AtomicReference<C3453d> atomicReference = new AtomicReference<>();
        this.f12146h = atomicReference;
        this.f12147i = new AtomicReference<>(new TaskCompletionSource());
        this.f12139a = context;
        this.f12140b = c3459j;
        this.f12142d = interfaceC1756w;
        this.f12141c = c3456g;
        this.f12143e = c3450a;
        this.f12144f = interfaceC3460k;
        this.f12145g = c1757x;
        atomicReference.set(C3451b.m12837b(interfaceC1756w));
    }

    /* renamed from: l */
    public static C3455f m12856l(Context context, String str, C1720b0 c1720b0, C2664b c2664b, String str2, String str3, C3262f c3262f, C1757x c1757x) {
        String m6776g = c1720b0.m6776g();
        C1738k0 c1738k0 = new C1738k0();
        return new C3455f(context, new C3459j(str, c1720b0.m6777h(), c1720b0.m6778i(), c1720b0.m6779j(), c1720b0, C1733i.m6820h(C1733i.m6825m(context), str, str3, str2), str3, str2, EnumC1758y.m7045b(m6776g).m7046c()), c1738k0, new C3456g(c1738k0), new C3450a(c3262f), new C3452c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c2664b), c1757x);
    }

    @Override // p171l8.InterfaceC3458i
    /* renamed from: a */
    public Task<C3453d> mo12857a() {
        return this.f12147i.get().getTask();
    }

    @Override // p171l8.InterfaceC3458i
    /* renamed from: b */
    public C3453d mo12858b() {
        return this.f12146h.get();
    }

    /* renamed from: k */
    public boolean m12859k() {
        return !m12861n().equals(this.f12140b.f12155f);
    }

    /* renamed from: m */
    public final C3453d m12860m(EnumC3454e enumC3454e) {
        C3453d c3453d = null;
        try {
            if (!EnumC3454e.SKIP_CACHE_LOOKUP.equals(enumC3454e)) {
                JSONObject m12835b = this.f12143e.m12835b();
                if (m12835b != null) {
                    C3453d m12868b = this.f12141c.m12868b(m12835b);
                    if (m12868b != null) {
                        m12864q(m12835b, "Loaded cached settings: ");
                        long mo6865a = this.f12142d.mo6865a();
                        if (!EnumC3454e.IGNORE_CACHE_EXPIRATION.equals(enumC3454e) && m12868b.m12847a(mo6865a)) {
                            C0515g.m2482f().m2490i("Cached settings have expired.");
                        }
                        try {
                            C0515g.m2482f().m2490i("Returning cached settings.");
                            c3453d = m12868b;
                        } catch (Exception e10) {
                            e = e10;
                            c3453d = m12868b;
                            C0515g.m2482f().m2487e("Failed to get cached settings", e);
                            return c3453d;
                        }
                    } else {
                        C0515g.m2482f().m2487e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C0515g.m2482f().m2484b("No cached settings data found.");
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return c3453d;
    }

    /* renamed from: n */
    public final String m12861n() {
        return C1733i.m6829q(this.f12139a).getString("existing_instance_identifier", "");
    }

    /* renamed from: o */
    public Task<Void> m12862o(Executor executor) {
        return m12863p(EnumC3454e.USE_CACHE, executor);
    }

    /* renamed from: p */
    public Task<Void> m12863p(EnumC3454e enumC3454e, Executor executor) {
        C3453d m12860m;
        if (!m12859k() && (m12860m = m12860m(enumC3454e)) != null) {
            this.f12146h.set(m12860m);
            this.f12147i.get().trySetResult(m12860m);
            return Tasks.forResult(null);
        }
        C3453d m12860m2 = m12860m(EnumC3454e.IGNORE_CACHE_EXPIRATION);
        if (m12860m2 != null) {
            this.f12146h.set(m12860m2);
            this.f12147i.get().trySetResult(m12860m2);
        }
        return this.f12145g.m7044k(executor).onSuccessTask(executor, new a());
    }

    /* renamed from: q */
    public final void m12864q(JSONObject jSONObject, String str) {
        C0515g.m2482f().m2484b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean m12865r(String str) {
        SharedPreferences.Editor edit = C1733i.m6829q(this.f12139a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
