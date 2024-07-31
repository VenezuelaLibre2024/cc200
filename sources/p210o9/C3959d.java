package p210o9;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p038ce.C1053i;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p185m9.C3557b;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;
import td.C4763w;

/* renamed from: o9.d */
/* loaded from: classes.dex */
public final class C3959d implements InterfaceC3956a {

    /* renamed from: d */
    public static final a f14231d = new a(null);

    /* renamed from: a */
    public final C3557b f14232a;

    /* renamed from: b */
    public final InterfaceC3284g f14233b;

    /* renamed from: c */
    public final String f14234c;

    /* renamed from: o9.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m12917f = "RemoteSettingsFetcher.kt", m12918l = {C1417R.styleable.AppCompatTheme_editTextBackground, C1417R.styleable.AppCompatTheme_editTextStyle, C1417R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m12919m = "invokeSuspend")
    /* renamed from: o9.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f14235h;

        /* renamed from: j */
        public final /* synthetic */ Map<String, String> f14237j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC4584p<JSONObject, InterfaceC3281d<? super C2245s>, Object> f14238k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC4584p<String, InterfaceC3281d<? super C2245s>, Object> f14239l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<String, String> map, InterfaceC4584p<? super JSONObject, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p, InterfaceC4584p<? super String, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p2, InterfaceC3281d<? super b> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f14237j = map;
            this.f14238k = interfaceC4584p;
            this.f14239l = interfaceC4584p2;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new b(this.f14237j, this.f14238k, this.f14239l, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((b) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f14235h;
            try {
                if (i10 == 0) {
                    C2238l.m8975b(obj);
                    URLConnection openConnection = C3959d.this.m14986c().openConnection();
                    C4753m.m18651d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f14237j.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        C4763w c4763w = new C4763w();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            c4763w.f17731h = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb2.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        InterfaceC4584p<JSONObject, InterfaceC3281d<? super C2245s>, Object> interfaceC4584p = this.f14238k;
                        this.f14235h = 1;
                        if (interfaceC4584p.invoke(jSONObject, this) == m12581c) {
                            return m12581c;
                        }
                    } else {
                        InterfaceC4584p<String, InterfaceC3281d<? super C2245s>, Object> interfaceC4584p2 = this.f14239l;
                        String str = "Bad response code: " + responseCode;
                        this.f14235h = 2;
                        if (interfaceC4584p2.invoke(str, this) == m12581c) {
                            return m12581c;
                        }
                    }
                } else if (i10 == 1 || i10 == 2) {
                    C2238l.m8975b(obj);
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2238l.m8975b(obj);
                }
            } catch (Exception e10) {
                InterfaceC4584p<String, InterfaceC3281d<? super C2245s>, Object> interfaceC4584p3 = this.f14239l;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f14235h = 3;
                if (interfaceC4584p3.invoke(message, this) == m12581c) {
                    return m12581c;
                }
            }
            return C2245s.f8873a;
        }
    }

    public C3959d(C3557b c3557b, InterfaceC3284g interfaceC3284g, String str) {
        C4753m.m18653f(c3557b, "appInfo");
        C4753m.m18653f(interfaceC3284g, "blockingDispatcher");
        C4753m.m18653f(str, "baseUrl");
        this.f14232a = c3557b;
        this.f14233b = interfaceC3284g;
        this.f14234c = str;
    }

    public /* synthetic */ C3959d(C3557b c3557b, InterfaceC3284g interfaceC3284g, String str, int i10, C4747g c4747g) {
        this(c3557b, interfaceC3284g, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    @Override // p210o9.InterfaceC3956a
    /* renamed from: a */
    public Object mo14976a(Map<String, String> map, InterfaceC4584p<? super JSONObject, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p, InterfaceC4584p<? super String, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p2, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m4362g = C1053i.m4362g(this.f14233b, new b(map, interfaceC4584p, interfaceC4584p2, null), interfaceC3281d);
        return m4362g == C3385c.m12581c() ? m4362g : C2245s.f8873a;
    }

    /* renamed from: c */
    public final URL m14986c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f14234c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f14232a.m13212b()).appendPath("settings").appendQueryParameter("build_version", this.f14232a.m13211a().m13201a()).appendQueryParameter("display_version", this.f14232a.m13211a().m13206f()).build().toString());
    }
}
