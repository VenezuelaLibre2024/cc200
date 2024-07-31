package p306v5;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;
import p021b6.C0490i;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p108h6.C2352e;

/* renamed from: v5.e */
/* loaded from: classes.dex */
public final class C5121e extends C1841a.a {
    @Override // p079f6.C1841a.a
    public final /* synthetic */ C1841a.f buildClient(Context context, Looper looper, C2352e c2352e, Object obj, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        return new C0490i(context, looper, c2352e, (GoogleSignInOptions) obj, aVar, bVar);
    }

    @Override // p079f6.C1841a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m4952K();
    }
}
