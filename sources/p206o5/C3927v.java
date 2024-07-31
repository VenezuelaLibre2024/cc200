package p206o5;

import java.io.FileNotFoundException;
import java.io.IOException;
import p206o5.C3901e0;
import p206o5.InterfaceC3899d0;
import p264s3.C4499t2;

/* renamed from: o5.v */
/* loaded from: classes.dex */
public class C3927v implements InterfaceC3899d0 {

    /* renamed from: a */
    public final int f14176a;

    public C3927v() {
        this(-1);
    }

    public C3927v(int i10) {
        this.f14176a = i10;
    }

    @Override // p206o5.InterfaceC3899d0
    /* renamed from: a */
    public long mo14775a(InterfaceC3899d0.c cVar) {
        IOException iOException = cVar.f13993c;
        if ((iOException instanceof C4499t2) || (iOException instanceof FileNotFoundException) || (iOException instanceof C3929x) || (iOException instanceof C3901e0.h) || C3912k.m14831a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f13994d - 1) * 1000, 5000);
    }

    @Override // p206o5.InterfaceC3899d0
    /* renamed from: c */
    public InterfaceC3899d0.b mo14777c(InterfaceC3899d0.a aVar, InterfaceC3899d0.c cVar) {
        if (!m14910e(cVar.f13993c)) {
            return null;
        }
        if (aVar.m14779a(1)) {
            return new InterfaceC3899d0.b(1, 300000L);
        }
        if (aVar.m14779a(2)) {
            return new InterfaceC3899d0.b(2, 60000L);
        }
        return null;
    }

    @Override // p206o5.InterfaceC3899d0
    /* renamed from: d */
    public int mo14778d(int i10) {
        int i11 = this.f14176a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    /* renamed from: e */
    public boolean m14910e(IOException iOException) {
        if (!(iOException instanceof C3893a0)) {
            return false;
        }
        int i10 = ((C3893a0) iOException).f13968k;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }
}
