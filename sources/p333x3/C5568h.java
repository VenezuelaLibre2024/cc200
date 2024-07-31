package p333x3;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.C0046d;
import p019b4.C0476c;
import p031c4.C0608a;
import p046d4.C1543e;
import p062e4.C1655f;
import p077f4.C1826g;
import p077f4.C1830k;
import p094g4.C1989d;
import p106h4.C2300a0;
import p106h4.C2301b;
import p106h4.C2307e;
import p106h4.C2313h;
import p106h4.C2314h0;
import p106h4.C2317j;
import p123i4.C2593b;
import p126i7.AbstractC2651u;
import p222p5.C4033j0;
import p222p5.C4034k;
import p264s3.C4463m1;
import p349y3.C5799b;
import p364z3.C5963b;

/* renamed from: x3.h */
/* loaded from: classes.dex */
public final class C5568h implements InterfaceC5576p {

    /* renamed from: o */
    public static final int[] f20912o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: p */
    public static final a f20913p = new a(new a.InterfaceC6217a() { // from class: x3.g
        @Override // p333x3.C5568h.a.InterfaceC6217a
        /* renamed from: a */
        public final Constructor mo22451a() {
            Constructor m22454h;
            m22454h = C5568h.m22454h();
            return m22454h;
        }
    });

    /* renamed from: q */
    public static final a f20914q = new a(new a.InterfaceC6217a() { // from class: x3.f
        @Override // p333x3.C5568h.a.InterfaceC6217a
        /* renamed from: a */
        public final Constructor mo22451a() {
            Constructor m22455i;
            m22455i = C5568h.m22455i();
            return m22455i;
        }
    });

    /* renamed from: b */
    public boolean f20915b;

    /* renamed from: c */
    public boolean f20916c;

    /* renamed from: d */
    public int f20917d;

    /* renamed from: e */
    public int f20918e;

    /* renamed from: f */
    public int f20919f;

    /* renamed from: g */
    public int f20920g;

    /* renamed from: h */
    public int f20921h;

    /* renamed from: i */
    public int f20922i;

    /* renamed from: j */
    public int f20923j;

    /* renamed from: l */
    public int f20925l;

    /* renamed from: k */
    public int f20924k = 1;

    /* renamed from: n */
    public int f20927n = 112800;

    /* renamed from: m */
    public AbstractC2651u<C4463m1> f20926m = AbstractC2651u.m10770u();

    /* renamed from: x3.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC6217a f20928a;

        /* renamed from: b */
        public final AtomicBoolean f20929b = new AtomicBoolean(false);

        /* renamed from: c */
        public Constructor<? extends InterfaceC5571k> f20930c;

        /* renamed from: x3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC6217a {
            /* renamed from: a */
            Constructor<? extends InterfaceC5571k> mo22451a();
        }

        public a(InterfaceC6217a interfaceC6217a) {
            this.f20928a = interfaceC6217a;
        }

        /* renamed from: a */
        public InterfaceC5571k m22458a(Object... objArr) {
            Constructor<? extends InterfaceC5571k> m22459b = m22459b();
            if (m22459b == null) {
                return null;
            }
            try {
                return m22459b.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }

        /* renamed from: b */
        public final Constructor<? extends InterfaceC5571k> m22459b() {
            synchronized (this.f20929b) {
                if (this.f20929b.get()) {
                    return this.f20930c;
                }
                try {
                    return this.f20928a.mo22451a();
                } catch (ClassNotFoundException unused) {
                    this.f20929b.set(true);
                    return this.f20930c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
    }

    /* renamed from: h */
    public static Constructor<? extends InterfaceC5571k> m22454h() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC5571k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* renamed from: i */
    public static Constructor<? extends InterfaceC5571k> m22455i() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC5571k.class).getConstructor(new Class[0]);
    }

    @Override // p333x3.InterfaceC5576p
    /* renamed from: b */
    public synchronized InterfaceC5571k[] mo161b() {
        return mo22456c(Uri.EMPTY, new HashMap());
    }

    @Override // p333x3.InterfaceC5576p
    /* renamed from: c */
    public synchronized InterfaceC5571k[] mo22456c(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f20912o;
        arrayList = new ArrayList(iArr.length);
        int m15370b = C4034k.m15370b(map);
        if (m15370b != -1) {
            m22457g(m15370b, arrayList);
        }
        int m15371c = C4034k.m15371c(uri);
        if (m15371c != -1 && m15371c != m15370b) {
            m22457g(m15371c, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != m15370b && i10 != m15371c) {
                m22457g(i10, arrayList);
            }
        }
        return (InterfaceC5571k[]) arrayList.toArray(new InterfaceC5571k[arrayList.size()]);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* renamed from: g */
    public final void m22457g(int i10, List<InterfaceC5571k> list) {
        InterfaceC5571k c2301b;
        switch (i10) {
            case 0:
                c2301b = new C2301b();
                list.add(c2301b);
                return;
            case 1:
                c2301b = new C2307e();
                list.add(c2301b);
                return;
            case 2:
                c2301b = new C2313h((this.f20916c ? 2 : 0) | this.f20917d | (this.f20915b ? 1 : 0));
                list.add(c2301b);
                return;
            case 3:
                c2301b = new C5799b((this.f20916c ? 2 : 0) | this.f20918e | (this.f20915b ? 1 : 0));
                list.add(c2301b);
                return;
            case 4:
                c2301b = f20913p.m22458a(Integer.valueOf(this.f20919f));
                if (c2301b == null) {
                    c2301b = new C0046d(this.f20919f);
                }
                list.add(c2301b);
                return;
            case 5:
                c2301b = new C0476c();
                list.add(c2301b);
                return;
            case 6:
                c2301b = new C1543e(this.f20920g);
                list.add(c2301b);
                return;
            case 7:
                c2301b = new C1655f((this.f20916c ? 2 : 0) | this.f20923j | (this.f20915b ? 1 : 0));
                list.add(c2301b);
                return;
            case 8:
                list.add(new C1826g(this.f20922i));
                c2301b = new C1830k(this.f20921h);
                list.add(c2301b);
                return;
            case 9:
                c2301b = new C1989d();
                list.add(c2301b);
                return;
            case 10:
                c2301b = new C2300a0();
                list.add(c2301b);
                return;
            case 11:
                c2301b = new C2314h0(this.f20924k, new C4033j0(0L), new C2317j(this.f20925l, this.f20926m), this.f20927n);
                list.add(c2301b);
                return;
            case 12:
                c2301b = new C2593b();
                list.add(c2301b);
                return;
            case 13:
            default:
                return;
            case 14:
                c2301b = new C0608a();
                list.add(c2301b);
                return;
            case 15:
                c2301b = f20914q.m22458a(new Object[0]);
                if (c2301b == null) {
                    return;
                }
                list.add(c2301b);
                return;
            case 16:
                c2301b = new C5963b();
                list.add(c2301b);
                return;
        }
    }
}
