package p108h6;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p064e6.C1671d;
import p064e6.C1673e;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;

/* renamed from: h6.h */
/* loaded from: classes.dex */
public abstract class AbstractC2361h<T extends IInterface> extends AbstractC2346c<T> implements C1841a.f {
    private static volatile Executor zaa;
    private final C2352e zab;
    private final Set zac;
    private final Account zad;

    @VisibleForTesting
    public AbstractC2361h(Context context, Handler handler, int i10, C2352e c2352e) {
        super(context, handler, AbstractC2364i.m9562c(context), C1673e.m6693m(), i10, null, null);
        this.zab = (C2352e) C2394s.m9619l(c2352e);
        this.zad = c2352e.m9519a();
        this.zac = zaa(c2352e.m9522d());
    }

    public AbstractC2361h(Context context, Looper looper, int i10, C2352e c2352e) {
        this(context, looper, AbstractC2364i.m9562c(context), C1673e.m6693m(), i10, c2352e, null, null);
    }

    @Deprecated
    public AbstractC2361h(Context context, Looper looper, int i10, C2352e c2352e, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        this(context, looper, i10, c2352e, (InterfaceC2014e) aVar, (InterfaceC2044m) bVar);
    }

    public AbstractC2361h(Context context, Looper looper, int i10, C2352e c2352e, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        this(context, looper, AbstractC2364i.m9562c(context), C1673e.m6693m(), i10, c2352e, (InterfaceC2014e) C2394s.m9619l(interfaceC2014e), (InterfaceC2044m) C2394s.m9619l(interfaceC2044m));
    }

    @VisibleForTesting
    public AbstractC2361h(Context context, Looper looper, AbstractC2364i abstractC2364i, C1673e c1673e, int i10, C2352e c2352e, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, abstractC2364i, c1673e, i10, interfaceC2014e == null ? null : new C2368j0(interfaceC2014e), interfaceC2044m == null ? null : new C2371k0(interfaceC2044m), c2352e.m9528j());
        this.zab = c2352e;
        this.zad = c2352e.m9519a();
        this.zac = zaa(c2352e.m9522d());
    }

    private final Set zaa(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // p108h6.AbstractC2346c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // p108h6.AbstractC2346c
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C2352e getClientSettings() {
        return this.zab;
    }

    public C1671d[] getRequiredFeatures() {
        return new C1671d[0];
    }

    @Override // p108h6.AbstractC2346c
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // p079f6.C1841a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
