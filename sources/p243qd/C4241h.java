package p243qd;

import gd.C2235i;
import gd.C2245s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p079f6.C1841a;
import p115hd.AbstractC2481b;
import p373zd.InterfaceC6124b;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: qd.h */
/* loaded from: classes2.dex */
public final class C4241h implements InterfaceC6124b<File> {

    /* renamed from: a */
    public final File f15341a;

    /* renamed from: b */
    public final EnumC4242i f15342b;

    /* renamed from: c */
    public final InterfaceC4580l<File, Boolean> f15343c;

    /* renamed from: d */
    public final InterfaceC4580l<File, C2245s> f15344d;

    /* renamed from: e */
    public final InterfaceC4584p<File, IOException, C2245s> f15345e;

    /* renamed from: f */
    public final int f15346f;

    /* renamed from: qd.h$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            C4753m.m18653f(file, "rootDir");
        }
    }

    /* renamed from: qd.h$b */
    /* loaded from: classes2.dex */
    public final class b extends AbstractC2481b<File> {

        /* renamed from: j */
        public final ArrayDeque<c> f15347j;

        /* renamed from: qd.h$b$a */
        /* loaded from: classes2.dex */
        public final class a extends a {

            /* renamed from: b */
            public boolean f15349b;

            /* renamed from: c */
            public File[] f15350c;

            /* renamed from: d */
            public int f15351d;

            /* renamed from: e */
            public boolean f15352e;

            /* renamed from: f */
            public final /* synthetic */ b f15353f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                C4753m.m18653f(file, "rootDir");
                this.f15353f = bVar;
            }

            @Override // p243qd.C4241h.c
            /* renamed from: b */
            public File mo16286b() {
                if (!this.f15352e && this.f15350c == null) {
                    InterfaceC4580l interfaceC4580l = C4241h.this.f15343c;
                    boolean z10 = false;
                    if (interfaceC4580l != null && !((Boolean) interfaceC4580l.invoke(m16287a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] listFiles = m16287a().listFiles();
                    this.f15350c = listFiles;
                    if (listFiles == null) {
                        InterfaceC4584p interfaceC4584p = C4241h.this.f15345e;
                        if (interfaceC4584p != null) {
                            interfaceC4584p.invoke(m16287a(), new C4234a(m16287a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f15352e = true;
                    }
                }
                File[] fileArr = this.f15350c;
                if (fileArr != null) {
                    int i10 = this.f15351d;
                    C4753m.m18650c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f15350c;
                        C4753m.m18650c(fileArr2);
                        int i11 = this.f15351d;
                        this.f15351d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f15349b) {
                    this.f15349b = true;
                    return m16287a();
                }
                InterfaceC4580l interfaceC4580l2 = C4241h.this.f15344d;
                if (interfaceC4580l2 != null) {
                    interfaceC4580l2.invoke(m16287a());
                }
                return null;
            }
        }

        /* renamed from: qd.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C6201b extends c {

            /* renamed from: b */
            public boolean f15354b;

            /* renamed from: c */
            public final /* synthetic */ b f15355c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6201b(b bVar, File file) {
                super(file);
                C4753m.m18653f(file, "rootFile");
                this.f15355c = bVar;
            }

            @Override // p243qd.C4241h.c
            /* renamed from: b */
            public File mo16286b() {
                if (this.f15354b) {
                    return null;
                }
                this.f15354b = true;
                return m16287a();
            }
        }

        /* renamed from: qd.h$b$c */
        /* loaded from: classes2.dex */
        public final class c extends a {

            /* renamed from: b */
            public boolean f15356b;

            /* renamed from: c */
            public File[] f15357c;

            /* renamed from: d */
            public int f15358d;

            /* renamed from: e */
            public final /* synthetic */ b f15359e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                C4753m.m18653f(file, "rootDir");
                this.f15359e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // p243qd.C4241h.c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File mo16286b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f15356b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    qd.h$b r0 = r10.f15359e
                    qd.h r0 = p243qd.C4241h.this
                    sd.l r0 = p243qd.C4241h.m16280c(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.m16287a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f15356b = r3
                    java.io.File r0 = r10.m16287a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f15357c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f15358d
                    td.C4753m.m18650c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    qd.h$b r0 = r10.f15359e
                    qd.h r0 = p243qd.C4241h.this
                    sd.l r0 = p243qd.C4241h.m16282e(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.m16287a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f15357c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.m16287a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f15357c = r0
                    if (r0 != 0) goto L7b
                    qd.h$b r0 = r10.f15359e
                    qd.h r0 = p243qd.C4241h.this
                    sd.p r0 = p243qd.C4241h.m16281d(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.m16287a()
                    qd.a r9 = new qd.a
                    java.io.File r4 = r10.m16287a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f15357c
                    if (r0 == 0) goto L85
                    td.C4753m.m18650c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    qd.h$b r0 = r10.f15359e
                    qd.h r0 = p243qd.C4241h.this
                    sd.l r0 = p243qd.C4241h.m16282e(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.m16287a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f15357c
                    td.C4753m.m18650c(r0)
                    int r1 = r10.f15358d
                    int r2 = r1 + 1
                    r10.f15358d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p243qd.C4241h.b.c.mo16286b():java.io.File");
            }
        }

        /* renamed from: qd.h$b$d */
        /* loaded from: classes2.dex */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15360a;

            static {
                int[] iArr = new int[EnumC4242i.values().length];
                try {
                    iArr[EnumC4242i.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4242i.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f15360a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f15347j = arrayDeque;
            if (C4241h.this.f15341a.isDirectory()) {
                arrayDeque.push(m16284f(C4241h.this.f15341a));
            } else if (C4241h.this.f15341a.isFile()) {
                arrayDeque.push(new C6201b(this, C4241h.this.f15341a));
            } else {
                m9879c();
            }
        }

        @Override // p115hd.AbstractC2481b
        /* renamed from: a */
        public void mo9878a() {
            File m16285g = m16285g();
            if (m16285g != null) {
                m9880d(m16285g);
            } else {
                m9879c();
            }
        }

        /* renamed from: f */
        public final a m16284f(File file) {
            int i10 = d.f15360a[C4241h.this.f15342b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new C2235i();
        }

        /* renamed from: g */
        public final File m16285g() {
            File mo16286b;
            while (true) {
                c peek = this.f15347j.peek();
                if (peek == null) {
                    return null;
                }
                mo16286b = peek.mo16286b();
                if (mo16286b == null) {
                    this.f15347j.pop();
                } else {
                    if (C4753m.m18648a(mo16286b, peek.m16287a()) || !mo16286b.isDirectory() || this.f15347j.size() >= C4241h.this.f15346f) {
                        break;
                    }
                    this.f15347j.push(m16284f(mo16286b));
                }
            }
            return mo16286b;
        }
    }

    /* renamed from: qd.h$c */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        public final File f15361a;

        public c(File file) {
            C4753m.m18653f(file, "root");
            this.f15361a = file;
        }

        /* renamed from: a */
        public final File m16287a() {
            return this.f15361a;
        }

        /* renamed from: b */
        public abstract File mo16286b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4241h(File file, EnumC4242i enumC4242i) {
        this(file, enumC4242i, null, null, null, 0, 32, null);
        C4753m.m18653f(file, "start");
        C4753m.m18653f(enumC4242i, "direction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4241h(File file, EnumC4242i enumC4242i, InterfaceC4580l<? super File, Boolean> interfaceC4580l, InterfaceC4580l<? super File, C2245s> interfaceC4580l2, InterfaceC4584p<? super File, ? super IOException, C2245s> interfaceC4584p, int i10) {
        this.f15341a = file;
        this.f15342b = enumC4242i;
        this.f15343c = interfaceC4580l;
        this.f15344d = interfaceC4580l2;
        this.f15345e = interfaceC4584p;
        this.f15346f = i10;
    }

    public /* synthetic */ C4241h(File file, EnumC4242i enumC4242i, InterfaceC4580l interfaceC4580l, InterfaceC4580l interfaceC4580l2, InterfaceC4584p interfaceC4584p, int i10, int i11, C4747g c4747g) {
        this(file, (i11 & 2) != 0 ? EnumC4242i.TOP_DOWN : enumC4242i, interfaceC4580l, interfaceC4580l2, interfaceC4584p, (i11 & 32) != 0 ? C1841a.e.API_PRIORITY_OTHER : i10);
    }

    @Override // p373zd.InterfaceC6124b
    public Iterator<File> iterator() {
        return new b();
    }
}
