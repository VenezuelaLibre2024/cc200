package p074f1;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.AbstractC0343e0;
import androidx.lifecycle.C0345f0;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.C0361q;
import androidx.lifecycle.InterfaceC0354k;
import androidx.lifecycle.InterfaceC0362r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p074f1.AbstractC1800a;
import p091g1.C1959b;
import p285u.C4778h;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public class C1801b extends AbstractC1800a {

    /* renamed from: c */
    public static boolean f6608c = false;

    /* renamed from: a */
    public final InterfaceC0354k f6609a;

    /* renamed from: b */
    public final c f6610b;

    /* renamed from: f1.b$a */
    /* loaded from: classes.dex */
    public static class a<D> extends C0361q<D> implements C1959b.b<D> {

        /* renamed from: a */
        public final int f6611a;

        /* renamed from: b */
        public final Bundle f6612b;

        /* renamed from: c */
        public final C1959b<D> f6613c;

        /* renamed from: d */
        public InterfaceC0354k f6614d;

        /* renamed from: e */
        public b<D> f6615e;

        /* renamed from: f */
        public C1959b<D> f6616f;

        public a(int i10, Bundle bundle, C1959b<D> c1959b, C1959b<D> c1959b2) {
            this.f6611a = i10;
            this.f6612b = bundle;
            this.f6613c = c1959b;
            this.f6616f = c1959b2;
            c1959b.m7907r(i10, this);
        }

        @Override // p091g1.C1959b.b
        /* renamed from: a */
        public void mo7275a(C1959b<D> c1959b, D d10) {
            if (C1801b.f6608c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d10);
                return;
            }
            if (C1801b.f6608c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d10);
        }

        /* renamed from: b */
        public C1959b<D> m7276b(boolean z10) {
            if (C1801b.f6608c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f6613c.m7895b();
            this.f6613c.m7894a();
            b<D> bVar = this.f6615e;
            if (bVar != null) {
                removeObserver(bVar);
                if (z10) {
                    bVar.m7283d();
                }
            }
            this.f6613c.m7912w(this);
            if ((bVar == null || bVar.m7282c()) && !z10) {
                return this.f6613c;
            }
            this.f6613c.m7908s();
            return this.f6616f;
        }

        /* renamed from: c */
        public void m7277c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f6611a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f6612b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f6613c);
            this.f6613c.mo7885g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f6615e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f6615e);
                this.f6615e.m7281b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m7278d().m7897d(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: d */
        public C1959b<D> m7278d() {
            return this.f6613c;
        }

        /* renamed from: e */
        public void m7279e() {
            InterfaceC0354k interfaceC0354k = this.f6614d;
            b<D> bVar = this.f6615e;
            if (interfaceC0354k == null || bVar == null) {
                return;
            }
            super.removeObserver(bVar);
            observe(interfaceC0354k, bVar);
        }

        /* renamed from: f */
        public C1959b<D> m7280f(InterfaceC0354k interfaceC0354k, AbstractC1800a.a<D> aVar) {
            b<D> bVar = new b<>(this.f6613c, aVar);
            observe(interfaceC0354k, bVar);
            b<D> bVar2 = this.f6615e;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f6614d = interfaceC0354k;
            this.f6615e = bVar;
            return this.f6613c;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (C1801b.f6608c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f6613c.m7910u();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (C1801b.f6608c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f6613c.m7911v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(InterfaceC0362r<? super D> interfaceC0362r) {
            super.removeObserver(interfaceC0362r);
            this.f6614d = null;
            this.f6615e = null;
        }

        @Override // androidx.lifecycle.C0361q, androidx.lifecycle.LiveData
        public void setValue(D d10) {
            super.setValue(d10);
            C1959b<D> c1959b = this.f6616f;
            if (c1959b != null) {
                c1959b.m7908s();
                this.f6616f = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f6611a);
            sb2.append(" : ");
            Class<?> cls = this.f6613c.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: f1.b$b */
    /* loaded from: classes.dex */
    public static class b<D> implements InterfaceC0362r<D> {

        /* renamed from: a */
        public final C1959b<D> f6617a;

        /* renamed from: b */
        public final AbstractC1800a.a<D> f6618b;

        /* renamed from: c */
        public boolean f6619c = false;

        public b(C1959b<D> c1959b, AbstractC1800a.a<D> aVar) {
            this.f6617a = c1959b;
            this.f6618b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC0362r
        /* renamed from: a */
        public void mo1433a(D d10) {
            if (C1801b.f6608c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f6617a + ": " + this.f6617a.m7897d(d10));
            }
            this.f6619c = true;
            this.f6618b.mo2413a(this.f6617a, d10);
        }

        /* renamed from: b */
        public void m7281b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f6619c);
        }

        /* renamed from: c */
        public boolean m7282c() {
            return this.f6619c;
        }

        /* renamed from: d */
        public void m7283d() {
            if (this.f6619c) {
                if (C1801b.f6608c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f6617a);
                }
                this.f6618b.mo2415c(this.f6617a);
            }
        }

        public String toString() {
            return this.f6618b.toString();
        }
    }

    /* renamed from: f1.b$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC0343e0 {

        /* renamed from: f */
        public static final C0345f0.b f6620f = new a();

        /* renamed from: d */
        public C4778h<a> f6621d = new C4778h<>();

        /* renamed from: e */
        public boolean f6622e = false;

        /* renamed from: f1.b$c$a */
        /* loaded from: classes.dex */
        public static class a implements C0345f0.b {
            @Override // androidx.lifecycle.C0345f0.b
            /* renamed from: a */
            public <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
                return new c();
            }
        }

        /* renamed from: h */
        public static c m7284h(C0349h0 c0349h0) {
            return (c) new C0345f0(c0349h0, f6620f).m1812a(c.class);
        }

        @Override // androidx.lifecycle.AbstractC0343e0
        /* renamed from: d */
        public void mo1376d() {
            super.mo1376d();
            int m18774l = this.f6621d.m18774l();
            for (int i10 = 0; i10 < m18774l; i10++) {
                this.f6621d.m18775m(i10).m7276b(true);
            }
            this.f6621d.m18767c();
        }

        /* renamed from: f */
        public void m7285f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f6621d.m18774l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f6621d.m18774l(); i10++) {
                    a m18775m = this.f6621d.m18775m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f6621d.m18772i(i10));
                    printWriter.print(": ");
                    printWriter.println(m18775m.toString());
                    m18775m.m7277c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        public void m7286g() {
            this.f6622e = false;
        }

        /* renamed from: i */
        public <D> a<D> m7287i(int i10) {
            return this.f6621d.m18770g(i10);
        }

        /* renamed from: j */
        public boolean m7288j() {
            return this.f6622e;
        }

        /* renamed from: k */
        public void m7289k() {
            int m18774l = this.f6621d.m18774l();
            for (int i10 = 0; i10 < m18774l; i10++) {
                this.f6621d.m18775m(i10).m7279e();
            }
        }

        /* renamed from: l */
        public void m7290l(int i10, a aVar) {
            this.f6621d.m18773k(i10, aVar);
        }

        /* renamed from: m */
        public void m7291m() {
            this.f6622e = true;
        }
    }

    public C1801b(InterfaceC0354k interfaceC0354k, C0349h0 c0349h0) {
        this.f6609a = interfaceC0354k;
        this.f6610b = c.m7284h(c0349h0);
    }

    @Override // p074f1.AbstractC1800a
    @Deprecated
    /* renamed from: a */
    public void mo7271a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f6610b.m7285f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p074f1.AbstractC1800a
    /* renamed from: c */
    public <D> C1959b<D> mo7272c(int i10, Bundle bundle, AbstractC1800a.a<D> aVar) {
        if (this.f6610b.m7288j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> m7287i = this.f6610b.m7287i(i10);
        if (f6608c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (m7287i == null) {
            return m7274e(i10, bundle, aVar, null);
        }
        if (f6608c) {
            Log.v("LoaderManager", "  Re-using existing loader " + m7287i);
        }
        return m7287i.m7280f(this.f6609a, aVar);
    }

    @Override // p074f1.AbstractC1800a
    /* renamed from: d */
    public void mo7273d() {
        this.f6610b.m7289k();
    }

    /* renamed from: e */
    public final <D> C1959b<D> m7274e(int i10, Bundle bundle, AbstractC1800a.a<D> aVar, C1959b<D> c1959b) {
        try {
            this.f6610b.m7291m();
            C1959b<D> mo2414b = aVar.mo2414b(i10, bundle);
            if (mo2414b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (mo2414b.getClass().isMemberClass() && !Modifier.isStatic(mo2414b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo2414b);
            }
            a aVar2 = new a(i10, bundle, mo2414b, c1959b);
            if (f6608c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f6610b.m7290l(i10, aVar2);
            this.f6610b.m7286g();
            return aVar2.m7280f(this.f6609a, aVar);
        } catch (Throwable th) {
            this.f6610b.m7286g();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f6609a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
