package p240q9;

import android.net.Uri;
import com.journeyapps.barcodescanner.C1393b;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p225p8.C4063a;
import p255r9.AbstractC4328e;

/* renamed from: q9.h */
/* loaded from: classes.dex */
public class C4217h {

    /* renamed from: a */
    public final Uri f15191a;

    /* renamed from: b */
    public final Uri f15192b;

    /* renamed from: c */
    public final Uri f15193c;

    public C4217h(Uri uri, C4063a c4063a) {
        Uri parse;
        this.f15193c = uri;
        if (c4063a == null) {
            parse = AbstractC4328e.f15645k;
        } else {
            parse = Uri.parse("http://" + c4063a.m15619a() + ":" + c4063a.m15620b() + "/v0");
        }
        this.f15191a = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath(C1393b.f5292o).appendEncodedPath(uri.getAuthority());
        String m16230a = C4213d.m16230a(uri.getPath());
        if (m16230a.length() > 0 && !FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE.equals(m16230a)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(m16230a);
        }
        this.f15192b = appendEncodedPath.build();
    }

    /* renamed from: a */
    public Uri m16235a() {
        return this.f15193c;
    }

    /* renamed from: b */
    public Uri m16236b() {
        return this.f15191a;
    }

    /* renamed from: c */
    public Uri m16237c() {
        return this.f15192b;
    }
}
