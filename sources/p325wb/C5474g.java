package p325wb;

import java.util.HashMap;
import java.util.Map;
import p311vb.EnumC5160d;

/* renamed from: wb.g */
/* loaded from: classes.dex */
public class C5474g<T> {

    /* renamed from: a */
    public Map<EnumC5160d, T> f20365a = new HashMap();

    public C5474g() {
    }

    public C5474g(T t10, T t11) {
        m21700h(EnumC5160d.AUDIO, t11);
        m21700h(EnumC5160d.VIDEO, t10);
    }

    /* renamed from: a */
    public T m21693a(EnumC5160d enumC5160d) {
        return this.f20365a.get(enumC5160d);
    }

    /* renamed from: b */
    public boolean m21694b(EnumC5160d enumC5160d) {
        return this.f20365a.containsKey(enumC5160d);
    }

    /* renamed from: c */
    public boolean m21695c() {
        return m21694b(EnumC5160d.AUDIO);
    }

    /* renamed from: d */
    public boolean m21696d() {
        return m21694b(EnumC5160d.VIDEO);
    }

    /* renamed from: e */
    public T m21697e(EnumC5160d enumC5160d) {
        return this.f20365a.get(enumC5160d);
    }

    /* renamed from: f */
    public T m21698f() {
        return m21697e(EnumC5160d.AUDIO);
    }

    /* renamed from: g */
    public T m21699g() {
        return m21697e(EnumC5160d.VIDEO);
    }

    /* renamed from: h */
    public void m21700h(EnumC5160d enumC5160d, T t10) {
        this.f20365a.put(enumC5160d, t10);
    }

    /* renamed from: i */
    public void m21701i(T t10) {
        m21700h(EnumC5160d.AUDIO, t10);
    }

    /* renamed from: j */
    public void m21702j(T t10) {
        m21700h(EnumC5160d.VIDEO, t10);
    }
}
