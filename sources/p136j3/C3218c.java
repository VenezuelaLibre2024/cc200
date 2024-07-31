package p136j3;

import p280t8.InterfaceC4726c;
import p280t8.InterfaceC4727d;

/* renamed from: j3.c */
/* loaded from: classes.dex */
public final class C3218c {

    /* renamed from: c */
    public static final C3218c f11142c = new a().m11464a();

    /* renamed from: a */
    public final long f11143a;

    /* renamed from: b */
    public final b f11144b;

    /* renamed from: j3.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f11145a = 0;

        /* renamed from: b */
        public b f11146b = b.REASON_UNKNOWN;

        /* renamed from: a */
        public C3218c m11464a() {
            return new C3218c(this.f11145a, this.f11146b);
        }

        /* renamed from: b */
        public a m11465b(long j10) {
            this.f11145a = j10;
            return this;
        }

        /* renamed from: c */
        public a m11466c(b bVar) {
            this.f11146b = bVar;
            return this;
        }
    }

    /* renamed from: j3.c$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC4726c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: h */
        public final int f11155h;

        b(int i10) {
            this.f11155h = i10;
        }

        @Override // p280t8.InterfaceC4726c
        /* renamed from: a */
        public int mo9805a() {
            return this.f11155h;
        }
    }

    public C3218c(long j10, b bVar) {
        this.f11143a = j10;
        this.f11144b = bVar;
    }

    /* renamed from: c */
    public static a m11461c() {
        return new a();
    }

    @InterfaceC4727d(tag = 1)
    /* renamed from: a */
    public long m11462a() {
        return this.f11143a;
    }

    @InterfaceC4727d(tag = 3)
    /* renamed from: b */
    public b m11463b() {
        return this.f11144b;
    }
}
