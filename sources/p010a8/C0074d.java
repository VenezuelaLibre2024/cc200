package p010a8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p023b8.C0515g;
import p035c8.C0986c;
import p035c8.C0987d;
import p035c8.C0988e;
import p035c8.C0989f;
import p035c8.InterfaceC0984a;
import p050d8.C1603c;
import p050d8.InterfaceC1601a;
import p050d8.InterfaceC1602b;
import p224p7.InterfaceC4059a;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: a8.d */
/* loaded from: classes.dex */
public class C0074d {

    /* renamed from: a */
    public final InterfaceC5895a<InterfaceC4059a> f260a;

    /* renamed from: b */
    public volatile InterfaceC0984a f261b;

    /* renamed from: c */
    public volatile InterfaceC1602b f262c;

    /* renamed from: d */
    public final List<InterfaceC1601a> f263d;

    public C0074d(InterfaceC5895a<InterfaceC4059a> interfaceC5895a) {
        this(interfaceC5895a, new C1603c(), new C0989f());
    }

    public C0074d(InterfaceC5895a<InterfaceC4059a> interfaceC5895a, InterfaceC1602b interfaceC1602b, InterfaceC0984a interfaceC0984a) {
        this.f260a = interfaceC5895a;
        this.f262c = interfaceC1602b;
        this.f263d = new ArrayList();
        this.f261b = interfaceC0984a;
        m313f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m307g(String str, Bundle bundle) {
        this.f261b.mo301a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m308h(InterfaceC1601a interfaceC1601a) {
        synchronized (this) {
            if (this.f262c instanceof C1603c) {
                this.f263d.add(interfaceC1601a);
            }
            this.f262c.mo302a(interfaceC1601a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m309i(InterfaceC5896b interfaceC5896b) {
        C0515g.m2482f().m2484b("AnalyticsConnector now available.");
        InterfaceC4059a interfaceC4059a = (InterfaceC4059a) interfaceC5896b.get();
        C0988e c0988e = new C0988e(interfaceC4059a);
        C0075e c0075e = new C0075e();
        if (m310j(interfaceC4059a, c0075e) == null) {
            C0515g.m2482f().m2492k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C0515g.m2482f().m2484b("Registered Firebase Analytics listener.");
        C0987d c0987d = new C0987d();
        C0986c c0986c = new C0986c(c0988e, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<InterfaceC1601a> it = this.f263d.iterator();
            while (it.hasNext()) {
                c0987d.mo302a(it.next());
            }
            c0075e.m317d(c0987d);
            c0075e.m318e(c0986c);
            this.f262c = c0987d;
            this.f261b = c0986c;
        }
    }

    /* renamed from: j */
    public static InterfaceC4059a.a m310j(InterfaceC4059a interfaceC4059a, C0075e c0075e) {
        InterfaceC4059a.a mo15615c = interfaceC4059a.mo15615c("clx", c0075e);
        if (mo15615c == null) {
            C0515g.m2482f().m2484b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo15615c = interfaceC4059a.mo15615c("crash", c0075e);
            if (mo15615c != null) {
                C0515g.m2482f().m2492k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo15615c;
    }

    /* renamed from: d */
    public InterfaceC0984a m311d() {
        return new InterfaceC0984a() { // from class: a8.a
            @Override // p035c8.InterfaceC0984a
            /* renamed from: a */
            public final void mo301a(String str, Bundle bundle) {
                C0074d.this.m307g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC1602b m312e() {
        return new InterfaceC1602b() { // from class: a8.b
            @Override // p050d8.InterfaceC1602b
            /* renamed from: a */
            public final void mo302a(InterfaceC1601a interfaceC1601a) {
                C0074d.this.m308h(interfaceC1601a);
            }
        };
    }

    /* renamed from: f */
    public final void m313f() {
        this.f260a.mo23490a(new InterfaceC5895a.a() { // from class: a8.c
            @Override // p354y8.InterfaceC5895a.a
            /* renamed from: a */
            public final void mo303a(InterfaceC5896b interfaceC5896b) {
                C0074d.this.m309i(interfaceC5896b);
            }
        });
    }
}
