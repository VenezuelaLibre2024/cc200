package p206o5;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: o5.a0 */
/* loaded from: classes.dex */
public final class C3893a0 extends C3930y {

    /* renamed from: k */
    public final int f13968k;

    /* renamed from: l */
    public final String f13969l;

    /* renamed from: m */
    public final Map<String, List<String>> f13970m;

    /* renamed from: n */
    public final byte[] f13971n;

    public C3893a0(int i10, String str, IOException iOException, Map<String, List<String>> map, C3918n c3918n, byte[] bArr) {
        super("Response code: " + i10, iOException, c3918n, 2004, 1);
        this.f13968k = i10;
        this.f13969l = str;
        this.f13970m = map;
        this.f13971n = bArr;
    }
}
