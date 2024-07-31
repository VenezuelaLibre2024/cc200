package p333x3;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: x3.p */
/* loaded from: classes.dex */
public interface InterfaceC5576p {

    /* renamed from: a */
    public static final InterfaceC5576p f20934a = new InterfaceC5576p() { // from class: x3.o
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m22465a;
            m22465a = InterfaceC5576p.m22465a();
            return m22465a;
        }
    };

    /* renamed from: a */
    static /* synthetic */ InterfaceC5571k[] m22465a() {
        return new InterfaceC5571k[0];
    }

    /* renamed from: b */
    InterfaceC5571k[] mo161b();

    /* renamed from: c */
    default InterfaceC5571k[] mo22456c(Uri uri, Map<String, List<String>> map) {
        return mo161b();
    }
}
