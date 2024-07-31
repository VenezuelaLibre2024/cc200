package p079f6;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p064e6.C1671d;
import p079f6.AbstractC1846f;
import p079f6.C1841a.d;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2346c;
import p108h6.C2352e;
import p108h6.C2394s;
import p108h6.InterfaceC2370k;

/* renamed from: f6.a */
/* loaded from: classes.dex */
public final class C1841a<O extends d> {

    /* renamed from: a */
    public final a f7028a;

    /* renamed from: b */
    public final g f7029b;

    /* renamed from: c */
    public final String f7030c;

    @VisibleForTesting
    /* renamed from: f6.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, C2352e c2352e, O o10, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
            return buildClient(context, looper, c2352e, (C2352e) o10, (InterfaceC2014e) aVar, (InterfaceC2044m) bVar);
        }

        public T buildClient(Context context, Looper looper, C2352e c2352e, O o10, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: f6.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: f6.a$c */
    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* renamed from: f6.a$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: d */
        public static final c f7031d = new c(null);

        /* renamed from: f6.a$d$a */
        /* loaded from: classes.dex */
        public interface a extends d {
            /* renamed from: y */
            Account m7581y();
        }

        /* renamed from: f6.a$d$b */
        /* loaded from: classes.dex */
        public interface b extends d {
            /* renamed from: u */
            GoogleSignInAccount m7582u();
        }

        /* renamed from: f6.a$d$c */
        /* loaded from: classes.dex */
        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(C1859s c1859s) {
            }
        }
    }

    @VisibleForTesting
    /* renamed from: f6.a$e */
    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    /* renamed from: f6.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        void connect(AbstractC2346c.c cVar);

        void disconnect();

        void disconnect(String str);

        C1671d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC2370k interfaceC2370k, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC2346c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    @VisibleForTesting
    /* renamed from: f6.a$g */
    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> C1841a(String str, a<C, O> aVar, g<C> gVar) {
        C2394s.m9620m(aVar, "Cannot construct an Api with a null ClientBuilder");
        C2394s.m9620m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f7030c = str;
        this.f7028a = aVar;
        this.f7029b = gVar;
    }

    /* renamed from: a */
    public final a m7578a() {
        return this.f7028a;
    }

    /* renamed from: b */
    public final c m7579b() {
        return this.f7029b;
    }

    /* renamed from: c */
    public final String m7580c() {
        return this.f7030c;
    }
}
