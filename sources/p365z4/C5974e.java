package p365z4;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p222p5.C4014a;

/* renamed from: z4.e */
/* loaded from: classes.dex */
public final class C5974e {

    /* renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f22186a;

    /* renamed from: z4.e$a */
    /* loaded from: classes.dex */
    public class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: h */
        public final /* synthetic */ int f22187h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5974e c5974e, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f22187h = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f22187h;
        }
    }

    public C5974e(int i10) {
        this.f22186a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    /* renamed from: a */
    public byte[] m23938a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f22186a.get(uri);
    }

    /* renamed from: b */
    public byte[] m23939b(Uri uri, byte[] bArr) {
        return this.f22186a.put((Uri) C4014a.m15199e(uri), (byte[]) C4014a.m15199e(bArr));
    }

    /* renamed from: c */
    public byte[] m23940c(Uri uri) {
        return this.f22186a.remove(C4014a.m15199e(uri));
    }
}
