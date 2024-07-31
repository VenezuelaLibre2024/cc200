package p279t7;

import android.content.Context;
import android.content.SharedPreferences;
import p108h6.C2394s;
import p268s7.AbstractC4546b;
import p293u7.C4988b;
import p353y7.C5891w;
import p354y8.InterfaceC5896b;

/* renamed from: t7.m */
/* loaded from: classes.dex */
public class C4722m {

    /* renamed from: b */
    public static final C4988b f17627b = new C4988b(C4722m.class.getSimpleName());

    /* renamed from: a */
    public C5891w<SharedPreferences> f17628a;

    /* renamed from: t7.m$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17629a;

        static {
            int[] iArr = new int[b.values().length];
            f17629a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17629a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: t7.m$b */
    /* loaded from: classes.dex */
    public enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public C4722m(final Context context, String str) {
        C2394s.m9619l(context);
        C2394s.m9613f(str);
        final String format = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f17628a = new C5891w<>(new InterfaceC5896b() { // from class: t7.l
            @Override // p354y8.InterfaceC5896b
            public final Object get() {
                Object sharedPreferences;
                sharedPreferences = context.getSharedPreferences(format, 0);
                return sharedPreferences;
            }
        });
    }

    /* renamed from: b */
    public void m18558b() {
        this.f17628a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    /* renamed from: d */
    public AbstractC4546b m18559d() {
        String string = this.f17628a.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = this.f17628a.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i10 = a.f17629a[b.valueOf(string).ordinal()];
                if (i10 == 1) {
                    return C4710a.m18524d(string2);
                }
                if (i10 == 2) {
                    return C4710a.m18523c(string2);
                }
                f17627b.m19555d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e10) {
                f17627b.m19555d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e10.getMessage());
                m18558b();
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m18560e(AbstractC4546b abstractC4546b) {
        SharedPreferences.Editor putString;
        b bVar;
        if (abstractC4546b instanceof C4710a) {
            putString = this.f17628a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((C4710a) abstractC4546b).m18528h());
            bVar = b.DEFAULT_APP_CHECK_TOKEN;
        } else {
            putString = this.f17628a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", abstractC4546b.mo17978b());
            bVar = b.UNKNOWN_APP_CHECK_TOKEN;
        }
        putString.putString("com.google.firebase.appcheck.TOKEN_TYPE", bVar.name()).apply();
    }
}
