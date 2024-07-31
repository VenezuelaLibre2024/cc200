package p064e6;

import java.lang.ref.WeakReference;

/* renamed from: e6.z */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1703z extends AbstractBinderC1701x {

    /* renamed from: c */
    public static final WeakReference f6295c = new WeakReference(null);

    /* renamed from: b */
    public WeakReference f6296b;

    public AbstractBinderC1703z(byte[] bArr) {
        super(bArr);
        this.f6296b = f6295c;
    }

    /* renamed from: M1 */
    public abstract byte[] mo6752M1();

    @Override // p064e6.AbstractBinderC1701x
    /* renamed from: g */
    public final byte[] mo6754g() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6296b.get();
            if (bArr == null) {
                bArr = mo6752M1();
                this.f6296b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
