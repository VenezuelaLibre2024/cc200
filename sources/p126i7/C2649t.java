package p126i7;

import java.io.Serializable;

/* renamed from: i7.t */
/* loaded from: classes.dex */
public class C2649t<K, V> extends AbstractC2618e<K, V> implements Serializable {

    /* renamed from: h */
    public final K f10358h;

    /* renamed from: i */
    public final V f10359i;

    public C2649t(K k10, V v10) {
        this.f10358h = k10;
        this.f10359i = v10;
    }

    @Override // p126i7.AbstractC2618e, java.util.Map.Entry
    public final K getKey() {
        return this.f10358h;
    }

    @Override // p126i7.AbstractC2618e, java.util.Map.Entry
    public final V getValue() {
        return this.f10359i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
