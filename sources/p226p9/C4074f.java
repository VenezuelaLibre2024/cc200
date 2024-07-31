package p226p9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.UnsupportedEncodingException;
import p108h6.C2394s;
import p195n7.C3767g;
import p225p8.C4063a;
import p240q9.C4218i;
import p268s7.AbstractC4547c;
import p308v7.InterfaceC5139a;
import p308v7.InterfaceC5140b;
import p337x7.InterfaceC5657b;
import p354y8.InterfaceC5896b;

/* renamed from: p9.f */
/* loaded from: classes.dex */
public class C4074f {

    /* renamed from: a */
    public final C3767g f14653a;

    /* renamed from: b */
    public final InterfaceC5896b<InterfaceC5657b> f14654b;

    /* renamed from: c */
    public final InterfaceC5896b<InterfaceC5140b> f14655c;

    /* renamed from: d */
    public final String f14656d;

    /* renamed from: e */
    public long f14657e = 600000;

    /* renamed from: f */
    public long f14658f = 60000;

    /* renamed from: g */
    public long f14659g = 600000;

    /* renamed from: h */
    public long f14660h = 120000;

    /* renamed from: i */
    public C4063a f14661i;

    /* renamed from: p9.f$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5139a {
        public a() {
        }

        @Override // p308v7.InterfaceC5139a
        /* renamed from: a */
        public void mo15713a(AbstractC4547c abstractC4547c) {
        }
    }

    public C4074f(String str, C3767g c3767g, InterfaceC5896b<InterfaceC5657b> interfaceC5896b, InterfaceC5896b<InterfaceC5140b> interfaceC5896b2) {
        this.f14656d = str;
        this.f14653a = c3767g;
        this.f14654b = interfaceC5896b;
        this.f14655c = interfaceC5896b2;
        if (interfaceC5896b2 == null || interfaceC5896b2.get() == null) {
            return;
        }
        interfaceC5896b2.get().mo18542b(new a());
    }

    /* renamed from: f */
    public static C4074f m15695f(C3767g c3767g, String str) {
        C2394s.m9609b(c3767g != null, "Null is not a valid value for the FirebaseApp.");
        C2394s.m9609b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return m15696g(c3767g, C4218i.m16241d(c3767g, str));
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e10);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    /* renamed from: g */
    public static C4074f m15696g(C3767g c3767g, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        C2394s.m9620m(c3767g, "Provided FirebaseApp must not be null.");
        C4076g c4076g = (C4076g) c3767g.m14348k(C4076g.class);
        C2394s.m9620m(c4076g, "Firebase Storage component is not present.");
        return c4076g.m15717a(host);
    }

    /* renamed from: a */
    public C3767g m15697a() {
        return this.f14653a;
    }

    /* renamed from: b */
    public InterfaceC5140b m15698b() {
        InterfaceC5896b<InterfaceC5140b> interfaceC5896b = this.f14655c;
        if (interfaceC5896b != null) {
            return interfaceC5896b.get();
        }
        return null;
    }

    /* renamed from: c */
    public InterfaceC5657b m15699c() {
        InterfaceC5896b<InterfaceC5657b> interfaceC5896b = this.f14654b;
        if (interfaceC5896b != null) {
            return interfaceC5896b.get();
        }
        return null;
    }

    /* renamed from: d */
    public final String m15700d() {
        return this.f14656d;
    }

    /* renamed from: e */
    public C4063a m15701e() {
        return this.f14661i;
    }

    /* renamed from: h */
    public long m15702h() {
        return this.f14658f;
    }

    /* renamed from: i */
    public long m15703i() {
        return this.f14659g;
    }

    /* renamed from: j */
    public long m15704j() {
        return this.f14660h;
    }

    /* renamed from: k */
    public long m15705k() {
        return this.f14657e;
    }

    /* renamed from: l */
    public C4093p m15706l() {
        if (TextUtils.isEmpty(m15700d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m15707m(new Uri.Builder().scheme("gs").authority(m15700d()).path(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE).build());
    }

    /* renamed from: m */
    public final C4093p m15707m(Uri uri) {
        C2394s.m9620m(uri, "uri must not be null");
        String m15700d = m15700d();
        C2394s.m9609b(TextUtils.isEmpty(m15700d) || uri.getAuthority().equalsIgnoreCase(m15700d), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new C4093p(uri, this);
    }

    /* renamed from: n */
    public C4093p m15708n(String str) {
        C2394s.m9609b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return m15706l().m15832c(str);
    }

    /* renamed from: o */
    public void m15709o(long j10) {
        this.f14659g = j10;
    }

    /* renamed from: p */
    public void m15710p(long j10) {
        this.f14660h = j10;
    }

    /* renamed from: q */
    public void m15711q(long j10) {
        this.f14657e = j10;
    }

    /* renamed from: r */
    public void m15712r(String str, int i10) {
        this.f14661i = new C4063a(str, i10);
    }
}
