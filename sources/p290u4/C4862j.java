package p290u4;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p109h7.InterfaceC2438u;
import p206o5.C3923r;
import p206o5.InterfaceC3910j;
import p290u4.InterfaceC4882t;
import p333x3.InterfaceC5576p;

/* renamed from: u4.j */
/* loaded from: classes.dex */
public final class C4862j implements InterfaceC4882t.a {

    /* renamed from: a */
    public final a f18331a;

    /* renamed from: b */
    public InterfaceC3910j.a f18332b;

    /* renamed from: c */
    public long f18333c;

    /* renamed from: d */
    public long f18334d;

    /* renamed from: e */
    public long f18335e;

    /* renamed from: f */
    public float f18336f;

    /* renamed from: g */
    public float f18337g;

    /* renamed from: u4.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC5576p f18338a;

        /* renamed from: b */
        public final Map<Integer, InterfaceC2438u<InterfaceC4882t.a>> f18339b = new HashMap();

        /* renamed from: c */
        public final Set<Integer> f18340c = new HashSet();

        /* renamed from: d */
        public final Map<Integer, InterfaceC4882t.a> f18341d = new HashMap();

        /* renamed from: e */
        public InterfaceC3910j.a f18342e;

        public a(InterfaceC5576p interfaceC5576p) {
            this.f18338a = interfaceC5576p;
        }

        /* renamed from: a */
        public void m19322a(InterfaceC3910j.a aVar) {
            if (aVar != this.f18342e) {
                this.f18342e = aVar;
                this.f18339b.clear();
                this.f18341d.clear();
            }
        }
    }

    public C4862j(Context context, InterfaceC5576p interfaceC5576p) {
        this(new C3923r.a(context), interfaceC5576p);
    }

    public C4862j(InterfaceC3910j.a aVar, InterfaceC5576p interfaceC5576p) {
        this.f18332b = aVar;
        a aVar2 = new a(interfaceC5576p);
        this.f18331a = aVar2;
        aVar2.m19322a(aVar);
        this.f18333c = -9223372036854775807L;
        this.f18334d = -9223372036854775807L;
        this.f18335e = -9223372036854775807L;
        this.f18336f = -3.4028235E38f;
        this.f18337g = -3.4028235E38f;
    }
}
