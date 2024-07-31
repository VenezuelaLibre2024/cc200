package p029c2;

import androidx.work.C0417b;
import java.util.List;

/* renamed from: c2.h */
/* loaded from: classes.dex */
public abstract class AbstractC0590h {

    /* renamed from: a */
    public static final String f2596a = AbstractC0592j.m2972f("InputMerger");

    /* renamed from: a */
    public static AbstractC0590h m2966a(String str) {
        try {
            return (AbstractC0590h) Class.forName(str).newInstance();
        } catch (Exception e10) {
            AbstractC0592j.m2970c().mo2974b(f2596a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C0417b mo2056b(List<C0417b> list);
}
