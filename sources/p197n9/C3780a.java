package p197n9;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import p174le.C3481c;
import p174le.InterfaceC3479a;
import p197n9.InterfaceC3781b;
import td.C4747g;
import td.C4753m;

/* renamed from: n9.a */
/* loaded from: classes.dex */
public final class C3780a {

    /* renamed from: a */
    public static final C3780a f13612a = new C3780a();

    /* renamed from: b */
    public static final Map<InterfaceC3781b.a, a> f13613b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: n9.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC3479a f13614a;

        /* renamed from: b */
        public InterfaceC3781b f13615b;

        public a(InterfaceC3479a interfaceC3479a, InterfaceC3781b interfaceC3781b) {
            C4753m.m18653f(interfaceC3479a, "mutex");
            this.f13614a = interfaceC3479a;
            this.f13615b = interfaceC3781b;
        }

        public /* synthetic */ a(InterfaceC3479a interfaceC3479a, InterfaceC3781b interfaceC3781b, int i10, C4747g c4747g) {
            this(interfaceC3479a, (i10 & 2) != 0 ? null : interfaceC3781b);
        }

        /* renamed from: a */
        public final InterfaceC3479a m14385a() {
            return this.f13614a;
        }

        /* renamed from: b */
        public final InterfaceC3781b m14386b() {
            return this.f13615b;
        }

        /* renamed from: c */
        public final void m14387c(InterfaceC3781b interfaceC3781b) {
            this.f13615b = interfaceC3781b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C4753m.m18648a(this.f13614a, aVar.f13614a) && C4753m.m18648a(this.f13615b, aVar.f13615b);
        }

        public int hashCode() {
            int hashCode = this.f13614a.hashCode() * 31;
            InterfaceC3781b interfaceC3781b = this.f13615b;
            return hashCode + (interfaceC3781b == null ? 0 : interfaceC3781b.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f13614a + ", subscriber=" + this.f13615b + ')';
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m12917f = "FirebaseSessionsDependencies.kt", m12918l = {124}, m12919m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: n9.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3470d {

        /* renamed from: h */
        public Object f13616h;

        /* renamed from: i */
        public Object f13617i;

        /* renamed from: j */
        public Object f13618j;

        /* renamed from: k */
        public Object f13619k;

        /* renamed from: l */
        public Object f13620l;

        /* renamed from: m */
        public Object f13621m;

        /* renamed from: n */
        public /* synthetic */ Object f13622n;

        /* renamed from: p */
        public int f13624p;

        public b(InterfaceC3281d<? super b> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f13622n = obj;
            this.f13624p |= Integer.MIN_VALUE;
            return C3780a.this.m14383c(this);
        }
    }

    /* renamed from: a */
    public static final void m14380a(InterfaceC3781b.a aVar) {
        StringBuilder sb2;
        String str;
        C4753m.m18653f(aVar, "subscriberName");
        if (aVar == InterfaceC3781b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<InterfaceC3781b.a, a> map = f13613b;
        if (map.containsKey(aVar)) {
            sb2 = new StringBuilder();
            sb2.append("Dependency ");
            sb2.append(aVar);
            str = " already added.";
        } else {
            C4753m.m18652e(map, "dependencies");
            map.put(aVar, new a(C3481c.m12946a(true), null, 2, null));
            sb2 = new StringBuilder();
            sb2.append("Dependency to ");
            sb2.append(aVar);
            str = " added.";
        }
        sb2.append(str);
        Log.d("SessionsDependencies", sb2.toString());
    }

    /* renamed from: e */
    public static final void m14381e(InterfaceC3781b interfaceC3781b) {
        C4753m.m18653f(interfaceC3781b, "subscriber");
        InterfaceC3781b.a mo6877c = interfaceC3781b.mo6877c();
        a m14382b = f13612a.m14382b(mo6877c);
        if (m14382b.m14386b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + mo6877c + " already registered.");
            return;
        }
        m14382b.m14387c(interfaceC3781b);
        Log.d("SessionsDependencies", "Subscriber " + mo6877c + " registered.");
        InterfaceC3479a.a.m12933a(m14382b.m14385a(), null, 1, null);
    }

    /* renamed from: b */
    public final a m14382b(InterfaceC3781b.a aVar) {
        Map<InterfaceC3781b.a, a> map = f13613b;
        C4753m.m18652e(map, "dependencies");
        a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            C4753m.m18652e(aVar2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m14383c(p146jd.InterfaceC3281d<? super java.util.Map<p197n9.InterfaceC3781b.a, ? extends p197n9.InterfaceC3781b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p197n9.C3780a.b
            if (r0 == 0) goto L13
            r0 = r11
            n9.a$b r0 = (p197n9.C3780a.b) r0
            int r1 = r0.f13624p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13624p = r1
            goto L18
        L13:
            n9.a$b r0 = new n9.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13622n
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f13624p
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f13621m
            java.lang.Object r5 = r0.f13620l
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f13619k
            le.a r6 = (p174le.InterfaceC3479a) r6
            java.lang.Object r7 = r0.f13618j
            n9.b$a r7 = (p197n9.InterfaceC3781b.a) r7
            java.lang.Object r8 = r0.f13617i
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f13616h
            java.util.Map r9 = (java.util.Map) r9
            gd.C2238l.m8975b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            gd.C2238l.m8975b(r11)
            java.util.Map<n9.b$a, n9.a$a> r11 = p197n9.C3780a.f13613b
            java.lang.String r2 = "dependencies"
            td.C4753m.m18652e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = p115hd.C2486d0.m9892a(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            n9.b$a r7 = (p197n9.InterfaceC3781b.a) r7
            java.lang.Object r11 = r11.getValue()
            n9.a$a r11 = (p197n9.C3780a.a) r11
            le.a r6 = r11.m14385a()
            r0.f13616h = r5
            r0.f13617i = r8
            r0.f13618j = r7
            r0.f13619k = r6
            r0.f13620l = r5
            r0.f13621m = r2
            r0.f13624p = r4
            java.lang.Object r11 = r6.mo12931b(r3, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            n9.a r11 = p197n9.C3780a.f13612a     // Catch: java.lang.Throwable -> Lae
            n9.b r11 = r11.m14384d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.mo12932c(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.mo12932c(r3)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p197n9.C3780a.m14383c(jd.d):java.lang.Object");
    }

    /* renamed from: d */
    public final InterfaceC3781b m14384d(InterfaceC3781b.a aVar) {
        C4753m.m18653f(aVar, "subscriberName");
        InterfaceC3781b m14386b = m14382b(aVar).m14386b();
        if (m14386b != null) {
            return m14386b;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
