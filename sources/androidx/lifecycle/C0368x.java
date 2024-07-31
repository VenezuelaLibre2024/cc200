package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.C0395a;
import gd.C2240n;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p087fe.InterfaceC1915k;
import p090g0.C1944d;
import p115hd.C2488e0;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public final class C0368x {

    /* renamed from: f */
    public static final a f1760f = new a(null);

    /* renamed from: g */
    public static final Class<? extends Object>[] f1761g;

    /* renamed from: a */
    public final Map<String, Object> f1762a;

    /* renamed from: b */
    public final Map<String, C0395a.c> f1763b;

    /* renamed from: c */
    public final Map<String, Object> f1764c;

    /* renamed from: d */
    public final Map<String, InterfaceC1915k<Object>> f1765d;

    /* renamed from: e */
    public final C0395a.c f1766e;

    /* renamed from: androidx.lifecycle.x$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C0368x m1881a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C0368x();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    C4753m.m18652e(str, Constants.KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new C0368x(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                C4753m.m18651d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new C0368x(linkedHashMap);
        }

        /* renamed from: b */
        public final boolean m1882b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C0368x.f1761g) {
                C4753m.m18650c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        Class<? extends Object>[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i10 = Build.VERSION.SDK_INT;
        clsArr[27] = i10 >= 21 ? Size.class : cls;
        if (i10 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f1761g = clsArr;
    }

    public C0368x() {
        this.f1762a = new LinkedHashMap();
        this.f1763b = new LinkedHashMap();
        this.f1764c = new LinkedHashMap();
        this.f1765d = new LinkedHashMap();
        this.f1766e = new C0395a.c() { // from class: androidx.lifecycle.w
            @Override // androidx.savedstate.C0395a.c
            /* renamed from: a */
            public final Bundle mo595a() {
                Bundle m1878d;
                m1878d = C0368x.m1878d(C0368x.this);
                return m1878d;
            }
        };
    }

    public C0368x(Map<String, ? extends Object> map) {
        C4753m.m18653f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1762a = linkedHashMap;
        this.f1763b = new LinkedHashMap();
        this.f1764c = new LinkedHashMap();
        this.f1765d = new LinkedHashMap();
        this.f1766e = new C0395a.c() { // from class: androidx.lifecycle.w
            @Override // androidx.savedstate.C0395a.c
            /* renamed from: a */
            public final Bundle mo595a() {
                Bundle m1878d;
                m1878d = C0368x.m1878d(C0368x.this);
                return m1878d;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* renamed from: d */
    public static final Bundle m1878d(C0368x c0368x) {
        C4753m.m18653f(c0368x, "this$0");
        for (Map.Entry entry : C2488e0.m9904l(c0368x.f1763b).entrySet()) {
            c0368x.m1880e((String) entry.getKey(), ((C0395a.c) entry.getValue()).mo595a());
        }
        Set<String> keySet = c0368x.f1762a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(c0368x.f1762a.get(str));
        }
        return C1944d.m7852a(C2240n.m8977a("keys", arrayList), C2240n.m8977a("values", arrayList2));
    }

    /* renamed from: c */
    public final C0395a.c m1879c() {
        return this.f1766e;
    }

    /* renamed from: e */
    public final <T> void m1880e(String str, T t10) {
        C4753m.m18653f(str, Constants.KEY);
        if (!f1760f.m1882b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            C4753m.m18650c(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f1764c.get(str);
        C0361q c0361q = obj instanceof C0361q ? (C0361q) obj : null;
        if (c0361q != null) {
            c0361q.setValue(t10);
        } else {
            this.f1762a.put(str, t10);
        }
        InterfaceC1915k<Object> interfaceC1915k = this.f1765d.get(str);
        if (interfaceC1915k == null) {
            return;
        }
        interfaceC1915k.setValue(t10);
    }
}
