package p240q9;

import android.content.Context;
import android.util.Log;
import java.util.Random;
import p108h6.C2394s;
import p207o6.C3938g;
import p207o6.InterfaceC3935d;
import p255r9.AbstractC4328e;
import p308v7.InterfaceC5140b;
import p337x7.InterfaceC5657b;

/* renamed from: q9.c */
/* loaded from: classes.dex */
public class C4212c {

    /* renamed from: f */
    public static final Random f15181f = new Random();

    /* renamed from: g */
    public static InterfaceC4214e f15182g = new C4215f();

    /* renamed from: h */
    public static InterfaceC3935d f15183h = C3938g.m14938d();

    /* renamed from: a */
    public final Context f15184a;

    /* renamed from: b */
    public final InterfaceC5657b f15185b;

    /* renamed from: c */
    public final InterfaceC5140b f15186c;

    /* renamed from: d */
    public long f15187d;

    /* renamed from: e */
    public volatile boolean f15188e;

    public C4212c(Context context, InterfaceC5657b interfaceC5657b, InterfaceC5140b interfaceC5140b, long j10) {
        this.f15184a = context;
        this.f15185b = interfaceC5657b;
        this.f15186c = interfaceC5140b;
        this.f15187d = j10;
    }

    /* renamed from: a */
    public void m16225a() {
        this.f15188e = true;
    }

    /* renamed from: b */
    public boolean m16226b(int i10) {
        return (i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408;
    }

    /* renamed from: c */
    public void m16227c() {
        this.f15188e = false;
    }

    /* renamed from: d */
    public void m16228d(AbstractC4328e abstractC4328e) {
        m16229e(abstractC4328e, true);
    }

    /* renamed from: e */
    public void m16229e(AbstractC4328e abstractC4328e, boolean z10) {
        C2394s.m9619l(abstractC4328e);
        long mo14933b = f15183h.mo14933b() + this.f15187d;
        String m16240c = C4218i.m16240c(this.f15185b);
        String m16239b = C4218i.m16239b(this.f15186c);
        if (z10) {
            abstractC4328e.m16582B(m16240c, m16239b, this.f15184a);
        } else {
            abstractC4328e.m16584D(m16240c, m16239b);
        }
        int i10 = 1000;
        while (f15183h.mo14933b() + i10 <= mo14933b && !abstractC4328e.m16605v() && m16226b(abstractC4328e.m16599o())) {
            try {
                f15182g.mo16233a(f15181f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (abstractC4328e.m16599o() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (this.f15188e) {
                    return;
                }
                abstractC4328e.m16586F();
                String m16240c2 = C4218i.m16240c(this.f15185b);
                String m16239b2 = C4218i.m16239b(this.f15186c);
                if (z10) {
                    abstractC4328e.m16582B(m16240c2, m16239b2, this.f15184a);
                } else {
                    abstractC4328e.m16584D(m16240c2, m16239b2);
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
