package p272t0;

import java.io.InputStream;
import p246r0.C4257a;
import p301v0.C5031b0;
import td.C4747g;
import td.C4753m;

/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class C4604d {

    /* renamed from: a */
    public static final a f17261a = new a(null);

    /* renamed from: t0.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C4606f m18135a(InputStream inputStream) {
            C4753m.m18653f(inputStream, "input");
            try {
                C4606f m18139S = C4606f.m18139S(inputStream);
                C4753m.m18652e(m18139S, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return m18139S;
            } catch (C5031b0 e10) {
                throw new C4257a("Unable to parse preferences proto.", e10);
            }
        }
    }
}
