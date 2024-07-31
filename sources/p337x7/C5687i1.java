package p337x7;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p321w7.AbstractC5341a0;
import p321w7.InterfaceC5424y0;

/* renamed from: x7.i1 */
/* loaded from: classes.dex */
public final class C5687i1 implements InterfaceC5424y0 {

    /* renamed from: a */
    public final String f21192a;

    /* renamed from: b */
    public final String f21193b;

    /* renamed from: c */
    public final int f21194c;

    /* renamed from: d */
    public final int f21195d;

    /* renamed from: e */
    public final long f21196e;

    /* renamed from: f */
    public String f21197f;

    /* renamed from: g */
    public FirebaseAuth f21198g;

    public C5687i1(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        C2394s.m9614g(str3, "sessionInfo cannot be empty.");
        C2394s.m9620m(firebaseAuth, "firebaseAuth cannot be null.");
        this.f21192a = C2394s.m9614g(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f21193b = C2394s.m9614g(str2, "hashAlgorithm cannot be empty.");
        this.f21194c = i10;
        this.f21195d = i11;
        this.f21196e = j10;
        this.f21197f = str3;
        this.f21198g = firebaseAuth;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: a */
    public final String mo21572a() {
        return this.f21193b;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: b */
    public final int mo21573b() {
        return this.f21194c;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: c */
    public final String mo21574c() {
        return this.f21197f;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: d */
    public final String mo21575d(String str, String str2) {
        C2394s.m9614g(str, "accountName cannot be empty.");
        C2394s.m9614g(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f21192a, str2, this.f21193b, Integer.valueOf(this.f21194c));
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: e */
    public final String mo21576e() {
        return mo21575d(C2394s.m9614g(((AbstractC5341a0) C2394s.m9620m(this.f21198g.m5238j(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).mo21407C(), "Email cannot be empty, since verified email is required to use MFA."), this.f21198g.m5236i().m14350q());
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: f */
    public final long mo21577f() {
        return this.f21196e;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: g */
    public final int mo21578g() {
        return this.f21195d;
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: h */
    public final void mo21579h(String str) {
        C2394s.m9614g(str, "qrCodeUrl cannot be empty.");
        try {
            m22768j(str);
        } catch (ActivityNotFoundException unused) {
            m22768j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // p321w7.InterfaceC5424y0
    /* renamed from: i */
    public final String mo21580i() {
        return this.f21192a;
    }

    /* renamed from: j */
    public final void m22768j(String str) {
        this.f21198g.m5236i().m14349m().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }
}
