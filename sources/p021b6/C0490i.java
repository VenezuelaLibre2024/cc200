package p021b6;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p375authapi.zbat;
import java.util.Iterator;
import p064e6.C1683j;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;

/* renamed from: b6.i */
/* loaded from: classes.dex */
public final class C0490i extends AbstractC2361h {

    /* renamed from: h */
    public final GoogleSignInOptions f2288h;

    public C0490i(Context context, Looper looper, C2352e c2352e, GoogleSignInOptions googleSignInOptions, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 91, c2352e, aVar, bVar);
        GoogleSignInOptions.C1161a c1161a = googleSignInOptions != null ? new GoogleSignInOptions.C1161a(googleSignInOptions) : new GoogleSignInOptions.C1161a();
        c1161a.m4968j(zbat.zba());
        if (!c2352e.m9522d().isEmpty()) {
            Iterator<Scope> it = c2352e.m9522d().iterator();
            while (it.hasNext()) {
                c1161a.m4964f(it.next(), new Scope[0]);
            }
        }
        this.f2288h = c1161a.m4959a();
    }

    /* renamed from: c */
    public final GoogleSignInOptions m2434c() {
        return this.f2288h;
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0504w ? (C0504w) queryLocalInterface : new C0504w(iBinder);
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p108h6.AbstractC2346c
    public final Intent getSignInIntent() {
        return C0498q.m2437c(getContext(), this.f2288h);
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean providesSignIn() {
        return true;
    }
}
