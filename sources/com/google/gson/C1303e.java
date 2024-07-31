package com.google.gson;

import com.google.gson.internal.C1309a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.C1373a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p339x9.C5740a;

/* renamed from: com.google.gson.e */
/* loaded from: classes.dex */
public final class C1303e {

    /* renamed from: h */
    public String f4969h;

    /* renamed from: a */
    public Excluder f4962a = Excluder.f4981n;

    /* renamed from: b */
    public EnumC1383s f4963b = EnumC1383s.f5216h;

    /* renamed from: c */
    public InterfaceC1302d f4964c = EnumC1301c.f4955h;

    /* renamed from: d */
    public final Map<Type, InterfaceC1304f<?>> f4965d = new HashMap();

    /* renamed from: e */
    public final List<InterfaceC1386v> f4966e = new ArrayList();

    /* renamed from: f */
    public final List<InterfaceC1386v> f4967f = new ArrayList();

    /* renamed from: g */
    public boolean f4968g = false;

    /* renamed from: i */
    public int f4970i = 2;

    /* renamed from: j */
    public int f4971j = 2;

    /* renamed from: k */
    public boolean f4972k = false;

    /* renamed from: l */
    public boolean f4973l = false;

    /* renamed from: m */
    public boolean f4974m = true;

    /* renamed from: n */
    public boolean f4975n = false;

    /* renamed from: o */
    public boolean f4976o = false;

    /* renamed from: p */
    public boolean f4977p = false;

    /* renamed from: q */
    public InterfaceC1385u f4978q = EnumC1384t.f5219h;

    /* renamed from: r */
    public InterfaceC1385u f4979r = EnumC1384t.f5220i;

    /* renamed from: a */
    public final void m5615a(String str, int i10, int i11, List<InterfaceC1386v> list) {
        InterfaceC1386v interfaceC1386v;
        InterfaceC1386v interfaceC1386v2;
        boolean z10 = C1373a.f5207a;
        InterfaceC1386v interfaceC1386v3 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC1386v = DefaultDateTypeAdapter.AbstractC1314b.f5011b.m5667b(str);
            if (z10) {
                interfaceC1386v3 = C1373a.f5209c.m5667b(str);
                interfaceC1386v2 = C1373a.f5208b.m5667b(str);
            }
            interfaceC1386v2 = null;
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            InterfaceC1386v m5666a = DefaultDateTypeAdapter.AbstractC1314b.f5011b.m5666a(i10, i11);
            if (z10) {
                interfaceC1386v3 = C1373a.f5209c.m5666a(i10, i11);
                InterfaceC1386v m5666a2 = C1373a.f5208b.m5666a(i10, i11);
                interfaceC1386v = m5666a;
                interfaceC1386v2 = m5666a2;
            } else {
                interfaceC1386v = m5666a;
                interfaceC1386v2 = null;
            }
        }
        list.add(interfaceC1386v);
        if (z10) {
            list.add(interfaceC1386v3);
            list.add(interfaceC1386v2);
        }
    }

    /* renamed from: b */
    public Gson m5616b() {
        List<InterfaceC1386v> arrayList = new ArrayList<>(this.f4966e.size() + this.f4967f.size() + 3);
        arrayList.addAll(this.f4966e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f4967f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m5615a(this.f4969h, this.f4970i, this.f4971j, arrayList);
        return new Gson(this.f4962a, this.f4964c, this.f4965d, this.f4968g, this.f4972k, this.f4976o, this.f4974m, this.f4975n, this.f4977p, this.f4973l, this.f4963b, this.f4969h, this.f4970i, this.f4971j, this.f4966e, this.f4967f, arrayList, this.f4978q, this.f4979r);
    }

    /* renamed from: c */
    public C1303e m5617c(Type type, Object obj) {
        boolean z10 = obj instanceof InterfaceC1381q;
        C1309a.m5635a(z10 || (obj instanceof InterfaceC1307i) || (obj instanceof InterfaceC1304f) || (obj instanceof TypeAdapter));
        if (obj instanceof InterfaceC1304f) {
            this.f4965d.put(type, (InterfaceC1304f) obj);
        }
        if (z10 || (obj instanceof InterfaceC1307i)) {
            this.f4966e.add(TreeTypeAdapter.m5689b(C5740a.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f4966e.add(TypeAdapters.m5694c(C5740a.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    /* renamed from: d */
    public C1303e m5618d(InterfaceC1386v interfaceC1386v) {
        this.f4966e.add(interfaceC1386v);
        return this;
    }
}
