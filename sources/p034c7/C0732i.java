package p034c7;

import java.util.EnumMap;
import p034c7.C0810n7;

/* renamed from: c7.i */
/* loaded from: classes.dex */
public final class C0732i {

    /* renamed from: a */
    public final EnumMap<C0810n7.a, EnumC0774l> f3036a;

    public C0732i() {
        this.f3036a = new EnumMap<>(C0810n7.a.class);
    }

    public C0732i(EnumMap<C0810n7.a, EnumC0774l> enumMap) {
        EnumMap<C0810n7.a, EnumC0774l> enumMap2 = new EnumMap<>((Class<C0810n7.a>) C0810n7.a.class);
        this.f3036a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: a */
    public static C0732i m3299a(String str) {
        EnumMap enumMap = new EnumMap(C0810n7.a.class);
        if (str.length() >= C0810n7.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C0810n7.a[] values = C0810n7.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) values[i10], (C0810n7.a) EnumC0774l.m3526c(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C0732i(enumMap);
            }
        }
        return new C0732i();
    }

    /* renamed from: b */
    public final EnumC0774l m3300b(C0810n7.a aVar) {
        EnumC0774l enumC0774l = this.f3036a.get(aVar);
        return enumC0774l == null ? EnumC0774l.UNSET : enumC0774l;
    }

    /* renamed from: c */
    public final void m3301c(C0810n7.a aVar, int i10) {
        EnumC0774l enumC0774l = EnumC0774l.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    enumC0774l = EnumC0774l.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        enumC0774l = EnumC0774l.INITIALIZATION;
                    }
                }
            }
            enumC0774l = EnumC0774l.API;
        } else {
            enumC0774l = EnumC0774l.TCF;
        }
        this.f3036a.put((EnumMap<C0810n7.a, EnumC0774l>) aVar, (C0810n7.a) enumC0774l);
    }

    /* renamed from: d */
    public final void m3302d(C0810n7.a aVar, EnumC0774l enumC0774l) {
        this.f3036a.put((EnumMap<C0810n7.a, EnumC0774l>) aVar, (C0810n7.a) enumC0774l);
    }

    public final String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder("1");
        for (C0810n7.a aVar : C0810n7.a.values()) {
            EnumC0774l enumC0774l = this.f3036a.get(aVar);
            if (enumC0774l == null) {
                enumC0774l = EnumC0774l.UNSET;
            }
            c10 = enumC0774l.f3265h;
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
