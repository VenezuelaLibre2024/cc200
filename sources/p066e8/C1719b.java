package p066e8;

import java.io.File;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: e8.b */
/* loaded from: classes.dex */
public final class C1719b extends AbstractC1754u {

    /* renamed from: a */
    public final AbstractC2135f0 f6323a;

    /* renamed from: b */
    public final String f6324b;

    /* renamed from: c */
    public final File f6325c;

    public C1719b(AbstractC2135f0 abstractC2135f0, String str, File file) {
        Objects.requireNonNull(abstractC2135f0, "Null report");
        this.f6323a = abstractC2135f0;
        Objects.requireNonNull(str, "Null sessionId");
        this.f6324b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f6325c = file;
    }

    @Override // p066e8.AbstractC1754u
    /* renamed from: b */
    public AbstractC2135f0 mo6766b() {
        return this.f6323a;
    }

    @Override // p066e8.AbstractC1754u
    /* renamed from: c */
    public File mo6767c() {
        return this.f6325c;
    }

    @Override // p066e8.AbstractC1754u
    /* renamed from: d */
    public String mo6768d() {
        return this.f6324b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1754u)) {
            return false;
        }
        AbstractC1754u abstractC1754u = (AbstractC1754u) obj;
        return this.f6323a.equals(abstractC1754u.mo6766b()) && this.f6324b.equals(abstractC1754u.mo6768d()) && this.f6325c.equals(abstractC1754u.mo6767c());
    }

    public int hashCode() {
        return ((((this.f6323a.hashCode() ^ 1000003) * 1000003) ^ this.f6324b.hashCode()) * 1000003) ^ this.f6325c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f6323a + ", sessionId=" + this.f6324b + ", reportFile=" + this.f6325c + "}";
    }
}
