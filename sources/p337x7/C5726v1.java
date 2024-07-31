package p337x7;

/* renamed from: x7.v1 */
/* loaded from: classes.dex */
public final class C5726v1 extends AbstractC5714r1 {

    /* renamed from: a */
    public final String f21264a;

    /* renamed from: b */
    public final String f21265b;

    /* renamed from: c */
    public final String f21266c;

    public C5726v1(String str, String str2, String str3) {
        this.f21264a = str;
        this.f21265b = str2;
        this.f21266c = str3;
    }

    @Override // p337x7.AbstractC5714r1
    /* renamed from: a */
    public final String mo22814a() {
        return this.f21265b;
    }

    @Override // p337x7.AbstractC5714r1
    /* renamed from: b */
    public final String mo22815b() {
        return this.f21266c;
    }

    @Override // p337x7.AbstractC5714r1
    /* renamed from: c */
    public final String mo22816c() {
        return this.f21264a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5714r1) {
            AbstractC5714r1 abstractC5714r1 = (AbstractC5714r1) obj;
            String str = this.f21264a;
            if (str != null ? str.equals(abstractC5714r1.mo22816c()) : abstractC5714r1.mo22816c() == null) {
                String str2 = this.f21265b;
                if (str2 != null ? str2.equals(abstractC5714r1.mo22814a()) : abstractC5714r1.mo22814a() == null) {
                    String str3 = this.f21266c;
                    String mo22815b = abstractC5714r1.mo22815b();
                    if (str3 != null ? str3.equals(mo22815b) : mo22815b == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21264a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f21265b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21266c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f21264a + ", playIntegrityToken=" + this.f21265b + ", recaptchaEnterpriseToken=" + this.f21266c + "}";
    }
}
