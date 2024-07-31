package p109h7;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: h7.h */
/* loaded from: classes.dex */
public class C2425h {

    /* renamed from: a */
    public final String f9751a;

    public C2425h(String str) {
        this.f9751a = (String) C2432o.m9704j(str);
    }

    /* renamed from: f */
    public static C2425h m9674f(char c10) {
        return new C2425h(String.valueOf(c10));
    }

    /* renamed from: a */
    public <A extends Appendable> A m9675a(A a10, Iterator<? extends Object> it) {
        C2432o.m9704j(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(m9680g(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f9751a);
            }
        }
        return a10;
    }

    /* renamed from: b */
    public final StringBuilder m9676b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return m9677c(sb2, iterable.iterator());
    }

    /* renamed from: c */
    public final StringBuilder m9677c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            m9675a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: d */
    public final String m9678d(Iterable<? extends Object> iterable) {
        return m9679e(iterable.iterator());
    }

    /* renamed from: e */
    public final String m9679e(Iterator<? extends Object> it) {
        return m9677c(new StringBuilder(), it).toString();
    }

    /* renamed from: g */
    public CharSequence m9680g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
