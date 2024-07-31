package p081f8;

import p239q8.C4205d;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p254r8.InterfaceC4322a;
import p254r8.InterfaceC4323b;

/* renamed from: f8.a */
/* loaded from: classes.dex */
public final class C1872a implements InterfaceC4322a {

    /* renamed from: a */
    public static final InterfaceC4322a f7066a = new C1872a();

    /* renamed from: f8.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4206e<AbstractC1880i> {

        /* renamed from: a */
        public static final a f7067a = new a();

        /* renamed from: b */
        public static final C4205d f7068b = C4205d.m16197d("rolloutId");

        /* renamed from: c */
        public static final C4205d f7069c = C4205d.m16197d("parameterKey");

        /* renamed from: d */
        public static final C4205d f7070d = C4205d.m16197d("parameterValue");

        /* renamed from: e */
        public static final C4205d f7071e = C4205d.m16197d("variantId");

        /* renamed from: f */
        public static final C4205d f7072f = C4205d.m16197d("templateVersion");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC1880i abstractC1880i, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f7068b, abstractC1880i.mo7619e());
            interfaceC4207f.mo16205e(f7069c, abstractC1880i.mo7617c());
            interfaceC4207f.mo16205e(f7070d, abstractC1880i.mo7618d());
            interfaceC4207f.mo16205e(f7071e, abstractC1880i.mo7621g());
            interfaceC4207f.mo16203b(f7072f, abstractC1880i.mo7620f());
        }
    }

    @Override // p254r8.InterfaceC4322a
    /* renamed from: a */
    public void mo7323a(InterfaceC4323b<?> interfaceC4323b) {
        a aVar = a.f7067a;
        interfaceC4323b.mo16576a(AbstractC1880i.class, aVar);
        interfaceC4323b.mo16576a(C1873b.class, aVar);
    }
}
