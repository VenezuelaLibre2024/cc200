package p255r9;

import android.net.Uri;
import p195n7.C3767g;
import p240q9.C4217h;

/* renamed from: r9.i */
/* loaded from: classes.dex */
public class C4332i extends AbstractC4329f {

    /* renamed from: m */
    public final Uri f15664m;

    public C4332i(C4217h c4217h, C3767g c3767g, Uri uri) {
        super(c4217h, c3767g);
        this.f15664m = uri;
        super.m16587G("X-Goog-Upload-Protocol", "resumable");
        super.m16587G("X-Goog-Upload-Command", "query");
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: e */
    public String mo16577e() {
        return "POST";
    }

    @Override // p255r9.AbstractC4328e
    /* renamed from: u */
    public Uri mo16579u() {
        return this.f15664m;
    }
}
