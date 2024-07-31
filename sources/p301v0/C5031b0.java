package p301v0;

import java.io.IOException;

/* renamed from: v0.b0 */
/* loaded from: classes.dex */
public class C5031b0 extends IOException {

    /* renamed from: h */
    public InterfaceC5079r0 f18868h;

    /* renamed from: v0.b0$a */
    /* loaded from: classes.dex */
    public static class a extends C5031b0 {
        public a(String str) {
            super(str);
        }
    }

    public C5031b0(String str) {
        super(str);
        this.f18868h = null;
    }

    /* renamed from: a */
    public static C5031b0 m19810a() {
        return new C5031b0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static C5031b0 m19811b() {
        return new C5031b0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static C5031b0 m19812c() {
        return new C5031b0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static a m19813d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C5031b0 m19814e() {
        return new C5031b0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static C5031b0 m19815f() {
        return new C5031b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static C5031b0 m19816g() {
        return new C5031b0("Failed to parse the message.");
    }

    /* renamed from: h */
    public static C5031b0 m19817h() {
        return new C5031b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    public static C5031b0 m19818j() {
        return new C5031b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: k */
    public static C5031b0 m19819k() {
        return new C5031b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public C5031b0 m19820i(InterfaceC5079r0 interfaceC5079r0) {
        this.f18868h = interfaceC5079r0;
        return this;
    }
}
