package p299ue;

import java.io.IOException;
import se.C4596e;

/* renamed from: ue.i */
/* loaded from: classes2.dex */
public final class C5021i extends RuntimeException {

    /* renamed from: h */
    public IOException f18799h;

    /* renamed from: i */
    public IOException f18800i;

    public C5021i(IOException iOException) {
        super(iOException);
        this.f18799h = iOException;
        this.f18800i = iOException;
    }

    /* renamed from: a */
    public void m19710a(IOException iOException) {
        C4596e.m18094b(this.f18799h, iOException);
        this.f18800i = iOException;
    }

    /* renamed from: b */
    public IOException m19711b() {
        return this.f18799h;
    }

    /* renamed from: c */
    public IOException m19712c() {
        return this.f18800i;
    }
}
