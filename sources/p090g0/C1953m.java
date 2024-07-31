package p090g0;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: g0.m */
/* loaded from: classes.dex */
public final class C1953m implements InterfaceC1952l {

    /* renamed from: a */
    public final LocaleList f7767a;

    public C1953m(Object obj) {
        this.f7767a = (LocaleList) obj;
    }

    @Override // p090g0.InterfaceC1952l
    /* renamed from: a */
    public Object mo7873a() {
        return this.f7767a;
    }

    public boolean equals(Object obj) {
        return this.f7767a.equals(((InterfaceC1952l) obj).mo7873a());
    }

    @Override // p090g0.InterfaceC1952l
    public Locale get(int i10) {
        return this.f7767a.get(i10);
    }

    public int hashCode() {
        return this.f7767a.hashCode();
    }

    @Override // p090g0.InterfaceC1952l
    public int size() {
        return this.f7767a.size();
    }

    public String toString() {
        return this.f7767a.toString();
    }
}
