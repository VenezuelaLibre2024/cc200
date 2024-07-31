package p317w3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p206o5.C3918n;

/* renamed from: w3.j0 */
/* loaded from: classes.dex */
public final class C5242j0 extends IOException {

    /* renamed from: h */
    public final C3918n f19894h;

    /* renamed from: i */
    public final Uri f19895i;

    /* renamed from: j */
    public final Map<String, List<String>> f19896j;

    /* renamed from: k */
    public final long f19897k;

    public C5242j0(C3918n c3918n, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f19894h = c3918n;
        this.f19895i = uri;
        this.f19896j = map;
        this.f19897k = j10;
    }
}
