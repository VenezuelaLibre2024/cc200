package p264s3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p047d5.C1560o;
import p047d5.InterfaceC1559n;
import p137j4.C3231j;
import p137j4.InterfaceC3233l;
import p137j4.InterfaceC3238q;
import p152k4.C3353f;
import p152k4.InterfaceC3352e;
import p222p5.C4046r;
import p236q5.C4175h;
import p236q5.InterfaceC4190w;
import p251r5.C4301b;
import p289u3.C4806a0;
import p289u3.C4815f;
import p289u3.InterfaceC4836s;
import p289u3.InterfaceC4837t;

/* renamed from: s3.m */
/* loaded from: classes.dex */
public class C4461m implements InterfaceC4460l3 {

    /* renamed from: a */
    public final Context f16436a;

    /* renamed from: e */
    public boolean f16440e;

    /* renamed from: g */
    public boolean f16442g;

    /* renamed from: h */
    public boolean f16443h;

    /* renamed from: i */
    public boolean f16444i;

    /* renamed from: b */
    public final C3231j f16437b = new C3231j();

    /* renamed from: c */
    public int f16438c = 0;

    /* renamed from: d */
    public long f16439d = 5000;

    /* renamed from: f */
    public InterfaceC3238q f16441f = InterfaceC3238q.f11324a;

    public C4461m(Context context) {
        this.f16436a = context;
    }

    @Override // p264s3.InterfaceC4460l3
    /* renamed from: a */
    public InterfaceC4445i3[] mo17397a(Handler handler, InterfaceC4190w interfaceC4190w, InterfaceC4836s interfaceC4836s, InterfaceC1559n interfaceC1559n, InterfaceC3352e interfaceC3352e) {
        ArrayList<InterfaceC4445i3> arrayList = new ArrayList<>();
        m17404h(this.f16436a, this.f16438c, this.f16441f, this.f16440e, handler, interfaceC4190w, this.f16439d, arrayList);
        InterfaceC4837t m17399c = m17399c(this.f16436a, this.f16442g, this.f16443h, this.f16444i);
        if (m17399c != null) {
            m17398b(this.f16436a, this.f16438c, this.f16441f, this.f16440e, m17399c, handler, interfaceC4836s, arrayList);
        }
        m17403g(this.f16436a, interfaceC1559n, handler.getLooper(), this.f16438c, arrayList);
        m17401e(this.f16436a, interfaceC3352e, handler.getLooper(), this.f16438c, arrayList);
        m17400d(this.f16436a, this.f16438c, arrayList);
        m17402f(this.f16436a, handler, this.f16438c, arrayList);
        return (InterfaceC4445i3[]) arrayList.toArray(new InterfaceC4445i3[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(5:9|10|11|12|13)|14|15|16|17|(2:18|19)|21|22|23|24|25|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        r5 = r6;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m17398b(android.content.Context r15, int r16, p137j4.InterfaceC3238q r17, boolean r18, p289u3.InterfaceC4837t r19, android.os.Handler r20, p289u3.InterfaceC4836s r21, java.util.ArrayList<p264s3.InterfaceC4445i3> r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s3.C4461m.m17398b(android.content.Context, int, j4.q, boolean, u3.t, android.os.Handler, u3.s, java.util.ArrayList):void");
    }

    /* renamed from: c */
    public InterfaceC4837t m17399c(Context context, boolean z10, boolean z11, boolean z12) {
        return new C4806a0.f().m18942g(C4815f.m19041c(context)).m18944i(z10).m18943h(z11).m18945j(z12 ? 1 : 0).m18941f();
    }

    /* renamed from: d */
    public void m17400d(Context context, int i10, ArrayList<InterfaceC4445i3> arrayList) {
        arrayList.add(new C4301b());
    }

    /* renamed from: e */
    public void m17401e(Context context, InterfaceC3352e interfaceC3352e, Looper looper, int i10, ArrayList<InterfaceC4445i3> arrayList) {
        arrayList.add(new C3353f(interfaceC3352e, looper));
    }

    /* renamed from: f */
    public void m17402f(Context context, Handler handler, int i10, ArrayList<InterfaceC4445i3> arrayList) {
    }

    /* renamed from: g */
    public void m17403g(Context context, InterfaceC1559n interfaceC1559n, Looper looper, int i10, ArrayList<InterfaceC4445i3> arrayList) {
        arrayList.add(new C1560o(interfaceC1559n, looper));
    }

    /* renamed from: h */
    public void m17404h(Context context, int i10, InterfaceC3238q interfaceC3238q, boolean z10, Handler handler, InterfaceC4190w interfaceC4190w, long j10, ArrayList<InterfaceC4445i3> arrayList) {
        int i11;
        arrayList.add(new C4175h(context, m17405i(), interfaceC3238q, j10, z10, handler, interfaceC4190w, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    arrayList.add(size, (InterfaceC4445i3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC4190w.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4190w, 50));
                    C4046r.m15526f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (InterfaceC4445i3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC4190w.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4190w, 50));
                    C4046r.m15526f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
                arrayList.add(i11, (InterfaceC4445i3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, InterfaceC4190w.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4190w, 50));
                C4046r.m15526f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    /* renamed from: i */
    public InterfaceC3233l.b m17405i() {
        return this.f16437b;
    }
}
