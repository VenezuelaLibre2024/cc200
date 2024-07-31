package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p029c2.AbstractC0604v;
import p029c2.InterfaceC0588f;
import p029c2.InterfaceC0597o;
import p203o2.InterfaceC3840a;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f1963a;

    /* renamed from: b */
    public C0417b f1964b;

    /* renamed from: c */
    public Set<String> f1965c;

    /* renamed from: d */
    public C0415a f1966d;

    /* renamed from: e */
    public int f1967e;

    /* renamed from: f */
    public Executor f1968f;

    /* renamed from: g */
    public InterfaceC3840a f1969g;

    /* renamed from: h */
    public AbstractC0604v f1970h;

    /* renamed from: i */
    public InterfaceC0597o f1971i;

    /* renamed from: j */
    public InterfaceC0588f f1972j;

    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: classes.dex */
    public static class C0415a {

        /* renamed from: a */
        public List<String> f1973a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f1974b = Collections.emptyList();

        /* renamed from: c */
        public Network f1975c;
    }

    public WorkerParameters(UUID uuid, C0417b c0417b, Collection<String> collection, C0415a c0415a, int i10, Executor executor, InterfaceC3840a interfaceC3840a, AbstractC0604v abstractC0604v, InterfaceC0597o interfaceC0597o, InterfaceC0588f interfaceC0588f) {
        this.f1963a = uuid;
        this.f1964b = c0417b;
        this.f1965c = new HashSet(collection);
        this.f1966d = c0415a;
        this.f1967e = i10;
        this.f1968f = executor;
        this.f1969g = interfaceC3840a;
        this.f1970h = abstractC0604v;
        this.f1971i = interfaceC0597o;
        this.f1972j = interfaceC0588f;
    }

    /* renamed from: a */
    public Executor m2083a() {
        return this.f1968f;
    }

    /* renamed from: b */
    public InterfaceC0588f m2084b() {
        return this.f1972j;
    }

    /* renamed from: c */
    public UUID m2085c() {
        return this.f1963a;
    }

    /* renamed from: d */
    public C0417b m2086d() {
        return this.f1964b;
    }

    /* renamed from: e */
    public AbstractC0604v m2087e() {
        return this.f1970h;
    }
}
