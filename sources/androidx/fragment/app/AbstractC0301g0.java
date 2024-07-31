package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0344f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p003a1.C0019d;

/* renamed from: androidx.fragment.app.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0301g0 {

    /* renamed from: a */
    public final C0316o f1464a;

    /* renamed from: b */
    public final ClassLoader f1465b;

    /* renamed from: d */
    public int f1467d;

    /* renamed from: e */
    public int f1468e;

    /* renamed from: f */
    public int f1469f;

    /* renamed from: g */
    public int f1470g;

    /* renamed from: h */
    public int f1471h;

    /* renamed from: i */
    public boolean f1472i;

    /* renamed from: k */
    public String f1474k;

    /* renamed from: l */
    public int f1475l;

    /* renamed from: m */
    public CharSequence f1476m;

    /* renamed from: n */
    public int f1477n;

    /* renamed from: o */
    public CharSequence f1478o;

    /* renamed from: p */
    public ArrayList<String> f1479p;

    /* renamed from: q */
    public ArrayList<String> f1480q;

    /* renamed from: s */
    public ArrayList<Runnable> f1482s;

    /* renamed from: c */
    public ArrayList<a> f1466c = new ArrayList<>();

    /* renamed from: j */
    public boolean f1473j = true;

    /* renamed from: r */
    public boolean f1481r = false;

    /* renamed from: androidx.fragment.app.g0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f1483a;

        /* renamed from: b */
        public Fragment f1484b;

        /* renamed from: c */
        public boolean f1485c;

        /* renamed from: d */
        public int f1486d;

        /* renamed from: e */
        public int f1487e;

        /* renamed from: f */
        public int f1488f;

        /* renamed from: g */
        public int f1489g;

        /* renamed from: h */
        public AbstractC0344f.b f1490h;

        /* renamed from: i */
        public AbstractC0344f.b f1491i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f1483a = i10;
            this.f1484b = fragment;
            this.f1485c = false;
            AbstractC0344f.b bVar = AbstractC0344f.b.RESUMED;
            this.f1490h = bVar;
            this.f1491i = bVar;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f1483a = i10;
            this.f1484b = fragment;
            this.f1485c = z10;
            AbstractC0344f.b bVar = AbstractC0344f.b.RESUMED;
            this.f1490h = bVar;
            this.f1491i = bVar;
        }
    }

    public AbstractC0301g0(C0316o c0316o, ClassLoader classLoader) {
        this.f1464a = c0316o;
        this.f1465b = classLoader;
    }

    /* renamed from: b */
    public AbstractC0301g0 m1485b(int i10, Fragment fragment, String str) {
        mo1363k(i10, fragment, str, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC0301g0 m1486c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m1485b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public AbstractC0301g0 m1487d(Fragment fragment, String str) {
        mo1363k(0, fragment, str, 1);
        return this;
    }

    /* renamed from: e */
    public void m1488e(a aVar) {
        this.f1466c.add(aVar);
        aVar.f1486d = this.f1467d;
        aVar.f1487e = this.f1468e;
        aVar.f1488f = this.f1469f;
        aVar.f1489g = this.f1470g;
    }

    /* renamed from: f */
    public abstract int mo1359f();

    /* renamed from: g */
    public abstract int mo1360g();

    /* renamed from: h */
    public abstract void mo1361h();

    /* renamed from: i */
    public abstract void mo1362i();

    /* renamed from: j */
    public AbstractC0301g0 m1489j() {
        if (this.f1472i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1473j = false;
        return this;
    }

    /* renamed from: k */
    public void mo1363k(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C0019d.m101h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        m1488e(new a(i11, fragment));
    }

    /* renamed from: l */
    public AbstractC0301g0 mo1364l(Fragment fragment) {
        m1488e(new a(3, fragment));
        return this;
    }

    /* renamed from: m */
    public AbstractC0301g0 m1490m(boolean z10) {
        this.f1481r = z10;
        return this;
    }
}
