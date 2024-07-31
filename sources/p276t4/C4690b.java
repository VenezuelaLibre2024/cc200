package p276t4;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p206o5.C3905g0;
import p276t4.InterfaceC4689a;

/* renamed from: t4.b */
/* loaded from: classes.dex */
public final class C4690b<T extends InterfaceC4689a<T>> implements C3905g0.a<T> {

    /* renamed from: a */
    public final C3905g0.a<? extends T> f17520a;

    /* renamed from: b */
    public final List<C4691c> f17521b;

    public C4690b(C3905g0.a<? extends T> aVar, List<C4691c> list) {
        this.f17520a = aVar;
        this.f17521b = list;
    }

    @Override // p206o5.C3905g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo290a(Uri uri, InputStream inputStream) {
        T mo290a = this.f17520a.mo290a(uri, inputStream);
        List<C4691c> list = this.f17521b;
        return (list == null || list.isEmpty()) ? mo290a : (T) mo290a.mo247a(this.f17521b);
    }
}
