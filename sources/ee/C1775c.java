package ee;

import gd.C2245s;
import p038ce.InterfaceC1076n;
import p116he.C2538l0;
import p116he.C2544o0;
import p359yd.InterfaceC5915e;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.C4751k;

/* renamed from: ee.c */
/* loaded from: classes2.dex */
public final class C1775c {

    /* renamed from: a */
    public static final C1780h<Object> f6556a = new C1780h<>(-1, null, null, 0);

    /* renamed from: b */
    public static final int f6557b;

    /* renamed from: c */
    public static final int f6558c;

    /* renamed from: d */
    public static final C2538l0 f6559d;

    /* renamed from: e */
    public static final C2538l0 f6560e;

    /* renamed from: f */
    public static final C2538l0 f6561f;

    /* renamed from: g */
    public static final C2538l0 f6562g;

    /* renamed from: h */
    public static final C2538l0 f6563h;

    /* renamed from: i */
    public static final C2538l0 f6564i;

    /* renamed from: j */
    public static final C2538l0 f6565j;

    /* renamed from: k */
    public static final C2538l0 f6566k;

    /* renamed from: l */
    public static final C2538l0 f6567l;

    /* renamed from: m */
    public static final C2538l0 f6568m;

    /* renamed from: n */
    public static final C2538l0 f6569n;

    /* renamed from: o */
    public static final C2538l0 f6570o;

    /* renamed from: p */
    public static final C2538l0 f6571p;

    /* renamed from: q */
    public static final C2538l0 f6572q;

    /* renamed from: r */
    public static final C2538l0 f6573r;

    /* renamed from: s */
    public static final C2538l0 f6574s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: ee.c$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a<E> extends C4751k implements InterfaceC4584p<Long, C1780h<E>, C1780h<E>> {

        /* renamed from: h */
        public static final a f6575h = new a();

        public a() {
            super(2, C1775c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* renamed from: c */
        public final C1780h<E> m7190c(long j10, C1780h<E> c1780h) {
            return C1775c.m7187x(j10, c1780h);
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return m7190c(l10.longValue(), (C1780h) obj);
        }
    }

    static {
        int m10139e;
        int m10139e2;
        m10139e = C2544o0.m10139e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f6557b = m10139e;
        m10139e2 = C2544o0.m10139e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f6558c = m10139e2;
        f6559d = new C2538l0("BUFFERED");
        f6560e = new C2538l0("SHOULD_BUFFER");
        f6561f = new C2538l0("S_RESUMING_BY_RCV");
        f6562g = new C2538l0("RESUMING_BY_EB");
        f6563h = new C2538l0("POISONED");
        f6564i = new C2538l0("DONE_RCV");
        f6565j = new C2538l0("INTERRUPTED_SEND");
        f6566k = new C2538l0("INTERRUPTED_RCV");
        f6567l = new C2538l0("CHANNEL_CLOSED");
        f6568m = new C2538l0("SUSPEND");
        f6569n = new C2538l0("SUSPEND_NO_WAITER");
        f6570o = new C2538l0("FAILED");
        f6571p = new C2538l0("NO_RECEIVE_RESULT");
        f6572q = new C2538l0("CLOSE_HANDLER_CLOSED");
        f6573r = new C2538l0("CLOSE_HANDLER_INVOKED");
        f6574s = new C2538l0("NO_CLOSE_CAUSE");
    }

    /* renamed from: A */
    public static final long m7161A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final <T> boolean m7162B(InterfaceC1076n<? super T> interfaceC1076n, T t10, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        Object mo4487e = interfaceC1076n.mo4487e(t10, null, interfaceC4580l);
        if (mo4487e == null) {
            return false;
        }
        interfaceC1076n.mo4492m(mo4487e);
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m7163C(InterfaceC1076n interfaceC1076n, Object obj, InterfaceC4580l interfaceC4580l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC4580l = null;
        }
        return m7162B(interfaceC1076n, obj, interfaceC4580l);
    }

    /* renamed from: v */
    public static final long m7185v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* renamed from: w */
    public static final long m7186w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* renamed from: x */
    public static final <E> C1780h<E> m7187x(long j10, C1780h<E> c1780h) {
        return new C1780h<>(j10, c1780h, c1780h.m7215u(), 0);
    }

    /* renamed from: y */
    public static final <E> InterfaceC5915e<C1780h<E>> m7188y() {
        return a.f6575h;
    }

    /* renamed from: z */
    public static final C2538l0 m7189z() {
        return f6567l;
    }
}
