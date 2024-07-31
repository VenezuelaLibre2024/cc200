package p034c7;

import java.util.List;
import java.util.Map;
import p108h6.C2394s;

/* renamed from: c7.e5 */
/* loaded from: classes.dex */
public final class RunnableC0682e5 implements Runnable {

    /* renamed from: h */
    public final InterfaceC0638b5 f2886h;

    /* renamed from: i */
    public final int f2887i;

    /* renamed from: j */
    public final Throwable f2888j;

    /* renamed from: k */
    public final byte[] f2889k;

    /* renamed from: l */
    public final String f2890l;

    /* renamed from: m */
    public final Map<String, List<String>> f2891m;

    public RunnableC0682e5(String str, InterfaceC0638b5 interfaceC0638b5, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C2394s.m9619l(interfaceC0638b5);
        this.f2886h = interfaceC0638b5;
        this.f2887i = i10;
        this.f2888j = th;
        this.f2889k = bArr;
        this.f2890l = str;
        this.f2891m = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2886h.mo3084a(this.f2890l, this.f2887i, this.f2888j, this.f2889k, this.f2891m);
    }
}
