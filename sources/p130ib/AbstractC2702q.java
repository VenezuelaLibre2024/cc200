package p130ib;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p113hb.C2474s;

/* renamed from: ib.q */
/* loaded from: classes.dex */
public abstract class AbstractC2702q {

    /* renamed from: a */
    public static final String f10572a = "q";

    /* renamed from: ib.q$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<C2474s> {

        /* renamed from: h */
        public final /* synthetic */ C2474s f10573h;

        public a(C2474s c2474s) {
            this.f10573h = c2474s;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2474s c2474s, C2474s c2474s2) {
            return Float.compare(AbstractC2702q.this.mo11007c(c2474s2, this.f10573h), AbstractC2702q.this.mo11007c(c2474s, this.f10573h));
        }
    }

    /* renamed from: a */
    public List<C2474s> m11015a(List<C2474s> list, C2474s c2474s) {
        if (c2474s == null) {
            return list;
        }
        Collections.sort(list, new a(c2474s));
        return list;
    }

    /* renamed from: b */
    public C2474s m11016b(List<C2474s> list, C2474s c2474s) {
        List<C2474s> m11015a = m11015a(list, c2474s);
        String str = f10572a;
        Log.i(str, "Viewfinder size: " + c2474s);
        Log.i(str, "Preview in order of preference: " + m11015a);
        return m11015a.get(0);
    }

    /* renamed from: c */
    public abstract float mo11007c(C2474s c2474s, C2474s c2474s2);

    /* renamed from: d */
    public abstract Rect mo11008d(C2474s c2474s, C2474s c2474s2);
}
